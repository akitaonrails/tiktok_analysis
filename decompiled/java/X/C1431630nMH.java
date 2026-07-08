package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0nMH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1431630nMH {
    public static final /* synthetic */ int LJIIJJI = 0;
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final JSONObject LIZLLL;
    public final long LJ;
    public long LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final EnumC1431770nMV LJIIIZ;
    public final long LJIIJ;

    public C1431630nMH() {
        this(0L, null, 2047);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UploaderVideoInfo(videoId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", coverUri=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", tosKey=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", log=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", progress=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", videoMediaInfo=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", encryptionMeta=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1431630nMH(long j, String str, int i) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6 = str;
        long j2 = j;
        if ((i & 1) != 0) {
            str2 = "";
        } else {
            str2 = null;
        }
        if ((i & 2) != 0) {
            str3 = "";
        } else {
            str3 = null;
        }
        if ((i & 4) != 0) {
            str4 = "";
        } else {
            str4 = null;
        }
        j2 = (i & 32) != 0 ? 0L : j2;
        str6 = (i & 64) != 0 ? "" : str6;
        if ((i & 128) != 0) {
            str5 = "";
        } else {
            str5 = null;
        }
        this(str2, str3, str4, null, 0L, j2, str6, str5, (i & 256) == 0 ? null : "", (i & 512) != 0 ? EnumC1431770nMV.INVALID : null, 0L);
    }

    public C1431630nMH(String str, String str2, String str3, JSONObject jSONObject, long j, long j2, String str4, String str5, String str6, EnumC1431770nMV enumC1431770nMV, long j3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = jSONObject;
        this.LJ = j;
        this.LJFF = j2;
        this.LJI = str4;
        this.LJII = str5;
        this.LJIIIIZZ = str6;
        this.LJIIIZ = enumC1431770nMV;
        this.LJIIJ = j3;
    }
}
