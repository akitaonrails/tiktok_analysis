package X;

/* JADX INFO: renamed from: X.0Xo7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.effectcreatormobile.infrastructure.seqmgr.impl.AnimSeqShowMgrImpl", f = "AnimSeqShowMgrImpl.kt", l = {157, 163, 167}, m = "tryLaunchDoAnimLoopJob")
public final class C859770Xo7 extends AbstractC23140094w {
    public C859810XoB LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C859810XoB LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C859770Xo7(C859810XoB c859810XoB, InterfaceC1364105Vn<? super C859770Xo7> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c859810XoB;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AnimSeqShowMgrImpl@5.tryLaunchDoAnimLoopJob$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJI = this.LLILLL.LJI(this);
        C1C7U.LIZIZ("AnimSeqShowMgrImpl@5.tryLaunchDoAnimLoopJob$1");
        return objLJI;
    }
}
