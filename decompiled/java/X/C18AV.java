package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.18AV, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public /* synthetic */ class C18AV {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC21239918Ab.values().length];
        try {
            iArr[EnumC21239918Ab.STRING.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC21239918Ab.INT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
