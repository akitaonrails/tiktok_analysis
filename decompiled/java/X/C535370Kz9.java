package X;

/* JADX INFO: renamed from: X.0Kz9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.newframework.task.DraftQueryTask", f = "DraftQueryTask.kt", l = {48}, m = "run")
public final class C535370Kz9 extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0L43 LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C535370Kz9(C0L43 c0l43, InterfaceC1364105Vn<? super C535370Kz9> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0l43;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftQueryTask@a333.run$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJJJJL = this.LLILLL.LJFF(null, this);
        C1C7U.LIZIZ("DraftQueryTask@a333.run$1");
        return objLJJJJJL;
    }
}
