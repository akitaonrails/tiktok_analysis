package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.common.analytics.userexperience.IDMUserExperienceMonitorService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04PU, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C04PU extends C09AY implements Function0<C0Z7C> {
    public C04PU() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0Z7C invoke() {
        IDMUserExperienceMonitorService iDMUserExperienceMonitorService = (IDMUserExperienceMonitorService) PluggableExtentionKt.pluggableSpi$default(IDMUserExperienceMonitorService.class, false, false, false, 14, null);
        if (iDMUserExperienceMonitorService != null) {
            return iDMUserExperienceMonitorService.LIZ();
        }
        return null;
    }
}
