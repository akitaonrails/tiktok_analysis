package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0qHz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1544290qHz {
    public static final EnumC1544180qHo LIZ(String str) {
        try {
            return EnumC1544180qHo.valueOf(str);
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return EnumC1544180qHo.MAIN_THREAD;
        }
    }
}
