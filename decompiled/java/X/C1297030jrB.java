package X;

import java.io.IOException;

/* JADX INFO: renamed from: X.0jrB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1297030jrB extends AbstractC1297000jr8 {
    public static final String[] LLJI = new String[128];
    public final InterfaceC1496780p3M LLIZLLLIL;
    public String LLJ;

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
    }

    @Override // X.AbstractC1297000jr8
    public final C1297030jrB LIZIZ() {
        if (this.LLJ != null) {
            if (!this.LLILZLL) {
                this.LLJ = null;
                return this;
            }
            LJIJJ();
        }
        LJIILL();
        this.LLIZLLLIL.LJLLILLLL("null");
        int[] iArr = this.LLILZ;
        int i = this.LL - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    public final void LJIJJ() {
        if (this.LLJ != null) {
            int iLIZLLL = LIZLLL();
            if (iLIZLLL == 5) {
                this.LLIZLLLIL.writeByte(44);
            } else if (iLIZLLL != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            this.LLILLJJLI[this.LL - 1] = 4;
            LJIIZILJ(this.LLIZLLLIL, this.LLJ);
            this.LLJ = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.LLIZLLLIL.close();
        int i = this.LL;
        if (i > 1 || (i == 1 && this.LLILLJJLI[0] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.LL = 0;
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.LL == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.LLIZLLLIL.flush();
    }

    public final void LJIILL() {
        int iLIZLLL = LIZLLL();
        if (iLIZLLL == 1) {
            this.LLILLJJLI[this.LL - 1] = 2;
            return;
        }
        if (iLIZLLL == 2) {
            this.LLIZLLLIL.writeByte(44);
            return;
        }
        if (iLIZLLL == 4) {
            this.LLIZLLLIL.LJLLILLLL(":");
            this.LLILLJJLI[this.LL - 1] = 5;
            return;
        }
        if (iLIZLLL != 6) {
            if (iLIZLLL != 7) {
                throw new IllegalStateException("Nesting problem.");
            }
            if (!this.LLILZIL) {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
        }
        this.LLILLJJLI[this.LL - 1] = 7;
    }

    public C1297030jrB(C1496690p3D c1496690p3D) {
        this.LLIZLLLIL = c1496690p3D;
        LJFF(6);
    }

    @Override // X.AbstractC1297000jr8
    public final C1297030jrB LIZ(String str) {
        if (str != null) {
            int i = this.LL;
            if (i != 0) {
                if (this.LLJ == null) {
                    this.LLJ = str;
                    this.LLILLL[i - 1] = str;
                    this.LLIZ = false;
                    return this;
                }
                throw new IllegalStateException("Nesting problem.");
            }
            throw new IllegalStateException("JsonWriter is closed.");
        }
        throw new NullPointerException("name == null");
    }

    @Override // X.AbstractC1297000jr8
    public final C1297030jrB LJI(long j) {
        if (this.LLIZ) {
            LIZ(Long.toString(j));
            return this;
        }
        LJIJJ();
        LJIILL();
        this.LLIZLLLIL.LJLLILLLL(Long.toString(j));
        int[] iArr = this.LLILZ;
        int i = this.LL - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // X.AbstractC1297000jr8
    public final C1297030jrB LJII(String str) {
        if (str == null) {
            LIZIZ();
            return this;
        }
        if (this.LLIZ) {
            LIZ(str);
            return this;
        }
        LJIJJ();
        LJIILL();
        LJIIZILJ(this.LLIZLLLIL, str);
        int[] iArr = this.LLILZ;
        int i = this.LL - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIZILJ(X.InterfaceC1496780p3M r7, java.lang.String r8) {
        /*
            java.lang.String[] r6 = X.C1297030jrB.LLJI
            r5 = 34
            r7.writeByte(r5)
            int r4 = r8.length()
            r3 = 0
            r2 = 0
        Ld:
            if (r3 >= r4) goto L36
            char r1 = r8.charAt(r3)
            r0 = 128(0x80, float:1.8E-43)
            if (r1 >= r0) goto L1e
            r0 = r6[r1]
            if (r0 != 0) goto L24
        L1b:
            int r3 = r3 + 1
            goto Ld
        L1e:
            r0 = 8232(0x2028, float:1.1535E-41)
            if (r1 != r0) goto L2f
            java.lang.String r0 = "\\u2028"
        L24:
            if (r2 >= r3) goto L29
            r7.LJJZZIII(r2, r3, r8)
        L29:
            r7.LJLLILLLL(r0)
            int r2 = r3 + 1
            goto L1b
        L2f:
            r0 = 8233(0x2029, float:1.1537E-41)
            if (r1 != r0) goto L1b
            java.lang.String r0 = "\\u2029"
            goto L24
        L36:
            if (r2 >= r4) goto L3b
            r7.LJJZZIII(r2, r4, r8)
        L3b:
            r7.writeByte(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1297030jrB.LJIIZILJ(X.0p3M, java.lang.String):void");
    }

    public final void LJIILLIIL(int i, int i2, String str) {
        int iLIZLLL = LIZLLL();
        if (iLIZLLL != i2 && iLIZLLL != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.LLJ == null) {
            int i3 = this.LL - 1;
            this.LL = i3;
            this.LLILLL[i3] = null;
            int[] iArr = this.LLILZ;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.LLIZLLLIL.LJLLILLLL(str);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Dangling name: ");
        sbLIZ.append(this.LLJ);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
