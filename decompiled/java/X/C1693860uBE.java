package X;

/* JADX INFO: renamed from: X.0uBE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1693860uBE {
    public static final /* synthetic */ int LIZIZ = 0;
    public final int LIZ;

    public static String LIZ(int i) {
        return i == 1 ? "Hyphens.None" : i == 2 ? "Hyphens.Auto" : i == Integer.MIN_VALUE ? "Hyphens.Unspecified" : "Invalid";
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        return LIZ(this.LIZ);
    }

    public final boolean equals(Object obj) {
        int i = this.LIZ;
        if (!(obj instanceof C1693860uBE) || i != ((C1693860uBE) obj).LIZ) {
            return false;
        }
        return true;
    }
}
