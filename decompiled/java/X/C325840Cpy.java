package X;

import java.util.List;

/* JADX INFO: renamed from: X.0Cpy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C325840Cpy {
    public final String LIZ;
    public final Integer LIZIZ;
    public final List<String> LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiAiSummaryCursor(aiVideoCursor=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", hasMoreAweme=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", awemeIds=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", poiId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", dimensionKey=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", dataVersion=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C325840Cpy(String str, String str2, Integer num, String str3, String str4, List list) {
        this.LIZ = str;
        this.LIZIZ = num;
        this.LIZJ = list;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = str4;
    }
}
