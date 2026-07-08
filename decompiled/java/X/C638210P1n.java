package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonTailAction;

/* JADX INFO: renamed from: X.0P1n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public /* synthetic */ class C638210P1n {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[BannerCommonTailAction.BannerActionType.values().length];
        try {
            iArr[BannerCommonTailAction.BannerActionType.BANNER_ACTION_TYPE_ARROW_JUMP.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[BannerCommonTailAction.BannerActionType.BANNER_ACTION_TYPE_TEXT_SELECTION.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
