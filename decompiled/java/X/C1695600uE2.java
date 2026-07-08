package X;

/* JADX INFO: renamed from: X.0uE2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1695600uE2 {
    public static final /* synthetic */ int LIZIZ = 0;
    public final int LIZ;

    public static String LIZ(int i) {
        return i == 0 ? "Butt" : i == 1 ? "Round" : i == 2 ? "Square" : "Unknown";
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        return LIZ(this.LIZ);
    }

    public final boolean equals(Object obj) {
        int i = this.LIZ;
        if (!(obj instanceof C1695600uE2) || i != ((C1695600uE2) obj).LIZ) {
            return false;
        }
        return true;
    }
}
