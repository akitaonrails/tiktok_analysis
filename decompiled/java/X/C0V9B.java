package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0V9B, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public /* synthetic */ class C0V9B {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC792980V8u.values().length];
        LIZ = iArr;
        try {
            try {
            } catch (NoSuchFieldError e) {
                e = e;
            }
        } catch (NoSuchFieldError e2) {
            e = e2;
        }
        try {
            iArr[EnumC792980V8u.NOT_DETECTED.ordinal()] = 1;
        } catch (NoSuchFieldError e3) {
            e = e3;
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
