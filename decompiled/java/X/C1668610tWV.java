package X;

/* JADX INFO: renamed from: X.0tWV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1668610tWV {
    public final float LIZ;
    public final float LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1668610tWV)) {
            return false;
        }
        C1668610tWV c1668610tWV = (C1668610tWV) obj;
        return Float.compare(this.LIZ, c1668610tWV.LIZ) == 0 && Float.compare(this.LIZIZ, c1668610tWV.LIZIZ) == 0;
    }

    public C1668610tWV(float f, float f2) {
        this.LIZ = f;
        this.LIZIZ = f2;
    }
}
