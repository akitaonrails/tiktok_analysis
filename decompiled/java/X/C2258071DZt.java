package X;

/* JADX INFO: renamed from: X.1DZt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.contacts.impl.data.dao.IMUserBaseInfoDaoErrorReporter", f = "IMUserBaseInfoDaoErrorReporter.kt", l = {124}, m = "getAllExpiredUids")
public final class C2258071DZt extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C2258031DZp LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2258071DZt(C2258031DZp c2258031DZp, InterfaceC1364105Vn<? super C2258071DZt> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c2258031DZp;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMUserBaseInfoDaoErrorReporter@2f48.getAllExpiredUids$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIIZILJ = this.LLILLJJLI.LJIIZILJ(0L, this);
        C1C7U.LIZIZ("IMUserBaseInfoDaoErrorReporter@2f48.getAllExpiredUids$1");
        return objLJIIZILJ;
    }
}
