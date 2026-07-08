package X;

import com.bytedance.im.core.proto.ConversationInfoV2;

/* JADX INFO: renamed from: X.0Y1P, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.getconversationinfo.GetConversationInfoListWithoutMsgUseCase", f = "GetConversationInfoListWithoutMsgUseCase.kt", l = {77, 105, 125}, m = "getAndSave")
public final class C0Y1P extends AbstractC23140094w {
    public int LL;
    public boolean LLILLJJLI;
    public C259800zU LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public ConversationInfoV2 LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ C0Y1O LLIZLLLIL;
    public int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Y1P(C0Y1O c0y1o, InterfaceC1364105Vn<? super C0Y1P> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZLLLIL = c0y1o;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("GetConversationInfoListWithoutMsgUseCase@511d.getAndSave$1");
        this.LLIZ = obj;
        this.LLJ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLIZLLLIL.LIZ(0, null, this);
        C1C7U.LIZIZ("GetConversationInfoListWithoutMsgUseCase@511d.getAndSave$1");
        return objLIZ;
    }
}
