package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0CQr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C313510CQr {
    public static final Keva LIZ;

    static {
        try {
            C844470XAv.LIZ.getClass();
            LIZ = KevaImpl.getRepoFromSp(C844470XAv.LIZ(), "ProfileV2Preferences", 0);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SharedPreferencesAnnotatedManager getSP failed ");
            sbLIZ.append(th.getMessage());
            C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static boolean LIZ() {
        Keva keva = LIZ;
        if (keva != null) {
            return keva.getBoolean("profile_v2_show_bio_hint", true);
        }
        return false;
    }
}
