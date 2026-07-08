package X;

import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.15fR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20576715fR {
    public final JSONObject LIZ;
    public int LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final String LJFF;
    public final ArrayList<C20576815fS> LJI = new ArrayList<>();
    public final ArrayList<C20576615fQ> LJII = new ArrayList<>();

    public C20576715fR(JSONObject jSONObject) {
        this.LIZ = jSONObject;
        this.LJFF = "";
        this.LIZJ = jSONObject.optBoolean("MainTrack");
        this.LJ = jSONObject.optBoolean("Enable", true);
        String strOptString = jSONObject.optString("AudioTrackType");
        if (strOptString != null && strOptString.length() != 0) {
            this.LJFF = strOptString;
        }
        String strOptString2 = jSONObject.optString("FilterTrackType");
        if (strOptString2 != null && strOptString2.length() != 0) {
            this.LJFF = strOptString2;
        }
        String strOptString3 = jSONObject.optString("StickerTrackType");
        if (strOptString3 != null && strOptString3.length() != 0) {
            this.LJFF = strOptString3;
        }
        String strOptString4 = jSONObject.optString("EffectTrackType");
        if (strOptString4 != null && strOptString4.length() != 0) {
            this.LJFF = strOptString4;
        }
        String strOptString5 = jSONObject.optString("RewindTrackType");
        if (strOptString5 != null && strOptString5.length() != 0) {
            this.LIZLLL = true;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("Slot");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                this.LJI.add(new C20576815fS(JSONArrayProtectorUtils.getJSONObject(jSONArrayOptJSONArray, i)));
            }
        }
        JSONArray jSONArrayOptJSONArray2 = this.LIZ.optJSONArray("Filter");
        if (jSONArrayOptJSONArray2 != null) {
            int length2 = jSONArrayOptJSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                this.LJII.add(new C20576615fQ(JSONArrayProtectorUtils.getJSONObject(jSONArrayOptJSONArray2, i2)));
            }
        }
        JSONObject jSONObjectOptJSONObject = this.LIZ.optJSONObject("Filter");
        if (jSONObjectOptJSONObject != null) {
            this.LJII.add(new C20576615fQ(jSONObjectOptJSONObject));
        }
    }
}
