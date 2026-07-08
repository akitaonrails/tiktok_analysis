package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0vJO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public /* synthetic */ class C1737360vJO {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1736950vIj.values().length];
        try {
            iArr[EnumC1736950vIj.EFFECT_ICON_FEMALE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1736950vIj.EFFECT_ICON_MALE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
