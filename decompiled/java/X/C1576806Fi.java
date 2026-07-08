package X;

import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.06Fi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1576806Fi {
    public static final /* synthetic */ int LIZ = 0;

    public static C066X LIZ(String str, StreakData streakData, StreakPetData streakPetData, C1576706Fh c1576706Fh, Function0 function0) {
        C066X c066xLIZLLL = C1576606Fg.LIZLLL(str, streakData, streakPetData, c1576706Fh);
        if (c066xLIZLLL != null) {
            return c066xLIZLLL;
        }
        if (C1567806Bw.LIZLLL(streakData)) {
            IStreakPetService.LIZ.getClass();
            if (C1586906Jf.LIZ().LJJI(str)) {
                return C1576606Fg.LIZIZ(c1576706Fh, streakData, C06ET.LJ, streakPetData, str);
            }
            return C1576606Fg.LIZ(c1576706Fh, streakData, C06ET.LIZLLL, streakPetData, str);
        }
        if (streakPetData == null || !C1571306Df.LJFF(streakPetData, streakData)) {
            IStreakPetService.LIZ.getClass();
            if (C1586906Jf.LIZ().LJJI(str)) {
                return C1576606Fg.LIZ(c1576706Fh, streakData, C06ET.LJ, streakPetData, str);
            }
        }
        if (function0 != null) {
            return (C066X) function0.invoke();
        }
        return C1576606Fg.LIZ(c1576706Fh, streakData, C06ET.LIZLLL, streakPetData, str);
    }
}
