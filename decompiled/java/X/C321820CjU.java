package X;

/* JADX INFO: renamed from: X.0CjU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.internal.core.MessageJob", f = "MessageJob.kt", l = {29}, m = "tryRun")
public final class C321820CjU extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AbstractC321800CjS LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C321820CjU(AbstractC321800CjS abstractC321800CjS, InterfaceC1364105Vn<? super C321820CjU> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = abstractC321800CjS;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageJob@6548.tryRun$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(this);
        C1C7U.LIZIZ("MessageJob@6548.tryRun$1");
        return objLIZIZ;
    }
}
