package X;

import android.content.Context;
import com.android.billingclient.api.Purchase;
import com.bytedance.i18n.region.RegionManager;
import com.bytedance.i18n.region.privacy.PrivacyDataInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.legoImp.task.region.RegionInitTask;
import com.ss.android.ugc.aweme.legoImp.task.region.RegionSdkConfigModel;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS297S0000000_13;
import kotlin.jvm.internal.AwS428S0200000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wsk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1797720wsk extends C09AY implements Function0<Unit> {
    public final /* synthetic */ RegionSdkConfigModel LL;
    public final /* synthetic */ C1798100wtM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1797720wsk(RegionSdkConfigModel regionSdkConfigModel, C1798100wtM c1798100wtM) {
        super(0);
        this.LL = regionSdkConfigModel;
        this.LLILLJJLI = c1798100wtM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C818740W9w c818740W9w;
        C1797890wt1 c1797890wt1;
        C1884707Zt c1884707Zt;
        C1797880wt0 c1797880wt0;
        C1798060wtI c1798060wtI = C1798060wtI.LIZ;
        PrivacyDataInterceptor privacyDataInterceptor = (!C1797750wsn.LIZIZ.get() || (c1797880wt0 = C1797750wsn.LIZJ) == null) ? null : new PrivacyDataInterceptor(c1797880wt0, c1797880wt0.LIZ.LJIIIIZZ);
        if (privacyDataInterceptor != null && (c1797890wt1 = this.LLILLJJLI.LJIILIIL) != null && (c1884707Zt = c1797890wt1.LJIIIIZZ) != null && c1884707Zt.LIZIZ) {
            C1515120pWw.LIZIZ(privacyDataInterceptor);
        }
        RegionInitTask.LL.getClass();
        C596970NbD.LIZIZ.LIZ(EnumC1733330vCt.REGION_SYNC_BIZ, new InterfaceC596980NbE() { // from class: X.0wtD
            @Override // X.InterfaceC596980NbE
            public final void LJ(C1525630pnt c1525630pnt) {
                Object c098200Yq;
                Object c098200Yq2;
                Object c098200Yq3;
                C1797880wt0 c1797880wt02;
                String str = new String(c1525630pnt.LIZ, Charsets.UTF_8);
                try {
                    c098200Yq = new JSONObject(str).optString("command");
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Object obj = null;
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                if (Intrinsics.LJFF(c098200Yq, "region_update")) {
                    try {
                        c098200Yq2 = C818110W7l.LIZ(new JSONObject(str));
                        C189200o6.m2constructorimpl(c098200Yq2);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        c098200Yq2 = new C098200Yq(th2);
                        C189200o6.m2constructorimpl(c098200Yq2);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                        c098200Yq2 = null;
                    }
                    C818120W7m c818120W7m = (C818120W7m) c098200Yq2;
                    if (c818120W7m != null && Intrinsics.LJFF(c818120W7m.LIZ, "region_update")) {
                        C1798060wtI c1798060wtI2 = C1798060wtI.LIZ;
                        AFwS297S0000000_13 aFwS297S0000000_13 = AFwS297S0000000_13.get$arr$(0);
                        C1798060wtI.LJII = c818120W7m;
                        C1798020wtE c1798020wtE = EnumC1798030wtF.Companion;
                        String str2 = c818120W7m.LIZIZ;
                        c1798020wtE.getClass();
                        Iterator<EnumC1798030wtF> it2 = EnumC1798030wtF.getEntries().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            EnumC1798030wtF next = it2.next();
                            if (Intrinsics.LJFF(next.getValue(), str2)) {
                                obj = next;
                                break;
                            }
                        }
                        EnumC1798030wtF enumC1798030wtF = (EnumC1798030wtF) obj;
                        if (enumC1798030wtF == null) {
                            enumC1798030wtF = EnumC1798030wtF.UNKNOWN;
                        }
                        C1798060wtI.LJFF(enumC1798030wtF, aFwS297S0000000_13);
                        return;
                    }
                    return;
                }
                if (Intrinsics.LJFF(c098200Yq, "privacy_data_loader")) {
                    C1284300jWe.LIZJ.getClass();
                    try {
                        c098200Yq3 = C1284290jWd.LIZ(new JSONObject(str));
                        C189200o6.m2constructorimpl(c098200Yq3);
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        c098200Yq3 = new C098200Yq(th3);
                        C189200o6.m2constructorimpl(c098200Yq3);
                    }
                    if (!C189200o6.m7isFailureimpl(c098200Yq3)) {
                        obj = c098200Yq3;
                    }
                    C1284300jWe c1284300jWe = (C1284300jWe) obj;
                    if (c1284300jWe != null && (c1797880wt02 = C1797750wsn.LIZJ) != null) {
                        C421590Gg1.LIZ(new AwS428S0200000_27(c1797880wt02, c1284300jWe, 105));
                    }
                }
            }
        });
        C1797880wt0 c1797880wt02 = C1797750wsn.LIZJ;
        if (c1797880wt02 != null) {
            C421590Gg1.LIZ(new AwS571S0100000_27(c1797880wt02, 1409));
        }
        if (this.LL.enableGpRegion) {
            RegionManager regionManager = C1798060wtI.LIZJ;
            if (C1798060wtI.LIZIZ() && regionManager != null) {
                Context context = regionManager.LIZ.LIZ;
                C818740W9w c818740W9w2 = regionManager.LJIIJJI;
                Context contextN3 = C786410Ut5.N3(context);
                if (C1796780wrE.LJFF == null) {
                    C1796780wrE.LJFF = c818740W9w2;
                }
                AtomicReference<String> atomicReference = C1796780wrE.LIZ;
                if (atomicReference.get() == null && (c818740W9w = C1796780wrE.LJFF) != null) {
                    String string = c818740W9w.LIZ.getString("gp_region", "");
                    String str = string != null ? string : "";
                    if (str.length() > 0) {
                        atomicReference.set(str);
                        C1796780wrE.LIZIZ.set(true);
                    }
                }
                AtomicBoolean atomicBoolean = C1796780wrE.LIZJ;
                atomicBoolean.get();
                if (C1796780wrE.LIZLLL.compareAndSet(false, true)) {
                    atomicBoolean.set(false);
                    C1796780wrE.LJ.set(false);
                    try {
                        C1797800wss c1797800wss = new C1797800wss(contextN3);
                        c1797800wss.LIZJ = new InterfaceC1796100wq8() { // from class: X.0wqi
                            @Override // X.InterfaceC1796100wq8
                            public final void LIZJ(C19885612rG c19885612rG, List<Purchase> list) {
                            }
                        };
                        C1795990wpx c1795990wpx = new C1795990wpx();
                        c1795990wpx.LIZ = true;
                        c1797800wss.LIZ = c1795990wpx.LIZ();
                        C1BAY c1bayLIZ = c1797800wss.LIZ();
                        C1796760wrC c1796760wrC = new C1796760wrC(c1bayLIZ, null);
                        C786410Ut5.LJLIIL(10000L, C404501hj.LIZ, c1796760wrC.LIZJ);
                        c1bayLIZ.LJIILIIL(c1796760wrC.LIZLLL);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C1796780wrE.LIZ(null, null, null);
                    }
                }
            }
        }
        C822890WPv.LIZJ(new C0WQ1() { // from class: X.0wsm
            @Override // X.C0WQ1
            public final void LIZ() {
                C1797880wt0 c1797880wt03;
                C822890WPv c822890WPv = C822890WPv.LIZ;
                if (!C822920WPy.LIZLLL(0L)) {
                    C1798060wtI c1798060wtI2 = C1798060wtI.LIZ;
                    C1798060wtI.LIZJ();
                    return;
                }
                C1798060wtI c1798060wtI3 = C1798060wtI.LIZ;
                C1798060wtI.LJIIIIZZ.set(false);
                if (!C1798060wtI.LIZIZ() || (c1797880wt03 = C1797750wsn.LIZJ) == null) {
                    return;
                }
                C421590Gg1.LIZ(new AwS571S0100000_27(c1797880wt03, 1405));
            }
        });
        RegionInitTask.LL.getClass();
        C822920WPy.LJ(new InterfaceC822930WPz() { // from class: X.0wsl
            @Override // X.InterfaceC822930WPz
            public final void LIZ() {
            }

            @Override // X.InterfaceC822930WPz
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC822930WPz
            public final void onAppBackground() {
                C1797880wt0 c1797880wt03;
                C1798060wtI c1798060wtI2 = C1798060wtI.LIZ;
                C1798060wtI.LJIIIIZZ.set(false);
                if (!C1798060wtI.LIZIZ() || (c1797880wt03 = C1797750wsn.LIZJ) == null) {
                    return;
                }
                C421590Gg1.LIZ(new AwS571S0100000_27(c1797880wt03, 1405));
            }

            @Override // X.InterfaceC822930WPz
            public final void onAppForeground() {
                C1798060wtI c1798060wtI2 = C1798060wtI.LIZ;
                C1798060wtI.LIZJ();
            }
        });
        return Unit.LIZ;
    }
}
