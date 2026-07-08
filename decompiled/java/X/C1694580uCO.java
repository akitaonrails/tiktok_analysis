package X;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0uCO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1694580uCO extends AbstractC1694590uCP<C1694580uCO> {
    public final C1686970u07 LJII;
    public final C1691980u8C LJIIIIZZ;

    public final List<InterfaceC1694390uC5> LJJI(Function1<? super C1694580uCO, ? extends InterfaceC1694390uC5> function1) {
        if (C1692280u8g.LIZJ(this.LJFF)) {
            InterfaceC1694390uC5 interfaceC1694390uC5Invoke = function1.invoke(this);
            if (interfaceC1694390uC5Invoke != null) {
                return Collections.singletonList(interfaceC1694390uC5Invoke);
            }
            return null;
        }
        return C1697810uHb.LJIIJJI(new C1694270uBt("", 0), new C1694320uBy(C1692280u8g.LJI(this.LJFF), C1692280u8g.LJI(this.LJFF)));
    }

    public final int LJJIFFI(C1691980u8C c1691980u8C, int i) {
        C1683130ttv c1683130ttvLJJJJZI;
        InterfaceC1692950u9l interfaceC1692950u9l;
        InterfaceC1692950u9l interfaceC1692950u9l2 = c1691980u8C.LIZIZ;
        if (interfaceC1692950u9l2 == null || (interfaceC1692950u9l = c1691980u8C.LIZJ) == null || (c1683130ttvLJJJJZI = interfaceC1692950u9l.LJJJJZI(interfaceC1692950u9l2, true)) == null) {
            c1683130ttvLJJJJZI = C1683130ttv.LJ;
        }
        C1683130ttv c1683130ttvLIZJ = c1691980u8C.LIZ.LIZJ(this.LIZLLL.LIZ(C1692280u8g.LIZLLL(this.LJII.LIZIZ)));
        float f = c1683130ttvLIZJ.LIZ;
        float fIntBitsToFloat = c1683130ttvLIZJ.LIZIZ + (Float.intBitsToFloat((int) (c1683130ttvLJJJJZI.LIZLLL() & 4294967295L)) * i);
        return this.LIZLLL.LIZIZ(c1691980u8C.LIZ.LIZIZ.LJI((((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1694580uCO(C1686970u07 c1686970u07, InterfaceC1692600u9C interfaceC1692600u9C, C1691980u8C c1691980u8C, C1694460uCC c1694460uCC) {
        C1692150u8T c1692150u8T;
        C1692220u8a c1692220u8a = c1686970u07.LIZ;
        long j = c1686970u07.LIZIZ;
        if (c1691980u8C != null) {
            c1692150u8T = c1691980u8C.LIZ;
        } else {
            c1692150u8T = null;
        }
        super(c1692220u8a, j, c1692150u8T, interfaceC1692600u9C, c1694460uCC);
        this.LJII = c1686970u07;
        this.LJIIIIZZ = c1691980u8C;
    }
}
