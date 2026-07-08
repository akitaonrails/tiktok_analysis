package X;

/* JADX INFO: renamed from: X.0Luh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.net.AIGCTaskNetwork", f = "AIGCTaskNetwork.kt", l = {59}, m = "cancelAGICTask")
public final class C558090Luh extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C558070Luf LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C558090Luh(C558070Luf c558070Luf, InterfaceC1364105Vn<? super C558090Luh> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c558070Luf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCTaskNetwork@cf9f.cancelAGICTask$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, this);
        C1C7U.LIZIZ("AIGCTaskNetwork@cf9f.cancelAGICTask$1");
        return objLIZ;
    }
}
