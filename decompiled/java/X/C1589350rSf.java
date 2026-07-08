package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0rSf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public /* synthetic */ class C1589350rSf {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1589340rSe.values().length];
        try {
            iArr[EnumC1589340rSe.CONFIG_CHANGE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
