package X;

import com.bytedance.ies.im.core.api.experiment.IMMessageContinuityConfiguration;

/* JADX INFO: renamed from: X.0YFe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C871080YFe {
    public static final IMMessageContinuityConfiguration LIZ = new IMMessageContinuityConfiguration(false, 0, 0, 0, 0);

    public static IMMessageContinuityConfiguration LIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        IMMessageContinuityConfiguration iMMessageContinuityConfiguration = LIZ;
        IMMessageContinuityConfiguration iMMessageContinuityConfiguration2 = (IMMessageContinuityConfiguration) c0c64LJIILLIIL.LJJII(IMMessageContinuityConfiguration.class, iMMessageContinuityConfiguration, "imsdk_continuity_check", true);
        return iMMessageContinuityConfiguration2 != null ? iMMessageContinuityConfiguration2 : iMMessageContinuityConfiguration;
    }
}
