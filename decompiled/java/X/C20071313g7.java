package X;

/* JADX INFO: renamed from: X.13g7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20071313g7 {
    public static final /* synthetic */ int LIZIZ = 0;
    public final int LIZ;

    public static String LIZ(int i) {
        return i == 1 ? "Next" : i == 2 ? "Previous" : i == 3 ? "Left" : i == 4 ? "Right" : i == 5 ? "Up" : i == 6 ? "Down" : i == 7 ? "Enter" : i == 8 ? "Exit" : "Invalid FocusDirection";
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        return LIZ(this.LIZ);
    }

    public final boolean equals(Object obj) {
        int i = this.LIZ;
        if (!(obj instanceof C20071313g7) || i != ((C20071313g7) obj).LIZ) {
            return false;
        }
        return true;
    }
}
