package X;

import Y.AgS289S0100000_8;
import com.ss.android.ugc.aweme.theater.service.AITheaterProfileService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ccj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.theater.creation.component.AITheaterCameoControlComponent$tryObserveCameoStatus$1", f = "AITheaterCameoControlComponent.kt", l = {214}, m = "invokeSuspend")
public final class C317630Ccj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C549180LgK LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C317630Ccj(C549180LgK c549180LgK, InterfaceC1364105Vn<? super C317630Ccj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c549180LgK;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C317630Ccj(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC550750Lir interfaceC550750LirG9;
        InterfaceC346201Wa<InterfaceC549230LgP> interfaceC346201WaLJIIJJI;
        C1C7U.LIZ("AITheaterCameoControlComponent@4a33.tryObserveCameoStatus$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            AITheaterProfileService aITheaterProfileServiceH2 = this.LLILLJJLI.H2();
            if (aITheaterProfileServiceH2 != null && (interfaceC550750LirG9 = aITheaterProfileServiceH2.g9()) != null && (interfaceC346201WaLJIIJJI = interfaceC550750LirG9.LJIIJJI()) != null) {
                AgS289S0100000_8 agS289S0100000_8 = new AgS289S0100000_8(this.LLILLJJLI, 29);
                this.LL = 1;
                if (interfaceC346201WaLJIIJJI.collect(agS289S0100000_8, this) == objLJFF) {
                    C1C7U.LIZIZ("AITheaterCameoControlComponent@4a33.tryObserveCameoStatus$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AITheaterCameoControlComponent@4a33.tryObserveCameoStatus$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
