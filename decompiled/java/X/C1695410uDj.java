package X;

/* JADX INFO: renamed from: X.0uDj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1695410uDj {
    public static final /* synthetic */ int LIZIZ = 0;
    public final int LIZ;

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        int i = this.LIZ;
        return i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
    }

    public final boolean equals(Object obj) {
        int i = this.LIZ;
        if (!(obj instanceof C1695410uDj) || i != ((C1695410uDj) obj).LIZ) {
            return false;
        }
        return true;
    }
}
