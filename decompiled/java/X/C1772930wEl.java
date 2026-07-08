package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0wEl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public /* synthetic */ class C1772930wEl {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1772920wEk.values().length];
        try {
            iArr[EnumC1772920wEk.REPLACE_IN_PLACE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1772920wEk.REMOVE_AND_ADD_LAST.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
