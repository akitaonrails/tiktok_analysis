package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.15oM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20632015oM extends AbstractC1585810rMx {
    public C712250Rwl LL;
    public final C20632315oP LLILLJJLI;
    public final RecyclerView LLILLL;
    public final LinearLayoutManager LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public final C20631815oK LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;

    public final void LJJIZ() {
        this.LLILZIL = 0;
        this.LLILZLL = 0;
        C20631815oK c20631815oK = this.LLIZ;
        c20631815oK.LIZ = -1;
        c20631815oK.LIZIZ = 0.0f;
        c20631815oK.LIZJ = 0;
        this.LLIZLLLIL = -1;
        this.LLJ = -1;
        this.LLJI = false;
        this.LLJIJIL = false;
        this.LLJILJILJ = false;
        this.LLJILJIL = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJ() {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20632015oM.LJJJJ():void");
    }

    public C20632015oM(C20632315oP c20632315oP) {
        this.LLILLJJLI = c20632315oP;
        RecyclerView recyclerView = c20632315oP.LLJI;
        this.LLILLL = recyclerView;
        this.LLILZ = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.LLIZ = new C20631815oK();
        LJJIZ();
    }

    public final void LJJIJIIJIL(int i) {
        C712250Rwl c712250Rwl = this.LL;
        if (c712250Rwl != null) {
            c712250Rwl.onPageSelected(i);
        }
    }

    public final void LJJIL(int i) {
        if ((this.LLILZIL == 3 && this.LLILZLL == 0) || this.LLILZLL == i) {
            return;
        }
        this.LLILZLL = i;
        C712250Rwl c712250Rwl = this.LL;
        if (c712250Rwl != null) {
            c712250Rwl.onPageScrollStateChanged(i);
        }
    }

    public final void LJJJ(boolean z) {
        int i;
        this.LLJILJILJ = z;
        if (z) {
            i = 4;
        } else {
            i = 1;
        }
        this.LLILZIL = i;
        int i2 = this.LLJ;
        if (i2 != -1) {
            this.LLIZLLLIL = i2;
            this.LLJ = -1;
        } else if (this.LLIZLLLIL == -1) {
            this.LLIZLLLIL = this.LLILZ.findFirstVisibleItemPosition();
        }
        LJJIL(1);
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        boolean z;
        boolean z2;
        C712250Rwl c712250Rwl;
        int i2 = this.LLILZIL;
        if ((i2 != 1 || this.LLILZLL != 1) && i == 1) {
            LJJJ(false);
            return;
        }
        if (i2 != 1 && i2 != 4) {
            z = false;
        } else {
            z = true;
        }
        if (z && i == 2) {
            if (this.LLJIJIL) {
                LJJIL(2);
                this.LLJI = true;
                return;
            }
            return;
        }
        if (i2 != 1 && i2 != 4) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2 && i == 0) {
            LJJJJ();
            if (!this.LLJIJIL) {
                int i3 = this.LLIZ.LIZ;
                if (i3 != -1 && (c712250Rwl = this.LL) != null) {
                    c712250Rwl.onPageScrolled(i3, 0.0f, 0);
                }
            } else {
                C20631815oK c20631815oK = this.LLIZ;
                if (c20631815oK.LIZJ == 0) {
                    int i4 = this.LLIZLLLIL;
                    int i5 = c20631815oK.LIZ;
                    if (i4 != i5) {
                        LJJIJIIJIL(i5);
                    }
                }
            }
            LJJIL(0);
            LJJIZ();
        }
        if (this.LLILZIL == 2 && i == 0 && this.LLJILJIL) {
            LJJJJ();
            C20631815oK c20631815oK2 = this.LLIZ;
            if (c20631815oK2.LIZJ == 0) {
                int i6 = this.LLJ;
                int i7 = c20631815oK2.LIZ;
                if (i6 != i7) {
                    if (i7 == -1) {
                        i7 = 0;
                    }
                    LJJIJIIJIL(i7);
                }
                LJJIL(0);
                LJJIZ();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    @Override // X.AbstractC1585810rMx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZI(androidx.recyclerview.widget.RecyclerView r8, int r9, int r10) {
        /*
            r7 = this;
            r4 = 1
            r7.LLJIJIL = r4
            r7.LJJJJ()
            boolean r0 = r7.LLJI
            r5 = -1
            r3 = 0
            if (r0 == 0) goto L69
            r7.LLJI = r3
            if (r10 > 0) goto L22
            if (r10 != 0) goto L64
            if (r9 >= 0) goto L62
            r1 = 1
        L15:
            X.15oP r0 = r7.LLILLJJLI
            X.15oQ r0 = r0.LLIZ
            int r0 = r0.getLayoutDirection()
            if (r0 != r4) goto L60
            r0 = 1
        L20:
            if (r1 != r0) goto L64
        L22:
            X.15oK r1 = r7.LLIZ
            int r0 = r1.LIZJ
            if (r0 == 0) goto L64
            int r0 = r1.LIZ
            int r1 = r0 + 1
        L2c:
            r7.LLJ = r1
            int r0 = r7.LLIZLLLIL
            if (r0 == r1) goto L35
            r7.LJJIJIIJIL(r1)
        L35:
            X.15oK r0 = r7.LLIZ
            int r6 = r0.LIZ
            if (r6 != r5) goto L3c
            r6 = 0
        L3c:
            float r2 = r0.LIZIZ
            int r1 = r0.LIZJ
            X.0Rwl r0 = r7.LL
            if (r0 == 0) goto L47
            r0.onPageScrolled(r6, r2, r1)
        L47:
            X.15oK r2 = r7.LLIZ
            int r1 = r2.LIZ
            int r0 = r7.LLJ
            if (r1 == r0) goto L51
            if (r0 != r5) goto L5f
        L51:
            int r0 = r2.LIZJ
            if (r0 != 0) goto L5f
            int r0 = r7.LLILZLL
            if (r0 == r4) goto L5f
            r7.LJJIL(r3)
            r7.LJJIZ()
        L5f:
            return
        L60:
            r0 = 0
            goto L20
        L62:
            r1 = 0
            goto L15
        L64:
            X.15oK r0 = r7.LLIZ
            int r1 = r0.LIZ
            goto L2c
        L69:
            int r0 = r7.LLILZIL
            if (r0 != 0) goto L35
            X.15oK r0 = r7.LLIZ
            int r0 = r0.LIZ
            if (r0 != r5) goto L74
            r0 = 0
        L74:
            r7.LJJIJIIJIL(r0)
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20632015oM.LJJIIZI(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
