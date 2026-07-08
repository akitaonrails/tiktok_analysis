package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Tls, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public /* synthetic */ class C756460Tls {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC756450Tlr.values().length];
        try {
            iArr[EnumC756450Tlr.LEADS_GEN_AUDIENCE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC756450Tlr.LEADS_GEN_BA_DURING_LIVE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
