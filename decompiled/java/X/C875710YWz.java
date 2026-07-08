package X;

import com.bytedance.tts.pigeon.paas.detailpage.component.impl.PigeonConversationComponent;

/* JADX INFO: renamed from: X.0YWz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.tts.pigeon.paas.detailpage.component.impl.PigeonConversationComponent", f = "PigeonConversationComponent.kt", l = {51}, m = "fetchConversation")
public final class C875710YWz extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ PigeonConversationComponent LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C875710YWz(PigeonConversationComponent pigeonConversationComponent, InterfaceC1364105Vn<? super C875710YWz> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = pigeonConversationComponent;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PigeonConversationComponent@542a.fetchConversation$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJLIIIJJI = this.LLILLJJLI.LJJLIIIJJI(this);
        C1C7U.LIZIZ("PigeonConversationComponent@542a.fetchConversation$1");
        return objLJJLIIIJJI;
    }
}
