package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0LTc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C543460LTc extends C0LUT {
    public final int LIZ;
    public final Long LIZIZ;
    public final String LIZJ;
    public final Integer LIZLLL;
    public final String LJ;
    public final Integer LJFF;
    public final String LJI;
    public final String LJII;
    public final C0LUU LJIIIIZZ;
    public final C0LUV LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C543460LTc)) {
            return false;
        }
        C543460LTc c543460LTc = (C543460LTc) obj;
        return this.LIZ == c543460LTc.LIZ && Intrinsics.LJFF(this.LIZIZ, c543460LTc.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c543460LTc.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c543460LTc.LIZLLL) && Intrinsics.LJFF(this.LJ, c543460LTc.LJ) && Intrinsics.LJFF(this.LJFF, c543460LTc.LJFF) && Intrinsics.LJFF(this.LJI, c543460LTc.LJI) && Intrinsics.LJFF(this.LJII, c543460LTc.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c543460LTc.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c543460LTc.LJIIIZ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        Long l = this.LIZIZ;
        int iHashCode = (i + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.LIZJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.LJ;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.LJFF;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.LJI;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJII;
        int iHashCode7 = (((iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.LJIIIIZZ.hashCode()) * 31;
        C0LUV c0luv = this.LJIIIZ;
        return iHashCode7 + (c0luv != null ? c0luv.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MainTaskEndEvent(status=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", durationMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", currentStep=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", progress=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", errorSource=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", simpleErrorMsg=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", commonParams=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", customParams=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0LUT
    public final JSONObject LIZJ() throws JSONException {
        JSONObject jSONObjectLIZJ = super.LIZJ();
        jSONObjectLIZJ.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, this.LIZ);
        Long l = this.LIZIZ;
        if (l != null) {
            jSONObjectLIZJ.put("duration", l.longValue());
        }
        if (this.LIZ == 0) {
            Integer num = this.LJFF;
            if (num != null) {
                jSONObjectLIZJ.put("error_code", num.intValue());
            }
            String str = this.LJI;
            if (str != null) {
                jSONObjectLIZJ.put("error_msg", str);
            }
            String str2 = this.LJII;
            if (str2 != null) {
                jSONObjectLIZJ.put("simple_error_msg", str2);
            }
            String str3 = this.LJ;
            if (str3 != null) {
                jSONObjectLIZJ.put("error_source", str3);
            }
            String str4 = this.LIZJ;
            if (str4 != null) {
                jSONObjectLIZJ.put("end_task_type", str4);
            }
            Integer num2 = this.LIZLLL;
            if (num2 != null) {
                jSONObjectLIZJ.put("progress", num2.intValue());
            }
        }
        return jSONObjectLIZJ;
    }

    @Override // X.C0LUT
    public final C0LUU LIZ() {
        return this.LJIIIIZZ;
    }

    @Override // X.C0LUT
    public final C0LUV LIZIZ() {
        return this.LJIIIZ;
    }

    public C543460LTc(int i, Long l, String str, Integer num, String str2, Integer num2, String str3, String str4, C0LUU c0luu, C0LUV c0luv, int i2) {
        l = (i2 & 2) != 0 ? null : l;
        str = (i2 & 4) != 0 ? null : str;
        num = (i2 & 8) != 0 ? null : num;
        str2 = (i2 & 16) != 0 ? null : str2;
        num2 = (i2 & 32) != 0 ? null : num2;
        str3 = (i2 & 64) != 0 ? null : str3;
        str4 = (i2 & 128) != 0 ? null : str4;
        c0luv = (i2 & 512) != 0 ? null : c0luv;
        this.LIZ = i;
        this.LIZIZ = l;
        this.LIZJ = str;
        this.LIZLLL = num;
        this.LJ = str2;
        this.LJFF = num2;
        this.LJI = str3;
        this.LJII = str4;
        this.LJIIIIZZ = c0luu;
        this.LJIIIZ = c0luv;
    }
}
