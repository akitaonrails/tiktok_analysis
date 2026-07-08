package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0HyT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public /* synthetic */ class C458510HyT {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC458500HyS.values().length];
        try {
            iArr[EnumC458500HyS.ALWAYS_TAKE_UP_SPACE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC458500HyS.TAKE_UP_SPACE_WHEN_TIP.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
