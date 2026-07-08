package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0uZz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public /* synthetic */ class C1709210uZz {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1709200uZy.values().length];
        try {
            iArr[EnumC1709200uZy.PAY_NOW.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
