package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallPageDTO;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0vQh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1741890vQh {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C051J());

    public static final Gson LJFF() {
        return (Gson) LIZ.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.HashMap<java.lang.String, java.lang.Object> LIZ(java.lang.Object r6) {
        /*
            r5 = 0
            com.google.gson.Gson r0 = LJFF()     // Catch: com.google.gson.o -> L60
            com.google.gson.k r4 = com.bytedance.mt.protector.impl.GsonProtectorUtils.toJsonTree(r0, r6)     // Catch: com.google.gson.o -> L60
            com.google.gson.Gson r3 = LJFF()     // Catch: com.google.gson.s -> L5b com.google.gson.o -> L60
            X.04Zw r0 = X.C1120604Zw.LIZ     // Catch: com.google.gson.s -> L5b com.google.gson.o -> L60
            r0.getClass()     // Catch: com.google.gson.s -> L5b com.google.gson.o -> L60
            X.04a9 r0 = X.C1120604Zw.LIZIZ()     // Catch: com.google.gson.s -> L5b com.google.gson.o -> L60
            if (r0 == 0) goto L1e
            boolean r1 = r0.LJII     // Catch: com.google.gson.s -> L5b com.google.gson.o -> L60
            r0 = 1
            if (r1 != r0) goto L1e
            goto L1f
        L1e:
            r0 = 0
        L1f:
            if (r0 == 0) goto L22
            goto L2c
        L22:
            X.0oqV r0 = new X.0oqV     // Catch: com.google.gson.s -> L5b com.google.gson.o -> L60
            r0.<init>()     // Catch: com.google.gson.s -> L5b com.google.gson.o -> L60
            java.lang.reflect.Type r0 = r0.getType()     // Catch: com.google.gson.s -> L5b com.google.gson.o -> L60
            goto L4f
        L2c:
            java.lang.Class<java.util.HashMap> r2 = java.util.HashMap.class
            X.13JX r1 = kotlin.reflect.KTypeProjection.LIZJ     // Catch: com.google.gson.s -> L5b com.google.gson.o -> L60
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            X.13JW r0 = X.C13LE.LJII(r0)     // Catch: com.google.gson.s -> L5b com.google.gson.o -> L60
            r1.getClass()     // Catch: com.google.gson.s -> L5b com.google.gson.o -> L60
            kotlin.reflect.KTypeProjection r1 = X.C13JX.LIZ(r0)     // Catch: com.google.gson.s -> L5b com.google.gson.o -> L60
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            X.13JW r0 = X.C13LE.LJII(r0)     // Catch: com.google.gson.s -> L5b com.google.gson.o -> L60
            kotlin.reflect.KTypeProjection r0 = X.C13JX.LIZ(r0)     // Catch: com.google.gson.s -> L5b com.google.gson.o -> L60
            X.13JW r0 = X.C13LE.LJIIIZ(r2, r1, r0)     // Catch: com.google.gson.s -> L5b com.google.gson.o -> L60
            java.lang.reflect.Type r0 = X.C2371409Qy.LIZJ(r0)     // Catch: com.google.gson.s -> L5b com.google.gson.o -> L60
        L4f:
            java.lang.Object r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r3, r4, r0)     // Catch: com.google.gson.s -> L5b com.google.gson.o -> L60
            boolean r0 = r1 instanceof java.util.HashMap     // Catch: com.google.gson.s -> L5b com.google.gson.o -> L60
            if (r0 != 0) goto L58
            r1 = r5
        L58:
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: com.google.gson.s -> L5b com.google.gson.o -> L60
            return r1
        L5b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: com.google.gson.o -> L60
            return r5
        L60:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1741890vQh.LIZ(java.lang.Object):java.util.HashMap");
    }

    public static final k LJI(ECMixMallPageDTO eCMixMallPageDTO) {
        String name = "null";
        if (!((Boolean) C268480Afe.LIZ.getValue()).booleanValue()) {
            try {
                return LJFF().LJIJJLI(eCMixMallPageDTO);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                EnumC1014603xw enumC1014603xw = EnumC1014603xw.ERR_JSON_TREE_FALLBACK;
                if (eCMixMallPageDTO != null) {
                    name = ECMixMallPageDTO.class.getName();
                }
                C1019103yf.LIZ(enumC1014603xw, e, C2097908Jt.LIZJ(new Pair("json_source_class", name)));
                return null;
            }
        }
        if (eCMixMallPageDTO != null) {
            name = ECMixMallPageDTO.class.getName();
        }
        ConcurrentModificationException e2 = null;
        for (int i = 0; i < 3; i++) {
            try {
                k kVarLJIJJLI = LJFF().LJIJJLI(eCMixMallPageDTO);
                if (i > 0) {
                    C1018703yb.LJ("rd_tiktokec_gec_custom_exception", C2097608Jq.LJIIIIZZ(new Pair("exception_message", "json_tree_retry_success"), new Pair("json_source_class", name), new Pair("retry_count", Integer.valueOf(i + 1)), new Pair("retry_result", "success"), new Pair("exception_type", ConcurrentModificationException.class.getName())));
                    return kVarLJIJJLI;
                }
                return kVarLJIJJLI;
            } catch (ConcurrentModificationException e3) {
                e2 = e3;
                TryCatchGuardChecker.doCheck(e2);
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
                C1019103yf.LIZ(EnumC1014603xw.ERR_JSON_TREE_FALLBACK, e4, C2097608Jq.LJIIIIZZ(new Pair("json_source_class", name), new Pair("retry_count", Integer.valueOf(i + 1)), new Pair("retry_result", "failed_non_retryable"), new Pair("exception_type", e4.getClass().getName())));
                return null;
            }
        }
        C1019103yf.LIZ(EnumC1014603xw.ERR_JSON_TREE_FALLBACK, e2, C2097608Jq.LJIIIIZZ(new Pair("json_source_class", name), new Pair("retry_count", 3), new Pair("retry_result", "exhausted"), new Pair("exception_type", ConcurrentModificationException.class.getName())));
        return null;
    }

    public static final String LJIIIIZZ(Object obj) {
        return GsonProtectorUtils.toJson(C08JS.LIZIZ(), obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.HashMap<java.lang.String, java.lang.Object> LJIIIZ(com.google.gson.k r5) {
        /*
            r4 = 0
            com.google.gson.Gson r3 = LJFF()     // Catch: com.google.gson.s -> L53
            X.04Zw r0 = X.C1120604Zw.LIZ     // Catch: com.google.gson.s -> L53
            r0.getClass()     // Catch: com.google.gson.s -> L53
            X.04a9 r0 = X.C1120604Zw.LIZIZ()     // Catch: com.google.gson.s -> L53
            if (r0 == 0) goto L16
            boolean r1 = r0.LJII     // Catch: com.google.gson.s -> L53
            r0 = 1
            if (r1 != r0) goto L16
            goto L17
        L16:
            r0 = 0
        L17:
            if (r0 == 0) goto L1a
            goto L24
        L1a:
            X.0523 r0 = new X.0523     // Catch: com.google.gson.s -> L53
            r0.<init>()     // Catch: com.google.gson.s -> L53
            java.lang.reflect.Type r0 = r0.getType()     // Catch: com.google.gson.s -> L53
            goto L47
        L24:
            java.lang.Class<java.util.HashMap> r2 = java.util.HashMap.class
            X.13JX r1 = kotlin.reflect.KTypeProjection.LIZJ     // Catch: com.google.gson.s -> L53
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            X.13JW r0 = X.C13LE.LJII(r0)     // Catch: com.google.gson.s -> L53
            r1.getClass()     // Catch: com.google.gson.s -> L53
            kotlin.reflect.KTypeProjection r1 = X.C13JX.LIZ(r0)     // Catch: com.google.gson.s -> L53
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            X.13JW r0 = X.C13LE.LJII(r0)     // Catch: com.google.gson.s -> L53
            kotlin.reflect.KTypeProjection r0 = X.C13JX.LIZ(r0)     // Catch: com.google.gson.s -> L53
            X.13JW r0 = X.C13LE.LJIIIZ(r2, r1, r0)     // Catch: com.google.gson.s -> L53
            java.lang.reflect.Type r0 = X.C2371409Qy.LIZJ(r0)     // Catch: com.google.gson.s -> L53
        L47:
            java.lang.Object r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r3, r5, r0)     // Catch: com.google.gson.s -> L53
            boolean r0 = r1 instanceof java.util.HashMap     // Catch: com.google.gson.s -> L53
            if (r0 != 0) goto L50
            r1 = r4
        L50:
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: com.google.gson.s -> L53
            return r1
        L53:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1741890vQh.LJIIIZ(com.google.gson.k):java.util.HashMap");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.HashMap<java.lang.String, java.lang.Object> LJIIJ(java.lang.String r5) {
        /*
            r4 = 0
            com.google.gson.Gson r3 = LJFF()     // Catch: com.google.gson.s -> L53
            X.04Zw r0 = X.C1120604Zw.LIZ     // Catch: com.google.gson.s -> L53
            r0.getClass()     // Catch: com.google.gson.s -> L53
            X.04a9 r0 = X.C1120604Zw.LIZIZ()     // Catch: com.google.gson.s -> L53
            if (r0 == 0) goto L16
            boolean r1 = r0.LJII     // Catch: com.google.gson.s -> L53
            r0 = 1
            if (r1 != r0) goto L16
            goto L17
        L16:
            r0 = 0
        L17:
            if (r0 == 0) goto L1a
            goto L24
        L1a:
            X.0184 r0 = new X.0184     // Catch: com.google.gson.s -> L53
            r0.<init>()     // Catch: com.google.gson.s -> L53
            java.lang.reflect.Type r0 = r0.getType()     // Catch: com.google.gson.s -> L53
            goto L47
        L24:
            java.lang.Class<java.util.HashMap> r2 = java.util.HashMap.class
            X.13JX r1 = kotlin.reflect.KTypeProjection.LIZJ     // Catch: com.google.gson.s -> L53
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            X.13JW r0 = X.C13LE.LJII(r0)     // Catch: com.google.gson.s -> L53
            r1.getClass()     // Catch: com.google.gson.s -> L53
            kotlin.reflect.KTypeProjection r1 = X.C13JX.LIZ(r0)     // Catch: com.google.gson.s -> L53
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            X.13JW r0 = X.C13LE.LJII(r0)     // Catch: com.google.gson.s -> L53
            kotlin.reflect.KTypeProjection r0 = X.C13JX.LIZ(r0)     // Catch: com.google.gson.s -> L53
            X.13JW r0 = X.C13LE.LJIIIZ(r2, r1, r0)     // Catch: com.google.gson.s -> L53
            java.lang.reflect.Type r0 = X.C2371409Qy.LIZJ(r0)     // Catch: com.google.gson.s -> L53
        L47:
            java.lang.Object r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r3, r5, r0)     // Catch: com.google.gson.s -> L53
            boolean r0 = r1 instanceof java.util.HashMap     // Catch: com.google.gson.s -> L53
            if (r0 != 0) goto L50
            r1 = r4
        L50:
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: com.google.gson.s -> L53
            return r1
        L53:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1741890vQh.LJIIJ(java.lang.String):java.util.HashMap");
    }

    public static final HashMap<String, Object> LJIIJJI(byte[] bArr) {
        HashMap<String, Object> map;
        if (bArr != null) {
            Reader inputStreamReader = new InputStreamReader(new ByteArrayInputStream(bArr), Charsets.UTF_8);
            if (!(inputStreamReader instanceof BufferedReader)) {
                inputStreamReader = new BufferedReader(inputStreamReader, 8192);
            }
            try {
                map = (HashMap) LJFF().LJFF(inputStreamReader, HashMap.class);
                C2107108Nh.LIZ(inputStreamReader, null);
            } catch (Throwable th) {
                th = th;
                try {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                        TryCatchGuardChecker.doCheck(th);
                        C2107108Nh.LIZ(inputStreamReader, th);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = null;
                    TryCatchGuardChecker.doCheck(th);
                    C2107108Nh.LIZ(inputStreamReader, th);
                    throw th;
                }
            }
        } else {
            map = null;
        }
        if (!(map instanceof HashMap)) {
            return null;
        }
        return map;
    }

    public static final HashMap<String, Object> LIZIZ(Intent intent, String str) {
        Bundle extras;
        if (intent != null) {
            try {
                extras = intent.getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                extras = null;
            }
        } else {
            extras = null;
        }
        return LIZLLL(extras, str);
    }

    public static final HashMap<String, Object> LIZJ(Uri uri, String str) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        if (uri != null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
        } else {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
        }
        return LJIIJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
    }

    public static final HashMap<String, Object> LIZLLL(Bundle bundle, String str) {
        Object obj;
        HashMap<String, Object> map;
        String str2 = null;
        if (bundle == null) {
            return null;
        }
        try {
            obj = bundle.get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            obj = null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof HashMap) {
            map = (HashMap) obj;
        } else {
            map = null;
        }
        if (map == null) {
            if (obj instanceof String) {
                str2 = (String) obj;
            }
            return LJIIJ(str2);
        }
        return map;
    }

    public static final HashMap LJ(String str, Map map) {
        Object obj;
        HashMap map2;
        String str2 = null;
        if (map == null || (obj = map.get(str)) == null) {
            return null;
        }
        if ((obj instanceof HashMap) && (map2 = (HashMap) obj) != null) {
            return map2;
        }
        if (obj instanceof String) {
            str2 = (String) obj;
        }
        return LJIIJ(str2);
    }

    public static final Object LJII(Class cls, Object obj) {
        Object objLIZJ = null;
        if (obj == null) {
            return null;
        }
        try {
            objLIZJ = LJFF().LIZJ(LJFF().LJIJJLI(obj), cls);
            return objLIZJ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return objLIZJ;
        }
    }
}
