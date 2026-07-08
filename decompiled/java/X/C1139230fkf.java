package X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0fkf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1139230fkf {
    public final String LIZ;
    public final long LIZIZ;
    public final String[] LIZJ;
    public final long LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public boolean LJI;
    public int LJII;
    public Map<String, String> LJIIIIZZ;
    public boolean LJIIIZ;

    public final void LIZ() {
        this.LJII++;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetResourceRequest{mId='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("', mResourceId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mUrls='");
        sbLIZ.append(Arrays.toString(this.LIZJ));
        sbLIZ.append("', mMd5='");
        sbLIZ.append(this.LJ);
        sbLIZ.append("', mSourceFrom='");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append("', mNeedToUnzip=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1139230fkf(long j, String[] strArr, String str) {
        this.LJII = -1;
        this.LJIIIIZZ = new HashMap();
        this.LJIIIZ = false;
        this.LIZ = String.valueOf(j);
        this.LIZIZ = j;
        this.LIZJ = strArr;
        this.LJ = str;
        this.LIZLLL = 0L;
        this.LJFF = true;
    }

    public C1139230fkf(String str, long j, String[] strArr, String str2, long j2) {
        this.LJII = -1;
        this.LJIIIIZZ = new HashMap();
        this.LJIIIZ = false;
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = strArr;
        this.LJ = str2;
        this.LIZLLL = j2;
        this.LJFF = true;
    }
}
