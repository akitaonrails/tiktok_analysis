package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0ars, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C951500ars extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ List<Integer> LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Function1<Integer, Unit> LLILLL;
    public final /* synthetic */ InterfaceC1685750ty9 LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C951500ars(List<Integer> list, int i, Function1<? super Integer, Unit> function1, InterfaceC1685750ty9 interfaceC1685750ty9, int i2, int i3) {
        super(2);
        this.LL = list;
        this.LLILLJJLI = i;
        this.LLILLL = function1;
        this.LLILZ = interfaceC1685750ty9;
        this.LLILZIL = i2;
        this.LLILZLL = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1666590tTF.LIZIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILZIL | 1), this.LLILZLL);
        return Unit.LIZ;
    }
}
