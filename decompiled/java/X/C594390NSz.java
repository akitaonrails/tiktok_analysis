package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0NSz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.utils.BillboardPCDisplayHelper$cancelBanner$2", f = "BillboardPCDisplayHelper.kt", l = {257}, m = "invokeSuspend")
public final class C594390NSz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C594390NSz(InterfaceC1364105Vn<? super C594390NSz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C594390NSz(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BillboardPCDisplayHelper@3037.cancelBanner$2");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                C1C7U.LIZIZ("BillboardPCDisplayHelper@3037.cancelBanner$2");
                return objLJFF;
            }
        }
        C1440005kM.LIZ(new C7835034f(true));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BillboardPCDisplayHelper@3037.cancelBanner$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C594390NSz(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
