package X;

/* JADX INFO: renamed from: X.0uB0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1693720uB0 {
    public static final /* synthetic */ int LIZIZ = 0;
    public final int LIZ;

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        return LIZ(this.LIZ);
    }

    public static String LIZ(int i) {
        if (i == 0) {
            return "EmojiSupportMatch.Default";
        }
        if (i == 1) {
            return "EmojiSupportMatch.None";
        }
        if (i == 2) {
            return "EmojiSupportMatch.All";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Invalid(value=");
        sbLIZ.append(i);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        int i = this.LIZ;
        if (!(obj instanceof C1693720uB0) || i != ((C1693720uB0) obj).LIZ) {
            return false;
        }
        return true;
    }
}
