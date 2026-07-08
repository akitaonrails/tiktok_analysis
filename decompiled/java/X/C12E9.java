package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12E9, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public /* synthetic */ class C12E9 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C12EA.values().length];
        try {
            iArr[C12EA.SHOW.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C12EA.CLICK.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
