package X;

import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.handler.AwemePhotoShareAbilityHandler;

/* JADX INFO: renamed from: X.0lrL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.improve.handler.AwemePhotoShareAbilityHandler", f = "AwemePhotoShareAbilityHandler.kt", l = {301}, m = "getShareLink")
public final class C1374010lrL extends AbstractC23140094w {
    public BaseSharePackage LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AwemePhotoShareAbilityHandler LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1374010lrL(AwemePhotoShareAbilityHandler awemePhotoShareAbilityHandler, InterfaceC1364105Vn<? super C1374010lrL> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = awemePhotoShareAbilityHandler;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AwemePhotoShareAbilityHandler@5c98.getShareLink$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIIIZ = this.LLILLL.LJIIIZ(null, null, this);
        C1C7U.LIZIZ("AwemePhotoShareAbilityHandler@5c98.getShareLink$1");
        return objLJIIIZ;
    }
}
