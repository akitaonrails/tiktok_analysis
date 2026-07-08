package X;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03ht, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC915103ht {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public Map<String, String> LIZLLL;

    public abstract JSONObject LIZIZ();

    public final List<Pair<String, String>> LIZ() {
        ArrayList arrayList = new ArrayList();
        String strJ3 = C786410Ut5.J3(LIZIZ());
        int iIndexOf = strJ3.indexOf("nonce");
        if (iIndexOf > 0) {
            String strSubstring = strJ3.substring(0, iIndexOf);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strSubstring);
            sbLIZ.append("nonce\":\"");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            String strSubstring2 = strJ3.substring(iIndexOf + 8);
            int iIndexOf2 = strSubstring2.indexOf("\"");
            String strSubstring3 = strSubstring2.substring(0, iIndexOf2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(strSubstring3.replace("\\/", "/"));
            sbLIZ2.append(strSubstring2.substring(iIndexOf2));
            strJ3 = C2188811AlT.LIZIZ(sbLIZ2);
        }
        arrayList.add(new Pair("biz_content", strJ3));
        String str = this.LIZ;
        if (str == null) {
            str = "";
        }
        arrayList.add(new Pair("merchant_id", str));
        String str2 = this.LIZIZ;
        if (str2 == null) {
            str2 = "";
        }
        arrayList.add(new Pair("request_time", str2));
        arrayList.add(new Pair("sign", ""));
        String str3 = this.LIZJ;
        arrayList.add(new Pair("nonce", str3 != null ? str3 : ""));
        return arrayList;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseRequest{, mMerchantId='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", mRequestTime='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", mSign='");
        sbLIZ.append((String) null);
        sbLIZ.append('\'');
        sbLIZ.append(", requestNonce='");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZJ(Map map) {
        this.LIZLLL = map;
    }
}
