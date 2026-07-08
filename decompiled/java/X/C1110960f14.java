package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0f14, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public /* synthetic */ class C1110960f14 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1110950f13.values().length];
        try {
            iArr[EnumC1110950f13.OPERATION_STATE_INITIAL_STATUS.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
