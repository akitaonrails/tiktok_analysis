package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0ts3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1681970ts3 extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;
    public final /* synthetic */ InterfaceC1685750ty9 LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1681970ts3(int i, int i2, InterfaceC1685750ty9 interfaceC1685750ty9, String str, Function0 function0) {
        super(2);
        this.LL = str;
        this.LLILLJJLI = function0;
        this.LLILLL = interfaceC1685750ty9;
        this.LLILZ = i;
        this.LLILZIL = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        String str = this.LL;
        Function0<Unit> function0 = this.LLILLJJLI;
        InterfaceC1685750ty9 interfaceC1685750ty9 = this.LLILLL;
        C1681530trL.LJIIIIZZ(C341440Da2.LIZ(this.LLILZ | 1), this.LLILZIL, interfaceC1680500tpg, interfaceC1685750ty9, str, function0);
        return Unit.LIZ;
    }
}
