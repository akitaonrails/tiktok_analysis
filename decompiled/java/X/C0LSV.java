package X;

/* JADX INFO: renamed from: X.0LSV, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.GeneralI2VQuotaTask", f = "GeneralI2VQuotaTask.kt", l = {70, 82}, m = "beginTask")
public final class C0LSV extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0LST LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LSV(C0LST c0lst, InterfaceC1364105Vn<? super C0LSV> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0lst;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GeneralI2VQuotaTask@92be.beginTask$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJJJJL = this.LLILLJJLI.LJJJJJL(null, this);
        C1C7U.LIZIZ("GeneralI2VQuotaTask@92be.beginTask$1");
        return objLJJJJJL;
    }
}
