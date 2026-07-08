package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0UWV, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public /* synthetic */ class C0UWV {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC783720Uok.values().length];
        try {
            try {
            } catch (NoSuchFieldError e) {
                e = e;
            }
            try {
                iArr[EnumC783720Uok.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
            }
        } catch (NoSuchFieldError e3) {
            e = e3;
        }
        try {
            try {
            } catch (NoSuchFieldError e4) {
                e = e4;
            }
        } catch (NoSuchFieldError e5) {
            e = e5;
        }
        try {
            iArr[EnumC783720Uok.MANUAL.ordinal()] = 2;
        } catch (NoSuchFieldError e6) {
            e = e6;
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
