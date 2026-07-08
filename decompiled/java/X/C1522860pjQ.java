package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0pjQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1522860pjQ {
    public static final EnumC1522880pjS LJI = EnumC1522880pjS.JPG;
    public static final EnumC1522880pjS LJII = EnumC1522880pjS.HEIF;
    public EnumC1522880pjS LIZ = LJI;
    public int LIZIZ = 75;
    public EnumC1522880pjS LIZJ = LJII;
    public String LIZLLL = "";
    public String LJ = "";
    public Map<String, String> LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageInfo(targetFormat=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", compressRate=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", srcFormat=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", src='");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append("', extPath='");
        sbLIZ.append(this.LJ);
        sbLIZ.append("')");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
