package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.probe.IProbeService;

/* JADX INFO: renamed from: X.03x0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1008803x0 {
    public static final boolean LIZ() {
        C0196004k c0196004kLJI;
        IProbeService iProbeService = (IProbeService) PluggableExtentionKt.pluggableSpi$default(IProbeService.class, false, false, false, 14, null);
        return (iProbeService == null || (c0196004kLJI = iProbeService.LJI()) == null || !c0196004kLJI.LIZ) ? false : true;
    }

    public static final String LIZIZ(String str) {
        IProbeService iProbeService = (IProbeService) PluggableExtentionKt.pluggableSpi$default(IProbeService.class, false, false, false, 14, null);
        if (iProbeService == null) {
            return null;
        }
        C0196004k c0196004kLJI = iProbeService.LJI();
        if (!c0196004kLJI.LIZ || !c0196004kLJI.LIZIZ.contains(str)) {
            return null;
        }
        String strLJ = iProbeService.LJ();
        if (strLJ.length() == 0) {
            return null;
        }
        return strLJ;
    }
}
