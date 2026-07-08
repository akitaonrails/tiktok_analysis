package X;

/* JADX INFO: renamed from: X.0TqL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C759230TqL {
    public final AbstractC1110520f0M<? extends AbstractC1136060ffY> LIZ;
    public boolean LIZIZ;
    public final boolean LIZJ;
    public boolean LIZLLL;

    public C759230TqL() {
        this(null, false, 15);
    }

    public C759230TqL(AbstractC1110520f0M abstractC1110520f0M, boolean z, int i) {
        boolean z2;
        abstractC1110520f0M = (i & 1) != 0 ? null : abstractC1110520f0M;
        z = (i & 4) != 0 ? false : z;
        if ((i & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LIZ = abstractC1110520f0M;
        this.LIZIZ = false;
        this.LIZJ = z;
        this.LIZLLL = z2;
    }
}
