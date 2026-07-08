package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05qY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.banner.protocol.DMPushV2InboxBannerAssem$sendDMAck$1", f = "DMPushV2InboxBannerAssem.kt", l = {129}, m = "invokeSuspend")
public final class C1478405qY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C1478405qY(InterfaceC1364105Vn<? super C1478405qY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1478405qY(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DMPushV2InboxBannerAssem@9284.sendDMAck$1");
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
            InterfaceC315700CZc imPopupService = C1336205Ku.LIZ(false).getImPopupService();
            this.LL = 1;
            if (imPopupService.LIZIZ(1, "dm_turn_on_notification_bar_v2", "inbox", null, this) == objLJFF) {
                C1C7U.LIZIZ("DMPushV2InboxBannerAssem@9284.sendDMAck$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DMPushV2InboxBannerAssem@9284.sendDMAck$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1478405qY(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
