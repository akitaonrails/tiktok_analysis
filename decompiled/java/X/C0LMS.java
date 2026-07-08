package X;

import Y.AgS199S0200000_8;

/* JADX INFO: renamed from: X.0LMS, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.CreationDownloadTask$run$2", f = "CreationDownloadTask.kt", l = {84}, m = "emit")
public final class C0LMS extends AbstractC23140094w {
    public C0LMR LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AgS199S0200000_8<T> LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0LMS(AgS199S0200000_8<? super T> agS199S0200000_8, InterfaceC1364105Vn<? super C0LMS> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS199S0200000_8;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreationDownloadTask@d5c2.run$2$emit$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ$0 = this.LLILLL.LIZ$0(null, this);
        C1C7U.LIZIZ("CreationDownloadTask@d5c2.run$2$emit$1");
        return objLIZ$0;
    }
}
