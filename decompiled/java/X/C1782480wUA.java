package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0wUA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public /* synthetic */ class C1782480wUA {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1782450wU7.values().length];
        try {
            iArr[EnumC1782450wU7.SUBSCRIPTION.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
