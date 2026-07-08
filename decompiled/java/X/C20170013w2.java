package X;

/* JADX INFO: renamed from: X.13w2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.task.Task", f = "Task.kt", l = {30}, m = "run$suspendImpl")
public final class C20170013w2<P> extends AbstractC23140094w {
    public C20169913w1 LL;
    public C20169813w0 LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C20169913w1<P> LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20170013w2(C20169913w1<P> c20169913w1, InterfaceC1364105Vn<? super C20170013w2> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c20169913w1;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("Task@67dd.run$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJFF = C20169913w1.LJFF(this.LLILZ, null, this);
        C1C7U.LIZIZ("Task@67dd.run$1");
        return objLJFF;
    }
}
