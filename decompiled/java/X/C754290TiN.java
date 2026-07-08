package X;

/* JADX INFO: renamed from: X.0TiN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.video.noise.NoiseSuppressionDataSource", f = "NoiseSuppressionDataSource.kt", l = {30}, m = "notifyShowNoiseCapsule")
public final class C754290TiN extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C768310UBx LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C754290TiN(C768310UBx c768310UBx, InterfaceC1364105Vn<? super C754290TiN> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c768310UBx;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NoiseSuppressionDataSource@4b7a.notifyShowNoiseCapsule$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(this);
        C1C7U.LIZIZ("NoiseSuppressionDataSource@4b7a.notifyShowNoiseCapsule$1");
        return objLIZ;
    }
}
