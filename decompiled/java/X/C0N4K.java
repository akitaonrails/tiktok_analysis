package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0N4K, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N4K {
    public static final Set<String> LIZ = Collections.synchronizedSet(new LinkedHashSet());
    public static final Set<Long> LIZIZ = Collections.synchronizedSet(new LinkedHashSet());

    public static void LIZ(Aweme aweme) {
        Long creativeId;
        if (!aweme.isAd()) {
            return;
        }
        try {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null && (creativeId = awemeRawAd.getCreativeId()) != null) {
                LIZIZ.add(Long.valueOf(creativeId.longValue()));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static final void LIZIZ(List<? extends Aweme> list) {
        if (list == null) {
            return;
        }
        for (Aweme aweme : list) {
            if (aweme != null && aweme.getAid() != null) {
                LIZ.add(aweme.getAid());
                LIZ(aweme);
            }
        }
        C1933207hi.LIZ(LIZIZ);
    }

    public static final void LIZJ(List<? extends Aweme> list) {
        if (list == null) {
            return;
        }
        for (Aweme aweme : list) {
            if (aweme != null && aweme.getAid() != null) {
                LIZ.add(aweme.getAid());
                LIZ(aweme);
            }
        }
    }
}
