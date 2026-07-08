package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0PvR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public /* synthetic */ class C660470PvR {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC660440PvO.values().length];
        try {
            iArr[EnumC660440PvO.AUTO.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC660440PvO.CONST_DARK.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
