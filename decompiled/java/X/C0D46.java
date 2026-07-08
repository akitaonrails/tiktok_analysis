package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D46, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.preload.PdpPreloadScheduler$launchSkuTask$1$1", f = "PdpPreloadScheduler.kt", l = {}, m = "invokeSuspend")
public final class C0D46 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0D43 LL;
    public final /* synthetic */ C0D47 LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D46(C0D43 c0d43, C0D47 c0d47, String str, InterfaceC1364105Vn<? super C0D46> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0d43;
        this.LLILLJJLI = c0d47;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0D46(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.09AY, kotlin.jvm.functions.Function2] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PdpPreloadScheduler@8a57.launchSkuTask$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ?? r2 = this.LL.LJIIJJI;
        if (r2 != 0) {
            r2.invoke(this.LLILLJJLI.LIZ, this.LLILLL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpPreloadScheduler@8a57.launchSkuTask$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
