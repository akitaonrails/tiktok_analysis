package X;

/* JADX INFO: renamed from: X.0s42, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.series.common.serviceimpl.SeriesPlayNextImpl", f = "SeriesPlayNextImpl.kt", l = {100}, m = "loadVideoList")
public final class C1612520s42 extends AbstractC23140094w {
    public long LL;
    public long LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C1612470s3x LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1612520s42(C1612470s3x c1612470s3x, InterfaceC1364105Vn<? super C1612520s42> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c1612470s3x;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeriesPlayNextImpl@3d7d.loadVideoList$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLoadVideoList = this.LLILZLL.loadVideoList(null, 0L, this);
        C1C7U.LIZIZ("SeriesPlayNextImpl@3d7d.loadVideoList$1");
        return objLoadVideoList;
    }
}
