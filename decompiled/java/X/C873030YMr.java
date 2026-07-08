package X;

import com.bytedance.im.core.proto.MessageBody;

/* JADX INFO: renamed from: X.0YMr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.getmsgbyconvrange.GetMsgByConvWithRangeUseCase", f = "GetMsgByConvWithRangeUseCase.kt", l = {236}, m = "saveMessages")
public final class C873030YMr extends AbstractC23140094w {
    public int LL;
    public Object LLILLJJLI;
    public C873100YMy LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public MessageBody LLILZLL;
    public Object LLIZ;
    public long LLIZLLLIL;
    public /* synthetic */ Object LLJ;
    public final /* synthetic */ C873000YMo LLJI;
    public int LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C873030YMr(C873000YMo c873000YMo, InterfaceC1364105Vn<? super C873030YMr> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJI = c873000YMo;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GetMsgByConvWithRangeUseCase@9cf0.saveMessages$1");
        this.LLJ = obj;
        this.LLJIJIL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLJI.LIZJ(0, null, 0L, null, null, this);
        C1C7U.LIZIZ("GetMsgByConvWithRangeUseCase@9cf0.saveMessages$1");
        return objLIZJ;
    }
}
