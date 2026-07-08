package X;

/* JADX INFO: renamed from: X.01qQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.fullwidthhorizontal.IconPrefetchManager", f = "IconPrefetchManager.kt", l = {93}, m = "prefetchOne")
public final class C458401qQ extends AbstractC23140094w {
    public AbstractC1321260kUG LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0HWB LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C458401qQ(C0HWB c0hwb, InterfaceC1364105Vn<? super C458401qQ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0hwb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IconPrefetchManager@1448.prefetchOne$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(null, this);
        C1C7U.LIZIZ("IconPrefetchManager@1448.prefetchOne$1");
        return objLIZIZ;
    }
}
