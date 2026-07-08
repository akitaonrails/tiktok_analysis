package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0bU3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public /* synthetic */ class C975170bU3 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC975150bU1.values().length];
        try {
            iArr[EnumC975150bU1.NO_MATCH_WHEN_IN_TAKE_STAGE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC975150bU1.NO_MATCH_WHEN_IN_CATCH_BEAN.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC975150bU1.NO_TAKE_STAGE_WHEN_IN_MATCH.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC975150bU1.NO_CATCH_BEAN_WHEN_IN_MATCH.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[EnumC975150bU1.NO_TAKE_STAGE_WHEN_IN_MG_AND_COHOST.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr[EnumC975150bU1.NO_CATCH_BEAN_WHEN_IN_MG_AND_COHOST.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr[EnumC975150bU1.IN_COHOST_INVITING_OR_APPLYING.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        LIZ = iArr;
    }
}
