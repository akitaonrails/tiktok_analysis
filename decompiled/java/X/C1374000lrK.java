package X;

import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.handler.AwemePhotoDownloadShareAbilityHandler;

/* JADX INFO: renamed from: X.0lrK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.improve.handler.AwemePhotoDownloadShareAbilityHandler", f = "AwemePhotoDownloadShareAbilityHandler.kt", l = {177}, m = "getShareLink")
public final class C1374000lrK extends AbstractC23140094w {
    public BaseSharePackage LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AwemePhotoDownloadShareAbilityHandler LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1374000lrK(AwemePhotoDownloadShareAbilityHandler awemePhotoDownloadShareAbilityHandler, InterfaceC1364105Vn<? super C1374000lrK> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = awemePhotoDownloadShareAbilityHandler;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AwemePhotoDownloadShareAbilityHandler@72e3.getShareLink$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIIIZ = this.LLILLL.LJIIIZ(null, null, this);
        C1C7U.LIZIZ("AwemePhotoDownloadShareAbilityHandler@72e3.getShareLink$1");
        return objLJIIIZ;
    }
}
