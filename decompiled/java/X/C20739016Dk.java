package X;

/* JADX INFO: renamed from: X.16Dk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20739016Dk implements InterfaceC0148002o {
    public final boolean LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;
    public final boolean LLIZ;
    public final EnumC1757150vpJ LLIZLLLIL;
    public final boolean LLJ;
    public final boolean LLJI;

    /* JADX WARN: Illegal instructions before constructor call */
    public C20739016Dk() {
        boolean z = false;
        this(z, z, z, z, z, 1023);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20739016Dk)) {
            return false;
        }
        C20739016Dk c20739016Dk = (C20739016Dk) obj;
        return this.LL == c20739016Dk.LL && this.LLILLJJLI == c20739016Dk.LLILLJJLI && this.LLILLL == c20739016Dk.LLILLL && this.LLILZ == c20739016Dk.LLILZ && this.LLILZIL == c20739016Dk.LLILZIL && this.LLILZLL == c20739016Dk.LLILZLL && this.LLIZ == c20739016Dk.LLIZ && this.LLIZLLLIL == c20739016Dk.LLIZLLLIL && this.LLJ == c20739016Dk.LLJ && this.LLJI == c20739016Dk.LLJI;
    }

    public final int hashCode() {
        int iZ2 = ((((((((((((C786410Ut5.Z2(this.LL) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31;
        EnumC1757150vpJ enumC1757150vpJ = this.LLIZLLLIL;
        return ((((iZ2 + (enumC1757150vpJ == null ? 0 : enumC1757150vpJ.hashCode())) * 31) + C786410Ut5.Z2(this.LLJ)) * 31) + C786410Ut5.Z2(this.LLJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("State(isWidgetShow=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isMaskShow=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isPlaying=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isStopped=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isLoading=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", isError=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", isMute=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", closeType=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", isSurfaceReady=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", isHideToSide=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C20739016Dk(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        this(false, (i & 2) != 0 ? false : z, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? false : z4, false, (i & 64) != 0 ? false : z5, null, false, false);
    }

    public C20739016Dk(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, EnumC1757150vpJ enumC1757150vpJ, boolean z8, boolean z9) {
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = z3;
        this.LLILZ = z4;
        this.LLILZIL = z5;
        this.LLILZLL = z6;
        this.LLIZ = z7;
        this.LLIZLLLIL = enumC1757150vpJ;
        this.LLJ = z8;
        this.LLJI = z9;
    }

    public static C20739016Dk LIZ(C20739016Dk c20739016Dk, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, EnumC1757150vpJ enumC1757150vpJ, boolean z8, boolean z9, int i) {
        boolean z10 = z9;
        boolean z11 = z8;
        EnumC1757150vpJ enumC1757150vpJ2 = enumC1757150vpJ;
        boolean z12 = z7;
        boolean z13 = z6;
        boolean z14 = z5;
        boolean z15 = z4;
        boolean z16 = z3;
        boolean z17 = z2;
        boolean z18 = z;
        if ((i & 1) != 0) {
            z18 = c20739016Dk.LL;
        }
        if ((i & 2) != 0) {
            z17 = c20739016Dk.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z16 = c20739016Dk.LLILLL;
        }
        if ((i & 8) != 0) {
            z15 = c20739016Dk.LLILZ;
        }
        if ((i & 16) != 0) {
            z14 = c20739016Dk.LLILZIL;
        }
        if ((i & 32) != 0) {
            z13 = c20739016Dk.LLILZLL;
        }
        if ((i & 64) != 0) {
            z12 = c20739016Dk.LLIZ;
        }
        if ((i & 128) != 0) {
            enumC1757150vpJ2 = c20739016Dk.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            z11 = c20739016Dk.LLJ;
        }
        if ((i & 512) != 0) {
            z10 = c20739016Dk.LLJI;
        }
        c20739016Dk.getClass();
        return new C20739016Dk(z18, z17, z16, z15, z14, z13, z12, enumC1757150vpJ2, z11, z10);
    }
}
