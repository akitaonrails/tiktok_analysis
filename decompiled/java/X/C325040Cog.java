package X;

import Y.AgS195S0200000_4;
import com.ss.android.ugc.aweme.tako.network.TakoNetworkGateImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cog, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.network.TakoNetworkGateImpl$ensureNetworkObserver$2$2", f = "TakoNetworkGateImpl.kt", l = {78}, m = "invokeSuspend")
public final class C325040Cog extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TakoNetworkGateImpl LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C325040Cog(TakoNetworkGateImpl takoNetworkGateImpl, InterfaceC1364105Vn<? super C325040Cog> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = takoNetworkGateImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C325040Cog(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoNetworkGateImpl@9672.ensureNetworkObserver$2$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C259800zU c259800zU = new C259800zU();
            c259800zU.element = this.LLILLJJLI.LIZIZ.LIZIZ.getValue();
            TakoNetworkGateImpl takoNetworkGateImpl = this.LLILLJJLI;
            AnonymousClass0951 anonymousClass0951 = takoNetworkGateImpl.LIZIZ.LIZJ;
            AgS195S0200000_4 agS195S0200000_4 = new AgS195S0200000_4(takoNetworkGateImpl, c259800zU, 3);
            this.LL = 1;
            if (anonymousClass0951.collect(agS195S0200000_4, this) == objLJFF) {
                C1C7U.LIZIZ("TakoNetworkGateImpl@9672.ensureNetworkObserver$2$2");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
