package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0bxY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public /* synthetic */ class C993460bxY {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC993450bxX.values().length];
        try {
            iArr[EnumC993450bxX.TYPE_NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC993450bxX.TYPE_LARGE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
