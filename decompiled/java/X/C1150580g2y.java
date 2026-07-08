package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0g2y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public /* synthetic */ class C1150580g2y {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1150610g31.values().length];
        try {
            iArr[EnumC1150610g31.TYPE_MAGIC_GIFT_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1150610g31.TYPE_JOIN_ENIGMA.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
