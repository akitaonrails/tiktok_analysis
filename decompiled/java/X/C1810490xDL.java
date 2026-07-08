package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0xDL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public /* synthetic */ class C1810490xDL {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1811400xEo.values().length];
        try {
            iArr[EnumC1811400xEo.GIFT_RANK.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
