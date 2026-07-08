package X;

/* JADX INFO: renamed from: X.0Gdh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C420150Gdh {
    public final int LIZ;
    public final float LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C420150Gdh)) {
            return false;
        }
        C420150Gdh c420150Gdh = (C420150Gdh) obj;
        return this.LIZ == c420150Gdh.LIZ && Float.compare(this.LIZIZ, c420150Gdh.LIZIZ) == 0;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + Float.floatToIntBits(this.LIZIZ);
    }

    public C420150Gdh(int i, float f) {
        this.LIZ = i;
        this.LIZIZ = f;
    }
}
