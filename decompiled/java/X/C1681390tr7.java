package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tr7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1681390tr7 extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ List<C1147620fyC> LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ Function1<Long, Unit> LLILZIL;
    public final /* synthetic */ InterfaceC1685750ty9 LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1681390tr7(boolean z, List<C1147620fyC> list, long j, Function0<Unit> function0, Function1<? super Long, Unit> function1, InterfaceC1685750ty9 interfaceC1685750ty9, int i, int i2) {
        super(2);
        this.LL = z;
        this.LLILLJJLI = list;
        this.LLILLL = j;
        this.LLILZ = function0;
        this.LLILZIL = function1;
        this.LLILZLL = interfaceC1685750ty9;
        this.LLIZ = i;
        this.LLIZLLLIL = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1681380tr6.LJ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLIZ | 1), this.LLIZLLLIL);
        return Unit.LIZ;
    }
}
