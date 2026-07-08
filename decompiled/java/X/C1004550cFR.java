package X;

import android.util.LruCache;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cFR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1004550cFR {
    public static final C1004550cFR LIZIZ = new C1004550cFR();
    public static final C054G LIZJ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public static final Set<String> LIZLLL = new LinkedHashSet();
    public static final Set<String> LJ = new LinkedHashSet();
    public static final Set<String> LJFF = new LinkedHashSet();
    public static final LruCache<String, C1004480cFK> LJI = new LruCache<>(100);
    public static final C01GW LJII = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(573));
    public static final Set<String> LJIIIIZZ = new LinkedHashSet();
    public static final Set<String> LJIIIZ = Collections.synchronizedSet(new LinkedHashSet());
    public static final Set<String> LJIIJ = C13LQ.LJLIIL(new String[]{"frequency_limit", "exit_strategy"});
    public static volatile boolean LJIIJJI = true;
    public static String LJIIL = "";
    public static final C01GW LJIILIIL = C452501pT.LIZIZ(new C1004570cFT());
    public static final C01GW LJIILJJIL = C452501pT.LIZIZ(new C1004560cFS());
    public final /* synthetic */ C1006680cIs LIZ = new C1006680cIs();

    public static C1004480cFK LIZ(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        C1004480cFK c1004480cFK = LJI.get(aweme.getAid());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enableQuickShareByPiyataPreResult ");
        sbLIZ.append(aweme.getAid());
        sbLIZ.append("  ");
        sbLIZ.append(c1004480cFK);
        C1720006oQ.LJ("QuickShareManager", C2188811AlT.LIZIZ(sbLIZ));
        return c1004480cFK;
    }

    public static boolean LIZIZ(String str) {
        if (str == null) {
            return false;
        }
        return LJFF.contains(str);
    }

    public static void LIZJ(String str, C1004480cFK c1004480cFK) {
        if (str == null) {
            return;
        }
        LruCache<String, C1004480cFK> lruCache = LJI;
        C1004480cFK c1004480cFK2 = lruCache.get(str);
        if (c1004480cFK2 != null && (Intrinsics.LJFF(c1004480cFK.LJIIIIZZ, "first_frame") || Intrinsics.LJFF(c1004480cFK2.LIZ, Boolean.TRUE))) {
            return;
        }
        lruCache.put(str, c1004480cFK);
    }

    public static void LIZLLL(long j, String str) {
        String str2;
        boolean z = !LJIIJ.contains(str);
        LJIIJJI = z;
        if (z) {
            str2 = "";
        } else {
            str2 = str;
        }
        LJIIL = str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateGlobalAvailableFromTriggerResult isAvailable=");
        sbLIZ.append(z);
        sbLIZ.append(" reason=");
        sbLIZ.append(str);
        sbLIZ.append(" timestamp=");
        sbLIZ.append(j);
        C1720006oQ.LJ("QuickShareManager", C2188811AlT.LIZIZ(sbLIZ));
    }
}
