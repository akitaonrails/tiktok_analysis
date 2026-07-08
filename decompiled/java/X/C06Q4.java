package X;

import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMChatRoomAnalytics;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Q4, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base.CommonMessageListConfigKt$reportPushMsgConfig$1$onDestroy$3", f = "CommonMessageListConfig.kt", l = {}, m = "invokeSuspend")
public final class C06Q4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ List<C869590Y9l> LLILLJJLI;
    public final /* synthetic */ SessionInfo LLILLL;
    public final /* synthetic */ C013C LLILZ;
    public final /* synthetic */ C013C LLILZIL;
    public final /* synthetic */ long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C06Q4(long j, List<? extends C869590Y9l> list, SessionInfo sessionInfo, C013C c013c, C013C c013c2, long j2, InterfaceC1364105Vn<? super C06Q4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = j;
        this.LLILLJJLI = list;
        this.LLILLL = sessionInfo;
        this.LLILZ = c013c;
        this.LLILZIL = c013c2;
        this.LLILZLL = j2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06Q4(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLIZIZ;
        C0Z7V c0z7vLJIILJJIL;
        C1C7U.LIZ("CommonMessageListConfigKt@2fb4.reportPushMsgConfig$1$onDestroy$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean zLJIILJJIL = C0YNY.LIZ(InterfaceC874680YTa.LIZ).LJIILJJIL(this.LL);
        IMChatRoomAnalytics iMChatRoomAnalytics = IMChatRoomAnalytics.LIZIZ;
        long j = this.LL;
        int size = this.LLILLJJLI.size();
        SessionInfo sessionInfo = this.LLILLL;
        boolean z = this.LLILZ.element;
        boolean z2 = this.LLILZIL.element;
        long j2 = this.LLILZLL;
        C0I0B.LJFF.LIZIZ();
        C06Q6 c06q6 = C06Q6.LIZ;
        iMChatRoomAnalytics.getClass();
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("msg_id", String.valueOf(sessionInfo.getMsgIdFromPush()));
        c830490Whz.put("enter_from", sessionInfo.getEnterFromForMob());
        c830490Whz.put("chat_type", iMChatRoomAnalytics.LIZJ(sessionInfo));
        c830490Whz.put("conversation_id", sessionInfo.getConversationId());
        c830490Whz.put("msg_list_size", String.valueOf(size));
        c830490Whz.put("exist_in_local_db", String.valueOf(zLJIILJJIL));
        c830490Whz.put("finish_load_local", String.valueOf(z));
        c830490Whz.put("receive_new_msg", String.valueOf(z2));
        c830490Whz.put("duration", String.valueOf(j2));
        IIMBusinessChatService.LIZ.getClass();
        IIMBusinessChatService iIMBusinessChatService = C1668706g9.LIZIZ;
        if (iIMBusinessChatService != null && (c0z7vLJIILJJIL = iIMBusinessChatService.LJIILJJIL()) != null) {
            strLIZIZ = c0z7vLJIILJJIL.LIZIZ(C461720I8s.LIZJ());
        } else {
            strLIZIZ = null;
        }
        c830490Whz.put("account_type", strLIZIZ);
        int iLIZ = iMChatRoomAnalytics.LIZ(sessionInfo);
        C06Q5 c06q5LJIIIZ = C06Q6.LJIIIZ(iLIZ, String.valueOf(j));
        c830490Whz.put("get_by_user_status", String.valueOf(c06q5LJIIIZ.LIZ));
        c830490Whz.put("inbox_type", String.valueOf(iLIZ));
        c830490Whz.put("get_by_user_status_error_code", String.valueOf(c06q5LJIIIZ.LIZIZ));
        C20684815ws.LJIILLIIL("dm_dev_no_specific_message", c830490Whz);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommonMessageListConfigKt@2fb4.reportPushMsgConfig$1$onDestroy$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
