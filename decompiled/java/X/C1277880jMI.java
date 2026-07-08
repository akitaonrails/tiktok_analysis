package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0jMI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public /* synthetic */ class C1277880jMI {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1277920jMM.values().length];
        try {
            iArr[EnumC1277920jMM.VeLivePushSceneLive.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1277920jMM.VeLivePushSceneLinkMic.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
