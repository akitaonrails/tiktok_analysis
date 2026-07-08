package X;

/* JADX INFO: renamed from: X.0u8L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1692070u8L {
    public static final /* synthetic */ int LIZIZ = 0;
    public final int LIZ;

    public static String LIZ(int i) {
        return i == 1 ? "Left" : i == 2 ? "Right" : i == 3 ? "Center" : i == 4 ? "Justify" : i == 5 ? "Start" : i == 6 ? "End" : i == Integer.MIN_VALUE ? "Unspecified" : "Invalid";
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        return LIZ(this.LIZ);
    }

    public final boolean equals(Object obj) {
        int i = this.LIZ;
        if (!(obj instanceof C1692070u8L) || i != ((C1692070u8L) obj).LIZ) {
            return false;
        }
        return true;
    }
}
