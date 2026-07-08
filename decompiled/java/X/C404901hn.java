package X;

/* JADX INFO: renamed from: X.01hn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.performance.metrics.autoadaptive.tasks.DispatchDataTask", f = "DispatchDataTask.kt", l = {27}, m = "run")
public final class C404901hn extends AbstractC23140094w {
    public C923800a9C LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C404801hm LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C404901hn(C404801hm c404801hm, InterfaceC1364105Vn<? super C404901hn> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c404801hm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DispatchDataTask@2b2a.run$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILZ.LIZIZ(this);
        C1C7U.LIZIZ("DispatchDataTask@2b2a.run$1");
        return objLIZIZ;
    }
}
