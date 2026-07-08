package com.bytedance.android.live.effect.navi.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class ProfileNaviFeatureInfo implements Serializable {

    @C09CT("color_picker")
    public ProfileNaviFeatureInfoValue colorPicker;

    @C09CT("effect_id")
    public String effectId;

    @C09CT("flip")
    public ProfileNaviFeatureInfoValue flip;

    @C09CT("inspiration_key")
    public String inspirationKey;

    @C09CT("sliders")
    public List<ProfileNaviFeatureInfoValue> sliders;

    @C09CT("sticker_id")
    public String stickerId;

    public ProfileNaviFeatureInfo() {
        this(null, null, null, null, null, null);
    }

    public final void setColorPicker(ProfileNaviFeatureInfoValue profileNaviFeatureInfoValue) {
        this.colorPicker = profileNaviFeatureInfoValue;
    }

    public final void setEffectId(String str) {
        this.effectId = str;
    }

    public final void setFlip(ProfileNaviFeatureInfoValue profileNaviFeatureInfoValue) {
        this.flip = profileNaviFeatureInfoValue;
    }

    public final void setInspirationKey(String str) {
        this.inspirationKey = str;
    }

    public final void setSliders(List<ProfileNaviFeatureInfoValue> list) {
        this.sliders = list;
    }

    public final void setStickerId(String str) {
        this.stickerId = str;
    }

    public ProfileNaviFeatureInfo(String str, String str2, ProfileNaviFeatureInfoValue profileNaviFeatureInfoValue, ProfileNaviFeatureInfoValue profileNaviFeatureInfoValue2, List<ProfileNaviFeatureInfoValue> list, String str3) {
        this.stickerId = str;
        this.effectId = str2;
        this.colorPicker = profileNaviFeatureInfoValue;
        this.flip = profileNaviFeatureInfoValue2;
        this.sliders = list;
        this.inspirationKey = str3;
    }
}
