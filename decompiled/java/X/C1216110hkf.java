package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0hkf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public /* synthetic */ class C1216110hkf {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1216660hlY.values().length];
        try {
            iArr[EnumC1216660hlY.CANCELED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
