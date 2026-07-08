package X;

/* JADX INFO: renamed from: X.0LL1, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.MultiImageUploadTask", f = "MultiImageUploadTask.kt", l = {120, 131}, m = "beginTask")
public final class C0LL1 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C541350LKz LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LL1(C541350LKz c541350LKz, InterfaceC1364105Vn<? super C0LL1> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c541350LKz;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MultiImageUploadTask@f00e.beginTask$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJJJJL = this.LLILLJJLI.LJJJJJL(null, this);
        C1C7U.LIZIZ("MultiImageUploadTask@f00e.beginTask$1");
        return objLJJJJJL;
    }
}
