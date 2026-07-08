package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0rrC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public /* synthetic */ class C1604560rrC {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1604570rrD.values().length];
        try {
            iArr[EnumC1604570rrD.OPENED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1604570rrD.CLOSED.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
