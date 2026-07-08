package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ApplicationInfo;
import com.bytedance.android.widget.Widget;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fMK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1124140fMK {
    public static final Set<String> LIZ = C093Y.LJ("GiftWidget", "LiveNewVideoGiftWidget", "LiveGiftEffectWidget", "LiveNewSpecialGiftWidget", "NormalGiftAnimWidget", "LiveNewGiftBottomWidget", "LiveNewGiftGuestInfoWidget", "LiveNewGiftPageIndicatorWidget", "LiveNewGiftPanelWidget", "LiveGiftBottomWidget", "LiveGiftPanelWidget", "LiveGiftGuestInfoWidget", "LiveFirstRechargeWidget", "LiveGiftTrayWidget", "SocialAnchorWidget", "SocialGuestWidget", "FrameSlotWidget", "FrameL2SlotWidget", "FrameL3SlotWidget", "LiveMaskLayerWidget", "OnlineAudienceRankWidget", "HourlyRankWidget", "RankEntranceWidget", "SurveyCardWidget", "LiveGiftTopWidget", "LiveGiftPanelWidgetV2", "LiveGiftBottomWidget");

    public static final C19EG LIZ(Context context) {
        if (context instanceof C19EG) {
            return (C19EG) context;
        }
        if (context instanceof ContextWrapper) {
            return LIZ(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static final boolean LIZIZ(Class<? extends Widget> cls) {
        return LIZ.contains(cls.getSimpleName());
    }

    public static final boolean LIZJ(Context context) {
        ApplicationInfo applicationInfo;
        if (context == null || (applicationInfo = context.getApplicationInfo()) == null || (applicationInfo.flags & 2) == 0) {
            return false;
        }
        return true;
    }

    public static final boolean LIZLLL(Context context) {
        if (context == null) {
            return false;
        }
        if (!Intrinsics.LJFF(C786410Ut5.t2(context.getResources().getConfiguration().locale), "ar") && context.getResources().getConfiguration().getLayoutDirection() != 1) {
            return false;
        }
        return true;
    }
}
