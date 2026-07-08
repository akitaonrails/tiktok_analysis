package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.model.PostModeEntranceMechanism;

/* JADX INFO: renamed from: X.0SKD, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public /* synthetic */ class C0SKD {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[PostModeEntranceMechanism.values().length];
        try {
            iArr[PostModeEntranceMechanism.EXPLORE_CARD.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[PostModeEntranceMechanism.SEARCH_TAB_CARD_GENERAL.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[PostModeEntranceMechanism.SEARCH_TAB_CARD.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[PostModeEntranceMechanism.NEARBY_CARD.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
