package X;

/* JADX INFO: renamed from: X.1D7T, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
@C09DV(c = "com.ss.android.ugc.aweme.composer.task.BaseComposeAsyncTask", f = "BaseComposeAsyncTask.kt", l = {15}, m = "run$suspendImpl")
public final class C1D7T<PARAM, RESULT> extends AbstractC23140094w {
    public C1D7S LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1D7S<PARAM, RESULT> LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1D7T(C1D7S<PARAM, RESULT> c1d7s, InterfaceC1364105Vn<? super C1D7T> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1d7s;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseComposeAsyncTask@d794.run$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = C1D7S.LIZ(this.LLILLL, null, this);
        C1C7U.LIZIZ("BaseComposeAsyncTask@d794.run$1");
        return objLIZ;
    }
}
