package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0p2o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public /* synthetic */ class C1496440p2o {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1496430p2n.values().length];
        try {
            iArr[EnumC1496430p2n.NETWORK_METHOD_INIT_TTNET_DURATION.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1496430p2n.NETWORK_INIT_TO_INIT_TTNET.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC1496430p2n.NETWORK_INIT_TTNET_DURATION.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC1496430p2n.NETWORK_BOOT_TO_INIT_TTNET.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[EnumC1496430p2n.NETWORK_BOOT_TO_INIT_TTNET_END.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr[EnumC1496430p2n.NETWORK_INIT_TTNET_END_TO_NETWORK.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr[EnumC1496430p2n.NETWORK_INIT_SEC_DURATION.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        LIZ = iArr;
    }
}
