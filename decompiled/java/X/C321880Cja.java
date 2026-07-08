package X;

/* JADX INFO: renamed from: X.0Cja, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.base.internal.core.MessageJob", f = "MessageJob.kt", l = {29}, m = "tryRun")
public final class C321880Cja extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AbstractC321890Cjb LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C321880Cja(AbstractC321890Cjb abstractC321890Cjb, InterfaceC1364105Vn<? super C321880Cja> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = abstractC321890Cjb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageJob@dcd4.tryRun$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(this);
        C1C7U.LIZIZ("MessageJob@dcd4.tryRun$1");
        return objLIZIZ;
    }
}
