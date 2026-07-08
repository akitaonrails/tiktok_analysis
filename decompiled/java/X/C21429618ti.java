package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.18ti, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21429618ti extends AbstractC21440018vO {
    public final C21428718tZ LIZ;
    public final List<CharSequence> LIZIZ;
    public final List<EnumC21429518th> LIZJ;
    public final List<String> LIZLLL;
    public final C21428118tT LJ;
    public final StringBuilder LJFF;
    public boolean LJI;

    @Override // X.AbstractC21440018vO, X.InterfaceC21443518vx
    public final void LJII() {
        C21428118tT c21428118tT = this.LJ;
        c21428118tT.LJFF = "table";
        c21428118tT.LJI = this.LJFF.toString();
    }

    @Override // X.InterfaceC21443518vx
    public final AbstractC21439018vE LIZIZ() {
        return this.LIZ;
    }

    public static List<EnumC21429518th> LJIIIZ(CharSequence charSequence) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            EnumC21429518th enumC21429518th = null;
            if (i < charSequence.length()) {
                char cCharAt = charSequence.charAt(i);
                if (cCharAt != '\t' && cCharAt != ' ') {
                    boolean z3 = true;
                    if (cCharAt != '-' && cCharAt != ':') {
                        if (cCharAt != '|') {
                            return null;
                        }
                        i++;
                        i2++;
                        if (i2 > 1) {
                            return null;
                        }
                        z2 = true;
                    } else {
                        if (i2 == 0 && !arrayList.isEmpty()) {
                            return null;
                        }
                        if (cCharAt == ':') {
                            i++;
                            z = true;
                        } else {
                            z = false;
                        }
                        boolean z4 = false;
                        while (i < charSequence.length() && charSequence.charAt(i) == '-') {
                            i++;
                            z4 = true;
                        }
                        if (!z4) {
                            return null;
                        }
                        if (i < charSequence.length() && charSequence.charAt(i) == ':') {
                            i++;
                        } else {
                            z3 = false;
                        }
                        if (z) {
                            if (z3) {
                                enumC21429518th = EnumC21429518th.CENTER;
                            } else {
                                enumC21429518th = EnumC21429518th.LEFT;
                            }
                        } else if (z3) {
                            enumC21429518th = EnumC21429518th.RIGHT;
                        }
                        arrayList.add(enumC21429518th);
                        i2 = 0;
                    }
                } else {
                    i++;
                }
            } else {
                if (!z2) {
                    return null;
                }
                return arrayList;
            }
        }
    }

    public static List<String> LJIIJ(CharSequence charSequence) {
        String strTrim = charSequence.toString().trim();
        if (strTrim.startsWith("|")) {
            strTrim = strTrim.substring(1);
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < strTrim.length()) {
            char cCharAt = strTrim.charAt(i);
            if (cCharAt != '\\') {
                if (cCharAt != '|') {
                    sb.append(cCharAt);
                } else {
                    arrayList.add(sb.toString());
                    sb.setLength(0);
                }
            } else {
                int i2 = i + 1;
                if (i2 < strTrim.length() && strTrim.charAt(i2) == '|') {
                    sb.append('|');
                    i = i2;
                } else {
                    sb.append('\\');
                }
            }
            i++;
        }
        if (sb.length() > 0) {
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    @Override // X.AbstractC21440018vO, X.InterfaceC21443518vx
    public final void LIZJ(CharSequence charSequence) {
        if (this.LJI) {
            this.LJI = false;
        } else {
            this.LIZIZ.add(charSequence);
        }
        this.LJFF.append(charSequence);
        this.LJFF.append("\n");
    }

    @Override // X.AbstractC21440018vO, X.InterfaceC21443518vx
    public final void LIZLLL(InterfaceC21429918tl interfaceC21429918tl) {
        String str;
        int size = this.LIZLLL.size();
        this.LIZ.LIZIZ(this.LJ);
        C21428518tX c21428518tX = new C21428518tX();
        this.LIZ.LIZIZ(c21428518tX);
        C21428618tY c21428618tY = new C21428618tY();
        c21428518tX.LIZIZ(c21428618tY);
        for (int i = 0; i < size; i++) {
            c21428618tY.LIZIZ(LJIIIIZZ((String) ListProtector.get(this.LIZLLL, i), i, interfaceC21429918tl));
        }
        Iterator it2 = ((ArrayList) this.LIZIZ).iterator();
        AbstractC21430318tp abstractC21430318tp = null;
        while (it2.hasNext()) {
            List<String> listLJIIJ = LJIIJ((CharSequence) it2.next());
            C21428618tY c21428618tY2 = new C21428618tY();
            for (int i2 = 0; i2 < size; i2++) {
                if (i2 < ((ArrayList) listLJIIJ).size()) {
                    str = (String) ListProtector.get(listLJIIJ, i2);
                } else {
                    str = "";
                }
                c21428618tY2.LIZIZ(LJIIIIZZ(str, i2, interfaceC21429918tl));
            }
            if (abstractC21430318tp == null) {
                abstractC21430318tp = new AbstractC21430318tp() { // from class: X.18tW
                };
                this.LIZ.LIZIZ(abstractC21430318tp);
            }
            abstractC21430318tp.LIZIZ(c21428618tY2);
        }
    }

    @Override // X.InterfaceC21443518vx
    public final C21445418wG LJFF(InterfaceC21449618ww interfaceC21449618ww) {
        C21440618vU c21440618vU = (C21440618vU) interfaceC21449618ww;
        if (c21440618vU.LIZ.toString().contains("|")) {
            return C21445418wG.LIZ(c21440618vU.LIZIZ);
        }
        return null;
    }

    public C21429618ti(List<EnumC21429518th> list, List<String> list2) {
        this.LIZ = new C21428718tZ();
        this.LIZIZ = new ArrayList();
        this.LJ = new C21428118tT();
        this.LJFF = new StringBuilder();
        this.LJI = true;
        this.LIZJ = list;
        this.LIZLLL = list2;
    }

    public C21429618ti(List<EnumC21429518th> list, List<String> list2, String str) {
        this.LIZ = new C21428718tZ();
        this.LIZIZ = new ArrayList();
        this.LJ = new C21428118tT();
        StringBuilder sb = new StringBuilder();
        this.LJFF = sb;
        this.LJI = true;
        this.LIZJ = list;
        this.LIZLLL = list2;
        sb.append(str);
        sb.append("\n");
    }

    public final C21428218tU LJIIIIZZ(String str, int i, InterfaceC21429918tl interfaceC21429918tl) {
        C21428218tU c21428218tU = new C21428218tU();
        if (i < this.LIZJ.size()) {
            c21428218tU.LJFF = (EnumC21429518th) ListProtector.get(this.LIZJ, i);
        }
        interfaceC21429918tl.LIZ(str.trim(), c21428218tU);
        return c21428218tU;
    }
}
