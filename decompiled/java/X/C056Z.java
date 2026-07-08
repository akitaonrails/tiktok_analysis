package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.056Z, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class C056Z {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC12978056a.values().length];
        try {
            iArr[EnumC12978056a.NO_PERMISSION.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC12978056a.SILENT_MODE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
