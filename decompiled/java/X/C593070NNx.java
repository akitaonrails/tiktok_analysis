package X;

/* JADX INFO: renamed from: X.0NNx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.api.component.idlepreload.CommerceIDLEPreloadModule", f = "CommerceIDLEPreloadModule.kt", l = {284}, m = "pauseTaskProcessing")
public final class C593070NNx extends AbstractC23140094w {
    public C1DEV LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C593080NNy LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C593070NNx(C593080NNy c593080NNy, InterfaceC1364105Vn<? super C593070NNx> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c593080NNy;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommerceIDLEPreloadModule@18dd.pauseTaskProcessing$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(this);
        C1C7U.LIZIZ("CommerceIDLEPreloadModule@18dd.pauseTaskProcessing$1");
        return objLIZ;
    }
}
