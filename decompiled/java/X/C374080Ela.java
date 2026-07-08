package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Ela, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public /* synthetic */ class C374080Ela {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC373830ElB.values().length];
        try {
            iArr[EnumC373830ElB.ERASER.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
