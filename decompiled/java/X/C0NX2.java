package X;

/* JADX INFO: renamed from: X.0NX2, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.activity.status.sdk.core.ActivityStatusDataSource", f = "ActivityStatusDataSource.kt", l = {308, 311}, m = "fetchActivityStatus")
public final class C0NX2 extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C0NX1 LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NX2(C0NX1 c0nx1, InterfaceC1364105Vn<? super C0NX2> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = c0nx1;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ActivityStatusDataSource@11bf.fetchActivityStatus$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLIZ.LIZLLL(null, null, this);
        C1C7U.LIZIZ("ActivityStatusDataSource@11bf.fetchActivityStatus$1");
        return objLIZLLL;
    }
}
