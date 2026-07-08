package com.bytedance.android.live.base.model.user;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class CombineBadgeStruct {

    @C09CT("arrow_config")
    public ArrowConfig arrowConfig;

    @C09CT("background")
    public CombineBadgeBackground background;

    @C09CT("background_dark_mode")
    public CombineBadgeBackground backgroundDarkMode;

    @C09CT("display_type")
    public int badgeDisplayType;

    @C09CT("background_auto_mirrored")
    public Boolean bgAutoMirrored;

    @C09CT("font_style")
    public FontStyle fontStyle;

    @C09CT("icon")
    public ImageModel icon;

    @C09CT("icon_auto_mirrored")
    public Boolean iconAutoMirrored;

    @C09CT("multi_guest_show_style")
    public Integer multiGuestShowStyle;

    @C09CT("padding")
    public PaddingInfo padding;

    @C09CT("padding_new_font")
    public PaddingInfo paddingNewFont;

    @C09CT("personal_card_show_style")
    public Integer personalCardShowStyle;

    @C09CT("profile_card_panel")
    public ProfileCardPanel profileCardPanel;

    @C09CT("public_screen_show_style")
    public Integer publicScreenShowStyle;

    @C09CT("ranklist_online_audience_show_style")
    public Integer rankListOnlineAudienceShowStyle;

    @C09CT("str")
    public String str;

    @C09CT("text")
    public BadgeText text;
}
