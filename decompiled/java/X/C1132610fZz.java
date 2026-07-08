package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0fZz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public /* synthetic */ class C1132610fZz {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1132600fZy.values().length];
        try {
            iArr[EnumC1132600fZy.SCENE_1_GIFT_PANEL.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1132600fZy.SCENE_3_LIVE_GOAL.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
