package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.10US, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10US {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ C259800zU<Uri> LIZIZ;

    public final void LIZ() {
        IDeepLinkService iDeepLinkService = (IDeepLinkService) ServiceManager.get().getService(IDeepLinkService.class);
        if (iDeepLinkService == null || !iDeepLinkService.LJJIIZI(this.LIZ)) {
            C10UW.LIZ.LIZJ();
        } else {
            C10UQ c10uq = C10UW.LIZ;
            C259800zU<Uri> c259800zU = this.LIZIZ;
            C844470XAv.LIZ.getClass();
            Intent intent = new Intent(C844470XAv.LIZ(), iDeepLinkService.LJLJJI("NewUserLandingApiUtil#registerDDLListener"));
            intent.putExtras(c10uq.LIZ());
            intent.setFlags(268435456);
            intent.setData(c259800zU.element);
            Context contextLIZ = C844470XAv.LIZ();
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(contextLIZ, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, contextLIZ);
            C2204961BRm.LJJJJJL(contextLIZ, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+8apPdkhyC+dEEp8JdzOzOe8ROAOGtZLlcIA==", null));
        }
        C10UW.LIZ.LIZLLL = null;
    }

    public C10US(String str, C259800zU c259800zU) {
        this.LIZ = str;
        this.LIZIZ = c259800zU;
    }
}
