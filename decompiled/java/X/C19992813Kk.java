package X;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: X.13Kk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19992813Kk<E> extends C19992313Kf<E> implements InterfaceC835440Wpy {
    public final C19992713Kj<E> LLILLJJLI;

    @Override // X.C19992313Kf, java.util.Set, java.util.Collection
    public final void clear() {
        this.LLILLJJLI.LIZJ();
    }

    @Override // X.C19992313Kf, java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return new C19993113Kn(this);
    }

    public C19992813Kk(C19992713Kj<E> c19992713Kj) {
        super(c19992713Kj);
        this.LLILLJJLI = c19992713Kj;
    }

    @Override // X.C19992313Kf, java.util.Set, java.util.Collection
    public final boolean add(E e) {
        return this.LLILLJJLI.LIZIZ(e);
    }

    @Override // X.C19992313Kf, java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        C19992713Kj<E> c19992713Kj = this.LLILLJJLI;
        int i = c19992713Kj.LJI;
        for (Object obj : collection) {
            int iLIZLLL = c19992713Kj.LIZLLL((E) obj);
            c19992713Kj.LIZIZ[iLIZLLL] = obj;
            long[] jArr = c19992713Kj.LIZJ;
            int i2 = c19992713Kj.LIZLLL;
            jArr[iLIZLLL] = (((long) i2) & 2147483647L) | 4611686016279904256L;
            if (i2 != Integer.MAX_VALUE) {
                jArr[i2] = ((((long) iLIZLLL) & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
            }
            c19992713Kj.LIZLLL = iLIZLLL;
            if (c19992713Kj.LJ == Integer.MAX_VALUE) {
                c19992713Kj.LJ = iLIZLLL;
            }
        }
        if (i != c19992713Kj.LJI) {
            return true;
        }
        return false;
    }

    @Override // X.C19992313Kf, java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.LLILLJJLI.LJI(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0084, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) != 0) goto L33;
     */
    @Override // X.C19992313Kf, java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean removeAll(java.util.Collection<? extends java.lang.Object> r17) {
        /*
            r16 = this;
            r0 = r16
            X.13Kj<E> r10 = r0.LLILLJJLI
            int r9 = r10.LJI
            java.util.Iterator r15 = r17.iterator()
        La:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L8d
            java.lang.Object r8 = r15.next()
            if (r8 == 0) goto L8b
            int r1 = r8.hashCode()
        L1a:
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r0
            int r0 = r1 << 16
            r1 = r1 ^ r0
            r7 = r1 & 127(0x7f, float:1.78E-43)
            int r6 = r10.LJFF
            int r14 = r1 >>> 7
            r14 = r14 & r6
            r13 = 0
        L29:
            long[] r3 = r10.LIZ
            int r2 = r14 >> 3
            r0 = r14 & 7
            int r1 = r0 << 3
            r11 = r3[r2]
            long r11 = r11 >>> r1
            int r0 = r2 + 1
            r2 = r3[r0]
            int r0 = 64 - r1
            long r2 = r2 << r0
            long r0 = (long) r1
            long r4 = -r0
            r0 = 63
            long r4 = r4 >> r0
            long r4 = r4 & r2
            long r4 = r4 | r11
            long r2 = (long) r7
            r0 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r2 = r2 * r0
            long r2 = r2 ^ r4
            long r11 = r2 - r0
            long r0 = ~r2
            long r0 = r0 & r11
            r2 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r2
        L54:
            r11 = 0
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 == 0) goto L78
            int r2 = java.lang.Long.numberOfTrailingZeros(r0)
            int r3 = r2 >> 3
            int r3 = r3 + r14
            r3 = r3 & r6
            java.lang.Object[] r2 = r10.LIZIZ
            r2 = r2[r3]
            boolean r2 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r8)
            if (r2 == 0) goto L72
            if (r3 < 0) goto La
            r10.LJII(r3)
            goto La
        L72:
            r11 = 1
            long r2 = r0 - r11
            long r0 = r0 & r2
            goto L54
        L78:
            long r0 = ~r4
            r2 = 6
            long r0 = r0 << r2
            long r4 = r4 & r0
            r0 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r4 = r4 & r0
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 != 0) goto La
            int r13 = r13 + 8
            int r14 = r14 + r13
            r14 = r14 & r6
            goto L29
        L8b:
            r1 = 0
            goto L1a
        L8d:
            int r0 = r10.LJI
            if (r9 == r0) goto L93
            r0 = 1
            return r0
        L93:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19992813Kk.removeAll(java.util.Collection):boolean");
    }

    @Override // X.C19992313Kf, java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        return this.LLILLJJLI.LJIIIIZZ(collection);
    }
}
