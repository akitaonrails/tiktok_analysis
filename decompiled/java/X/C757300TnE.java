package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.commercialize.live.settings.BASchemaConfig;

/* JADX INFO: renamed from: X.0TnE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C757300TnE extends AbstractC756290Tlb {
    @Override // X.AbstractC756290Tlb
    public final void LIZ(Context context) {
    }

    @Override // X.AbstractC756290Tlb
    public final void LIZIZ(Context context) {
        String strLIZ = ((BASchemaConfig.BASchemaConfigData) BASchemaConfig.LIZIZ.getValue()).liveLinkList.LIZ();
        Bundle bundle = this.LIZ;
        if (bundle != null) {
            strLIZ = C08RU.LIZ(bundle, strLIZ);
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, strLIZ);
        smartRouteBuildRoute.withParam(this.LIZ);
        smartRouteBuildRoute.open();
    }
}
