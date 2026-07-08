package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.service.resourcemanage.IDMResourceManagementService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.tiktok.ttm.TTMParamData;
import com.tiktok.ttm.ttmparam.ITTMParamData;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BBz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2200931BBz extends AbstractC207271168v {
    public static final C01GW<C2200931BBz> LIZLLL = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(81));
    public final String LIZIZ = "dm_resource_management";
    public final C01GW LIZJ;

    public C2200931BBz() {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(82));
        this.LIZJ = c01gwLIZIZ;
        if (((IDMResourceManagementService) ServiceManager.get().getService(IDMResourceManagementService.class)).LIZLLL()) {
            final C2200901BBw c2200901BBw = (C2200901BBw) c01gwLIZIZ.getValue();
            c2200901BBw.getClass();
            if (((IDMResourceManagementService) ServiceManager.get().getService(IDMResourceManagementService.class)).LIZLLL()) {
                C1BCA.LJIL(new C1BC6() { // from class: X.1BC5
                    @Override // X.InterfaceC1006670cIr
                    public final /* bridge */ /* synthetic */ void LJIIJ(C1514210pVT c1514210pVT, C1514210pVT c1514210pVT2) {
                    }
                });
                InterfaceC1006670cIr interfaceC1006670cIr = new InterfaceC1006670cIr() { // from class: X.0psa
                    @Override // X.InterfaceC1006670cIr
                    public final void LJIIJ(Object obj, Object obj2) {
                        C2200981BCe c2200981BCe = (C2200981BCe) obj2;
                        try {
                            c2200901BBw.getClass();
                            C2200981BCe c2200981BCe2 = new C2200981BCe();
                            c2200981BCe2.LIZ = c2200981BCe.LIZ;
                            c2200981BCe2.LIZIZ = c2200981BCe.LIZIZ;
                            ((AtomicReference) c2200901BBw.LIZ.getValue()).set(c2200981BCe2);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                };
                C2200821BBo.LIZ.getClass();
                if (!C2200821BBo.LIZ()) {
                    C2201101BCq.LJII(C1BC9.Net, interfaceC1006670cIr, false, 0L, null);
                }
                C1BCA.LJIILL(new C1BC2() { // from class: X.1BBy
                    @Override // X.InterfaceC1006670cIr
                    public final void LJIIJ(C1BC7 c1bc7, C1BC7 c1bc72) {
                        C1BC7 c1bc73 = c1bc72;
                        try {
                            c2200901BBw.getClass();
                            C1BC7 c1bc74 = new C1BC7();
                            c1bc74.LIZ = c1bc73.LIZ;
                            ((AtomicReference) c2200901BBw.LIZIZ.getValue()).set(c1bc74);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                });
                C1BCA.LJIIZILJ(new InterfaceC1702110uOX() { // from class: X.1Au7
                    @Override // X.InterfaceC1006670cIr
                    public final void LJIIJ(C1512840pTG c1512840pTG, C1512840pTG c1512840pTG2) {
                        try {
                            ((AtomicReference) c2200901BBw.LIZJ.getValue()).set(c1512840pTG2);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }, false, 0L);
                C1BCA.LJJ(new InterfaceC1702120uOY() { // from class: X.1BBx
                    @Override // X.InterfaceC1006670cIr
                    public final void LJIIJ(C1512820pTE c1512820pTE, C1512820pTE c1512820pTE2) {
                        C1512820pTE c1512820pTE3 = c1512820pTE2;
                        try {
                            c2200901BBw.getClass();
                            ((AtomicReference) c2200901BBw.LIZLLL.getValue()).set(C2200901BBw.LIZ(c1512820pTE3));
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }, false, 0L);
                C1BCA.LJIILLIIL(new C1BC1() { // from class: X.0qXl
                    @Override // X.InterfaceC1006670cIr
                    public final void LJIIJ(C1512930pTP c1512930pTP, C1512930pTP c1512930pTP2) {
                        C1512930pTP c1512930pTP3 = c1512930pTP2;
                        try {
                            c2200901BBw.getClass();
                            C1512930pTP c1512930pTP4 = new C1512930pTP();
                            c1512930pTP4.LIZIZ = c1512930pTP3.LIZIZ;
                            c1512930pTP4.LIZLLL = c1512930pTP3.LIZLLL;
                            c1512930pTP4.LJ = c1512930pTP3.LJ;
                            c1512930pTP4.LIZ = c1512930pTP3.LIZ;
                            ((AtomicReference) c2200901BBw.LJ.getValue()).set(c1512930pTP4);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                });
                C1BCA.LJJIIJ(new C1BC3() { // from class: X.0q5s
                    @Override // X.InterfaceC1006670cIr
                    public final void LJIIJ(C1512850pTH c1512850pTH, C1512850pTH c1512850pTH2) {
                        C1512850pTH c1512850pTH3 = c1512850pTH2;
                        try {
                            c2200901BBw.getClass();
                            C1512850pTH c1512850pTH4 = new C1512850pTH();
                            c1512850pTH4.LIZIZ = c1512850pTH3.LIZIZ;
                            c1512850pTH4.LIZJ = c1512850pTH3.LIZJ;
                            c1512850pTH4.LIZLLL = c1512850pTH3.LIZLLL;
                            c1512850pTH4.LIZ = c1512850pTH3.LIZ;
                            ((AtomicReference) c2200901BBw.LJFF.getValue()).set(c1512850pTH4);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }, false, 0L);
                C2201101BCq.LJII(C1BC9.PowerMode, new InterfaceC1006670cIr() { // from class: X.0q5t
                    @Override // X.InterfaceC1006670cIr
                    public final void LJIIJ(Object obj, Object obj2) {
                        C1514970pWh c1514970pWh = (C1514970pWh) obj2;
                        try {
                            c2200901BBw.getClass();
                            C1514970pWh c1514970pWh2 = new C1514970pWh(c1514970pWh.LIZIZ);
                            c1514970pWh2.LIZ = c1514970pWh.LIZ;
                            ((AtomicReference) c2200901BBw.LJI.getValue()).set(c1514970pWh2);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }, false, 0L, null);
                C2203431BLp.LIZIZ.LIZLLL(new C0XEZ() { // from class: X.0psZ
                    @Override // X.C0XEZ
                    public final void LIZ(C821280WJq c821280WJq, JSONObject jSONObject) {
                        try {
                            ((AtomicReference) c2200901BBw.LJII.getValue()).set(c821280WJq.LIZIZ);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                });
                c2200901BBw.LIZJ();
                C1610960s1W.LIZIZ.LIZ(new InterfaceC2204408kM() { // from class: X.1BC0
                    @Override // X.InterfaceC2204408kM
                    public final void LIZ() {
                        c2200901BBw.LIZJ();
                    }

                    @Override // X.InterfaceC2204408kM
                    public final void LIZIZ() {
                        c2200901BBw.LIZJ();
                    }
                });
                ((C1400340mXo) C0I0B.LJFF.LIZ()).LIZLLL(new InterfaceC908170Zjz() { // from class: X.1Au8
                    @Override // X.InterfaceC908170Zjz
                    public final void onAccountResult(int i, boolean z, int i2, User user) throws Exception {
                        try {
                            ((ConcurrentHashMap) c2200901BBw.LJIIIIZZ.getValue()).clear();
                            ((AtomicReference) c2200901BBw.LJIIIZ.getValue()).set(C13BV.INSTANCE);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            if (C169O.LIZIZ()) {
                                throw e;
                            }
                        }
                    }
                });
            }
        }
    }

    @Override // X.AbstractC207271168v
    public final String LJ() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC830880Wic
    public final TTMParamData LIZIZ(C830870Wib c830870Wib, String str, AnonymousClass1696 anonymousClass1696) {
        if (!((IDMResourceManagementService) ServiceManager.get().getService(IDMResourceManagementService.class)).LIZLLL()) {
            return null;
        }
        try {
            final C1514960pWg c1514960pWgLJ = ((C2200901BBw) this.LIZJ.getValue()).LJ();
            ((C2200901BBw) this.LIZJ.getValue()).getClass();
            final C829870Wgz c829870WgzLJFF = C2200901BBw.LJFF();
            final C829850Wgx c829850WgxLIZLLL = ((C2200901BBw) this.LIZJ.getValue()).LIZLLL(anonymousClass1696.LIZ);
            return new TTMParamData(new ITTMParamData(c1514960pWgLJ, c829870WgzLJFF, c829850WgxLIZLLL) { // from class: X.0Wgy
                public final C1514960pWg LIZIZ;
                public final C829870Wgz LIZJ;
                public final C829850Wgx LIZLLL;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C829860Wgy)) {
                        return false;
                    }
                    C829860Wgy c829860Wgy = (C829860Wgy) obj;
                    return Intrinsics.LJFF(this.LIZIZ, c829860Wgy.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c829860Wgy.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c829860Wgy.LIZLLL);
                }

                @Override // com.tiktok.ttm.ttmparam.ITTMParamData
                public final Object getInputData() {
                    return this;
                }

                public final int hashCode() {
                    C1514960pWg c1514960pWg = this.LIZIZ;
                    int iHashCode = (c1514960pWg == null ? 0 : c1514960pWg.hashCode()) * 31;
                    C829870Wgz c829870Wgz = this.LIZJ;
                    int iHashCode2 = (iHashCode + (c829870Wgz == null ? 0 : c829870Wgz.hashCode())) * 31;
                    C829850Wgx c829850Wgx = this.LIZLLL;
                    return iHashCode2 + (c829850Wgx != null ? c829850Wgx.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("DMResourceManagementContextModel(deviceAndAppStateModel=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(", userPortraitModel=");
                    sbLIZ.append(this.LIZJ);
                    sbLIZ.append(", conversationLayerPortrait=");
                    sbLIZ.append(this.LIZLLL);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                @Override // com.tiktok.ttm.ttmparam.ITTMParamData
                public final ITTMParamData getObjectItem(String str2) {
                    if (str2 == null) {
                        return null;
                    }
                    int iHashCode = str2.hashCode();
                    if (iHashCode != -130916797) {
                        if (iHashCode != 148444233) {
                            if (iHashCode != 297794552 || !str2.equals("deviceAndAppStateModel")) {
                                return null;
                            }
                            return this.LIZIZ;
                        }
                        if (!str2.equals("conversationLayerPortrait")) {
                            return null;
                        }
                        C829850Wgx c829850Wgx = this.LIZLLL;
                        if (c829850Wgx == null) {
                            return new C829850Wgx(null, null, null);
                        }
                        return c829850Wgx;
                    }
                    if (!str2.equals("userPortraitModel")) {
                        return null;
                    }
                    return this.LIZJ;
                }

                {
                    this.LIZIZ = c1514960pWgLJ;
                    this.LIZJ = c829870WgzLJFF;
                    this.LIZLLL = c829850WgxLIZLLL;
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
