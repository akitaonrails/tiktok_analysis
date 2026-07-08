package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.offline.tools.debug.gp.IToolsDebugGpService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.140m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C201958140m extends C09AY implements Function0<Boolean> {
    public C201958140m() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        IToolsDebugGpService iToolsDebugGpService = (IToolsDebugGpService) PluggableExtentionKt.pluggableSpi$default(IToolsDebugGpService.class, false, false, false, 8, null);
        if (iToolsDebugGpService != null) {
            iToolsDebugGpService.isOpen();
        }
        return false;
    }
}
