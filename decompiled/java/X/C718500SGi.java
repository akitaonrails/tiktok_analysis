package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonTailAction;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonText;

/* JADX INFO: renamed from: X.0SGi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public /* synthetic */ class C718500SGi {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[BannerCommonText.BannerTextActionType.values().length];
        try {
            iArr[BannerCommonText.BannerTextActionType.BANNER_TEXT_ACTION_TYPE_SCHEMA_JUMP.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[BannerCommonText.BannerTextActionType.BANNER_TEXT_ACTION_TYPE_NONE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
        int[] iArr2 = new int[BannerCommonTailAction.BannerActionType.values().length];
        try {
            iArr2[BannerCommonTailAction.BannerActionType.BANNER_ACTION_TYPE_ARROW_JUMP.ordinal()] = 1;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr2[BannerCommonTailAction.BannerActionType.BANNER_ACTION_TYPE_BUTTON_SELECTION.ordinal()] = 2;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr2[BannerCommonTailAction.BannerActionType.BANNER_ACTION_TYPE_TEXT_SELECTION.ordinal()] = 3;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr2[BannerCommonTailAction.BannerActionType.BANNER_ACTION_TYPE_CLOSE.ordinal()] = 4;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr2[BannerCommonTailAction.BannerActionType.BANNER_ACTION_TYPE_UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            iArr2[BannerCommonTailAction.BannerActionType.BANNER_ACTION_TYPE_CUSTOM.ordinal()] = 6;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        try {
            iArr2[BannerCommonTailAction.BannerActionType.BANNER_ACTION_TYPE_SEARCH_TAKO_TEXT_ICON.ordinal()] = 7;
        } catch (NoSuchFieldError e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        LIZIZ = iArr2;
    }
}
