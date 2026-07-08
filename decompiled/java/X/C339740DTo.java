package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0DTo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public /* synthetic */ class C339740DTo {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC339730DTn.values().length];
        try {
            iArr[EnumC339730DTn.ONLY_CREATE_BTN.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC339730DTn.CREATE_BTN_WITH_AI.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
