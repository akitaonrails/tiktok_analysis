package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.ab.EcPayResultPreloadSetting;
import com.ss.android.ugc.aweme.ecommerce.dependency.HybridDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: renamed from: X.0qOv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1548590qOv {
    public final String LIZ;
    public final List<String> LIZIZ;
    public final String LIZJ;
    public final C1548630qOz LIZLLL;
    public final AwS545S0100000_1 LJ;

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0qOz] */
    public C1548590qOv() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tt_ec_payment_result");
        sbLIZ.append("_prerender");
        this.LIZ = C2188811AlT.LIZIZ(sbLIZ);
        EcPayResultPreloadSetting.PreloadConfig preloadConfig = EcPayResultPreloadSetting.LIZ;
        List<String> list = preloadConfig.preloadAllowList;
        this.LIZIZ = list == null ? Collections.singletonList("fe_tiktok_ecommerce_pay_middle") : list;
        this.LIZJ = preloadConfig.schema;
        this.LIZLLL = new InterfaceC1508150pLh() { // from class: X.0qOz
            @Override // X.InterfaceC1508150pLh
            public final void LIZ() {
            }
        };
        this.LJ = new AwS545S0100000_1(this, 21);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.0qOw] */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.0pLg, X.0qOy] */
    public final void LIZ(String str) {
        AnonymousClass0317 anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin;
        String str2;
        boolean z;
        String name;
        if (C0N7Y.LIZ) {
            try {
                EcPayResultPreloadSetting.PreloadConfig preloadConfig = EcPayResultPreloadSetting.LIZ;
                Long l = preloadConfig.geckoVersion;
                if (l != null) {
                    long jLongValue = l.longValue();
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin = HybridDependencyService.createIHybridDependencyServicebyMonsterPlugin(false);
                        if (anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        String name2 = IHybridDependencyService.class.getName();
                        if (anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin != null) {
                            name = anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin.getClass().getName();
                        } else {
                            name = null;
                        }
                        C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IHybridDependencyService.class);
                    }
                    Long lLIZLLL = C1550610qSB.LIZLLL(((IHybridDependencyService) anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin).getAccessKey(), preloadConfig.channel);
                    if (lLIZLLL != null) {
                        long jLongValue2 = lLIZLLL.longValue();
                        if (jLongValue2 != 0 && jLongValue2 < jLongValue) {
                            return;
                        }
                    }
                    if (C123100dR.LIZ(str)) {
                        EcPayResultPreloadSetting.PreloadConfig preloadConfig2 = EcPayResultPreloadSetting.LIZ;
                        List<String> list = preloadConfig2.pmAllowList;
                        List<String> list2 = preloadConfig2.pmBlockList;
                        if (list2 != null && (!list2.isEmpty()) && list2.contains(str)) {
                            return;
                        }
                        if (list != null && (!list.isEmpty()) && !list.contains(str)) {
                            return;
                        }
                    }
                    EcPayResultPreloadSetting.PreloadConfig preloadConfig3 = EcPayResultPreloadSetting.LIZ;
                    if (preloadConfig3.preloadControlEnable) {
                        String str3 = preloadConfig3.channel;
                        String str4 = this.LIZ;
                        if (C0N7Y.LIZIZ) {
                            str2 = "view";
                        } else {
                            str2 = "view_create";
                        }
                        ?? r0 = new InterfaceC1548640qP0() { // from class: X.0qOw
                            @Override // X.InterfaceC1548640qP0
                            public final C1548630qOz execute() {
                                this.LIZ.LJ.invoke();
                                return this.LIZ.LIZLLL;
                            }
                        };
                        ?? r11 = new InterfaceC1508140pLg() { // from class: X.0qOy
                            @Override // X.InterfaceC1508140pLg
                            public final void onStateChange(int i) {
                            }
                        };
                        final C1548610qOx c1548610qOx = new C1548610qOx(str3, str4, str2, r0, 1, r11);
                        C1507990pLR c1507990pLR = new C1507990pLR(str4, "order_submit", str2, 2, 1, new InterfaceC1508110pLd() { // from class: X.0qOu
                            @Override // X.InterfaceC1508110pLd
                            public final InterfaceC1508150pLh LIZ(C1508120pLe c1508120pLe) {
                                HashMap<String, C1548510qOn> map = C1548520qOo.LIZ;
                                C1548610qOx c1548610qOx2 = c1548610qOx;
                                synchronized (map) {
                                    try {
                                        map.put(c1548610qOx2.LIZ, new C1548510qOn(c1508120pLe, c1548610qOx2.LIZIZ, "order_submit"));
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        throw th;
                                    }
                                }
                                return c1548610qOx.LIZJ.execute();
                            }
                        }, null, 1, r11, null, null, null, null, 6144);
                        C1507890pLH c1507890pLHLIZ = C1507890pLH.LIZJ.LIZ();
                        if (c1507890pLHLIZ != null) {
                            c1507890pLHLIZ.LIZIZ(c1507990pLR);
                            return;
                        }
                        return;
                    }
                    this.LJ.invoke();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }
}
