package X;

import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.lynx.hybrid.webkit.ttwebview.TTWebViewHelper;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qDN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1541430qDN extends C09AY implements Function0<Unit> {
    public final /* synthetic */ WeakReference<WebKitView> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1541430qDN(WeakReference<WebKitView> weakReference) {
        super(0);
        this.LL = weakReference;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        WebKitView webKitView = this.LL.get();
        if (webKitView != null) {
            TTWebViewHelper.onPageFinished$collectKernelData(webKitView);
        }
        return Unit.LIZ;
    }
}
