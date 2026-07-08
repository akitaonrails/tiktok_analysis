package X;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.13Lg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19995013Lg implements Iterator<IntRange>, C03W4 {
    public int LL = -1;
    public int LLILLJJLI;
    public int LLILLL;
    public IntRange LLILZ;
    public int LLILZIL;
    public final /* synthetic */ C19995113Lh LLILZLL;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r7 = this;
            int r6 = r7.LLILLL
            r5 = 0
            if (r6 >= 0) goto Lb
            r7.LL = r5
            r0 = 0
            r7.LLILZ = r0
            return
        Lb:
            X.13Lh r2 = r7.LLILZLL
            int r1 = r2.LIZJ
            r4 = -1
            r3 = 1
            if (r1 <= 0) goto L1b
            int r0 = r7.LLILZIL
            int r0 = r0 + 1
            r7.LLILZIL = r0
            if (r0 >= r1) goto L73
        L1b:
            java.lang.CharSequence r0 = r2.LIZ
            int r0 = r0.length()
            if (r6 > r0) goto L73
            X.13Lh r0 = r7.LLILZLL
            kotlin.jvm.functions.Function2<java.lang.CharSequence, java.lang.Integer, kotlin.Pair<java.lang.Integer, java.lang.Integer>> r2 = r0.LIZLLL
            java.lang.CharSequence r1 = r0.LIZ
            int r0 = r7.LLILLL
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r2.invoke(r1, r0)
            kotlin.Pair r1 = (kotlin.Pair) r1
            if (r1 != 0) goto L4d
            kotlin.ranges.IntRange r2 = new kotlin.ranges.IntRange
            int r1 = r7.LLILLJJLI
            X.13Lh r0 = r7.LLILZLL
            java.lang.CharSequence r0 = r0.LIZ
            int r0 = kotlin.text.a0.LJJIJL(r0)
            r2.<init>(r1, r0)
            r7.LLILZ = r2
            r7.LLILLL = r4
        L4a:
            r7.LL = r3
            return
        L4d:
            java.lang.Object r0 = r1.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            java.lang.Object r0 = r1.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            int r0 = r7.LLILLJJLI
            kotlin.ranges.IntRange r0 = X.C13LZ.LJIILJJIL(r0, r2)
            r7.LLILZ = r0
            int r2 = r2 + r1
            r7.LLILLJJLI = r2
            if (r1 != 0) goto L6f
            r5 = 1
        L6f:
            int r2 = r2 + r5
            r7.LLILLL = r2
            goto L4a
        L73:
            kotlin.ranges.IntRange r2 = new kotlin.ranges.IntRange
            int r1 = r7.LLILLJJLI
            X.13Lh r0 = r7.LLILZLL
            java.lang.CharSequence r0 = r0.LIZ
            int r0 = kotlin.text.a0.LJJIJL(r0)
            r2.<init>(r1, r0)
            r7.LLILZ = r2
            r7.LLILLL = r4
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19995013Lg.LIZ():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.LL == -1) {
            LIZ();
        }
        return this.LL == 1;
    }

    @Override // java.util.Iterator
    public final IntRange next() {
        if (this.LL == -1) {
            LIZ();
        }
        if (this.LL == 0) {
            throw new NoSuchElementException();
        }
        IntRange intRange = this.LLILZ;
        this.LLILZ = null;
        this.LL = -1;
        return intRange;
    }

    public C19995013Lg(C19995113Lh c19995113Lh) {
        this.LLILZLL = c19995113Lh;
        int iLJ = C13LZ.LJ(c19995113Lh.LIZIZ, 0, c19995113Lh.LIZ.length());
        this.LLILLJJLI = iLJ;
        this.LLILLL = iLJ;
    }
}
