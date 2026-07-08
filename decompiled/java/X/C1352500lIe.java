package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0lIe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public /* synthetic */ class C1352500lIe {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1352510lIf.values().length];
        try {
            iArr[EnumC1352510lIf.RECORDING.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
