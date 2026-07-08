package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitConsumptionModel;
import com.ss.android.ugc.aweme.portrait.route.AIPortraitEnterParams;

/* JADX INFO: renamed from: X.0Lt8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C557120Lt8 {
    public static AIPortraitEnterParams LIZ(Bundle bundle) {
        return new AIPortraitEnterParams(bundle.getString("cameo_id"), bundle.getString("cameo_image"), bundle.getString("creation_id"), (AIGCEntranceInfo) bundle.getParcelable("entrance_info"), (AIPortraitConsumptionModel) bundle.getParcelable("consumption_model"), bundle.getBoolean("is_free_create", false), bundle.getParcelable("style_item"), bundle.getString("theme_mode"));
    }
}
