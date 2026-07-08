package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05zx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.smartreply.feedback.FeedbackPanelOpenHelper$notifyMsgDislikeFeedback$1$2", f = "FeedbackPanelOpenHelper.kt", l = {}, m = "invokeSuspend")
public final class C1536705zx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AnonymousClass0604 LL;
    public final /* synthetic */ C869590Y9l LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1536705zx(AnonymousClass0604 anonymousClass0604, C869590Y9l c869590Y9l, String str, InterfaceC1364105Vn<? super C1536705zx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = anonymousClass0604;
        this.LLILLJJLI = c869590Y9l;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1536705zx(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FeedbackPanelOpenHelper@f331.notifyMsgDislikeFeedback$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AnonymousClass0602.LIZ(this.LL, String.valueOf(this.LLILLJJLI.getMsgId()), this.LLILLJJLI.getConversationId(), this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedbackPanelOpenHelper@f331.notifyMsgDislikeFeedback$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
