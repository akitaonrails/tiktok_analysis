package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0trA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1681420trA extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ List<C1147620fyC> LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ Function1<Long, Unit> LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1681420trA(List<C1147620fyC> list, long j, Function0<Unit> function0, Function1<? super Long, Unit> function1, int i) {
        super(2);
        this.LL = list;
        this.LLILLJJLI = j;
        this.LLILLL = function0;
        this.LLILZ = function1;
        this.LLILZIL = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1681380tr6.LJFF(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILZIL | 1));
        return Unit.LIZ;
    }
}
