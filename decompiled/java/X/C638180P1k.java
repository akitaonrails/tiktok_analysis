package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0P1k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public /* synthetic */ class C638180P1k {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC638200P1m.values().length];
        try {
            iArr[EnumC638200P1m.SECONDARY.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
