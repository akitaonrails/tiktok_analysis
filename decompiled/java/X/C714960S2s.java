package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0S2s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public /* synthetic */ class C714960S2s {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC714970S2t.values().length];
        try {
            iArr[EnumC714970S2t.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC714970S2t.SHOW.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC714970S2t.REPLACE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC714970S2t.HIDE.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
