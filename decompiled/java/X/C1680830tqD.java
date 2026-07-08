package X;

/* JADX INFO: renamed from: X.0tqD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1680830tqD {
    public static final /* synthetic */ int LIZIZ = 0;
    public final int LIZ;

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        int i = this.LIZ;
        return i == 0 ? "Argb8888" : i == 1 ? "Alpha8" : i == 2 ? "Rgb565" : i == 3 ? "F16" : i == 4 ? "Gpu" : "Unknown";
    }

    public final boolean equals(Object obj) {
        int i = this.LIZ;
        if (!(obj instanceof C1680830tqD) || i != ((C1680830tqD) obj).LIZ) {
            return false;
        }
        return true;
    }
}
