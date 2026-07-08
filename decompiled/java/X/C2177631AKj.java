package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1AKj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public /* synthetic */ class C2177631AKj {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC2177591AKf.values().length];
        try {
            iArr[EnumC2177591AKf.CRITICAL.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
