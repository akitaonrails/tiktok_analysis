package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Xaw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class C851600Xaw {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC852910Xd3.values().length];
        try {
            iArr[EnumC852910Xd3.AGE_GATE_LOGIN.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC852910Xd3.AGE_GATE_SIGN_UP.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
