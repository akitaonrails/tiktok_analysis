package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Pyf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public /* synthetic */ class C662470Pyf {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC662460Pye.values().length];
        try {
            iArr[EnumC662460Pye.EXTRA_STATUS_PARENT_BLOCKED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC662460Pye.EXTRA_STATUS_PARENT_UNBLOCK_REQUESTING.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC662460Pye.EXTRA_STATUS_NONE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
