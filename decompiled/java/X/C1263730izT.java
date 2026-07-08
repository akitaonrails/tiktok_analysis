package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0izT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public /* synthetic */ class C1263730izT {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1263720izS.values().length];
        try {
            iArr[EnumC1263720izS.APPENDED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
