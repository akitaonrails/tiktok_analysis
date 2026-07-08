package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cfi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1020840cfi {
    public final int LIZ;
    public final JSONObject LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final List<C1020880cfm> LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1020840cfi)) {
            return false;
        }
        C1020840cfi c1020840cfi = (C1020840cfi) obj;
        return this.LIZ == c1020840cfi.LIZ && Intrinsics.LJFF(this.LIZIZ, c1020840cfi.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1020840cfi.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1020840cfi.LIZLLL) && this.LJ == c1020840cfi.LJ && this.LJFF == c1020840cfi.LJFF && Intrinsics.LJFF(this.LJI, c1020840cfi.LJI);
    }

    public final int hashCode() {
        return (((((((((((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OneBigThreeSmallRenderSnapshot(slideIndex=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", renderData=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", visualSignature=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", labelAnimationSignature=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", replayLabelAnimation=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", imageReady=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", slotItems=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C1020840cfi LIZIZ(boolean z, boolean z2) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectLJ = C1020890cfn.LJ(this.LIZIZ);
        jSONObjectLJ.put("carouselSelected", z);
        JSONObject jSONObjectOptJSONObject3 = jSONObjectLJ.optJSONObject("jigsaw_data");
        if (jSONObjectOptJSONObject3 != null) {
            jSONObjectOptJSONObject3.put("carouselSelected", z);
        }
        JSONObject jSONObjectOptJSONObject4 = jSONObjectLJ.optJSONObject("carouselUpdateInfo");
        if (jSONObjectOptJSONObject4 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject4.optJSONObject("carousel_label_info")) != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("status_info")) != null) {
            jSONObjectOptJSONObject2.put("animation", z2);
        }
        String strLIZ = C1020890cfn.LIZ(jSONObjectLJ);
        return LIZ(this, jSONObjectLJ, strLIZ, C1020890cfn.LJI(strLIZ, jSONObjectLJ), 101);
    }

    public static C1020840cfi LIZ(C1020840cfi c1020840cfi, JSONObject jSONObject, String str, boolean z, int i) {
        int i2;
        String str2;
        boolean z2 = z;
        String str3 = str;
        JSONObject jSONObject2 = jSONObject;
        boolean z3 = false;
        if ((i & 1) != 0) {
            i2 = c1020840cfi.LIZ;
        } else {
            i2 = 0;
        }
        if ((i & 2) != 0) {
            jSONObject2 = c1020840cfi.LIZIZ;
        }
        List<C1020880cfm> list = null;
        if ((i & 4) != 0) {
            str2 = c1020840cfi.LIZJ;
        } else {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = c1020840cfi.LIZLLL;
        }
        if ((i & 16) != 0) {
            z2 = c1020840cfi.LJ;
        }
        if ((i & 32) != 0) {
            z3 = c1020840cfi.LJFF;
        }
        if ((i & 64) != 0) {
            list = c1020840cfi.LJI;
        }
        c1020840cfi.getClass();
        return new C1020840cfi(i2, jSONObject2, str2, str3, z2, z3, list);
    }

    public C1020840cfi(int i, JSONObject jSONObject, String str, String str2, boolean z, boolean z2, List<C1020880cfm> list) {
        this.LIZ = i;
        this.LIZIZ = jSONObject;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = z;
        this.LJFF = z2;
        this.LJI = list;
    }
}
