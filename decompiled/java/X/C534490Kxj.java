package X;

import java.io.File;
import java.util.Map;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0Kxj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C534490Kxj {
    public final long LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ = ".mp4";
    public final String LJFF = "video/mp4";
    public final Map<String, String> LJI;

    public final String LIZ() {
        String strLIZIZ = this.LJ;
        if (strLIZIZ == null) {
            return String.valueOf(this.LIZ);
        }
        if (strLIZIZ.length() == 0) {
            return String.valueOf(this.LIZ);
        }
        if (!u.LJJIIJZLJL(strLIZIZ, e3.d, false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('.');
            sbLIZ.append(strLIZIZ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LIZ);
        sbLIZ2.append(strLIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public final String LIZIZ() {
        String str = this.LIZLLL;
        String str2 = File.separator;
        if (u.LJIIZILJ(str, str2, false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZLLL);
            sbLIZ.append(LIZ());
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LIZLLL);
        sbLIZ2.append(str2);
        sbLIZ2.append(LIZ());
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DownloadConfig(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", createTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", url='");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append("', dir='");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append("', suffix=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", mimeType=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C534490Kxj(long j, long j2, String str, String str2, Map map) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJI = map;
    }
}
