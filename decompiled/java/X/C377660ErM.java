package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ErM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C377660ErM {
    public final boolean LIZ;
    public final int LIZIZ;
    public final EnumC381960EyI LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final boolean LJFF;
    public final String LJI;
    public final int LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;

    public C377660ErM() {
        this(false, 0, null, 0, 0, false, null, 0, null, null, 1023);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C377660ErM)) {
            return false;
        }
        C377660ErM c377660ErM = (C377660ErM) obj;
        return this.LIZ == c377660ErM.LIZ && this.LIZIZ == c377660ErM.LIZIZ && this.LIZJ == c377660ErM.LIZJ && this.LIZLLL == c377660ErM.LIZLLL && this.LJ == c377660ErM.LJ && this.LJFF == c377660ErM.LJFF && Intrinsics.LJFF(this.LJI, c377660ErM.LJI) && this.LJII == c377660ErM.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c377660ErM.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c377660ErM.LJIIIZ);
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ) * 31;
        EnumC381960EyI enumC381960EyI = this.LIZJ;
        return ((((((((((((((iZ2 + (enumC381960EyI == null ? 0 : enumC381960EyI.hashCode())) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + this.LJI.hashCode()) * 31) + this.LJII) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GenerateResult(result=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", quota=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", quotaMax=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isAsync=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", asyncTaskId=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", progress=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", t2iBgFilePath=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", serverTaskId=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C377660ErM(boolean z, int i, EnumC381960EyI enumC381960EyI, int i2, int i3, boolean z2, String str, int i4, String str2, String str3, int i5) {
        z = (i5 & 1) != 0 ? true : z;
        i = (i5 & 2) != 0 ? 0 : i;
        enumC381960EyI = (i5 & 4) != 0 ? null : enumC381960EyI;
        i2 = (i5 & 8) != 0 ? 0 : i2;
        i3 = (i5 & 16) != 0 ? 0 : i3;
        z2 = (i5 & 32) != 0 ? false : z2;
        str = (i5 & 64) != 0 ? "" : str;
        i4 = (i5 & 128) != 0 ? 0 : i4;
        str2 = (i5 & 256) != 0 ? "" : str2;
        str3 = (i5 & 512) != 0 ? "" : str3;
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = enumC381960EyI;
        this.LIZLLL = i2;
        this.LJ = i3;
        this.LJFF = z2;
        this.LJI = str;
        this.LJII = i4;
        this.LJIIIIZZ = str2;
        this.LJIIIZ = str3;
    }
}
