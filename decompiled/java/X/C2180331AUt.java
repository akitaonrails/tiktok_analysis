package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AUt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2180331AUt {
    public static Pair<String, Long> LJFF;
    public static Map<String, Boolean> LJI;
    public static String LJII;
    public static boolean LJIIIIZZ;
    public static boolean LJIIJ;
    public static volatile C2180331AUt LJIIL;
    public final C11NJ LIZ = new C11NJ();
    public long LIZIZ = System.currentTimeMillis();
    public static final C2180321AUs LIZJ = new C2180321AUs();
    public static volatile Map<String, String> LIZLLL = new LinkedHashMap();
    public static final C01GW<Keva> LJ = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(79));
    public static final C1AV0 LJIIIZ = new AbstractC1604130rqV() { // from class: X.1AV0
    };
    public static final Set<String> LJIIJJI = C13LQ.LJLIIL(new String[]{"homepage_hot", "homepage_follow", "search_result", "general_search", "others_homepage"});

    public final void LIZIZ() {
        synchronized (LIZJ) {
            try {
                LJIIJ = false;
                LJII = null;
                LJIIIIZZ = false;
                this.LIZ.LJ();
                LJI = null;
                LJIIL = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C1483390ohl.LIZ().LIZLLL();
        C1487370ooB c1487370ooB = C1487370ooB.LIZ;
        C1487370ooB.LIZLLL();
    }

    public static void LIZJ(long j, String str, String str2) {
        String first;
        Pair<String, Long> pair;
        long jLongValue;
        Pair<String, Long> pair2 = LJFF;
        if (pair2 != null) {
            first = pair2.getFirst();
        } else {
            first = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(str2);
        if (Intrinsics.LJFF(first, C2188811AlT.LIZIZ(sbLIZ))) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(str2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            Pair<String, Long> pair3 = LJFF;
            if (pair3 != null) {
                jLongValue = pair3.getSecond().longValue() + j;
            } else {
                jLongValue = 0;
            }
            pair = new Pair<>(strLIZIZ, Long.valueOf(jLongValue));
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(str);
            sbLIZ3.append(str2);
            pair = new Pair<>(C2188811AlT.LIZIZ(sbLIZ3), Long.valueOf(j));
        }
        LJFF = pair;
    }

    public static void LIZ(Aweme aweme, String str, String str2, long j, EnumC2180361AUw enumC2180361AUw) {
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        LIZJ(jCurrentTimeMillis, aweme.getAid(), str2);
        C2180381AUy.LIZ(C2180381AUy.LIZ, "bcg_audio_play_end", aweme.getAid(), str, AwemeExtKt.getAuthorUid(aweme), null, null, enumC2180361AUw, Long.valueOf(jCurrentTimeMillis), null, 616);
    }
}
