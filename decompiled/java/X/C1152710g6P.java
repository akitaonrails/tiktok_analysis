package X;

import com.bytedance.android.livesdk.game.common.setting.GameFeedHalfFragmentUpgradeForFullTypes;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g6P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1152710g6P {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(int i, String str) {
        if (Intrinsics.LJFF(str, "immersive_popup")) {
            return true;
        }
        if ((Intrinsics.LJFF(str, "immersive_full_screen") || Intrinsics.LJFF(str, "interactive_full_screen")) && i != 0) {
            if (i == 1) {
                return true;
            }
            return GameFeedHalfFragmentUpgradeForFullTypes.INSTANCE.isEnabled();
        }
        return false;
    }
}
