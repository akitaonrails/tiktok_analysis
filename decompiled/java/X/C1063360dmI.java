package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0dmI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public /* synthetic */ class C1063360dmI {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1063300dmC.values().length];
        try {
            iArr[EnumC1063300dmC.ALL.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
