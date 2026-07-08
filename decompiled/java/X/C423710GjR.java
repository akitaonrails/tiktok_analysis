package X;

/* JADX INFO: renamed from: X.0GjR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C423710GjR {
    public final float LIZ;
    public final long LIZIZ;
    public final boolean LIZJ;

    public C423710GjR(boolean z, float f, int i) {
        long jCurrentTimeMillis;
        if ((i & 2) != 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        } else {
            jCurrentTimeMillis = 0;
        }
        z = (i & 4) != 0 ? false : z;
        this.LIZ = f;
        this.LIZIZ = jCurrentTimeMillis;
        this.LIZJ = z;
    }
}
