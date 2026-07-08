package X;

import kotlin.jvm.internal.Intrinsics;
import webcast.data.MGEnterActionInfo;

/* JADX INFO: renamed from: X.0aCp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C926050aCp {
    public final MGEnterActionInfo LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final long LJII;
    public final int LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;

    public C926050aCp() {
        this(null, 0, null, 0, "", "", "", 0L, 0, "", "", "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C926050aCp)) {
            return false;
        }
        C926050aCp c926050aCp = (C926050aCp) obj;
        return Intrinsics.LJFF(this.LIZ, c926050aCp.LIZ) && this.LIZIZ == c926050aCp.LIZIZ && Intrinsics.LJFF(this.LIZJ, c926050aCp.LIZJ) && this.LIZLLL == c926050aCp.LIZLLL && Intrinsics.LJFF(this.LJ, c926050aCp.LJ) && Intrinsics.LJFF(this.LJFF, c926050aCp.LJFF) && Intrinsics.LJFF(this.LJI, c926050aCp.LJI) && this.LJII == c926050aCp.LJII && this.LJIIIIZZ == c926050aCp.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c926050aCp.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c926050aCp.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c926050aCp.LJIIJJI);
    }

    public final int hashCode() {
        MGEnterActionInfo mGEnterActionInfo = this.LIZ;
        int iHashCode = (((mGEnterActionInfo == null ? 0 : mGEnterActionInfo.hashCode()) * 31) + this.LIZIZ) * 31;
        String str = this.LIZJ;
        return ((((((((((((((((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.LIZLLL) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + C786410Ut5.Y2(this.LJII)) * 31) + this.LJIIIIZZ) * 31) + this.LJIIIZ.hashCode()) * 31) + this.LJIIJ.hashCode()) * 31) + this.LJIIJJI.hashCode();
    }

    public final String toString() {
        return "MgEnterContext(mgEnterActionInfo=" + this.LIZ + ", mgEnterType=" + this.LIZIZ + ", mgEnterParamsProtoJson=" + this.LIZJ + ", interactType=" + this.LIZLLL + ", shareIntent=" + this.LJ + ", shareSource=" + this.LJFF + ", sharedPlatform=" + this.LJI + ", inviterUserId=" + this.LJII + ", inviterRole=" + this.LJIIIIZZ + ", joinDirectFlag=" + this.LJIIIZ + ", enterMethod=" + this.LJIIJ + ", originLinkmicId=" + this.LJIIJJI + ')';
    }

    public C926050aCp(MGEnterActionInfo mGEnterActionInfo, int i, String str, int i2, String str2, String str3, String str4, long j, int i3, String str5, String str6, String str7) {
        this.LIZ = mGEnterActionInfo;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = i2;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = str4;
        this.LJII = j;
        this.LJIIIIZZ = i3;
        this.LJIIIZ = str5;
        this.LJIIJ = str6;
        this.LJIIJJI = str7;
    }
}
