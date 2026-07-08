package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.lynx.base.log.LynxLog;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0kuN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1337450kuN extends FrameLayout implements InterfaceC1318370kPb, InterfaceC20097013kG {
    public EnumC1337520kuU LL;
    public boolean LLILLJJLI;
    public final C1317550kOH LLILLL;
    public final C1318260kPQ LLILZ;
    public int LLILZIL;
    public boolean LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public final OverScroller LLJ;
    public View LLJI;
    public View LLJIJIL;
    public InterfaceC1337570kuZ LLJILJIL;
    public InterfaceC1337580kua LLJILJILJ;

    @Override // X.InterfaceC20097013kG
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // X.InterfaceC20097013kG
    public final boolean startNestedScroll(int i, int i2) {
        throw null;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        EnumC1337520kuU enumC1337520kuU = this.LL;
        if (enumC1337520kuU != EnumC1337520kuU.HORIZONTAL_RIGHT || enumC1337520kuU != EnumC1337520kuU.HORIZONTAL_LEFT) {
            return super.computeHorizontalScrollRange();
        }
        int childCount = getChildCount();
        int width = 0;
        if (childCount >= 0) {
            int i = 0;
            while (true) {
                width += getChildAt(i).getWidth();
                if (i == childCount) {
                    break;
                }
                i++;
            }
        }
        return width;
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.LLJ.computeScrollOffset()) {
            scrollTo(this.LLJ.getCurrX(), this.LLJ.getCurrY());
            InterfaceC1337570kuZ interfaceC1337570kuZ = this.LLJILJIL;
            if (interfaceC1337570kuZ != null) {
                interfaceC1337570kuZ.LIZ(this.LLJ.getCurrX(), this.LLJ.getCurrY(), this.LLIZ, this.LLIZLLLIL);
            }
            this.LLIZ = this.LLJ.getCurrX();
            this.LLIZLLLIL = this.LLJ.getCurrY();
            postInvalidate();
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        EnumC1337520kuU enumC1337520kuU = this.LL;
        if (enumC1337520kuU != EnumC1337520kuU.VERTICAL_BOTTOM || enumC1337520kuU != EnumC1337520kuU.VERTICAL_TOP) {
            return super.computeVerticalScrollRange();
        }
        int childCount = getChildCount();
        int height = 0;
        if (childCount >= 0) {
            int i = 0;
            while (true) {
                height += getChildAt(i).getHeight();
                if (i == childCount) {
                    break;
                }
                i++;
            }
        }
        return height;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C1317550kOH c1317550kOH = this.LLILLL;
        return c1317550kOH.LIZIZ | c1317550kOH.LIZ;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.LLILZ.LIZLLL;
    }

    public final View getMBounceView() {
        return this.LLJIJIL;
    }

    public final View getMContentView() {
        return this.LLJI;
    }

    public final boolean getMEnableBounce() {
        return this.LLILLJJLI;
    }

    public final EnumC1337520kuU getMScrollDirection() {
        return this.LL;
    }

    public C1337450kuN(Context context) {
        new LinkedHashMap();
        super(context, null, 0);
        this.LL = EnumC1337520kuU.HORIZONTAL_RIGHT;
        this.LLILLL = new C1317550kOH();
        this.LLILZ = new C1318260kPQ(this);
        this.LLJ = new OverScroller(context);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        EnumC1337520kuU enumC1337520kuU = this.LL;
        if (enumC1337520kuU != EnumC1337520kuU.HORIZONTAL_RIGHT && enumC1337520kuU != EnumC1337520kuU.HORIZONTAL_LEFT) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        EnumC1337520kuU enumC1337520kuU = this.LL;
        if (enumC1337520kuU != EnumC1337520kuU.VERTICAL_TOP && enumC1337520kuU != EnumC1337520kuU.VERTICAL_BOTTOM) {
            return false;
        }
        return true;
    }

    public final void setMBounceView(View view) {
        View view2 = this.LLJIJIL;
        if (view2 != null) {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, view2);
            removeView(view2);
        }
        if (view != null) {
            addView(view);
        }
        this.LLJIJIL = view;
    }

    public final void setMContentView(View view) {
        View view2 = this.LLJI;
        if (view2 != null) {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, view2);
            removeView(view2);
        }
        if (view != null) {
            addView(view, -1, -1);
        }
        this.LLJI = view;
    }

    public final void setMEnableBounce(boolean z) {
        this.LLILLJJLI = z;
    }

    public final void setMScrollDirection(EnumC1337520kuU enumC1337520kuU) {
        this.LL = enumC1337520kuU;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.LLILZ.LJIIIZ(z);
    }

    public final void setOnBounceScrollListener(InterfaceC1337570kuZ interfaceC1337570kuZ) {
        this.LLJILJIL = interfaceC1337570kuZ;
    }

    public final void setOnScrollToEndListener(InterfaceC1337580kua interfaceC1337580kua) {
        this.LLJILJILJ = interfaceC1337580kua;
    }

    @Override // X.InterfaceC20097013kG
    public final void stopNestedScroll(int i) {
        this.LLILZ.LJIIJJI(i);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.LLILZ.LIZIZ(f, f2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        int i3;
        super.onMeasure(i, i2);
        View view = this.LLJIJIL;
        if (view != null) {
            measureChildWithMargins(view, i, 0, i2, 0);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int i4 = C1337530kuV.LIZ[this.LL.ordinal()];
                if (i4 != 1 && i4 != 2) {
                    if (i4 != 3 && i4 != 4) {
                        throw new C1954807lC();
                    }
                    measuredHeight = view.getMeasuredWidth() + marginLayoutParams.rightMargin;
                    i3 = marginLayoutParams.leftMargin;
                } else {
                    measuredHeight = view.getMeasuredHeight() + marginLayoutParams.topMargin;
                    i3 = marginLayoutParams.bottomMargin;
                }
                this.LLILZIL = measuredHeight + i3;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    @Override // X.InterfaceC1318370kPb
    public final void onStopNestedScroll(View view, int i) {
        InterfaceC1337580kua interfaceC1337580kua;
        InterfaceC1337580kua interfaceC1337580kua2;
        InterfaceC1337580kua interfaceC1337580kua3;
        InterfaceC1337580kua interfaceC1337580kua4;
        this.LLILLL.LIZIZ(i);
        if (i == 1) {
            return;
        }
        int i2 = C1337530kuV.LIZ[this.LL.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4 || getScrollX() <= 0) {
                        return;
                    }
                    if (getScrollX() > ((double) this.LLILZIL) * 0.88d && (interfaceC1337580kua4 = this.LLJILJILJ) != null) {
                        interfaceC1337580kua4.LIZ();
                    }
                    LIZ(this, -getScrollX(), 0);
                    return;
                }
                if (getScrollX() >= 0) {
                    return;
                }
                if (Math.abs(getScrollX()) > ((double) this.LLILZIL) * 0.88d && (interfaceC1337580kua3 = this.LLJILJILJ) != null) {
                    interfaceC1337580kua3.LIZ();
                }
                LIZ(this, -getScrollX(), 0);
                return;
            }
            if (getScrollY() <= 0) {
                return;
            }
            if (getScrollY() > ((double) this.LLILZIL) * 0.88d && (interfaceC1337580kua2 = this.LLJILJILJ) != null) {
                interfaceC1337580kua2.LIZ();
            }
            LIZ(this, 0, -getScrollY());
            return;
        }
        if (getScrollY() >= 0) {
            return;
        }
        if (Math.abs(getScrollY()) > ((double) this.LLILZIL) * 0.88d && (interfaceC1337580kua = this.LLJILJILJ) != null) {
            interfaceC1337580kua.LIZ();
        }
        LIZ(this, 0, -getScrollY());
    }

    public static void LIZ(C1337450kuN c1337450kuN, int i, int i2) {
        c1337450kuN.LLJ.startScroll(c1337450kuN.getScrollX(), c1337450kuN.getScrollY(), i, i2);
        c1337450kuN.invalidate();
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.LLILZ.LIZ(f, f2, z);
    }

    @Override // X.InterfaceC1318370kPb
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        this.LLILLL.LIZ(i, i2);
    }

    @Override // X.InterfaceC1318370kPb
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        if (!this.LLILLJJLI) {
            return false;
        }
        int i3 = C1337530kuV.LIZ[this.LL.ordinal()];
        if (i3 != 1 && i3 != 2) {
            if (i3 != 3 && i3 != 4) {
                throw new C1954807lC();
            }
            if (i != 1) {
                return false;
            }
        } else if (i != 2) {
            return false;
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth;
        int measuredHeight;
        try {
            super.onLayout(z, getLeft(), getTop(), getRight(), getBottom());
            View view = this.LLJIJIL;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    int i5 = C1337530kuV.LIZ[this.LL.ordinal()];
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 != 3) {
                                if (i5 != 4) {
                                    measuredWidth = 0;
                                    measuredHeight = 0;
                                } else {
                                    measuredWidth = getMeasuredWidth() + marginLayoutParams.leftMargin;
                                    measuredHeight = marginLayoutParams.topMargin;
                                }
                            } else {
                                measuredWidth = -(view.getMeasuredWidth() + marginLayoutParams.rightMargin);
                                measuredHeight = marginLayoutParams.topMargin;
                            }
                        } else {
                            measuredWidth = marginLayoutParams.leftMargin;
                            measuredHeight = marginLayoutParams.topMargin + getMeasuredHeight();
                        }
                    } else {
                        measuredWidth = marginLayoutParams.leftMargin;
                        measuredHeight = -(view.getMeasuredHeight() + marginLayoutParams.bottomMargin);
                    }
                    view.layout(measuredWidth, measuredHeight, view.getMeasuredWidth() + measuredWidth, view.getMeasuredHeight() + measuredHeight);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Exception during layout: ");
            sbLIZ.append(e.getMessage());
            LynxLog.e("BounceLayout", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.InterfaceC1318370kPb
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 != 0) {
            return;
        }
        int i4 = C1337530kuV.LIZ[this.LL.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 == 4) {
                        if (!view.canScrollHorizontally(1) && i > 0) {
                            int scrollX = getScrollX() + i;
                            int i5 = this.LLILZIL;
                            if (scrollX > i5) {
                                InterfaceC1337570kuZ interfaceC1337570kuZ = this.LLJILJIL;
                                if (interfaceC1337570kuZ != null) {
                                    interfaceC1337570kuZ.LIZ(i5, 0, getScrollX(), 0);
                                }
                                scrollTo(this.LLILZIL, getScrollY());
                            } else {
                                requestDisallowInterceptTouchEvent(true);
                                InterfaceC1337570kuZ interfaceC1337570kuZ2 = this.LLJILJIL;
                                if (interfaceC1337570kuZ2 != null) {
                                    interfaceC1337570kuZ2.LIZ(getScrollX() + i, 0, getScrollX(), 0);
                                }
                                scrollBy(i, 0);
                            }
                            iArr[0] = i;
                            this.LLIZ = getScrollX();
                            return;
                        }
                        if (i < 0 && getScrollX() > 0) {
                            if (Math.abs(i) > getScrollX()) {
                                InterfaceC1337570kuZ interfaceC1337570kuZ3 = this.LLJILJIL;
                                if (interfaceC1337570kuZ3 != null) {
                                    interfaceC1337570kuZ3.LIZ(0, 0, getScrollX(), 0);
                                }
                                scrollBy(-getScrollX(), 0);
                            } else {
                                InterfaceC1337570kuZ interfaceC1337570kuZ4 = this.LLJILJIL;
                                if (interfaceC1337570kuZ4 != null) {
                                    interfaceC1337570kuZ4.LIZ(getScrollX() + i, 0, getScrollX(), 0);
                                }
                                scrollBy(i, 0);
                            }
                            iArr[0] = i;
                            this.LLIZ = getScrollX();
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (!view.canScrollHorizontally(-1) && i < 0) {
                    int iAbs = Math.abs(i) + Math.abs(getScrollX());
                    int i6 = this.LLILZIL;
                    if (iAbs > i6) {
                        InterfaceC1337570kuZ interfaceC1337570kuZ5 = this.LLJILJIL;
                        if (interfaceC1337570kuZ5 != null) {
                            interfaceC1337570kuZ5.LIZ(-i6, 0, getScrollX(), 0);
                        }
                        scrollTo(-this.LLILZIL, getScrollY());
                    } else {
                        requestDisallowInterceptTouchEvent(true);
                        InterfaceC1337570kuZ interfaceC1337570kuZ6 = this.LLJILJIL;
                        if (interfaceC1337570kuZ6 != null) {
                            interfaceC1337570kuZ6.LIZ(getScrollX() + i, 0, getScrollX(), 0);
                        }
                        scrollBy(i, 0);
                    }
                    iArr[0] = i;
                    this.LLIZ = getScrollX();
                    return;
                }
                if (i > 0 && getScrollX() < 0) {
                    if (i > Math.abs(getScrollX())) {
                        InterfaceC1337570kuZ interfaceC1337570kuZ7 = this.LLJILJIL;
                        if (interfaceC1337570kuZ7 != null) {
                            interfaceC1337570kuZ7.LIZ(0, 0, -getScrollX(), 0);
                        }
                        scrollBy(-getScrollX(), 0);
                    } else {
                        InterfaceC1337570kuZ interfaceC1337570kuZ8 = this.LLJILJIL;
                        if (interfaceC1337570kuZ8 != null) {
                            interfaceC1337570kuZ8.LIZ(getScrollX() + i, 0, getScrollX(), 0);
                        }
                        scrollBy(i, 0);
                    }
                    iArr[0] = i;
                    this.LLIZ = getScrollX();
                    return;
                }
                return;
            }
            if (!view.canScrollVertically(1) && i2 > 0) {
                int scrollY = getScrollY() + i2;
                int i7 = this.LLILZIL;
                if (scrollY > i7) {
                    InterfaceC1337570kuZ interfaceC1337570kuZ9 = this.LLJILJIL;
                    if (interfaceC1337570kuZ9 != null) {
                        interfaceC1337570kuZ9.LIZ(0, i7, 0, getScrollY());
                    }
                    scrollTo(getScrollX(), this.LLILZIL);
                } else {
                    requestDisallowInterceptTouchEvent(true);
                    InterfaceC1337570kuZ interfaceC1337570kuZ10 = this.LLJILJIL;
                    if (interfaceC1337570kuZ10 != null) {
                        interfaceC1337570kuZ10.LIZ(0, getScrollY() + i2, 0, getScrollY());
                    }
                    scrollBy(0, i2);
                }
                iArr[1] = i2;
                this.LLIZLLLIL = getScrollY();
                return;
            }
            if (i2 < 0 && getScrollY() > 0) {
                if (Math.abs(i2) > getScrollY()) {
                    InterfaceC1337570kuZ interfaceC1337570kuZ11 = this.LLJILJIL;
                    if (interfaceC1337570kuZ11 != null) {
                        interfaceC1337570kuZ11.LIZ(0, 0, 0, getScrollY());
                    }
                    scrollBy(0, -getScrollY());
                } else {
                    InterfaceC1337570kuZ interfaceC1337570kuZ12 = this.LLJILJIL;
                    if (interfaceC1337570kuZ12 != null) {
                        interfaceC1337570kuZ12.LIZ(0, getScrollY() + i2, 0, getScrollY());
                    }
                    scrollBy(0, i2);
                }
                iArr[1] = i2;
                this.LLIZLLLIL = getScrollY();
                return;
            }
            return;
        }
        if (!view.canScrollVertically(-1) && i2 < 0) {
            int iAbs2 = Math.abs(i2) + Math.abs(getScrollY());
            int i8 = this.LLILZIL;
            if (iAbs2 > i8) {
                InterfaceC1337570kuZ interfaceC1337570kuZ13 = this.LLJILJIL;
                if (interfaceC1337570kuZ13 != null) {
                    interfaceC1337570kuZ13.LIZ(0, -i8, 0, getScrollY());
                }
                scrollTo(getScrollX(), -this.LLILZIL);
            } else {
                requestDisallowInterceptTouchEvent(true);
                InterfaceC1337570kuZ interfaceC1337570kuZ14 = this.LLJILJIL;
                if (interfaceC1337570kuZ14 != null) {
                    interfaceC1337570kuZ14.LIZ(0, getScrollY() + i2, 0, getScrollY());
                }
                scrollBy(0, i2);
            }
            iArr[1] = i2;
            this.LLIZLLLIL = getScrollY();
            return;
        }
        if (i2 > 0 && getScrollY() < 0) {
            if (i2 > Math.abs(getScrollY())) {
                InterfaceC1337570kuZ interfaceC1337570kuZ15 = this.LLJILJIL;
                if (interfaceC1337570kuZ15 != null) {
                    interfaceC1337570kuZ15.LIZ(0, 0, 0, -getScrollY());
                }
                scrollBy(0, -getScrollY());
            } else {
                InterfaceC1337570kuZ interfaceC1337570kuZ16 = this.LLJILJIL;
                if (interfaceC1337570kuZ16 != null) {
                    interfaceC1337570kuZ16.LIZ(0, getScrollY() + i2, 0, getScrollY());
                }
                scrollBy(0, i2);
            }
            iArr[1] = i2;
            this.LLIZLLLIL = getScrollY();
        }
    }

    @Override // X.InterfaceC1318370kPb
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 != 1) {
            return;
        }
        int i6 = C1337530kuV.LIZ[this.LL.ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 == 4) {
                        if (this.LLILZLL && Math.abs(getScrollX()) == this.LLILZIL) {
                            LIZ(this, -getScrollX(), 0);
                            this.LLILZLL = false;
                            return;
                        } else {
                            if (i <= 0 || i3 <= 0) {
                                return;
                            }
                            LIZ(this, this.LLILZIL, 0);
                            this.LLILZLL = true;
                            return;
                        }
                    }
                    return;
                }
                if (this.LLILZLL && Math.abs(getScrollX()) == this.LLILZIL) {
                    LIZ(this, -getScrollX(), 0);
                    this.LLILZLL = false;
                    return;
                } else {
                    if (i >= 0 || i3 >= 0) {
                        return;
                    }
                    LIZ(this, -this.LLILZIL, 0);
                    this.LLILZLL = true;
                    return;
                }
            }
            if (this.LLILZLL && getScrollY() == this.LLILZIL) {
                LIZ(this, 0, -getScrollY());
                this.LLILZLL = false;
                return;
            } else {
                if (i2 <= 0 || i4 <= 0) {
                    return;
                }
                LIZ(this, 0, this.LLILZIL);
                this.LLILZLL = true;
                return;
            }
        }
        if (this.LLILZLL && getScrollY() == this.LLILZIL) {
            LIZ(this, 0, -getScrollY());
            this.LLILZLL = false;
        } else {
            if (i2 <= 0 || i4 <= 0) {
                return;
            }
            LIZ(this, 0, -this.LLILZIL);
            this.LLILZLL = true;
        }
    }
}
