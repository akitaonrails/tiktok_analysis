package X;

/* JADX INFO: renamed from: X.03XI, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03XI {
    public final Integer LIZ;
    public final String LIZIZ;
    public final int LIZJ;

    public C03XI() {
        this(0, null, null, 7);
    }

    public C03XI(int i, Integer num, String str, int i2) {
        num = (i2 & 1) != 0 ? null : num;
        str = (i2 & 2) != 0 ? null : str;
        i = (i2 & 4) != 0 ? 1 : i;
        this.LIZ = num;
        this.LIZIZ = str;
        this.LIZJ = i;
    }
}
