package X;

import java.util.Map;
import java.util.SortedMap;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.13mG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20109413mG {
    public static final /* synthetic */ InterfaceC2217461Bqa[] LJIIJ;
    public final C01GW LIZ;
    public final C01GW LIZIZ;
    public final C01GW LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final SortedMap<String, String> LJFF;
    public final SortedMap<String, String> LJI;
    public final JSONObject LJII;
    public final boolean LJIIIIZZ;
    public final Map<String, String> LJIIIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C13LE.LIZ(C20109413mG.class), "str", "getStr()Ljava/lang/String;");
        C13LE.LIZ.getClass();
        LJIIJ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C13LE.LIZ(C20109413mG.class), "jsonObject", "getJsonObject()Lorg/json/JSONObject;"), new C2217381BqS(C13LE.LIZ(C20109413mG.class), "hashCode", "getHashCode()I")};
    }

    public final int hashCode() {
        C01GW c01gw = this.LIZJ;
        InterfaceC2217461Bqa[] interfaceC2217461BqaArr = LJIIJ;
        return ((Number) c01gw.getValue()).intValue();
    }

    public final String toString() {
        C01GW c01gw = this.LIZ;
        InterfaceC2217461Bqa[] interfaceC2217461BqaArr = LJIIJ;
        return (String) c01gw.getValue();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C20109413mG(JSONObject jSONObject) {
        SortedMap<String, String> sortedMapLIZLLL;
        SortedMap<String, String> sortedMapLIZLLL2;
        String strOptString = jSONObject.optString("url");
        String strOptString2 = jSONObject.optString("method", "get");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("headers");
        if (jSONObjectOptJSONObject != null) {
            sortedMapLIZLLL = C20109613mI.LIZLLL(jSONObjectOptJSONObject);
        } else {
            sortedMapLIZLLL = null;
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("params");
        if (jSONObjectOptJSONObject2 != null) {
            sortedMapLIZLLL2 = C20109613mI.LIZLLL(jSONObjectOptJSONObject2);
        } else {
            sortedMapLIZLLL2 = null;
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("data");
        boolean zOptBoolean = jSONObject.optBoolean("needCommonParams", false);
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("extras");
        this(strOptString, strOptString2, sortedMapLIZLLL, sortedMapLIZLLL2, jSONObjectOptJSONObject3, zOptBoolean, jSONObjectOptJSONObject4 != null ? C20109613mI.LIZLLL(jSONObjectOptJSONObject4) : null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20109413mG)) {
            return false;
        }
        C20109413mG c20109413mG = (C20109413mG) obj;
        if (!Intrinsics.LJFF(this.LIZLLL, c20109413mG.LIZLLL) || !Intrinsics.LJFF(this.LJ, c20109413mG.LJ) || !Intrinsics.LJFF(this.LJFF, c20109413mG.LJFF) || !Intrinsics.LJFF(this.LJI, c20109413mG.LJI) || !Intrinsics.LJFF(this.LJII, c20109413mG.LJII) || this.LJIIIIZZ != c20109413mG.LJIIIIZZ || !Intrinsics.LJFF(this.LJIIIZ, c20109413mG.LJIIIZ)) {
            return false;
        }
        return true;
    }

    public C20109413mG(String str, String str2, SortedMap<String, String> sortedMap, SortedMap<String, String> sortedMap2, JSONObject jSONObject, boolean z, Map<String, String> map) {
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = sortedMap;
        this.LJI = sortedMap2;
        this.LJII = jSONObject;
        this.LJIIIIZZ = z;
        this.LJIIIZ = map;
        this.LIZ = C452501pT.LIZIZ(new AwS574S0100000_30(this, 393));
        this.LIZIZ = C452501pT.LIZIZ(new AwS574S0100000_30(this, 392));
        this.LIZJ = C452501pT.LIZIZ(new AwS574S0100000_30(this, 391));
    }
}
