package X;

import com.bytedance.tts.pigeon.paas.detailpage.component.impl.PigeonConversationComponent;

/* JADX INFO: renamed from: X.0YWy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.tts.pigeon.paas.detailpage.component.impl.PigeonConversationComponent", f = "PigeonConversationComponent.kt", l = {43, 44}, m = "ensureConversation")
public final class C875700YWy extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ PigeonConversationComponent LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C875700YWy(PigeonConversationComponent pigeonConversationComponent, InterfaceC1364105Vn<? super C875700YWy> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = pigeonConversationComponent;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PigeonConversationComponent@542a.ensureConversation$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJL = this.LLILLL.LJJL(null, this);
        C1C7U.LIZIZ("PigeonConversationComponent@542a.ensureConversation$1");
        return objLJJL;
    }
}
