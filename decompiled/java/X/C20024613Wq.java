package X;

import android.net.Uri;
import android.os.SystemClock;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.schema.EcSchemaVerifyRulesModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.ecommerce.debug.IEComOfflineService;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.13Wq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20024613Wq {
    public static final C20024613Wq LIZ = new C20024613Wq();

    public static String LIZIZ(String str) {
        boolean z;
        try {
            Uri uri = UriProtector.parse(str);
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "surl");
            boolean z2 = false;
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && !a0.LJJJIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
            }
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null || a0.LJJJIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                z2 = true;
            }
            if (!z2) {
                String path = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter).getPath();
                if (path == null) {
                    return "";
                }
                return path;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return "";
    }

    public static String LIZLLL(List list) {
        if (((ArrayList) list).isEmpty()) {
            return "";
        }
        return C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62);
    }

    public static void LJFF(String str, boolean z) {
        EcSchemaVerifyRulesModel ecSchemaVerifyRulesModel;
        EcSchemaVerifyRulesModel ecSchemaVerifyRulesModel2;
        if (str != null && !a0.LJJJIL(str)) {
            try {
                SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                ecSchemaVerifyRulesModel2 = C20024713Wr.LIZ;
                ecSchemaVerifyRulesModel = (EcSchemaVerifyRulesModel) settingsManagerLIZLLL.LJIIIIZZ("ec_schema_verify_rules", EcSchemaVerifyRulesModel.class, ecSchemaVerifyRulesModel2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                ecSchemaVerifyRulesModel = C20024713Wr.LIZ;
            }
            if (ecSchemaVerifyRulesModel != null) {
                ecSchemaVerifyRulesModel2 = ecSchemaVerifyRulesModel;
            }
            if (!ecSchemaVerifyRulesModel2.enableVerify) {
                return;
            }
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C20024413Wo(false, z, str, ecSchemaVerifyRulesModel2, null), 2);
        }
    }

    public static void LJ(EcSchemaVerifyRulesModel ecSchemaVerifyRulesModel, String str, List list) {
        try {
            Uri uri = UriProtector.parse(str);
            if (uri != null) {
                EcSchemaVerifyRulesModel.QueryRules queryRules = ecSchemaVerifyRulesModel.queryRules;
                for (String str2 : queryRules.ignoreKeyUri) {
                    if ((!a0.LJJJIL(str2)) && a0.LJJIIZI(str, str2, false)) {
                        return;
                    }
                }
                List<String> list2 = queryRules.keyUri;
                int i = queryRules.httpMaxLength;
                for (String str3 : list2) {
                    try {
                        List<String> queryParameters = UriProtector.getQueryParameters(uri, str3);
                        if (queryParameters != null && !queryParameters.isEmpty()) {
                            for (String str4 : queryParameters) {
                                if (str4 != null && !a0.LJJJIL(str4)) {
                                    if (i > 0 && str4 != null && u.LJJIIJZLJL(str4, "http", true) && str4.length() > i) {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append(str3);
                                        sbLIZ.append(" http too long: ");
                                        sbLIZ.append(str4.length());
                                        C2188811AlT.LIZIZ(sbLIZ);
                                        ((ArrayList) list).add(new C20024513Wp(31));
                                    }
                                    LJI(ecSchemaVerifyRulesModel, str4, list, str3);
                                    LJII(ecSchemaVerifyRulesModel, str4, list, str3);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public static void LJIIIIZZ(EcSchemaVerifyRulesModel ecSchemaVerifyRulesModel, String str, List list) {
        String authority;
        EcSchemaVerifyRulesModel.SchemaRules schemaRules = ecSchemaVerifyRulesModel.schemaRules;
        if (!schemaRules.blockWebcast) {
            return;
        }
        try {
            Uri uri = UriProtector.parse(str);
            if (uri == null || (authority = uri.getAuthority()) == null) {
                authority = "";
            }
            if (!u.LJJIIJZLJL(authority, "webcast_", false)) {
                return;
            }
            for (String str2 : schemaRules.ignoreWebcast) {
                if ((!a0.LJJJIL(str2)) && a0.LJJIIZI(str, str2, false)) {
                    return;
                }
            }
            ((ArrayList) list).add(new C20024513Wp(5));
            LIZIZ(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(com.ss.android.ugc.aweme.ecommerce.schema.EcSchemaVerifyRulesModel r8, java.lang.String r9, java.util.List r10, java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20024613Wq.LJI(com.ss.android.ugc.aweme.ecommerce.schema.EcSchemaVerifyRulesModel, java.lang.String, java.util.List, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015f  */
    /* JADX WARN: Type inference failed for: r13v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJII(com.ss.android.ugc.aweme.ecommerce.schema.EcSchemaVerifyRulesModel r18, java.lang.String r19, java.util.List r20, java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20024613Wq.LJII(com.ss.android.ugc.aweme.ecommerce.schema.EcSchemaVerifyRulesModel, java.lang.String, java.util.List, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
    
        r2 = com.bytedance.mt.protector.impl.UriProtector.parse(r11);
        r1 = X.C2188811AlT.LIZ();
        r1.append(r2.getAuthority());
        r1.append(r2.getPath());
        r2 = X.C2188811AlT.LIZIZ(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008f, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0092, code lost:
    
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0119, code lost:
    
        if (r13 != false) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Pair LIZ(com.ss.android.ugc.aweme.ecommerce.schema.EcSchemaVerifyRulesModel r10, java.lang.String r11, boolean r12, boolean r13, java.util.List r14) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20024613Wq.LIZ(com.ss.android.ugc.aweme.ecommerce.schema.EcSchemaVerifyRulesModel, java.lang.String, boolean, boolean, java.util.List):kotlin.Pair");
    }

    public static void LIZJ(EcSchemaVerifyRulesModel ecSchemaVerifyRulesModel, String str, String str2, List list, long j) {
        String string;
        IEComOfflineService iEComOfflineService;
        if (!a0.LJJJIL(str)) {
            ArrayList arrayList = (ArrayList) list;
            if (!arrayList.isEmpty()) {
                String string2 = list.toString();
                long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("schema", str);
                    jSONObject.put("page", str2);
                    jSONObject.put("errors", string2);
                    jSONObject.put("duration", jElapsedRealtime);
                    if (C7879035x.LIZLLL()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("error: ");
                        sbLIZ.append(jSONObject);
                        C2188811AlT.LIZIZ(sbLIZ);
                        C7879035x.LIZLLL();
                        List<Integer> list2 = ecSchemaVerifyRulesModel.debugRules.toastCode;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : arrayList) {
                            if (list2.contains(Integer.valueOf(((C20024513Wp) obj).LIZ))) {
                                arrayList2.add(obj);
                            }
                        }
                        if ((!arrayList2.isEmpty()) && (string = arrayList2.toString()) != null && !a0.LJJJIL(string) && (iEComOfflineService = (IEComOfflineService) ServiceManager.get().getService(IEComOfflineService.class)) != null) {
                            iEComOfflineService.LJFF();
                        }
                    }
                    C1507790pL7.LIZ.getClass();
                    C1507790pL7.LIZLLL("ec_schema_verify_error", jSONObject);
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return;
                }
            }
        }
        C7879035x.LIZLLL();
    }
}
