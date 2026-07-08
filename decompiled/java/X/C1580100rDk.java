package X;

import Y.ACListenerS158S0100000_24;
import Y.ACListenerS57S0101000_24;
import Y.AUListenerS262S0100000_12;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS152S0400000_24;
import kotlin.jvm.internal.AwS268S0300000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rDk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1580100rDk implements InterfaceC1571080qzC {
    public static final /* synthetic */ int LJIJJLI = 0;
    public final FrameLayout LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public boolean LJ;
    public InterfaceC1570900qyu LJFF;
    public InterfaceC1570900qyu LJI;
    public List<? extends InterfaceC1570900qyu> LJII;
    public InterfaceC1571160qzK LJIIIIZZ;
    public View LJIIIZ;
    public View LJIIJ;
    public C709070Rrd LJIIJJI;
    public C709070Rrd LJIIL;
    public final List<InterfaceC1571310qzZ> LJIILIIL;
    public final C0S4J LJIILJJIL;
    public Animator LJIILL;
    public Animator LJIILLIIL;
    public ArrayList<String> LJIIZILJ;
    public List<? extends InterfaceC1570900qyu> LJIJ;
    public ArrayList<String> LJIJI;
    public List<? extends InterfaceC1570900qyu> LJIJJ;

    @Override // X.InterfaceC1571080qzC
    public final void LJIIIZ() {
        this.LJFF = null;
        this.LJI = null;
        this.LJII = null;
        View view = this.LJIIIZ;
        if (view != null) {
            C786410Ut5.LJJJZ(view, this.LIZ);
        }
        View view2 = this.LJIIJ;
        if (view2 != null) {
            C786410Ut5.LJJJZ(view2, this.LIZ);
        }
        C709070Rrd c709070Rrd = this.LJIIJJI;
        if (c709070Rrd != null) {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c709070Rrd, null);
            c709070Rrd.removeAllViews();
            C786410Ut5.LJJJZ(c709070Rrd, this.LIZ);
        }
        C709070Rrd c709070Rrd2 = this.LJIIL;
        if (c709070Rrd2 != null) {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c709070Rrd2, null);
            c709070Rrd2.removeAllViews();
            C786410Ut5.LJJJZ(c709070Rrd2, this.LIZ);
        }
        this.LJ = false;
        this.LJIIIZ = null;
        this.LJIIJ = null;
        this.LJIIJJI = null;
        this.LJIIL = null;
        this.LJIJI.clear();
        this.LJIIZILJ.clear();
    }

    @Override // X.InterfaceC1571080qzC
    public final List<String> LIZ() {
        ArrayList<String> arrayList = this.LJIJI;
        ArrayList arrayList2 = new ArrayList();
        for (String str : arrayList) {
            Pair pairLJIIZILJ = LJIIZILJ(pr(), str);
            if (pairLJIIZILJ != null) {
                View view = (View) pairLJIIZILJ.getFirst();
                View view2 = (View) pairLJIIZILJ.getSecond();
                if ((view != null && LJIJI(view)) || (view2 != null && LJIJI(view2))) {
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
            }
        }
        return arrayList2;
    }

    @Override // X.InterfaceC1571080qzC
    public final List<String> LJ() {
        ArrayList<String> arrayList = this.LJIIZILJ;
        ArrayList arrayList2 = new ArrayList();
        for (String str : arrayList) {
            Pair pairLJIIZILJ = LJIIZILJ(Yp(), str);
            if (pairLJIIZILJ != null) {
                View view = (View) pairLJIIZILJ.getFirst();
                View view2 = (View) pairLJIIZILJ.getSecond();
                if ((view != null && LJIJI(view)) || (view2 != null && LJIJI(view2))) {
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
            }
        }
        return arrayList2;
    }

    @Override // X.InterfaceC1571080qzC
    public final void LJIIIIZZ() {
        List<? extends InterfaceC1570900qyu> list;
        C0CXE.LIZ.getClass();
        if (!C0CXE.LIZ()) {
            C0CXC.LIZ.getClass();
            if (!C0CXC.LIZIZ() && ((list = this.LJII) == null || list.isEmpty())) {
                if (this.LJFF != null) {
                    LJIL(this.LJFF);
                    return;
                }
                return;
            }
        }
        LJJ(this.LJII);
    }

    @Override // X.InterfaceC1571080qzC
    public final View Yp() {
        List<? extends InterfaceC1570900qyu> list;
        if (C1581510rG1.LIZ()) {
            View view = this.LJIIIZ;
            return view == null ? this.LJIIL : view;
        }
        C0CXE.LIZ.getClass();
        if (!C0CXE.LIZ()) {
            C0CXC.LIZ.getClass();
            if (!C0CXC.LIZIZ() && ((list = this.LJII) == null || list.isEmpty())) {
                return this.LJIIIZ;
            }
        }
        return this.LJIIL;
    }

    @Override // X.InterfaceC1571080qzC
    public final View pr() {
        List<? extends InterfaceC1570900qyu> list;
        if (C1581510rG1.LIZ()) {
            View view = this.LJIIJ;
            return view == null ? this.LJIIJJI : view;
        }
        C0CXE.LIZ.getClass();
        if (!C0CXE.LIZ()) {
            C0CXC.LIZ.getClass();
            if (!C0CXC.LIZIZ() && ((list = this.LJII) == null || list.isEmpty())) {
                return this.LJIIJ;
            }
        }
        return this.LJIIJJI;
    }

    @Override // X.InterfaceC1571090qzD
    public final C709070Rrd LIZJ() {
        return this.LJIIL;
    }

    @Override // X.InterfaceC1571080qzC
    public final List<String> LJIIJ() {
        return this.LJIJI;
    }

    @Override // X.InterfaceC1571090qzD
    public final C709070Rrd LJIILJJIL() {
        return this.LJIIJJI;
    }

    @Override // X.InterfaceC1571080qzC
    public final List<String> LJIILLIIL() {
        return this.LJIIZILJ;
    }

    public C1580100rDk(FrameLayout frameLayout) {
        int iLIZIZ;
        int iLIZIZ2;
        this.LIZ = frameLayout;
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        if (c19252910Tv.LIZLLL().LJIJI().LJJL().LJJII()) {
            iLIZIZ = c19252910Tv.LIZLLL().LJIJI().LJJL().LJJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)), false);
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
        }
        this.LIZIZ = iLIZIZ;
        if (c19252910Tv.LIZLLL().LJIJI().LJJL().LJJII()) {
            iLIZIZ2 = c19252910Tv.LIZLLL().LJIJI().LJJL().LJJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)), true);
        } else {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        }
        this.LIZJ = iLIZIZ2;
        this.LIZLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        this.LJIILIIL = new ArrayList();
        this.LJIILJJIL = new C0S4J("toolbar");
        this.LJIIZILJ = new ArrayList<>();
        this.LJIJ = new ArrayList();
        this.LJIJI = new ArrayList<>();
        this.LJIJJ = new ArrayList();
    }

    public static String LJIJ(View view) {
        Object tag;
        Object tag2;
        if (C1581510rG1.LIZIZ()) {
            if (view != null) {
                tag2 = view.getTag(R.id.jqu);
            } else {
                tag2 = null;
            }
            if (!(tag2 instanceof String)) {
                return null;
            }
            return (String) tag2;
        }
        if (view != null) {
            tag = view.getTag();
        } else {
            tag = null;
        }
        if (!(tag instanceof String)) {
            return null;
        }
        return (String) tag;
    }

    public static boolean LJIJI(View view) {
        if (view.getVisibility() == 0 && view.getAlpha() != 0.0f) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1571090qzD
    public final void A1(String str) {
        View view;
        ViewGroup viewGroupLJIIL = LJIIL(str);
        if (viewGroupLJIIL == null || (view = viewGroupLJIIL.findViewById(R.id.jqs)) == null) {
            view = new View(this.LIZ.getContext());
            view.setId(R.id.jqs);
            view.setBackgroundResource(R.drawable.bug);
            C786410Ut5.LJLLLLLL(4, view);
            int i = this.LIZLLL;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
            layoutParams.gravity = 17;
            if (Intrinsics.LJFF(str, EnumC1584350rKb.MY_PROFILE.getTag())) {
                layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-12)));
                layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-8));
            } else {
                layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-9)));
                layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-9));
            }
            C786410Ut5.W5(view, layoutParams);
            if (viewGroupLJIIL != null) {
                viewGroupLJIIL.addView(view);
            }
        }
        C786410Ut5.LJLLLLLL(0, view);
    }

    @Override // X.InterfaceC1571080qzC
    public final void B5(Integer num) {
        Animator animator = this.LJIILL;
        if (animator == null || !animator.isRunning()) {
            Iterator<? extends InterfaceC1570900qyu> it2 = this.LJIJJ.iterator();
            while (it2.hasNext()) {
                it2.next().d2(num);
            }
        }
        Animator animator2 = this.LJIILLIIL;
        if (animator2 != null && animator2.isRunning()) {
            return;
        }
        Iterator<? extends InterfaceC1570900qyu> it3 = this.LJIJ.iterator();
        while (it3.hasNext()) {
            it3.next().d2(num);
        }
    }

    @Override // X.InterfaceC1571090qzD
    public final boolean Iv(String str) {
        View viewFindViewById;
        ViewGroup viewGroupLJIIL = LJIIL(str);
        if (viewGroupLJIIL == null || (viewFindViewById = viewGroupLJIIL.findViewById(R.id.jqs)) == null || viewFindViewById.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1571080qzC
    public final void LIZIZ(InterfaceC1571160qzK interfaceC1571160qzK) {
        this.LJIIIIZZ = interfaceC1571160qzK;
    }

    @Override // X.InterfaceC1571090qzD
    public final void LIZLLL(List<? extends InterfaceC1570900qyu> list) {
        this.LJII = list;
        LJJ(list);
    }

    @Override // X.InterfaceC1571080qzC
    @InterfaceC1294060jmO
    public final void LJII(InterfaceC1570900qyu interfaceC1570900qyu) {
        if (this.LJ) {
            C01GW c01gw = C1571680r0A.LIZ;
            if (C1571680r0A.LIZIZ) {
                this.LJFF = interfaceC1570900qyu;
                return;
            }
            return;
        }
        this.LJFF = LJIL(interfaceC1570900qyu);
    }

    @Override // X.InterfaceC1571080qzC
    public final void LJIIJJI(C1592810rYF c1592810rYF) {
        ((ArrayList) this.LJIILIIL).add(c1592810rYF);
    }

    @Override // X.InterfaceC1571090qzD
    public final ViewGroup LJIIL(String str) {
        Object tag;
        View childAt;
        View childAt2;
        View childAt3;
        for (ViewGroup viewGroup : C1697810uHb.LJIIJJI(this.LJIIJJI, this.LJIIL)) {
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("getIconRootViewByTag: ");
                    if (viewGroup != null && (childAt3 = viewGroup.getChildAt(i)) != null) {
                        tag = childAt3.getTag();
                    } else {
                        tag = null;
                    }
                    sbLIZ.append(tag);
                    sbLIZ.append(", ");
                    sbLIZ.append(str);
                    sbLIZ.append(' ');
                    C2188811AlT.LIZIZ(sbLIZ);
                    if (viewGroup != null) {
                        childAt = viewGroup.getChildAt(i);
                    } else {
                        childAt = null;
                    }
                    if (Intrinsics.LJFF(LJIJ(childAt), str)) {
                        if (viewGroup != null) {
                            childAt2 = viewGroup.getChildAt(i);
                        } else {
                            childAt2 = null;
                        }
                        if (!(childAt2 instanceof ViewGroup)) {
                            return null;
                        }
                        return (ViewGroup) childAt2;
                    }
                }
            }
        }
        return null;
    }

    @Override // X.InterfaceC1571090qzD
    public final void LJIILIIL(List<? extends InterfaceC1570900qyu> list) {
        if ((list == null || list.isEmpty()) && C1581510rG1.LIZIZ()) {
            return;
        }
        if (this.LJIIJJI == null) {
            C709070Rrd c709070Rrd = new C709070Rrd(this.LIZ.getContext());
            c709070Rrd.setOrientation(0);
            c709070Rrd.setClipChildren(false);
            this.LJIIJJI = c709070Rrd;
            c709070Rrd.setCustomRiskId("TAB_ICON/left_container");
        }
        if (C1581510rG1.LIZIZ()) {
            LJIJJLI(8388611, this.LJIIJJI, list);
        } else {
            LJIJJ(8388611, this.LJIIJJI, list);
        }
    }

    @Override // X.InterfaceC1571080qzC
    @InterfaceC1294060jmO
    public final void LJIILL(final InterfaceC1570900qyu interfaceC1570900qyu) {
        View viewF2;
        if (interfaceC1570900qyu == null || (viewF2 = interfaceC1570900qyu.f2(this.LIZ.getContext())) == null) {
            return;
        }
        if (!interfaceC1570900qyu.c2()) {
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0rDn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C2211631BhB.LJIJ(view, "c8203", "d0", null, null);
                    interfaceC1570900qyu.U1(view);
                    String tag = interfaceC1570900qyu.getTag();
                    if (tag == null) {
                        tag = "";
                    }
                    C1571180qzM.LIZ(8388611, tag);
                }
            }, viewF2);
            C2271391DvN.LIZ(viewF2, (C1A5L) C2271381DvM.LJJJJ.getValue());
        }
        if (viewF2.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewF2.getLayoutParams();
            layoutParams.gravity = 8388627;
            C786410Ut5.W5(viewF2, layoutParams);
        }
        if (C1581510rG1.LIZIZ()) {
            C1580120rDm c1580120rDmLIZIZ = ((InterfaceC1580140rDo) C1580110rDl.LIZ.getValue()).LIZIZ(true);
            c1580120rDmLIZIZ.LIZ(viewF2);
            C1591460rW4 c1591460rW4 = C1591460rW4.LIZ;
            int i = c1580120rDmLIZIZ.LIZ.width;
            c1591460rW4.getClass();
            C1591460rW4.LJI = i;
        }
        LJJII(viewF2, interfaceC1570900qyu.getTag());
        LJJIFFI(8388611, this.LJIIJ, viewF2, this.LIZ);
        this.LJIIJ = viewF2;
        ArrayList<String> arrayList = this.LJIJI;
        String tag = interfaceC1570900qyu.getTag();
        if (tag == null) {
            tag = "";
        }
        arrayList.add(tag);
        this.LJIJJ = Collections.singletonList(interfaceC1570900qyu);
    }

    public final InterfaceC1570900qyu LJIL(final InterfaceC1570900qyu interfaceC1570900qyu) {
        View viewF2;
        if (interfaceC1570900qyu == this.LJI) {
            return interfaceC1570900qyu;
        }
        if (interfaceC1570900qyu == null || !interfaceC1570900qyu.enabled() || (viewF2 = interfaceC1570900qyu.f2(this.LIZ.getContext())) == null) {
            return null;
        }
        this.LJ = true;
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0qzb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                interfaceC1570900qyu.U1(view);
                String tag = interfaceC1570900qyu.getTag();
                if (tag == null) {
                    tag = "";
                }
                C1571180qzM.LIZ(8388613, tag);
            }
        }, viewF2);
        C2271391DvN.LIZ(viewF2, (C1A5L) C2271381DvM.LJJJI.getValue());
        if (viewF2.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewF2.getLayoutParams();
            layoutParams.gravity = 8388629;
            C786410Ut5.W5(viewF2, layoutParams);
        }
        if (C1581510rG1.LIZIZ()) {
            C1580120rDm c1580120rDmLIZIZ = ((InterfaceC1580140rDo) C1580110rDl.LIZ.getValue()).LIZIZ(false);
            c1580120rDmLIZIZ.LIZ(viewF2);
            C1591460rW4 c1591460rW4 = C1591460rW4.LIZ;
            int i = c1580120rDmLIZIZ.LIZ.width;
            c1591460rW4.getClass();
            C1591460rW4.LJII = i;
        }
        LJJII(viewF2, interfaceC1570900qyu.getTag());
        LJJIFFI(8388613, this.LJIIIZ, viewF2, this.LIZ);
        this.LJIIIZ = viewF2;
        this.LJI = interfaceC1570900qyu;
        ArrayList<String> arrayList = this.LJIIZILJ;
        String tag = interfaceC1570900qyu.getTag();
        if (tag == null) {
            tag = "";
        }
        arrayList.add(tag);
        this.LJIJ = Collections.singletonList(interfaceC1570900qyu);
        return interfaceC1570900qyu;
    }

    public final void LJJ(List<? extends InterfaceC1570900qyu> list) {
        if (C1581510rG1.LIZ() && (list == null || list.isEmpty() || Intrinsics.LJFF(list, this.LJIJ))) {
            return;
        }
        if (this.LJIIL == null) {
            C709070Rrd c709070Rrd = new C709070Rrd(this.LIZ.getContext());
            c709070Rrd.setOrientation(0);
            c709070Rrd.setClipChildren(false);
            this.LJIIL = c709070Rrd;
            c709070Rrd.setCustomRiskId("TAB_ICON/left_container");
        }
        if (C1581510rG1.LIZIZ()) {
            LJIJJLI(8388613, this.LJIIL, list);
        } else {
            LJIJJ(8388613, this.LJIIL, list);
        }
    }

    @Override // X.InterfaceC1571090qzD
    public final boolean Tf(String str) {
        View viewFindViewById;
        ViewGroup viewGroupLJIIL = LJIIL(str);
        if (viewGroupLJIIL == null || (viewFindViewById = viewGroupLJIIL.findViewById(R.id.jqr)) == null || viewFindViewById.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1571080qzC
    public final void Uu(InterfaceC1571000qz4 interfaceC1571000qz4) {
        List<? extends InterfaceC1570900qyu> list;
        C0CXE.LIZ.getClass();
        if (!C0CXE.LIZ()) {
            C0CXC.LIZ.getClass();
            if (!C0CXC.LIZIZ() && ((list = this.LJII) == null || list.isEmpty())) {
                LJIL(interfaceC1571000qz4);
                return;
            }
        }
        if (interfaceC1571000qz4 == null) {
            return;
        }
        LJJ(C1697810uHb.LJIILJJIL(interfaceC1571000qz4));
    }

    @Override // X.InterfaceC1571090qzD
    public final void m(String str) {
        TuxTextView tuxTextView;
        ViewGroup viewGroupLJIIL = LJIIL(str);
        if (viewGroupLJIIL != null && (tuxTextView = (TuxTextView) viewGroupLJIIL.findViewById(R.id.jqr)) != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 4);
        }
    }

    @Override // X.InterfaceC1571090qzD
    public final void z2(String str) {
        View viewFindViewById;
        ViewGroup viewGroupLJIIL = LJIIL(str);
        if (viewGroupLJIIL != null && (viewFindViewById = viewGroupLJIIL.findViewById(R.id.jqs)) != null) {
            C786410Ut5.LJLLLLLL(4, viewFindViewById);
        }
    }

    public static Pair LJIIZILJ(View view, String str) {
        Object next;
        ViewGroup viewGroup;
        if (view == null) {
            return null;
        }
        if (view instanceof ViewGroup) {
            Iterator<View> it2 = new C09RD((ViewGroup) view).iterator();
            while (true) {
                C09RE c09re = (C09RE) it2;
                if (c09re.hasNext()) {
                    next = c09re.next();
                    if (Intrinsics.LJFF(str, LJIJ((View) next))) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            if (!(next instanceof ViewGroup) || (viewGroup = (ViewGroup) next) == null) {
                return null;
            }
            return new Pair(viewGroup, viewGroup.getChildAt(0));
        }
        if (!Intrinsics.LJFF(LJIJ(view), str)) {
            return null;
        }
        return new Pair(null, view);
    }

    public static void LJJII(View view, String str) {
        if (C1581510rG1.LIZIZ()) {
            view.setTag(R.id.jqu, str);
        } else {
            view.setTag(str);
        }
        C993790by5.LIZ(view, EnumC993780by4.CORNER_TAB_VIEW);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006a A[PHI: r3
      0x006a: PHI (r3v2 android.view.View) = (r3v1 android.view.View), (r3v4 android.view.View) binds: [B:27:0x0065, B:29:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e A[PHI: r3
      0x001e: PHI (r3v7 android.view.View) = (r3v6 android.view.View), (r3v9 android.view.View) binds: [B:5:0x0019, B:7:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1571090qzD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJFF(java.lang.String r7, int r8, X.C1AV2 r9) {
        /*
            r6 = this;
            android.view.View r0 = r6.pr()
            kotlin.Pair r0 = LJIIZILJ(r0, r7)
            r1 = 0
            r5 = r9
            r4 = r8
            if (r0 == 0) goto L4f
            java.lang.Object r3 = r0.getFirst()
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r0 = r0.getSecond()
            android.view.View r0 = (android.view.View) r0
            if (r3 != 0) goto L1e
            r3 = r0
            if (r0 == 0) goto L25
        L1e:
            int r0 = r3.getVisibility()
            if (r0 != r4) goto L25
            r1 = 1
        L25:
            r1 = r1 ^ 1
            if (r1 == 0) goto L49
            boolean r0 = X.C1581510rG1.LJ()
            if (r0 == 0) goto L49
            if (r3 == 0) goto L43
            if (r4 != 0) goto L44
            android.animation.ObjectAnimator r0 = X.C1593710rZh.LIZ(r3)
        L37:
            Y.AAListenerS30S0301000_24 r2 = new Y.AAListenerS30S0301000_24
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            r0.addListener(r2)
            X.C786410Ut5.Pd(r0)
        L43:
            return r1
        L44:
            android.animation.ObjectAnimator r0 = X.C1593710rZh.LIZIZ(r3)
            goto L37
        L49:
            if (r3 == 0) goto L43
            X.C2180521AVm.LIZLLL(r3, r4, r5)
            return r1
        L4f:
            android.view.View r0 = r6.Yp()
            kotlin.Pair r0 = LJIIZILJ(r0, r7)
            if (r0 == 0) goto L9b
            java.lang.Object r3 = r0.getFirst()
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r0 = r0.getSecond()
            android.view.View r0 = (android.view.View) r0
            if (r3 != 0) goto L6a
            r3 = r0
            if (r0 == 0) goto L71
        L6a:
            int r0 = r3.getVisibility()
            if (r0 != r4) goto L71
            r1 = 1
        L71:
            r1 = r1 ^ 1
            if (r1 == 0) goto L95
            boolean r0 = X.C1581510rG1.LJ()
            if (r0 == 0) goto L95
            if (r3 == 0) goto L8f
            if (r4 != 0) goto L90
            android.animation.ObjectAnimator r0 = X.C1593710rZh.LIZ(r3)
        L83:
            Y.AAListenerS30S0301000_24 r2 = new Y.AAListenerS30S0301000_24
            r7 = 1
            r2.<init>(r3, r4, r5, r6, r7)
            r0.addListener(r2)
            X.C786410Ut5.Pd(r0)
        L8f:
            return r1
        L90:
            android.animation.ObjectAnimator r0 = X.C1593710rZh.LIZIZ(r3)
            goto L83
        L95:
            if (r3 == 0) goto L8f
            X.C2180521AVm.LIZLLL(r3, r4, r5)
            return r1
        L9b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1580100rDk.LJFF(java.lang.String, int, X.1AV2):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v7, types: [T, android.view.View, android.widget.TextView, androidx.appcompat.widget.AppCompatTextView, com.bytedance.tux.input.TuxTextView] */
    @Override // X.InterfaceC1571090qzD
    public final void LJI(int i, String str, boolean z) {
        T tFindViewById;
        String strValueOf;
        int i2;
        TuxTextView tuxTextView;
        ViewGroup viewGroupLJIIL = LJIIL(str);
        C259800zU c259800zU = new C259800zU();
        if (viewGroupLJIIL != 0) {
            tFindViewById = viewGroupLJIIL.findViewById(R.id.jqr);
        } else {
            tFindViewById = 0;
        }
        c259800zU.element = tFindViewById;
        boolean z2 = true;
        if (tFindViewById == 0) {
            ?? tuxTextView2 = new TuxTextView(this.LIZ.getContext(), null, 6, 0);
            tuxTextView2.setId(R.id.jqr);
            tuxTextView2.setBackgroundResource(R.drawable.buh);
            tuxTextView2.setGravity(17);
            tuxTextView2.setMinWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15)));
            tuxTextView2.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)), 0);
            tuxTextView2.setTextColorRes(R.attr.ee);
            C786410Ut5.LLLLZLL(tuxTextView2, 4);
            tuxTextView2.setTuxFont(71);
            tuxTextView2.setLines(1);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15)));
            if (Intrinsics.LJFF(str, EnumC1584350rKb.INBOX.getTag())) {
                layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-11)));
            } else {
                layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-10)));
            }
            layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-8));
            layoutParams.gravity = 17;
            C786410Ut5.R6(tuxTextView2, layoutParams);
            c259800zU.element = tuxTextView2;
            if (viewGroupLJIIL != 0) {
                viewGroupLJIIL.addView(tuxTextView2);
            }
        }
        if (i <= 0) {
            if (viewGroupLJIIL != 0 && (tuxTextView = (TuxTextView) viewGroupLJIIL.findViewById(R.id.jqr)) != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 4);
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(str, EnumC1584350rKb.MY_PROFILE.getTag())) {
            if (i > 9) {
                if (C444960Hcc.LIZIZ()) {
                    strValueOf = "+9";
                } else {
                    strValueOf = "9+";
                }
            } else {
                strValueOf = String.valueOf(i);
            }
        } else if (i > 99) {
            if (C444960Hcc.LIZIZ()) {
                strValueOf = "+99";
            } else {
                strValueOf = "99+";
            }
        } else {
            strValueOf = String.valueOf(i);
        }
        int length = strValueOf.length();
        if (length >= 3) {
            TuxTextView tuxTextView3 = (TuxTextView) c259800zU.element;
            tuxTextView3.setTuxFont(81);
            tuxTextView3.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), 0);
        } else {
            TuxTextView tuxTextView4 = (TuxTextView) c259800zU.element;
            tuxTextView4.setTuxFont(71);
            if (length <= 1) {
                i2 = 4;
            } else {
                i2 = 5;
            }
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i2));
            tuxTextView4.setPadding(iLIZIZ, 0, iLIZIZ, 0);
        }
        if (!z || ((View) c259800zU.element).getVisibility() == 0) {
            z2 = false;
        }
        ((TextView) c259800zU.element).setText(strValueOf);
        C786410Ut5.LLLLZLL((TuxTextView) c259800zU.element, 0);
        if (z2) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJIIIIZZ());
            valueAnimatorOfFloat.setDuration(300L);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS262S0100000_12(c259800zU, 26));
            valueAnimatorOfFloat.start();
        }
        View view = (View) c259800zU.element;
        if (view != null) {
            view.getWidth();
        }
    }

    public final void LJIJJ(int i, C709070Rrd c709070Rrd, List list) {
        ViewGroup viewGroup;
        ViewGroup.LayoutParams layoutParams;
        boolean z;
        View viewF2;
        ViewGroup viewGroup2;
        if (list != null && c709070Rrd != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            ArrayList arrayList2 = new ArrayList();
            int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    InterfaceC1570900qyu interfaceC1570900qyu = (InterfaceC1570900qyu) obj;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("registerIcons, ");
                    sbLIZ.append(interfaceC1570900qyu.getTag());
                    sbLIZ.append(", ");
                    if (i == 8388611) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sbLIZ.append(z);
                    C2188811AlT.LIZIZ(sbLIZ);
                    if (interfaceC1570900qyu.enabled() && (viewF2 = interfaceC1570900qyu.f2(this.LIZ.getContext())) != null) {
                        if (!interfaceC1570900qyu.c2()) {
                            C786410Ut5.I7(new ACListenerS57S0101000_24(interfaceC1570900qyu, i, 0), viewF2);
                        }
                        if (viewF2.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) viewF2.getLayoutParams();
                            layoutParams2.gravity = 17;
                            C786410Ut5.W5(viewF2, layoutParams2);
                        }
                        if (viewF2.getParent() != null) {
                            ViewParent parent = viewF2.getParent();
                            if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                                C786410Ut5.LJJJLZIJ(viewF2, viewGroup2);
                            }
                        }
                        C1581500rG0 c1581500rG0 = new C1581500rG0(this.LIZ.getContext());
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(this.LIZIZ, -1);
                        layoutParams3.gravity = 16;
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1581500rG0);
                        c1581500rG0.setLayoutParams(layoutParams3);
                        String tag = interfaceC1570900qyu.getTag();
                        c1581500rG0.setIconConfig(new C1580150rDp(interfaceC1570900qyu, i));
                        LJJII(c1581500rG0, tag);
                        c1581500rG0.setClickable(true);
                        C786410Ut5.R8(c1581500rG0, new ACListenerS158S0100000_24(interfaceC1570900qyu, 2));
                        if (i == 8388611) {
                            C2271391DvN.LIZ(c1581500rG0, (C1A5L) C2271381DvM.LJJJJI.getValue());
                        } else {
                            C2271391DvN.LIZ(c1581500rG0, (C1A5L) C2271381DvM.LJJJJIZL.getValue());
                        }
                        c1581500rG0.addView(viewF2);
                        String tag2 = interfaceC1570900qyu.getTag();
                        if (tag2 == null) {
                            tag2 = "";
                        }
                        arrayList.add(tag2);
                        if (Intrinsics.LJFF(interfaceC1570900qyu.getTag(), EnumC1584350rKb.MY_PROFILE.getTag()) || Intrinsics.LJFF(interfaceC1570900qyu.getTag(), EnumC1584350rKb.INBOX.getTag()) || Intrinsics.LJFF(interfaceC1570900qyu.getTag(), EnumC1584350rKb.COIN.getTag())) {
                            interfaceC1570900qyu.onCreate();
                        }
                        if (interfaceC1570900qyu.b2()) {
                            interfaceC1570900qyu.Y1(this.LJIIIIZZ, i);
                        }
                        arrayList2.add(c1581500rG0);
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            int size = arrayList2.size();
            LJJI(i, c709070Rrd, arrayList2);
            C0S4J c0s4j = this.LJIILJJIL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("registerIcons, icon count:");
            sbLIZ2.append(size);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            boolean z2 = AbstractC1604130rqV.LIZLLL;
            c0s4j.LIZ(strLIZIZ, null);
            int i4 = this.LIZIZ;
            if (size > 1) {
                int childCount = c709070Rrd.getChildCount();
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = c709070Rrd.getChildAt(i5);
                    if (childAt != null && (layoutParams = childAt.getLayoutParams()) != null) {
                        layoutParams.width = this.LIZJ;
                    }
                }
                i4 = this.LIZJ * size;
            }
            if (i == 8388613) {
                C1591460rW4.LIZ.getClass();
                C1591460rW4.LJFF = size;
                Collections.reverse(arrayList);
                this.LJIIZILJ = arrayList;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : list) {
                    if (C13LP.LJJJJ(((InterfaceC1570900qyu) obj2).getTag(), arrayList)) {
                        arrayList3.add(obj2);
                    }
                }
                this.LJIJ = arrayList3;
                C1591460rW4.LIZ.getClass();
                C1591460rW4.LJII = i4;
            } else {
                C1591460rW4.LIZ.getClass();
                C1591460rW4.LJ = size;
                this.LJIJI = arrayList;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : list) {
                    if (C13LP.LJJJJ(((InterfaceC1570900qyu) obj3).getTag(), arrayList)) {
                        arrayList4.add(obj3);
                    }
                }
                this.LJIJJ = arrayList4;
                C1591460rW4.LIZ.getClass();
                C1591460rW4.LJI = i4;
            }
            C0S4J c0s4j2 = this.LJIILJJIL;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("registerLeft, icon count:");
            sbLIZ3.append(size);
            sbLIZ3.append("，width ");
            sbLIZ3.append(i4);
            c0s4j2.LIZ(C2188811AlT.LIZIZ(sbLIZ3), null);
            if (C1581510rG1.LJ()) {
                i4 = -2;
            }
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(i4, -1);
            layoutParams4.gravity = i | 16;
            if (c709070Rrd.getParent() != null) {
                ViewParent parent2 = c709070Rrd.getParent();
                if ((parent2 instanceof ViewGroup) && (viewGroup = (ViewGroup) parent2) != null) {
                    C786410Ut5.LJJJLZIJ(c709070Rrd, viewGroup);
                }
            }
            C786410Ut5.X5(layoutParams4, c709070Rrd);
            this.LIZ.addView(c709070Rrd);
        }
    }

    public final void LJIJJLI(int i, C709070Rrd c709070Rrd, List list) {
        ViewGroup viewGroup;
        boolean z;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup viewGroup2;
        if (list != null && c709070Rrd != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            ArrayList arrayList2 = new ArrayList();
            int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    InterfaceC1570900qyu interfaceC1570900qyu = (InterfaceC1570900qyu) obj;
                    int size = list.size();
                    if (interfaceC1570900qyu != null && interfaceC1570900qyu.enabled()) {
                        String tag = interfaceC1570900qyu.getTag();
                        View viewF2 = interfaceC1570900qyu.f2(this.LIZ.getContext());
                        if (viewF2 != null) {
                            if (!interfaceC1570900qyu.c2()) {
                                C786410Ut5.I7(new ACListenerS57S0101000_24(interfaceC1570900qyu, i, 1), viewF2);
                            }
                            if (viewF2.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewF2.getLayoutParams();
                                if (Intrinsics.LJFF(tag, EnumC1584350rKb.STORY.getTag())) {
                                    if (C1596000rdO.LIZ() && C1585060rLk.LIZJ()) {
                                        layoutParams.gravity = 17;
                                    } else {
                                        layoutParams.gravity = 8388627;
                                    }
                                } else {
                                    layoutParams.gravity = 17;
                                }
                                C786410Ut5.W5(viewF2, layoutParams);
                            }
                            if (viewF2.getParent() != null) {
                                ViewParent parent = viewF2.getParent();
                                if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                                    C786410Ut5.LJJJLZIJ(viewF2, viewGroup2);
                                }
                            }
                            String tag2 = interfaceC1570900qyu.getTag();
                            if (i == 8388611) {
                                z = true;
                            } else {
                                z = false;
                            }
                            C1580120rDm c1580120rDmLIZ = ((InterfaceC1580140rDo) C1580110rDl.LIZ.getValue()).LIZ(i2, size, tag2, z);
                            C1581500rG0 c1581500rG0 = new C1581500rG0(this.LIZ.getContext());
                            ViewGroup.LayoutParams layoutParams2 = c1580120rDmLIZ.LIZIZ;
                            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
                            layoutParams3.gravity = 17;
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1581500rG0);
                            c1581500rG0.setLayoutParams(layoutParams3);
                            ViewGroup.LayoutParams layoutParams4 = c1581500rG0.getLayoutParams();
                            if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                                ViewGroup.LayoutParams layoutParams5 = c1580120rDmLIZ.LIZIZ;
                                marginLayoutParams.width = layoutParams5.width;
                                marginLayoutParams.height = layoutParams5.height;
                            }
                            C1580210rDv c1580210rDv = c1580120rDmLIZ.LIZLLL;
                            if (c1580210rDv != null) {
                                C426750GoL.LJIIL(c1581500rG0, Integer.valueOf(c1580210rDv.LIZ), Integer.valueOf(c1580120rDmLIZ.LIZLLL.LIZIZ), Integer.valueOf(c1580120rDmLIZ.LIZLLL.LIZJ), Integer.valueOf(c1580120rDmLIZ.LIZLLL.LIZLLL), 16);
                            }
                            c1580120rDmLIZ.LIZ(viewF2);
                            c1581500rG0.setIconConfig(new C1580150rDp(interfaceC1570900qyu, i));
                            LJJII(c1581500rG0, tag);
                            c1581500rG0.setClickable(true);
                            C786410Ut5.R8(c1581500rG0, new ACListenerS158S0100000_24(interfaceC1570900qyu, 3));
                            if (i == 8388611) {
                                C2271391DvN.LIZ(c1581500rG0, (C1A5L) C2271381DvM.LJJJJI.getValue());
                            } else {
                                C2271391DvN.LIZ(c1581500rG0, (C1A5L) C2271381DvM.LJJJJIZL.getValue());
                            }
                            c1581500rG0.addView(viewF2);
                            String tag3 = interfaceC1570900qyu.getTag();
                            if (tag3 == null) {
                                tag3 = "";
                            }
                            arrayList.add(tag3);
                            if (Intrinsics.LJFF(interfaceC1570900qyu.getTag(), EnumC1584350rKb.MY_PROFILE.getTag()) || Intrinsics.LJFF(interfaceC1570900qyu.getTag(), EnumC1584350rKb.INBOX.getTag()) || Intrinsics.LJFF(interfaceC1570900qyu.getTag(), EnumC1584350rKb.COIN.getTag())) {
                                interfaceC1570900qyu.onCreate();
                            }
                            if (interfaceC1570900qyu.b2()) {
                                interfaceC1570900qyu.Y1(this.LJIIIIZZ, i);
                            }
                            arrayList2.add(c1581500rG0);
                        }
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            int size2 = arrayList2.size();
            Iterator it2 = arrayList2.iterator();
            int i4 = 0;
            while (it2.hasNext()) {
                i4 += ((View) it2.next()).getLayoutParams().width;
            }
            LJJI(i, c709070Rrd, arrayList2);
            if (i == 8388613) {
                C1591460rW4.LIZ.getClass();
                C1591460rW4.LJFF = size2;
                C1591460rW4.LJII = i4;
                Collections.reverse(arrayList);
                this.LJIIZILJ = arrayList;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : list) {
                    if (C13LP.LJJJJ(((InterfaceC1570900qyu) obj2).getTag(), arrayList)) {
                        arrayList3.add(obj2);
                    }
                }
                this.LJIJ = arrayList3;
            } else {
                C1591460rW4.LIZ.getClass();
                C1591460rW4.LJ = size2;
                C1591460rW4.LJI = i4;
                this.LJIJI = arrayList;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : list) {
                    if (C13LP.LJJJJ(((InterfaceC1570900qyu) obj3).getTag(), arrayList)) {
                        arrayList4.add(obj3);
                    }
                }
                this.LJIJJ = arrayList4;
            }
            FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -1);
            layoutParams6.gravity = i | 16;
            if (c709070Rrd.getParent() != null) {
                ViewParent parent2 = c709070Rrd.getParent();
                if ((parent2 instanceof ViewGroup) && (viewGroup = (ViewGroup) parent2) != null) {
                    C786410Ut5.LJJJLZIJ(c709070Rrd, viewGroup);
                }
            }
            C786410Ut5.X5(layoutParams6, c709070Rrd);
            this.LIZ.addView(c709070Rrd);
        }
    }

    public final void LJJI(int i, C709070Rrd c709070Rrd, List list) {
        Animator animator;
        AnimatorSet animatorSet;
        if (i == 8388611) {
            animator = this.LJIILL;
        } else {
            animator = this.LJIILLIIL;
        }
        if (animator != null && animator.isRunning()) {
            animator.cancel();
        }
        if (c709070Rrd.getChildCount() != 0 && C1581510rG1.LJ()) {
            ArrayList arrayList = (ArrayList) list;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C786410Ut5.T4((View) it2.next(), 0.0f);
            }
            List listLJJIII = C09RB.LJJIII(new C09RD(c709070Rrd));
            AnimatorSet animatorSet2 = new AnimatorSet();
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJJIII, 10));
            Iterator it3 = ((ArrayList) listLJJIII).iterator();
            while (it3.hasNext()) {
                arrayList2.add(C1593710rZh.LIZIZ((View) it3.next()));
            }
            animatorSet2.playTogether(arrayList2);
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.setStartDelay(125L);
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                arrayList3.add(C1593710rZh.LIZ((View) it4.next()));
            }
            animatorSet3.playTogether(arrayList3);
            ValueAnimator valueAnimatorLIZJ = C1593710rZh.LIZJ(new AwS268S0300000_24(c709070Rrd, list, this, 0));
            animatorSet = new AnimatorSet();
            animatorSet.playTogether(animatorSet2, animatorSet3, valueAnimatorLIZJ);
            animatorSet.start();
        } else {
            C786410Ut5.LJJJJI(c709070Rrd);
            Iterator it5 = ((ArrayList) list).iterator();
            while (it5.hasNext()) {
                c709070Rrd.addView((View) it5.next());
            }
            Iterator it6 = ((ArrayList) this.LJIILIIL).iterator();
            while (it6.hasNext()) {
                ((InterfaceC1571310qzZ) it6.next()).LIZ();
            }
            animatorSet = null;
        }
        if (i == 8388611) {
            this.LJIILL = animatorSet;
        } else {
            this.LJIILLIIL = animatorSet;
        }
    }

    public final void LJJIFFI(int i, View view, View view2, ViewGroup viewGroup) {
        Animator animator;
        AnimatorSet animatorSet;
        ViewGroup viewGroup2;
        if (i == 8388611) {
            animator = this.LJIILL;
        } else {
            animator = this.LJIILLIIL;
        }
        if (animator != null && animator.isRunning()) {
            animator.cancel();
        }
        if (view != null && C1581510rG1.LJ()) {
            ObjectAnimator objectAnimatorLIZIZ = C1593710rZh.LIZIZ(view);
            ObjectAnimator objectAnimatorLIZ = C1593710rZh.LIZ(view2);
            ValueAnimator valueAnimatorLIZJ = C1593710rZh.LIZJ(new AwS152S0400000_24(viewGroup, view, view2, this, 0));
            animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorLIZIZ, objectAnimatorLIZ, valueAnimatorLIZJ);
            animatorSet.start();
        } else {
            C786410Ut5.LJJJLZIJ(view, viewGroup);
            animatorSet = null;
            if (view2.getParent() != null) {
                ViewParent parent = view2.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                    C786410Ut5.LJJJLZIJ(view2, viewGroup2);
                }
            }
            viewGroup.addView(view2);
            Iterator it2 = ((ArrayList) this.LJIILIIL).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1571310qzZ) it2.next()).LIZ();
            }
        }
        if (i == 8388611) {
            this.LJIILL = animatorSet;
        } else {
            this.LJIILLIIL = animatorSet;
        }
    }
}
