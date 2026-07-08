package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;
import kotlin.jvm.internal.AFwS269S0000000_27;

/* JADX INFO: renamed from: X.0ySX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1858350ySX {
    public static volatile int LIZ = -1;

    public static final Message LIZJ(Message message) {
        TakoSug takoSug;
        TakoMixFeed takoMixFeedLJIIIZ = message.LJIIIZ();
        if (takoMixFeedLJIIIZ != null && (takoSug = takoMixFeedLJIIIZ.sug) != null && takoSug.sugShowType == 103) {
            Message messageLJ = message.LJ();
            messageLJ.LJIIJJI(AFwS269S0000000_27.get$arr$(11));
            return messageLJ;
        }
        return message;
    }

    public static final boolean LIZ(TakoSug takoSug, boolean z) {
        if (!C1858360ySY.LIZIZ.LIZ || takoSug.sugShowType != 103 || takoSug.isFirstSug) {
            return true;
        }
        C1857470yR7 c1857470yR7 = C1857470yR7.LIZ;
        c1857470yR7.getClass();
        if (!C1857470yR7.LIZJ && takoSug.sugShowType == 103) {
            c1857470yR7.getClass();
            C1857470yR7.LIZJ = true;
            return false;
        }
        if (takoSug.LJII > C1858360ySY.LIZIZ.LIZIZ || z) {
            return true;
        }
        return false;
    }

    public static final boolean LIZIZ(Message message, boolean z) {
        TakoMixFeed takoMixFeedLJIIIZ;
        TakoSug takoSug;
        if (!C1858360ySY.LIZIZ.LIZ || (takoMixFeedLJIIIZ = message.LJIIIZ()) == null || (takoSug = takoMixFeedLJIIIZ.sug) == null || takoSug.sugShowType != 103) {
            return true;
        }
        C1777730wMV c1777730wMV = C1858360ySY.LIZIZ;
        long j = c1777730wMV.LIZIZ;
        long j2 = c1777730wMV.LIZJ;
        if (message.LIZLLL > j || message.serverSeq > j2 || z) {
            return true;
        }
        return false;
    }
}
