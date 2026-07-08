package X;

import com.ss.android.ugc.aweme.hybridkit.web.WebViewInjectServiceImpl;
import com.ss.android.ugc.aweme.webview.IWebViewInjectService;

/* JADX INFO: renamed from: X.04TZ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C04TZ implements IWebViewInjectService {
    public static final C04TZ LIZIZ = new C04TZ();
    public final /* synthetic */ IWebViewInjectService LIZ;

    @Override // com.ss.android.ugc.aweme.webview.IWebViewInjectService
    public final void LIZ() {
        this.LIZ.LIZ();
    }

    public C04TZ() {
        IWebViewInjectService iWebViewInjectService;
        Object objLIZ = C04TD.LIZ(IWebViewInjectService.class, false);
        if (objLIZ != null) {
            iWebViewInjectService = (IWebViewInjectService) objLIZ;
        } else {
            if (C04TD.O0 == null) {
                synchronized (IWebViewInjectService.class) {
                    if (C04TD.O0 == null) {
                        C04TD.O0 = new WebViewInjectServiceImpl();
                    }
                }
            }
            iWebViewInjectService = C04TD.O0;
        }
        this.LIZ = iWebViewInjectService;
    }
}
