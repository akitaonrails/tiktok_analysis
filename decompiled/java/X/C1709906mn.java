package X;

import com.ss.android.ugc.aweme.im.chatroom.api.IIMChatAnalytics;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.live.reminder.TurnOnGoLiveBannerGuideCardAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06mn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.reminder.TurnOnGoLiveBannerGuideCardAssem$onViewCreated$6", f = "TurnOnGoLiveNotificationGuideCardProtocol.kt", l = {}, m = "invokeSuspend")
public final class C1709906mn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TurnOnGoLiveBannerGuideCardAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1709906mn(TurnOnGoLiveBannerGuideCardAssem turnOnGoLiveBannerGuideCardAssem, InterfaceC1364105Vn<? super C1709906mn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = turnOnGoLiveBannerGuideCardAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1709906mn(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String conversationId;
        C1C7U.LIZ("TurnOnGoLiveBannerGuideCardAssem@db82.onViewCreated$6");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IIMChatAnalytics.LIZ.getClass();
        IIMChatAnalytics iIMChatAnalyticsLIZ = C1705506m5.LIZ();
        if (iIMChatAnalyticsLIZ != null) {
            SessionInfo sessionInfo = (SessionInfo) this.LL.LLJL.getValue();
            if (sessionInfo != null) {
                conversationId = sessionInfo.getConversationId();
            } else {
                conversationId = null;
            }
            iIMChatAnalyticsLIZ.LJII(conversationId, C0I0B.LJFF.LIZIZ());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TurnOnGoLiveBannerGuideCardAssem@db82.onViewCreated$6");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
