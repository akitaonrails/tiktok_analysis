package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0jEl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public /* synthetic */ class C1273210jEl {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1273220jEm.values().length];
        try {
            iArr[EnumC1273220jEm.EFFECT_MIX.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
