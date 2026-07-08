package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0uBn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1694210uBn extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ C1694160uBi LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;
    public final /* synthetic */ Function1<C1685690ty3, Unit> LLILLL;
    public final /* synthetic */ InterfaceC1685750ty9 LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;
    public final /* synthetic */ Function2<InterfaceC1680500tpg, Integer, Unit> LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1694210uBn(C1694160uBi c1694160uBi, Function0<Unit> function0, Function1<? super C1685690ty3, Unit> function1, InterfaceC1685750ty9 interfaceC1685750ty9, boolean z, Function0<Unit> function02, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, int i, int i2) {
        super(2);
        this.LL = c1694160uBi;
        this.LLILLJJLI = function0;
        this.LLILLL = function1;
        this.LLILZ = interfaceC1685750ty9;
        this.LLILZIL = z;
        this.LLILZLL = function02;
        this.LLIZ = function2;
        this.LLIZLLLIL = i;
        this.LLJ = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1694200uBm.LIZIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1680500tpg, C341440Da2.LIZ(this.LLIZLLLIL | 1), this.LLJ);
        return Unit.LIZ;
    }
}
