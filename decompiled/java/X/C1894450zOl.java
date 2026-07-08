package X;

import com.bytedance.touchpoint.api.config.IIncentiveManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zOl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1894450zOl extends C09AY implements Function0<Unit> {
    public C1894450zOl() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        IIncentiveManager iIncentiveManager = (IIncentiveManager) PluggableExtentionKt.pluggableSpi$default(IIncentiveManager.class, false, false, false, 14, null);
        if (iIncentiveManager != null) {
            iIncentiveManager.LIZLLL();
        }
        return Unit.LIZ;
    }
}
