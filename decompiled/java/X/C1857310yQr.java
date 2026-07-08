package X;

import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.tako.botpage.components.replyquote.TakoReplyQuoteAssem;
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0yQr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.components.replyquote.TakoReplyQuoteAssem$onBind$1$replyMessage$1", f = "TakoReplyQuoteAssem.kt", l = {}, m = "invokeSuspend")
public final class C1857310yQr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Message>, Object> {
    public final /* synthetic */ TakoReplyQuoteAssem LL;
    public final /* synthetic */ InterfaceC1857320yQs LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1857310yQr(TakoReplyQuoteAssem takoReplyQuoteAssem, InterfaceC1857320yQs interfaceC1857320yQs, InterfaceC1364105Vn<? super C1857310yQr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = takoReplyQuoteAssem;
        this.LLILLJJLI = interfaceC1857320yQs;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1857310yQr(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Message messageLJJIJIIJI;
        C1C7U.LIZ("TakoReplyQuoteAssem@ec37.onBind$1$replyMessage$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AssemVMLazy assemVMLazy = this.LL.LLJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = TakoReplyQuoteAssem.LLJLIL;
        MessageViewModel messageViewModel = (MessageViewModel) assemVMLazy.getValue();
        String strLJJLIIIJJI = this.LLILLJJLI.LJJLIIIJJI();
        C1863380yae c1863380yae = messageViewModel.LLJJJJ;
        if (c1863380yae != null) {
            messageLJJIJIIJI = c1863380yae.LJIILL.LJJIJIIJI(strLJJLIIIJJI);
        } else {
            messageLJJIJIIJI = null;
        }
        C1C7U.LIZIZ("TakoReplyQuoteAssem@ec37.onBind$1$replyMessage$1");
        return messageLJJIJIIJI;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Message> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
