package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.066v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class C15547066v {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC15548066w.values().length];
        try {
            iArr[EnumC15548066w.StreakPetActionTypeRefreshStreakInfo.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC15548066w.StreakPetActionTypeRefreshStickerSet.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
