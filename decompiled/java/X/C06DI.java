package X;

import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.06DI, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06DI {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(StreakPetData streakPetData, StreakPetData streakPetData2) {
        String str = streakPetData2.conversationId;
        C1575806Ey.LIZJ.getClass();
        StreakData streakDataLJIIIIZZ = C1575806Ey.LJIIIIZZ(str);
        if (streakPetData != null) {
            boolean z = false;
            if (streakPetData.streakPetAnimState.length() != 0) {
                String str2 = streakPetData.streakPetAnimState;
                int i = streakPetData2.status;
                C06G0 c06g0 = C06G0.StreakPetStatus_Active;
                if (i != c06g0.getValue()) {
                    return "enter";
                }
                if (i == c06g0.getValue() && streakPetData.status != c06g0.getValue()) {
                    if (C1567806Bw.LIZLLL(streakDataLJIIIIZZ)) {
                        return "enter";
                    }
                    return "enter_finish";
                }
                if (streakPetData2.hatchingTimestampInSeconds > streakPetData.hatchingTimestampInSeconds) {
                    return "enter_finish";
                }
                if (streakPetData.subStatus == EnumC1571406Dg.StreakPetSubStatus_Hatching1.getValue() && streakPetData2.subStatus == EnumC1571406Dg.StreakPetSubStatus_Hatching2.getValue()) {
                    return "hatching_upgrade";
                }
                int iLIZ = C1571306Df.LIZ(streakPetData);
                int iLIZ2 = C1571306Df.LIZ(streakPetData2);
                if (u.LJJIIJZLJL(str2, "level__", false) || u.LJJIIJZLJL(str2, "level_finish_", false) || Intrinsics.LJFF(str2, "enter_finish")) {
                    z = true;
                }
                if (iLIZ2 > iLIZ && z) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("level__");
                    sbLIZ.append(iLIZ2);
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
                return str2;
            }
        }
        if (C1567806Bw.LIZLLL(streakDataLJIIIIZZ)) {
            return "enter";
        }
        return "enter_finish";
    }
}
