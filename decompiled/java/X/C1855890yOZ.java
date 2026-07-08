package X;

import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.tako.botpage.cards.answer.chatreply.TakoAnswerChatReplyAssem;
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0yOZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.cards.answer.chatreply.TakoAnswerChatReplyAssem$onRetryClick$1$replyMessage$1", f = "TakoAnswerChatReplyCell.kt", l = {}, m = "invokeSuspend")
public final class C1855890yOZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Message>, Object> {
    public final /* synthetic */ TakoAnswerChatReplyAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1855890yOZ(TakoAnswerChatReplyAssem takoAnswerChatReplyAssem, InterfaceC1364105Vn<? super C1855890yOZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = takoAnswerChatReplyAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1855890yOZ(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C326880Cre c326880Cre;
        Message message;
        String str;
        C1C7U.LIZ("TakoAnswerChatReplyAssem@8cf1.onRetryClick$1$replyMessage$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        TakoAnswerChatReplyAssem takoAnswerChatReplyAssem = this.LL;
        C1857030yQP c1857030yQP = takoAnswerChatReplyAssem.LLLZIIL;
        Message messageLJJIJIIJI = null;
        if (c1857030yQP != null && (c326880Cre = c1857030yQP.LLJJIJI) != null && (message = c326880Cre.LLILLL) != null && (str = message.replyUuid) != null) {
            AssemVMLazy assemVMLazy = takoAnswerChatReplyAssem.LLLZI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = TakoAnswerChatReplyAssem.LLLZL;
            C1863380yae c1863380yae = ((MessageViewModel) assemVMLazy.getValue()).LLJJJJ;
            if (c1863380yae != null) {
                messageLJJIJIIJI = c1863380yae.LJIILL.LJJIJIIJI(str);
            }
        }
        C1C7U.LIZIZ("TakoAnswerChatReplyAssem@8cf1.onRetryClick$1$replyMessage$1");
        return messageLJJIJIIJI;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Message> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
