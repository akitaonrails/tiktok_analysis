package X;

/* JADX INFO: renamed from: X.0uDA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1695060uDA {
    public static final /* synthetic */ int LIZIZ = 0;
    public final int LIZ;

    public static String LIZ(int i) {
        return i == 0 ? "Unspecified" : i == 1 ? "Text" : i == 2 ? "Ascii" : i == 3 ? "Number" : i == 4 ? "Phone" : i == 5 ? "Uri" : i == 6 ? "Email" : i == 7 ? "Password" : i == 8 ? "NumberPassword" : i == 9 ? "Decimal" : "Invalid";
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        return LIZ(this.LIZ);
    }

    public final boolean equals(Object obj) {
        int i = this.LIZ;
        if (!(obj instanceof C1695060uDA) || i != ((C1695060uDA) obj).LIZ) {
            return false;
        }
        return true;
    }
}
