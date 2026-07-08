package X;

import com.bytedance.android.live.effect.model.LiveGoalInfo;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;

/* JADX INFO: renamed from: X.0UEw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C769080UEw {
    public static final String LIZ(LiveGoalInfo liveGoalInfo) {
        if (liveGoalInfo == null) {
            return null;
        }
        return GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, liveGoalInfo);
    }

    public static final n LIZJ(String str) {
        if (str == null) {
            return null;
        }
        try {
            return (n) C19748512Ol.LIZIZ.LJII(str, n.class);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static final <T> T LIZIZ(k kVar, Class<T> cls) {
        T t = null;
        if (kVar == null) {
            return null;
        }
        try {
            t = (T) C19748512Ol.LIZIZ.LIZJ(kVar, cls);
            return t;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return t;
        }
    }
}
