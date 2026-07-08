package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0RVi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public /* synthetic */ class C696920RVi {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC696910RVh.values().length];
        try {
            iArr[EnumC696910RVh.ON_SELECTED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
