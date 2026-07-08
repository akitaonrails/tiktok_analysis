package X;

/* JADX INFO: renamed from: X.0dKe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1046220dKe {
    public final boolean LIZ;
    public final EnumC1046210dKd LIZIZ;
    public final Integer LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;

    public C1046220dKe(EnumC1046210dKd enumC1046210dKd, boolean z, int i) {
        Integer num;
        enumC1046210dKd = (i & 2) != 0 ? EnumC1046210dKd.USE_ONE_PIV : enumC1046210dKd;
        if ((i & 4) != 0) {
            num = 1;
        } else {
            num = null;
        }
        z = (i & 16) != 0 ? false : z;
        this.LIZ = false;
        this.LIZIZ = enumC1046210dKd;
        this.LIZJ = num;
        this.LIZLLL = false;
        this.LJ = z;
    }
}
