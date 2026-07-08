package X;

/* JADX INFO: renamed from: X.13X7, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13X7<K, V> {
    public C13X6<K, V> LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    public final void LIZ(C13X6<K, V> c13x6) {
        c13x6.LLILLL = null;
        c13x6.LL = null;
        c13x6.LLILLJJLI = null;
        c13x6.LLJ = 1;
        int i = this.LIZIZ;
        if (i > 0) {
            int i2 = this.LIZLLL;
            if ((i2 & 1) == 0) {
                this.LIZLLL = i2 + 1;
                this.LIZIZ = i - 1;
                this.LIZJ++;
            }
        }
        c13x6.LL = this.LIZ;
        this.LIZ = c13x6;
        int i3 = this.LIZLLL + 1;
        this.LIZLLL = i3;
        int i4 = this.LIZIZ;
        if (i4 > 0 && (i3 & 1) == 0) {
            this.LIZLLL = i3 + 1;
            this.LIZIZ = i4 - 1;
            this.LIZJ++;
        }
        int i5 = 4;
        while (true) {
            int i6 = i5 - 1;
            if ((this.LIZLLL & i6) == i6) {
                int i7 = this.LIZJ;
                if (i7 == 0) {
                    C13X6<K, V> c13x62 = this.LIZ;
                    C13X6<K, V> c13x63 = c13x62.LL;
                    C13X6<K, V> c13x64 = c13x63.LL;
                    c13x63.LL = c13x64.LL;
                    this.LIZ = c13x63;
                    c13x63.LLILLJJLI = c13x64;
                    c13x63.LLILLL = c13x62;
                    c13x63.LLJ = c13x62.LLJ + 1;
                    c13x64.LL = c13x63;
                    c13x62.LL = c13x63;
                } else if (i7 == 1) {
                    C13X6<K, V> c13x65 = this.LIZ;
                    C13X6<K, V> c13x66 = c13x65.LL;
                    this.LIZ = c13x66;
                    c13x66.LLILLL = c13x65;
                    c13x66.LLJ = c13x65.LLJ + 1;
                    c13x65.LL = c13x66;
                    this.LIZJ = 0;
                } else if (i7 == 2) {
                    this.LIZJ = 0;
                }
                i5 *= 2;
            } else {
                return;
            }
        }
    }
}
