package X;

/* JADX INFO: renamed from: X.0wWK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.creative.camera.core.scheduler.IMCameraCoreScheduler", f = "IMCameraCoreScheduler.kt", l = {122}, m = "getDeferred")
public final class C1783820wWK extends AbstractC23140094w {
    public C0N6K LL;
    public C1DEV LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C1783850wWN LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1783820wWK(C1783850wWN c1783850wWN, InterfaceC1364105Vn<? super C1783820wWK> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c1783850wWN;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMCameraCoreScheduler@e2e2.getDeferred$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZ.LIZ(null, this);
        C1C7U.LIZIZ("IMCameraCoreScheduler@e2e2.getDeferred$1");
        return objLIZ;
    }
}
