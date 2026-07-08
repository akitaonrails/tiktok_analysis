package X;

import com.ss.android.ugc.aweme.downloader.DownloadTaskImpl;

/* JADX INFO: renamed from: X.0Kxp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.downloader.DownloadTaskImpl", f = "DownloadTask.kt", l = {57, 69}, m = "start")
public final class C534550Kxp extends AbstractC23140094w {
    public DownloadTaskImpl LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ DownloadTaskImpl LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C534550Kxp(DownloadTaskImpl downloadTaskImpl, InterfaceC1364105Vn<? super C534550Kxp> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = downloadTaskImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DownloadTaskImpl@fc86.start$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(this);
        C1C7U.LIZIZ("DownloadTaskImpl@fc86.start$1");
        return objLIZ;
    }
}
