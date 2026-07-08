package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0ag4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public /* synthetic */ class C944180ag4 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC944170ag3.values().length];
        try {
            iArr[EnumC944170ag3.STALL_LIVE_TO_LINKMIC.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC944170ag3.STALL_LINKMIC_TO_LIVE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC944170ag3.STALL_LINKMIC_CHANGE_LAYOUT.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
