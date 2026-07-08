package X;

import android.util.LruCache;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.message.persistentext.adapter.BotFeedbackData;
import com.ss.android.ugc.aweme.im.message.persistentext.adapter.PersistentExtraData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.060x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15393060x {
    public static final C15393060x LIZ = new C15393060x();
    public static final LruCache<String, Boolean> LIZIZ = new LruCache<>(10);
    public static volatile String LIZJ;
    public static Keva LIZLLL;

    public static boolean LIZIZ(C869590Y9l c869590Y9l) {
        BotFeedbackData botFeedbackData;
        C062F c062f;
        PersistentExtraData persistentExtraDataLJIIIIZZ = C0ZDX.LJIIIIZZ(c869590Y9l);
        if (persistentExtraDataLJIIIIZZ != null && (botFeedbackData = persistentExtraDataLJIIIIZZ.botFeedback) != null && (c062f = botFeedbackData.feedbackMap.get(C2095008Iq.LJIILIIL(C461720I8s.LIZIZ()))) != null && c062f.getValue() == C062F.BOT_FEEDBACK_TYPE_NEGATIVE.getValue()) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(C869590Y9l c869590Y9l) {
        BotFeedbackData botFeedbackData;
        C062F c062f;
        PersistentExtraData persistentExtraDataLJIIIIZZ = C0ZDX.LJIIIIZZ(c869590Y9l);
        if (persistentExtraDataLJIIIIZZ != null && (botFeedbackData = persistentExtraDataLJIIIIZZ.botFeedback) != null && (c062f = botFeedbackData.feedbackMap.get(C2095008Iq.LJIILIIL(C461720I8s.LIZIZ()))) != null && c062f.getValue() == C062F.BOT_FEEDBACK_TYPE_POSITIVE.getValue()) {
            return true;
        }
        return false;
    }

    public final Keva LIZ(String str) {
        Keva repo;
        synchronized (this) {
            try {
                if (!Intrinsics.LJFF(LIZJ, str)) {
                    LIZJ = str;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("smart_reply_feedback_");
                    sbLIZ.append(str);
                    repo = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
                    LIZLLL = repo;
                } else {
                    repo = LIZLLL;
                    if (repo == null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("smart_reply_feedback_");
                        sbLIZ2.append(str);
                        repo = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return repo;
    }
}
