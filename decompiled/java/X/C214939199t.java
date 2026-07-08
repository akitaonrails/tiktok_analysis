package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.199t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public /* synthetic */ class C214939199t {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC214943199x.values().length];
        LIZ = iArr;
        try {
            iArr[EnumC214943199x.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZ[EnumC214943199x.CREATED.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            LIZ[EnumC214943199x.VIEW_CREATED.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            LIZ[EnumC214943199x.ACTIVITY_CREATED.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            LIZ[EnumC214943199x.STARTED.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            LIZ[EnumC214943199x.RESUMED.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
    }
}
