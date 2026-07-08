package X;

/* JADX INFO: renamed from: X.0NLz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.performance.h5.downloader.MinisResourceDownloadTask", f = "MinisResourceDownloadTask.kt", l = {40}, m = "execute")
public final class C592570NLz extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C612900O2e LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C592570NLz(C612900O2e c612900O2e, InterfaceC1364105Vn<? super C592570NLz> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c612900O2e;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MinisResourceDownloadTask@d81c.execute$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(this);
        C1C7U.LIZIZ("MinisResourceDownloadTask@d81c.execute$1");
        return objLIZ;
    }
}
