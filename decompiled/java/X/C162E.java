package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.162E, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public /* synthetic */ class C162E {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[AnonymousClass1629.values().length];
        try {
            iArr[AnonymousClass1629.CLICK_EXPAND.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[AnonymousClass1629.TOGGLE_ENABLE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
