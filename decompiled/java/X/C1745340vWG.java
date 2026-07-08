package X;

/* JADX INFO: renamed from: X.0vWG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1745340vWG {
    public final String LIZ;
    public final EnumC1154240g8s LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public final Integer LJ;
    public String LJFF;

    public C1745340vWG() {
        this(null, null, false, null, null, 31);
    }

    public final boolean LIZ() {
        return C703302op.LIZ(this.LIZ) && this.LIZIZ == EnumC1154240g8s.ERROR && !this.LIZJ;
    }

    public C1745340vWG(String str, EnumC1154240g8s enumC1154240g8s, boolean z, String str2, Integer num, int i) {
        str = (i & 1) != 0 ? null : str;
        enumC1154240g8s = (i & 2) != 0 ? EnumC1154240g8s.ERROR : enumC1154240g8s;
        z = (i & 4) != 0 ? false : z;
        str2 = (i & 8) != 0 ? null : str2;
        num = (i & 16) != 0 ? null : num;
        this.LIZ = str;
        this.LIZIZ = enumC1154240g8s;
        this.LIZJ = z;
        this.LIZLLL = str2;
        this.LJ = num;
    }
}
