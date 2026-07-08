package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MLC, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MLC {
    public static final C0MLC LIZ = new C0MLC();
    public static final ConcurrentHashMap<Integer, C0MLB> LIZIZ = new ConcurrentHashMap<>();
    public static String LIZJ = C0XQ7.LJFF().getCurUserId();

    public final void LIZ() {
        synchronized (this) {
            try {
                if (!Intrinsics.LJFF(LIZJ, C0XQ7.LJFF().getCurUserId())) {
                    LIZJ = C0XQ7.LJFF().getCurUserId();
                    LIZIZ.clear();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final List<ForwardMedia> LIZIZ(int i) {
        LIZ();
        C0MLB c0mlb = LIZIZ.get(Integer.valueOf(i));
        if (c0mlb != null) {
            return c0mlb.LIZJ();
        }
        return null;
    }

    public final C0MLB LIZJ(int i) {
        C0MLB c0mlbPutIfAbsent;
        LIZ();
        ConcurrentHashMap<Integer, C0MLB> concurrentHashMap = LIZIZ;
        Integer numValueOf = Integer.valueOf(i);
        C0MLB c0mlb = concurrentHashMap.get(numValueOf);
        if (c0mlb == null && (c0mlbPutIfAbsent = concurrentHashMap.putIfAbsent(numValueOf, (c0mlb = new C0MLB(i)))) != null) {
            c0mlb = c0mlbPutIfAbsent;
        }
        C0MLB c0mlb2 = c0mlb;
        C554890LpX c554890LpX = C554890LpX.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CeleVideo, videoDataStore hash = ");
        sbLIZ.append(c0mlb2.hashCode());
        C201955140j.LIZJ(c554890LpX, C2188811AlT.LIZIZ(sbLIZ));
        return c0mlb2;
    }
}
