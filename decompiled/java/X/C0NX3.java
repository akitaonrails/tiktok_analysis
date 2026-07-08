package X;

/* JADX INFO: renamed from: X.0NX3, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.activity.status.sdk.core.ActivityStatusDataSource", f = "ActivityStatusDataSource.kt", l = {358, 361}, m = "updateActivityStatusFromCompensation")
public final class C0NX3 extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C0NX1 LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NX3(C0NX1 c0nx1, InterfaceC1364105Vn<? super C0NX3> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c0nx1;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ActivityStatusDataSource@11bf.updateActivityStatusFromCompensation$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJIIJ = this.LLILZLL.LJIIJ(null, null, this);
        C1C7U.LIZIZ("ActivityStatusDataSource@11bf.updateActivityStatusFromCompensation$1");
        return objLJIIJ;
    }
}
