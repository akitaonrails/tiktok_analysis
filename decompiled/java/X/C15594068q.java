package X;

import com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseCommonChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.model.IMFromMessageTips;
import com.ss.android.ugc.aweme.im.common.model.IMNoticeMsgStruct;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.IChatNoticeFlowEngine;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.068q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseCommonChatNoticeViewModel$reshowBannersAfterInputHidden$1", f = "BaseCommonChatNoticeViewModel.kt", l = {382}, m = "invokeSuspend")
public final class C15594068q extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ SessionInfo LLILLL;
    public final /* synthetic */ BaseCommonChatNoticeViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15594068q(SessionInfo sessionInfo, BaseCommonChatNoticeViewModel baseCommonChatNoticeViewModel, InterfaceC1364105Vn<? super C15594068q> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = sessionInfo;
        this.LLILZ = baseCommonChatNoticeViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C15594068q c15594068q = new C15594068q(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c15594068q.LLILLJJLI = obj;
        return c15594068q;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseCommonChatNoticeViewModel@63e8.reshowBannersAfterInputHidden$1");
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
            C23250099c.LIZLLL((InterfaceC497601wk) this.LLILLJJLI, null, null, new C15595068r(this.LLILLL, this.LLILZ, null), 3);
            if (this.LLILLL.getShowSafeConversationAfterKeyboardDismiss()) {
                this.LLILLL.setShowSafeConversationAfterKeyboardDismiss(false);
                IMNoticeMsgStruct iMNoticeMsgStruct = new IMNoticeMsgStruct(C2286608xc.LJ(1026), "high_risk_predator_report_notice", new IMFromMessageTips(null, null, C2097608Jq.LJ()), null);
                IChatNoticeFlowEngine iChatNoticeFlowEngine = this.LLILZ.LL;
                C06AH c06ah = new C06AH(EnumC1596306Mv.SAFE_CONVERSATION, iMNoticeMsgStruct);
                this.LL = 1;
                if (iChatNoticeFlowEngine.LJIILJJIL(c06ah, this) == objLJFF) {
                    C1C7U.LIZIZ("BaseCommonChatNoticeViewModel@63e8.reshowBannersAfterInputHidden$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseCommonChatNoticeViewModel@63e8.reshowBannersAfterInputHidden$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
