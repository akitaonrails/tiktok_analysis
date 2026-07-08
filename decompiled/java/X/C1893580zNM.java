package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0zNM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1893580zNM {
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static final C1893580zNM LIZ = new C1893580zNM();
    public static final HashMap<String, Integer> LIZLLL = new HashMap<>();

    public static void LJFF() {
        if (LIZIZ) {
            return;
        }
        LIZIZ = true;
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        C1893470zNB c1893470zNB = C1893470zNB.LIZIZ;
        c1537900q7g.getClass();
        C1537900q7g.LJIIIIZZ(c1893470zNB);
    }

    public final int LIZJ(String str) {
        Integer num;
        String path = UriProtector.parse(str).getPath();
        int iIntValue = 1;
        if (path == null || path.length() == 0) {
            return 0;
        }
        synchronized (this) {
            try {
                HashMap<String, Integer> map = LIZLLL;
                if (map.containsKey(path) && (num = map.get(path)) != null) {
                    iIntValue = num.intValue();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iIntValue;
    }

    public static String LIZ(String str, Map map) {
        if (map.isEmpty()) {
            return str;
        }
        try {
            Uri uri = UriProtector.parse(str);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str2 : UriProtector.getQueryParameterNames(uri)) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2);
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                    linkedHashMap.put(str2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                }
            }
            linkedHashMap.putAll(map);
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                builderClearQuery.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            return builderClearQuery.toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return str;
        }
    }

    public static String LIZLLL(Integer num, String str, String str2, String str3, Map map) {
        String str4;
        LJFF();
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zLIZ = C1064720doU.LIZ();
        if (!TextUtils.isEmpty(str) && (u.LJJIIJZLJL(str, "http", false) || u.LJJIIJZLJL(str, "https", false))) {
            String path = UriProtector.parse(str).getPath();
            if (path != null && u.LJIIZILJ(path, "template.js", false)) {
                str4 = "aweme://lynxview/";
            } else {
                str4 = "aweme://webview/";
            }
            return LIZIZ(zLIZ ? 1 : 0, jCurrentTimeMillis, num, str, UriProtector.parse(str4).buildUpon().appendQueryParameter("url", str).build().toString(), str2, str3, map);
        }
        return LIZIZ(zLIZ ? 1 : 0, jCurrentTimeMillis, num, str, str, str2, str3, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(int r11, long r12, java.lang.Integer r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.util.Map r19) {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1893580zNM.LIZIZ(int, long, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map):java.lang.String");
    }

    public static void LJ(C1893580zNM c1893580zNM, Context context, Integer num, String str, String str2, boolean z, Map map, Function1 function1, String str3, int i) {
        Function1 function12 = function1;
        boolean z2 = z;
        Map map2 = map;
        String str4 = str2;
        if ((i & 8) != 0) {
            str4 = "";
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        String str5 = null;
        if ((i & 32) != 0) {
            map2 = null;
        }
        if ((i & 64) != 0) {
            function12 = null;
        }
        if ((i & 128) == 0) {
            str5 = str3;
        }
        c1893580zNM.getClass();
        C01U6.LIZIZ(new C1893560zNK(context, num, str, str4, str5, map2, function12, z2));
    }
}
