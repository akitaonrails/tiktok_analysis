package X;

/* JADX INFO: renamed from: X.18vW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21440818vW extends AbstractC21440018vO {
    public final C21440218vQ LIZ;
    public String LIZIZ;
    public final StringBuilder LIZJ;

    @Override // X.AbstractC21440018vO, X.InterfaceC21443518vx
    public final void LJII() {
        this.LIZ.LJIIIIZZ = C21443018vs.LIZ(this.LIZIZ.trim());
        this.LIZ.LJIIIZ = this.LIZJ.toString();
    }

    @Override // X.InterfaceC21443518vx
    public final AbstractC21439018vE LIZIZ() {
        return this.LIZ;
    }

    @Override // X.AbstractC21440018vO, X.InterfaceC21443518vx
    public void LIZJ(CharSequence charSequence) {
        if (this.LIZIZ == null) {
            this.LIZIZ = charSequence.toString();
        } else {
            this.LIZJ.append(charSequence);
            this.LIZJ.append('\n');
        }
    }

    @Override // X.InterfaceC21443518vx
    public C21445418wG LJFF(InterfaceC21449618ww interfaceC21449618ww) {
        C21440618vU c21440618vU = (C21440618vU) interfaceC21449618ww;
        int i = c21440618vU.LJ;
        int i2 = c21440618vU.LIZIZ;
        CharSequence charSequence = c21440618vU.LIZ;
        if (c21440618vU.LJI < 4) {
            C21440218vQ c21440218vQ = this.LIZ;
            char c = c21440218vQ.LJFF;
            int i3 = c21440218vQ.LJI;
            int iLIZIZ = C21439918vN.LIZIZ(c, charSequence, i, charSequence.length()) - i;
            if (iLIZIZ >= i3 && C21439918vN.LIZJ(i + iLIZIZ, charSequence.length(), charSequence) == charSequence.length()) {
                return C21445418wG.LIZIZ();
            }
        }
        int length = charSequence.length();
        for (int i4 = this.LIZ.LJII; i4 > 0 && i2 < length && charSequence.charAt(i2) == ' '; i4--) {
            i2++;
        }
        return C21445418wG.LIZ(i2);
    }

    public C21440818vW(char c, int i, int i2) {
        C21440218vQ c21440218vQ = new C21440218vQ();
        this.LIZ = c21440218vQ;
        this.LIZJ = new StringBuilder();
        c21440218vQ.LJFF = c;
        c21440218vQ.LJI = i;
        c21440218vQ.LJII = i2;
    }
}
