package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0u8A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1691960u8A extends C09AY implements Function1<InterfaceC1679420tnw, Unit> {
    public final /* synthetic */ C1691930u87 LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C1692080u8M LLILZ;
    public final /* synthetic */ C1686970u07 LLILZIL;
    public final /* synthetic */ C1695020uD6 LLILZLL;
    public final /* synthetic */ InterfaceC1692600u9C LLIZ;
    public final /* synthetic */ C1692140u8S LLIZLLLIL;
    public final /* synthetic */ InterfaceC497601wk LLJ;
    public final /* synthetic */ InterfaceC1684400tvy LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1691960u8A(C1691930u87 c1691930u87, boolean z, boolean z2, C1692080u8M c1692080u8M, C1686970u07 c1686970u07, C1695020uD6 c1695020uD6, InterfaceC1692600u9C interfaceC1692600u9C, C1692140u8S c1692140u8S, InterfaceC497601wk interfaceC497601wk, InterfaceC1684400tvy interfaceC1684400tvy) {
        super(1);
        this.LL = c1691930u87;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = c1692080u8M;
        this.LLILZIL = c1686970u07;
        this.LLILZLL = c1695020uD6;
        this.LLIZ = interfaceC1692600u9C;
        this.LLIZLLLIL = c1692140u8S;
        this.LLJ = interfaceC497601wk;
        this.LLJI = interfaceC1684400tvy;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1679420tnw interfaceC1679420tnw) {
        C1691980u8C c1691980u8CLIZLLL;
        InterfaceC1679420tnw interfaceC1679420tnw2 = interfaceC1679420tnw;
        if (this.LL.LIZIZ() != interfaceC1679420tnw2.isFocused()) {
            ((C13FE) this.LL.LJFF).setValue(Boolean.valueOf(interfaceC1679420tnw2.isFocused()));
            if (this.LL.LIZIZ() && this.LLILLJJLI && !this.LLILLL) {
                C1692080u8M c1692080u8M = this.LLILZ;
                C1691930u87 c1691930u87 = this.LL;
                C1686970u07 c1686970u07 = this.LLILZIL;
                C1695020uD6 c1695020uD6 = this.LLILZLL;
                InterfaceC1692600u9C interfaceC1692600u9C = this.LLIZ;
                c1691930u87.LJ = C1691940u88.LIZLLL(c1692080u8M, c1686970u07, c1691930u87.LIZLLL, c1695020uD6, c1691930u87.LJIJJLI, c1691930u87.LJIL);
                C1691920u86.LJFF(c1691930u87, c1686970u07, interfaceC1692600u9C);
            } else {
                C1691920u86.LJ(this.LL);
            }
            if (interfaceC1679420tnw2.isFocused() && (c1691980u8CLIZLLL = this.LL.LIZLLL()) != null) {
                C23250099c.LIZLLL(this.LLJ, null, null, new C1691520u7S(this.LLJI, this.LLILZIL, this.LL, c1691980u8CLIZLLL, this.LLIZ, null), 3);
            }
            if (!interfaceC1679420tnw2.isFocused()) {
                this.LLIZLLLIL.LJI(null);
            }
        }
        return Unit.LIZ;
    }
}
