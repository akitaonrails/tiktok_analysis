package X;

/* JADX INFO: renamed from: X.0ZMi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.activestatus.impl.core.update.ActivityStatusFetchImpl", f = "ActivityStatusFetchImpl.kt", l = {27}, m = "fetch")
public final class C898420ZMi extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C898370ZMd LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C898420ZMi(C898370ZMd c898370ZMd, InterfaceC1364105Vn<? super C898420ZMi> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c898370ZMd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ActivityStatusFetchImpl@b2e6.fetch$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(false, null, false, this);
        C1C7U.LIZIZ("ActivityStatusFetchImpl@b2e6.fetch$1");
        return objLIZ;
    }
}
