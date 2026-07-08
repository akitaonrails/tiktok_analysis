package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0LHI, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public /* synthetic */ class C0LHI {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC442280HVy.values().length];
        try {
            iArr[EnumC442280HVy.GRANTED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
