package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import xlp.c;

/* JADX INFO: renamed from: X.0XLQ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XLQ {
    public static final char[] LJIIIZ = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final List<String> LJFF;
    public final List<String> LJI;
    public final String LJII;
    public final String LJIIIIZZ;

    public final String LJIJJ() {
        C0XLP c0xlpLJIIJJI = LJIIJJI("/...", false);
        c0xlpLJIIJJI.getClass();
        c0xlpLJIIJJI.LIZIZ = LIZJ("", false, false, false, " \"':;<=>@[]^`{}|/\\?#", true);
        c0xlpLJIIJJI.LIZJ = LIZJ("", false, false, false, " \"':;<=>@[]^`{}|/\\?#", true);
        return c0xlpLJIIJJI.LIZLLL().LJIIIIZZ;
    }

    public final String LJ() {
        if (this.LIZJ.isEmpty()) {
            return "";
        }
        return this.LJIIIIZZ.substring(this.LJIIIIZZ.indexOf(58, this.LIZ.length() + 3) + 1, this.LJIIIIZZ.indexOf(64));
    }

    public final String LJFF() {
        int iIndexOf = this.LJIIIIZZ.indexOf(47, this.LIZ.length() + 3);
        String str = this.LJIIIIZZ;
        return this.LJIIIIZZ.substring(iIndexOf, c.LJIIIIZZ(iIndexOf, str.length(), str, "?#"));
    }

    public final List<String> LJI() {
        int iIndexOf = this.LJIIIIZZ.indexOf(47, this.LIZ.length() + 3);
        String str = this.LJIIIIZZ;
        int iLJIIIIZZ = c.LJIIIIZZ(iIndexOf, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iLJIIIIZZ) {
            int i = iIndexOf + 1;
            iIndexOf = c.LJIIIZ(this.LJIIIIZZ, i, iLJIIIIZZ, '/');
            arrayList.add(this.LJIIIIZZ.substring(i, iIndexOf));
        }
        return arrayList;
    }

    public final String LJII() {
        if (this.LJI == null) {
            return null;
        }
        int iIndexOf = this.LJIIIIZZ.indexOf(63) + 1;
        String str = this.LJIIIIZZ;
        return this.LJIIIIZZ.substring(iIndexOf, c.LJIIIZ(str, iIndexOf, str.length(), '#'));
    }

    public final String LJIIIIZZ() {
        if (this.LIZIZ.isEmpty()) {
            return "";
        }
        int length = this.LIZ.length() + 3;
        String str = this.LJIIIIZZ;
        return this.LJIIIIZZ.substring(length, c.LJIIIIZZ(length, str.length(), str, ":@"));
    }

    public final C0XLP LJIIJ() {
        C0XLP c0xlp = new C0XLP();
        c0xlp.LIZ = this.LIZ;
        c0xlp.LIZIZ = LJIIIIZZ();
        c0xlp.LIZJ = LJ();
        c0xlp.LIZLLL = this.LIZLLL;
        c0xlp.LJ = this.LJ != LIZLLL(this.LIZ) ? this.LJ : -1;
        ((ArrayList) c0xlp.LJFF).clear();
        ((ArrayList) c0xlp.LJFF).addAll(LJI());
        String strLJII = LJII();
        c0xlp.LJI = strLJII != null ? LJIJI(LIZJ(strLJII, true, false, true, " \"'<>#", true)) : null;
        c0xlp.LJII = this.LJII != null ? this.LJIIIIZZ.substring(this.LJIIIIZZ.indexOf(35) + 1) : null;
        return c0xlp;
    }

    public final Set<String> LJIIZILJ() {
        if (this.LJI == null) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = this.LJI.size();
        for (int i = 0; i < size; i += 2) {
            linkedHashSet.add(ListProtector.get(this.LJI, i));
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public final URL LJJ() {
        try {
            return new URL(this.LJIIIIZZ);
        } catch (MalformedURLException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }

    public final int hashCode() {
        return this.LJIIIIZZ.hashCode();
    }

    public final URI LJIL() {
        C0XLP c0xlpLJIIJ = LJIIJ();
        int size = ((ArrayList) c0xlpLJIIJ.LJFF).size();
        for (int i = 0; i < size; i++) {
            ListProtector.set(c0xlpLJIIJ.LJFF, i, LIZJ((String) ListProtector.get(c0xlpLJIIJ.LJFF, i), true, true, false, "[]", true));
        }
        List<String> list = c0xlpLJIIJ.LJI;
        if (list != null) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str = (String) ListProtector.get(c0xlpLJIIJ.LJI, i2);
                if (str != null) {
                    ListProtector.set(c0xlpLJIIJ.LJI, i2, LIZJ(str, true, true, true, "\\^`{|}", true));
                }
            }
        }
        String str2 = c0xlpLJIIJ.LJII;
        if (str2 != null) {
            c0xlpLJIIJ.LJII = LIZJ(str2, true, true, false, " \"#<>\\^`{|}", false);
        }
        String string = c0xlpLJIIJ.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            TryCatchGuardChecker.doCheck(e);
            try {
                return URI.create(string.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw new RuntimeException(e);
            }
        }
    }

    public final String toString() {
        return this.LJIIIIZZ;
    }

    public C0XLQ(C0XLP c0xlp) {
        List<String> listLJIILJJIL;
        this.LIZ = c0xlp.LIZ;
        String str = c0xlp.LIZIZ;
        this.LIZIZ = LJIILIIL(0, str.length(), str, false);
        String str2 = c0xlp.LIZJ;
        this.LIZJ = LJIILIIL(0, str2.length(), str2, false);
        this.LIZLLL = c0xlp.LIZLLL;
        int i = c0xlp.LJ;
        this.LJ = i == -1 ? LIZLLL(c0xlp.LIZ) : i;
        this.LJFF = LJIILJJIL(c0xlp.LJFF, false);
        List<String> list = c0xlp.LJI;
        if (list != null) {
            listLJIILJJIL = LJIILJJIL(list, true);
        } else {
            listLJIILJJIL = null;
        }
        this.LJI = listLJIILJJIL;
        String str3 = c0xlp.LJII;
        this.LJII = str3 != null ? LJIILIIL(0, str3.length(), str3, false) : null;
        this.LJIIIIZZ = c0xlp.toString();
    }

    public static int LIZLLL(String str) {
        if (str.equals("http")) {
            return 80;
        }
        if (str.equals("https")) {
            return 443;
        }
        return -1;
    }

    public static C0XLQ LJIIIZ(String str) {
        C0XLP c0xlp = new C0XLP();
        c0xlp.LJI(null, str, false);
        return c0xlp.LIZLLL();
    }

    public static C0XLQ LJIIL(String str) {
        try {
            return LJIIIZ(str);
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static List<String> LJIJI(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iIndexOf = str.indexOf(38, i);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            int iIndexOf2 = str.indexOf(61, i);
            if (iIndexOf2 != -1 && iIndexOf2 <= iIndexOf) {
                arrayList.add(str.substring(i, iIndexOf2));
                arrayList.add(str.substring(iIndexOf2 + 1, iIndexOf));
            } else {
                arrayList.add(str.substring(i, iIndexOf));
                arrayList.add(null);
            }
            i = iIndexOf + 1;
        }
        return arrayList;
    }

    public final String LJIILLIIL(String str) {
        List<String> list = this.LJI;
        if (list == null) {
            return null;
        }
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            if (str.equals(ListProtector.get(this.LJI, i))) {
                return (String) ListProtector.get(this.LJI, i + 1);
            }
        }
        return null;
    }

    public final List<String> LJIJ(String str) {
        if (this.LJI == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = this.LJI.size();
        for (int i = 0; i < size; i += 2) {
            if (str.equals(ListProtector.get(this.LJI, i))) {
                arrayList.add(ListProtector.get(this.LJI, i + 1));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C0XLQ) && ((C0XLQ) obj).LJIIIIZZ.equals(this.LJIIIIZZ)) {
            return true;
        }
        return false;
    }

    public static List LJIILJJIL(List list, boolean z) {
        String strLJIILIIL;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = (String) ListProtector.get(list, i);
            if (str != null) {
                strLJIILIIL = LJIILIIL(0, str.length(), str, z);
            } else {
                strLJIILIIL = null;
            }
            arrayList.add(strLJIILIIL);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final C0XLP LJIIJJI(String str, boolean z) {
        try {
            C0XLP c0xlp = new C0XLP();
            c0xlp.LJI(this, str, z);
            return c0xlp;
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final C0XLQ LJIJJLI(String str, boolean z) {
        C0XLP c0xlpLJIIJJI = LJIIJJI(str, z);
        if (c0xlpLJIIJJI != null) {
            return c0xlpLJIIJJI.LIZLLL();
        }
        return null;
    }

    public static String LIZIZ(String str, boolean z, Charset charset) {
        return LIZ(str, 0, str.length(), " \"':;<=>@[]^`{}|/\\?#&!$(),~", z, false, true, true, charset);
    }

    public static boolean LJIILL(int i, int i2, String str) {
        int i3 = i + 2;
        if (i3 < i2 && str.charAt(i) == '%' && c.LJI(str.charAt(i + 1)) != -1 && c.LJI(str.charAt(i3)) != -1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJIILIIL(int r8, int r9, java.lang.String r10, boolean r11) {
        /*
            r6 = r8
        L1:
            if (r6 >= r9) goto L5f
            char r0 = r10.charAt(r6)
            r5 = 43
            r4 = 37
            if (r0 == r4) goto L11
            if (r0 != r5) goto L57
            if (r11 == 0) goto L57
        L11:
            X.0p3D r3 = new X.0p3D
            r3.<init>()
            r3.LJLJI(r8, r6, r10)
        L19:
            if (r6 >= r9) goto L5a
            int r7 = r10.codePointAt(r6)
            if (r7 != r4) goto L49
            int r8 = r6 + 2
            if (r8 >= r9) goto L53
            int r0 = r6 + 1
            char r0 = r10.charAt(r0)
            int r2 = xlp.c.LJI(r0)
            char r0 = r10.charAt(r8)
            int r1 = xlp.c.LJI(r0)
            r0 = -1
            if (r2 == r0) goto L53
            if (r1 == r0) goto L53
            int r0 = r2 << 4
            int r0 = r0 + r1
            r3.LJJJZ(r0)
            r6 = r8
        L43:
            int r0 = java.lang.Character.charCount(r7)
            int r6 = r6 + r0
            goto L19
        L49:
            if (r7 != r5) goto L53
            if (r11 == 0) goto L53
            r0 = 32
            r3.LJJJZ(r0)
            goto L43
        L53:
            r3.LJLJL(r7)
            goto L43
        L57:
            int r6 = r6 + 1
            goto L1
        L5a:
            java.lang.String r0 = r3.LJJIZ()
            return r0
        L5f:
            java.lang.String r0 = r10.substring(r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0XLQ.LJIILIIL(int, int, java.lang.String, boolean):java.lang.String");
    }

    public static String LIZJ(String str, boolean z, boolean z2, boolean z3, String str2, boolean z4) {
        return LIZ(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(java.lang.String r12, int r13, int r14, java.lang.String r15, boolean r16, boolean r17, boolean r18, boolean r19, java.nio.charset.Charset r20) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0XLQ.LIZ(java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):java.lang.String");
    }
}
