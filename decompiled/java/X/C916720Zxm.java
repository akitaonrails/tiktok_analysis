package X;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Zxm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C916720Zxm {
    public static final /* synthetic */ int LJI = 0;
    public final long LIZ;
    public final int LIZIZ;
    public final C916420ZxI LIZJ;
    public final C916420ZxI LIZLLL;
    public final C916420ZxI LJ;
    public final int LJFF;

    public final int hashCode() {
        int iY2 = ((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ) * 31;
        C916420ZxI c916420ZxI = this.LIZJ;
        return ((((((iY2 + (c916420ZxI == null ? 0 : c916420ZxI.hashCode())) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF;
    }

    public final JSONObject LIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uid", this.LIZ);
        jSONObject.put("uidStr", String.valueOf(this.LIZ));
        jSONObject.put("level", this.LIZIZ);
        if (this.LIZJ != null) {
            jSONObject.put("streamRect", new JSONArray(this.LIZJ.LIZ()));
        }
        jSONObject.put("screenRect", new JSONArray(this.LIZLLL.LIZ()));
        jSONObject.put("containerRect", new JSONArray(this.LJ.LIZ()));
        jSONObject.put("enlargeState", this.LJFF);
        return jSONObject;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("\"uid\":");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(",\"level\":");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(",\"streamRect\":");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(",\"screenRect\":");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(",\"containerRect\":");
        sbLIZ.append(this.LJ);
        sbLIZ.append(",\"enlargeState\":");
        sbLIZ.append(this.LJFF);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(C916720Zxm.class, cls)) {
            return false;
        }
        C916720Zxm c916720Zxm = (C916720Zxm) obj;
        if (this.LIZ != c916720Zxm.LIZ || this.LIZIZ != c916720Zxm.LIZIZ || !Intrinsics.LJFF(this.LIZJ, c916720Zxm.LIZJ) || !Intrinsics.LJFF(this.LJ, c916720Zxm.LJ) || this.LJFF != c916720Zxm.LJFF) {
            return false;
        }
        return Intrinsics.LJFF(this.LIZLLL, c916720Zxm.LIZLLL);
    }

    public /* synthetic */ C916720Zxm(long j, C916420ZxI c916420ZxI, C916420ZxI c916420ZxI2) {
        this(j, 0, null, c916420ZxI, c916420ZxI2, 0);
    }

    public C916720Zxm(long j, int i, C916420ZxI c916420ZxI, C916420ZxI c916420ZxI2, C916420ZxI c916420ZxI3, @InterfaceC914610ZuN int i2) {
        this.LIZ = j;
        this.LIZIZ = i;
        this.LIZJ = c916420ZxI;
        this.LIZLLL = c916420ZxI2;
        this.LJ = c916420ZxI3;
        this.LJFF = i2;
    }
}
