package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0TR5, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TR5 extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ Function1<String, Unit> LLILLJJLI;
    public final /* synthetic */ Function1<Boolean, Unit> LLILLL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0TR5(boolean z, Function1<? super String, Unit> function1, Function1<? super Boolean, Unit> function12, Function1<? super Boolean, Unit> function13, Function0<Unit> function0, Function1<? super Boolean, Unit> function14, int i) {
        super(2);
        this.LL = z;
        this.LLILLJJLI = function1;
        this.LLILLL = function12;
        this.LLILZ = function13;
        this.LLILZIL = function0;
        this.LLILZLL = function14;
        this.LLIZ = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1667550tUn.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLIZ | 1));
        return Unit.LIZ;
    }
}
