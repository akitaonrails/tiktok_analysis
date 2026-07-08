package X;

import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.feed.IClickBackTimeService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.boc.IBOCFrequencyControlUtils;
import com.ss.android.ugc.aweme.commercialize.log.repo.adsession.SessionInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.performanceopt.api.IDowngradeApi;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cif, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1022670cif {
    public static final C1022670cif LIZ = new C1022670cif();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1023000cjC());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1022690cih());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C1017340ca4());
    public static final C01GW LJ = C452501pT.LIZIZ(new C1022740cim());
    public static final C01GW LJFF = C452501pT.LIZIZ(new C1013740cUG());
    public static final C01GW LJI = C452501pT.LIZIZ(new C1022710cij());
    public static final C01GW LJII = C452501pT.LIZIZ(new C1022700cii());
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(new C1022720cik());
    public static final C01GW LJIIIZ = C452501pT.LIZIZ(new C1022730cil());
    public static final C01GW LJIIJ;
    public static final C01GW LJIIJJI;

    static {
        IDowngradeApi iDowngradeApi = (IDowngradeApi) PluggableExtentionKt.pluggableSpi$default(IDowngradeApi.class, false, false, false, 14, null);
        if (iDowngradeApi != null) {
            iDowngradeApi.LJI(new C1023080cjK());
        }
        LJIIJ = C452501pT.LIZIZ(new C1022660cie());
        LJIIJJI = C452501pT.LIZIZ(new C1053820dWu());
    }

    public static InterfaceC1023010cjD LIZ() {
        return (InterfaceC1023010cjD) LIZIZ.getValue();
    }

    public static InterfaceC1022870ciz LIZIZ() {
        return new C1022840ciw(C1022860ciy.LIZ).LIZIZ(new InterfaceC1022890cj1<C1074600e4Q<String, String, CommonAdData, C1022820ciu>>() { // from class: X.0ciL
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1022890cj1
            public final void LIZ(C1074600e4Q c1074600e4Q) {
                AwemeRawAd awemeRawAd;
                Object objRemoveReusableExtraParam;
                Object objRemoveReusableExtraParam2;
                C c = c1074600e4Q.LIZJ;
                C1022820ciu c1022820ciu = (C1022820ciu) c1074600e4Q.LIZLLL;
                CommonAdData commonAdData = (CommonAdData) c;
                if ((commonAdData instanceof AwemeRawAd) && (awemeRawAd = (AwemeRawAd) commonAdData) != null && (objRemoveReusableExtraParam = awemeRawAd.removeReusableExtraParam("expose_from")) != null && (objRemoveReusableExtraParam2 = awemeRawAd.removeReusableExtraParam("expose_page")) != null) {
                    c1022820ciu.LIZ(C2097608Jq.LJIIIIZZ(new Pair("expose_from", objRemoveReusableExtraParam), new Pair("expose_page", objRemoveReusableExtraParam2)));
                }
            }
        }).LIZIZ(new InterfaceC1022890cj1<C1074600e4Q<String, String, CommonAdData, C1022820ciu>>() { // from class: X.0ciR
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1022890cj1
            public final void LIZ(C1074600e4Q c1074600e4Q) {
                ((C1022820ciu) c1074600e4Q.LIZLLL).LIZ(new C1022590ciX().LIZ());
            }
        }).LIZIZ(new InterfaceC1022890cj1<C1074600e4Q<String, String, CommonAdData, C1022820ciu>>() { // from class: X.0ciP
            public final C01GW LIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(425));
            public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(426));

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1022890cj1
            public final void LIZ(C1074600e4Q c1074600e4Q) {
                String str;
                A a = c1074600e4Q.LIZ;
                B b = c1074600e4Q.LIZIZ;
                C1022820ciu c1022820ciu = (C1022820ciu) c1074600e4Q.LIZLLL;
                String str2 = (String) b;
                String str3 = (String) a;
                Object objLJFF = c1022820ciu.LJFF("refer");
                Aweme awemeFr = null;
                if (!(objLJFF instanceof String) || (str = (String) objLJFF) == null) {
                    str = "";
                }
                String str4 = c1022820ciu.LIZJ;
                if (Intrinsics.LJFF(str2, "click") || Intrinsics.LJFF(str2, "realtime_click")) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[recordClickIfNeeded] label=");
                    sbLIZ.append(str2);
                    sbLIZ.append(", creativeId=");
                    sbLIZ.append(str4);
                    sbLIZ.append(", refer=");
                    sbLIZ.append(str);
                    sbLIZ.append(", tag=");
                    sbLIZ.append(str3);
                    C1022620cia.LIZ("ClickBackTime", C2188811AlT.LIZIZ(sbLIZ));
                    IAwemeService iAwemeService = (IAwemeService) this.LIZ.getValue();
                    if (iAwemeService != null) {
                        awemeFr = iAwemeService.Fr(str4);
                    }
                    IClickBackTimeService iClickBackTimeService = (IClickBackTimeService) this.LIZIZ.getValue();
                    if (iClickBackTimeService != null) {
                        iClickBackTimeService.LIZIZ(awemeFr, str, str3);
                    }
                }
                if (C293340Bee.LIZIZ) {
                    C1022420ciG c1022420ciG = new C1022420ciG(true, c1022820ciu.LIZ, C1022550ciT.LIZ(str2), str, c1022820ciu.LIZJ, null, c1022820ciu, 32);
                    if (C293340Bee.LIZJ) {
                        Map mapLIZ = C1023060cjI.LIZ(c1022420ciG);
                        if (!mapLIZ.isEmpty()) {
                            c1022820ciu.LIZ(mapLIZ);
                        }
                    }
                }
            }
        }).LIZIZ(new InterfaceC1022890cj1<C1074600e4Q<String, String, CommonAdData, C1022820ciu>>() { // from class: X.0ciQ
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1022890cj1
            public final void LIZ(C1074600e4Q c1074600e4Q) {
                int boc3pCookieAction;
                AwemeRawAd awemeRawAd;
                B b = c1074600e4Q.LIZIZ;
                CommonAdData commonAdData = (CommonAdData) c1074600e4Q.LIZJ;
                C1022820ciu c1022820ciu = (C1022820ciu) c1074600e4Q.LIZLLL;
                if (((Boolean) C276430AsT.LIZ.getValue()).booleanValue() && C1022540ciS.LIZ.contains(b)) {
                    try {
                        Long lValueOf = null;
                        IBOCFrequencyControlUtils iBOCFrequencyControlUtils = (IBOCFrequencyControlUtils) PluggableExtentionKt.pluggableSpi$default(IBOCFrequencyControlUtils.class, false, false, false, 14, null);
                        if (iBOCFrequencyControlUtils != null) {
                            lValueOf = Long.valueOf(iBOCFrequencyControlUtils.LJ());
                        }
                        c1022820ciu.LIZIZ(lValueOf, "last_open_boc_ts");
                        if ((commonAdData instanceof AwemeRawAd) && (awemeRawAd = (AwemeRawAd) commonAdData) != null) {
                            boc3pCookieAction = awemeRawAd.getBoc3pCookieAction();
                        } else {
                            boc3pCookieAction = -1;
                        }
                        c1022820ciu.LIZIZ(Integer.valueOf(boc3pCookieAction), "boc_3p_cookie_action");
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
        });
    }

    public static SessionInfo LIZJ(String str) {
        SessionInfo sessionInfoLIZIZ = LIZ().LIZIZ(str);
        if (sessionInfoLIZIZ == null) {
            return null;
        }
        return SessionInfo.LIZ(sessionInfoLIZIZ, null, 15);
    }
}
