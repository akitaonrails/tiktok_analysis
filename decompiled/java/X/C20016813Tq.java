package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.13Tq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.manager.EcProductAddShowManager$logButtonClick$1", f = "EcProductAddShowManager.kt", l = {}, m = "invokeSuspend")
public final class C20016813Tq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Long LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20016813Tq(Long l, InterfaceC1364105Vn<? super C20016813Tq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20016813Tq(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcProductAddShowManager@5747.logButtonClick$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C20017213Tu c20017213Tu = C20017013Ts.LJFF;
        if (c20017213Tu != null) {
            C20017213Tu.LIZ(c20017213Tu.getWritableDatabase(), C20017213Tu.LJFF(this.LL.longValue(), System.currentTimeMillis(), true));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcProductAddShowManager@5747.logButtonClick$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
