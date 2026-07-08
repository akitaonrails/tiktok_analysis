package X;

/* JADX INFO: renamed from: X.03QU, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.preview.preload.strategy.FullPreloadStrategy", f = "FullPreloadStrategy.kt", l = {39}, m = "preload")
public final class C03QU extends AbstractC23140094w {
    public C259800zU LL;
    public C259800zU LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C03QO LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03QU(C03QO c03qo, InterfaceC1364105Vn<? super C03QU> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c03qo;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FullPreloadStrategy@adce.preload$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZ = LIZ(null, null, null, null, null, null, null, null, null, this);
        C1C7U.LIZIZ("FullPreloadStrategy@adce.preload$1");
        return objLIZ;
    }
}
