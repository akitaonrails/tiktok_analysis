package X;

import Y.AComparatorS514S0100000_15;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostTakeTheStageV3Setting;
import java.util.List;
import tikcast.linkmic.common.CohostUserInfo;

/* JADX INFO: renamed from: X.0bJY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C968660bJY {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        long j;
        if (!LiveCoHostTakeTheStageV3Setting.INSTANCE.isEnable()) {
            return false;
        }
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        if (listLLILZLL.isEmpty()) {
            C20441214yg.LJ("TakeStageCommonUtil", "No co-host users. Cannot check tts version");
            return false;
        }
        for (C954460awe c954460awe : listLLILZLL) {
            CohostUserInfo.CohostMode cohostMode = c954460awe.LJJIIJZLJL;
            if (cohostMode != null) {
                j = cohostMode.highestTakeTheStageVersionSupported;
                if (j != 3) {
                }
            } else {
                j = 0;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c954460awe.LJ);
            sbLIZ.append(" is not v3. highestVersionSupported=");
            sbLIZ.append(j);
            C20441214yg.LIZIZ("TakeStageCommonUtil", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
        return true;
    }

    public static void LIZIZ(List list, List list2) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Skip sorting the given hosts? ");
        if (list2 != null && !list2.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        sbLIZ.append(z);
        C20441214yg.LIZIZ("TakeStageCommonUtil", C2188811AlT.LIZIZ(sbLIZ));
        if (list2 != null) {
            C08XD.LJJ(list, new AComparatorS514S0100000_15(list2, 8));
        }
    }
}
