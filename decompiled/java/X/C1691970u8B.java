package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0u8B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1691970u8B extends C09AY implements Function1<C1378605aS, Unit> {
    public final /* synthetic */ C1691930u87 LL;
    public final /* synthetic */ C20060213eK LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ C1692140u8S LLILZIL;
    public final /* synthetic */ InterfaceC1692600u9C LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1691970u8B(C1691930u87 c1691930u87, C20060213eK c20060213eK, boolean z, boolean z2, C1692140u8S c1692140u8S, InterfaceC1692600u9C interfaceC1692600u9C) {
        super(1);
        this.LL = c1691930u87;
        this.LLILLJJLI = c20060213eK;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = c1692140u8S;
        this.LLILZLL = interfaceC1692600u9C;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1378605aS c1378605aS) {
        InterfaceC1679450tnz interfaceC1679450tnz;
        long j = c1378605aS.LIZ;
        C1691930u87 c1691930u87 = this.LL;
        C20060213eK c20060213eK = this.LLILLJJLI;
        boolean z = !this.LLILLL;
        if (!c1691930u87.LIZIZ()) {
            C20060213eK.LIZIZ(c20060213eK);
        } else if (z && (interfaceC1679450tnz = c1691930u87.LIZJ) != null) {
            interfaceC1679450tnz.show();
        }
        if (this.LL.LIZIZ() && this.LLILZ) {
            if (this.LL.LIZ() != EnumC1684410tvz.Selection) {
                C1691980u8C c1691980u8CLIZLLL = this.LL.LIZLLL();
                if (c1691980u8CLIZLLL != null) {
                    C1691930u87 c1691930u872 = this.LL;
                    InterfaceC1692600u9C interfaceC1692600u9C = this.LLILZLL;
                    C1694260uBs c1694260uBs = c1691930u872.LIZLLL;
                    AwS604S0100000_25 awS604S0100000_25 = c1691930u872.LJIJJLI;
                    int iLIZIZ = interfaceC1692600u9C.LIZIZ(c1691980u8CLIZLLL.LIZIZ(j, true));
                    awS604S0100000_25.invoke(C1686970u07.LIZIZ(c1694260uBs.LIZ, null, C1680680tpy.LIZ(iLIZIZ, iLIZIZ), 5));
                    if (c1691930u872.LIZ.LIZ.length() > 0) {
                        ((C13FE) c1691930u872.LJIIJ).setValue(EnumC1684410tvz.Cursor);
                    }
                }
            } else {
                this.LLILZIL.LJI(new C1378605aS(j));
            }
        }
        return Unit.LIZ;
    }
}
