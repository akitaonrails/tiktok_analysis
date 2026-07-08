package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0VFm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public /* synthetic */ class C794720VFm {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC794730VFn.values().length];
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
            iArr[EnumC794730VFn.PARALLEL_WRAPPER_MODE.ordinal()] = 1;
        } catch (NoSuchFieldError e3) {
            e = e3;
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            try {
                try {
                } catch (NoSuchFieldError e4) {
                    e = e4;
                }
            } catch (NoSuchFieldError e5) {
                e = e5;
            }
        } catch (NoSuchFieldError e6) {
            e = e6;
        }
        try {
            LIZ[EnumC794730VFn.SERIAL_WRAPPER_MODE.ordinal()] = 2;
        } catch (NoSuchFieldError e7) {
            e = e7;
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
