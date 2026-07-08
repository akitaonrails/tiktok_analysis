package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.13mF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20109313mF {
    public final String LIZ;
    public final String LIZIZ;
    public final List<String> LIZJ;
    public final SortedMap<String, String> LIZLLL;
    public final SortedMap<String, AbstractC20111713md> LJ;
    public final SortedMap<String, AbstractC20111713md> LJFF;
    public final long LJI;
    public final boolean LJII;
    public final Map<String, String> LJIIIIZZ;

    public C20109313mF() {
        throw null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hashCode: ");
        sbLIZ.append(hashCode());
        sbLIZ.append(", ");
        sbLIZ.append("url: ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", ");
        sbLIZ.append("method: ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", ");
        sbLIZ.append("expireTimeout: ");
        sbLIZ.append(this.LJI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C20109313mF(JSONObject jSONObject) {
        SortedMap<String, String> sortedMapLIZLLL;
        SortedMap<String, AbstractC20111713md> sortedMapLJ;
        SortedMap<String, AbstractC20111713md> sortedMapLJ2;
        SortedMap<String, String> sortedMapLIZLLL2;
        String strOptString = jSONObject.optString("url");
        String lowerCase = jSONObject.optString("method", "GET").toLowerCase(Locale.ROOT);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("headers");
        if (jSONObjectOptJSONObject != null) {
            sortedMapLIZLLL = C20109613mI.LIZLLL(jSONObjectOptJSONObject);
        } else {
            sortedMapLIZLLL = null;
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("params");
        if (jSONObjectOptJSONObject2 != null) {
            sortedMapLJ = C20109613mI.LJ(jSONObjectOptJSONObject2);
        } else {
            sortedMapLJ = null;
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("data");
        if (jSONObjectOptJSONObject3 != null) {
            sortedMapLJ2 = C20109613mI.LJ(jSONObjectOptJSONObject3);
        } else {
            sortedMapLJ2 = null;
        }
        long jOptLong = jSONObject.optLong("expire", -1L) * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        jOptLong = jOptLong < 0 ? 30000L : jOptLong;
        boolean zOptBoolean = jSONObject.optBoolean("needCommonParams", false);
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("extras");
        if (jSONObjectOptJSONObject4 != null) {
            sortedMapLIZLLL2 = C20109613mI.LIZLLL(jSONObjectOptJSONObject4);
        } else {
            sortedMapLIZLLL2 = null;
        }
        this.LIZ = strOptString;
        this.LIZIZ = lowerCase;
        this.LIZJ = null;
        this.LIZLLL = sortedMapLIZLLL;
        this.LJ = sortedMapLJ;
        this.LJFF = sortedMapLJ2;
        this.LJI = jOptLong;
        this.LJII = zOptBoolean;
        this.LJIIIIZZ = sortedMapLIZLLL2;
    }
}
