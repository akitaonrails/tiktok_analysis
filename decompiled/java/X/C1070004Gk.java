package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.04Gk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.coupon.PdpExpansionRecorder$reportExpansion$1", f = "PdpExpansionRecorder.kt", l = {40}, m = "invokeSuspend")
public final class C1070004Gk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1069004Ga LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1070004Gk(C1069004Ga c1069004Ga, InterfaceC1364105Vn<? super C1070004Gk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1069004Ga;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1070004Gk(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.04Gp] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PdpExpansionRecorder@9f0b.reportExpansion$1");
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
            if (this.LLILLJJLI.LIZJ != null) {
                C1069904Gj c1069904Gj = InterfaceC1069804Gi.LIZ;
                ?? r2 = new Object() { // from class: X.04Gp
                };
                this.LL = 1;
                c1069904Gj.getClass();
                if (((InterfaceC1069804Gi) C1069904Gj.LIZIZ.create(InterfaceC1069804Gi.class)).LIZ(r2, this) == objLJFF) {
                    C1C7U.LIZIZ("PdpExpansionRecorder@9f0b.reportExpansion$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpExpansionRecorder@9f0b.reportExpansion$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
