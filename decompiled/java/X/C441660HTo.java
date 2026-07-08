package X;

import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0HTo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C441660HTo {
    public static final /* synthetic */ int LIZ = 0;

    public static EnumC441650HTn LIZIZ(EnumC441640HTm enumC441640HTm) {
        switch (C441670HTp.LIZ[enumC441640HTm.ordinal()]) {
            case 1:
                return EnumC441650HTn.TYPING_BOX_ICON;
            case 2:
                return EnumC441650HTn.SOCIAL_AVATAR_STICKER_PANEL;
            case 3:
                return EnumC441650HTn.AI_SELF_STICKER_PANEL;
            case 4:
                return EnumC441650HTn.DM_STICKER_DETAIL_PAGE;
            case 5:
                return EnumC441650HTn.DM_STICKER_LONG_PRESS;
            case 6:
                return EnumC441650HTn.REMIX_BUTTON;
            case 7:
                return EnumC441650HTn.FAIL_STATE_STICKER_PANEL;
            case 8:
                return EnumC441650HTn.STORY_REMIX_BUTTON;
            case BdTuring.TYPE_ECAF /* 9 */:
                return EnumC441650HTn.DM_ACTION_BAR;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return EnumC441650HTn.STUDIO_ID_DROPDOWN;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return EnumC441650HTn.DM_STICKER_CREATION_PAGE;
            default:
                throw new C1954807lC();
        }
    }

    public static void LIZ(C2344009Gk c2344009Gk, EnumC441640HTm enumC441640HTm) {
        c2344009Gk.LJIIIIZZ("enter_from", LIZIZ(enumC441640HTm).getParam());
    }
}
