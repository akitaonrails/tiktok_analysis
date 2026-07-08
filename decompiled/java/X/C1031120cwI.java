package X;

import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdOutService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0cwI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1031120cwI extends C09AY implements Function0<InterfaceC1028550cs9> {
    public C1031120cwI() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1028550cs9 invoke() {
        ISplashAdOutService iSplashAdOutService = (ISplashAdOutService) PluggableExtentionKt.pluggableSpi$default(ISplashAdOutService.class, false, false, false, 14, null);
        if (iSplashAdOutService != null) {
            return iSplashAdOutService.LIZ();
        }
        return null;
    }
}
