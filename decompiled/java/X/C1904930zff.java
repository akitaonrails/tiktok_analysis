package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0zff, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public /* synthetic */ class C1904930zff {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1904890zfb.values().length];
        try {
            iArr[EnumC1904890zfb.LONG_PRESS.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1904890zfb.DOUBLE_CLICK.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
