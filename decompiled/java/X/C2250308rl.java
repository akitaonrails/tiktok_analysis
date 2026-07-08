package X;

import com.ss.android.ugc.aweme.music.understanding.ContentUnderstandingRequest;
import com.ss.android.ugc.aweme.music.understanding.ContentUnderstandingResult;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08rl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2250308rl implements ContentUnderstandingResult {
    public final String LIZ;
    public final String LIZIZ;
    public final C1257804w4 LIZJ;
    public final ContentUnderstandingRequest LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2250308rl)) {
            return false;
        }
        C2250308rl c2250308rl = (C2250308rl) obj;
        return Intrinsics.LJFF(this.LIZ, c2250308rl.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2250308rl.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c2250308rl.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c2250308rl.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        ContentUnderstandingRequest contentUnderstandingRequest = this.LIZLLL;
        return iHashCode + (contentUnderstandingRequest == null ? 0 : contentUnderstandingRequest.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocalEmbResult(understandingKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", creationId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", localEmb=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", initRequest=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LIZ() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (C053200Hi c053200Hi : this.LIZJ.LIZ) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("confidence", Float.valueOf(c053200Hi.LIZJ));
            jSONObject.put("tagId", c053200Hi.LIZ);
            jSONObject.put("tagName", c053200Hi.LIZIZ);
            jSONArray.put(jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("c1500", jSONArray);
        return C786410Ut5.J3(jSONObject2);
    }

    public C2250308rl(String str, String str2, C1257804w4 c1257804w4, ContentUnderstandingRequest contentUnderstandingRequest) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = c1257804w4;
        this.LIZLLL = contentUnderstandingRequest;
    }
}
