package X;

import com.ss.android.ugc.aweme.services.ttuploader.IExternalUploaderService;
import v7.o;

/* JADX INFO: renamed from: X.0WqW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.web.jsbridge.UploadALogUtil", f = "UploadALogUtil.kt", l = {344}, m = "fetchUploadAuthKey")
public final class C835780WqW extends AbstractC23140094w {
    public Object LL;
    public o LLILLJJLI;
    public IExternalUploaderService LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C835770WqV LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C835780WqW(C835770WqV c835770WqV, InterfaceC1364105Vn<? super C835780WqW> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c835770WqV;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UploadALogUtil@5934.fetchUploadAuthKey$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILZIL.LIZLLL(null, null, null, this);
        C1C7U.LIZIZ("UploadALogUtil@5934.fetchUploadAuthKey$1");
        return objLIZLLL;
    }
}
