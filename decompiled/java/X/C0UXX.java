package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0UXX, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public /* synthetic */ class C0UXX {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1102750enp.values().length];
        try {
            iArr[EnumC1102750enp.AUDIENCE_INTERACTION_FEATURES.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
