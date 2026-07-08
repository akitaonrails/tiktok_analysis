package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0k1N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1303350k1N extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ C1303440k1W LL;
    public final /* synthetic */ InterfaceC1685750ty9 LLILLJJLI;
    public final /* synthetic */ Function2<String, Integer, Unit> LLILLL;
    public final /* synthetic */ Function2<String, Integer, Unit> LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1303350k1N(C1303440k1W c1303440k1W, InterfaceC1685750ty9 interfaceC1685750ty9, Function2<? super String, ? super Integer, Unit> function2, Function2<? super String, ? super Integer, Unit> function22, Function0<Unit> function0, Function0<Unit> function02, int i) {
        super(2);
        this.LL = c1303440k1W;
        this.LLILLJJLI = interfaceC1685750ty9;
        this.LLILLL = function2;
        this.LLILZ = function22;
        this.LLILZIL = function0;
        this.LLILZLL = function02;
        this.LLIZ = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1667120tU6.LJ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLIZ | 1));
        return Unit.LIZ;
    }
}
