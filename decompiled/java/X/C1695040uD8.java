package X;

/* JADX INFO: renamed from: X.0uD8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1695040uD8 {
    public static final /* synthetic */ int LIZIZ = 0;
    public final int LIZ;

    public static String LIZ(int i) {
        return i == -1 ? "Unspecified" : i == 0 ? "None" : i == 1 ? "Default" : i == 2 ? "Go" : i == 3 ? "Search" : i == 4 ? "Send" : i == 5 ? "Previous" : i == 6 ? "Next" : i == 7 ? "Done" : "Invalid";
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        return LIZ(this.LIZ);
    }

    public final boolean equals(Object obj) {
        int i = this.LIZ;
        if (!(obj instanceof C1695040uD8) || i != ((C1695040uD8) obj).LIZ) {
            return false;
        }
        return true;
    }
}
