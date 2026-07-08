package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.json.EnsureLoad;
import com.tiktok.json.gson.cpp.GsonNative;

/* JADX INFO: renamed from: X.08JY, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08JY {
    static {
        EnsureLoad.init();
    }

    public static final long LIZ(int i) {
        return GsonNative.create(false, i);
    }

    public static final void LIZJ(long j) {
        try {
            GsonNative.release(j);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
