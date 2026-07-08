package X;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.playerkit.simapicommon.IAppConfig;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VJj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C795730VJj {
    public static final C07RW LIZ;
    public static IAppConfig LIZIZ;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.07RW] */
    static {
        new ConcurrentHashMap();
        LIZ = new HashMap<Integer, String>() { // from class: X.07RW
            {
                put(0, "normal");
                put(1, "ct_qe");
                put(2, "ct_se");
                put(5, "ct_he");
                put(21, "ct_hp");
                put(22, "ct_hp");
                put(23, "ct_ce");
                put(24, "ct_ce");
            }
        };
        LIZIZ = null;
    }

    public static int LJIIIIZZ() {
        IAppConfig iAppConfig = LIZIZ;
        if (iAppConfig != null) {
            return iAppConfig.getLastInfo(3);
        }
        return -1;
    }

    public static Looper LJII() {
        return Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper();
    }

    public static String LIZ(String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty("p2p=0") && !str.contains("p2p=0")) {
            if (!str.contains("?")) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append("?");
                sbLIZ.append("p2p=0");
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append("&");
            sbLIZ2.append("p2p=0");
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        return str;
    }

    public static String LIZIZ(String str) {
        return LIZJ(str, null);
    }

    public static String LIZLLL(String str) {
        if (str == null) {
            return null;
        }
        if (TextUtils.isEmpty("")) {
            return str;
        }
        boolean zContains = str.contains("");
        boolean zLIZIZ = C08F5.LIZIZ(str);
        if (str.startsWith("https")) {
            str = str.replace("https", "http");
        }
        if (zLIZIZ || str.indexOf("http") != 0 || zContains) {
            return str;
        }
        try {
            String host = new URL(str).getHost();
            StringBuilder sb = new StringBuilder();
            sb.append(host);
            sb.append(C786410Ut5.j4(".%s", new Object[]{""}));
            str = str.replace(host, sb);
            return str;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            TTVideoEngineLog.d(e);
            return str;
        }
    }

    public static String LJ(String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("https")) {
            return str.replace("https", "http");
        }
        return str;
    }

    public static String LJFF(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return URLEncoder.encode(str, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return str;
    }

    public static String LJI(String str) {
        IAppConfig iAppConfig = LIZIZ;
        if (iAppConfig != null) {
            return iAppConfig.getExtraBusinessLog(str, 4);
        }
        return null;
    }

    public static float LJIIIZ(Context context) {
        AudioManager audioManager;
        int streamVolume;
        double d;
        if (C790040Uyw.LJ(C790030Uyv.LIZ.LJIIIIZZ, 256L)) {
            if (!C0V12.LIZJ) {
                try {
                    if (!C0V12.LJFF(context)) {
                        C0V12.LJ = new C787430Uuj(C0V12.LIZ);
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                        C786410Ut5.LJIJJ(context, C0V12.LJ, intentFilter);
                        C0V12.LIZJ = true;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            if (!C0V12.LJFF(context)) {
                try {
                    if (C0V12.LIZIZ < 0 || !C0V12.LIZJ) {
                        C0V12.LIZIZ = C0V12.LIZIZ(context);
                    }
                    d = C0V12.LIZIZ;
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    d = 0.0d;
                }
            } else {
                d = 0.0d;
            }
            return (float) d;
        }
        if (context == null) {
            return 0.0f;
        }
        int i = 0;
        try {
            audioManager = (AudioManager) C786410Ut5.H2(context, "audio");
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        if (audioManager != null) {
            streamVolume = audioManager.getStreamVolume(3);
            if (streamVolume < 0) {
            }
            return i;
        }
        streamVolume = 0;
        i = streamVolume;
        return i;
    }

    public static boolean LJIIJ(String[] strArr) {
        if (strArr.length > 0) {
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str)) {
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("----start check url:");
                    sbLIZ.append(str);
                    TTVideoEngineLog.d("isTranscodeUrl", C2188811AlT.LIZIZ(sbLIZ));
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "btag");
                    if (TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                        TTVideoEngineLog.d("isTranscodeUrl", "get query value is null");
                    } else {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("get query value is:");
                        sbLIZ2.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                        TTVideoEngineLog.d("isTranscodeUrl", C2188811AlT.LIZIZ(sbLIZ2));
                        if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter) && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.matches("^[A-Fa-f0-9]+$")) {
                            BigInteger bigInteger = new BigInteger(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, 16);
                            BigInteger bigInteger2 = new BigInteger("80000", 16);
                            if (bigInteger.and(bigInteger2).compareTo(bigInteger2) == 0) {
                                TTVideoEngineLog.d("isTranscodeUrl", "end url is transcoded");
                                return true;
                            }
                            TTVideoEngineLog.d("isTranscodeUrl", "****end url is not transcoded");
                        } else {
                            TTVideoEngineLog.d("isTranscodeUrl", "not hex string");
                        }
                    }
                }
            }
        }
        return false;
    }

    public static int LJIILIIL(Object obj) {
        obj.getClass();
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            return CastIntegerProtector.parseInt((String) obj);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Can't format ");
        sbLIZ.append(obj.getClass());
        sbLIZ.append(" to int");
        throw new NumberFormatException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static long LJIILL(Long l) {
        if (l == null) {
            l = 0L;
        }
        return l.longValue();
    }

    public static ArrayList<Float> LJIILLIIL(JSONArray jSONArray) {
        ArrayList<Float> arrayList = new ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(Float.valueOf((float) JSONArrayProtectorUtils.getDouble(jSONArray, i)));
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return arrayList;
    }

    public static String LIZJ(String str, String str2) {
        if (!TextUtils.isEmpty(str) && Pattern.matches("^([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{4}|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)$", str)) {
            try {
                byte[] bArrDecode = Base64.decode(str, 0);
                if (TextUtils.isEmpty(str2)) {
                    return new String(bArrDecode, "utf-8");
                }
                return C795750VJl.LIZIZ(bArrDecode, Base64.decode(str2, 0));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                int i = C2187451AjH.LIZ;
                TTVideoEngineLog.d("TTHelper", th.toString());
                return "";
            }
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4 A[Catch: Exception -> 0x00de, TryCatch #1 {Exception -> 0x00de, blocks: (B:13:0x001e, B:15:0x0026, B:34:0x00af, B:33:0x00ad, B:19:0x0032, B:32:0x00a4, B:35:0x00b8, B:36:0x00dd, B:29:0x0084, B:17:0x002a), top: B:41:0x001e, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b8 A[Catch: Exception -> 0x00de, TryCatch #1 {Exception -> 0x00de, blocks: (B:13:0x001e, B:15:0x0026, B:34:0x00af, B:33:0x00ad, B:19:0x0032, B:32:0x00a4, B:35:0x00b8, B:36:0x00dd, B:29:0x0084, B:17:0x002a), top: B:41:0x001e, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJIIJJI(android.content.Context r6, java.lang.String r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C795730VJj.LJIIJJI(android.content.Context, java.lang.String):java.lang.String");
    }

    public static String LJIIL(String str, String str2, String str3) {
        List<String> listLIZ = C08F5.LIZ(str, str2);
        if (listLIZ != null) {
            ArrayList<String> arrayList = (ArrayList) listLIZ;
            if (arrayList.size() != 0) {
                StringBuilder sb = new StringBuilder();
                for (String str4 : arrayList) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str2);
                    sbLIZ.append("=");
                    if (str4.startsWith(C2188811AlT.LIZIZ(sbLIZ))) {
                        sb.append(str2);
                        sb.append("=");
                        sb.append(str3);
                    } else {
                        sb.append(str4);
                    }
                }
                return sb.toString();
            }
            return str;
        }
        return str;
    }

    public static double LJIILJJIL(double d, String str, JSONObject jSONObject) {
        String strOptString = jSONObject.optString(str);
        if (!TextUtils.isEmpty(strOptString)) {
            try {
                d = CastDoubleProtector.parseDouble(strOptString);
                return d;
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return d;
    }
}
