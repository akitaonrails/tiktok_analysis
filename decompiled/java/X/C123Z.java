package X;

/* JADX INFO: renamed from: X.123Z, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C123Z {
    public final String LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public boolean LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C123Z() {
        this((String) null, 0, (boolean) (0 == true ? 1 : 0), 15);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C123Z(String str, int i, boolean z, int i2) {
        str = (i2 & 1) != 0 ? "" : str;
        this(str, (i2 & 2) != 0 ? str.length() : i, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0);
    }

    public C123Z(String str, int i, boolean z, boolean z2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = z;
        this.LIZLLL = z2;
    }
}
