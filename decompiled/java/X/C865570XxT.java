package X;

/* JADX INFO: renamed from: X.0XxT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.client.conversation.DefaultConversationMemberManager", f = "DefaultConversationMemberManager.kt", l = {149, 111}, m = "batchUpdateMemberInfo")
public final class C865570XxT extends AbstractC23140094w {
    public boolean LL;
    public InterfaceC865260Xwy LLILLJJLI;
    public Object LLILLL;
    public long LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C865530XxP LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C865570XxT(C865530XxP c865530XxP, InterfaceC1364105Vn<? super C865570XxT> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c865530XxP;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("DefaultConversationMemberManager@28e6.batchUpdateMemberInfo$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJI = this.LLILZLL.LJI(0, null, null, null, this);
        C1C7U.LIZIZ("DefaultConversationMemberManager@28e6.batchUpdateMemberInfo$1");
        return objLJI;
    }
}
