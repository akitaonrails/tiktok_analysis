package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.network.model.LogPbBean;
import com.ss.android.ugc.tiktok.tpsc.core.render.TPSCRenderManager;
import java.util.Map;

/* JADX INFO: renamed from: X.102p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C191821102p {
    public static boolean LIZIZ;
    public static final C01GW LIZ = C452501pT.LIZIZ(new C191822102q());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C191823102r());

    public static void LIZ() {
        if (LIZIZ) {
            return;
        }
        LIZIZ = true;
        InterfaceC1888940zFs interfaceC1888940zFs = new InterfaceC1888940zFs() { // from class: X.102l
            @Override // X.InterfaceC1888940zFs
            public final String LIZLLL() {
                C191819102n.LIZ.getClass();
                return C191819102n.LIZIZ();
            }

            @Override // X.InterfaceC1888940zFs
            public final C19482711Kf LIZ(C11NZ c11nz, String str, Map map) {
                return C632140Oqq.LIZLLL(c11nz, str, map);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [X.0zyT] */
            @Override // X.InterfaceC1888940zFs
            public final C1916590zyT LIZIZ(final InterfaceC1518350pc9 interfaceC1518350pc9, final String str, final Map map) {
                final long jCurrentTimeMillis = System.currentTimeMillis();
                return new InterfaceC1518350pc9<Object>() { // from class: X.0zyT
                    @Override // X.InterfaceC1518350pc9
                    public final void LIZ(C1518330pc7<Object> c1518330pc7) {
                        BaseResponse.ServerTimeExtra serverTimeExtra;
                        String str2;
                        String str3;
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        C632140Oqq.LIZJ(jCurrentTimeMillis2, str, map);
                        String str4 = str;
                        Object obj = c1518330pc7.LIZ;
                        Map<String, String> map2 = map;
                        if (ComplianceServiceProvider.LJIJJ().LJJ()) {
                            String str5 = "";
                            if (obj instanceof com.ss.android.ugc.aweme.network.model.BaseResponse) {
                                LogPbBean logPb = ((com.ss.android.ugc.aweme.network.model.BaseResponse) obj).getLogPb();
                                if (logPb != null && (str3 = logPb.imprId) != null) {
                                    str5 = str3;
                                }
                            } else if ((obj instanceof BaseResponse) && (serverTimeExtra = ((BaseResponse) obj).extra) != null && (str2 = serverTimeExtra.logid) != null) {
                                str5 = str2;
                            }
                            C1227904rF.LIZ.getClass();
                            C589840NBm.LIZJ(jCurrentTimeMillis2, str4, str5, GsonProtectorUtils.toJson(C1227904rF.LIZLLL(), obj), map2);
                        }
                        interfaceC1518350pc9.LIZ(c1518330pc7);
                    }

                    @Override // X.InterfaceC1518350pc9
                    public final void onError(Throwable th) {
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        C632140Oqq.LIZIZ(jCurrentTimeMillis2, str, th, map);
                        String str2 = str;
                        Map<String, String> map2 = map;
                        if (ComplianceServiceProvider.LJIJJ().LJJ()) {
                            C1227904rF.LIZ.getClass();
                            C589840NBm.LIZIZ(str2, jCurrentTimeMillis2, th, map2, GsonProtectorUtils.toJson(C1227904rF.LIZLLL(), th));
                        }
                        interfaceC1518350pc9.onError(th);
                    }
                };
            }

            @Override // X.InterfaceC1888940zFs
            public final <T> C11NZ<T> LIZJ(C11NZ<T> c11nz, String str, Map<String, String> map) {
                if (ComplianceServiceProvider.LJIJJ().LJJ()) {
                    return C11NZ.LJIJJLI(new C1852020yIK(c11nz, str, map));
                }
                return c11nz;
            }
        };
        C191824102s c191824102s = new C191824102s("/tiktok/privacy/setting/restriction/v1", "/tiktok/privacy/agreement/record/agree/v1", "/tiktok/privacy/user/settings/v2", "/tiktok/privacy/user/settings/update/v1", "/tiktok/privacy/user/effected_count/v1");
        C191871104n.LJII = interfaceC1888940zFs;
        C191871104n.LJI = c191824102s;
    }

    public static C191880104w LIZIZ() {
        return (C191880104w) LIZ.getValue();
    }

    public static TPSCRenderManager LIZJ() {
        return (TPSCRenderManager) LIZJ.getValue();
    }
}
