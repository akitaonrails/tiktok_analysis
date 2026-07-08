package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Bbj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2208251Bbj {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final long LJFF;
    public final String LJI;
    public final long LJII;
    public final long LJIIIIZZ;
    public final long LJIIIZ;
    public final long LJIIJ;
    public final long LJIIJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2208251Bbj)) {
            return false;
        }
        C2208251Bbj c2208251Bbj = (C2208251Bbj) obj;
        return Intrinsics.LJFF(this.LIZ, c2208251Bbj.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2208251Bbj.LIZIZ) && this.LIZJ == c2208251Bbj.LIZJ && Intrinsics.LJFF(this.LIZLLL, c2208251Bbj.LIZLLL) && Intrinsics.LJFF(this.LJ, c2208251Bbj.LJ) && this.LJFF == c2208251Bbj.LJFF && Intrinsics.LJFF(this.LJI, c2208251Bbj.LJI) && this.LJII == c2208251Bbj.LJII && this.LJIIIIZZ == c2208251Bbj.LJIIIIZZ && this.LJIIIZ == c2208251Bbj.LJIIIZ && this.LJIIJ == c2208251Bbj.LJIIJ && this.LJIIJJI == c2208251Bbj.LJIIJJI;
    }

    public final int hashCode() {
        return (((((((((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + C786410Ut5.Y2(this.LJFF)) * 31) + this.LJI.hashCode()) * 31) + C786410Ut5.Y2(this.LJII)) * 31) + C786410Ut5.Y2(this.LJIIIIZZ)) * 31) + C786410Ut5.Y2(this.LJIIIZ)) * 31) + C786410Ut5.Y2(this.LJIIJ)) * 31) + C786410Ut5.Y2(this.LJIIJJI);
    }

    public final String toString() {
        return "Params(perfPhase=" + this.LIZ + ", scene=" + this.LIZIZ + ", status=" + this.LIZJ + ", failStage=" + this.LIZLLL + ", failReason=" + this.LJ + ", errorCode=" + this.LJFF + ", errorDomain=" + this.LJI + ", totalMs=" + this.LJII + ", stillMs=" + this.LJIIIIZZ + ", motionMs=" + this.LJIIIZ + ", stillSizeKb=" + this.LJIIJ + ", motionSizeKb=" + this.LJIIJJI + ')';
    }

    public C2208251Bbj(String str, String str2, int i, String str3, String str4, long j, String str5, long j2, long j3, long j4, long j5, long j6) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = j;
        this.LJI = str5;
        this.LJII = j2;
        this.LJIIIIZZ = j3;
        this.LJIIIZ = j4;
        this.LJIIJ = j5;
        this.LJIIJJI = j6;
    }
}
