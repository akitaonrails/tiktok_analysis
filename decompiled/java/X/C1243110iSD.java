package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0iSD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1243110iSD extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ Function0<Unit> LL;
    public final /* synthetic */ InterfaceC1685750ty9 LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1243110iSD(int i, int i2, InterfaceC1685750ty9 interfaceC1685750ty9, Function0 function0, boolean z) {
        super(2);
        this.LL = function0;
        this.LLILLJJLI = interfaceC1685750ty9;
        this.LLILLL = z;
        this.LLILZ = i;
        this.LLILZIL = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        Function0<Unit> function0 = this.LL;
        InterfaceC1685750ty9 interfaceC1685750ty9 = this.LLILLJJLI;
        boolean z = this.LLILLL;
        C1665890tS7.LIZ(C341440Da2.LIZ(this.LLILZ | 1), this.LLILZIL, interfaceC1680500tpg, interfaceC1685750ty9, function0, z);
        return Unit.LIZ;
    }
}
