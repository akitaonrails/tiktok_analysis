package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cav, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C316510Cav {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C316510Cav)) {
            return false;
        }
        C316510Cav c316510Cav = (C316510Cav) obj;
        return Intrinsics.LJFF(this.LIZ, c316510Cav.LIZ) && Intrinsics.LJFF(this.LIZIZ, c316510Cav.LIZIZ) && this.LIZJ == c316510Cav.LIZJ && this.LIZLLL == c316510Cav.LIZLLL && Intrinsics.LJFF(this.LJ, c316510Cav.LJ) && Intrinsics.LJFF(this.LJFF, c316510Cav.LJFF) && this.LJI == c316510Cav.LJI && this.LJII == c316510Cav.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c316510Cav.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c316510Cav.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c316510Cav.LJIIJ);
    }

    public final int hashCode() {
        return (((((((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + C786410Ut5.Z2(this.LJII)) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ.hashCode()) * 31) + this.LJIIJ.hashCode();
    }

    public final String toString() {
        return "GroupSearchResult(conversationId=" + this.LIZ + ", groupName=" + this.LIZIZ + ", memberCount=" + this.LIZJ + ", accessCriteriaResId=" + this.LIZLLL + ", avatarUrl=" + this.LJ + ", ownerId=" + this.LJFF + ", isPublicGroup=" + this.LJI + ", isOwner=" + this.LJII + ", groupType=" + this.LJIIIIZZ + ", chatType=" + this.LJIIIZ + ", groupOwnerAccountType=" + this.LJIIJ + ')';
    }

    public C316510Cav(String str, String str2, int i, String str3, String str4, String str5, String str6, boolean z, boolean z2, String str7, int i2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = z;
        this.LJII = z2;
        this.LJIIIIZZ = str5;
        this.LJIIIZ = str6;
        this.LJIIJ = str7;
    }
}
