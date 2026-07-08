package X;

/* JADX INFO: renamed from: X.0uD9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1695050uD9 {
    public static final /* synthetic */ int LIZIZ = 0;
    public final int LIZ;

    public static String LIZ(int i) {
        return i == -1 ? "Unspecified" : i == 0 ? "None" : i == 1 ? "Characters" : i == 2 ? "Words" : i == 3 ? "Sentences" : "Invalid";
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        return LIZ(this.LIZ);
    }

    public final boolean equals(Object obj) {
        int i = this.LIZ;
        if (!(obj instanceof C1695050uD9) || i != ((C1695050uD9) obj).LIZ) {
            return false;
        }
        return true;
    }
}
