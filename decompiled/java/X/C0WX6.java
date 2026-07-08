package X;

import com.ss.android.ugc.aweme.main.replace.ReplaceMusicDownloadService;

/* JADX INFO: renamed from: X.0WX6, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.main.replace.ReplaceMusicDownloadService", f = "ReplaceMusicDownloadService.kt", l = {84, 91, 95, 99, 102, 103, 109, 111}, m = "stripAndDownload")
public final class C0WX6 extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public ReplaceMusicDownloadService LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ ReplaceMusicDownloadService LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0WX6(ReplaceMusicDownloadService replaceMusicDownloadService, InterfaceC1364105Vn<? super C0WX6> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = replaceMusicDownloadService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ReplaceMusicDownloadService@2b3f.stripAndDownload$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILZIL.LIZLLL(null, null, this);
        C1C7U.LIZIZ("ReplaceMusicDownloadService@2b3f.stripAndDownload$1");
        return objLIZLLL;
    }
}
