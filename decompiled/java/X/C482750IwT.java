package X;

import com.ss.android.ugc.aweme.ab.ToplivePageLoadAdvanceSetting;
import com.ss.android.ugc.aweme.toplive.ToplivePageActivity;

/* JADX INFO: renamed from: X.0IwT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C482750IwT {
    public static boolean LIZ(EnumC482480Iw2 enumC482480Iw2, boolean z) {
        AnonymousClass0956 anonymousClass0956 = ToplivePageActivity.LLILZ;
        if (anonymousClass0956 != null && anonymousClass0956.isActive()) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (z) {
            int i = ToplivePageLoadAdvanceSetting.LIZ().touchPreloadInterval;
            long j = jCurrentTimeMillis - ToplivePageActivity.LLILZIL;
            if (1 <= j && j < i) {
                return false;
            }
        }
        ToplivePageActivity.LLILZIL = jCurrentTimeMillis;
        AnonymousClass0956 anonymousClass09562 = ToplivePageActivity.LLILZ;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        ToplivePageActivity.LLILZ = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ.plus(C23118094a.LIZ())), null, null, new C482510Iw5(enumC482480Iw2, null), 3);
        return true;
    }
}
