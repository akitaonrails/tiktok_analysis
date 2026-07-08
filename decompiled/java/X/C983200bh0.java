package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0bh0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public /* synthetic */ class C983200bh0 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC974260bSa.values().length];
        try {
            iArr[EnumC974260bSa.PUNISH.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
