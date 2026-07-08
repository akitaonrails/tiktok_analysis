package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0YoC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public /* synthetic */ class C885300YoC {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC885270Yo9.values().length];
        try {
            iArr[EnumC885270Yo9.READ_ALL.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC885270Yo9.UNREAD_SELECTED.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC885270Yo9.READ_SELECTED.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
