package X;

/* JADX INFO: renamed from: X.0uAg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1693520uAg {
    public static final C1693520uAg LIZJ = new C1693520uAg();
    public final boolean LIZ;
    public final int LIZIZ;

    public C1693520uAg() {
        this(false, 0);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlatformParagraphStyle(includeFontPadding=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", emojiSupportMatch=");
        sbLIZ.append((Object) C1693720uB0.LIZ(this.LIZIZ));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1693520uAg(int i) {
        this.LIZ = true;
        this.LIZIZ = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1693520uAg)) {
            return false;
        }
        C1693520uAg c1693520uAg = (C1693520uAg) obj;
        if (this.LIZ == c1693520uAg.LIZ && this.LIZIZ == c1693520uAg.LIZIZ) {
            return true;
        }
        return false;
    }

    public C1693520uAg(boolean z, int i) {
        this.LIZ = z;
        this.LIZIZ = i;
    }
}
