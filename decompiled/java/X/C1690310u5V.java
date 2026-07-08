package X;

import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0u5V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1690310u5V implements C05P1<IntRange> {
    public final int LL;
    public final int LLILLJJLI;
    public final C05P0 LLILLL;
    public int LLILZ;

    static {
        new Object() { // from class: X.0u5p
        };
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.ranges.IntRange] */
    @Override // X.C05P1
    public final IntRange getValue() {
        return ((C13FE) this.LLILLL).getValue();
    }

    public final void LJIIL(int i) {
        if (i != this.LLILZ) {
            this.LLILZ = i;
            int i2 = this.LL;
            int i3 = this.LLILLJJLI;
            int i4 = (i / i2) * i2;
            ((C13FE) this.LLILLL).setValue(C13LZ.LJIILJJIL(Math.max(i4 - i3, 0), i4 + i2 + i3));
        }
    }

    public C1690310u5V(int i, int i2, int i3) {
        this.LL = i2;
        this.LLILLJJLI = i3;
        int i4 = (i / i2) * i2;
        this.LLILLL = C20028913Yh.LJFF(C13LZ.LJIILJJIL(Math.max(i4 - i3, 0), i4 + i2 + i3), C595410NWx.LIZ);
        this.LLILZ = i;
    }
}
