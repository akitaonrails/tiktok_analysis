package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.13cO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public /* synthetic */ class C20048213cO {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC20047813cK.values().length];
        try {
            iArr[EnumC20047813cK.Idle.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
