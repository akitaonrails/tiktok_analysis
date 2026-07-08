package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0pl2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public /* synthetic */ class C1523860pl2 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1067640dtC.values().length];
        try {
            iArr[EnumC1067640dtC.WEB.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
