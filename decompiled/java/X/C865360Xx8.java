package X;

/* JADX INFO: renamed from: X.0Xx8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.client.conversation.DefaultConversationSettingsManager", f = "DefaultConversationSettingsManager.kt", l = {116, 106}, m = "batchChangeMute")
public final class C865360Xx8 extends AbstractC23140094w {
    public boolean LL;
    public InterfaceC865260Xwy LLILLJJLI;
    public Object LLILLL;
    public long LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C865340Xx6 LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C865360Xx8(C865340Xx6 c865340Xx6, InterfaceC1364105Vn<? super C865360Xx8> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c865340Xx6;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("DefaultConversationSettingsManager@6c8c.batchChangeMute$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILZLL.LIZJ(null, false, null, this);
        C1C7U.LIZIZ("DefaultConversationSettingsManager@6c8c.batchChangeMute$1");
        return objLIZJ;
    }
}
