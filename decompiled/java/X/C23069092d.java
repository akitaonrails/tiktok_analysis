package X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.bytedance.frameworks.encryptor.EncryptorUtil;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.092d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23069092d {
    public static final String[] LIZ = {"aid", "app_version", "tt_data", "device_id", "bd_did"};

    public static HashMap<String, String> LIZLLL(boolean z, boolean z2) {
        HashMap<String, String> map = new HashMap<>(2);
        if (z) {
            map.put("Content-Type", "application/octet-stream;tt-data=a");
        } else {
            map.put("Content-Type", "application/json; charset=utf-8");
        }
        int i = !z2 ? 1 : 0;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("t=0;n=");
            sbLIZ.append(i);
            map.put("x-tt-request-tag", C2188811AlT.LIZIZ(sbLIZ));
            return map;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return map;
        }
    }

    public static void LIZIZ(StringBuilder sb, String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (sb.toString().indexOf(63) < 0) {
                sb.append("?");
            } else {
                sb.append("&");
            }
            sb.append(str);
            sb.append("=");
            sb.append(Uri.encode(str2));
        }
    }

    public static String LIZJ(String str, boolean z, C0XD5 c0xd5) {
        if (!TextUtils.isEmpty(str)) {
            Uri uri = UriProtector.parse(str);
            String query = uri.getQuery();
            ArrayList<Pair> arrayList = new ArrayList();
            for (String str2 : LIZ) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2);
                if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                    arrayList.add(new Pair(str2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter));
                }
            }
            Uri.Builder builderBuildUpon = uri.buildUpon();
            builderBuildUpon.clearQuery();
            for (Pair pair : arrayList) {
                builderBuildUpon.appendQueryParameter((String) pair.first, (String) pair.second);
            }
            builderBuildUpon.appendQueryParameter("tt_info", new String(Base64.encode(LJFF(query, z, c0xd5), 8)));
            return builderBuildUpon.build().toString();
        }
        return str;
    }

    public static byte[] LJFF(String str, boolean z, C0XD5 c0xd5) {
        GZIPOutputStream gZIPOutputStream;
        byte[] byteArray;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
        byte[] bArrLIZ = null;
        try {
            try {
                if (z) {
                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    try {
                        gZIPOutputStream.write(str.getBytes("UTF-8"));
                    } catch (Throwable th) {
                        th = th;
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            C844830XCf.LIZLLL(th);
                            if (gZIPOutputStream != null) {
                                gZIPOutputStream.close();
                            }
                            byteArray = byteArrayOutputStream.toByteArray();
                            if (!z) {
                            }
                            return byteArray;
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            if (gZIPOutputStream != null) {
                                try {
                                    gZIPOutputStream.close();
                                    throw th2;
                                } catch (IOException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    C844830XCf.LIZLLL(e);
                                    throw th2;
                                }
                            }
                            throw th2;
                        }
                    }
                } else {
                    byteArrayOutputStream.write(str.getBytes("UTF-8"));
                    gZIPOutputStream = null;
                }
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
                C844830XCf.LIZLLL(e2);
            }
        } catch (Throwable th3) {
            th = th3;
            gZIPOutputStream = null;
        }
        if (gZIPOutputStream != null) {
            gZIPOutputStream.close();
        }
        byteArray = byteArrayOutputStream.toByteArray();
        if (!z && c0xd5 != null) {
            try {
                bArrLIZ = EncryptorUtil.LIZ(byteArray.length, byteArray);
                return bArrLIZ;
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                return bArrLIZ;
            }
        }
        return byteArray;
    }

    public static boolean LIZ(InterfaceC23070092e interfaceC23070092e, String str, boolean z, C0XD5 c0xd5, boolean z2, HashMap<String, String> map) {
        StringBuilder sb = new StringBuilder(str);
        HashMap map2 = new HashMap();
        int i = !z2 ? 1 : 0;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("t=0;n=");
            sbLIZ.append(i);
            map2.put("x-tt-request-tag", C2188811AlT.LIZIZ(sbLIZ));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (!map.isEmpty()) {
            map2.putAll(map);
        }
        try {
            String str2 = interfaceC23070092e.get(LIZJ(sb.toString(), z, c0xd5), map2);
            if (str2 != null) {
                try {
                    if ("success".equals(new JSONObject(str2).optString("message", ""))) {
                        return true;
                    }
                    return false;
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Register#active parse json error ");
                    sbLIZ2.append(str2);
                    sbLIZ2.append(", ");
                    C844830XCf.LIZJ(C2188811AlT.LIZIZ(sbLIZ2), e);
                    return false;
                }
            }
            return false;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C844830XCf.LIZJ("Register#active http error = ", e2);
            return false;
        }
    }

    public static JSONObject LJ(InterfaceC23070092e interfaceC23070092e, String str, JSONObject jSONObject, boolean z, C0XD5 c0xd5, boolean z2) {
        String strPost;
        boolean zLJI = MethodIDManager.LJI(137672);
        HashMap<String, String> mapLIZLLL = LIZLLL(z, z2);
        JSONObject jSONObject2 = null;
        try {
            byte[] bArrLJFF = LJFF(C786410Ut5.J3(jSONObject), z, c0xd5);
            if (bArrLJFF != null && z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append("&tt_data=a");
                str = C2188811AlT.LIZIZ(sbLIZ);
            }
            strPost = interfaceC23070092e.post(str, mapLIZLLL, bArrLJFF);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C844830XCf.LIZJ("Register#doRegister http error = ", e);
            strPost = null;
        }
        if (strPost != null) {
            try {
                jSONObject2 = new JSONObject(strPost);
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Register#doRegister parse json error ");
                sbLIZ2.append(strPost);
                sbLIZ2.append(", ");
                C844830XCf.LIZJ(C2188811AlT.LIZIZ(sbLIZ2), e2);
            }
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return jSONObject2;
    }
}
