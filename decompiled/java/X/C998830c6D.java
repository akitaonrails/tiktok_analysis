package X;

import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService;
import com.ss.android.ugc.aweme.feed.adapter.widget.ad.AdCardWidget;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0c6D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C998830c6D extends C09AY implements Function0<InterfaceC990070bs5> {
    public final /* synthetic */ AdCardWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C998830c6D(AdCardWidget adCardWidget) {
        super(0);
        this.LL = adCardWidget;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ InterfaceC990070bs5 invoke() {
        return ((ICommercializeLiveService) ServiceManager.get().getService(ICommercializeLiveService.class)).LIZLLL((FrameLayout) this.LL.LLJILJIL.getValue());
    }
}
