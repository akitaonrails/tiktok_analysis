package X;

/* JADX INFO: renamed from: X.0YRW, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.uploader.sendingstep.UploadStep", f = "UploadStep.kt", l = {40}, m = "execute")
public final class C0YRW extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0YRV LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YRW(C0YRV c0yrv, InterfaceC1364105Vn<? super C0YRW> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0yrv;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UploadStep@dca9.execute$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, this);
        C1C7U.LIZIZ("UploadStep@dca9.execute$1");
        return objLIZ;
    }
}
