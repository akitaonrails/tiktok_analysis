package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08bJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.vm.UnsubscribeChannelSettingViewModel$updateSubscribe$1$3", f = "UnsubscribeChannelSettingViewModel.kt", l = {}, m = "invokeSuspend")
public final class C2148308bJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC2148408bK LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2148308bJ(InterfaceC2148408bK interfaceC2148408bK, InterfaceC1364105Vn<? super C2148308bJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC2148408bK;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2148308bJ(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UnsubscribeChannelSettingViewModel@c014.updateSubscribe$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.onFailure();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UnsubscribeChannelSettingViewModel@c014.updateSubscribe$1$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
