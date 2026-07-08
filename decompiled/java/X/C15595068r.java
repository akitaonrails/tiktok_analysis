package X;

import com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseCommonChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.chatroom.api.repo.IChatRequestRepository;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeFlowEngine;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.068r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseCommonChatNoticeViewModel$reshowBannersAfterInputHidden$1$1", f = "BaseCommonChatNoticeViewModel.kt", l = {370, 372}, m = "invokeSuspend")
public final class C15595068r extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SessionInfo LLILLJJLI;
    public final /* synthetic */ BaseCommonChatNoticeViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15595068r(SessionInfo sessionInfo, BaseCommonChatNoticeViewModel baseCommonChatNoticeViewModel, InterfaceC1364105Vn<? super C15595068r> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = sessionInfo;
        this.LLILLL = baseCommonChatNoticeViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15595068r(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseCommonChatNoticeViewModel@63e8.reshowBannersAfterInputHidden$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("BaseCommonChatNoticeViewModel@63e8.reshowBannersAfterInputHidden$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(50L, this) == objLJFF) {
                C1C7U.LIZIZ("BaseCommonChatNoticeViewModel@63e8.reshowBannersAfterInputHidden$1$1");
                return objLJFF;
            }
        }
        IChatRequestRepository.LIZ.getClass();
        IChatRequestRepository iChatRequestRepositoryLIZ = C15596068s.LIZ();
        if (iChatRequestRepositoryLIZ != null) {
            if (((AnonymousClass0693) iChatRequestRepositoryLIZ).LIZ(this.LLILLJJLI.getConversationId())) {
                IChatNoticeFlowEngine iChatNoticeFlowEngine = this.LLILLL.LL;
                C06OO task = EnumC1596306Mv.CHAT_REQUEST_START.toTask();
                this.LL = 2;
                if (iChatNoticeFlowEngine.LJIILJJIL(task, this) == objLJFF) {
                    C1C7U.LIZIZ("BaseCommonChatNoticeViewModel@63e8.reshowBannersAfterInputHidden$1$1");
                    return objLJFF;
                }
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BaseCommonChatNoticeViewModel@63e8.reshowBannersAfterInputHidden$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
