package X;

import Y.ARunnableS14S0101000_3;
import Y.ARunnableS39S0110000_20;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import com.ss.bytertc.engine.loader.LyraxSoLoadState;
import com.ss.lyrax.augur.AugurConfigRequester;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.0jJP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1276090jJP {
    public static final AtomicReference<AugurConfigRequester> LIZ = new AtomicReference<>();
    public static final AtomicReference<C1276110jJR> LIZIZ = new AtomicReference<>();
    public static volatile boolean LIZJ = false;
    public static volatile boolean LIZLLL = false;
    public static volatile boolean LJ = false;
    public static C1276150jJV LJFF = new C1276150jJV(null, "", "", "", false, "");
    public static final Object LJI = new Object();
    public static volatile ExecutorService LJII;
    public static C1269160j8E LJIIIIZZ;

    public static ExecutorService LIZLLL() {
        if (LJII == null) {
            synchronized (LJI) {
                try {
                    if (LJII == null) {
                        LJII = C786410Ut5.i4(new ThreadFactoryC1339280kxK(0));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJII;
    }

    public static boolean LIZ() {
        if (!LyraxSoLoadState.isLyraxNativeReady()) {
            return false;
        }
        try {
            LoadSoLancet.LIZJ("starship_sdk");
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF("starship_sdk");
            LoadSoLancet.LJ(jUptimeMillis, "starship_sdk");
            LoadSoLancet.LIZLLL(jUptimeMillis, "starship_sdk");
            LoadSoLancet.LIZIZ("starship_sdk");
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return true;
        }
    }

    public static String LIZJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String strReplace = null;
        try {
            C1276320jJm c1276320jJmTtUrlDispatch = TTNetInit.ttUrlDispatch("https://rtc-logger-va.tiktokv.com/");
            if (!TextUtils.isEmpty(c1276320jJmTtUrlDispatch.LIZIZ)) {
                strReplace = c1276320jJmTtUrlDispatch.LIZIZ;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!TextUtils.isEmpty(strReplace)) {
            if (strReplace.contains("http://")) {
                strReplace = strReplace.replace("http", "wss");
            } else if (strReplace.contains("https://")) {
                strReplace = strReplace.replace("https", "wss");
            }
        }
        sbLIZ.append(strReplace);
        sbLIZ.append("report");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static List<String> LIZIZ(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.equals(str, "game")) {
            arrayList.add("LiveGame");
            arrayList.add("LinkMic");
        } else {
            if (TextUtils.equals(str, "video")) {
                arrayList.add("Live");
                arrayList.add("LinkMic");
                return arrayList;
            }
            arrayList.add("LinkMic");
            if (!z) {
                arrayList.add("Live");
                return arrayList;
            }
        }
        return arrayList;
    }

    public static void LJ(boolean z, C1276150jJV c1276150jJV) {
        ARunnableS39S0110000_20 aRunnableS39S0110000_20 = new ARunnableS39S0110000_20(c1276150jJV, z, 3);
        int i = c1276150jJV.LJI;
        if (i > 0) {
            LIZLLL().execute(new ARunnableS14S0101000_3(i, aRunnableS39S0110000_20, 1));
        } else {
            LIZLLL().execute(aRunnableS39S0110000_20);
        }
    }
}
