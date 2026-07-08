package X;

import com.ss.android.ugc.aweme.longvideonotification.LongVideoNotificationApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08ik, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.longvideonotification.LongVideoPopupNotificationManager$requestLongVideoPopupDiplayedValue$1$1", f = "LongVideoPopupNotificationManager.kt", l = {}, m = "invokeSuspend")
public final class C2194408ik extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LongVideoNotificationApi.PopupDisplayResponse LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2194408ik(LongVideoNotificationApi.PopupDisplayResponse popupDisplayResponse, InterfaceC1364105Vn<? super C2194408ik> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = popupDisplayResponse;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2194408ik(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LongVideoPopupNotificationManager@441a.requestLongVideoPopupDiplayedValue$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean z = C523640KgE.LIZ;
        C523640KgE.LIZ = this.LL.needToDisplay;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LongVideoPopupNotificationManager@441a.requestLongVideoPopupDiplayedValue$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
