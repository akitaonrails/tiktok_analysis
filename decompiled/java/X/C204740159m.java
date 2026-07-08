package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.159m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public /* synthetic */ class C204740159m {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC204738159k.values().length];
        try {
            iArr[EnumC204738159k.RUNNING_STATE_WITH_COUNT_DOWN_ANIAMTION.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC204738159k.RUNNING_STATE_WITHOUT_COUNT_DOWN.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC204738159k.RUNNING_STATE_SHOW_TIME.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
