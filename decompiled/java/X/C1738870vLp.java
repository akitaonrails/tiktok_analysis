package X;

import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayOutputStream;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.zip.GZIPOutputStream;
import kotlin.Unit;
import kotlin.text.a0;
import kotlin.text.u;
import oo5.b;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0vLp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1738870vLp {
    public long LIZ;

    public final void LIZ(String str, C1AFI c1afi, Throwable th) {
        String str2;
        if (this.LIZ <= 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZ;
        String str3 = null;
        if (c1afi != null) {
            str2 = c1afi.LIZJ;
        } else {
            str2 = null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", str);
            jSONObject.put("duration", jCurrentTimeMillis);
            jSONObject.put("result", str2);
            if (c1afi != null) {
                str3 = c1afi.LIZLLL;
            }
            jSONObject.put("error_code", str3);
            if (th instanceof C1494430ozZ) {
                jSONObject.put("api_status_code", ((C1494430ozZ) th).getStatusCode());
            }
            b.LJIJJLI.getClass();
            b.LIZLLL().LIZJ.onEventV3("rd_pipo_ocr_card_info_request", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LIZ = 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.0sYq] */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.0sYq] */
    /* JADX WARN: Type inference failed for: r4v4, types: [X.0vLn] */
    public final void LIZIZ(String str, C1738850vLn c1738850vLn, InterfaceC1631620sYq<? super Boolean, ? super String, ? super C1AFI, Unit> interfaceC1631620sYq) {
        ?? r4;
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        try {
            r4 = c1738850vLn;
            String str2 = r4.LIZLLL;
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("merchant_user_id", str2);
            String str3 = r4.LJ;
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put("nonce", str3);
            String str4 = r4.LJFF;
            if (str4 == null) {
                str4 = "";
            }
            jSONObject.put("image_base64", str4);
            String str5 = r4.LJI;
            if (str5 != null) {
                jSONObject.put("biz_merchant_id", str5);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        String strJ3 = C786410Ut5.J3(jSONObject);
        int iLJJJ = a0.LJJJ(strJ3, "nonce", 0, false, 6);
        if (iLJJJ > 0) {
            if (strJ3 != null) {
                String strSubstring = strJ3.substring(0, iLJJJ);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strSubstring);
                sbLIZ.append("nonce\":\"");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                String strSubstring2 = strJ3.substring(iLJJJ + 8);
                int iLJJJ2 = a0.LJJJ(strSubstring2, "\"", 0, false, 6);
                if (strSubstring2 != null) {
                    String strSubstring3 = strSubstring2.substring(0, iLJJJ2);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(strLIZIZ);
                    sbLIZ2.append(u.LJJIFFI(strSubstring3, "\\/", "/", false));
                    sbLIZ2.append(strSubstring2.substring(iLJJJ2));
                    strJ3 = C2188811AlT.LIZIZ(sbLIZ2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        arrayList.add(new Pair("biz_content", strJ3));
        String str6 = r4.LIZ;
        if (str6 == null) {
            str6 = "";
        }
        arrayList.add(new Pair("merchant_id", str6));
        String str7 = r4.LIZIZ;
        if (str7 == null) {
            str7 = "";
        }
        arrayList.add(new Pair("request_time", str7));
        LinkedHashMap linkedHashMap = new LinkedHashMap(r4.LIZJ);
        try {
            r4 = interfaceC1631620sYq;
            StringBuilder sb = new StringBuilder("");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Pair pair = (Pair) arrayList.get(i);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                String str8 = (String) pair.first;
                str8.toString();
                sbLIZ3.append(str8);
                sbLIZ3.append("=");
                sbLIZ3.append(URLEncoder.encode((String) pair.second, "UTF-8"));
                sb.append(C2188811AlT.LIZIZ(sbLIZ3));
                if (i < arrayList.size() - 1) {
                    sb.append("&");
                }
            }
            String string = sb.toString();
            Charset charsetForName = Charset.forName("UTF-8");
            if (string != null) {
                byte[] bytes = string.getBytes(charsetForName);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(bytes);
                } finally {
                    try {
                    } catch (Throwable th2) {
                    }
                }
                gZIPOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                linkedHashMap.put("Content-Type", "application/x-www-form-urlencoded");
                linkedHashMap.put("Content-Encoding", "gzip");
                linkedHashMap.put("Accept-Encoding", "gzip");
                this.LIZ = System.currentTimeMillis();
                b.LJIJJLI.getClass();
                AbstractC808800Vo6 abstractC808800Vo6 = b.LIZLLL().LJ;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(C1724370uyR.LIZ);
                sbLIZ4.append("/payment/v1/get_bankcard_info_by_ocr");
                String strLJ = abstractC808800Vo6.LJ(C2188811AlT.LIZIZ(sbLIZ4), byteArray, linkedHashMap);
                C1AFI c1afi = new C1AFI(strLJ);
                LIZ(str, c1afi, null);
                r4.invoke(Boolean.TRUE, "", c1afi);
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("response is ");
                sbLIZ5.append(strLJ);
                C2188811AlT.LIZIZ(sbLIZ5);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            LIZ(str, null, th3);
            r4.invoke(Boolean.FALSE, th3.getMessage(), null);
        }
    }
}
