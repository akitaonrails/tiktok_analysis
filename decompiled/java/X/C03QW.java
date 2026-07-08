package X;

/* JADX INFO: renamed from: X.03QW, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.preview.preload.strategy.PartialPreloadStrategy", f = "PartialPreloadStrategy.kt", l = {39}, m = "preload")
public final class C03QW extends AbstractC23140094w {
    public C259800zU LL;
    public C259800zU LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C03QP LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03QW(C03QP c03qp, InterfaceC1364105Vn<? super C03QW> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c03qp;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PartialPreloadStrategy@420c.preload$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZ = LIZ(null, null, null, null, null, null, null, null, null, this);
        C1C7U.LIZIZ("PartialPreloadStrategy@420c.preload$1");
        return objLIZ;
    }
}
