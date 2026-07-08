package X;

/* JADX INFO: renamed from: X.10Ty, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19253210Ty {
    public final String LIZ;
    public final EnumC19253310Tz LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;

    public C19253210Ty() {
        this(null, null, false, false, false, false, false, false, false, false, false, 2047);
    }

    public final String toString() {
        return "SwipeState(title=" + this.LIZ + ", animateTransition=" + this.LIZIZ + ", showArrows=" + this.LIZJ + ", exit=" + this.LIZLLL + ", clickToClose=" + this.LJ + ", bouncing=" + this.LJFF + ", enterLoadingET=" + this.LJI + ", exitLoadingET=" + this.LJII + ", enterSwipeET=" + this.LJIIIIZZ + ", exitSwipeET=" + this.LJIIIZ + ", preCreateMain=" + this.LJIIJ + ')';
    }

    public C19253210Ty(String str, EnumC19253310Tz enumC19253310Tz, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, int i) {
        str = (i & 1) != 0 ? "" : str;
        enumC19253310Tz = (i & 2) != 0 ? EnumC19253310Tz.NONE : enumC19253310Tz;
        z = (i & 4) != 0 ? false : z;
        z2 = (i & 8) != 0 ? false : z2;
        z3 = (i & 16) != 0 ? false : z3;
        z4 = (i & 32) != 0 ? false : z4;
        z5 = (i & 64) != 0 ? false : z5;
        z6 = (i & 128) != 0 ? false : z6;
        z7 = (i & 256) != 0 ? false : z7;
        z8 = (i & 512) != 0 ? false : z8;
        z9 = (i & 1024) != 0 ? false : z9;
        this.LIZ = str;
        this.LIZIZ = enumC19253310Tz;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = z3;
        this.LJFF = z4;
        this.LJI = z5;
        this.LJII = z6;
        this.LJIIIIZZ = z7;
        this.LJIIIZ = z8;
        this.LJIIJ = z9;
    }
}
