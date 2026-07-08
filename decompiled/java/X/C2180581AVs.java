package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1AVs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public /* synthetic */ class C2180581AVs {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC2180541AVo.values().length];
        try {
            iArr[EnumC2180541AVo.V_VISIBLITY.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC2180541AVo.V_ALPHA.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC2180541AVo.V_ANIMATE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
