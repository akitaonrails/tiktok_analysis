package X;

import com.ss.android.ugc.aweme.tako.otherpage.share.api.LoadShareMessageResponse;
import com.ss.android.ugc.aweme.tako.otherpage.share.vm.TakoShareVM;
import kotlin.Unit;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: renamed from: X.0gQR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.share.vm.TakoShareVM$requestShareMessageFlow$2$2$1", f = "TakoShareVM.kt", l = {}, m = "invokeSuspend")
public final class C1165130gQR extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super LoadShareMessageResponse>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ TakoShareVM LLILLJJLI;
    public final /* synthetic */ InterfaceC1364105Vn<AbstractC316870CbV<C1164760gPq>> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1165130gQR(TakoShareVM takoShareVM, InterfaceC1364105Vn<? super AbstractC316870CbV<C1164760gPq>> interfaceC1364105Vn, InterfaceC1364105Vn<? super C1165130gQR> interfaceC1364105Vn2) {
        super(3, interfaceC1364105Vn2);
        this.LLILLJJLI = takoShareVM;
        this.LLILLL = interfaceC1364105Vn;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoShareVM@a156.requestShareMessageFlow$2$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LLILLJJLI.setState(new AwS597S0100000_18((Throwable) this.LL, 1055));
        InterfaceC1364105Vn<AbstractC316870CbV<C1164760gPq>> interfaceC1364105Vn = this.LLILLL;
        C316640Cb8 c316640Cb8LIZIZ = C317290CcB.LIZIZ(AbstractC316870CbV.LIZ);
        C189200o6.m2constructorimpl(c316640Cb8LIZIZ);
        interfaceC1364105Vn.resumeWith(c316640Cb8LIZIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoShareVM@a156.requestShareMessageFlow$2$2$1");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super LoadShareMessageResponse> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C1165130gQR c1165130gQR = new C1165130gQR(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c1165130gQR.LL = th;
        return c1165130gQR.invokeSuspend(Unit.LIZ);
    }
}
