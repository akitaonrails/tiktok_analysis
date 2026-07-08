package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0wUQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public /* synthetic */ class C1782640wUQ {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1782630wUP.values().length];
        try {
            iArr[EnumC1782630wUP.ORIGINAL.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1782630wUP.FIXED.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
