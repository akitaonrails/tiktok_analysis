package X;

import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import java.util.List;

/* JADX INFO: renamed from: X.0bS1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C973910bS1 {
    public static List<GiftMode> LIZJ;
    public static long LJFF;
    public static long LJI;
    public static final C098J<Long, String> LJII;
    public static final C973920bS2 LJIIIIZZ;
    public static final C973910bS1 LIZ = new C973910bS1();
    public static String LIZIZ = "";
    public static final C098J<Long, C098J<Long, Boolean>> LIZLLL = new C098J<>(10);
    public static final C098J<Long, Boolean> LJ = new C098J<>(20);

    static {
        new C098J(20);
        LJII = new C098J<>(10);
        LJIIIIZZ = C973920bS2.LIZ;
    }

    public static final boolean LIZ(long j) {
        return C500260Jjc.LJJJI(LJ.get(Long.valueOf(j)));
    }

    public static final boolean LIZIZ(long j, long j2) {
        Boolean bool;
        C098J<Long, Boolean> c098j = LIZLLL.get(Long.valueOf(j));
        if (c098j != null && (bool = c098j.get(Long.valueOf(j2))) != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final void LIZJ(long j, String str) {
        C098J<Long, String> c098j = LJII;
        String str2 = c098j.get(Long.valueOf(j));
        if (C1533950q1J.LJ(str2)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("saveRoomIdentifyCompetitionScene, first_success, competitionId=");
            sbLIZ.append(j);
            sbLIZ.append(", scene=");
            sbLIZ.append(str);
            C20441214yg.LIZIZ("CompetitionModelStatic", C2188811AlT.LIZIZ(sbLIZ));
            c098j.put(Long.valueOf(j), str);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("saveRoomIdentifyCompetitionScene, already_success ,competitionId=");
        sbLIZ2.append(j);
        sbLIZ2.append(", scene=");
        sbLIZ2.append(str);
        sbLIZ2.append(", preCache=");
        sbLIZ2.append(str2);
        C20441214yg.LJ("CompetitionModelStatic", C2188811AlT.LIZIZ(sbLIZ2));
    }
}
