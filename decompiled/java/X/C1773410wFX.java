package X;

import Y.ARunnableS13S2100000_26;
import Y.ARunnableS45S0110000_26;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wFX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1773410wFX extends AbstractC1773460wFc<C1773340wFQ> implements InterfaceC1772610wEF {
    public final C1773610wFr<C1773340wFQ> LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public C1773920wGM LLJJIJIL;
    public boolean LLJJJ;
    public final C1773420wFY LLJJJIL;

    @Override // X.AbstractC1773460wFc
    public final int S5() {
        return 5;
    }

    @Override // X.AbstractC1773460wFc
    public final void L5() {
        C1773540wFk c1773540wFk;
        C1772820wEa c1772820wEa;
        C1773920wGM c1773920wGM = this.LLJJIJIL;
        if (c1773920wGM == null || (c1773540wFk = c1773920wGM.LIZIZ) == null || (c1772820wEa = c1773540wFk.LJIIJ) == null) {
            return;
        }
        c1772820wEa.LJIJ = System.currentTimeMillis();
    }

    @Override // X.AbstractC1773460wFc
    public final void N5() {
        C1773540wFk c1773540wFk;
        C1772820wEa c1772820wEa;
        C1773920wGM c1773920wGM = this.LLJJIJIL;
        if (c1773920wGM == null || (c1773540wFk = c1773920wGM.LIZIZ) == null || (c1772820wEa = c1773540wFk.LJIIJ) == null) {
            return;
        }
        c1772820wEa.LJIIZILJ = System.currentTimeMillis();
    }

    @Override // X.AbstractC1773460wFc
    public final boolean W5() {
        View view = this.itemView;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        return viewGroup != null && viewGroup.getChildCount() == 0;
    }

    @Override // X.AbstractC1773460wFc
    public final void a6() {
        C1773540wFk c1773540wFk;
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMovedToRecycle, viewType=");
        C1773920wGM c1773920wGM = this.LLJJIJIL;
        sbLIZ.append((c1773920wGM == null || (c1773540wFk = c1773920wGM.LIZIZ) == null) ? null : Integer.valueOf(c1773540wFk.LIZJ));
        C2188811AlT.LIZIZ(sbLIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZLLL();
        C1773920wGM c1773920wGM2 = this.LLJJIJIL;
        if (c1773920wGM2 == null) {
            return;
        }
        this.LLJJIJIL = null;
        C1773610wFr<C1773340wFQ> c1773610wFr = this.LLJJIJI;
        C21326518d5 c21326518d5 = c1773920wGM2.LIZJ;
        C786410Ut5.LJJLIIIJL(c1773610wFr, c21326518d5 != null ? c21326518d5.LIZIZ : null);
        C1773810wGB c1773810wGB = (C1773810wGB) this.LLJJIJIIJIL.getValue();
        int i = c1773920wGM2.LIZIZ.LIZJ;
        c1773810wGB.getClass();
        if (c1773920wGM2.LIZLLL) {
            Queue<C1773920wGM> linkedList = c1773810wGB.LIZIZ.get(i);
            if (linkedList == null) {
                linkedList = new LinkedList<>();
                c1773810wGB.LIZIZ.put(i, linkedList);
            }
            linkedList.offer(c1773920wGM2);
        }
    }

    public final void v6() {
        String str;
        C1775190wIP c1775190wIP;
        C1775180wIO c1775180wIO;
        C1772690wEN c1772690wEN;
        String str2;
        D d = this.LLILLL;
        if (d == 0 || (str = d.LIZ) == null || d == 0 || (c1775190wIP = d.LJII) == null || (c1775180wIO = c1775190wIP.LIZIZ) == null || (c1772690wEN = c1775180wIO.LIZ) == null || (str2 = c1772690wEN.LIZLLL) == null) {
            return;
        }
        HandlerHook.viewPost(this.itemView, new ARunnableS13S2100000_26(this, str, str2, 2));
    }

    @Override // X.AbstractC1773460wFc
    public final boolean V5() {
        return this.LLJJJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00ea  */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, X.0wFD, X.0wFQ] */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.18bw] */
    @Override // X.AbstractC1773460wFc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P5(X.AbstractC1773210wFD r22) {
        /*
            Method dump skipped, instruction units count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1773410wFX.P5(X.0wFD):void");
    }

    @Override // X.AbstractC1773460wFc
    public final void onVisibilityChanged(boolean z) {
        C21326518d5 c21326518d5;
        View view;
        ConcurrentHashMap<String, ConcurrentHashMap<String, InterfaceC606370NqN>> concurrentHashMap;
        ConcurrentHashMap<String, InterfaceC606370NqN> concurrentHashMap2;
        super.onVisibilityChanged(z);
        C1773920wGM c1773920wGM = this.LLJJIJIL;
        if (c1773920wGM != null && (c21326518d5 = c1773920wGM.LIZJ) != null && (view = c21326518d5.LIZIZ) != null && (concurrentHashMap = ((C21317318bb) this.LL.LIZIZ().LJFF.getValue()).LIZLLL.get(view)) != null && (concurrentHashMap2 = concurrentHashMap.get("ec_mix_mall_card_visible")) != null) {
            Iterator<Map.Entry<String, InterfaceC606370NqN>> it2 = concurrentHashMap2.entrySet().iterator();
            while (it2.hasNext()) {
                it2.next().getValue().LIZ(C2097608Jq.LJIIIIZZ(new Pair("visible", Integer.valueOf(z ? 1 : 0)), new Pair("item_id", Long.valueOf(getItemId()))), null);
            }
        }
    }

    @Override // X.InterfaceC1772610wEF
    public final View u5(String str) {
        C21326518d5 c21326518d5;
        View view;
        C1773920wGM c1773920wGM = this.LLJJIJIL;
        if (c1773920wGM != null && (c21326518d5 = c1773920wGM.LIZJ) != null && (view = c21326518d5.LIZIZ) != null) {
            return this.LL.LIZIZ().LIZJ.LIZJ(view, str);
        }
        return null;
    }

    public final void u6(C1772820wEa c1772820wEa) {
        D d = this.LLILLL;
        if (d != 0) {
            super.i6(d, c1772820wEa);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0wFY] */
    public C1773410wFX(C1773610wFr<C1773340wFQ> c1773610wFr, InterfaceC1773310wFN interfaceC1773310wFN) {
        super(c1773610wFr, interfaceC1773310wFN);
        this.LLJJIJI = c1773610wFr;
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1564));
        this.LLJJJIL = new InterfaceC21327318dD() { // from class: X.0wFY
            @Override // X.InterfaceC21327318dD
            public final void LJFF(String str) {
            }

            @Override // X.InterfaceC21327318dD
            public final void LIZLLL() {
                C1773410wFX c1773410wFX = this.LIZ;
                C786410Ut5.LJL(c1773410wFX.LLJI, new ARunnableS45S0110000_26(c1773410wFX, 0, true, 3));
            }

            @Override // X.InterfaceC21327318dD
            public final void LJIJJLI() {
                IECommerceHostService iECommerceHostService;
                boolean z = false;
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                    C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                }
                if (((IApplicationDependencyService) iECommerceHostService).isDebug()) {
                    C599820Nfo.LIZ.getClass();
                    C599820Nfo.LIZLLL();
                }
                C1773920wGM c1773920wGM = this.LIZ.LLJJIJIL;
                if (c1773920wGM == null) {
                    return;
                }
                C1772820wEa c1772820wEa = c1773920wGM.LIZIZ.LJIIJ;
                C21326518d5 c21326518d5 = c1773920wGM.LIZJ;
                C1774720wHe c1774720wHe = c21326518d5 != null ? c21326518d5.LIZ.LIZIZ : null;
                c1772820wEa.LJIILJJIL = true;
                c1772820wEa.LIZ = 2;
                c1772820wEa.LJIILLIIL = System.currentTimeMillis();
                c1772820wEa.LIZLLL = c1774720wHe != null ? c1774720wHe.LIZIZ() : "";
                String strLIZ = c1774720wHe != null ? c1774720wHe.LIZ() : null;
                c1772820wEa.LJFF = Intrinsics.LJFF(strLIZ, "GECKO") || Intrinsics.LJFF(strLIZ, "MEMORY") || Intrinsics.LJFF(strLIZ, "BUILTIN");
                c1772820wEa.LJIILIIL = c1774720wHe != null && c1774720wHe.LJIIJ;
                if (c1774720wHe != null && c1774720wHe.LJIIIZ) {
                    z = true;
                }
                c1772820wEa.LJIIL = z;
                C1772760wEU.LIZ.getClass();
                C1772760wEU.LIZIZ(c1772820wEa);
            }

            @Override // X.InterfaceC21327318dD
            public final void LIZIZ(Map<String, ? extends Object> map) {
                IECommerceHostService iECommerceHostService;
                boolean z;
                String name;
                C1774720wHe c1774720wHe = null;
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                    if (iECommerceHostService != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String name2 = IApplicationDependencyService.class.getName();
                    if (iECommerceHostService != null) {
                        name = iECommerceHostService.getClass().getName();
                    } else {
                        name = null;
                    }
                    C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                }
                if (((IApplicationDependencyService) iECommerceHostService).isDebug()) {
                    C599820Nfo c599820Nfo = C599820Nfo.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onUpdateDataSuccess, timingInfo=");
                    sbLIZ.append(map);
                    C2188811AlT.LIZIZ(sbLIZ);
                    c599820Nfo.getClass();
                    C599820Nfo.LIZLLL();
                }
                C1773410wFX c1773410wFX = this.LIZ;
                C1773920wGM c1773920wGM = c1773410wFX.LLJJIJIL;
                if (c1773920wGM == null) {
                    return;
                }
                c1773410wFX.u6(c1773920wGM.LIZIZ.LJIIJ);
                C1773410wFX c1773410wFX2 = this.LIZ;
                C1772820wEa c1772820wEa = c1773920wGM.LIZIZ.LJIIJ;
                C21326518d5 c21326518d5 = c1773920wGM.LIZJ;
                if (c21326518d5 != null) {
                    c1774720wHe = c21326518d5.LIZ.LIZIZ;
                }
                c1773410wFX2.getClass();
                C1773410wFX.w6(false, c1772820wEa, map, c1774720wHe, false);
            }

            @Override // X.InterfaceC21327318dD
            public final void LIZJ(Map<String, ? extends Object> map) {
                IECommerceHostService iECommerceHostService;
                boolean z;
                String name;
                C1774720wHe c1774720wHe = null;
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                    if (iECommerceHostService != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String name2 = IApplicationDependencyService.class.getName();
                    if (iECommerceHostService != null) {
                        name = iECommerceHostService.getClass().getName();
                    } else {
                        name = null;
                    }
                    C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                }
                if (((IApplicationDependencyService) iECommerceHostService).isDebug()) {
                    C599820Nfo c599820Nfo = C599820Nfo.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onLoadSuccess, timingInfo=");
                    sbLIZ.append(map);
                    C2188811AlT.LIZIZ(sbLIZ);
                    c599820Nfo.getClass();
                    C599820Nfo.LIZLLL();
                }
                C1773410wFX c1773410wFX = this.LIZ;
                C1773920wGM c1773920wGM = c1773410wFX.LLJJIJIL;
                if (c1773920wGM == null) {
                    return;
                }
                c1773920wGM.LIZLLL = true;
                c1773410wFX.u6(c1773920wGM.LIZIZ.LJIIJ);
                C1773410wFX c1773410wFX2 = this.LIZ;
                C1772820wEa c1772820wEa = c1773920wGM.LIZIZ.LJIIJ;
                C21326518d5 c21326518d5 = c1773920wGM.LIZJ;
                if (c21326518d5 != null) {
                    c1774720wHe = c21326518d5.LIZ.LIZIZ;
                }
                c1773410wFX2.getClass();
                C1773410wFX.w6(true, c1772820wEa, map, c1774720wHe, true);
            }

            @Override // X.InterfaceC21327318dD
            public final void LIZ(int i, String str) {
                IECommerceHostService iECommerceHostService;
                C1774720wHe c1774720wHe;
                View view;
                C21326518d5 c21326518d5;
                boolean z;
                String name;
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                    if (iECommerceHostService != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String name2 = IApplicationDependencyService.class.getName();
                    if (iECommerceHostService != null) {
                        name = iECommerceHostService.getClass().getName();
                    } else {
                        name = null;
                    }
                    C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                }
                if (((IApplicationDependencyService) iECommerceHostService).isDebug()) {
                    C599820Nfo c599820Nfo = C599820Nfo.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onLoadFailed, ");
                    sbLIZ.append(i);
                    sbLIZ.append(", ");
                    sbLIZ.append(str);
                    C2188811AlT.LIZIZ(sbLIZ);
                    c599820Nfo.getClass();
                    C599820Nfo.LIZLLL();
                }
                C1773410wFX c1773410wFX = this.LIZ;
                AbstractC1773210wFD abstractC1773210wFD = c1773410wFX.LLILLL;
                if (abstractC1773210wFD != null) {
                    Iterator<InterfaceC1774020wGW> it2 = c1773410wFX.LL.LJI().iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZLLL(abstractC1773210wFD, str);
                    }
                }
                this.LIZ.v6();
                C1773920wGM c1773920wGM = this.LIZ.LLJJIJIL;
                if (c1773920wGM == null) {
                    return;
                }
                c1773920wGM.LIZLLL = false;
                C1772820wEa c1772820wEa = c1773920wGM.LIZIZ.LJIIJ;
                C21326518d5 c21326518d52 = c1773920wGM.LIZJ;
                if (c21326518d52 != null) {
                    c1774720wHe = c21326518d52.LIZ.LIZIZ;
                } else {
                    c1774720wHe = null;
                }
                C1773410wFX.z6(true, c1772820wEa, c1774720wHe, i, str, true);
                C1773610wFr<C1773340wFQ> c1773610wFr2 = this.LIZ.LLJJIJI;
                C21326518d5 c21326518d53 = c1773920wGM.LIZJ;
                if (c21326518d53 != null) {
                    view = c21326518d53.LIZIZ;
                } else {
                    view = null;
                }
                C786410Ut5.LJJLIIIJL(c1773610wFr2, view);
                C1773920wGM c1773920wGM2 = this.LIZ.LLJJIJIL;
                if (c1773920wGM2 != null && (c21326518d5 = c1773920wGM2.LIZJ) != null) {
                    c21326518d5.LIZJ();
                }
                this.LIZ.LLJJIJIL = null;
            }

            @Override // X.InterfaceC21327318dD
            public final void LJLIIIL(int i, String str) {
                IECommerceHostService iECommerceHostService;
                C1774720wHe c1774720wHe;
                View view;
                C21326518d5 c21326518d5;
                boolean z;
                String name;
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                    if (iECommerceHostService != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String name2 = IApplicationDependencyService.class.getName();
                    if (iECommerceHostService != null) {
                        name = iECommerceHostService.getClass().getName();
                    } else {
                        name = null;
                    }
                    C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                }
                if (((IApplicationDependencyService) iECommerceHostService).isDebug()) {
                    C599820Nfo c599820Nfo = C599820Nfo.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onUpdateDataFailed, ");
                    sbLIZ.append(i);
                    sbLIZ.append(", ");
                    sbLIZ.append(str);
                    C2188811AlT.LIZIZ(sbLIZ);
                    c599820Nfo.getClass();
                    C599820Nfo.LIZLLL();
                }
                C1773410wFX c1773410wFX = this.LIZ;
                AbstractC1773210wFD abstractC1773210wFD = c1773410wFX.LLILLL;
                if (abstractC1773210wFD != null) {
                    Iterator<InterfaceC1774020wGW> it2 = c1773410wFX.LL.LJI().iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZLLL(abstractC1773210wFD, str);
                    }
                }
                this.LIZ.v6();
                C1773920wGM c1773920wGM = this.LIZ.LLJJIJIL;
                if (c1773920wGM == null) {
                    return;
                }
                C1772820wEa c1772820wEa = c1773920wGM.LIZIZ.LJIIJ;
                C21326518d5 c21326518d52 = c1773920wGM.LIZJ;
                if (c21326518d52 != null) {
                    c1774720wHe = c21326518d52.LIZ.LIZIZ;
                } else {
                    c1774720wHe = null;
                }
                C1773410wFX.z6(false, c1772820wEa, c1774720wHe, i, str, false);
                C1773610wFr<C1773340wFQ> c1773610wFr2 = this.LIZ.LLJJIJI;
                C21326518d5 c21326518d53 = c1773920wGM.LIZJ;
                if (c21326518d53 != null) {
                    view = c21326518d53.LIZIZ;
                } else {
                    view = null;
                }
                C786410Ut5.LJJLIIIJL(c1773610wFr2, view);
                C1773920wGM c1773920wGM2 = this.LIZ.LLJJIJIL;
                if (c1773920wGM2 != null && (c21326518d5 = c1773920wGM2.LIZJ) != null) {
                    c21326518d5.LIZJ();
                }
                this.LIZ.LLJJIJIL = null;
            }

            @Override // X.InterfaceC21327318dD
            public final void LJ(C21326518d5 c21326518d5, C21327518dF c21327518dF, String str) {
                IECommerceHostService iECommerceHostService;
                View childAt;
                boolean z;
                String name;
                Integer numValueOf = null;
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                    if (iECommerceHostService != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String name2 = IApplicationDependencyService.class.getName();
                    if (iECommerceHostService != null) {
                        name = iECommerceHostService.getClass().getName();
                    } else {
                        name = null;
                    }
                    C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                }
                if (((IApplicationDependencyService) iECommerceHostService).isDebug()) {
                    C599820Nfo c599820Nfo = C599820Nfo.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("notifyCreateView, ");
                    sbLIZ.append(str);
                    sbLIZ.append(", rootView=");
                    sbLIZ.append(c21326518d5.LIZIZ);
                    C2188811AlT.LIZIZ(sbLIZ);
                    c599820Nfo.getClass();
                    C599820Nfo.LIZLLL();
                }
                C1773410wFX c1773410wFX = this.LIZ;
                C1773920wGM c1773920wGM = c1773410wFX.LLJJIJIL;
                if (c1773920wGM != null) {
                    c1773920wGM.LIZJ = c21326518d5;
                }
                C1773610wFr<C1773340wFQ> c1773610wFr2 = c1773410wFX.LLJJIJI;
                if (c1773610wFr2.getChildCount() != 0 && (childAt = c1773610wFr2.getChildAt(0)) != null && !Intrinsics.LJFF(childAt, c21326518d5.LIZIZ)) {
                    C786410Ut5.LJJLIIIJL(this.LIZ.LLJJIJI, childAt);
                    C1773410wFX c1773410wFX2 = this.LIZ;
                    View view = c21326518d5.LIZIZ;
                    c1773410wFX2.getClass();
                    AwS427S0200000_26 awS427S0200000_26 = new AwS427S0200000_26(c1773410wFX2, view, 95);
                    if (view.getParent() == null) {
                        awS427S0200000_26.invoke();
                    }
                    C599820Nfo c599820Nfo2 = C599820Nfo.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("notifyCreateView, content view not match, replace, ");
                    C1773340wFQ data = this.LIZ.LLJJIJI.getData();
                    if (data != null) {
                        numValueOf = Integer.valueOf(data.LJJI);
                    }
                    sbLIZ2.append(numValueOf);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    c599820Nfo2.getClass();
                    C599820Nfo.LIZIZ();
                }
            }
        };
    }

    @Override // X.AbstractC1773460wFc
    public final void i6(AbstractC1773210wFD abstractC1773210wFD, C1772820wEa c1772820wEa) {
        C1773540wFk c1773540wFk;
        C1773920wGM c1773920wGM = this.LLJJIJIL;
        if (c1773920wGM != null && (c1773540wFk = c1773920wGM.LIZIZ) != null && this.LLJJJ) {
            C1772760wEU c1772760wEU = C1772760wEU.LIZ;
            C1772820wEa c1772820wEa2 = c1773540wFk.LJIIJ;
            c1772760wEU.getClass();
            C1772760wEU.LIZIZ(c1772820wEa2);
        }
    }

    public static void w6(boolean z, C1772820wEa c1772820wEa, Map map, C1774720wHe c1774720wHe, boolean z2) {
        String strLIZIZ;
        String strLIZ;
        boolean z3;
        boolean z4;
        c1772820wEa.LJIILJJIL = z;
        c1772820wEa.LJIILLIIL = System.currentTimeMillis();
        boolean z5 = true;
        c1772820wEa.LIZ = 1;
        c1772820wEa.LJJIJIIJIL = map;
        if (c1774720wHe != null) {
            strLIZIZ = c1774720wHe.LIZIZ();
        } else {
            strLIZIZ = "";
        }
        c1772820wEa.LIZLLL = strLIZIZ;
        if (c1774720wHe != null) {
            strLIZ = c1774720wHe.LIZ();
        } else {
            strLIZ = null;
        }
        if (!Intrinsics.LJFF(strLIZ, "GECKO") && !Intrinsics.LJFF(strLIZ, "MEMORY") && !Intrinsics.LJFF(strLIZ, "BUILTIN")) {
            z3 = false;
        } else {
            z3 = true;
        }
        c1772820wEa.LJFF = z3;
        if (c1774720wHe != null && c1774720wHe.LJIIJ) {
            z4 = true;
        } else {
            z4 = false;
        }
        c1772820wEa.LJIILIIL = z4;
        if (c1774720wHe == null || !c1774720wHe.LJIIIZ) {
            z5 = false;
        }
        c1772820wEa.LJIIL = z5;
        if (z2) {
            C1772760wEU.LIZ.getClass();
            C1772760wEU.LIZIZ(c1772820wEa);
        }
    }

    public static void z6(boolean z, C1772820wEa c1772820wEa, C1774720wHe c1774720wHe, int i, String str, boolean z2) {
        String strLIZIZ;
        String strLIZ;
        boolean z3;
        boolean z4;
        c1772820wEa.LJIILJJIL = z;
        c1772820wEa.LJIILLIIL = System.currentTimeMillis();
        boolean z5 = false;
        c1772820wEa.LIZ = 0;
        if (c1774720wHe != null) {
            strLIZIZ = c1774720wHe.LIZIZ();
        } else {
            strLIZIZ = "";
        }
        c1772820wEa.LIZLLL = strLIZIZ;
        if (c1774720wHe != null) {
            strLIZ = c1774720wHe.LIZ();
        } else {
            strLIZ = null;
        }
        if (!Intrinsics.LJFF(strLIZ, "GECKO") && !Intrinsics.LJFF(strLIZ, "MEMORY") && !Intrinsics.LJFF(strLIZ, "BUILTIN")) {
            z3 = false;
        } else {
            z3 = true;
        }
        c1772820wEa.LJFF = z3;
        if (c1774720wHe != null && c1774720wHe.LJIIJ) {
            z4 = true;
        } else {
            z4 = false;
        }
        c1772820wEa.LJIILIIL = z4;
        if (c1774720wHe != null && c1774720wHe.LJIIIZ) {
            z5 = true;
        }
        c1772820wEa.LJIIL = z5;
        c1772820wEa.LJIIJ = Integer.valueOf(i);
        c1772820wEa.LJIIJJI = str;
        if (z2) {
            C1772760wEU.LIZ.getClass();
            C1772760wEU.LIZIZ(c1772820wEa);
        }
    }
}
