package X;

/* JADX INFO: renamed from: X.12st, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19895712st extends AbstractC19896212sy {
    public final char LL;

    public final String toString() {
        String strLJIIIIZZ = AbstractC19895412sq.LJIIIIZZ(this.LL);
        StringBuilder sb = new StringBuilder(String.valueOf(strLJIIIIZZ).length() + 18);
        sb.append("CharMatcher.is('");
        sb.append(strLJIIIIZZ);
        sb.append("')");
        return sb.toString();
    }

    public C19895712st(char c) {
        this.LL = c;
    }

    @Override // X.AbstractC19895412sq
    public final boolean LIZLLL(char c) {
        if (c == this.LL) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC19895412sq
    public final String LJII(CharSequence charSequence) {
        return charSequence.toString().replace(this.LL, '.');
    }
}
