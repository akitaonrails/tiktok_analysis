package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.13mO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20110213mO {
    public static final /* synthetic */ InterfaceC2217461Bqa[] LJII;
    public final C01GW LIZ;
    public final C01GW LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final Map<String, String> LJFF;
    public final List<String> LJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C13LE.LIZ(C20110213mO.class), "hostRegMatcher", "getHostRegMatcher()Lkotlin/text/Regex;");
        C13LE.LIZ.getClass();
        LJII = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C13LE.LIZ(C20110213mO.class), "hashRegMatcher", "getHashRegMatcher()Lkotlin/text/Regex;")};
    }

    public C20110213mO() {
        throw null;
    }

    public final List LIZ(C20110413mQ c20110413mQ) {
        if (TextUtils.isEmpty(this.LIZLLL) && TextUtils.isEmpty(this.LJ) && this.LJFF == null) {
            LIZIZ(c20110413mQ);
            return this.LJI;
        }
        C01GW c01gw = c20110413mQ.LIZIZ;
        InterfaceC2217461Bqa[] interfaceC2217461BqaArr = C20110413mQ.LJFF;
        String str = (String) c01gw.getValue();
        if (!TextUtils.isEmpty(this.LIZLLL)) {
            C01GW c01gw2 = this.LIZ;
            InterfaceC2217461Bqa[] interfaceC2217461BqaArr2 = LJII;
            if (!((Regex) c01gw2.getValue()).matches(str)) {
                return null;
            }
        }
        String str2 = (String) c20110413mQ.LIZLLL.getValue();
        if (!TextUtils.isEmpty(this.LJ)) {
            C01GW c01gw3 = this.LIZIZ;
            InterfaceC2217461Bqa[] interfaceC2217461BqaArr3 = LJII;
            if (!((Regex) c01gw3.getValue()).matches(str2)) {
                return null;
            }
        }
        SortedMap sortedMap = (SortedMap) c20110413mQ.LIZJ.getValue();
        if (this.LJFF != null) {
            if (sortedMap.size() >= this.LJFF.size()) {
                for (Map.Entry<String, String> entry : this.LJFF.entrySet()) {
                    if (sortedMap.containsKey(entry.getKey())) {
                        String value = entry.getValue();
                        if (value.length() != 0) {
                            Regex regex = new Regex(value);
                            String str3 = (String) sortedMap.get(entry.getKey());
                            if (str3 == null) {
                                str3 = "";
                            }
                            if (!regex.matches(str3)) {
                                return null;
                            }
                        }
                    } else {
                        return null;
                    }
                }
            } else {
                return null;
            }
        }
        LIZIZ(c20110413mQ);
        return this.LJI;
    }

    public final void LIZIZ(C20110413mQ c20110413mQ) {
        String strLJJLIIIJ = C13LP.LJJLIIIJ(this.LJI, null, null, null, 0, null, AFwS231S0000000_3.get$arr$(241), 31);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[scheme:");
        sbLIZ.append(c20110413mQ.LJ);
        sbLIZ.append("] matchRule:");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(" matchApis:");
        sbLIZ.append(strLJJLIIIJ);
        C20111613mc.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public C20110213mO(String str, JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = null;
        String strOptString = jSONObject.optString("host", null);
        String strOptString2 = jSONObject.optString("hash", null);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("query");
        if (jSONArrayOptJSONArray != null) {
            linkedHashMap = new LinkedHashMap();
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = JSONArrayProtectorUtils.getJSONObject(jSONArrayOptJSONArray, i);
                linkedHashMap.put(jSONObject2.optString("key"), jSONObject2.optString("value"));
            }
        }
        List<String> listLIZJ = C20109613mI.LIZJ(JSONObjectProtectorUtils.getJSONArray(jSONObject, "prefetch_apis"));
        this.LIZJ = str;
        this.LIZLLL = strOptString;
        this.LJ = strOptString2;
        this.LJFF = linkedHashMap;
        this.LJI = listLIZJ;
        this.LIZ = C452501pT.LIZIZ(new AwS574S0100000_30(this, 395));
        this.LIZIZ = C452501pT.LIZIZ(new AwS574S0100000_30(this, 394));
    }
}
