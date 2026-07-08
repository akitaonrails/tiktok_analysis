package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0u89, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1691950u89 extends C09AY implements Function1<InterfaceC1692950u9l, Unit> {
    public final /* synthetic */ C1691930u87 LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ InterfaceC1684280tvm LLILLL;
    public final /* synthetic */ C1692140u8S LLILZ;
    public final /* synthetic */ C1686970u07 LLILZIL;
    public final /* synthetic */ InterfaceC1692600u9C LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1691950u89(C1691930u87 c1691930u87, boolean z, InterfaceC1684280tvm interfaceC1684280tvm, C1692140u8S c1692140u8S, C1686970u07 c1686970u07, InterfaceC1692600u9C interfaceC1692600u9C) {
        super(1);
        this.LL = c1691930u87;
        this.LLILLJJLI = z;
        this.LLILLL = interfaceC1684280tvm;
        this.LLILZ = c1692140u8S;
        this.LLILZIL = c1686970u07;
        this.LLILZLL = interfaceC1692600u9C;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1692950u9l interfaceC1692950u9l) {
        InterfaceC1692950u9l interfaceC1692950u9l2;
        InterfaceC1692950u9l interfaceC1692950u9l3;
        InterfaceC1692950u9l interfaceC1692950u9l4 = interfaceC1692950u9l;
        C1691930u87 c1691930u87 = this.LL;
        c1691930u87.LJII = interfaceC1692950u9l4;
        C1691980u8C c1691980u8CLIZLLL = c1691930u87.LIZLLL();
        if (c1691980u8CLIZLLL != null) {
            c1691980u8CLIZLLL.LIZIZ = interfaceC1692950u9l4;
        }
        if (this.LLILLJJLI) {
            if (this.LL.LIZ() == EnumC1684410tvz.Selection) {
                if (((Boolean) ((C13FE) this.LL.LJIIJJI).getValue()).booleanValue() && this.LLILLL.LIZ()) {
                    this.LLILZ.LJIJJ();
                } else {
                    this.LLILZ.LJIILIIL();
                }
                ((C13FE) this.LL.LJIIL).setValue(Boolean.valueOf(C1691990u8D.LIZIZ(this.LLILZ, true)));
                ((C13FE) this.LL.LJIILIIL).setValue(Boolean.valueOf(C1691990u8D.LIZIZ(this.LLILZ, false)));
                ((C13FE) this.LL.LJIILJJIL).setValue(Boolean.valueOf(C1692280u8g.LIZJ(this.LLILZIL.LIZIZ)));
            } else if (this.LL.LIZ() == EnumC1684410tvz.Cursor) {
                ((C13FE) this.LL.LJIILJJIL).setValue(Boolean.valueOf(C1691990u8D.LIZIZ(this.LLILZ, true)));
            }
            C1691920u86.LJFF(this.LL, this.LLILZIL, this.LLILZLL);
            C1691980u8C c1691980u8CLIZLLL2 = this.LL.LIZLLL();
            if (c1691980u8CLIZLLL2 != null) {
                C1691930u87 c1691930u872 = this.LL;
                C1686970u07 c1686970u07 = this.LLILZIL;
                InterfaceC1692600u9C interfaceC1692600u9C = this.LLILZLL;
                C1692530u95 c1692530u95 = c1691930u872.LJ;
                if (c1692530u95 != null && c1691930u872.LIZIZ() && (interfaceC1692950u9l2 = c1691980u8CLIZLLL2.LIZIZ) != null && interfaceC1692950u9l2.LIZLLL() && (interfaceC1692950u9l3 = c1691980u8CLIZLLL2.LIZJ) != null) {
                    C1692150u8T c1692150u8T = c1691980u8CLIZLLL2.LIZ;
                    AwS604S0100000_25 awS604S0100000_25 = new AwS604S0100000_25(interfaceC1692950u9l2, 923);
                    C1683130ttv c1683130ttvLIZ = C1676280tis.LIZ(interfaceC1692950u9l2);
                    C1683130ttv c1683130ttvLJJJJZI = interfaceC1692950u9l2.LJJJJZI(interfaceC1692950u9l3, false);
                    if (Intrinsics.LJFF(c1692530u95.LIZ.LIZIZ.get(), c1692530u95)) {
                        c1692530u95.LIZIZ.LJ(c1686970u07, interfaceC1692600u9C, c1692150u8T, awS604S0100000_25, c1683130ttvLIZ, c1683130ttvLJJJJZI);
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
