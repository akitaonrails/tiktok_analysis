package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: X.0S9u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C716800S9u extends LinearLayout {
    public int LL;
    public EnumC716810S9v LLILLJJLI;
    public boolean LLILLL;
    public float LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public final int LLJI;

    public static boolean LIZJ(View view) {
        if (view.canScrollVertically(-1)) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() != 8 && LIZJ(childAt)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void LIZ(int i) {
        int iLJ = C13LZ.LJ(getScrollY() + i, 0, this.LL);
        if (iLJ != getScrollY()) {
            scrollTo(0, iLJ);
        }
        if (getScrollY() >= this.LL) {
            this.LLILLJJLI = EnumC716810S9v.LL;
            this.LLILLL = true;
        }
    }

    public final void LIZIZ(MotionEvent motionEvent) {
        if (!this.LLILLL) {
            return;
        }
        this.LLILLL = false;
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getEventTime(), motionEvent.getEventTime(), 0, motionEvent.getX(), 1 + motionEvent.getY() + this.LLJI, motionEvent.getMetaState());
        super.dispatchTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        if (this.LL <= 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = true;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return super.dispatchTouchEvent(motionEvent);
                    }
                } else {
                    if (!this.LLJ) {
                        LIZIZ(motionEvent);
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    if (!this.LLIZ) {
                        float fAbs = Math.abs(motionEvent.getX() - this.LLILZIL);
                        float fAbs2 = Math.abs(motionEvent.getY() - this.LLILZLL);
                        float f = this.LLJI;
                        if (fAbs > f || fAbs2 > f) {
                            this.LLIZ = true;
                            if (fAbs2 <= fAbs) {
                                z2 = false;
                            }
                            this.LLIZLLLIL = z2;
                            this.LLILZ = motionEvent.getY();
                        }
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    if (!this.LLIZLLLIL) {
                        LIZIZ(motionEvent);
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    int y = (int) (this.LLILZ - motionEvent.getY());
                    this.LLILZ = motionEvent.getY();
                    int iOrdinal = this.LLILLJJLI.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            LIZ(y);
                            return true;
                        }
                        throw new C1954807lC();
                    }
                    LIZIZ(motionEvent);
                    if (y > 0) {
                        if (getScrollY() < this.LL) {
                            this.LLILLJJLI = EnumC716810S9v.LLILLJJLI;
                            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                            motionEventObtain.setAction(3);
                            super.dispatchTouchEvent(motionEventObtain);
                            motionEventObtain.recycle();
                            LIZ(y);
                            return true;
                        }
                    } else if (y < 0 && getScrollY() > 0 && ((childAt = getChildAt(1)) == null || !LIZJ(childAt))) {
                        this.LLILLJJLI = EnumC716810S9v.LLILLJJLI;
                        MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                        motionEventObtain2.setAction(3);
                        super.dispatchTouchEvent(motionEventObtain2);
                        motionEventObtain2.recycle();
                        LIZ(y);
                        return true;
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
            }
            EnumC716810S9v enumC716810S9v = this.LLILLJJLI;
            EnumC716810S9v enumC716810S9v2 = EnumC716810S9v.LL;
            if (enumC716810S9v == enumC716810S9v2 && !this.LLILLL) {
                z = false;
            } else {
                z = true;
            }
            this.LLILLJJLI = enumC716810S9v2;
            this.LLILLL = false;
            this.LLIZ = false;
            this.LLIZLLLIL = false;
            if (z) {
                return true;
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        this.LLILZIL = motionEvent.getX();
        this.LLILZLL = motionEvent.getY();
        this.LLILZ = motionEvent.getY();
        this.LLIZ = false;
        this.LLIZLLLIL = false;
        this.LLILLJJLI = EnumC716810S9v.LL;
        this.LLILLL = false;
        if (motionEvent.getY() < this.LL - getScrollY()) {
            z2 = false;
        }
        this.LLJ = z2;
        return super.dispatchTouchEvent(motionEvent);
    }

    public C716800S9u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLJJLI = EnumC716810S9v.LL;
        this.LLJI = ViewConfiguration.get(context).getScaledTouchSlop();
        setOrientation(1);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i3;
        super.onMeasure(i, i2);
        if (getChildCount() < 2) {
            return;
        }
        int i4 = 0;
        View childAt = getChildAt(0);
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (childAt.getVisibility() != 8) {
            int measuredHeight = childAt.getMeasuredHeight();
            if (marginLayoutParams != null) {
                i3 = marginLayoutParams.topMargin;
            } else {
                i3 = 0;
            }
            int i5 = measuredHeight + i3;
            if (marginLayoutParams != null) {
                i4 = marginLayoutParams.bottomMargin;
            }
            i4 += i5;
        }
        this.LL = i4;
        View childAt2 = getChildAt(1);
        childAt2.measure(View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
    }
}
