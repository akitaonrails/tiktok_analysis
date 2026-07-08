package X;

import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessagesInConversationRequestBody;

/* JADX INFO: renamed from: X.0Y7s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.messageinconversation.RepairFirstPageMsgInConvUseCase", f = "RepairFirstPageMsgInConvUseCase.kt", l = {113, 154, 222}, m = "repair")
public final class C869140Y7s extends AbstractC23140094w {
    public int LL;
    public int LLILLJJLI;
    public long LLILLL;
    public long LLILZ;
    public MessagesInConversationRequestBody LLILZIL;
    public Object LLILZLL;
    public Object LLIZ;
    public C013C LLIZLLLIL;
    public Object LLJ;
    public Object LLJI;
    public Object LLJIJIL;
    public MessageBody LLJILJIL;
    public /* synthetic */ Object LLJILJILJ;
    public final /* synthetic */ C869080Y7m LLJILLL;
    public int LLJJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C869140Y7s(C869080Y7m c869080Y7m, InterfaceC1364105Vn<? super C869140Y7s> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJILLL = c869080Y7m;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("RepairFirstPageMsgInConvUseCase@41a2.repair$2");
        this.LLJILJILJ = obj;
        this.LLJJ |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLJILLL.LIZJ(0, 0L, null, 0L, 0, this);
        C1C7U.LIZIZ("RepairFirstPageMsgInConvUseCase@41a2.repair$2");
        return objLIZJ;
    }
}
