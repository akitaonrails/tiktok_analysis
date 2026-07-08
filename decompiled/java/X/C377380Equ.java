package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Equ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C377380Equ {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final EnumC381960EyI LJFF;
    public final EnumC377350Eqr LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final boolean LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C377380Equ)) {
            return false;
        }
        C377380Equ c377380Equ = (C377380Equ) obj;
        return Intrinsics.LJFF(this.LIZ, c377380Equ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c377380Equ.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c377380Equ.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c377380Equ.LIZLLL) && this.LJ == c377380Equ.LJ && this.LJFF == c377380Equ.LJFF && this.LJI == c377380Equ.LJI && Intrinsics.LJFF(this.LJII, c377380Equ.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c377380Equ.LJIIIIZZ) && this.LJIIIZ == c377380Equ.LJIIIZ;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ) * 31;
        EnumC381960EyI enumC381960EyI = this.LJFF;
        return ((((((((iHashCode + (enumC381960EyI == null ? 0 : enumC381960EyI.hashCode())) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AsyncTaskItem(taskId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", resourceId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", taskIcon=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", taskName=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", progress=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", status=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", serverTaskId=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", failReasonMsg=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", isAITransiton=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C377380Equ() {
        this("", "", "", "", 0, null, EnumC377350Eqr.DEFAULT, "", "", false);
    }

    public C377380Equ(String str, String str2, String str3, String str4, int i, EnumC381960EyI enumC381960EyI, EnumC377350Eqr enumC377350Eqr, String str5, String str6, boolean z) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = i;
        this.LJFF = enumC381960EyI;
        this.LJI = enumC377350Eqr;
        this.LJII = str5;
        this.LJIIIIZZ = str6;
        this.LJIIIZ = z;
    }
}
