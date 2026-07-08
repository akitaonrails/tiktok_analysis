package X;

/* JADX INFO: renamed from: X.0EPh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C364110EPh {
    public final float LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C364110EPh)) {
            return false;
        }
        C364110EPh c364110EPh = (C364110EPh) obj;
        return Float.compare(this.LIZ, c364110EPh.LIZ) == 0 && this.LIZIZ == c364110EPh.LIZIZ && this.LIZJ == c364110EPh.LIZJ;
    }

    public C364110EPh(float f, boolean z, boolean z2) {
        this.LIZ = f;
        this.LIZIZ = z;
        this.LIZJ = z2;
    }
}
