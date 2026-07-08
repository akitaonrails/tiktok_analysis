package X;

import com.bytedance.android.live.iap.service.IapService;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KS2, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.revenue.level.impl.superfan.payment.impl.resusbcribe.FansResubscribeStrategy$getGpProductInfo$preCheckResult$1", f = "FansResubscribeStrategy.kt", l = {169}, m = "invokeSuspend")
public final class C0KS2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C517630KRt>, Object> {
    public int LL;
    public final /* synthetic */ C0KS3 LLILLJJLI;
    public final /* synthetic */ C517690KRz LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KS2(C0KS3 c0ks3, C517690KRz c517690KRz, InterfaceC1364105Vn<? super C0KS2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0ks3;
        this.LLILLL = c517690KRz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0KS2(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZ = obj;
        C1C7U.LIZ("FansResubscribeStrategy@14ed.getGpProductInfo$preCheckResult$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            C0KS3 c0ks3 = this.LLILLJJLI;
            final C517690KRz c517690KRz = this.LLILLL;
            this.LL = 1;
            c0ks3.getClass();
            final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            ((InterfaceC1791930wjP) C1161920gLG.LIZJ(IapService.class)).LIZJ(new InterfaceC518100KTo() { // from class: X.0KS1
                @Override // X.InterfaceC518100KTo
                public final void LIZ(Map<String, C517630KRt> map) {
                    C517630KRt c517630KRt = (C517630KRt) C13LP.LJJJJZ(map.values());
                    if (c517630KRt.LIZ == C0KM0.PRE_CHECK_SUCCESS) {
                        if (c517630KRt.LIZJ.contains(C0KQD.RESIGN_UP)) {
                            c517690KRz.LJI.LIZ();
                            InterfaceC1364105Vn<C517630KRt> interfaceC1364105Vn = c23260099m;
                            C189200o6.m2constructorimpl(c517630KRt);
                            interfaceC1364105Vn.resumeWith(c517630KRt);
                            return;
                        }
                        c517690KRz.LJI.LIZIZ();
                        InterfaceC1364105Vn<C517630KRt> interfaceC1364105Vn2 = c23260099m;
                        C189200o6.m2constructorimpl(c517630KRt);
                        interfaceC1364105Vn2.resumeWith(c517630KRt);
                        return;
                    }
                    c517690KRz.LJI.LIZIZ();
                    InterfaceC1364105Vn<C517630KRt> interfaceC1364105Vn3 = c23260099m;
                    C189200o6.m2constructorimpl(c517630KRt);
                    interfaceC1364105Vn3.resumeWith(c517630KRt);
                }
            }, new C1789940wgC(c517690KRz.LJII, "80XR2DK73101", null, null, c517690KRz.LIZ, 44));
            objLIZ = c23260099m.LIZ();
            if (objLIZ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("FansResubscribeStrategy@14ed.getGpProductInfo$preCheckResult$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("FansResubscribeStrategy@14ed.getGpProductInfo$preCheckResult$1");
        return objLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C517630KRt> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
