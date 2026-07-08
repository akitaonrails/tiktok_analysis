package X;

/* JADX INFO: renamed from: X.09p5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.optimize.UploadPhotoPreprocessManager", f = "UpLoadPhotoPreprocessManager.kt", l = {229}, m = "waitAllPreProcessJob")
public final class C2488509p5 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C2488309p3 LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2488509p5(C2488309p3 c2488309p3, InterfaceC1364105Vn<? super C2488509p5> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c2488309p3;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UploadPhotoPreprocessManager@b7a4.waitAllPreProcessJob$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLJJLI.LIZLLL(null, null, null, this);
        C1C7U.LIZIZ("UploadPhotoPreprocessManager@b7a4.waitAllPreProcessJob$1");
        return objLIZLLL;
    }
}
