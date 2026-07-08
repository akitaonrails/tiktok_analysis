package X;

import java.util.List;

/* JADX INFO: renamed from: X.01cS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C371801cS {
    public final String LIZ;
    public final List<String> LIZIZ;
    public final String LIZJ;
    public final List<String> LIZLLL;
    public final String LJ;
    public final Integer LJFF;
    public final String LJI;

    public C371801cS() {
        this(null, null, null, null, null, null, C13BV.INSTANCE);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EffectZipResult(sdkVersion=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", features=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", effectType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", requirements=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", modelNames=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", openGlEsVersion=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", sdkExtra=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C371801cS(String str, String str2, Integer num, String str3, String str4, List list, List list2) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = str2;
        this.LIZLLL = list2;
        this.LJ = str3;
        this.LJFF = num;
        this.LJI = str4;
    }
}
