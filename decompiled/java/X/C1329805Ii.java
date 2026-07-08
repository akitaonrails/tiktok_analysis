package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05Ii, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.analytics.IMConvLoadAnalytics$onPostDMUnreadCount$1$1", f = "IMConvLoadAnalytics.kt", l = {236}, m = "invokeSuspend")
public final class C1329805Ii extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C1329805Ii(InterfaceC1364105Vn<? super C1329805Ii> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1329805Ii(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMConvLoadAnalytics@9541.onPostDMUnreadCount$1$1");
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
            if (AnonymousClass0958.LIZIZ(60000L, this) == objLJFF) {
                C1C7U.LIZIZ("IMConvLoadAnalytics@9541.onPostDMUnreadCount$1$1");
                return objLJFF;
            }
        }
        C885830Yp3.LL.getClass();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C885860Yp6(true, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMConvLoadAnalytics@9541.onPostDMUnreadCount$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1329805Ii(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
