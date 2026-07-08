package X;

import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletSecondPopupRemovalPhase2Setting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.profit.IapListResult;

/* JADX INFO: renamed from: X.0x58, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1805400x58 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String str, boolean z) {
        if (z) {
            return false;
        }
        if (!Intrinsics.LJFF(str, "icon") && !LiveWalletSecondPopupRemovalPhase2Setting.INSTANCE.getValue()) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ(InterfaceC1806200x6Q interfaceC1806200x6Q, IapListResult.ActivityInfo activityInfo) {
        C01GW<InterfaceC1133710fbl> c01gw = C1805240x4s.LJIIJ;
        if (!C1804990x4T.LIZIZ()) {
            Boolean boolValueOf = null;
            if (interfaceC1806200x6Q != null) {
                boolValueOf = Boolean.valueOf(interfaceC1806200x6Q.LIZJ(EnumC1805630x5V.LIVE_RECHARGE_PANEL_FOOTER));
            }
            if (!C176600m4.LIZIZ(boolValueOf) && !C1805670x5Z.LIZ(activityInfo)) {
                C1126800fQc.LIZ.GN();
                C1123320fL0 c1123320fL0LIZIZ = C1121450fHz.LIZIZ(EnumC1121470fI1.RECHARGE_BANNER_TP.getType());
                if (c1123320fL0LIZIZ == null || c1123320fL0LIZIZ.LIZLLL == 0) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static boolean LIZIZ(boolean z, int i, String str, long j, boolean z2, DataChannel dataChannel) {
        if (C1126800fQc.LIZ.KE0().LJIIL()) {
            return true;
        }
        if (!z2) {
            if (!z) {
                if (Intrinsics.LJFF(str, "icon") || LiveWalletSecondPopupRemovalPhase2Setting.INSTANCE.getValue()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        if (C1131530fYF.LJ(str) || C1131530fYF.LIZ(j, dataChannel, str)) {
            return true;
        }
        if (!z && i >= 1 && i <= 10) {
            return true;
        }
        return false;
    }
}
