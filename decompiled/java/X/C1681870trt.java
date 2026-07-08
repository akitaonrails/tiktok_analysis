package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0trt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1681870trt extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ InterfaceC1685750ty9 LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1681870trt(int i, int i2, InterfaceC1685750ty9 interfaceC1685750ty9, Function0 function0, Function0 function02, boolean z, boolean z2) {
        super(2);
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = function0;
        this.LLILZ = function02;
        this.LLILZIL = interfaceC1685750ty9;
        this.LLILZLL = i;
        this.LLIZ = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        boolean z = this.LL;
        boolean z2 = this.LLILLJJLI;
        Function0<Unit> function0 = this.LLILLL;
        Function0<Unit> function02 = this.LLILZ;
        InterfaceC1685750ty9 interfaceC1685750ty9 = this.LLILZIL;
        C1681580trQ.LIZIZ(C341440Da2.LIZ(this.LLILZLL | 1), this.LLIZ, interfaceC1680500tpg, interfaceC1685750ty9, function0, function02, z, z2);
        return Unit.LIZ;
    }
}
