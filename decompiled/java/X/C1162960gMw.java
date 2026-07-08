package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0gMw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public /* synthetic */ class C1162960gMw {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1162970gMx.values().length];
        try {
            iArr[EnumC1162970gMx.CLIENT_OVERRIDES_FIRST.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1162970gMx.SCHEMA_PARAMS_FIRST.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
