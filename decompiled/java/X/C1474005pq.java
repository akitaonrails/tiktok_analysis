package X;

import android.app.Activity;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05pq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.bridgemethods.EcLiveBillboardDisplayMethod$showErrorToast$1", f = "EcLiveBillboardDisplayMethod.kt", l = {}, m = "invokeSuspend")
public final class C1474005pq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1731300v9c LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1474005pq(C1731300v9c c1731300v9c, InterfaceC1364105Vn<? super C1474005pq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1731300v9c;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1474005pq(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Activity activityLIZ;
        Context context;
        C1C7U.LIZ("EcLiveBillboardDisplayMethod@410c.showErrorToast$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC634840OvC interfaceC634840OvC = this.LL.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
            activityLIZ = C1388190mED.LIZ(context);
        } else {
            activityLIZ = null;
        }
        C1723530ux5.LJFF(activityLIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcLiveBillboardDisplayMethod@410c.showErrorToast$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
