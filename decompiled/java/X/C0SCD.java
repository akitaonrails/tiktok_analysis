package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0SCD, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public /* synthetic */ class C0SCD {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC207101162h.values().length];
        try {
            iArr[EnumC207101162h.DIRECT_MESSAGE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
