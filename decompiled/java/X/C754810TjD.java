package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0TjD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public /* synthetic */ class C754810TjD {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC754820TjE.values().length];
        try {
            iArr[EnumC754820TjE.HASHTAG_LIST.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC754820TjE.GAME_CATEGORY_LIST.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
