package X;

import com.ss.android.ugc.aweme.downloader.DownloadTaskImpl;

/* JADX INFO: renamed from: X.0Kxo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.downloader.DownloadHelper", f = "DownloadHelper.kt", l = {19}, m = "submitDownloadTask")
public final class C534540Kxo extends AbstractC23140094w {
    public Object LL;
    public DownloadTaskImpl LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C534530Kxn LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C534540Kxo(C534530Kxn c534530Kxn, InterfaceC1364105Vn<? super C534540Kxo> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c534530Kxn;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DownloadHelper@e65.submitDownloadTask$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZ.LIZ(null, null, null, null, null, this);
        C1C7U.LIZIZ("DownloadHelper@e65.submitDownloadTask$1");
        return objLIZ;
    }
}
