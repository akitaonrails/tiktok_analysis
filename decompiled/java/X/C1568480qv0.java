package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0qv0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public /* synthetic */ class C1568480qv0 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1568470quz.values().length];
        try {
            iArr[EnumC1568470quz.CHUNK_INIT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
