package X;

import java.util.List;

/* JADX INFO: renamed from: X.14w4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20425014w4 {
    public final long LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final List<Long> LJ;
    public final long LJFF;
    public final long LJI;
    public String LJII;
    public final String LJIIIIZZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SyeTaskStateData(next=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", end=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", name=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", comment=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", prev=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", version=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", minAppVersion=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", parameter=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", conditions=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C20425014w4(long j, boolean z, String str, String str2, List<Long> list, long j2, long j3, String str3, String str4) {
        this.LIZ = j;
        this.LIZIZ = z;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = list;
        this.LJFF = j2;
        this.LJI = j3;
        this.LJII = str3;
        this.LJIIIIZZ = str4;
    }
}
