package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1AIn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public /* synthetic */ class C2177151AIn {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC2177131AIl.values().length];
        try {
            iArr[EnumC2177131AIl.AVATAR_NUMBER_TAIL.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC2177131AIl.NUMBER_TAIL.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC2177131AIl.NUMBER_TAIL_SEPARATE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
