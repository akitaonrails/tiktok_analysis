package com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.render.plugin.micemoji;

import X.C09CT;
import X.C2188811AlT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestEmojiPositionSettingModel {

    @C09CT("common")
    public final Map<Integer, MultiGuestEmojiPositionModel> commonSetting;

    @C09CT("special")
    public final MultiGuestEmojiPositionSpecialSettingModel specialSetting;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiGuestEmojiPositionSettingModel)) {
            return false;
        }
        MultiGuestEmojiPositionSettingModel multiGuestEmojiPositionSettingModel = (MultiGuestEmojiPositionSettingModel) obj;
        return Intrinsics.LJFF(this.commonSetting, multiGuestEmojiPositionSettingModel.commonSetting) && Intrinsics.LJFF(this.specialSetting, multiGuestEmojiPositionSettingModel.specialSetting);
    }

    public final int hashCode() {
        return (this.commonSetting.hashCode() * 31) + this.specialSetting.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiGuestEmojiPositionSettingModel(commonSetting=");
        sbLIZ.append(this.commonSetting);
        sbLIZ.append(", specialSetting=");
        sbLIZ.append(this.specialSetting);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MultiGuestEmojiPositionSettingModel(Map<Integer, MultiGuestEmojiPositionModel> map, MultiGuestEmojiPositionSpecialSettingModel multiGuestEmojiPositionSpecialSettingModel) {
        this.commonSetting = map;
        this.specialSetting = multiGuestEmojiPositionSpecialSettingModel;
    }
}
