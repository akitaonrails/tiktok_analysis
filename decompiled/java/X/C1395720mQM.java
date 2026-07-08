package X;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0mQM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1395720mQM {
    public static EnumC1395730mQN LIZ(String str) {
        EnumC1395730mQN enumC1395730mQN = EnumC1395730mQN.SHORT_CUT;
        if (!Intrinsics.LJFF(str, enumC1395730mQN.getScene())) {
            EnumC1395730mQN enumC1395730mQN2 = EnumC1395730mQN.FEED_SIDEBAR;
            if (!Intrinsics.LJFF(str, enumC1395730mQN2.getScene())) {
                EnumC1395730mQN enumC1395730mQN3 = EnumC1395730mQN.PROFILE_RICH_CARD;
                if (!Intrinsics.LJFF(str, enumC1395730mQN3.getScene())) {
                    if (str != null && u.LJJIIJZLJL(str, EnumC1395730mQN.MINIS_CENTER.getScene(), false)) {
                        return EnumC1395730mQN.MINIS_CENTER;
                    }
                    return null;
                }
                return enumC1395730mQN3;
            }
            return enumC1395730mQN2;
        }
        return enumC1395730mQN;
    }
}
