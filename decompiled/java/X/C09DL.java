package X;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.09DL, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public class C09DL implements Closeable, Flushable {
    public static final String[] LLJI = new String[128];
    public static final String[] LLJIJIL;
    public final Writer LL;
    public int[] LLILLJJLI;
    public int LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public String LLIZLLLIL;
    public boolean LLJ;

    static {
        int i = 0;
        do {
            LLJI[i] = C786410Ut5.j4("\\u%04x", new Object[]{Integer.valueOf(i)});
            i++;
        } while (i <= 31);
        String[] strArr = LLJI;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        LLJIJIL = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C09DL LJI() {
        LJFF(1, 2, e3.f);
        return this;
    }

    public C09DL LJII() {
        LJFF(3, 5, "}");
        return this;
    }

    public final void LJIIZILJ() throws IOException {
        if (this.LLILZ == null) {
            return;
        }
        this.LL.write("\n");
        int i = this.LLILLL;
        for (int i2 = 1; i2 < i; i2++) {
            this.LL.write(this.LLILZ);
        }
    }

    public C09DL LJIJJ() {
        if (this.LLIZLLLIL != null) {
            if (!this.LLJ) {
                this.LLIZLLLIL = null;
                return this;
            }
            LJJJLL();
        }
        LIZ();
        this.LL.write("null");
        return this;
    }

    public final int LJIJJLI() {
        int i = this.LLILLL;
        if (i != 0) {
            return this.LLILLJJLI[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void LJJJLL() throws IOException {
        if (this.LLIZLLLIL != null) {
            int iLJIJJLI = LJIJJLI();
            if (iLJIJJLI == 5) {
                this.LL.write(44);
            } else if (iLJIJJLI != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            LJIIZILJ();
            this.LLILLJJLI[this.LLILLL - 1] = 4;
            LJJ(this.LLIZLLLIL);
            this.LLIZLLLIL = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.LL.close();
        int i = this.LLILLL;
        if (i > 1 || (i == 1 && this.LLILLJJLI[0] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.LLILLL = 0;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.LLILLL == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.LL.flush();
    }

    public final void LIZ() throws IOException {
        int iLJIJJLI = LJIJJLI();
        if (iLJIJJLI == 1) {
            this.LLILLJJLI[this.LLILLL - 1] = 2;
            LJIIZILJ();
            return;
        }
        if (iLJIJJLI == 2) {
            this.LL.append(',');
            LJIIZILJ();
        } else {
            if (iLJIJJLI == 4) {
                this.LL.append((CharSequence) this.LLILZIL);
                this.LLILLJJLI[this.LLILLL - 1] = 5;
                return;
            }
            if (iLJIJJLI != 6) {
                if (iLJIJJLI != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.LLILZLL) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.LLILLJJLI[this.LLILLL - 1] = 7;
        }
    }

    public void LIZIZ() {
        LJJJLL();
        LIZ();
        int i = this.LLILLL;
        int[] iArr = this.LLILLJJLI;
        if (i == iArr.length) {
            int[] iArr2 = new int[i * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            this.LLILLJJLI = iArr2;
        }
        int[] iArr3 = this.LLILLJJLI;
        int i2 = this.LLILLL;
        this.LLILLL = i2 + 1;
        iArr3[i2] = 1;
        this.LL.write(e3.e);
    }

    public void LIZLLL() {
        LJJJLL();
        LIZ();
        int i = this.LLILLL;
        int[] iArr = this.LLILLJJLI;
        if (i == iArr.length) {
            int[] iArr2 = new int[i * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            this.LLILLJJLI = iArr2;
        }
        int[] iArr3 = this.LLILLJJLI;
        int i2 = this.LLILLL;
        this.LLILLL = i2 + 1;
        iArr3[i2] = 3;
        this.LL.write("{");
    }

    public C09DL(Writer writer) {
        int[] iArr = new int[32];
        this.LLILLJJLI = iArr;
        int i = this.LLILLL;
        if (i == iArr.length) {
            int[] iArr2 = new int[i * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            this.LLILLJJLI = iArr2;
        }
        int[] iArr3 = this.LLILLJJLI;
        int i2 = this.LLILLL;
        this.LLILLL = i2 + 1;
        iArr3[i2] = 6;
        this.LLILZIL = ":";
        this.LLJ = true;
        if (writer != null) {
            this.LL = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    public final void LJIILL(String str) {
        if (str == null) {
            LJIJJ();
            return;
        }
        LJJJLL();
        LIZ();
        this.LL.append((CharSequence) str);
    }

    public C09DL LJIILLIIL(String str) {
        if (str != null) {
            if (this.LLIZLLLIL == null) {
                if (this.LLILLL != 0) {
                    this.LLIZLLLIL = str;
                    return this;
                }
                throw new IllegalStateException("JsonWriter is closed.");
            }
            throw new IllegalStateException();
        }
        throw new NullPointerException("name == null");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJ(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.LLIZ
            if (r0 == 0) goto L42
            java.lang.String[] r7 = X.C09DL.LLJIJIL
        L6:
            java.io.Writer r0 = r8.LL
            java.lang.String r6 = "\""
            r0.write(r6)
            int r5 = r9.length()
            r4 = 0
            r3 = 0
        L13:
            if (r4 >= r5) goto L45
            char r1 = r9.charAt(r4)
            r0 = 128(0x80, float:1.8E-43)
            if (r1 >= r0) goto L24
            r2 = r7[r1]
            if (r2 != 0) goto L2a
        L21:
            int r4 = r4 + 1
            goto L13
        L24:
            r0 = 8232(0x2028, float:1.1535E-41)
            if (r1 != r0) goto L3b
            java.lang.String r2 = "\\u2028"
        L2a:
            if (r3 >= r4) goto L33
            java.io.Writer r1 = r8.LL
            int r0 = r4 - r3
            r1.write(r9, r3, r0)
        L33:
            java.io.Writer r0 = r8.LL
            r0.write(r2)
            int r3 = r4 + 1
            goto L21
        L3b:
            r0 = 8233(0x2029, float:1.1537E-41)
            if (r1 != r0) goto L21
            java.lang.String r2 = "\\u2029"
            goto L2a
        L42:
            java.lang.String[] r7 = X.C09DL.LLJI
            goto L6
        L45:
            if (r3 >= r5) goto L4d
            java.io.Writer r0 = r8.LL
            int r5 = r5 - r3
            r0.write(r9, r3, r5)
        L4d:
            java.io.Writer r0 = r8.LL
            r0.write(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09DL.LJJ(java.lang.String):void");
    }

    public void LJJIL(double d) throws IOException {
        LJJJLL();
        if (this.LLILZLL || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            LIZ();
            this.LL.append((CharSequence) Double.toString(d));
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Numeric values must be finite, but was ");
            sbLIZ.append(d);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public void LJJIZ(long j) throws IOException {
        LJJJLL();
        LIZ();
        this.LL.write(Long.toString(j));
    }

    public void LJJJ(Boolean bool) {
        String str;
        if (bool == null) {
            LJIJJ();
            return;
        }
        LJJJLL();
        LIZ();
        Writer writer = this.LL;
        if (bool.booleanValue()) {
            str = "true";
        } else {
            str = "false";
        }
        writer.write(str);
    }

    public void LJJJJ(Number number) {
        if (number == null) {
            LJIJJ();
            return;
        }
        LJJJLL();
        String string = number.toString();
        if (this.LLILZLL || (!string.equals("-Infinity") && !string.equals("Infinity") && !string.equals("NaN"))) {
            LIZ();
            this.LL.append((CharSequence) string);
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Numeric values must be finite, but was ");
            sbLIZ.append(number);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public void LJJJJJ(String str) {
        if (str == null) {
            LJIJJ();
            return;
        }
        LJJJLL();
        LIZ();
        LJJ(str);
    }

    public void LJJJJJL(boolean z) throws IOException {
        String str;
        LJJJLL();
        LIZ();
        Writer writer = this.LL;
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        writer.write(str);
    }

    public final void LJFF(int i, int i2, String str) throws IOException {
        int iLJIJJLI = LJIJJLI();
        if (iLJIJJLI != i2 && iLJIJJLI != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.LLIZLLLIL == null) {
            this.LLILLL--;
            if (iLJIJJLI == i2) {
                LJIIZILJ();
            }
            this.LL.write(str);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Dangling name: ");
        sbLIZ.append(this.LLIZLLLIL);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
