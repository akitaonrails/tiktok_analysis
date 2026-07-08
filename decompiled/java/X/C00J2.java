package X;

import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveMessageItemsHostBadgeSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.00J2, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00J2 {
    public static BadgeStruct LIZ;
    public static final C01GW LIZIZ = C292401Bi.LIZ(AnonymousClass0206.get$arr$(338));

    public static BadgeStruct LIZ() {
        BadgeStruct badgeStruct;
        String hostBadgeStr = LiveMessageItemsHostBadgeSetting.INSTANCE.getHostBadgeStr();
        if (hostBadgeStr.length() == 0) {
            return (BadgeStruct) LIZIZ.getValue();
        }
        if (LIZ == null) {
            try {
                badgeStruct = (BadgeStruct) C19748512Ol.LIZIZ.LJII(hostBadgeStr, BadgeStruct.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                badgeStruct = (BadgeStruct) LIZIZ.getValue();
            }
            LIZ = badgeStruct;
        }
        return LIZ;
    }
}
