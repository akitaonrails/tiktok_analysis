package X;

import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.android.live_settings.LiveSettingModel;
import com.google.gson.q;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0g5W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1152160g5W {
    public final HashMap<String, LiveSettingModel> LIZ = new HashMap<>(5);
    public final HashMap<String, ScopeValue> LIZIZ = new HashMap<>(5);

    public final HashMap<String, ScopeValue> LIZ() {
        if (this.LIZIZ.size() > 0) {
            return this.LIZIZ;
        }
        HashMap<String, ScopeValue> map = this.LIZIZ;
        ScopeValue scopeValue = ScopeValue.BROADCAST;
        map.put("live_board_item_max_input_word", scopeValue);
        this.LIZIZ.put("live_fully_customized_board_item_max_input", scopeValue);
        this.LIZIZ.put("live_mkt_and_qual_to_foundation_board_convert", scopeValue);
        this.LIZIZ.put("live_pcs_decoration_canvas_topoffset", ScopeValue.PCS);
        this.LIZIZ.put("live_secondary_board_item_max_input", scopeValue);
        return this.LIZIZ;
    }

    public final HashMap<String, LiveSettingModel> LIZIZ() {
        if (this.LIZ.size() > 0) {
            return this.LIZ;
        }
        this.LIZ.put("com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.setting.LiveBoardItemMaxInputWordSetting", new LiveSettingModel("live_board_item_max_input_word", "int", new q((Number) 20)));
        this.LIZ.put("com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.setting.LiveFullyCustomizedBoardItemMaxInputSetting", new LiveSettingModel("live_fully_customized_board_item_max_input", "FullyCustomizedInputConfig", new q("")));
        this.LIZ.put("com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.setting.LiveMktAndQualToFoundationBoardConvertSetting", new LiveSettingModel("live_mkt_and_qual_to_foundation_board_convert", "boolean", new q(Boolean.FALSE)));
        this.LIZ.put("com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.setting.LivePcsDecorationCanvasTopOffset", new LiveSettingModel("live_pcs_decoration_canvas_topoffset", "int", new q((Number) 125)));
        this.LIZ.put("com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.setting.LiveSecondaryBoardItemMaxInputSetting", new LiveSettingModel("live_secondary_board_item_max_input", "SecondaryBoardInputConfig", new q("")));
        return this.LIZ;
    }
}
