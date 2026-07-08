package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.api.MLCommonService;

/* JADX INFO: renamed from: X.0N9Z, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N9Z {
    public static final C603820NmG<String, Aweme> LIZ = new C603820NmG<>(5);
    public static final C0N9W<String> LIZIZ = new C0N9W<>();

    public static Aweme LIZ(String str) {
        Aweme awemeLIZ = null;
        if (str == null) {
            return null;
        }
        Aweme awemeLIZJ = LIZ.LIZJ(str);
        if (awemeLIZJ == null) {
            MLCommonService.Companion.getClass();
            if (C0NAL.LIZ.getAwemeAdapter() != null) {
                awemeLIZ = C581560MrS.LIZ(str);
            }
            LIZIZ(awemeLIZ);
            return awemeLIZ;
        }
        return awemeLIZJ;
    }

    public static void LIZIZ(Aweme aweme) {
        if (aweme != null && aweme.getAid() != null) {
            LIZ.LIZLLL(aweme.getAid(), aweme);
            C0N9W<String> c0n9w = LIZIZ;
            String aid = aweme.getAid();
            c0n9w.getClass();
            try {
                if (c0n9w.LIZ.size() >= 5) {
                    c0n9w.LIZ.removeLast();
                }
                c0n9w.LIZ.addFirst(aid);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJFF(th, "client_ai_crash");
            }
        }
    }
}
