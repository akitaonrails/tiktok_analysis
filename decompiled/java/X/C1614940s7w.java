package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0s7w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public /* synthetic */ class C1614940s7w {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1614900s7s.values().length];
        try {
            iArr[EnumC1614900s7s.REACTIVATE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
