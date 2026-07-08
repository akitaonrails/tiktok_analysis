package X;

/* JADX INFO: renamed from: X.0NYw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.activity.status.sdk.core.ActivityStatusInterceptorMgr", f = "ActivityStatusInterceptorMgr.kt", l = {22}, m = "interceptUser$im_sdk_activity_status_release")
public final class C595920NYw extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C595910NYv LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C595920NYw(C595910NYv c595910NYv, InterfaceC1364105Vn<? super C595920NYw> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c595910NYv;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ActivityStatusInterceptorMgr@b197.interceptUser$2");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(null, this);
        C1C7U.LIZIZ("ActivityStatusInterceptorMgr@b197.interceptUser$2");
        return objLIZIZ;
    }
}
