package X;

/* JADX INFO: renamed from: X.0YN5, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.messagegap.resolve.GapMergingResolveMessageInConvGapWorkManager", f = "GapMergingResolveMessageInConvGapWorkManager.kt", l = {171, 183}, m = "processWorkItem")
public final class C0YN5 extends AbstractC23140094w {
    public C0YL9 LL;
    public C0YNC LLILLJJLI;
    public C0Y8T LLILLL;
    public C0YN8 LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C0YN3 LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YN5(C0YN3 c0yn3, InterfaceC1364105Vn<? super C0YN5> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c0yn3;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GapMergingResolveMessageInConvGapWorkManager@3cda.processWorkItem$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJ = this.LLILZLL.LJ(null, this);
        C1C7U.LIZIZ("GapMergingResolveMessageInConvGapWorkManager@3cda.processWorkItem$1");
        return objLJ;
    }
}
