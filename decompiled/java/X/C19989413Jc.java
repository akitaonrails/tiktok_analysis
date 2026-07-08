package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.13Jc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public /* synthetic */ class C19989413Jc {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC19989213Ja.values().length];
        try {
            iArr[EnumC19989213Ja.IN.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC19989213Ja.INVARIANT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC19989213Ja.OUT.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
