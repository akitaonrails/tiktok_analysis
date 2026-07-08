package X;

import java.io.IOException;

/* JADX INFO: renamed from: X.12yu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19933012yu {
    public final Appendable LIZ;
    public boolean LIZLLL;
    public final StringBuilder LIZIZ = new StringBuilder();
    public boolean LJ = false;
    public final boolean LIZJ = false;

    public final void LIZ() throws IOException {
        if (!this.LIZJ) {
            this.LIZ.append("\n");
        }
        this.LJ = true;
    }

    public final void LIZIZ() throws IOException {
        if (!this.LIZLLL) {
            this.LIZ.append(" ");
        } else {
            this.LIZ.append(" \t ");
            this.LIZLLL = false;
        }
    }

    public final void LIZJ() {
        int length = this.LIZIZ.length();
        if (length == 0) {
            throw new IllegalArgumentException(" Outdent() without matching Indent().");
        }
        this.LIZIZ.setLength(length - 2);
    }

    public final void LIZLLL(CharSequence charSequence) throws IOException {
        CharSequence charSequence2;
        if (this.LJ) {
            this.LJ = false;
            Appendable appendable = this.LIZ;
            if (this.LIZJ) {
                charSequence2 = " ";
            } else {
                charSequence2 = this.LIZIZ;
            }
            appendable.append(charSequence2);
        }
        this.LIZ.append(charSequence);
    }

    public C19933012yu(Appendable appendable, boolean z) {
        this.LIZ = appendable;
        this.LIZLLL = z;
    }
}
