package X;

import Y.AComparatorS51S0000000_32;
import Y.ARunnableS132S0100000_32;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.libra.EcMixMallInitConfigSettings;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS62S0310000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.17qb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21155517qb {
    public final C1771760wCs LIZ;
    public final FrameLayout LIZIZ;
    public final FrameLayout LIZJ;
    public final C21157017qq LIZLLL;
    public final FrameLayout LJ;
    public final CopyOnWriteArrayList<InterfaceC21154317qP> LJFF;
    public final CopyOnWriteArrayList<InterfaceC21154317qP> LJI;
    public InterfaceC21154317qP LJII;
    public final int LJIIIIZZ;

    public final void LIZJ(boolean z) {
        FrameLayout frameLayout;
        ViewGroup viewGroup;
        InterfaceC21154317qP interfaceC21154317qP = this.LJII;
        if (interfaceC21154317qP != null) {
            interfaceC21154317qP.LIZLLL(false, this.LJ, false, C21155317qZ.LIZLLL, null);
            this.LJII = null;
        }
        InterfaceC21154317qP interfaceC21154317qP2 = (InterfaceC21154317qP) C19719612Di.LJJIIZI(this.LJI);
        if (interfaceC21154317qP2 == null) {
            if (this.LJFF.isEmpty() && this.LJI.isEmpty() && this.LJII == null) {
                C21157017qq c21157017qq = this.LIZLLL;
                Pair<Integer, String> pair = C21155317qZ.LIZLLL;
                C21155517qb c21155517qb = c21157017qq.LJ;
                if (c21155517qb != null) {
                    c21155517qb.LIZ(false, false, pair, null);
                    return;
                }
                return;
            }
            return;
        }
        ViewParent parent = this.LJ.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJLZIJ(this.LJ, viewGroup);
        }
        if (interfaceC21154317qP2.LIZIZ().LIZ()) {
            frameLayout = this.LIZJ;
            if (frameLayout == null) {
                C21157017qq.LIZ(this.LIZLLL, interfaceC21154317qP2, false, C21155317qZ.LIZLLL, null, 17);
                return;
            }
        } else {
            if (this.LIZIZ.getVisibility() != 0) {
                C786410Ut5.LJZ(0, this.LIZIZ);
            }
            frameLayout = this.LIZIZ;
        }
        frameLayout.addView(this.LJ);
        AwS62S0310000_32 awS62S0310000_32 = new AwS62S0310000_32(frameLayout, this, interfaceC21154317qP2, z, 1);
        if (C1841707Jf.LIZ) {
            C786410Ut5.x3(this.LJ.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC21523919Lh(this, awS62S0310000_32, 3));
        } else {
            HandlerHook.viewPost(frameLayout, new ARunnableS132S0100000_32(awS62S0310000_32, 109));
        }
    }

    public final InterfaceC21154317qP LIZLLL(String str) {
        InterfaceC21154317qP next;
        Iterator<InterfaceC21154317qP> it2 = this.LJFF.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(str, next.LJII())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    public final void LJ(AbstractC21154217qO abstractC21154217qO) {
        new AwS576S0100000_32(abstractC21154217qO, 895);
        this.LJFF.add(abstractC21154217qO);
        this.LJI.add(abstractC21154217qO);
        CopyOnWriteArrayList<InterfaceC21154317qP> copyOnWriteArrayList = this.LJI;
        if (copyOnWriteArrayList.size() > 1) {
            C08XD.LJJ(copyOnWriteArrayList, new AComparatorS51S0000000_32(3));
        }
        if (this.LJII == null) {
            LIZJ(false);
        }
        if (this.LJFF.size() > this.LJIIIIZZ) {
            C1557000qcU.LIZ("popup_task", "over_threshold", C2097608Jq.LJIIJ(new Pair("popup_type", Integer.valueOf(abstractC21154217qO.LLILLL.LIZIZ.getValue())), new Pair("popup_parent", Integer.valueOf(abstractC21154217qO.LLILLL.LIZJ.getValue())), new Pair("schema", abstractC21154217qO.LLILLL.LIZLLL), new Pair("quantity", Integer.valueOf(this.LJFF.size()))));
        }
    }

    public C21155517qb(C1771760wCs c1771760wCs, FrameLayout frameLayout, FrameLayout frameLayout2, C21157017qq c21157017qq) {
        this.LIZ = c1771760wCs;
        this.LIZIZ = frameLayout;
        this.LIZJ = frameLayout2;
        this.LIZLLL = c21157017qq;
        FrameLayout frameLayout3 = new FrameLayout(frameLayout.getContext());
        C786410Ut5.a6(frameLayout3, new FrameLayout.LayoutParams(-1, -1));
        this.LJ = frameLayout3;
        this.LJFF = new CopyOnWriteArrayList<>();
        this.LJI = new CopyOnWriteArrayList<>();
        this.LJIIIIZZ = EcMixMallInitConfigSettings.LIZIZ.exceptionPopupTaskMaxThreshold;
    }

    public final void LIZ(boolean z, boolean z2, Pair<Integer, String> pair, InterfaceC21154417qQ interfaceC21154417qQ) {
        ViewGroup viewGroup;
        Iterator<InterfaceC21154317qP> it2 = this.LJI.iterator();
        while (it2.hasNext()) {
            it2.next().LIZLLL(z, this.LJ, z2, pair, interfaceC21154417qQ);
        }
        if (!z2) {
            this.LJFF.removeAll(this.LJI);
        }
        this.LJI.clear();
        InterfaceC21154317qP interfaceC21154317qP = this.LJII;
        if (interfaceC21154317qP != null) {
            interfaceC21154317qP.LIZLLL(z, this.LJ, z2, pair, interfaceC21154417qQ);
        }
        if (!z2) {
            this.LJFF.remove(this.LJII);
        }
        this.LJII = null;
        if (!z2) {
            Iterator<InterfaceC21154317qP> it3 = this.LJFF.iterator();
            while (it3.hasNext()) {
                it3.next().LIZLLL(z, this.LJ, false, pair, interfaceC21154417qQ);
            }
            this.LJFF.clear();
        }
        C786410Ut5.LJJJJIZL(this.LJ);
        ViewParent parent = this.LJ.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJLZIJ(this.LJ, viewGroup);
        }
    }

    public final void LIZIZ(boolean z, InterfaceC21154317qP interfaceC21154317qP, boolean z2, Pair<Integer, String> pair, InterfaceC21154417qQ interfaceC21154417qQ) {
        new AwS576S0100000_32(interfaceC21154317qP, 894);
        interfaceC21154317qP.LIZLLL(z, this.LJ, z2, pair, interfaceC21154417qQ);
        if (!z2) {
            this.LJFF.remove(interfaceC21154317qP);
        }
        if (Intrinsics.LJFF(interfaceC21154317qP, this.LJII)) {
            this.LJII = null;
            LIZJ(true);
        } else {
            this.LJI.remove(interfaceC21154317qP);
        }
    }
}
