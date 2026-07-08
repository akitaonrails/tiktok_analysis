package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.01Nu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallImpressionRepository$request$3", f = "ShopMallImpressionRepository.kt", l = {}, m = "invokeSuspend")
public final class C324801Nu extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super C0NQN>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public C324801Nu(InterfaceC1364105Vn<? super C324801Nu> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShopMallImpressionRepository@c827.request$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShopMallImpressionRepository@c827.request$3");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super C0NQN> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C324801Nu(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
