package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0YVL, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public /* synthetic */ class C0YVL {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC871430YGn.values().length];
        try {
            iArr[EnumC871430YGn.ALL_RISKY.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
