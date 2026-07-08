package X;

/* JADX INFO: renamed from: X.0uAE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1693240uAE {
    public static final /* synthetic */ int LIZIZ = 0;
    public final int LIZ;

    public static String LIZ(int i) {
        return i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid";
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        return LIZ(this.LIZ);
    }

    public final boolean equals(Object obj) {
        int i = this.LIZ;
        if (!(obj instanceof C1693240uAE) || i != ((C1693240uAE) obj).LIZ) {
            return false;
        }
        return true;
    }
}
