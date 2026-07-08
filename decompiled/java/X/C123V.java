package X;

/* JADX INFO: renamed from: X.123V, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C123V {
    public final boolean LIZ;
    public final float LIZIZ;
    public final int LIZJ;

    public C123V() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C123V)) {
            return false;
        }
        C123V c123v = (C123V) obj;
        return this.LIZ == c123v.LIZ && Float.compare(this.LIZIZ, c123v.LIZIZ) == 0 && this.LIZJ == c123v.LIZJ;
    }

    public final float LIZ() {
        float f = this.LIZIZ;
        if (f == 0.0f) {
            return 1.0f;
        }
        return 1 / f;
    }

    public /* synthetic */ C123V(int i) {
        this(true, 1.0f, -1);
    }

    public C123V(boolean z, float f, int i) {
        this.LIZ = z;
        this.LIZIZ = f;
        this.LIZJ = i;
    }
}
