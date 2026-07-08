package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0QUp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C671250QUp {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC671240QUo.values().length];
        try {
            iArr[EnumC671240QUo.ON_NAVIGATE_CALLED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC671240QUo.ON_FROM_FRAGMENT_PAUSED.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
