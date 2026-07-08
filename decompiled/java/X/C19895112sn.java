package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.12sn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19895112sn {
    public static final AbstractC19895412sq LIZLLL = AbstractC19895412sq.LIZ(".。．｡");
    public static final C19896312sz LJ = new C19896312sz(new C19896612t2(new C19895712st('.')), false, C19896112sx.LLILLJJLI, Integer.MAX_VALUE);
    public static final C823890WTr LJFF = new C823890WTr(String.valueOf('.'));
    public static final AbstractC19895412sq LJI;
    public static final C19895912sv LJII;
    public static final AbstractC19895412sq LJIIIIZZ;
    public final String LIZ;
    public final AbstractC19875512pd<String> LIZIZ;
    public final int LIZJ;

    /* JADX WARN: Type inference failed for: r4v1, types: [X.12sq, X.12sv] */
    static {
        final AbstractC19895412sq abstractC19895412sqLIZ = AbstractC19895412sq.LIZ("-_");
        LJI = abstractC19895412sqLIZ;
        final char c = '0';
        final char c2 = '9';
        final ?? r4 = new AbstractC19896212sy(c, c2) { // from class: X.12sv
            public final char LL;
            public final char LLILLJJLI;

            public final String toString() {
                String strLJIIIIZZ = AbstractC19895412sq.LJIIIIZZ(this.LL);
                String strLJIIIIZZ2 = AbstractC19895412sq.LJIIIIZZ(this.LLILLJJLI);
                StringBuilder sb = new StringBuilder(String.valueOf(strLJIIIIZZ).length() + 27 + String.valueOf(strLJIIIIZZ2).length());
                sb.append("CharMatcher.inRange('");
                sb.append(strLJIIIIZZ);
                sb.append("', '");
                sb.append(strLJIIIIZZ2);
                sb.append("')");
                return sb.toString();
            }

            @Override // X.AbstractC19895412sq
            public final boolean LIZLLL(char c3) {
                if (this.LL <= c3 && c3 <= this.LLILLJJLI) {
                    return true;
                }
                return false;
            }

            {
                boolean z;
                if (c2 >= c) {
                    z = true;
                } else {
                    z = false;
                }
                C19864312np.LJ(z);
                this.LL = c;
                this.LLILLJJLI = c2;
            }
        };
        LJII = r4;
        final char c3 = 'a';
        final char c4 = 'z';
        final AbstractC19896212sy abstractC19896212sy = new AbstractC19896212sy(c3, c4) { // from class: X.12sv
            public final char LL;
            public final char LLILLJJLI;

            public final String toString() {
                String strLJIIIIZZ = AbstractC19895412sq.LJIIIIZZ(this.LL);
                String strLJIIIIZZ2 = AbstractC19895412sq.LJIIIIZZ(this.LLILLJJLI);
                StringBuilder sb = new StringBuilder(String.valueOf(strLJIIIIZZ).length() + 27 + String.valueOf(strLJIIIIZZ2).length());
                sb.append("CharMatcher.inRange('");
                sb.append(strLJIIIIZZ);
                sb.append("', '");
                sb.append(strLJIIIIZZ2);
                sb.append("')");
                return sb.toString();
            }

            @Override // X.AbstractC19895412sq
            public final boolean LIZLLL(char c32) {
                if (this.LL <= c32 && c32 <= this.LLILLJJLI) {
                    return true;
                }
                return false;
            }

            {
                boolean z;
                if (c4 >= c3) {
                    z = true;
                } else {
                    z = false;
                }
                C19864312np.LJ(z);
                this.LL = c3;
                this.LLILLJJLI = c4;
            }
        };
        final char c5 = 'A';
        final char c6 = 'Z';
        final AbstractC19896212sy abstractC19896212sy2 = new AbstractC19896212sy(c5, c6) { // from class: X.12sv
            public final char LL;
            public final char LLILLJJLI;

            public final String toString() {
                String strLJIIIIZZ = AbstractC19895412sq.LJIIIIZZ(this.LL);
                String strLJIIIIZZ2 = AbstractC19895412sq.LJIIIIZZ(this.LLILLJJLI);
                StringBuilder sb = new StringBuilder(String.valueOf(strLJIIIIZZ).length() + 27 + String.valueOf(strLJIIIIZZ2).length());
                sb.append("CharMatcher.inRange('");
                sb.append(strLJIIIIZZ);
                sb.append("', '");
                sb.append(strLJIIIIZZ2);
                sb.append("')");
                return sb.toString();
            }

            @Override // X.AbstractC19895412sq
            public final boolean LIZLLL(char c32) {
                if (this.LL <= c32 && c32 <= this.LLILLJJLI) {
                    return true;
                }
                return false;
            }

            {
                boolean z;
                if (c6 >= c5) {
                    z = true;
                } else {
                    z = false;
                }
                C19864312np.LJ(z);
                this.LL = c5;
                this.LLILLJJLI = c6;
            }
        };
        final AbstractC19895412sq abstractC19895412sq = new AbstractC19895412sq(abstractC19896212sy, abstractC19896212sy2) { // from class: X.12ss
            public final AbstractC19895412sq LL;
            public final AbstractC19895412sq LLILLJJLI;

            public final String toString() {
                String strValueOf = String.valueOf(this.LL);
                String strValueOf2 = String.valueOf(this.LLILLJJLI);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 18 + strValueOf2.length());
                sb.append("CharMatcher.or(");
                sb.append(strValueOf);
                sb.append(", ");
                sb.append(strValueOf2);
                sb.append(")");
                return sb.toString();
            }

            @Override // X.AbstractC19895412sq
            public final boolean LIZLLL(char c7) {
                if (!this.LL.LIZLLL(c7) && !this.LLILLJJLI.LIZLLL(c7)) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC1394580mOW
            public final boolean apply(Character ch) {
                return LIZLLL(ch.charValue());
            }

            {
                abstractC19896212sy.getClass();
                this.LL = abstractC19896212sy;
                abstractC19896212sy2.getClass();
                this.LLILLJJLI = abstractC19896212sy2;
            }
        };
        final AbstractC19895412sq abstractC19895412sq2 = new AbstractC19895412sq(r4, abstractC19895412sq) { // from class: X.12ss
            public final AbstractC19895412sq LL;
            public final AbstractC19895412sq LLILLJJLI;

            public final String toString() {
                String strValueOf = String.valueOf(this.LL);
                String strValueOf2 = String.valueOf(this.LLILLJJLI);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 18 + strValueOf2.length());
                sb.append("CharMatcher.or(");
                sb.append(strValueOf);
                sb.append(", ");
                sb.append(strValueOf2);
                sb.append(")");
                return sb.toString();
            }

            @Override // X.AbstractC19895412sq
            public final boolean LIZLLL(char c7) {
                if (!this.LL.LIZLLL(c7) && !this.LLILLJJLI.LIZLLL(c7)) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC1394580mOW
            public final boolean apply(Character ch) {
                return LIZLLL(ch.charValue());
            }

            {
                r4.getClass();
                this.LL = r4;
                abstractC19895412sq.getClass();
                this.LLILLJJLI = abstractC19895412sq;
            }
        };
        LJIIIIZZ = new AbstractC19895412sq(abstractC19895412sq2, abstractC19895412sqLIZ) { // from class: X.12ss
            public final AbstractC19895412sq LL;
            public final AbstractC19895412sq LLILLJJLI;

            public final String toString() {
                String strValueOf = String.valueOf(this.LL);
                String strValueOf2 = String.valueOf(this.LLILLJJLI);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 18 + strValueOf2.length());
                sb.append("CharMatcher.or(");
                sb.append(strValueOf);
                sb.append(", ");
                sb.append(strValueOf2);
                sb.append(")");
                return sb.toString();
            }

            @Override // X.AbstractC19895412sq
            public final boolean LIZLLL(char c7) {
                if (!this.LL.LIZLLL(c7) && !this.LLILLJJLI.LIZLLL(c7)) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC1394580mOW
            public final boolean apply(Character ch) {
                return LIZLLL(ch.charValue());
            }

            {
                abstractC19895412sq2.getClass();
                this.LL = abstractC19895412sq2;
                abstractC19895412sqLIZ.getClass();
                this.LLILLJJLI = abstractC19895412sqLIZ;
            }
        };
    }

    public final C19895112sn LIZIZ() {
        int i = this.LIZJ;
        if (i == -1) {
            return null;
        }
        C823890WTr c823890WTr = LJFF;
        AbstractC19875512pd<String> abstractC19875512pd = this.LIZIZ;
        String strLIZIZ = c823890WTr.LIZIZ(abstractC19875512pd.subList(i, abstractC19875512pd.size()));
        strLIZIZ.getClass();
        return new C19895112sn(strLIZIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        return this.LIZ;
    }

    public C19895112sn(String str) {
        boolean z;
        boolean z2;
        final String strLIZ = C19376010rG.LIZ(LIZLLL.LJII(str));
        boolean z3 = false;
        strLIZ = strLIZ.endsWith(e3.d) ? strLIZ.substring(0, strLIZ.length() - 1) : strLIZ;
        if (strLIZ.length() <= 253) {
            z = true;
        } else {
            z = false;
        }
        C19864312np.LIZJ(strLIZ, "Domain name too long: '%s':", z);
        this.LIZ = strLIZ;
        final C19896312sz c19896312sz = LJ;
        c19896312sz.getClass();
        AbstractC19875512pd<String> abstractC19875512pdCopyOf = AbstractC19875512pd.copyOf(new Iterable<String>() { // from class: X.12so
            @Override // java.lang.Iterable
            public final Iterator<String> iterator() {
                C19896312sz c19896312sz2 = c19896312sz;
                CharSequence charSequence = strLIZ;
                C19896612t2 c19896612t2 = (C19896612t2) c19896312sz2.LIZJ;
                c19896612t2.getClass();
                return new C19896412t0(c19896612t2, c19896312sz2, charSequence);
            }

            public final String toString() {
                C823890WTr c823890WTr = new C823890WTr(", ");
                StringBuilder sb = new StringBuilder();
                sb.append('[');
                c823890WTr.LIZ(sb, iterator());
                sb.append(']');
                return sb.toString();
            }
        });
        this.LIZIZ = abstractC19875512pdCopyOf;
        if (abstractC19875512pdCopyOf.size() <= 127) {
            z2 = true;
        } else {
            z2 = false;
        }
        C19864312np.LIZJ(strLIZ, "Domain has too many parts: '%s'", z2);
        int size = abstractC19875512pdCopyOf.size() - 1;
        if (LIZJ((String) ListProtector.get(abstractC19875512pdCopyOf, size), true)) {
            int i = 0;
            while (true) {
                if (i < size) {
                    if (!LIZJ((String) ListProtector.get(abstractC19875512pdCopyOf, i), false)) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    z3 = true;
                    break;
                }
            }
        }
        C19864312np.LIZJ(strLIZ, "Not a valid domain name: '%s'", z3);
        this.LIZJ = LIZ(AbstractC19852312lt.absent());
        LIZ(AbstractC19852312lt.of(EnumC19894912sl.REGISTRY));
    }

    public final int LIZ(AbstractC19852312lt<EnumC19894912sl> abstractC19852312lt) {
        boolean zIsPresent;
        boolean zIsPresent2;
        int size = this.LIZIZ.size();
        for (int i = 0; i < size; i++) {
            String strLIZIZ = LJFF.LIZIZ(this.LIZIZ.subList(i, size));
            AbstractC19852312lt abstractC19852312ltFromNullable = AbstractC19852312lt.fromNullable(C19895012sm.LIZ.get(strLIZIZ));
            if (abstractC19852312lt.isPresent()) {
                zIsPresent = abstractC19852312lt.equals(abstractC19852312ltFromNullable);
            } else {
                zIsPresent = abstractC19852312ltFromNullable.isPresent();
            }
            if (zIsPresent) {
                return i;
            }
            if (C19895012sm.LIZJ.containsKey(strLIZIZ)) {
                return i + 1;
            }
            C19896312sz c19896312sz = LJ;
            c19896312sz.getClass();
            InterfaceC19896912t5 interfaceC19896912t5 = c19896312sz.LIZJ;
            C19896312sz c19896312sz2 = new C19896312sz(interfaceC19896912t5, c19896312sz.LIZIZ, c19896312sz.LIZ, 2);
            strLIZIZ.getClass();
            C19896612t2 c19896612t2 = (C19896612t2) interfaceC19896912t5;
            c19896612t2.getClass();
            C19896412t0 c19896412t0 = new C19896412t0(c19896612t2, c19896312sz2, strLIZIZ);
            ArrayList arrayList = new ArrayList();
            while (c19896412t0.hasNext()) {
                arrayList.add(c19896412t0.next());
            }
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            if (listUnmodifiableList.size() == 2) {
                AbstractC19852312lt abstractC19852312ltFromNullable2 = AbstractC19852312lt.fromNullable(C19895012sm.LIZIZ.get(ListProtector.get(listUnmodifiableList, 1)));
                if (abstractC19852312lt.isPresent()) {
                    zIsPresent2 = abstractC19852312lt.equals(abstractC19852312ltFromNullable2);
                } else {
                    zIsPresent2 = abstractC19852312ltFromNullable2.isPresent();
                }
                if (zIsPresent2) {
                    return i;
                }
            }
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C19895112sn) {
            return this.LIZ.equals(((C19895112sn) obj).LIZ);
        }
        return false;
    }

    public static boolean LIZJ(String str, boolean z) {
        if (str.length() >= 1 && str.length() <= 63) {
            final C19896512t1 c19896512t1 = new AbstractC19896712t3() { // from class: X.12t1
                @Override // X.AbstractC19895412sq
                public final boolean LIZLLL(char c) {
                    return c <= 127;
                }
            };
            c19896512t1.getClass();
            if (!LJIIIIZZ.LJ(new C19895512sr(c19896512t1) { // from class: X.12t4
            }.LJI(str))) {
                return false;
            }
            AbstractC19895412sq abstractC19895412sq = LJI;
            if (!abstractC19895412sq.LIZLLL(str.charAt(0)) && !abstractC19895412sq.LIZLLL(str.charAt(str.length() - 1))) {
                if (z && LJII.LIZLLL(str.charAt(0))) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
