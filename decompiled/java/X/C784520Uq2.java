package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0Uq2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C784520Uq2 extends FrameLayout {
    public C785450UrX LL;
    public int LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public View LLIZ;
    public VelocityTracker LLIZLLLIL;
    public final C01GW LLJ;

    private final ViewConfiguration getViewConfig() {
        return (ViewConfiguration) this.LLJ.getValue();
    }

    public final boolean LIZIZ() {
        int i = C0TF6.LIZ[this.LL.LIZ.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return C785430UrV.LIZ(getContext());
        }
        if (i != 3) {
            throw new C1954807lC();
        }
        return true;
    }

    private final int getMaxFlingVelocityPx() {
        return getViewConfig().getScaledMaximumFlingVelocity();
    }

    private final int getMinFlingVelocityPx() {
        return getViewConfig().getScaledMinimumFlingVelocity();
    }

    private final int getTouchSlopPx() {
        return getViewConfig().getScaledTouchSlop();
    }

    public final C785450UrX getConfig() {
        return this.LL;
    }

    public final int getEffectiveContentWidth() {
        return this.LLILLJJLI;
    }

    public C784520Uq2(Context context) {
        super(context, null);
        this.LL = new C785450UrX(0);
        this.LLJ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS556S0100000_12(context, 17));
    }

    public static View LIZ(View view) {
        if (((view instanceof RecyclerView) || (view instanceof C21578619ce) || (view instanceof ScrollView)) && (view.canScrollVertically(1) || view.canScrollVertically(-1))) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View viewLIZ = LIZ(viewGroup.getChildAt(i));
                if (viewLIZ != null) {
                    return viewLIZ;
                }
            }
            return null;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        float yVelocity;
        View childAt = getChildAt(0);
        if (childAt != null && LIZIZ()) {
            if (motionEvent.getX() >= childAt.getLeft() && motionEvent.getX() < childAt.getRight()) {
                z = true;
            } else {
                z = false;
            }
            if (motionEvent.getActionMasked() == 0) {
                boolean z2 = !z;
                this.LLILLL = z2;
                if (z2) {
                    View viewLIZ = this.LL.LIZJ;
                    if (viewLIZ != null) {
                        if (childAt != viewLIZ) {
                            for (Object parent = viewLIZ.getParent(); parent instanceof View; parent = ((View) parent).getParent()) {
                                if (parent == childAt) {
                                    break;
                                }
                            }
                            viewLIZ = LIZ(childAt);
                        }
                    } else {
                        viewLIZ = LIZ(childAt);
                    }
                    this.LLIZ = viewLIZ;
                    this.LLILZIL = motionEvent.getY();
                    this.LLILZLL = motionEvent.getY();
                    this.LLILZ = false;
                    VelocityTracker velocityTracker = this.LLIZLLLIL;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
                    velocityTrackerObtain.addMovement(motionEvent);
                    this.LLIZLLLIL = velocityTrackerObtain;
                    return true;
                }
            }
            if (!this.LLILLL) {
                return super.dispatchTouchEvent(motionEvent);
            }
            VelocityTracker velocityTracker2 = this.LLIZLLLIL;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return true;
                    }
                } else {
                    float y = this.LLILZIL - motionEvent.getY();
                    if (!this.LLILZ && Math.abs(y) > getTouchSlopPx()) {
                        this.LLILZ = true;
                    }
                    if (this.LLILZ) {
                        float y2 = this.LLILZLL - motionEvent.getY();
                        View view = this.LLIZ;
                        if (view != null) {
                            view.scrollBy(0, (int) y2);
                        }
                        this.LLILZLL = motionEvent.getY();
                    }
                    return true;
                }
            }
            if (this.LLILZ && motionEvent.getActionMasked() == 1) {
                VelocityTracker velocityTracker3 = this.LLIZLLLIL;
                if (velocityTracker3 != null) {
                    velocityTracker3.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT, getMaxFlingVelocityPx());
                    yVelocity = velocityTracker3.getYVelocity();
                } else {
                    yVelocity = 0.0f;
                }
                if (Math.abs(yVelocity) >= getMinFlingVelocityPx()) {
                    View view2 = this.LLIZ;
                    int i = (int) (-yVelocity);
                    if (view2 instanceof RecyclerView) {
                        ((RecyclerView) view2).fling(0, i);
                    } else if (view2 instanceof C21578619ce) {
                        ((C21578619ce) view2).fling(i);
                    } else if (view2 instanceof ScrollView) {
                        ((ScrollView) view2).fling(i);
                    }
                }
            }
            this.LLILLL = false;
            this.LLILZ = false;
            this.LLIZ = null;
            VelocityTracker velocityTracker4 = this.LLIZLLLIL;
            if (velocityTracker4 != null) {
                velocityTracker4.recycle();
            }
            this.LLIZLLLIL = null;
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setConfig(C785450UrX c785450UrX) {
        this.LL = c785450UrX;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (!LIZIZ()) {
            super.onMeasure(i, i2);
            this.LLILLJJLI = getMeasuredWidth();
            return;
        }
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            this.LLILLJJLI = getMeasuredWidth();
            return;
        }
        int iMin = Math.min((int) ((this.LL.LJFF * getContext().getResources().getDisplayMetrics().density) + 0.5f), size);
        this.LLILLJJLI = iMin;
        childAt.measure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        setMeasuredDimension(size, FrameLayout.resolveSize(getPaddingTop() + getPaddingBottom() + childAt.getMeasuredHeight(), i2));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int i5 = ((i3 - i) - measuredWidth) / 2;
        childAt.layout(i5, 0, measuredWidth + i5, i4 - i2);
    }
}
