package X;

import com.ss.android.ugc.aweme.qrcode.CopyLinkChannelWithBPEA;
import com.ss.android.ugc.aweme.share.qrcode.util.ShareLinkServiceImpl;

/* JADX INFO: renamed from: X.0ltP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.qrcode.util.ShareLinkServiceImpl", f = "ShareLinkServiceImpl.kt", l = {120}, m = "copyPersonalLinkWithToast")
public final class C1375290ltP extends AbstractC23140094w {
    public C19EG LL;
    public CopyLinkChannelWithBPEA LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ ShareLinkServiceImpl LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1375290ltP(ShareLinkServiceImpl shareLinkServiceImpl, InterfaceC1364105Vn<? super C1375290ltP> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = shareLinkServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShareLinkServiceImpl@e626.copyPersonalLinkWithToast$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZIL.LIZ(null, null, null, this);
        C1C7U.LIZIZ("ShareLinkServiceImpl@e626.copyPersonalLinkWithToast$1");
        return objLIZ;
    }
}
