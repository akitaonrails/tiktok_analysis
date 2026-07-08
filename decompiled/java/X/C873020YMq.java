package X;

import com.bytedance.im.core.proto.MessageRange;
import com.bytedance.im.core.proto.MessagesInConversationWithRangeResponseBody;

/* JADX INFO: renamed from: X.0YMq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.getmsgbyconvrange.GetMsgByConvWithRangeUseCase", f = "GetMsgByConvWithRangeUseCase.kt", l = {110, 133}, m = "pull")
public final class C873020YMq extends AbstractC23140094w {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public Object LLILZ;
    public MessageRange LLILZIL;
    public EnumC873090YMx LLILZLL;
    public C873100YMy LLIZ;
    public Object LLIZLLLIL;
    public Object LLJ;
    public Object LLJI;
    public Object LLJIJIL;
    public Object LLJILJIL;
    public MessagesInConversationWithRangeResponseBody LLJILJILJ;
    public long LLJILLL;
    public /* synthetic */ Object LLJJ;
    public final /* synthetic */ C873000YMo LLJJI;
    public int LLJJIII;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C873020YMq(C873000YMo c873000YMo, InterfaceC1364105Vn<? super C873020YMq> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJJI = c873000YMo;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GetMsgByConvWithRangeUseCase@9cf0.pull$1");
        this.LLJJ = obj;
        this.LLJJIII |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLJJI.LIZIZ(0, null, 0L, 0, null, null, this);
        C1C7U.LIZIZ("GetMsgByConvWithRangeUseCase@9cf0.pull$1");
        return objLIZIZ;
    }
}
