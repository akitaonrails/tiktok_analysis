package X;

import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.compliance.protection.timelock.ui.assem.WhiteNoiseAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS562S0100000_18;
import njp.a;

/* JADX INFO: renamed from: X.0gVe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.protection.timelock.ui.assem.WhiteNoiseAssem$setTimer$3", f = "WhiteNoiseAssem.kt", l = {419}, m = "invokeSuspend")
public final class C1168360gVe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ WhiteNoiseAssem LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1168360gVe(WhiteNoiseAssem whiteNoiseAssem, long j, InterfaceC1364105Vn<? super C1168360gVe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = whiteNoiseAssem;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1168360gVe(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("WhiteNoiseAssem@deab.setTimer$3");
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
            this.LLILLJJLI.LLJJIJIIJIL = System.currentTimeMillis() + this.LLILLL;
            new AwS562S0100000_18(this.LLILLJJLI, 159);
            long j = this.LLILLL;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("WhiteNoiseAssem@deab.setTimer$3");
                return objLJFF;
            }
        }
        SmartRouter.buildRoute(this.LLILLJJLI.getContext(), "//main").open();
        this.LLILLJJLI.Ho("auto_end");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("WhiteNoiseAssem@deab.setTimer$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
