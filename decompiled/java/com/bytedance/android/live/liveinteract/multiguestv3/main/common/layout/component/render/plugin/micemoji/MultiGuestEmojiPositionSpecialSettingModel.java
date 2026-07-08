package com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.render.plugin.micemoji;

import X.C09CT;
import X.C2188811AlT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestEmojiPositionSpecialSettingModel {

    @C09CT("audio")
    public final Map<String, MultiGuestEmojiPositionModel> audioSetting;

    @C09CT("video")
    public final Map<String, MultiGuestEmojiPositionModel> videoSetting;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiGuestEmojiPositionSpecialSettingModel)) {
            return false;
        }
        MultiGuestEmojiPositionSpecialSettingModel multiGuestEmojiPositionSpecialSettingModel = (MultiGuestEmojiPositionSpecialSettingModel) obj;
        return Intrinsics.LJFF(this.audioSetting, multiGuestEmojiPositionSpecialSettingModel.audioSetting) && Intrinsics.LJFF(this.videoSetting, multiGuestEmojiPositionSpecialSettingModel.videoSetting);
    }

    public final int hashCode() {
        return (this.audioSetting.hashCode() * 31) + this.videoSetting.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiGuestEmojiPositionSpecialSettingModel(audioSetting=");
        sbLIZ.append(this.audioSetting);
        sbLIZ.append(", videoSetting=");
        sbLIZ.append(this.videoSetting);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MultiGuestEmojiPositionSpecialSettingModel(Map<String, MultiGuestEmojiPositionModel> map, Map<String, MultiGuestEmojiPositionModel> map2) {
        this.audioSetting = map;
        this.videoSetting = map2;
    }
}
