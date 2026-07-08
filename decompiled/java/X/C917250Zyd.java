package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Zyd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public /* synthetic */ class C917250Zyd {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[EnumC940090aZT.values().length];
        try {
            iArr[EnumC940090aZT.SEARCH.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
        int[] iArr2 = new int[EnumC918830a1B.values().length];
        try {
            iArr2[EnumC918830a1B.CAN_APPLY.ordinal()] = 1;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr2[EnumC918830a1B.CANNOT_APPLY.ordinal()] = 2;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZIZ = iArr2;
    }
}
