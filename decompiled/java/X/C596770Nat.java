package X;

import com.ss.android.ugc.aweme.tako.ccl.impl.TakoClientAgentServiceImpl;
import com.ss.android.ugc.aweme.tako.ccl.model.api.AgentCommandRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nat, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.ccl.impl.TakoClientAgentServiceImpl$onCommandReceived$2$2$1", f = "TakoClientAgentServiceImpl.kt", l = {231}, m = "invokeSuspend")
public final class C596770Nat extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Throwable LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ InterfaceC596800Naw LLILZ;
    public final /* synthetic */ AgentCommandRequest LLILZIL;
    public final /* synthetic */ TakoClientAgentServiceImpl LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C596770Nat(Throwable th, long j, InterfaceC596800Naw interfaceC596800Naw, AgentCommandRequest agentCommandRequest, TakoClientAgentServiceImpl takoClientAgentServiceImpl, InterfaceC1364105Vn<? super C596770Nat> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = th;
        this.LLILLL = j;
        this.LLILZ = interfaceC596800Naw;
        this.LLILZIL = agentCommandRequest;
        this.LLILZLL = takoClientAgentServiceImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C596770Nat(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoClientAgentServiceImpl@3dc6.onCommandReceived$2$2$1");
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
            C596820Nay c596820Nay = new C596820Nay(this.LLILZIL, new C596720Nao(this.LLILLJJLI), "unknown_error", C1302080jzK.LIZJ(this.LLILLL), this.LLILZ.Kf().getChannel(), null);
            C2252331DDr c2252331DDr = this.LLILZLL.LIZLLL;
            this.LL = 1;
            if (c2252331DDr.emit(c596820Nay, this) == objLJFF) {
                C1C7U.LIZIZ("TakoClientAgentServiceImpl@3dc6.onCommandReceived$2$2$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoClientAgentServiceImpl@3dc6.onCommandReceived$2$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
