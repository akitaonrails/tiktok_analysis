package X;

/* JADX INFO: renamed from: X.0kvE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1337980kvE {
    public final float LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1337980kvE)) {
            return false;
        }
        C1337980kvE c1337980kvE = (C1337980kvE) obj;
        return Float.compare(this.LIZ, c1337980kvE.LIZ) == 0 && this.LIZIZ == c1337980kvE.LIZIZ;
    }

    public C1337980kvE(float f, int i) {
        this.LIZ = f;
        this.LIZIZ = i;
    }
}
