package X;

/* JADX INFO: renamed from: X.0uAu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1693660uAu {
    public static final int LIZIZ = 66305;
    public final int LIZ;

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        return LIZ(this.LIZ);
    }

    public /* synthetic */ C1693660uAu(int i) {
        this.LIZ = i;
    }

    public static String LIZ(int i) {
        boolean z;
        String str;
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LineBreak(strategy=");
        int i2 = i & 255;
        if (i2 == 1) {
            z = true;
        } else {
            z = false;
        }
        String str3 = "Invalid";
        if (z) {
            str = "Strategy.Simple";
        } else if (i2 == 2) {
            str = "Strategy.HighQuality";
        } else if (i2 == 3) {
            str = "Strategy.Balanced";
        } else if (i2 != 0) {
            str = "Invalid";
        } else {
            str = "Strategy.Unspecified";
        }
        sbLIZ.append((Object) str);
        sbLIZ.append(", strictness=");
        int i3 = (i >> 8) & 255;
        if (i3 == 1) {
            str2 = "Strictness.None";
        } else if (i3 == 2) {
            str2 = "Strictness.Loose";
        } else if (i3 == 3) {
            str2 = "Strictness.Normal";
        } else if (i3 == 4) {
            str2 = "Strictness.Strict";
        } else if (i3 != 0) {
            str2 = "Invalid";
        } else {
            str2 = "Strictness.Unspecified";
        }
        sbLIZ.append((Object) str2);
        sbLIZ.append(", wordBreak=");
        int i4 = (i >> 16) & 255;
        if (i4 == 1) {
            str3 = "WordBreak.None";
        } else if (i4 == 2) {
            str3 = "WordBreak.Phrase";
        } else if (i4 == 0) {
            str3 = "WordBreak.Unspecified";
        }
        sbLIZ.append((Object) str3);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        int i = this.LIZ;
        if (!(obj instanceof C1693660uAu) || i != ((C1693660uAu) obj).LIZ) {
            return false;
        }
        return true;
    }
}
