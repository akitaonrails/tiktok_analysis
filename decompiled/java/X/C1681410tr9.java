package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tr9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1681410tr9 extends C09AY implements InterfaceC1631620sYq<InterfaceC1671930tbr, InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ List<C1147620fyC> LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ Function1<Long, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1681410tr9(List<C1147620fyC> list, long j, Function0<Unit> function0, Function1<? super Long, Unit> function1) {
        super(3);
        this.LL = list;
        this.LLILLJJLI = j;
        this.LLILLL = function0;
        this.LLILZ = function1;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(InterfaceC1671930tbr interfaceC1671930tbr, InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1681380tr6.LJFF(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1680500tpg, 0);
        return Unit.LIZ;
    }
}
