package com.bytedance.android.live.base.model.user;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class AvatarFrame {

    @C09CT("image")
    public ImageModel image;

    @C09CT("level")
    public int level;

    @C09CT("personal_card_v1")
    public ImageModel personalCardV1;

    @C09CT("personal_card_v2")
    public ImageModel personalCardV2;

    @C09CT("profile_decoration_ribbon")
    public ImageModel profileDecorationRibbon;

    @C09CT("debut_animation_url")
    public String debutAnimationUrl = "";

    @C09CT("avatar_background_border_color")
    public String avatarBackgroundBorderColor = "";

    @C09CT("avatar_background_color")
    public String avatarBackgroundColor = "";
}
