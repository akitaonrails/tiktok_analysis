package X;

/* JADX INFO: renamed from: X.0LSj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.TemplateFL2VTask", f = "TemplateFL2VTask.kt", l = {53, 54, 61, 65, 66, 67, 68, 69}, m = "run")
public final class C543270LSj extends AbstractC23140094w {
    public C09JG LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C543190LSb LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C543270LSj(C543190LSb c543190LSb, InterfaceC1364105Vn<? super C543270LSj> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c543190LSb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplateFL2VTask@409a.run$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILLL.LJFF(null, this);
        C1C7U.LIZIZ("TemplateFL2VTask@409a.run$1");
        return objLJFF;
    }
}
