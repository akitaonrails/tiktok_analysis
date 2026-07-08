package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0FWh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public /* synthetic */ class C391410FWh {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC391400FWg.values().length];
        try {
            iArr[EnumC391400FWg.RECORD.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
