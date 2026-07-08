package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0LTb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C543450LTb extends C0LUT {
    public final int LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;
    public final Long LIZLLL;
    public final C0LUU LJ;
    public final C0LUV LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C543450LTb)) {
            return false;
        }
        C543450LTb c543450LTb = (C543450LTb) obj;
        return this.LIZ == c543450LTb.LIZ && Intrinsics.LJFF(this.LIZIZ, c543450LTb.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c543450LTb.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c543450LTb.LIZLLL) && Intrinsics.LJFF(this.LJ, c543450LTb.LJ) && Intrinsics.LJFF(this.LJFF, c543450LTb.LJFF);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        String str = this.LIZIZ;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.LIZJ;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.LIZLLL;
        int iHashCode3 = (((iHashCode2 + (l == null ? 0 : l.hashCode())) * 31) + this.LJ.hashCode()) * 31;
        C0LUV c0luv = this.LJFF;
        return iHashCode3 + (c0luv != null ? c0luv.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MainTaskCancelEvent(status=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", currentStep=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", progress=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", durationMs=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", commonParams=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", customParams=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0LUT
    public final JSONObject LIZJ() throws JSONException {
        JSONObject jSONObjectLIZJ = super.LIZJ();
        jSONObjectLIZJ.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, this.LIZ);
        Long l = this.LIZLLL;
        if (l != null) {
            jSONObjectLIZJ.put("duration", l.longValue());
        }
        String str = this.LIZIZ;
        if (str != null) {
            jSONObjectLIZJ.put("end_task_type", str);
        }
        Integer num = this.LIZJ;
        if (num != null) {
            jSONObjectLIZJ.put("progress", num.intValue());
        }
        return jSONObjectLIZJ;
    }

    @Override // X.C0LUT
    public final C0LUU LIZ() {
        return this.LJ;
    }

    @Override // X.C0LUT
    public final C0LUV LIZIZ() {
        return this.LJFF;
    }

    public C543450LTb(String str, Integer num, Long l, C0LUU c0luu, C0LUV c0luv, int i) {
        str = (i & 2) != 0 ? null : str;
        num = (i & 4) != 0 ? null : num;
        l = (i & 8) != 0 ? null : l;
        c0luv = (i & 32) != 0 ? null : c0luv;
        this.LIZ = 2;
        this.LIZIZ = str;
        this.LIZJ = num;
        this.LIZLLL = l;
        this.LJ = c0luu;
        this.LJFF = c0luv;
    }
}
