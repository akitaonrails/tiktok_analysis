package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Vgf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public /* synthetic */ class C804190Vgf {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC804170Vgd.values().length];
        try {
            iArr[EnumC804170Vgd.ENTER.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
