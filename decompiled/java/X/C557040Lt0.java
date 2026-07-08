package X;

/* JADX INFO: renamed from: X.0Lt0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.lifecycle.RefCountImpl", f = "RefCountImpl.kt", l = {69}, m = "onInitialize")
public final class C557040Lt0 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C557010Lsx LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C557040Lt0(C557010Lsx c557010Lsx, InterfaceC1364105Vn<? super C557040Lt0> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c557010Lsx;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RefCountImpl@866e.onInitialize$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJ = this.LLILLJJLI.LJ(this);
        C1C7U.LIZIZ("RefCountImpl@866e.onInitialize$1");
        return objLJ;
    }
}
