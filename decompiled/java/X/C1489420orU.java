package X;

/* JADX INFO: renamed from: X.0orU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1489420orU {
    public final String LIZ;
    public int LIZIZ;

    public final Character LIZIZ() {
        if (this.LIZIZ + 1 < this.LIZ.length()) {
            return Character.valueOf(this.LIZ.charAt(this.LIZIZ + 1));
        }
        return null;
    }

    public C1489420orU(String str) {
        this.LIZ = str;
    }

    public final void LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Lexer error at pos ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(": ");
        sbLIZ.append(str);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
