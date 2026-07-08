package X;

import com.ss.android.ugc.aweme.share.qrcode.util.ShareLinkServiceImpl;

/* JADX INFO: renamed from: X.0ltO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.qrcode.util.ShareLinkServiceImpl", f = "ShareLinkServiceImpl.kt", l = {280, 292}, m = "shareProfileQrToInstagramStory")
public final class C1375280ltO extends AbstractC23140094w {
    public InterfaceC1369790lkX LL;
    public C19EG LLILLJJLI;
    public DialogC1389620mGW LLILLL;
    public Object LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ ShareLinkServiceImpl LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1375280ltO(ShareLinkServiceImpl shareLinkServiceImpl, InterfaceC1364105Vn<? super C1375280ltO> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = shareLinkServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("ShareLinkServiceImpl@e626.shareProfileQrToInstagramStory$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJI = this.LLILZLL.LJI(null, null, this);
        C1C7U.LIZIZ("ShareLinkServiceImpl@e626.shareProfileQrToInstagramStory$1");
        return objLJI;
    }
}
