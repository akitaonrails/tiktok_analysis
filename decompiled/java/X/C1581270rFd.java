package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0rFd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public /* synthetic */ class C1581270rFd {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1581260rFc.values().length];
        try {
            iArr[EnumC1581260rFc.OVERLAY.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
