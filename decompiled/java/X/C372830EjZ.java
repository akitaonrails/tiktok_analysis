package X;

import Y.ALAdapterS0S0210000_5;
import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EjZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C372830EjZ extends RelativeLayout {
    public static final int LLJJJJ = C341940Daq.LIZ(52.0d);
    public static final int LLJJJJJIL = C341940Daq.LIZ(40.0d);
    public static final int LLJJJJLIIL = C341940Daq.LIZ(166.0d);
    public static final int LLJJL;
    public static final int LLJJLIIIJLLLLLLLZ;
    public final C372580EjA LL;
    public final boolean LLILLJJLI;
    public final float LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final List<Integer> LLILZLL;
    public final List<Integer> LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public int LLJIJIL;
    public InterfaceC372920Eji LLJILJIL;
    public InterfaceC372920Eji LLJILJILJ;
    public InterfaceC372910Ejh LLJILLL;
    public InterfaceC372900Ejg LLJJ;
    public boolean LLJJI;
    public final List<C0EVX> LLJJIII;
    public final View LLJJIJI;
    public final View LLJJIJIIJIL;
    public final View LLJJIJIL;
    public C21586019dq LLJJJ;
    public final FrameLayout LLJJJIL;

    static {
        int iLIZ = C341940Daq.LIZ(20.0d);
        LLJJL = iLIZ;
        LLJJLIIIJLLLLLLLZ = iLIZ / 2;
    }

    public final void LJIIIZ() {
        int iIntValue = ((Number) LIZLLL(this.LLIZLLLIL, this.LLILZLL).getSecond()).intValue();
        int iIndexOf = ((ArrayList) this.LLILZLL).indexOf(Integer.valueOf(iIntValue));
        if (iIndexOf >= 0) {
            this.LLJI = iIndexOf;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateStateWithHeightsortedIndex: ");
            sbLIZ.append(this.LLJI);
            sbLIZ.append(" height: ");
            sbLIZ.append(this.LLIZLLLIL);
            C201955140j.LIZIZ("TTKCreationCanvasView", C2188811AlT.LIZIZ(sbLIZ));
        }
        int iIndexOf2 = ((ArrayList) this.LLIZ).indexOf(Integer.valueOf(iIntValue));
        if (iIndexOf2 > 0) {
            this.LLJ = iIndexOf2;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("updateStateWithHeightcontrolIndex: ");
            sbLIZ2.append(this.LLJ);
            sbLIZ2.append(" height: ");
            sbLIZ2.append(this.LLIZLLLIL);
            C201955140j.LIZIZ("TTKCreationCanvasView", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public final int getNavBarHeight() {
        int i = C372860Ejc.LIZ[this.LL.LIZIZ.ordinal()];
        if (i == 1 || i == 2) {
            return 0;
        }
        if (i == 3 || i == 4) {
            return LLJJJJ;
        }
        if (i == 5) {
            return this.LLILLJJLI ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)) : LLJJJJJIL;
        }
        throw new C1954807lC();
    }

    private final int getMinControlHeight() {
        return LLJJJJLIIL;
    }

    public final C372580EjA getCanvasConfig() {
        return this.LL;
    }

    public final int getControlAreaHeight() {
        return this.LLIZLLLIL;
    }

    public final View getControlLayout() {
        return this.LLJJIJIL;
    }

    public final int getCurSortedControlHeightIndex() {
        return this.LLJI;
    }

    public final boolean getDraggable() {
        return this.LLJJI;
    }

    public final int getGrabberExpandHeight() {
        return this.LLILZIL;
    }

    public final int getGrabberHeight() {
        return this.LLILZ;
    }

    public final FrameLayout getGrabberView() {
        return this.LLJJJIL;
    }

    public final View getNavBarLayout() {
        return this.LLJJIJI;
    }

    public final View getPreviewLayout() {
        return this.LLJJIJIIJIL;
    }

    public C372830EjZ(C372580EjA c372580EjA) {
        int iLIZ;
        int iLIZ2;
        int height;
        int iIntValue;
        super(c372580EjA.LIZ, null, 0);
        this.LL = c372580EjA;
        this.LLILLJJLI = c372580EjA.LJIIIIZZ;
        this.LLILLL = 0.75f;
        EnumC372730EjP enumC372730EjP = c372580EjA.LIZJ;
        EnumC372730EjP enumC372730EjP2 = EnumC372730EjP.NO_VARIABLE;
        if (enumC372730EjP == enumC372730EjP2) {
            iLIZ = 0;
        } else {
            iLIZ = C341940Daq.LIZ(14.0d);
        }
        this.LLILZ = iLIZ;
        if (c372580EjA.LIZJ == enumC372730EjP2) {
            iLIZ2 = 0;
        } else {
            iLIZ2 = C341940Daq.LIZ(15.0d);
        }
        this.LLILZIL = iLIZ2;
        this.LLILZLL = new ArrayList();
        this.LLIZ = new ArrayList();
        this.LLIZLLLIL = -1;
        this.LLJJI = true;
        this.LLJJIII = new ArrayList();
        if (!c372580EjA.LIZLLL.isEmpty()) {
            if (!c372580EjA.LJII) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e1, c372580EjA.LIZ);
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = 0;
                }
                setBackgroundColor(iIntValue);
            }
            if (c372580EjA.LIZIZ.isExist$tools_creative_ui_release() && !c372580EjA.LIZIZ.isOverlayAtTop$tools_creative_ui_release()) {
                this.LLJJIJI = LIZJ(c372580EjA.LIZIZ);
            }
            View frameLayout = c372580EjA.LJI;
            frameLayout = frameLayout == null ? new FrameLayout(getContext()) : frameLayout;
            C372880Eje c372880Eje = (C372880Eje) C13LP.LJJJLL(c372580EjA.LIZLLL);
            if (c372880Eje != null) {
                height = c372880Eje.LIZ;
                if (height < 0) {
                    height = (int) (c372880Eje.LIZIZ * getHeight());
                }
            } else {
                height = 0;
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, height);
            layoutParams.addRule(12);
            if (c372580EjA.LIZIZ.isInBottom$tools_creative_ui_release()) {
                layoutParams.bottomMargin = getNavBarHeight();
            }
            if (frameLayout.getId() == -1) {
                frameLayout.setId(View.generateViewId());
            }
            addView(frameLayout, layoutParams);
            this.LLJJIJIL = frameLayout;
            if (c372580EjA.LIZJ == EnumC372730EjP.VARIABLE) {
                FrameLayout frameLayout2 = (FrameLayout) C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.ccu, this, false);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, iLIZ + (iLIZ2 * 2));
                ((FrameLayout.LayoutParams) frameLayout2.findViewById(R.id.j4_).getLayoutParams()).gravity = 17;
                layoutParams2.addRule(2, frameLayout.getId());
                int i = -iLIZ2;
                layoutParams2.bottomMargin = i;
                layoutParams2.topMargin = i;
                frameLayout2.setId(View.generateViewId());
                addView(frameLayout2, layoutParams2);
                this.LLJJJIL = frameLayout2;
            }
            View frameLayout3 = c372580EjA.LJFF;
            frameLayout3 = frameLayout3 == null ? new FrameLayout(getContext()) : frameLayout3;
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
            EnumC372850Ejb enumC372850Ejb = c372580EjA.LIZIZ;
            if (enumC372850Ejb == EnumC372850Ejb.NAV_BAR_STYLE_V2) {
                layoutParams3.addRule(10);
                C426750GoL.LJIIJ(layoutParams3, frameLayout3.getContext(), null, Integer.valueOf(getNavBarHeight()), null, null, 58);
            } else if (enumC372850Ejb.isInTop$tools_creative_ui_release()) {
                View view = this.LLJJIJI;
                if (view != null) {
                    layoutParams3.addRule(3, view.getId());
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else if (c372580EjA.LIZIZ.isOverlayAtTop$tools_creative_ui_release()) {
                layoutParams3.addRule(10);
            }
            if (c372580EjA.LIZJ.needGrabber$tools_creative_ui_release()) {
                FrameLayout frameLayout4 = this.LLJJJIL;
                if (frameLayout4 != null) {
                    layoutParams3.addRule(2, frameLayout4.getId());
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                layoutParams3.addRule(2, frameLayout.getId());
            }
            addView(frameLayout3, layoutParams3);
            this.LLJJIJIIJIL = frameLayout3;
            if (c372580EjA.LIZJ.needGrabber$tools_creative_ui_release()) {
                this.LLJJJ = C21586019dq.LJIIJ(this, new AbstractC21586119dr() { // from class: X.0Eja
                    @Override // X.AbstractC21586119dr
                    public final int getViewVerticalDragRange(View view2) {
                        return this.LIZ.getMeasuredHeight() - view2.getMeasuredHeight();
                    }

                    @Override // X.AbstractC21586119dr
                    public final void onViewDragStateChanged(int i2) {
                        super.onViewDragStateChanged(i2);
                        if (i2 == 1) {
                            C372830EjZ c372830EjZ = this.LIZ;
                            c372830EjZ.LLJIJIL = c372830EjZ.LLIZLLLIL;
                            InterfaceC372900Ejg interfaceC372900Ejg = c372830EjZ.LLJJ;
                            if (interfaceC372900Ejg != null) {
                                interfaceC372900Ejg.LIZ(1, true);
                            }
                        }
                    }

                    @Override // X.AbstractC21586119dr
                    public final boolean tryCaptureView(View view2, int i2) {
                        C372830EjZ c372830EjZ = this.LIZ;
                        if (!c372830EjZ.LLJJI) {
                            return false;
                        }
                        return Intrinsics.LJFF(view2, c372830EjZ.getGrabberView());
                    }

                    @Override // X.AbstractC21586119dr
                    public final int clampViewPositionVertical(View view2, int i2, int i3) {
                        int height2 = ((this.LIZ.getHeight() - ((Number) C13LP.LJJLIIIJJI(this.LIZ.LLILZLL)).intValue()) - this.LIZ.getGrabberHeight()) - this.LIZ.getGrabberExpandHeight();
                        int i4 = C372830EjZ.LLJJJJ;
                        int i5 = C372830EjZ.LLJJL;
                        int navBarHeight = height2 - i5;
                        int height3 = (((this.LIZ.getHeight() - ((Number) C13LP.LJJJJZI(this.LIZ.LLILZLL)).intValue()) - this.LIZ.getGrabberHeight()) - this.LIZ.getGrabberExpandHeight()) + i5;
                        if (this.LIZ.LL.LIZIZ.isInBottom$tools_creative_ui_release()) {
                            navBarHeight -= this.LIZ.getNavBarHeight();
                            height3 -= this.LIZ.getNavBarHeight();
                        }
                        return Math.min(height3, Math.max(navBarHeight, i2));
                    }

                    @Override // X.AbstractC21586119dr
                    public final void onViewReleased(View view2, float f, float f2) {
                        super.onViewReleased(view2, f, f2);
                        if (!Intrinsics.LJFF(view2, this.LIZ.getGrabberView())) {
                            return;
                        }
                        C372830EjZ c372830EjZ = this.LIZ;
                        c372830EjZ.LJFF(c372830EjZ.LLJJ);
                    }

                    @Override // X.AbstractC21586119dr
                    public final void onViewPositionChanged(View view2, int i2, int i3, int i4, int i5) {
                        super.onViewPositionChanged(view2, i2, i3, i4, i5);
                        this.LIZ.LJ(i3, i5);
                    }
                });
            }
            if (c372580EjA.LIZIZ.isOverlayAtTop$tools_creative_ui_release()) {
                this.LLJJIJI = LIZJ(c372580EjA.LIZIZ);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("The controlAreaHeight of TTKCreationCanvasViewConfig is empty");
    }

    public static RelativeLayout.LayoutParams LIZ(View view) {
        return (RelativeLayout.LayoutParams) view.getLayoutParams();
    }

    public final void LIZIZ(int i) {
        RelativeLayout.LayoutParams layoutParamsLIZ = LIZ(this.LLJJIJIL);
        layoutParamsLIZ.height = ((getHeight() - i) - this.LLILZ) - this.LLILZIL;
        if (this.LL.LIZIZ.isInBottom$tools_creative_ui_release()) {
            layoutParamsLIZ.height -= getNavBarHeight();
        }
        RelativeLayout.LayoutParams layoutParamsLIZ2 = LIZ(this.LLJJIJIIJIL);
        layoutParamsLIZ2.height = i + this.LLILZIL;
        if (this.LL.LIZIZ.isInTop$tools_creative_ui_release()) {
            layoutParamsLIZ2.height -= getNavBarHeight();
        }
        requestLayout();
        InterfaceC372920Eji interfaceC372920Eji = this.LLJILJIL;
        if (interfaceC372920Eji != null) {
            interfaceC372920Eji.LIZ(LIZ(this.LLJJIJIIJIL).height);
        }
        InterfaceC372920Eji interfaceC372920Eji2 = this.LLJILJILJ;
        if (interfaceC372920Eji2 != null) {
            interfaceC372920Eji2.LIZ(LIZ(this.LLJJIJIL).height);
        }
    }

    public final View LIZJ(EnumC372850Ejb enumC372850Ejb) {
        int iLIZIZ;
        if (!enumC372850Ejb.isOverlayAtTop$tools_creative_ui_release() && !enumC372850Ejb.isNewStyle$tools_creative_ui_release()) {
            iLIZIZ = LLJJJJ;
        } else if (this.LLILLJJLI) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
        } else {
            iLIZIZ = LLJJJJJIL;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, iLIZIZ);
        View frameLayout = this.LL.LJ;
        if (frameLayout == null) {
            frameLayout = new FrameLayout(getContext());
        }
        if (!enumC372850Ejb.isInTop$tools_creative_ui_release() && !enumC372850Ejb.isOverlayAtTop$tools_creative_ui_release()) {
            if (enumC372850Ejb.isInBottom$tools_creative_ui_release()) {
                layoutParams.addRule(12);
                addView(frameLayout, layoutParams);
            }
        } else {
            addView(frameLayout, layoutParams);
        }
        if (frameLayout.getId() == -1) {
            frameLayout.setId(View.generateViewId());
        }
        return frameLayout;
    }

    public final void LJFF(InterfaceC372900Ejg interfaceC372900Ejg) {
        int height;
        int height2;
        int iIntValue = ((Number) LIZLLL(this.LLJJIJIL.getHeight(), this.LLILZLL).getSecond()).intValue();
        int iIndexOf = ((ArrayList) this.LLIZ).indexOf(Integer.valueOf(iIntValue));
        if (iIndexOf > 0) {
            this.LLJ = iIndexOf;
        }
        this.LLIZLLLIL = iIntValue;
        this.LLJI = ((ArrayList) this.LLILZLL).indexOf(Integer.valueOf(iIntValue));
        if (this.LL.LIZIZ.isInTop$tools_creative_ui_release()) {
            height = getNavBarHeight() + this.LLJJIJIIJIL.getHeight();
        } else {
            height = this.LLJJIJIIJIL.getHeight();
        }
        int i = height - this.LLILZIL;
        if (this.LL.LIZIZ.isInBottom$tools_creative_ui_release()) {
            height2 = getHeight() - getNavBarHeight();
        } else {
            height2 = getHeight();
        }
        int i2 = ((height2 - iIntValue) - this.LLILZ) - this.LLILZIL;
        C385220F8m c385220F8m = C385220F8m.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("targetControlHeight ");
        sbLIZ.append(iIntValue);
        sbLIZ.append(" start ");
        sbLIZ.append(i);
        sbLIZ.append(" end ");
        sbLIZ.append(i2);
        sbLIZ.append(' ');
        C201955140j.LJIILJJIL(c385220F8m, C2188811AlT.LIZIZ(sbLIZ));
        LJI(i, i2, true, interfaceC372900Ejg, true, null);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            if (!this.LLJJIII.isEmpty()) {
                Iterator<C0EVX> it2 = this.LLJJIII.iterator();
                while (it2.hasNext()) {
                    it2.next().onDown(motionEvent);
                }
            }
            C21586019dq c21586019dq = this.LLJJJ;
            if (c21586019dq != null) {
                return c21586019dq.LJIJJ(motionEvent);
            }
            return super.onInterceptTouchEvent(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C21586019dq c21586019dq = this.LLJJJ;
        if (c21586019dq == null) {
            return super.onTouchEvent(motionEvent);
        }
        c21586019dq.LJIILIIL(motionEvent);
        return true;
    }

    public final void setControlHeightChangeListener(InterfaceC372920Eji interfaceC372920Eji) {
        this.LLJILJILJ = interfaceC372920Eji;
    }

    public final void setDraggable(boolean z) {
        this.LLJJI = z;
    }

    public final void setGrabberLevelChangeListener(InterfaceC372910Ejh interfaceC372910Ejh) {
        this.LLJILLL = interfaceC372910Ejh;
    }

    public final void setGrabberViewStateChangeListener(InterfaceC372900Ejg interfaceC372900Ejg) {
        this.LLJJ = interfaceC372900Ejg;
    }

    public final void setPreviewHeightChangeListener(InterfaceC372920Eji interfaceC372920Eji) {
        this.LLJILJIL = interfaceC372920Eji;
    }

    public static Pair LIZLLL(int i, List list) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return new Pair(-1, Integer.valueOf(i));
        }
        int i2 = 0;
        for (Object obj : arrayList) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                int iIntValue = ((Number) obj).intValue();
                if (i3 >= arrayList.size()) {
                    return new Pair(Integer.valueOf(i2), Integer.valueOf(iIntValue));
                }
                if (Math.abs(i - iIntValue) <= Math.abs(i - ((Number) ListProtector.get(arrayList, i3)).intValue())) {
                    return new Pair(Integer.valueOf(i2), Integer.valueOf(iIntValue));
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return new Pair(Integer.valueOf(arrayList.size() - 1), C13LP.LJJLIIIJJI(arrayList));
    }

    public final void LJ(int i, int i2) {
        boolean z;
        LIZIZ(i);
        int i3 = LIZ(this.LLJJIJIL).height;
        Pair pairLIZLLL = LIZLLL(i3, this.LLILZLL);
        int iIntValue = ((Number) pairLIZLLL.getFirst()).intValue();
        int iIntValue2 = ((Number) pairLIZLLL.getSecond()).intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("controlHeight ");
        sbLIZ.append(i3);
        sbLIZ.append(" lastClosestControlHeight ");
        sbLIZ.append(this.LLJIJIL);
        sbLIZ.append(" curClosestHeight ");
        sbLIZ.append(iIntValue2);
        sbLIZ.append(" vibrator ");
        if (iIntValue2 != this.LLJIJIL) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        if (iIntValue2 != this.LLJIJIL) {
            this.LLJIJIL = iIntValue2;
            new C0ZDN(this.LL.LIZ).LIZ(0);
            InterfaceC372910Ejh interfaceC372910Ejh = this.LLJILLL;
            if (interfaceC372910Ejh != null) {
                interfaceC372910Ejh.LIZ(((ArrayList) this.LLILZLL).size(), iIntValue);
            }
        }
        if (((ArrayList) this.LLILZLL).isEmpty()) {
            return;
        }
        int i4 = i3 - i2;
        int iIntValue3 = ((Number) C13LP.LJJJJZI(this.LLILZLL)).intValue();
        int i5 = LLJJLIIIJLLLLLLLZ;
        int i6 = iIntValue3 - i5;
        if (i4 <= i6 && i6 <= i3 && i2 > 0) {
            new C0ZDN(this.LL.LIZ).LIZ(0);
            InterfaceC372910Ejh interfaceC372910Ejh2 = this.LLJILLL;
            if (interfaceC372910Ejh2 != null) {
                interfaceC372910Ejh2.LIZ(((ArrayList) this.LLILZLL).size(), iIntValue);
                return;
            }
            return;
        }
        int i7 = i3 + i2;
        int iIntValue4 = ((Number) C13LP.LJJLIIIJJI(this.LLILZLL)).intValue() + i5;
        if (i7 > iIntValue4 || iIntValue4 > i3 || i2 >= 0) {
            return;
        }
        new C0ZDN(this.LL.LIZ).LIZ(0);
        InterfaceC372910Ejh interfaceC372910Ejh3 = this.LLJILLL;
        if (interfaceC372910Ejh3 == null) {
            return;
        }
        interfaceC372910Ejh3.LIZ(((ArrayList) this.LLILZLL).size(), iIntValue);
    }

    public final void LJII(int i, InterfaceC372900Ejg interfaceC372900Ejg) {
        int height;
        int height2;
        if (i >= 0 && i < ((ArrayList) this.LLILZLL).size()) {
            int iIntValue = ((Number) ListProtector.get(this.LLILZLL, i)).intValue();
            int iIndexOf = ((ArrayList) this.LLIZ).indexOf(Integer.valueOf(iIntValue));
            if (iIndexOf > 0) {
                this.LLJ = iIndexOf;
            }
            this.LLIZLLLIL = iIntValue;
            this.LLJI = i;
            if (this.LL.LIZIZ.isInTop$tools_creative_ui_release()) {
                height = getNavBarHeight() + this.LLJJIJIIJIL.getHeight();
            } else {
                height = this.LLJJIJIIJIL.getHeight();
            }
            int i2 = height - this.LLILZIL;
            if (this.LL.LIZIZ.isInBottom$tools_creative_ui_release()) {
                height2 = getHeight() - getNavBarHeight();
            } else {
                height2 = getHeight();
            }
            LJI(i2, ((height2 - iIntValue) - this.LLILZ) - this.LLILZIL, false, interfaceC372900Ejg, true, null);
        }
    }

    public final void LJIIIIZZ(int i, boolean z, Function0<Unit> function0) {
        int height;
        int height2;
        this.LLIZLLLIL = i;
        if (this.LL.LIZIZ.isInTop$tools_creative_ui_release()) {
            height = getNavBarHeight() + this.LLJJIJIIJIL.getHeight();
        } else {
            height = this.LLJJIJIIJIL.getHeight();
        }
        int i2 = height - this.LLILZIL;
        if (this.LL.LIZIZ.isInBottom$tools_creative_ui_release()) {
            height2 = getHeight() - getNavBarHeight();
        } else {
            height2 = getHeight();
        }
        LJI(i2, ((height2 - i) - this.LLILZ) - this.LLILZIL, false, null, z, function0);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i2 != 0) {
            ((ArrayList) this.LLILZLL).clear();
            C372880Eje c372880Eje = (C372880Eje) C13LP.LJJJLZIJ(this.LLJ, this.LL.LIZLLL);
            if (c372880Eje != null) {
                int i5 = c372880Eje.LIZ;
                if (i5 < 0) {
                    i5 = (int) (i2 * c372880Eje.LIZIZ);
                }
                this.LLIZLLLIL = i5;
            }
            for (C372880Eje c372880Eje2 : this.LL.LIZLLL) {
                int i6 = c372880Eje2.LIZ;
                if (i6 < 0) {
                    int i7 = (int) (i2 * c372880Eje2.LIZIZ);
                    ((ArrayList) this.LLIZ).add(Integer.valueOf(i7));
                    int minControlHeight = getMinControlHeight();
                    if (i7 <= ((int) (getHeight() * this.LLILLL)) && minControlHeight <= i7) {
                        ((ArrayList) this.LLILZLL).add(Integer.valueOf(i7));
                    }
                } else {
                    ((ArrayList) this.LLIZ).add(Integer.valueOf(i6));
                    int i8 = c372880Eje2.LIZ;
                    int minControlHeight2 = getMinControlHeight();
                    if (i8 <= ((int) (getHeight() * this.LLILLL)) && minControlHeight2 <= i8) {
                        ((ArrayList) this.LLILZLL).add(Integer.valueOf(c372880Eje2.LIZ));
                    }
                }
            }
            C08XD.LJIL(this.LLILZLL);
            C372880Eje c372880Eje3 = (C372880Eje) C13LP.LJJJLZIJ(this.LLJ, this.LL.LIZLLL);
            if (c372880Eje3 != null && c372880Eje3.LIZ < 0) {
                RelativeLayout.LayoutParams layoutParamsLIZ = LIZ(this.LLJJIJIL);
                int i9 = this.LLIZLLLIL;
                layoutParamsLIZ.height = i9;
                InterfaceC372920Eji interfaceC372920Eji = this.LLJILJILJ;
                if (interfaceC372920Eji != null) {
                    interfaceC372920Eji.LIZ(i9);
                }
                requestLayout();
            }
            int navBarHeight = i2 - this.LLIZLLLIL;
            if (this.LL.LIZIZ.isInTop$tools_creative_ui_release() || this.LL.LIZIZ.isInBottom$tools_creative_ui_release()) {
                navBarHeight -= getNavBarHeight();
            }
            if (this.LL.LIZJ.needGrabber$tools_creative_ui_release()) {
                navBarHeight -= this.LLILZ;
            }
            InterfaceC372920Eji interfaceC372920Eji2 = this.LLJILJIL;
            if (interfaceC372920Eji2 != null) {
                interfaceC372920Eji2.LIZ(navBarHeight);
            }
        }
    }

    public final void LJI(final int i, final int i2, boolean z, InterfaceC372900Ejg interfaceC372900Ejg, boolean z2, Function0<Unit> function0) {
        if (interfaceC372900Ejg != null) {
            interfaceC372900Ejg.LIZ(2, true);
        }
        if (!z2) {
            LIZIZ(i2);
            return;
        }
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(C1619980sG4.LIZLLL());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0Ejd
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.LL.LIZIZ((int) (i + ((i2 - r1) * valueAnimatorOfFloat.getAnimatedFraction())));
            }
        });
        valueAnimatorOfFloat.addListener(new ALAdapterS0S0210000_5(interfaceC372900Ejg, z, function0, 0));
        valueAnimatorOfFloat.start();
    }
}
