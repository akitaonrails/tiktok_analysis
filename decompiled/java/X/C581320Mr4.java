package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.playeranalytics.IPlayerAnalyticsService;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Mr4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C581320Mr4 {
    public long LIZ;
    public boolean LIZJ;
    public boolean LJI;
    public boolean LJIIJ;
    public final C349970Dnn LIZIZ = new LinkedHashMap<String, Long>() { // from class: X.0Dnn
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Long> entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    };
    public final C349950Dnl LIZLLL = new LinkedHashMap<String, Boolean>() { // from class: X.0Dnl
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Boolean> entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    };
    public long LJ = -1;
    public final C349960Dnm LJFF = new LinkedHashMap<String, Long>() { // from class: X.0Dnm
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Long> entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    };
    public final C349980Dno LJII = new LinkedHashMap<String, Boolean>() { // from class: X.0Dno
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Boolean> entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    };
    public int LJIIIIZZ = 0;
    public long LJIIIZ = 0;
    public long LJIIJJI = 0;
    public int LJIIL = 0;
    public long LJIILIIL = -1;
    public long LJIILJJIL = 0;
    public final IPlayerAnalyticsService LJIILL = (IPlayerAnalyticsService) ServiceManager.get().getService(IPlayerAnalyticsService.class);

    public static void LIZJ(boolean z) {
        if (z) {
            C1618230sDF.LIZIZ.LIZ.getClass();
        }
        IRuntimeBehaviorService iRuntimeBehaviorService = (IRuntimeBehaviorService) ServiceManager.get().getService(IRuntimeBehaviorService.class);
        if (iRuntimeBehaviorService != null) {
            iRuntimeBehaviorService.LIZ("block");
        }
    }

    public final boolean LIZ(String str) {
        if (C1779306xz.LIZ() == 0) {
            return this.LIZJ;
        }
        if (1 != C1779306xz.LIZ() || TextUtils.isEmpty(str)) {
            return false;
        }
        if (!containsKey(str)) {
            return this.LIZJ;
        }
        return Boolean.TRUE.equals(get(str));
    }

    public final long LIZIZ(String str) {
        if (C1779306xz.LIZ() == 0) {
            return this.LJ;
        }
        if (1 != C1779306xz.LIZ() || TextUtils.isEmpty(str)) {
            return -1L;
        }
        if (!containsKey(str)) {
            return this.LJ;
        }
        return get(str).longValue();
    }

    public final void LIZLLL(String str, boolean z) {
        this.LIZJ = z;
        if (1 == C1779306xz.LIZ() && !TextUtils.isEmpty(str)) {
            put(str, Boolean.valueOf(z));
        }
    }

    public final void LJ(String str, boolean z) {
        this.LJI = z;
        if (1 == C1779306xz.LIZ() && !TextUtils.isEmpty(str)) {
            put(str, Boolean.valueOf(z));
        }
    }

    public final void LJFF(long j, String str) {
        this.LIZ = j;
        if (1 == C1779306xz.LIZ() && !TextUtils.isEmpty(str)) {
            put(str, Long.valueOf(j));
        }
    }

    public final void LJI(long j, String str) {
        this.LJ = j;
        if (1 == C1779306xz.LIZ() && !TextUtils.isEmpty(str)) {
            put(str, Long.valueOf(j));
        }
    }
}
