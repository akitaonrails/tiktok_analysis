package X;

/* JADX INFO: renamed from: X.0DS7, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DS7 {
    public final int LIZ;
    public final int LIZIZ;
    public final Long LIZJ;
    public final String LIZLLL;

    public C0DS7() {
        this(0, 0, null, null, 15);
    }

    public C0DS7(int i, int i2, Long l, String str, int i3) {
        i = (i3 & 1) != 0 ? -1 : i;
        i2 = (i3 & 2) != 0 ? 0 : i2;
        l = (i3 & 4) != 0 ? null : l;
        str = (i3 & 8) != 0 ? null : str;
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = l;
        this.LIZLLL = str;
    }
}
