package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.viewmodel.SingleChatNoticeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06bY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.viewmodel.SingleChatNoticeViewModel$streaksPushSystemNotificationsOn$1", f = "SingleChatNoticeViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1640206bY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SingleChatNoticeViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1640206bY(SingleChatNoticeViewModel singleChatNoticeViewModel, InterfaceC1364105Vn<? super C1640206bY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = singleChatNoticeViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1640206bY(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strGQ2;
        C1C7U.LIZ("SingleChatNoticeViewModel@3e8d.streaksPushSystemNotificationsOn$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C19296410eQ c19296410eQ = C19296410eQ.LIZIZ;
        if (C19328310jZ.LIZIZ.LIZJ()) {
            strGQ2 = this.LL.GQ2("im_push_preview_v2", "dm_streaks_push");
        } else {
            strGQ2 = this.LL.GQ2("im_push", "im_push_preview_v2", "dm_streaks_push");
        }
        c19296410eQ.batchSetPushSettingItems(strGQ2, 1, false, null, null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SingleChatNoticeViewModel@3e8d.streaksPushSystemNotificationsOn$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
