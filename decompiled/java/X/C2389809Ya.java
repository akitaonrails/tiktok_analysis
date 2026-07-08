package X;

/* JADX INFO: renamed from: X.09Ya, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.performance.MinisPreloadWorkFlow", f = "MinisPreloadWorkFlow.kt", l = {57}, m = "runOneGroup")
public final class C2389809Ya extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C09YZ LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2389809Ya(C09YZ c09yz, InterfaceC1364105Vn<? super C2389809Ya> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c09yz;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MinisPreloadWorkFlow@4198.runOneGroup$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, null, this);
        C1C7U.LIZIZ("MinisPreloadWorkFlow@4198.runOneGroup$1");
        return objLIZ;
    }
}
