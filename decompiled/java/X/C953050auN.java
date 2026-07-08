package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0auN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public /* synthetic */ class C953050auN {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC952890au7.values().length];
        try {
            iArr[EnumC952890au7.DESIGN_PANEL.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
