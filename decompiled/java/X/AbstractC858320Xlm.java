package X;

import java.util.List;

/* JADX INFO: renamed from: X.0Xlm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC858320Xlm<METADATA> {
    public final int LIZ;
    public final int LIZIZ;
    public AbstractC858320Xlm<METADATA> LIZJ;
    public String LIZLLL;
    public int LJ;
    public final C858330Xln LJFF;

    public boolean LIZJ(AbstractC858320Xlm<METADATA> abstractC858320Xlm) {
        return false;
    }

    public String LIZLLL(String str) {
        return str;
    }

    public String LJFF() {
        return "";
    }

    public boolean LJIIJ() {
        return this instanceof C858410Xlv;
    }

    public boolean LJIIJJI() {
        return true;
    }

    public boolean LJIIL() {
        return !(this instanceof C858410Xlv);
    }

    public abstract String LJIILJJIL();

    public final CharSequence LJ() {
        if (this.LIZLLL != null) {
            return LJIIIIZZ();
        }
        return null;
    }

    public final String LJIIIIZZ() {
        String str = this.LIZLLL;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final List<METADATA> LJI() {
        return LJII().getDescriptor();
    }

    public InterfaceC858310Xll<METADATA> LJII() {
        return this.LJFF;
    }

    public final boolean LIZ(AbstractC858320Xlm<METADATA> abstractC858320Xlm) {
        if (!LJIIJ()) {
            return false;
        }
        return LIZJ(abstractC858320Xlm);
    }

    public final void LIZIZ(AbstractC858320Xlm<METADATA> abstractC858320Xlm) {
        if (this.LIZJ == null) {
            this.LIZJ = abstractC858320Xlm;
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("this text block already has a parent, it's ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", but trying to reset its parent to ");
        sbLIZ.append(abstractC858320Xlm);
        throw new C857510XkT(C2188811AlT.LIZIZ(sbLIZ), null);
    }

    public CharSequence LJIIIZ(CharSequence charSequence) {
        return charSequence.subSequence(this.LIZ, this.LIZIZ);
    }

    public void LJIILIIL(String str) {
        this.LIZLLL = str;
    }

    public String LJIILL(CharSequence charSequence) {
        String string;
        String strLJFF = LJFF();
        CharSequence charSequenceLJIIIZ = LJIIIZ(charSequence);
        CharSequence charSequenceLJ = LJ();
        if (charSequenceLJ == null || (string = charSequenceLJ.toString()) == null) {
            string = "";
        }
        String strLIZLLL = LIZLLL(string);
        boolean z = true;
        if (strLJFF.length() == 0) {
            return charSequenceLJIIIZ.toString();
        }
        if (strLIZLLL.length() <= 0) {
            z = false;
        }
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('<');
            sbLIZ.append(strLJFF);
            sbLIZ.append(" id=\"");
            sbLIZ.append(strLIZLLL);
            sbLIZ.append("\">");
            sbLIZ.append((Object) charSequenceLJIIIZ);
            sbLIZ.append("</");
            sbLIZ.append(strLJFF);
            sbLIZ.append('>');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append('<');
        sbLIZ2.append(strLJFF);
        sbLIZ2.append('>');
        sbLIZ2.append((Object) charSequenceLJIIIZ);
        sbLIZ2.append("</");
        sbLIZ2.append(strLJFF);
        sbLIZ2.append('>');
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public AbstractC858320Xlm(int i, int i2, int i3) {
        this.LIZ = i;
        this.LIZIZ = i2;
        if (i3 >= 0) {
            this.LJFF = new InterfaceC858310Xll<METADATA>() { // from class: X.0Xln
                @Override // X.InterfaceC858310Xll
                public final List<METADATA> getDescriptor() {
                    return C13BV.INSTANCE;
                }
            };
            return;
        }
        throw new C857510XkT("", null);
    }
}
