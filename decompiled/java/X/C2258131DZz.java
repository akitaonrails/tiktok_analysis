package X;

/* JADX INFO: renamed from: X.1DZz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.contacts.impl.data.dao.IMUserBaseInfoDaoErrorReporter", f = "IMUserBaseInfoDaoErrorReporter.kt", l = {73}, m = "unblockUser")
public final class C2258131DZz extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C2258031DZp LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2258131DZz(C2258031DZp c2258031DZp, InterfaceC1364105Vn<? super C2258131DZz> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c2258031DZp;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMUserBaseInfoDaoErrorReporter@2f48.unblockUser$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIIIIZZ = this.LLILLJJLI.LJIIIIZZ(0L, this);
        C1C7U.LIZIZ("IMUserBaseInfoDaoErrorReporter@2f48.unblockUser$1");
        return objLJIIIIZZ;
    }
}
