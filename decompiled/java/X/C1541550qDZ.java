package X;

import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qDZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1541550qDZ extends C09AY implements Function0<IResourceServiceX> {
    public final /* synthetic */ WebKitView LL;
    public final /* synthetic */ C1537480q70 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1541550qDZ(WebKitView webKitView, C1537480q70 c1537480q70) {
        super(0);
        this.LL = webKitView;
        this.LLILLJJLI = c1537480q70;
    }

    @Override // kotlin.jvm.functions.Function0
    public final IResourceServiceX invoke() {
        InterfaceC1541780qDw interfaceC1541780qDwLIZIZ;
        InterfaceC1541510qDV hybridRuntime$hybrid_web_release = this.LL.getHybridRuntime$hybrid_web_release();
        IResourceServiceX iResourceServiceXLIZ = (hybridRuntime$hybrid_web_release == null || (interfaceC1541780qDwLIZIZ = hybridRuntime$hybrid_web_release.LIZIZ()) == null) ? null : interfaceC1541780qDwLIZIZ.LIZ(this.LLILLJJLI);
        if (iResourceServiceXLIZ instanceof IResourceServiceX) {
            return iResourceServiceXLIZ;
        }
        return null;
    }
}
