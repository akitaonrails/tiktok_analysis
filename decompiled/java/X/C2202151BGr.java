package X;

/* JADX INFO: renamed from: X.1BGr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.contacts.impl.data.dao.IMUserBizInfoDaoErrorReporter", f = "IMUserBizInfoDaoErrorReporter.kt", l = {58}, m = "delete")
public final class C2202151BGr extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C2202141BGq LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2202151BGr(C2202141BGq c2202141BGq, InterfaceC1364105Vn<? super C2202151BGr> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c2202141BGq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMUserBizInfoDaoErrorReporter@e50e.delete$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(null, this);
        C1C7U.LIZIZ("IMUserBizInfoDaoErrorReporter@e50e.delete$1");
        return objLIZIZ;
    }
}
