package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseCommonChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.prompts.api.freqcontrol.IPromptUnifiedFrequencyController;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.068F, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseCommonChatNoticeViewModel$onSendMessageEvent$1", f = "BaseCommonChatNoticeViewModel.kt", l = {}, m = "invokeSuspend")
public final class C068F extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BaseCommonChatNoticeViewModel LL;
    public final /* synthetic */ C06SA LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C068F(BaseCommonChatNoticeViewModel baseCommonChatNoticeViewModel, C06SA c06sa, InterfaceC1364105Vn<? super C068F> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = baseCommonChatNoticeViewModel;
        this.LLILLJJLI = c06sa;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C068F(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        C1C7U.LIZ("BaseCommonChatNoticeViewModel@63e8.onSendMessageEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SessionInfo sessionInfoRQ2 = this.LL.RQ2();
        if (sessionInfoRQ2 == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("BaseCommonChatNoticeViewModel@63e8.onSendMessageEvent$1");
            return unit;
        }
        int msgStatus = this.LLILLJJLI.LIZJ.getMsgStatus();
        if (msgStatus != 1) {
            if (msgStatus != 2) {
                if (msgStatus == 3) {
                    BaseCommonChatNoticeViewModel baseCommonChatNoticeViewModel = this.LL;
                    C869590Y9l c869590Y9l = this.LLILLJJLI.LIZJ;
                    baseCommonChatNoticeViewModel.getClass();
                    C23250099c.LIZLLL(ViewModelKt.getViewModelScope(baseCommonChatNoticeViewModel), null, null, new C06AF(c869590Y9l, baseCommonChatNoticeViewModel, null), 3);
                }
            } else {
                if (!C461060I6e.LIZJ(this.LLILLJJLI.LIZJ) && this.LLILLJJLI.LIZJ.getMsgStatus() != 3) {
                    z = false;
                } else {
                    z = true;
                }
                if (this.LL.LL.LIZJ(C06NH.BOTTOM) == EnumC1596306Mv.CHAT_REQUEST_START) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z && z2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (C1665706ff.LIZJ.LJIIIIZZ() && !z3) {
                    this.LL.QQ2(this.LLILLJJLI.LIZJ);
                }
                this.LL.yQ2(new C068E(null), false);
            }
        } else if (!C1665706ff.LIZJ.LJIIIIZZ()) {
            this.LL.QQ2(this.LLILLJJLI.LIZJ);
        }
        C1419505h3.LIZ.getClass();
        if (C1419505h3.LIZLLL && this.LLILLJJLI.LIZJ.getMsgStatus() != 1) {
            ((IPromptUnifiedFrequencyController) this.LL.LLILZLL.getValue()).LJI(sessionInfoRQ2.getUuid(), EnumC15599068v.COMMON_CHAT_NOTICE_SEND_MESSAGE_EVENT);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BaseCommonChatNoticeViewModel@63e8.onSendMessageEvent$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
