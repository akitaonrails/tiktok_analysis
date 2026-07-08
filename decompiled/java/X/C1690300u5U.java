package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0u5U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1690300u5U implements InterfaceC1690900u6S {
    public final int LIZ;
    public final int LIZIZ;
    public final List<AbstractC1686530tzP> LIZJ;
    public final long LIZLLL;
    public final Object LJ;
    public final InterfaceC1666960tTq LJFF;
    public final InterfaceC1682270tsX LJI;
    public final EnumC1671200tag LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final int LJIIJ;
    public final int[] LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;

    public C1690300u5U() {
        throw null;
    }

    @Override // X.InterfaceC1690900u6S
    public final int getIndex() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1690900u6S
    public final int getOffset() {
        return this.LJIIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(int r5) {
        /*
            r4 = this;
            int r0 = r4.LJIIL
            int r0 = r0 + r5
            r4.LJIIL = r0
            int[] r0 = r4.LJIIJJI
            int r3 = r0.length
            r2 = 0
        L9:
            if (r2 >= r3) goto L23
            boolean r0 = r4.LJIIIZ
            if (r0 == 0) goto L17
            int r1 = r2 % 2
            r0 = 1
            if (r1 == r0) goto L1b
        L14:
            int r2 = r2 + 1
            goto L9
        L17:
            int r0 = r2 % 2
            if (r0 != 0) goto L14
        L1b:
            int[] r1 = r4.LJIIJJI
            r0 = r1[r2]
            int r0 = r0 + r5
            r1[r2] = r0
            goto L14
        L23:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1690300u5U.LIZ(int):void");
    }

    public final void LIZIZ(int i, int i2, int i3) {
        int i4;
        int i5;
        this.LJIIL = i;
        if (this.LJIIIZ) {
            i4 = i3;
        } else {
            i4 = i2;
        }
        this.LJIILIIL = i4;
        List<AbstractC1686530tzP> list = this.LIZJ;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            AbstractC1686530tzP abstractC1686530tzP = (AbstractC1686530tzP) ListProtector.get(list, i6);
            int i7 = i6 * 2;
            if (this.LJIIIZ) {
                int[] iArr = this.LJIIJJI;
                InterfaceC1666960tTq interfaceC1666960tTq = this.LJFF;
                if (interfaceC1666960tTq != null) {
                    iArr[i7] = interfaceC1666960tTq.LIZ(abstractC1686530tzP.LL, i2, this.LJII);
                    this.LJIIJJI[i7 + 1] = i;
                    i5 = abstractC1686530tzP.LLILLJJLI;
                } else {
                    C1691080u6k.LIZIZ("null horizontalAlignment");
                    throw new C2197108jB();
                }
            } else {
                int[] iArr2 = this.LJIIJJI;
                iArr2[i7] = i;
                int i8 = i7 + 1;
                InterfaceC1682270tsX interfaceC1682270tsX = this.LJI;
                if (interfaceC1682270tsX != null) {
                    iArr2[i8] = interfaceC1682270tsX.LIZ(abstractC1686530tzP.LLILLJJLI, i3);
                    i5 = abstractC1686530tzP.LL;
                } else {
                    C1691080u6k.LIZIZ("null verticalAlignment");
                    throw new C2197108jB();
                }
            }
            i += i5;
        }
    }

    public C1690300u5U(int i, int i2, List list, long j, Object obj, EnumC1684030tvN enumC1684030tvN, InterfaceC1666960tTq interfaceC1666960tTq, InterfaceC1682270tsX interfaceC1682270tsX, EnumC1671200tag enumC1671200tag, boolean z) {
        boolean z2;
        int i3;
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = list;
        this.LIZLLL = j;
        this.LJ = obj;
        this.LJFF = interfaceC1666960tTq;
        this.LJI = interfaceC1682270tsX;
        this.LJII = enumC1671200tag;
        this.LJIIIIZZ = z;
        if (enumC1684030tvN == EnumC1684030tvN.Vertical) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJIIIZ = z2;
        int size = list.size();
        int iMax = 0;
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC1686530tzP abstractC1686530tzP = (AbstractC1686530tzP) ListProtector.get(list, i4);
            if (!this.LJIIIZ) {
                i3 = abstractC1686530tzP.LLILLJJLI;
            } else {
                i3 = abstractC1686530tzP.LL;
            }
            iMax = Math.max(iMax, i3);
        }
        this.LJIIJ = iMax;
        this.LJIIJJI = new int[this.LIZJ.size() * 2];
        this.LJIILIIL = Integer.MIN_VALUE;
    }
}
