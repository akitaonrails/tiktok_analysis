package X;

import Y.AUListenerS279S0100000_32;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Scroller;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.19IQ, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19IQ extends FrameLayout implements View.OnTouchListener {
    public int LL;
    public int LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public List<Integer> LLILZIL;
    public Scroller LLILZLL;
    public LinearLayout LLIZ;
    public GestureDetector LLIZLLLIL;
    public final C19IU LLJ;
    public int LLJI;
    public float LLJIJIL;
    public float LLJILJIL;
    public float LLJILJILJ;
    public float LLJILLL;
    public View LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public final int LLJJIJIL;
    public float LLJJJ;
    public int LLJJJIL;
    public int LLJJJJ;
    public boolean LLJJJJJIL;

    public final void setOnIndexChangedListener(InterfaceC21515519Ib interfaceC21515519Ib) {
    }

    public final void setOnInterceptIndexChangedListener(C19IX c19ix) {
    }

    public final void setSharedARTabChangeListener(C19IY c19iy) {
    }

    public final void setTabHostGestureListener(InterfaceC21515619Ic interfaceC21515619Ic) {
    }

    public final void setTouchEventWrapper(C19IZ c19iz) {
    }

    public final int getTabCount() {
        LinearLayout linearLayout = this.LLIZ;
        if (linearLayout != null) {
            return linearLayout.getChildCount();
        }
        return 0;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.LLIZ = (LinearLayout) findViewById(R.id.eqx);
    }

    public final int getCurrentIndex() {
        return this.LL;
    }

    public final float getIndicatorWidth() {
        return this.LLJJJ;
    }

    public final int getLastIndex() {
        return this.LLILLJJLI;
    }

    public final Scroller getScroller() {
        return this.LLILZLL;
    }

    public final List<Integer> getXPivots() {
        return this.LLILZIL;
    }

    public final void LIZ(int i) {
        int childCount;
        List<Integer> list;
        int scrollX;
        int i2;
        int i3;
        View childAt;
        LinearLayout linearLayout = this.LLIZ;
        int iIntValue = 0;
        if (linearLayout != null) {
            childCount = linearLayout.getChildCount();
        } else {
            childCount = 0;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            if (i4 == i) {
                i2 = this.LLJJI;
            } else {
                i2 = this.LLJJIII;
            }
            if (i4 == i) {
                i3 = this.LLJJIJI;
            } else {
                i3 = this.LLJJIJIIJIL;
            }
            LinearLayout linearLayout2 = this.LLIZ;
            if (linearLayout2 != null && (childAt = linearLayout2.getChildAt(i4)) != null) {
                if (!childAt.isEnabled()) {
                    i2 = this.LLJJIJIL;
                }
                if (childAt instanceof C19IS) {
                    C19IS c19is = (C19IS) childAt;
                    c19is.setTextColor(i2);
                    c19is.setTextFont(i3);
                } else if (childAt instanceof TextView) {
                    TextView textView = (TextView) childAt;
                    textView.setTextColor(i2);
                    int iAlpha = Color.alpha(i2);
                    Drawable[] compoundDrawables = textView.getCompoundDrawables();
                    for (Drawable drawable : compoundDrawables) {
                        if (drawable == null) {
                            break;
                        }
                        drawable.setAlpha(iAlpha);
                    }
                }
            }
            LinearLayout linearLayout3 = this.LLIZ;
            if (linearLayout3 != null) {
                int childCount2 = linearLayout3.getChildCount();
                for (int i5 = 0; i5 < childCount2; i5++) {
                    if (i5 != i) {
                        LIZIZ(i5, false);
                    }
                }
                LIZIZ(i, true);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("withoutAnim the set index is ");
        sbLIZ.append(i);
        sbLIZ.append(" mCurIndex:");
        sbLIZ.append(this.LL);
        C1706630uVp.LIZ("TabHost", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLJJLI = this.LL;
        this.LL = i;
        List<Integer> list2 = this.LLILZIL;
        if (list2 != null && !list2.isEmpty() && i >= 0 && (list = this.LLILZIL) != null && i < list.size()) {
            int[] iArr = new int[2];
            LinearLayout linearLayout4 = this.LLIZ;
            if (linearLayout4 != null) {
                scrollX = linearLayout4.getScrollX();
            } else {
                scrollX = 0;
            }
            iArr[0] = scrollX;
            List<Integer> list3 = this.LLILZIL;
            if (list3 != null) {
                int iIntValue2 = ((Number) ListProtector.get(list3, i)).intValue();
                List<Integer> list4 = this.LLILZIL;
                if (list4 != null) {
                    iIntValue = ((Number) ListProtector.get(list4, 0)).intValue();
                }
                iIntValue = iIntValue2 - iIntValue;
            }
            iArr[1] = iIntValue;
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iArr);
            valueAnimatorOfInt.setDuration(150L);
            valueAnimatorOfInt.addUpdateListener(new AUListenerS279S0100000_32(this, 27));
            valueAnimatorOfInt.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final void setIndicatorWidth(float f) {
        this.LLJJJ = f;
    }

    public final void setScrollEnabled(boolean z) {
        this.LLILLL = z;
    }

    public final void setScroller(Scroller scroller) {
        this.LLILZLL = scroller;
    }

    public final void setSelectedTextColor(int i) {
        Integer numLIZJ = C1308910kAL.LIZJ(i, new ContextThemeWrapper(getContext(), R.style.z4));
        if (numLIZJ != null) {
            this.LLJJI = numLIZJ.intValue();
        }
    }

    public final void setSelectedTextFont(int i) {
        this.LLJJIJI = i;
    }

    public final void setStartMargin(int i) {
        C0GUD c0gud;
        this.LLJJJJ = i;
        LinearLayout linearLayout = this.LLIZ;
        if (linearLayout != null && (linearLayout instanceof C0GUD)) {
            if ((linearLayout instanceof C0GUD) && (c0gud = (C0GUD) linearLayout) != null) {
                c0gud.setCanMeasureExtra(i);
                c0gud.requestLayout();
            } else {
                return;
            }
        }
        requestLayout();
    }

    public final void setTabHostDisableParentScroll(boolean z) {
        this.LLJJJJJIL = z;
    }

    public final void setUISwitchEnabled(boolean z) {
        this.LLILZ = z;
    }

    public final void setUnselectedTextColor(int i) {
        Integer numLIZJ = C1308910kAL.LIZJ(i, new ContextThemeWrapper(getContext(), R.style.z4));
        if (numLIZJ != null) {
            this.LLJJIII = numLIZJ.intValue();
        }
    }

    public final void setUnselectedTextFont(int i) {
        this.LLJJIJIIJIL = i;
    }

    public final void setXPivots(List<Integer> list) {
        this.LLILZIL = list;
    }

    public C19IQ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLL = true;
        this.LLILZ = true;
        this.LLJ = new C19IU();
        this.LLJJI = C960203pA.LIZ(R.attr.ee, getContext());
        this.LLJJIII = C960203pA.LIZ(R.attr.eh, getContext());
        this.LLJJIJI = 42;
        this.LLJJIJIIJIL = 42;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zk, getContext());
        this.LLJJIJIL = numLIZJ != null ? numLIZJ.intValue() : 0;
        C19IT.LIZ.getClass();
        getCurrentIndex();
        this.LLJJJIL = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.LLILZIL = new ArrayList();
        setOnTouchListener(this);
        this.LLILZLL = new Scroller(getContext());
        this.LLIZLLLIL = new GestureDetector(getContext(), new GestureDetector.OnGestureListener() { // from class: X.19IR
            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                return true;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final void onShowPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                C19IQ c19iq = this.LL;
                if (!Intrinsics.LJFF(c19iq, c19iq.LLJJ)) {
                    C19IQ c19iq2 = this.LL;
                    if (!Intrinsics.LJFF(c19iq2.LLIZ, c19iq2.LLJJ)) {
                        C19IQ c19iq3 = this.LL;
                        C19IU c19iu = c19iq3.LLJ;
                        View view = c19iq3.LLJJ;
                        c19iu.getClass();
                        if (view == null || !C19IN.LLILZIL) {
                            return false;
                        }
                        c19iu.LIZ.onClick(view);
                        C19IQ c19iq4 = this.LL;
                        if (!c19iq4.LLILZ) {
                            return false;
                        }
                        int i = c19iq4.LLJI;
                        C19IT.LIZ.getClass();
                        c19iq4.LIZ(i);
                        return false;
                    }
                }
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                Scroller scroller;
                int finalX;
                int finalY;
                C19IQ c19iq = this.LL;
                if (c19iq.LLILLL && f2 < 20.0f && (scroller = c19iq.getScroller()) != null) {
                    Scroller scroller2 = this.LL.getScroller();
                    if (scroller2 != null) {
                        finalX = scroller2.getFinalX();
                    } else {
                        finalX = 0;
                    }
                    Scroller scroller3 = this.LL.getScroller();
                    if (scroller3 != null) {
                        finalY = scroller3.getFinalY();
                    } else {
                        finalY = 0;
                    }
                    scroller.fling(finalX, finalY, (int) f2, 0, 500, (int) f, 0, this.LL.getHeight());
                }
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                C19IQ c19iq = this.LL;
                if (!c19iq.LLILLL) {
                    return false;
                }
                if (f2 < 20.0f) {
                    f2 = 20.0f;
                }
                LinearLayout linearLayout = c19iq.LLIZ;
                if (linearLayout != null) {
                    linearLayout.scrollBy((int) ((f * 20) / f2), 0);
                }
                this.LL.getClass();
                C19IQ c19iq2 = this.LL;
                C19IT.LIZ.getClass();
                c19iq2.getClass();
                this.LL.invalidate();
                return true;
            }
        });
    }

    public final void LIZIZ(int i, boolean z) {
        View childAt;
        LinearLayout linearLayout = this.LLIZ;
        if (linearLayout != null && (childAt = linearLayout.getChildAt(i)) != null) {
            if (childAt instanceof C19IS) {
                ((C19IS) childAt).setTabSelected(z);
            } else {
                if (!(childAt instanceof TextView)) {
                    return;
                }
                ((TextView) childAt).setSelected(z);
            }
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        float scrollX;
        int size;
        int i;
        int i2;
        int iIntValue;
        int i3;
        int iIntValue2;
        boolean z2;
        float scrollX2;
        int size2;
        int iIntValue3;
        int iIntValue4;
        View childAt;
        int scrollX3;
        int scrollX4;
        View childAt2;
        int scrollX5;
        int scrollX6;
        if (motionEvent.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
            this.LLJIJIL = motionEvent.getX();
            this.LLJILJILJ = motionEvent.getY();
            if (C0H0N.LJIIJ(getContext())) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                LinearLayout linearLayout = this.LLIZ;
                if (linearLayout != null) {
                    int childCount = linearLayout.getChildCount();
                    int i4 = 0;
                    while (true) {
                        if (i4 < childCount) {
                            LinearLayout linearLayout2 = this.LLIZ;
                            if (linearLayout2 != null && (childAt2 = linearLayout2.getChildAt(i4)) != null) {
                                int right = childAt2.getRight() - this.LLJJJJ;
                                LinearLayout linearLayout3 = this.LLIZ;
                                if (linearLayout3 != null) {
                                    scrollX5 = linearLayout3.getScrollX();
                                } else {
                                    scrollX5 = 0;
                                }
                                if (x < right - scrollX5) {
                                    int left = childAt2.getLeft() - this.LLJJJJ;
                                    LinearLayout linearLayout4 = this.LLIZ;
                                    if (linearLayout4 != null) {
                                        scrollX6 = linearLayout4.getScrollX();
                                    } else {
                                        scrollX6 = 0;
                                    }
                                    if (x > left - scrollX6 && y < childAt2.getBottom() && y > childAt2.getTop()) {
                                        this.LLJI = i4;
                                        this.LLJJ = childAt2;
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            }
                            i4++;
                        } else {
                            this.LLJJ = this.LLIZ;
                            break;
                        }
                    }
                }
            } else {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                LinearLayout linearLayout5 = this.LLIZ;
                if (linearLayout5 != null) {
                    int childCount2 = linearLayout5.getChildCount();
                    int i5 = 0;
                    while (true) {
                        if (i5 < childCount2) {
                            LinearLayout linearLayout6 = this.LLIZ;
                            if (linearLayout6 != null && (childAt = linearLayout6.getChildAt(i5)) != null) {
                                int right2 = childAt.getRight() + this.LLJJJJ;
                                LinearLayout linearLayout7 = this.LLIZ;
                                if (linearLayout7 != null) {
                                    scrollX3 = linearLayout7.getScrollX();
                                } else {
                                    scrollX3 = 0;
                                }
                                if (x2 < right2 - scrollX3) {
                                    int left2 = childAt.getLeft() + this.LLJJJJ;
                                    LinearLayout linearLayout8 = this.LLIZ;
                                    if (linearLayout8 != null) {
                                        scrollX4 = linearLayout8.getScrollX();
                                    } else {
                                        scrollX4 = 0;
                                    }
                                    if (x2 > left2 - scrollX4 && y2 < childAt.getBottom() && y2 > childAt.getTop()) {
                                        this.LLJI = i5;
                                        this.LLJJ = childAt;
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            }
                            i5++;
                        } else {
                            this.LLJJ = this.LLIZ;
                            break;
                        }
                    }
                }
            }
        }
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action != 2) {
                if (action == 3) {
                    int i6 = this.LL;
                    C19IT.LIZ.getClass();
                    LIZ(i6);
                }
            } else {
                float x3 = motionEvent.getX() - this.LLJIJIL;
                float y3 = motionEvent.getY() - this.LLJILJILJ;
                if ((Math.abs(x3) <= this.LLJJJIL || Math.abs(x3) <= Math.abs(y3)) && !this.LLJJJJJIL) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                } else {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            }
        } else {
            this.LLJILJIL = motionEvent.getX();
            this.LLJILLL = motionEvent.getY();
            if (Math.abs(this.LLJILJIL - this.LLJIJIL) >= this.LLJJJIL * 2 && Math.abs(this.LLJILLL - this.LLJILJILJ) <= C1287910jcT.LJ(getContext()).y / 4) {
                C19IU c19iu = this.LLJ;
                c19iu.getClass();
                if (!C19IN.LLILZIL) {
                    return false;
                }
                c19iu.LIZ.onClick(this);
                if (!this.LLILZ) {
                    return false;
                }
                float fIntValue = 0.0f;
                if (C0H0N.LJIIJ(getContext())) {
                    if (this.LLJIJIL < this.LLJILJIL) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    LinearLayout linearLayout9 = this.LLIZ;
                    if (linearLayout9 != null) {
                        scrollX2 = linearLayout9.getScrollX();
                    } else {
                        scrollX2 = 0.0f;
                    }
                    List<Integer> list = this.LLILZIL;
                    if (list != null) {
                        fIntValue = ((Number) ListProtector.get(list, 0)).intValue();
                    }
                    float f = scrollX2 + fIntValue;
                    List<Integer> list2 = this.LLILZIL;
                    if (list2 != null) {
                        size2 = list2.size();
                    } else {
                        size2 = 0;
                    }
                    if (z2) {
                        i = 0;
                        i2 = 0;
                        while (i < size2) {
                            List<Integer> list3 = this.LLILZIL;
                            if (list3 != null) {
                                iIntValue4 = ((Number) ListProtector.get(list3, i)).intValue();
                            } else {
                                iIntValue4 = 0;
                            }
                            if (iIntValue4 < f) {
                                break;
                            }
                            i2 = i;
                            i++;
                        }
                        i = i2;
                        break;
                    }
                    i = size2 - 1;
                    i3 = 0;
                    while (-1 < i) {
                        List<Integer> list4 = this.LLILZIL;
                        if (list4 != null) {
                            iIntValue3 = ((Number) ListProtector.get(list4, i)).intValue();
                        } else {
                            iIntValue3 = 0;
                        }
                        if (iIntValue3 >= f) {
                            break;
                        }
                        i3 = i;
                        i--;
                    }
                    i = i3;
                    break;
                    LIZ(i);
                } else {
                    if (this.LLJIJIL < this.LLJILJIL) {
                        z = true;
                    } else {
                        z = false;
                    }
                    LinearLayout linearLayout10 = this.LLIZ;
                    if (linearLayout10 != null) {
                        scrollX = linearLayout10.getScrollX();
                    } else {
                        scrollX = 0.0f;
                    }
                    List<Integer> list5 = this.LLILZIL;
                    if (list5 != null) {
                        fIntValue = ((Number) ListProtector.get(list5, 0)).intValue();
                    }
                    float f2 = scrollX + fIntValue;
                    List<Integer> list6 = this.LLILZIL;
                    if (list6 != null) {
                        size = list6.size();
                    } else {
                        size = 0;
                    }
                    if (z) {
                        i3 = size - 1;
                        i = 0;
                        while (-1 < i3) {
                            List<Integer> list7 = this.LLILZIL;
                            if (list7 != null) {
                                iIntValue2 = ((Number) ListProtector.get(list7, i3)).intValue();
                            } else {
                                iIntValue2 = 0;
                            }
                            if (iIntValue2 >= f2) {
                                i = i3;
                                i3--;
                            } else {
                                i = i3;
                                break;
                            }
                        }
                    } else {
                        i = 0;
                        i2 = 0;
                        while (i2 < size) {
                            List<Integer> list8 = this.LLILZIL;
                            if (list8 != null) {
                                iIntValue = ((Number) ListProtector.get(list8, i2)).intValue();
                            } else {
                                iIntValue = 0;
                            }
                            if (iIntValue < f2) {
                                i = i2;
                                i2++;
                            } else {
                                i = i2;
                                break;
                            }
                        }
                    }
                    LIZ(i);
                }
            } else {
                int i7 = this.LL;
                C19IT.LIZ.getClass();
                LIZ(i7);
            }
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            C19IT.LIZ.getClass();
        }
        GestureDetector gestureDetector = this.LLIZLLLIL;
        if (gestureDetector == null || !gestureDetector.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount;
        int i5;
        int iIntValue;
        View childAt;
        List<Integer> list;
        int width;
        int paddingLeft;
        int paddingRight;
        int paddingLeft2;
        int childCount2;
        int i6;
        int iIntValue2;
        View childAt2;
        int right;
        int left;
        super.onLayout(z, i, i2, i3, i4);
        if (C0H0N.LJIIJ(getContext())) {
            LinearLayout linearLayout = this.LLIZ;
            if (linearLayout != null) {
                childCount2 = linearLayout.getChildCount();
            } else {
                childCount2 = 0;
            }
            List<Integer> list2 = this.LLILZIL;
            if (list2 != null) {
                list2.clear();
            }
            int width2 = i3;
            for (int i7 = 0; i7 < childCount2; i7++) {
                LinearLayout linearLayout2 = this.LLIZ;
                if (linearLayout2 != null && (childAt2 = linearLayout2.getChildAt(i7)) != null) {
                    if (i7 == 0) {
                        LinearLayout linearLayout3 = this.LLIZ;
                        if (linearLayout3 != null) {
                            right = linearLayout3.getRight();
                        } else {
                            right = 0;
                        }
                        LinearLayout linearLayout4 = this.LLIZ;
                        if (linearLayout4 != null) {
                            left = linearLayout4.getLeft();
                        } else {
                            left = 0;
                        }
                        int i8 = right - left;
                        int i9 = i3 - i;
                        width2 = (width2 - (i9 / 2)) + (childAt2.getWidth() / 2) + (i8 - i9) + this.LLJJJJ;
                    }
                    List<Integer> list3 = this.LLILZIL;
                    if (list3 != null) {
                        list3.add(Integer.valueOf(width2 - (childAt2.getWidth() / 2)));
                    }
                    childAt2.layout(width2 - childAt2.getWidth(), childAt2.getTop(), width2, childAt2.getBottom());
                    width2 -= childAt2.getWidth();
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("the xPivots size is ");
            sbLIZ.append(childCount2);
            sbLIZ.append(" mCurIndex:");
            sbLIZ.append(this.LL);
            C1706630uVp.LIZ("TabHost", C2188811AlT.LIZIZ(sbLIZ));
            int iLIZIZ = C419990GdR.LIZIZ(this.LL, 0, childCount2 - 1);
            try {
                LinearLayout linearLayout5 = this.LLIZ;
                if (linearLayout5 != null) {
                    List<Integer> list4 = this.LLILZIL;
                    if (list4 != null) {
                        int iIntValue3 = list4.get(iLIZIZ).intValue();
                        List<Integer> list5 = this.LLILZIL;
                        if (list5 != null) {
                            iIntValue2 = list5.get(0).intValue();
                        } else {
                            iIntValue2 = 0;
                        }
                        i6 = iIntValue3 - iIntValue2;
                    } else {
                        i6 = 0;
                    }
                    linearLayout5.scrollTo(i6, 0);
                }
            } catch (IndexOutOfBoundsException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (this.LL > iLIZIZ) {
                C1706630uVp.LIZ("TabHost", "mCurIndex is dangerous， modify it !!! safeIndex: " + iLIZIZ + " mCurIndex:" + this.LL);
                this.LL = iLIZIZ;
                return;
            }
            return;
        }
        LinearLayout linearLayout6 = this.LLIZ;
        if (linearLayout6 != null) {
            childCount = linearLayout6.getChildCount();
        } else {
            childCount = 0;
        }
        List<Integer> list6 = this.LLILZIL;
        if (list6 != null) {
            list6.clear();
        }
        int width3 = i;
        for (int i10 = 0; i10 < childCount; i10++) {
            LinearLayout linearLayout7 = this.LLIZ;
            if (linearLayout7 != null && (childAt = linearLayout7.getChildAt(i10)) != null) {
                if (i10 == 0) {
                    width3 = ((width3 + ((i3 - i) / 2)) - (childAt.getWidth() / 2)) - this.LLJJJJ;
                }
                if (childAt instanceof C19IS) {
                    C19IS c19is = (C19IS) childAt;
                    TextView textView = c19is.getTextView();
                    if (textView != null) {
                        width = textView.getWidth();
                    } else {
                        width = 0;
                    }
                    TextView textView2 = c19is.getTextView();
                    if (textView2 != null) {
                        paddingLeft = textView2.getPaddingLeft();
                    } else {
                        paddingLeft = 0;
                    }
                    int i11 = width - paddingLeft;
                    TextView textView3 = c19is.getTextView();
                    if (textView3 != null) {
                        paddingRight = textView3.getPaddingRight();
                    } else {
                        paddingRight = 0;
                    }
                    int i12 = i11 - paddingRight;
                    List<Integer> list7 = this.LLILZIL;
                    if (list7 != null) {
                        TextView textView4 = c19is.getTextView();
                        if (textView4 != null) {
                            paddingLeft2 = textView4.getPaddingLeft();
                        } else {
                            paddingLeft2 = 0;
                        }
                        list7.add(Integer.valueOf(paddingLeft2 + width3 + (i12 / 2)));
                    }
                } else if ((childAt instanceof TextView) && (list = this.LLILZIL) != null) {
                    list.add(Integer.valueOf((childAt.getWidth() / 2) + width3));
                }
                childAt.layout(width3, childAt.getTop(), childAt.getWidth() + width3, childAt.getBottom());
                width3 += childAt.getWidth();
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("the xPivots size is ");
        sbLIZ2.append(childCount);
        sbLIZ2.append(" mCurIndex:");
        sbLIZ2.append(this.LL);
        C1706630uVp.LIZ("TabHost", C2188811AlT.LIZIZ(sbLIZ2));
        int iLIZIZ2 = C419990GdR.LIZIZ(this.LL, 0, childCount - 1);
        try {
            LinearLayout linearLayout8 = this.LLIZ;
            if (linearLayout8 != null) {
                List<Integer> list8 = this.LLILZIL;
                if (list8 != null) {
                    int iIntValue4 = list8.get(iLIZIZ2).intValue();
                    List<Integer> list9 = this.LLILZIL;
                    if (list9 != null) {
                        iIntValue = list9.get(0).intValue();
                    } else {
                        iIntValue = 0;
                    }
                    i5 = iIntValue4 - iIntValue;
                } else {
                    i5 = 0;
                }
                linearLayout8.scrollTo(i5, 0);
            }
        } catch (IndexOutOfBoundsException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        if (this.LL > iLIZIZ2) {
            C1706630uVp.LIZ("TabHost", "mCurIndex is dangerous， modify it !!! safeIndex: " + iLIZIZ2 + " mCurIndex:" + this.LL);
            this.LL = iLIZIZ2;
        }
    }
}
