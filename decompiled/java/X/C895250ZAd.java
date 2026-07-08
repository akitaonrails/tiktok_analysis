package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0ZAd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public /* synthetic */ class C895250ZAd {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC895310ZAj.values().length];
        try {
            iArr[EnumC895310ZAj.COUNT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
