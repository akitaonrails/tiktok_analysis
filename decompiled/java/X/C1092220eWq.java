package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eWq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1092220eWq extends FrameLayout implements InterfaceC1092420eXA {
    public static final /* synthetic */ int LLJJIJI = 0;
    public Long LL;
    public int LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;
    public boolean LLJ;
    public final int LLJI;
    public final C1092240eWs LLJIJIL;
    public InterfaceC1685420txc<? super Float, ? super Float, ? super Float, ? super Float, ? super MotionEvent, Unit> LLJILJIL;
    public Function1<? super Boolean, Unit> LLJILJILJ;
    public Function1<? super Float, Unit> LLJILLL;
    public Function1<? super Boolean, Unit> LLJJ;
    public Function0<Boolean> LLJJI;
    public boolean LLJJIII;

    public static /* synthetic */ void getBoardItemType$annotations() {
    }

    public final int LIZIZ() {
        View childAt = getChildAt(0);
        if (childAt != null) {
            Integer numValueOf = Integer.valueOf(childAt.getMeasuredHeight());
            if (numValueOf.intValue() > 0) {
                return numValueOf.intValue();
            }
        }
        return getHeight();
    }

    public final int LIZJ() {
        View childAt = getChildAt(0);
        if (childAt != null) {
            Integer numValueOf = Integer.valueOf(childAt.getMeasuredWidth());
            if (numValueOf.intValue() > 0) {
                return numValueOf.intValue();
            }
        }
        return getWidth();
    }

    @Override // X.InterfaceC1092420eXA
    public ViewGroup getCaptureView() {
        return this;
    }

    @Override // X.InterfaceC1092420eXA
    public float getRadiusPx() {
        return 0.0f;
    }

    @Override // X.InterfaceC1092420eXA
    public C1092430eXB getPositionAndDimensions() {
        return new C1092430eXB(getTranslationX(), getTranslationY(), LIZJ(), LIZIZ());
    }

    private final Pair<Float, Float> getAdjustedBoundaries() {
        View view;
        Object parent = getParent();
        if (!(parent instanceof FrameLayout) || (view = (View) parent) == null) {
            return new Pair<>(Float.valueOf(0.0f), Float.valueOf(0.0f));
        }
        int width = view.getWidth();
        int height = view.getHeight();
        float scaledWidth = getScaledWidth();
        float scaledHeight = getScaledHeight();
        float f = 1;
        float width2 = (getWidth() * (getScaleX() - f)) / 2.0f;
        float height2 = (getHeight() * (getScaleY() - f)) / 2.0f;
        float f2 = ((width - scaledWidth) - this.LLILZIL) + width2;
        float f3 = this.LLILLL;
        if (f2 < f3 + width2) {
            f2 = f3 + width2;
        }
        float f4 = ((height - scaledHeight) - this.LLILZLL) + height2;
        float f5 = this.LLILZ;
        if (f4 < f5 + height2) {
            f4 = f5 + height2;
        }
        return new Pair<>(Float.valueOf(f2), Float.valueOf(f4));
    }

    private final float getScaledHeight() {
        return LIZIZ() * getScaleY();
    }

    public final List<View> getOverlappingViews() {
        ViewGroup viewGroup;
        ViewParent parent = getParent();
        if (!(parent instanceof FrameLayout) || (viewGroup = (ViewGroup) parent) == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        Rect rectLIZLLL = LIZLLL(this);
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (!Intrinsics.LJFF(childAt, this)) {
                Rect rect = new Rect();
                childAt.getHitRect(rect);
                if ((childAt instanceof C1092220eWq) && childAt.getVisibility() == 0) {
                    rect = LIZLLL(childAt);
                }
                if (Rect.intersects(rectLIZLLL, rect)) {
                    arrayList.add(childAt);
                }
            }
        }
        return arrayList;
    }

    public final float getScaledWidth() {
        return LIZJ() * getScaleX();
    }

    public final int getBoardItemType() {
        return this.LLILLJJLI;
    }

    public final Function0<Boolean> getCanDrag() {
        return this.LLJJI;
    }

    public final Long getContentId() {
        return this.LL;
    }

    public final Function1<Boolean, Unit> getOnDragStatusChange() {
        return this.LLJILJILJ;
    }

    public final InterfaceC1685420txc<Float, Float, Float, Float, MotionEvent, Unit> getOnPositionChangeListener() {
        return this.LLJILJIL;
    }

    public final Function1<Float, Unit> getOnScaleChange() {
        return this.LLJILLL;
    }

    public final Function1<Boolean, Unit> getOnScaleStatusChange() {
        return this.LLJJ;
    }

    public static Rect LIZLLL(View view) {
        Rect rect = new Rect();
        ArrayList arrayList = new ArrayList();
        C13E8 c13e8 = new C13E8();
        c13e8.addLast(view);
        while (!c13e8.isEmpty()) {
            View view2 = (View) c13e8.removeFirst();
            if (view2 instanceof InterfaceC1092330eX1) {
                arrayList.add(view2);
            }
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                if (viewGroup.getVisibility() != 8) {
                    int childCount = viewGroup.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        c13e8.addLast(viewGroup.getChildAt(i));
                    }
                }
            }
        }
        if (arrayList.size() > 1) {
            Iterator it2 = arrayList.iterator();
            int iMax = Integer.MIN_VALUE;
            int iMin = Integer.MAX_VALUE;
            int iMin2 = Integer.MAX_VALUE;
            int iMax2 = Integer.MIN_VALUE;
            while (it2.hasNext()) {
                ((View) it2.next()).getGlobalVisibleRect(rect);
                if (rect.width() * rect.height() > 0) {
                    iMin = Math.min(iMin, rect.left);
                    iMin2 = Math.min(iMin2, rect.top);
                    iMax = Math.max(iMax, rect.right);
                    iMax2 = Math.max(iMax2, rect.bottom);
                }
            }
            return new Rect(iMin, iMin2, iMax, iMax2);
        }
        View view3 = (View) C13LP.LJJJLL(arrayList);
        if (view3 != null) {
            view3.getGlobalVisibleRect(rect);
        }
        return rect;
    }

    private final void setDragging(boolean z) {
        if (this.LLJ != z) {
            this.LLJ = z;
            Function1<? super Boolean, Unit> function1 = this.LLJILJILJ;
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(z));
            }
        }
    }

    public final void LJ(MotionEvent motionEvent) {
        float translationX = getTranslationX();
        float translationY = getTranslationY();
        float fLIZJ = LIZJ();
        float fLIZIZ = LIZIZ();
        InterfaceC1685420txc<? super Float, ? super Float, ? super Float, ? super Float, ? super MotionEvent, Unit> interfaceC1685420txc = this.LLJILJIL;
        if (interfaceC1685420txc != null) {
            interfaceC1685420txc.invoke(Float.valueOf(translationX), Float.valueOf(translationY), Float.valueOf(fLIZJ), Float.valueOf(fLIZIZ), motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Function0<Boolean> function0 = this.LLJJI;
        if (function0 != null && Intrinsics.LJFF(function0.invoke(), Boolean.FALSE)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2) {
                float fAbs = Math.abs(motionEvent.getRawX() - this.LLIZ);
                float fAbs2 = Math.abs(motionEvent.getRawY() - this.LLIZLLLIL);
                int i = this.LLJI;
                if (fAbs > i || fAbs2 > i) {
                    setDragging(true);
                    return true;
                }
            }
        } else {
            this.LLIZ = motionEvent.getRawX();
            this.LLIZLLLIL = motionEvent.getRawY();
            setDragging(false);
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0135  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1092220eWq.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setBoardItemType(int i) {
        this.LLILLJJLI = i;
    }

    public final void setCanDrag(Function0<Boolean> function0) {
        this.LLJJI = function0;
    }

    public final void setContentId(Long l) {
        this.LL = l;
    }

    public final void setOnDragStatusChange(Function1<? super Boolean, Unit> function1) {
        this.LLJILJILJ = function1;
    }

    public final void setOnPositionChangeListener(InterfaceC1685420txc<? super Float, ? super Float, ? super Float, ? super Float, ? super MotionEvent, Unit> interfaceC1685420txc) {
        this.LLJILJIL = interfaceC1685420txc;
    }

    public final void setOnScaleChange(Function1<? super Float, Unit> function1) {
        this.LLJILLL = function1;
    }

    public final void setOnScaleStatusChange(Function1<? super Boolean, Unit> function1) {
        this.LLJJ = function1;
    }

    public final void setRTL(boolean z) {
        this.LLJJIII = z;
    }

    public C1092220eWq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJI = 10;
        this.LLJIJIL = new C1092240eWs(this, new C1092210eWp(this), new C1092250eWt(this));
        HandlerHook.viewPost(this, new Runnable() { // from class: X.0eWw
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LiveBoardDraggableLayout@61a4.<init>$1");
                try {
                    this.LL.LJ(null);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LiveBoardDraggableLayout@61a4.<init>$1");
            }
        });
        this.LLJJIII = C497740JfY.LJJ();
        setClipChildren(false);
    }

    public final Pair<Float, Float> LIZ(float f, float f2) {
        Pair<Float, Float> adjustedBoundaries = getAdjustedBoundaries();
        float fFloatValue = adjustedBoundaries.getFirst().floatValue();
        float fFloatValue2 = adjustedBoundaries.getSecond().floatValue();
        float f3 = 1;
        float width = (getWidth() * (getScaleX() - f3)) / 2.0f;
        float height = (getHeight() * (getScaleY() - f3)) / 2.0f;
        return new Pair<>(Float.valueOf(C13LZ.LIZLLL(f, this.LLILLL + width, fFloatValue)), Float.valueOf(C13LZ.LIZLLL(f2, this.LLILZ + height, fFloatValue2)));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                measuredWidth = Math.max(measuredWidth, childAt.getMeasuredWidth());
                measuredHeight = Math.max(measuredHeight, childAt.getMeasuredHeight());
            }
        }
        if (measuredWidth != getMeasuredWidth() || measuredHeight != getMeasuredHeight()) {
            setMeasuredDimension(measuredWidth, measuredHeight);
        }
    }
}
