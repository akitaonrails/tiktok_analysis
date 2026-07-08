package X;

/* JADX INFO: renamed from: X.18ft, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21343918ft {
    public final String LIZ;
    public int LIZIZ;
    public int LIZJ;

    public final char LIZ() {
        if (this.LIZJ >= this.LIZ.length()) {
            return (char) 65535;
        }
        String str = this.LIZ;
        int i = this.LIZJ;
        this.LIZJ = i + 1;
        return str.charAt(i);
    }

    public final char LIZLLL() {
        if (this.LIZJ >= this.LIZ.length()) {
            return (char) 65535;
        }
        return this.LIZ.charAt(this.LIZJ);
    }

    public C21343918ft(String str) {
        this.LIZ = str;
    }

    public final boolean LIZIZ(char c) {
        if (LIZLLL() == c) {
            LIZ();
            return true;
        }
        return false;
    }

    public final C21344018fu LIZJ(boolean z) {
        int i;
        boolean z2 = !z;
        while (true) {
            char cLIZLLL = LIZLLL();
            if ('0' > cLIZLLL || cLIZLLL >= ':') {
                break;
            }
            LIZ();
        }
        char cLIZLLL2 = LIZLLL();
        if (!z) {
            if (cLIZLLL2 == '.') {
                LIZ();
                while (true) {
                    char cLIZLLL3 = LIZLLL();
                    if ('0' > cLIZLLL3 || cLIZLLL3 >= ':') {
                        break;
                    }
                    LIZ();
                }
                z2 = false;
            }
            cLIZLLL2 = LIZLLL();
        }
        if (cLIZLLL2 != 'E' && cLIZLLL2 != 'e') {
            if (z2) {
                i = 31;
            }
            return new C21344018fu(i, this.LIZ.substring(this.LIZIZ, this.LIZJ));
        }
        LIZ();
        char cLIZLLL4 = LIZLLL();
        if (cLIZLLL4 == '+' || cLIZLLL4 == '-') {
            LIZ();
        }
        char cLIZLLL5 = LIZLLL();
        if ('0' > cLIZLLL5 || cLIZLLL5 >= ':') {
            throw new C1488370opn("lexer_invalid_number", "Scientific notation \"e\" must be followed by a number.");
        }
        while (true) {
            char cLIZLLL6 = LIZLLL();
            if ('0' > cLIZLLL6 || cLIZLLL6 >= ':') {
                break;
            }
            LIZ();
        }
        i = 2;
        return new C21344018fu(i, this.LIZ.substring(this.LIZIZ, this.LIZJ));
    }
}
