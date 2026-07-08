package X;

import Y.AgS103S1100000_14;

/* JADX INFO: renamed from: X.0YX1, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.tts.pigeon.paas.detailpage.component.impl.PigeonConversationComponent$certainConversationFlow$$inlined$map$1$2", f = "PigeonConversationComponent.kt", l = {223}, m = "emit")
public final class C0YX1 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS103S1100000_14 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YX1(AgS103S1100000_14 agS103S1100000_14, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS103S1100000_14;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PigeonConversationComponent@542a.certainConversationFlow$$inlined$map$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("PigeonConversationComponent@542a.certainConversationFlow$$inlined$map$1$2$1");
        return objEmit;
    }
}
