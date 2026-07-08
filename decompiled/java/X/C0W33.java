package X;

/* JADX INFO: renamed from: X.0W33, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.storage.spi.InternalServiceImpl", f = "InternalServiceImpl.kt", l = {21, 21}, m = "saveUserList")
public final class C0W33 extends AbstractC23140094w {
    public EnumC816850W2p LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C0W30 LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0W33(C0W30 c0w30, InterfaceC1364105Vn<? super C0W33> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c0w30;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InternalServiceImpl@a140.saveUserList$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILZ.LIZIZ(null, null, this);
        C1C7U.LIZIZ("InternalServiceImpl@a140.saveUserList$1");
        return objLIZIZ;
    }
}
