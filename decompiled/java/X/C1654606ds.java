package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.06ds, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1654606ds {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1244));

    public static Keva LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("story_reactions_send_unlimited_remind_freq_repo_");
        sbLIZ.append(((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId());
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static boolean LIZIZ() {
        return LIZ().getInt("current_show_times", 0) >= ((Number) LIZ.getValue()).intValue();
    }
}
