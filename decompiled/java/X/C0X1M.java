package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.model.AllowApiConfig;
import com.ss.android.ugc.aweme.compliance.api.model.HeaderParamConfig;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0X1M, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X1M {
    /* JADX WARN: Removed duplicated region for block: B:11:0x001f A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0004, B:5:0x0008, B:7:0x0010, B:9:0x0017, B:12:0x003c, B:14:0x0040, B:11:0x001f), top: B:53:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.compliance.api.model.HeaderParamConfig LIZ() {
        /*
            java.lang.String r6 = X.C2222691Bz1.LIZ()
            com.ss.android.ugc.aweme.compliance.api.model.HeaderParamConfigSetting r0 = X.C0X1O.LIZJ     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L1f
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L43
            java.lang.Long r0 = X.C0X1O.LIZIZ     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L15
            long r0 = r0.longValue()     // Catch: java.lang.Throwable -> L43
            goto L17
        L15:
            r0 = 0
        L17:
            long r3 = r3 - r0
            r1 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L3c
        L1f:
            com.bytedance.ies.abmock.SettingsManager r2 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Throwable -> L43
            java.lang.String r1 = "header_param_config"
            java.lang.Class<com.ss.android.ugc.aweme.compliance.api.model.HeaderParamConfigSetting> r0 = com.ss.android.ugc.aweme.compliance.api.model.HeaderParamConfigSetting.class
            r2.getClass()     // Catch: java.lang.Throwable -> L43
            java.lang.Object r0 = com.bytedance.ies.abmock.SettingsManager.LJII(r1, r0)     // Catch: java.lang.Throwable -> L43
            com.ss.android.ugc.aweme.compliance.api.model.HeaderParamConfigSetting r0 = (com.ss.android.ugc.aweme.compliance.api.model.HeaderParamConfigSetting) r0     // Catch: java.lang.Throwable -> L43
            X.C0X1O.LIZJ = r0     // Catch: java.lang.Throwable -> L43
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L43
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L43
            X.C0X1O.LIZIZ = r0     // Catch: java.lang.Throwable -> L43
        L3c:
            com.ss.android.ugc.aweme.compliance.api.model.HeaderParamConfigSetting r0 = X.C0X1O.LIZJ     // Catch: java.lang.Throwable -> L43
            if (r0 != 0) goto L4d
            com.ss.android.ugc.aweme.compliance.api.model.HeaderParamConfigSetting r0 = X.C0X1O.LIZ     // Catch: java.lang.Throwable -> L43
            goto L4d
        L43:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.compliance.api.model.HeaderParamConfigSetting r0 = X.C0X1O.LIZJ
            if (r0 != 0) goto L4d
            com.ss.android.ugc.aweme.compliance.api.model.HeaderParamConfigSetting r0 = X.C0X1O.LIZ
        L4d:
            com.ss.android.ugc.aweme.compliance.api.model.HeaderParamConfig r4 = r0.f51default
            java.util.List<com.ss.android.ugc.aweme.compliance.api.model.HeaderParamConfig> r1 = r0.custom
            boolean r0 = X.C086I.LIZIZ(r1)
            r5 = 0
            r3 = 1
            if (r0 != 0) goto L9c
            java.util.Iterator r1 = r1.iterator()
        L5d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L9c
            java.lang.Object r2 = r1.next()
            com.ss.android.ugc.aweme.compliance.api.model.HeaderParamConfig r2 = (com.ss.android.ugc.aweme.compliance.api.model.HeaderParamConfig) r2
            java.util.Set<java.lang.String> r0 = r2.regions
            if (r0 == 0) goto L5d
            boolean r0 = r0.contains(r6)
            if (r0 != r3) goto L5d
            java.lang.Boolean r1 = r2.enable
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L9b
            java.lang.Integer r0 = r2.scope
            if (r0 == 0) goto L90
            X.0X1T r1 = com.ss.android.ugc.aweme.net.model.ScopeEnum.Companion
            int r0 = r0.intValue()
            r1.getClass()
            boolean r0 = X.C0X1T.LIZ(r0)
            if (r0 == 0) goto L9b
        L90:
            java.util.Set<java.lang.String> r0 = r2.denyKeys
            if (r0 == 0) goto L9b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L9b
            return r2
        L9b:
            return r5
        L9c:
            if (r4 == 0) goto Lc5
            java.lang.Boolean r1 = r4.enable
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto Lc5
            java.lang.Integer r0 = r4.scope
            if (r0 == 0) goto Lbb
            X.0X1T r1 = com.ss.android.ugc.aweme.net.model.ScopeEnum.Companion
            int r0 = r0.intValue()
            r1.getClass()
            boolean r0 = X.C0X1T.LIZ(r0)
            if (r0 == 0) goto Lc5
        Lbb:
            java.util.Set<java.lang.String> r0 = r4.denyKeys
            if (r0 == 0) goto Lc5
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lc6
        Lc5:
            return r5
        Lc6:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0X1M.LIZ():com.ss.android.ugc.aweme.compliance.api.model.HeaderParamConfig");
    }

    public static void LIZJ(C0X1N c0x1n) {
        try {
            JSONObject jSONObject = new JSONObject();
            String str = c0x1n.LIZLLL;
            if (str == null) {
                str = c0x1n.LIZJ;
            }
            Uri uri = UriProtector.parse(str);
            jSONObject.put("host", uri.getHost());
            jSONObject.put("path", uri.getPath());
            jSONObject.put("url", str);
            String str2 = c0x1n.LIZIZ;
            if (str2 != null && !a0.LJJJIL(str2)) {
                jSONObject.put("net_type", c0x1n.LIZIZ);
            }
            if (!c0x1n.LJ.isEmpty()) {
                jSONObject.put("header_list", c0x1n.LJ);
            }
            if (!c0x1n.LJFF.isEmpty()) {
                jSONObject.put("header", c0x1n.LJFF);
            }
            if (!c0x1n.LJI.isEmpty()) {
                jSONObject.put("cookie_list", c0x1n.LJI);
            }
            if (!c0x1n.LJII.isEmpty()) {
                jSONObject.put("cookie", c0x1n.LJII);
            }
            if (!c0x1n.LJIIIZ.isEmpty()) {
                jSONObject.put("url_query", c0x1n.LJIIIZ);
            }
            if (!c0x1n.LJIIIIZZ.isEmpty()) {
                jSONObject.put("url_query_list", c0x1n.LJIIIIZZ);
            }
            C793770VBv.LJ(EnumC841820X0q.HTTP_COOKIE_TOKEN_LOG.getLogType(), jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static boolean LIZIZ(HeaderParamConfig headerParamConfig, String str) {
        if (headerParamConfig != null && !TextUtils.isEmpty(str) && !C086I.LIZIZ(headerParamConfig.allowApis)) {
            List<AllowApiConfig> list = headerParamConfig.allowApis;
            try {
                Uri uri = UriProtector.parse(str);
                String host = uri.getHost();
                String path = uri.getPath();
                if (!TextUtils.isEmpty(host)) {
                    Iterator<AllowApiConfig> it2 = list.iterator();
                    if (it2.hasNext()) {
                        AllowApiConfig next = it2.next();
                        Set<String> set = next.domains;
                        Set<String> set2 = next.paths;
                        if (C086I.LIZIZ(set)) {
                            if (C086I.LIZIZ(set2) || TextUtils.isEmpty(path)) {
                                return false;
                            }
                            return C13LP.LJJJJ(path, set2);
                        }
                        if (!C13LP.LJJJJ(host, set)) {
                            return false;
                        }
                        if (!TextUtils.isEmpty(path) && !C086I.LIZIZ(set2) && !C13LP.LJJJJ(path, set2)) {
                            return false;
                        }
                        return true;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }
}
