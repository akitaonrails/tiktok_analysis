package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0bB0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public /* synthetic */ class C963360bB0 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC963350bAz.values().length];
        try {
            iArr[EnumC963350bAz.ENLARGED_COHOST.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
