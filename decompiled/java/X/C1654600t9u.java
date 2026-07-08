package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import pyl.s;

/* JADX INFO: renamed from: X.0t9u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public /* synthetic */ class C1654600t9u {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[s.values().length];
        try {
            iArr[s.SLOW.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[s.NORMAL.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[s.FAST.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
