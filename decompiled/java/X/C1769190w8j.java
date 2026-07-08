package X;

/* JADX INFO: renamed from: X.0w8j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.customdot.task.uitask.base.ShopTabUITaskBase", f = "ShopTabUITaskBase.kt", l = {134, 118}, m = "suspendWithUICallBack$suspendImpl")
public final class C1769190w8j extends AbstractC23140094w {
    public InterfaceC2217291BqJ LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ AbstractC1769070w8X LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1769190w8j(AbstractC1769070w8X abstractC1769070w8X, InterfaceC1364105Vn<? super C1769190w8j> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = abstractC1769070w8X;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShopTabUITaskBase@5925.suspendWithUICallBack$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJIIIIZZ = AbstractC1769070w8X.LJIIIIZZ(this.LLILZ, null, null, this);
        C1C7U.LIZIZ("ShopTabUITaskBase@5925.suspendWithUICallBack$1");
        return objLJIIIIZZ;
    }
}
