package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Kyv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C535230Kyv {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final long LJI;
    public final Integer LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C535230Kyv)) {
            return false;
        }
        C535230Kyv c535230Kyv = (C535230Kyv) obj;
        return Intrinsics.LJFF(this.LIZ, c535230Kyv.LIZ) && Intrinsics.LJFF(this.LIZIZ, c535230Kyv.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c535230Kyv.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c535230Kyv.LIZLLL) && Intrinsics.LJFF(this.LJ, c535230Kyv.LJ) && Intrinsics.LJFF(this.LJFF, c535230Kyv.LJFF) && this.LJI == c535230Kyv.LJI && Intrinsics.LJFF(this.LJII, c535230Kyv.LJII);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AiSelfResult(taskId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", styleId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", styleName=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", childStyleId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", anchorIconUrl=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", remoteUrl=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", createTimeMs=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", status=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C535230Kyv(String str, String str2, String str3, String str4, String str5, String str6, long j, Integer num) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = j;
        this.LJII = num;
    }
}
