package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0GsO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public /* synthetic */ class C429260GsO {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC429250GsN.values().length];
        try {
            iArr[EnumC429250GsN.IS_ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
