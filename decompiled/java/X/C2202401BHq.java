package X;

/* JADX INFO: renamed from: X.1BHq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.contacts.impl.data.dao.SharePermissionDaoErrorReporter", f = "SharePermissionDaoErrorReporter.kt", l = {42}, m = "getSharePermission")
public final class C2202401BHq extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C2202371BHn LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2202401BHq(C2202371BHn c2202371BHn, InterfaceC1364105Vn<? super C2202401BHq> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c2202371BHn;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SharePermissionDaoErrorReporter@16c.getSharePermission$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIIIIZZ = this.LLILLJJLI.LJIIIIZZ(null, this);
        C1C7U.LIZIZ("SharePermissionDaoErrorReporter@16c.getSharePermission$1");
        return objLJIIIIZZ;
    }
}
