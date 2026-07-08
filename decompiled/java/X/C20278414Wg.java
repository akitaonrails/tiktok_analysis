package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;

/* JADX INFO: renamed from: X.14Wg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20278414Wg {
    public static Keva LIZ;
    public static final ConcurrentHashSet LIZIZ = new ConcurrentHashSet();
    public static final ConcurrentHashSet LIZJ = new ConcurrentHashSet();

    public static Keva LIZ() {
        Keva repoSync;
        Keva keva = LIZ;
        if (keva != null) {
            return keva;
        }
        synchronized (C20278414Wg.class) {
            try {
                repoSync = LIZ;
                if (repoSync == null) {
                    repoSync = KevaImpl.getRepoSync("StartupJankViewPreloadMissOpt", 0);
                    LIZ = repoSync;
                    String string = repoSync.getString("version_name", null);
                    C844470XAv.LIZ.getClass();
                    String strLJFF = C844470XAv.LJFF();
                    if (!TextUtils.equals(string, strLJFF)) {
                        repoSync.clear();
                        repoSync.storeStringJustDisk("version_name", strLJFF);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return repoSync;
    }

    public static void LIZIZ(String str) {
        try {
            if (!TextUtils.isEmpty(str) && LIZJ.add(str)) {
                LIZ().storeInt(str, 0);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
