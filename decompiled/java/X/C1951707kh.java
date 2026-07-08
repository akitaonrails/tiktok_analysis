package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkExService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.07kh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1951707kh implements IDeepLinkExService {
    public static final C1951707kh LIZIZ = new C1951707kh();
    public final /* synthetic */ IDeepLinkExService LIZ;

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkExService
    public final Intent LIZ(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
        return this.LIZ.LIZ(activity, uri, str, str2, str3, z);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkExService
    public final AbstractC19263910Yb LIZIZ(C1962707mT c1962707mT) {
        return this.LIZ.LIZIZ(c1962707mT);
    }

    public C1951707kh() {
        IDeepLinkExService iDeepLinkExService = (IDeepLinkExService) PluggableExtentionKt.pluggableSpi$default(IDeepLinkExService.class, false, false, false, 14, null);
        if (iDeepLinkExService != null) {
            this.LIZ = iDeepLinkExService;
        } else {
            "no impl for IDeepLinkExService".toString();
            throw new IllegalStateException("no impl for IDeepLinkExService");
        }
    }
}
