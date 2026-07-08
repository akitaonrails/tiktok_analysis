package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0wnC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public /* synthetic */ class C1794280wnC {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1794260wnA.values().length];
        LIZ = iArr;
        try {
            iArr[EnumC1794260wnA.EXTRA_QUERY.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZ[EnumC1794260wnA.EXTRA_TOKEN.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }
}
