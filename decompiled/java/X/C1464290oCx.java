package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0oCx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public /* synthetic */ class C1464290oCx {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1464490oDH.values().length];
        try {
            iArr[EnumC1464490oDH.VIDEO_OUT_RATIO_1_1.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1464490oDH.VIDEO_OUT_RATIO_4_3.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC1464490oDH.VIDEO_OUT_RATIO_3_4.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC1464490oDH.VIDEO_OUT_RATIO_16_9.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[EnumC1464490oDH.VIDEO_OUT_RATIO_9_16.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        LIZ = iArr;
    }
}
