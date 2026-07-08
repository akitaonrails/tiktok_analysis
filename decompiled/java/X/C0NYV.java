package X;

/* JADX INFO: renamed from: X.0NYV, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.activity.status.sdk.client.ActivityStatusClientImpl", f = "ActivityStatusClientImpl.kt", l = {363}, m = "notifyDataUpdate")
public final class C0NYV extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C0NYK LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NYV(C0NYK c0nyk, InterfaceC1364105Vn<? super C0NYV> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c0nyk;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ActivityStatusClientImpl@16b7.notifyDataUpdate$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJIILL = this.LLILZ.LJIILL(null, this);
        C1C7U.LIZIZ("ActivityStatusClientImpl@16b7.notifyDataUpdate$1");
        return objLJIILL;
    }
}
