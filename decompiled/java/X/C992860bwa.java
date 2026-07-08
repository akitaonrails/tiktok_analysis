package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0bwa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public /* synthetic */ class C992860bwa {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC992850bwZ.values().length];
        try {
            iArr[EnumC992850bwZ.AD_DISPLAY_TOO_FAST.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC992850bwZ.AD_DISPLAY_COUNT_REACHED.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
