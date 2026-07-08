package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonTailAction;

/* JADX INFO: renamed from: X.0SGa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public /* synthetic */ class C718420SGa {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[BannerCommonTailAction.BannerActionType.values().length];
        try {
            iArr[BannerCommonTailAction.BannerActionType.BANNER_ACTION_TYPE_ARROW_JUMP.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = iArr;
    }
}
