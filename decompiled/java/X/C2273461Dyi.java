package X;

import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: X.1Dyi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2273461Dyi {
    public static final SparseArray<Matcher> LIZJ;
    public final InterfaceC2273521Dyo LIZ;
    public InterfaceC2273561Dys LIZIZ;

    static {
        Matcher matcher = PatternProtector.compile("^\\s*[*+-]\\s+(.*)").matcher("");
        Matcher matcher2 = PatternProtector.compile("^\\s*\\d+\\.\\s+(.*)").matcher("");
        Matcher matcher3 = PatternProtector.compile("(<sup>)([\\d,]+)(</sup>)").matcher("");
        Matcher matcher4 = PatternProtector.compile("(<u><b>)([\\s\\S]+?)(</b></u>)").matcher("");
        Matcher matcher5 = PatternProtector.compile("(<mark><b>)([\\s\\S]+?)(</b></mark>)").matcher("");
        Matcher matcher6 = PatternProtector.compile("\\*\\*([^*]+)\\*\\*").matcher("");
        Matcher matcher7 = PatternProtector.compile("\\[((?:[^\\[\\]]|\\[[^\\[\\]]*\\])*)\\]\\(((?:[^\\(\\)]|\\([^\\(\\)]*\\))*)\\)").matcher("");
        Matcher matcher8 = PatternProtector.compile("(.*?) {2} *$").matcher("");
        Matcher matcher9 = PatternProtector.compile("^\\s*$").matcher("");
        Matcher matcher10 = PatternProtector.compile("(#+)(.*)").matcher("");
        SparseArray<Matcher> sparseArray = new SparseArray<>();
        LIZJ = sparseArray;
        sparseArray.put(9, matcher);
        sparseArray.put(10, matcher2);
        sparseArray.put(14, matcher3);
        sparseArray.put(15, matcher4);
        sparseArray.put(18, matcher5);
        sparseArray.put(16, matcher6);
        sparseArray.put(17, matcher7);
        sparseArray.put(25, matcher9);
        sparseArray.put(26, matcher8);
        sparseArray.put(27, matcher10);
    }

    public C2273461Dyi(InterfaceC2273521Dyo interfaceC2273521Dyo) {
        this.LIZ = interfaceC2273521Dyo;
    }

    public final boolean LIZ(C2273501Dym c2273501Dym) {
        c2273501Dym.getClass();
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c2273501Dym.LJFF;
        Matcher matcherLJI = LJI(16, spannableStringBuilder);
        if (matcherLJI == null || !matcherLJI.find() || matcherLJI.group(1) == null) {
            return false;
        }
        String strGroup = matcherLJI.group(1);
        spannableStringBuilder.delete(matcherLJI.start(0), matcherLJI.end(0));
        spannableStringBuilder.insert(matcherLJI.start(0), (CharSequence) this.LIZ.LJIIIIZZ(strGroup));
        LIZ(c2273501Dym);
        return true;
    }

    public final boolean LIZJ(C2273501Dym c2273501Dym) {
        c2273501Dym.getClass();
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c2273501Dym.LJFF;
        Matcher matcherLJI = LJI(15, spannableStringBuilder);
        if (matcherLJI == null || !matcherLJI.find()) {
            return false;
        }
        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(matcherLJI.start(2), matcherLJI.end(2));
        spannableStringBuilder.delete(matcherLJI.start(0), matcherLJI.end(0));
        spannableStringBuilder.insert(matcherLJI.start(0), (CharSequence) this.LIZ.LIZLLL(charSequenceSubSequence));
        LIZJ(c2273501Dym);
        return true;
    }

    public final boolean LIZLLL(C2273501Dym c2273501Dym) {
        c2273501Dym.getClass();
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c2273501Dym.LJFF;
        Matcher matcherLJI = LJI(18, spannableStringBuilder);
        if (matcherLJI == null || !matcherLJI.find()) {
            return false;
        }
        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(matcherLJI.start(2), matcherLJI.end(2));
        spannableStringBuilder.delete(matcherLJI.start(0), matcherLJI.end(0));
        spannableStringBuilder.insert(matcherLJI.start(0), (CharSequence) this.LIZ.LIZ(charSequenceSubSequence));
        LIZLLL(c2273501Dym);
        return true;
    }

    public final boolean LJ(C2273501Dym c2273501Dym) {
        boolean z;
        String strGroup;
        boolean zLIZJ = LIZJ(c2273501Dym);
        boolean zLIZLLL = LIZLLL(c2273501Dym);
        boolean zLIZ = LIZ(c2273501Dym);
        boolean zLJIIIIZZ = LJIIIIZZ(c2273501Dym);
        boolean zLJFF = LJFF(c2273501Dym);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c2273501Dym.LJFF;
        Matcher matcherLJI = LJI(27, spannableStringBuilder);
        if (matcherLJI != null && matcherLJI.find() && (strGroup = matcherLJI.group(2)) != null) {
            String strTrim = strGroup.trim();
            spannableStringBuilder.delete(matcherLJI.start(0), matcherLJI.end(0));
            spannableStringBuilder.insert(matcherLJI.start(0), (CharSequence) this.LIZ.LIZJ(strTrim));
            z = true;
        } else {
            z = false;
        }
        if (zLIZJ || zLIZLLL || zLJIIIIZZ || zLIZ || zLJFF || z) {
            return true;
        }
        return false;
    }

    public final boolean LJFF(C2273501Dym c2273501Dym) {
        c2273501Dym.getClass();
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c2273501Dym.LJFF;
        Matcher matcherLJI = LJI(17, spannableStringBuilder);
        if (matcherLJI == null || !matcherLJI.find() || matcherLJI.group(1) == null) {
            return false;
        }
        String strGroup = matcherLJI.group(1);
        String strGroup2 = matcherLJI.group(2);
        if (strGroup != null && strGroup2 != null) {
            spannableStringBuilder.delete(matcherLJI.start(0), matcherLJI.end(0));
            spannableStringBuilder.insert(matcherLJI.start(0), (CharSequence) this.LIZ.LJFF(strGroup, strGroup2));
        }
        LJFF(c2273501Dym);
        return true;
    }

    public final boolean LJII(C2273501Dym c2273501Dym) {
        int i;
        int i2;
        int i3;
        Matcher matcherLJI = LJI(10, c2273501Dym.LJ);
        if (matcherLJI == null || !matcherLJI.find()) {
            return false;
        }
        int i4 = 3;
        c2273501Dym.LJI = 3;
        String strGroup = matcherLJI.group(1);
        C2273501Dym c2273501Dym2 = new C2273501Dym(strGroup);
        String strReplace = c2273501Dym.LJ.replace(strGroup, "");
        c2273501Dym.LJIIIIZZ = 0;
        C2273501Dym c2273501Dym3 = c2273501Dym.LIZJ;
        C2260261DdQ c2260261DdQLJII = this.LIZIZ.LJII();
        C2273501Dym c2273501Dym4 = c2273501Dym.LIZ;
        int i5 = 2;
        if (c2273501Dym4 != null && ((i3 = c2273501Dym4.LJI) == 3 || i3 == 2)) {
            char[] charArray = c2273501Dym.LJ.substring(matcherLJI.start(), matcherLJI.start(1) - 2).replaceAll("\\t", "    ").toCharArray();
            int length = charArray.length;
            int i6 = 0;
            for (int i7 = 0; i7 < length && Character.isWhitespace(charArray[i7]); i7++) {
                i6++;
            }
            if (i6 > 1) {
                c2273501Dym.LJIIIIZZ = 1;
            } else {
                c2273501Dym.LJIIIIZZ = 0;
            }
        }
        C2273501Dym c2273501Dym5 = c2273501Dym.LIZ;
        while (c2273501Dym5 != null) {
            int i8 = c2273501Dym5.LJI;
            if ((i8 != 3 && i8 != 2) || (i = c2273501Dym5.LJIIIIZZ) < (i2 = c2273501Dym.LJIIIIZZ)) {
                c2273501Dym5 = null;
                break;
            }
            if (i8 == 3 && i == i2) {
                c2273501Dym.LJII = c2273501Dym5.LJII + 1;
                break;
            }
            c2273501Dym5 = c2273501Dym5.LIZ;
        }
        c2273501Dym.LJII = 1;
        if (c2273501Dym.LJII == 10) {
            C2273501Dym c2273501Dym6 = c2273501Dym.LIZ;
            while (c2273501Dym6 != null) {
                int i9 = c2273501Dym5.LJI;
                if ((i9 == i4 || i9 == i5) && c2273501Dym6.LJIIIIZZ < c2273501Dym.LJIIIIZZ) {
                    break;
                }
                String strReplace2 = c2273501Dym6.LJ.replace(c2273501Dym2.LJ, "");
                if (c2273501Dym6.LJI == i4 && c2273501Dym6.LJIIIIZZ == c2273501Dym.LJIIIIZZ) {
                    int i10 = c2273501Dym.LJII;
                    Matcher matcherLJI2 = LJI(10, c2273501Dym6.LJ);
                    if (LIZIZ(10, c2273501Dym6)) {
                        CharSequence charSequenceGroup = matcherLJI2.group(1);
                        if (!(charSequenceGroup instanceof SpannableStringBuilder)) {
                            charSequenceGroup = new SpannableStringBuilder(charSequenceGroup);
                        }
                        c2273501Dym6.LJFF = charSequenceGroup;
                        LJ(c2273501Dym6);
                        c2273501Dym6.LJFF = this.LIZ.LIZIZ(c2273501Dym6.LJIIIIZZ, c2273501Dym6.LJII, i10, c2273501Dym6.LJFF, strReplace2);
                    }
                }
                c2273501Dym6 = c2273501Dym6.LIZ;
                i4 = 3;
                i5 = 2;
            }
        }
        InterfaceC2273521Dyo interfaceC2273521Dyo = this.LIZ;
        int i11 = c2273501Dym.LJIIIIZZ;
        int i12 = c2273501Dym.LJII;
        c2273501Dym.LJFF = interfaceC2273521Dyo.LIZIZ(i11, i12, i12, " ", strReplace);
        if (LIZIZ(9, c2273501Dym2)) {
            c2273501Dym2.LJII();
            if (c2273501Dym3 != null) {
                c2273501Dym3.LJ().LIZ(c2273501Dym2);
                c2260261DdQLJII.LIZ();
                LJIIIZ(c2273501Dym2);
                return true;
            }
            c2273501Dym.LIZIZ(c2273501Dym2);
            c2260261DdQLJII.LIZ();
            LJIIIZ(c2260261DdQLJII.LIZIZ);
            return true;
        }
        if (LIZIZ(10, c2273501Dym2)) {
            c2273501Dym2.LJII();
            if (c2273501Dym3 != null) {
                c2273501Dym3.LJ().LIZ(c2273501Dym2);
                c2260261DdQLJII.LIZ();
                LJII(c2273501Dym2);
                return true;
            }
            c2273501Dym.LIZIZ(c2273501Dym2);
            c2260261DdQLJII.LIZ();
            LJII(c2260261DdQLJII.LIZIZ);
            return true;
        }
        CharSequence spannableStringBuilder = c2273501Dym2.LJ;
        if (!(spannableStringBuilder instanceof SpannableStringBuilder)) {
            spannableStringBuilder = new SpannableStringBuilder(spannableStringBuilder);
        }
        c2273501Dym.LJFF = spannableStringBuilder;
        LJ(c2273501Dym);
        InterfaceC2273521Dyo interfaceC2273521Dyo2 = this.LIZ;
        CharSequence charSequence = c2273501Dym.LJFF;
        int i13 = c2273501Dym.LJIIIIZZ;
        int i14 = c2273501Dym.LJII;
        c2273501Dym.LJFF = interfaceC2273521Dyo2.LIZIZ(i13, i14, i14, charSequence, strReplace);
        return true;
    }

    public final boolean LJIIIIZZ(C2273501Dym c2273501Dym) {
        c2273501Dym.getClass();
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c2273501Dym.LJFF;
        Matcher matcherLJI = LJI(14, spannableStringBuilder);
        if (matcherLJI == null || !matcherLJI.find()) {
            return false;
        }
        for (int i = 0; i <= matcherLJI.groupCount(); i++) {
            matcherLJI.start(i);
            matcherLJI.end(i);
        }
        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(matcherLJI.start(2), matcherLJI.end(2));
        spannableStringBuilder.delete(matcherLJI.start(0), matcherLJI.end(0));
        spannableStringBuilder.insert(matcherLJI.start(0), (CharSequence) this.LIZ.LJII(charSequenceSubSequence));
        LJIIIIZZ(c2273501Dym);
        return true;
    }

    public final boolean LJIIIZ(C2273501Dym c2273501Dym) {
        int i;
        Matcher matcherLJI = LJI(9, c2273501Dym.LJ);
        if (matcherLJI == null || !matcherLJI.find()) {
            return false;
        }
        c2273501Dym.LJI = 2;
        String strGroup = matcherLJI.group(1);
        C2273501Dym c2273501Dym2 = new C2273501Dym(strGroup);
        c2273501Dym.LIZ(c2273501Dym2);
        c2273501Dym.LJIIIIZZ = 0;
        C2273501Dym c2273501Dym3 = c2273501Dym.LIZJ;
        C2260261DdQ c2260261DdQLJII = this.LIZIZ.LJII();
        C2273501Dym c2273501Dym4 = c2273501Dym.LIZ;
        if (c2273501Dym4 != null && ((i = c2273501Dym4.LJI) == 3 || i == 2)) {
            char[] charArray = c2273501Dym.LJ.substring(matcherLJI.start(), matcherLJI.start(1) - 2).replaceAll("\\t", "    ").toCharArray();
            int length = charArray.length;
            int i2 = 0;
            for (int i3 = 0; i3 < length && Character.isWhitespace(charArray[i3]); i3++) {
                i2++;
            }
            if (i2 > 1) {
                c2273501Dym.LJIIIIZZ = 1;
            } else {
                c2273501Dym.LJIIIIZZ = 0;
            }
        }
        c2273501Dym.LJFF = this.LIZ.LJI(c2273501Dym.LJIIIIZZ, " ");
        if (LIZIZ(9, c2273501Dym2)) {
            c2273501Dym2.LJII();
            if (c2273501Dym3 != null) {
                c2273501Dym3.LJ().LIZ(c2273501Dym2);
                c2260261DdQLJII.LIZ();
                LJIIIZ(c2273501Dym2);
                return true;
            }
            c2273501Dym.LIZIZ(c2273501Dym2);
            c2260261DdQLJII.LIZ();
            LJIIIZ(c2260261DdQLJII.LIZIZ);
            return true;
        }
        if (LIZIZ(10, c2273501Dym2)) {
            c2273501Dym2.LJII();
            if (c2273501Dym3 != null) {
                c2273501Dym3.LJ().LIZ(c2273501Dym2);
                c2260261DdQLJII.LIZ();
                LJII(c2273501Dym2);
                return true;
            }
            c2273501Dym.LIZIZ(c2273501Dym2);
            c2260261DdQLJII.LIZ();
            LJII(c2260261DdQLJII.LIZIZ);
            return true;
        }
        boolean z = strGroup instanceof SpannableStringBuilder;
        CharSequence spannableStringBuilder = strGroup;
        if (!z) {
            spannableStringBuilder = new SpannableStringBuilder(strGroup);
        }
        c2273501Dym.LJFF = spannableStringBuilder;
        LJ(c2273501Dym);
        c2273501Dym.LJFF = this.LIZ.LJI(c2273501Dym.LJIIIIZZ, c2273501Dym.LJFF);
        return true;
    }

    public static final boolean LIZIZ(int i, C2273501Dym c2273501Dym) {
        String str;
        Matcher matcherLJI;
        if (c2273501Dym == null || (str = c2273501Dym.LJ) == null || (matcherLJI = LJI(i, str)) == null || !matcherLJI.find()) {
            return false;
        }
        return true;
    }

    public static Matcher LJI(int i, CharSequence charSequence) {
        Matcher matcher = LIZJ.get(i, null);
        if (matcher != null) {
            matcher.reset(charSequence);
        }
        return matcher;
    }
}
