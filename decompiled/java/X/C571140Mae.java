package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Mae, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public /* synthetic */ class C571140Mae {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC571120Mac.values().length];
        try {
            iArr[EnumC571120Mac.REQUIRE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC571120Mac.REJECT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
