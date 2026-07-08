package X;

import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.singleactivity.ChatRootFragment;
import com.ss.android.ugc.aweme.im.sdk.common.controller.block.BlockUserController;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06aA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.singleactivity.ChatRootFragment$onBlockUserSuccessEvent$1$1", f = "ChatRootFragment.kt", l = {461}, m = "invokeSuspend")
public final class C1631606aA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ChatRootFragment LLILLJJLI;
    public final /* synthetic */ C19EG LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1631606aA(ChatRootFragment chatRootFragment, C19EG c19eg, InterfaceC1364105Vn<? super C1631606aA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = chatRootFragment;
        this.LLILLL = c19eg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1631606aA(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        IMUser imUser;
        String conversationId;
        C1C7U.LIZ("ChatRootFragment@2e5a.onBlockUserSuccessEvent$1$1");
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
            EnterChatParams enterChatParamsZS = this.LLILLJJLI.zS();
            if (enterChatParamsZS != null && (imUser = enterChatParamsZS.getImUser()) != null) {
                C19EG c19eg = this.LLILLL;
                SessionInfo sessionInfo = this.LLILLJJLI.LLJJJ;
                if (sessionInfo != null) {
                    conversationId = sessionInfo.getConversationId();
                } else {
                    conversationId = null;
                }
                BlockUserController blockUserController = new BlockUserController(c19eg, imUser, "chat", "report_flow", null, null, null, null, conversationId, null, 752);
                this.LL = 1;
                if (blockUserController.LJIIIZ(this) == objLJFF) {
                    C1C7U.LIZIZ("ChatRootFragment@2e5a.onBlockUserSuccessEvent$1$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChatRootFragment@2e5a.onBlockUserSuccessEvent$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
