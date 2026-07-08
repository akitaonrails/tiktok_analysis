package X;

/* JADX INFO: renamed from: X.0HZD, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HZD {
    public final boolean LIZ;
    public final String LIZIZ;
    public final int LIZJ;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C0HZD(boolean z, int i) {
        String str;
        int i2 = 0;
        z = (i & 1) != 0 ? false : z;
        if ((i & 2) != 0) {
            str = "personal_homepage";
        } else {
            str = null;
        }
        if ((i & 4) != 0) {
            if (C435330H5f.LIZ()) {
                i2 = 2131833987;
            } else {
                i2 = 2131827073;
            }
        }
        this(z, str, i2);
    }

    public C0HZD(boolean z, String str, int i) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = i;
    }
}
