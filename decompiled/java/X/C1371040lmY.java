package X;

import com.ss.android.ugc.aweme.share.settings.EnhanceSharePanelUIConfig;
import com.ss.android.ugc.aweme.share.settings.ImSectionConfig;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lmY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1371040lmY {
    public static final EnhanceSharePanelUIConfig LIZ = new EnhanceSharePanelUIConfig(null, null, null, null, null, null, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(607));

    public static EnhanceSharePanelUIConfig LIZIZ() {
        return (EnhanceSharePanelUIConfig) LIZIZ.getValue();
    }

    public static final boolean LIZ() {
        EnhanceSharePanelUIConfig enhanceSharePanelUIConfigLIZIZ = LIZIZ();
        if (enhanceSharePanelUIConfigLIZIZ != null) {
            return Intrinsics.LJFF(enhanceSharePanelUIConfigLIZIZ.adjustActionChannel, Boolean.TRUE);
        }
        return false;
    }

    public static final ImSectionConfig LIZJ() {
        EnhanceSharePanelUIConfig enhanceSharePanelUIConfigLIZIZ = LIZIZ();
        if (enhanceSharePanelUIConfigLIZIZ != null) {
            return enhanceSharePanelUIConfigLIZIZ.imSectionConfig;
        }
        return null;
    }

    public static final boolean LIZLLL() {
        EnhanceSharePanelUIConfig enhanceSharePanelUIConfigLIZIZ;
        if (LIZIZ() == null || (enhanceSharePanelUIConfigLIZIZ = LIZIZ()) == null) {
            return false;
        }
        return (enhanceSharePanelUIConfigLIZIZ.shareActions == null && enhanceSharePanelUIConfigLIZIZ.moveTipConfig == null && enhanceSharePanelUIConfigLIZIZ.adjustActionChannel == null && enhanceSharePanelUIConfigLIZIZ.useSquareIcon == null && enhanceSharePanelUIConfigLIZIZ.preposeCreateGroup == null && enhanceSharePanelUIConfigLIZIZ.imSectionConfig == null && enhanceSharePanelUIConfigLIZIZ.prohibitHandleDeviceScore == null) ? false : true;
    }
}
