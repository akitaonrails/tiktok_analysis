package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.ServerDeletedLiveInfo;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0J7C, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J7C {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C0J7F());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C0J7E());
    public static ServerDeletedLiveInfo LIZJ;

    public static CopyOnWriteArrayList LIZIZ() {
        return (CopyOnWriteArrayList) LIZ.getValue();
    }

    public static final void LIZ(Aweme aweme) {
        if (aweme == null) {
            return;
        }
        for (Object obj : LIZIZ()) {
            if (((C0J7D) obj).LIZ == aweme) {
                if (obj != null) {
                    LIZIZ().remove(obj);
                    return;
                }
                return;
            }
        }
    }

    public static Aweme LIZJ(Set set, int i) {
        Long lLJIILIIL;
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (C0J7D c0j7d : LIZIZ()) {
            String aid = c0j7d.LIZ.getAid();
            if (aid != null && (lLJIILIIL = C2095008Iq.LJIILIIL(aid)) != null) {
                long jLongValue = lLJIILIIL.longValue();
                if (jLongValue > 0 && !set.contains(Long.valueOf(jLongValue)) && jUptimeMillis - c0j7d.LIZJ < i) {
                    return c0j7d.LIZ;
                }
            }
        }
        return null;
    }

    public static final void LIZLLL(int i, Aweme aweme) {
        if (aweme == null) {
            return;
        }
        LIZ(aweme);
        if (i >= 0) {
            ((CopyOnWriteArrayList) LIZIZ.getValue()).add(new C0J7D(i, SystemClock.uptimeMillis(), aweme));
        }
    }
}
