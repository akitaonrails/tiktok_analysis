package X;

import android.view.View;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qLh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1546590qLh extends C09AY implements Function0<WebKitView> {
    public final /* synthetic */ InterfaceC1105930esx LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1546590qLh(InterfaceC1105930esx interfaceC1105930esx) {
        super(0);
        this.LL = interfaceC1105930esx;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.1ET2, com.bytedance.lynx.hybrid.webkit.WebKitView] */
    @Override // kotlin.jvm.functions.Function0
    public final WebKitView invoke() {
        View viewLJII = this.LL.LJII();
        if (!(viewLJII instanceof WebKitView) || viewLJII == null) {
            return null;
        }
        ?? r0 = (C1ET2) viewLJII;
        r0.onPause();
        return r0;
    }
}
