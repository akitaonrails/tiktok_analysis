package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00FQ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00FQ implements C0LUV {
    public final Long LIZ;
    public final String LIZIZ;
    public final List<String> LIZJ;
    public final List<String> LIZLLL;

    public C00FQ() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00FQ)) {
            return false;
        }
        C00FQ c00fq = (C00FQ) obj;
        return Intrinsics.LJFF(this.LIZ, c00fq.LIZ) && Intrinsics.LJFF(this.LIZIZ, c00fq.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c00fq.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c00fq.LIZLLL);
    }

    public final int hashCode() {
        Long l = this.LIZ;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.LIZLLL;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UploadSubTaskParams(fileSize=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", fileType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", pathList=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", urlList=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0LUV
    public final JSONObject LIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Long l = this.LIZ;
        if (l != null) {
            jSONObject.put("file_size", l.longValue());
        }
        String str = this.LIZIZ;
        if (str != null) {
            jSONObject.put("file_type", str);
        }
        List<String> list = this.LIZJ;
        if (list != null) {
            jSONObject.put("path_list", C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62));
        }
        List<String> list2 = this.LIZLLL;
        if (list2 != null) {
            jSONObject.put("url_list", C13LP.LJJLIIIJ(list2, ",", null, null, 0, null, null, 62));
        }
        return jSONObject;
    }

    public C00FQ(Long l, String str, List<String> list, List<String> list2) {
        this.LIZ = l;
        this.LIZIZ = str;
        this.LIZJ = list;
        this.LIZLLL = list2;
    }
}
