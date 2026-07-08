package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00FO, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00FO implements C0LUV {
    public final Long LIZ;
    public final String LIZIZ;
    public final List<String> LIZJ;
    public final String LIZLLL;
    public final Integer LJ;
    public final Integer LJFF;
    public final Integer LJI;
    public final Integer LJII;
    public final Integer LJIIIIZZ;
    public final Integer LJIIIZ;
    public final String LJIIJ;

    public C00FO() {
        this(null, null, null, null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00FO)) {
            return false;
        }
        C00FO c00fo = (C00FO) obj;
        return Intrinsics.LJFF(this.LIZ, c00fo.LIZ) && Intrinsics.LJFF(this.LIZIZ, c00fo.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c00fo.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c00fo.LIZLLL) && Intrinsics.LJFF(this.LJ, c00fo.LJ) && Intrinsics.LJFF(this.LJFF, c00fo.LJFF) && Intrinsics.LJFF(this.LJI, c00fo.LJI) && Intrinsics.LJFF(this.LJII, c00fo.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c00fo.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c00fo.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c00fo.LJIIJ);
    }

    public final int hashCode() {
        Long l = this.LIZ;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.LJ;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LJFF;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.LJI;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.LJII;
        int iHashCode8 = (iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.LJIIIIZZ;
        int iHashCode9 = (iHashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.LJIIIZ;
        int iHashCode10 = (iHashCode9 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str3 = this.LJIIJ;
        return iHashCode10 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "DownloadSubTaskParams(fileSize=" + this.LIZ + ", fileType=" + this.LIZIZ + ", urlList=" + this.LIZJ + ", downloadStack=" + this.LIZLLL + ", downloadTotalAttempt=" + this.LJ + ", downloadFailAttempt=" + this.LJFF + ", downloadMaxAttempt=" + this.LJI + ", downloadHadRetry=" + this.LJII + ", downloadRetryEnable=" + this.LJIIIIZZ + ", downloadLastErrorCode=" + this.LJIIIZ + ", downloadLastErrorMsg=" + this.LJIIJ + ')';
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
            jSONObject.put("url_list", C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62));
        }
        String str2 = this.LIZLLL;
        if (str2 != null) {
            jSONObject.put("download_stack", str2);
        }
        Integer num = this.LJ;
        if (num != null) {
            jSONObject.put("download_total_attempt", num.intValue());
        }
        Integer num2 = this.LJFF;
        if (num2 != null) {
            jSONObject.put("download_fail_attempt", num2.intValue());
        }
        Integer num3 = this.LJI;
        if (num3 != null) {
            jSONObject.put("download_max_attempt", num3.intValue());
        }
        Integer num4 = this.LJII;
        if (num4 != null) {
            jSONObject.put("download_had_retry", num4.intValue());
        }
        Integer num5 = this.LJIIIIZZ;
        if (num5 != null) {
            jSONObject.put("download_retry_enable", num5.intValue());
        }
        Integer num6 = this.LJIIIZ;
        if (num6 != null) {
            jSONObject.put("download_last_error_code", num6.intValue());
        }
        String str3 = this.LJIIJ;
        if (str3 != null) {
            jSONObject.put("download_last_error_msg", str3);
        }
        return jSONObject;
    }

    public C00FO(Long l, String str, List<String> list, String str2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str3) {
        this.LIZ = l;
        this.LIZIZ = str;
        this.LIZJ = list;
        this.LIZLLL = str2;
        this.LJ = num;
        this.LJFF = num2;
        this.LJI = num3;
        this.LJII = num4;
        this.LJIIIIZZ = num5;
        this.LJIIIZ = num6;
        this.LJIIJ = str3;
    }
}
