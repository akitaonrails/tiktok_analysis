package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0c0C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public /* synthetic */ class C995100c0C {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC995090c0B.values().length];
        try {
            iArr[EnumC995090c0B.RED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
