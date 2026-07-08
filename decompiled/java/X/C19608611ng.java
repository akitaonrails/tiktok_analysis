package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11ng, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public /* synthetic */ class C19608611ng {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC19589411ka.values().length];
        try {
            iArr[EnumC19589411ka.PREVIEW.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC19589411ka.INTERACT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
