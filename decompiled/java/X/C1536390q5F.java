package X;

import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.bytedance.lynx.hybrid.settings.HybridSettings;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.forestx.RequestParamsX;
import kotlin.Unit;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0q5F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1536390q5F {
    public static boolean LIZ;
    public static long LIZIZ;
    public static String LIZJ;

    static {
        Unit unit;
        try {
            JSONObject config = HybridSettings.INSTANCE.getConfig("hybrid_starling_resource_preload_config");
            if (config != null) {
                LIZ = config.optInt("enable", 1) != 0;
                LIZIZ = config.optLong("max_block_duration", 3000L);
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        HybridSettings.INSTANCE.registerSettings("hybrid_starling_resource_preload_config", new InterfaceC1701080uMs() { // from class: X.0q5M
            @Override // X.InterfaceC1701080uMs
            public final void LIZIZ(String str) {
            }

            @Override // X.InterfaceC1701080uMs
            public final void LIZ(String str, JSONObject jSONObject) {
                boolean z = C1536390q5F.LIZ;
                boolean z2 = true;
                if (jSONObject.optInt("enable", 1) == 0) {
                    z2 = false;
                }
                C1536390q5F.LIZ = z2;
                C1536390q5F.LIZIZ = jSONObject.optLong("max_block_duration", 3000L);
            }

            @Override // X.InterfaceC1701080uMs
            public final void LIZJ(String str, JSONObject jSONObject) {
                boolean z = C1536390q5F.LIZ;
                boolean z2 = false;
                if (jSONObject != null && jSONObject.optInt("enable", 1) == 0) {
                    z2 = true;
                }
                C1536390q5F.LIZ = !z2;
                long jOptLong = 3000;
                if (jSONObject != null) {
                    jOptLong = jSONObject.optLong("max_block_duration", 3000L);
                }
                C1536390q5F.LIZIZ = jOptLong;
            }
        });
        LIZ = true;
        LIZIZ = 3000L;
    }

    public static String LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lynx_i18n://");
        sbLIZ.append(str);
        sbLIZ.append("/lang.json");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZIZ(C1537480q70 c1537480q70) {
        String str;
        String str2 = LIZJ;
        if (str2 == null) {
            Object obj = c1537480q70.runtimeInfo.get((Object) "appLanguage");
            if (!(obj instanceof String) || (str = (String) obj) == null) {
                C1546210qL5.LIZ.getClass();
                return (String) ListProtector.get(a0.LJJLIIIJ(C1546210qL5.LIZIZ(), new char[]{'-'}, false, 0, 6), 0);
            }
            return str;
        }
        return str2;
    }

    public static String LIZLLL(String str) {
        if (!u.LJJIIJZLJL(str, "https://", false) && !u.LJJIIJZLJL(str, "http://", false)) {
            Forest.Companion companion = Forest.Companion;
            String strAssembleGeckoCDNUrl = companion.assembleGeckoCDNUrl(C1535630q41.LJIIJJI, str, "lang.json", EnumC1534520q2E.TARGET);
            if (strAssembleGeckoCDNUrl == null) {
                String strAssembleGeckoCDNUrl2 = companion.assembleGeckoCDNUrl(C1535630q41.LJIIJJI, str, "lang.json", EnumC1534520q2E.FALLBACK);
                if (strAssembleGeckoCDNUrl2 == null) {
                    String strAssembleGeckoCDNUrl3 = companion.assembleGeckoCDNUrl(C1535630q41.LJIIJJI, str, "lang.json", EnumC1534520q2E.I18N);
                    if (strAssembleGeckoCDNUrl3 == null) {
                        return LIZ(str);
                    }
                    return strAssembleGeckoCDNUrl3;
                }
                return strAssembleGeckoCDNUrl2;
            }
            return strAssembleGeckoCDNUrl;
        }
        return str;
    }

    public static boolean LJFF(C1537480q70 c1537480q70) {
        HybridSchemaParam hybridSchemaParamLIZJ;
        String starlingChannel;
        if (!LIZ) {
            C1490740otc.LIZIZ(C1490740otc.LIZ, "preload i18n resource disabled", null, "LYNX_I18N", 2);
            return true;
        }
        InterfaceC1531560pxS interfaceC1531560pxS = c1537480q70.hybridParams;
        if (interfaceC1531560pxS != null && (hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ()) != null && (starlingChannel = hybridSchemaParamLIZJ.getStarlingChannel()) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(starlingChannel);
            sbLIZ.append("__");
            sbLIZ.append(LIZIZ(c1537480q70));
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (strLIZIZ != null) {
                C1533020pzo c1533020pzoLJIILJJIL = C1537480q70.LJIILJJIL(c1537480q70, false, null, 3);
                if (c1533020pzoLJIILJJIL != null) {
                    RequestParamsX requestParamsX = new RequestParamsX(EnumC1533980q1M.LYNX_I18N, byte[].class);
                    requestParamsX.waitGeckoUpdate = false;
                    requestParamsX.channel = strLIZIZ;
                    requestParamsX.bundle = "lang.json";
                    requestParamsX.waitLowStorageUpdate = true;
                    requestParamsX.source = "LYNX_I18N";
                    requestParamsX.groupId = c1537480q70.containerId;
                    c1533020pzoLJIILJJIL.LIZJ(LIZLLL(strLIZIZ), requestParamsX, null);
                    return true;
                }
                RequestParams requestParams = new RequestParams(EnumC1533980q1M.LYNX_I18N);
                requestParams.waitGeckoUpdate = false;
                Boolean bool = Boolean.FALSE;
                requestParams.needLocalFile = bool;
                requestParams.enableMemoryCache = Boolean.TRUE;
                requestParams.loadToMemory = true;
                requestParams.channel = strLIZIZ;
                requestParams.bundle = "lang.json";
                requestParams.waitLowStorageUpdate = true;
                JSONArray jSONArray = C1533710q0v.LIZ;
                IResourceServiceX iResourceServiceXLIZIZ = C1533710q0v.LIZIZ(c1537480q70, false);
                if (iResourceServiceXLIZIZ == null) {
                    C1490740otc.LIZIZ(C1490740otc.LIZ, "cannot get resource service", null, "LYNX_I18N", 2);
                    return true;
                }
                if (iResourceServiceXLIZIZ instanceof C1533840q18) {
                    String strLIZLLL = LIZLLL(strLIZIZ);
                    requestParams.enableMemoryCache = bool;
                    iResourceServiceXLIZIZ.preload(strLIZLLL, requestParams, null);
                    return true;
                }
                C086F c086f = C086F.LIZ;
                C1535400q3e c1535400q3e = new C1535400q3e(iResourceServiceXLIZIZ, strLIZIZ, requestParams);
                c086f.getClass();
                C086F.LJI(c1535400q3e);
                return true;
            }
        }
        return false;
    }

    public static void LJII(String str) {
        LIZJ = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r4 == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1536410q5H LIZJ(X.C1537480q70 r3, java.lang.String r4) {
        /*
            boolean r0 = X.C1536390q5F.LIZ
            r2 = 0
            if (r0 != 0) goto L6
            return r2
        L6:
            java.lang.Class<X.0q5H> r0 = X.C1536410q5H.class
            java.lang.Object r1 = r3.LJFF(r0)
            X.0q5H r1 = (X.C1536410q5H) r1
            if (r1 == 0) goto L1b
            if (r4 == 0) goto L1a
            java.lang.String r0 = r1.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r4)
            if (r0 == 0) goto L47
        L1a:
            return r1
        L1b:
            if (r4 != 0) goto L47
            X.0pxS r0 = r3.hybridParams
            if (r0 == 0) goto L46
            com.bytedance.lynx.hybrid.param.HybridSchemaParam r0 = r0.LIZJ()
            if (r0 == 0) goto L46
            java.lang.String r0 = r0.getStarlingChannel()
            if (r0 == 0) goto L46
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r0)
            java.lang.String r0 = "__"
            r1.append(r0)
            java.lang.String r0 = LIZIZ(r3)
            r1.append(r0)
            java.lang.String r4 = X.C2188811AlT.LIZIZ(r1)
            if (r4 != 0) goto L47
        L46:
            return r2
        L47:
            X.0q5H r1 = new X.0q5H
            r1.<init>(r4)
            java.lang.Class<X.0q5H> r0 = X.C1536410q5H.class
            r3.LJJ(r0, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1536390q5F.LIZJ(X.0q70, java.lang.String):X.0q5H");
    }

    public static void LJI(C1537480q70 c1537480q70, long j) {
        HybridSchemaParam hybridSchemaParamLIZJ;
        C1536410q5H c1536410q5HLIZJ;
        if (!LIZ) {
            return;
        }
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("block time recorded: ");
        sbLIZ.append(j);
        C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, "LYNX_I18N", 2);
        InterfaceC1531560pxS interfaceC1531560pxS = c1537480q70.hybridParams;
        if (interfaceC1531560pxS != null && (hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ()) != null && hybridSchemaParamLIZJ.getStarlingFallback() && (c1536410q5HLIZJ = LIZJ(c1537480q70, null)) != null) {
            c1536410q5HLIZJ.LIZJ = j;
        }
    }

    public static void LJIIIIZZ(C1537480q70 c1537480q70, Runnable runnable) {
        HybridSchemaParam hybridSchemaParamLIZJ;
        String strLIZIZ;
        InterfaceC1531560pxS interfaceC1531560pxS = c1537480q70.hybridParams;
        if (interfaceC1531560pxS != null) {
            hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ();
        } else {
            hybridSchemaParamLIZJ = null;
        }
        C086F.LIZ.getClass();
        boolean zLIZ = C086F.LIZ();
        if (LIZ && hybridSchemaParamLIZJ != null) {
            String starlingChannel = hybridSchemaParamLIZJ.getStarlingChannel();
            if (starlingChannel != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(starlingChannel);
                sbLIZ.append("__");
                sbLIZ.append(LIZIZ(c1537480q70));
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                strLIZIZ = null;
            }
            boolean starlingFallback = hybridSchemaParamLIZJ.getStarlingFallback();
            if (strLIZIZ != null && starlingFallback) {
                JSONArray jSONArray = C1533710q0v.LIZ;
                IResourceServiceX iResourceServiceXLIZIZ = C1533710q0v.LIZIZ(c1537480q70, false);
                if (iResourceServiceXLIZIZ == null) {
                    C1490740otc.LIZIZ(C1490740otc.LIZ, "cannot get resource service", null, "LYNX_I18N", 2);
                    runnable.run();
                    return;
                }
                final C1536400q5G c1536400q5G = new C1536400q5G(new C013C(), c1537480q70, runnable);
                if (zLIZ) {
                    C086F.LIZIZ(LIZIZ, new Runnable() { // from class: X.0q5I
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ2;
                            C1C7U.LIZ("LynxI18nUtils@8acb.tryFetchCache$1");
                            try {
                                c1536400q5G.invoke(Boolean.TRUE);
                            } finally {
                                if (!zLIZ2) {
                                }
                            }
                            C1C7U.LIZIZ("LynxI18nUtils@8acb.tryFetchCache$1");
                        }
                    });
                } else {
                    C086F.LIZJ(LIZIZ, new Runnable() { // from class: X.0q5J
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ2;
                            C1C7U.LIZ("LynxI18nUtils@8acb.tryFetchCache$2");
                            try {
                                c1536400q5G.invoke(Boolean.TRUE);
                            } finally {
                                if (!zLIZ2) {
                                }
                            }
                            C1C7U.LIZIZ("LynxI18nUtils@8acb.tryFetchCache$2");
                        }
                    });
                }
                C1533020pzo c1533020pzoLJIILJJIL = C1537480q70.LJIILJJIL(c1537480q70, false, null, 3);
                if (c1533020pzoLJIILJJIL != null) {
                    RequestParamsX requestParamsX = new RequestParamsX(EnumC1533980q1M.LYNX_I18N, byte[].class);
                    requestParamsX.channel = strLIZIZ;
                    requestParamsX.bundle = "lang.json";
                    requestParamsX.fetcherSequence = C13BV.INSTANCE;
                    requestParamsX.disablePrefixParser = true;
                    requestParamsX.disableCdn = true;
                    requestParamsX.disableAssets = true;
                    requestParamsX.disableGecko = true;
                    requestParamsX.groupId = c1537480q70.containerId;
                    requestParamsX.source = "LYNX_I18N";
                    c1533020pzoLJIILJJIL.LIZ(LIZLLL(strLIZIZ), requestParamsX, new C1536440q5K(c1537480q70, zLIZ, c1536400q5G));
                    return;
                }
                RequestParams requestParams = new RequestParams(EnumC1533980q1M.LYNX_I18N);
                requestParams.channel = strLIZIZ;
                requestParams.bundle = "lang.json";
                requestParams.fetcherSequence = C13BV.INSTANCE;
                requestParams.enableRequestReuse = true;
                requestParams.disablePrefixParser = true;
                requestParams.disableCdn = true;
                requestParams.disableBuiltin = true;
                requestParams.disableOffline = true;
                requestParams.loadToMemory = true;
                requestParams.needLocalFile = Boolean.FALSE;
                iResourceServiceXLIZIZ.fetchResourceAsyncIfNeed(LIZLLL(strLIZIZ), requestParams, new C1536450q5L(c1537480q70, zLIZ, c1536400q5G));
                return;
            }
            runnable.run();
            return;
        }
        runnable.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(X.C1537480q70 r17, X.C1533790q13 r18, X.C1532310pyf r19, boolean r20, long r21) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1536390q5F.LJ(X.0q70, X.0q13, X.0pyf, boolean, long):void");
    }
}
