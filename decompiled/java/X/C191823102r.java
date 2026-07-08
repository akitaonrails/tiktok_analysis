package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingAPIService;
import com.ss.android.ugc.tiktok.tpsc.core.render.TPSCRenderManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.102r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C191823102r extends C09AY implements Function0<TPSCRenderManager> {
    public C191823102r() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final TPSCRenderManager invoke() {
        TPSCRenderManager tPSCRenderManagerLJIJ;
        IPrivacySettingAPIService iPrivacySettingAPIService = (IPrivacySettingAPIService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingAPIService.class, false, false, false, 14, null);
        return (iPrivacySettingAPIService == null || (tPSCRenderManagerLJIJ = iPrivacySettingAPIService.LJIJ()) == null) ? TPSCRenderManager.LIZ : tPSCRenderManagerLJIJ;
    }
}
