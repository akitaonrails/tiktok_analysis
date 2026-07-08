package X;

/* JADX INFO: renamed from: X.0LrW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.plugin.AIGCWorkflowEventHub", f = "AIGCWorkflowEventHub.kt", l = {531, 537, 541}, m = "close")
public final class C556120LrW extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C556080LrS LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C556120LrW(C556080LrS c556080LrS, InterfaceC1364105Vn<? super C556120LrW> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c556080LrS;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCWorkflowEventHub@14b7.close$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(this);
        C1C7U.LIZIZ("AIGCWorkflowEventHub@14b7.close$1");
        return objLIZIZ;
    }
}
