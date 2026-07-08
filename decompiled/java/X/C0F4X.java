package X;

import Y.ACallableS147S0000000_3;
import android.content.SharedPreferences;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0F4X, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F4X {
    public static ArrayList<EffectModel> LJ() {
        ArrayList<EffectModel> arrayList = new ArrayList<>();
        arrayList.add(LIZLLL(R.drawable.c49, -1, C0CHQ.LIZ.getString(2131850416), CardStruct.IStatusCode.DEFAULT));
        arrayList.add(LIZLLL(C0F4Z.LIZ() ? R.drawable.byo : R.drawable.c64, 0, C0CHQ.LIZ.getString(2131850413), "1"));
        arrayList.add(LIZLLL(C0F4Z.LIZ() ? R.drawable.byn : R.drawable.c62, 1, C0CHQ.LIZ.getString(2131850414), "2"));
        arrayList.add(LIZLLL(C0F4Z.LIZ() ? R.drawable.byp : R.drawable.c63, 2, C0CHQ.LIZ.getString(2131850415), "3"));
        return arrayList;
    }

    public static void LJFF() {
        C0F4Y c0f4y = new C0F4Y(C0CHQ.LIZ);
        C0CHQ.LIZ().getApplicationService().getClass();
        C844470XAv.LIZ.getClass();
        int iLIZLLL = (int) C844470XAv.LIZLLL();
        if (iLIZLLL != ((SharedPreferences) c0f4y.LIZ.getValue()).getInt("fallback_resource_version", -1)) {
            ((SharedPreferences) c0f4y.LIZ.getValue()).edit().putInt("fallback_resource_version", iLIZLLL).apply();
            C0CHQ.LIZ().LJJIL().LJI();
            C15O7.LIZJ(new ACallableS147S0000000_3(2));
        }
    }

    public static int LIZIZ(int i) {
        if (i < 0) {
            i = 0;
        }
        int[] iArrLIZ = C0EZ3.LIZ();
        return iArrLIZ[i % iArrLIZ.length];
    }

    public static int LIZJ(int i, List list) {
        if (list == null) {
            return i;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            if (str.contains("duration:")) {
                return CastIntegerProtector.parseInt(str.substring(9));
            }
        }
        return i;
    }

    public static EffectModel LIZ(int i, Effect effect, String str, String str2) {
        JSONObject jSONObjectOptJSONObject;
        EffectModel effectModel = new EffectModel();
        effectModel.name = effect.getName();
        effectModel.hint = effect.getHint();
        effectModel.key = effect.getEffectId();
        effectModel.resId = effect.getResource_id();
        effectModel.type = 1;
        if (!effect.getIconUrl().getUrlList().isEmpty()) {
            effectModel.iconUrl = (String) ListProtector.get(effect.getIconUrl().getUrlList(), 0);
        }
        effectModel.color = LIZIZ(i);
        effectModel.resDir = effect.getUnzipPath();
        effectModel.duration = LIZJ(LivePreCreateNextRoomPlayer.ENABLE, effect.getTags());
        effectModel.tags = effect.getTags();
        effectModel.category = str;
        effectModel.index = i;
        effectModel.extra = effect.getExtra();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("effect_panel_");
        sbLIZ.append(str);
        effectModel.selectFrom = C2188811AlT.LIZIZ(sbLIZ);
        effectModel.entrancePoint = str2;
        if (effect.getChallenge() != null && !effect.getChallenge().isEmpty()) {
            StringBuilder sb = new StringBuilder();
            Iterator<String> it2 = effect.getChallenge().iterator();
            while (it2.hasNext()) {
                sb.append(it2.next());
                sb.append(",");
            }
            effectModel.challenge = sb.substring(0, sb.length() - 1);
        }
        effectModel.extra = effect.getExtra();
        effectModel.resourceId = effect.getResourceId();
        effectModel.designerId = effect.getDesignerId();
        effectModel.designerEncryptedId = effect.getDesignerEncryptedId();
        effectModel.source = effect.getSource();
        effectModel.recommendReason = effect.getRecommend_reason();
        effectModel.recommendRuleTags = effect.getRecommendRuleTags();
        if (!effect.getFileUrl().getUrlList().isEmpty()) {
            effectModel.fileUrl = (String) ListProtector.get(effect.getFileUrl().getUrlList(), 0);
        }
        C1446130njf.LIZ.getClass();
        effectModel.isNewEngineEffect = Boolean.valueOf(C1446130njf.LIZIZ(effect, "if_capcut", false));
        effectModel.isGoToCapCutEffect = C1446130njf.LIZIZ(effect, "if_goto_capcut", false);
        effectModel.gameplayAlgorithm = C1446130njf.LJFF(effect, "gameplay_algorithm");
        effectModel.videoAnimType = C1446130njf.LJFF(effect, "video_anim_type");
        JSONObject jSONObjectLJIIIZ = C1446130njf.LJIIIZ(effect);
        if (jSONObjectLJIIIZ != null && jSONObjectLJIIIZ.length() > 0 && (jSONObjectOptJSONObject = jSONObjectLJIIIZ.optJSONObject("setting")) != null) {
            effectModel.videoAnimDefaultDuration = jSONObjectOptJSONObject.optDouble("animation_duration", 0.0d);
        }
        if (effectModel.isNewEngineEffect.booleanValue()) {
            effectModel.adjustParams = C369900Eeq.LIZ(effect);
        }
        return effectModel;
    }

    public static EffectModel LIZLLL(int i, int i2, String str, String str2) {
        EffectModel effectModel = new EffectModel();
        effectModel.name = str;
        effectModel.type = 2;
        effectModel.category = "time";
        effectModel.key = str2;
        effectModel.imagePath = i;
        effectModel.index = i2;
        effectModel.entrancePoint = "edit_page_panel";
        effectModel.selectFrom = "effect_panel_time";
        return effectModel;
    }
}
