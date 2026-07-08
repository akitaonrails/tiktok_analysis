package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ykk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1869640ykk implements C164B {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final Integer LJ;
    public final Integer LJFF;
    public final boolean LJI;
    public final long LJII;
    public final Integer LJIIIIZZ;
    public final boolean LJIIIZ;
    public final String LJIIJ;

    @Override // X.C164B
    public final String b5() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1869640ykk)) {
            return false;
        }
        C1869640ykk c1869640ykk = (C1869640ykk) obj;
        return this.LIZ == c1869640ykk.LIZ && Intrinsics.LJFF(this.LIZIZ, c1869640ykk.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1869640ykk.LIZJ) && this.LIZLLL == c1869640ykk.LIZLLL && Intrinsics.LJFF(this.LJ, c1869640ykk.LJ) && Intrinsics.LJFF(this.LJFF, c1869640ykk.LJFF) && this.LJI == c1869640ykk.LJI && this.LJII == c1869640ykk.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c1869640ykk.LJIIIIZZ) && this.LJIIIZ == c1869640ykk.LJIIIZ && Intrinsics.LJFF(this.LJIIJ, c1869640ykk.LJIIJ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        String str = this.LIZIZ;
        int iHashCode = (((((i + (str == null ? 0 : str.hashCode())) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        Integer num = this.LJ;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LJFF;
        int iHashCode3 = (((((iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + C786410Ut5.Y2(this.LJII)) * 31;
        Integer num3 = this.LJIIIIZZ;
        int iHashCode4 = (((iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31) + C786410Ut5.Z2(this.LJIIIZ)) * 31;
        String str2 = this.LJIIJ;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "CaptionTranslationCacheValue(translatedSubId=" + this.LIZ + ", translatedContent=" + this.LIZIZ + ", targetLang=" + this.LIZJ + ", realtime=" + this.LIZLLL + ", aiLabTime=" + this.LJ + ", translationCacheTime=" + this.LJFF + ", isExpired=" + this.LJI + ", translatedClaSubId=" + this.LJII + ", translationSize=" + this.LJIIIIZZ + ", isPreload=" + this.LJIIIZ + ", variant=" + this.LJIIJ + ')';
    }

    @Override // X.C164B
    public final boolean a5() {
        return this.LJIIIZ;
    }

    @Override // X.C164B
    public final Integer c5() {
        return this.LJIIIIZZ;
    }

    @Override // X.C164B
    public final String getVariant() {
        return this.LJIIJ;
    }

    public C1869640ykk(int i, String str, String str2, boolean z, Integer num, Integer num2, boolean z2, long j, Integer num3, boolean z3, String str3) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = z;
        this.LJ = num;
        this.LJFF = num2;
        this.LJI = z2;
        this.LJII = j;
        this.LJIIIIZZ = num3;
        this.LJIIIZ = z3;
        this.LJIIJ = str3;
    }
}
