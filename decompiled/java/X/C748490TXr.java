package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0TXr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public /* synthetic */ class C748490TXr {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC748580TYa.values().length];
        try {
            iArr[EnumC748580TYa.GIFT_REMINDER.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
