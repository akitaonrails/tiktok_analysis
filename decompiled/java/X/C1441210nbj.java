package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerCommerceBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tiktok.eventtracking.ab.EffectETGroupEnableConfig;
import com.ss.android.ugc.tiktok.eventtracking.group.PropBasicParamGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0nbj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1441210nbj {
    public static FaceStickerBean LIZ(Effect effect) {
        return LIZIZ(effect, "", null, null);
    }

    public static Effect LIZJ(List<Effect> list) {
        if (C2401009ay.LIZ(list)) {
            return null;
        }
        for (Effect effect : list) {
            if (!C1624570sNT.LJJIFFI(effect)) {
                return effect;
            }
        }
        return (Effect) ListProtector.get(list, 0);
    }

    public static FaceStickerBean LIZIZ(Effect effect, String str, String str2, String str3) {
        int source;
        List<String> types;
        Map<String, Object> mapLIZJ;
        if (effect != null && !C1624570sNT.LJIIL(effect)) {
            FaceStickerBean faceStickerBean = new FaceStickerBean();
            if (C1624360sN8.LIZ.get(effect.getEffectId()) != null) {
                String effectId = effect.getEffectId();
                HashMap<String, String> map = C1624360sN8.LIZIZ;
                if (map.get(effectId) != null) {
                    faceStickerBean.setForceBindMusicPath(map.get(effect.getEffectId()));
                }
            }
            faceStickerBean.setForceBind(C1624200sMs.LJIILL(effect));
            faceStickerBean.setDesignerId(effect.getDesignerId());
            String extra = effect.getExtra();
            if (extra != null && !extra.isEmpty()) {
                try {
                    C1446130njf.LIZ.getClass();
                    String strLJFF = C1446130njf.LJFF(effect, "mobile_tool_template_biz_type");
                    if (strLJFF == null || strLJFF.isEmpty() || !"ame".equals(strLJFF)) {
                        source = effect.getSource();
                    } else {
                        source = 102;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    source = effect.getSource();
                }
            } else {
                source = effect.getSource();
            }
            faceStickerBean.setSource(source);
            faceStickerBean.setFromSource(effect.getFromSource());
            faceStickerBean.setSchema(effect.getSchema());
            faceStickerBean.setResourceID(effect.getResourceId());
            faceStickerBean.setMetTemplateResourceId(str2);
            faceStickerBean.setEffectPublishTime(Long.valueOf(effect.getPublishTime()));
            if (TextUtils.isEmpty(effect.getRecId())) {
                faceStickerBean.setRecId(CardStruct.IStatusCode.DEFAULT);
            } else {
                faceStickerBean.setRecId(effect.getRecId());
            }
            faceStickerBean.setBusi(effect.isBusiness());
            faceStickerBean.setUseVoiceRecognizeSticker(C1624570sNT.LJJIIZ(effect));
            faceStickerBean.setAdRawData(effect.getAdRawData());
            faceStickerBean.setFaceStickerCommerceBean((FaceStickerCommerceBean) GsonProtectorUtils.fromJson(new Gson(), effect.getExtra(), FaceStickerCommerceBean.class));
            faceStickerBean.setIconUrl(C1441230nbl.LIZ(effect.getIconUrl()));
            faceStickerBean.setFileUrl(C1441230nbl.LIZ(effect.getFileUrl()));
            try {
                faceStickerBean.setStickerId(CastLongProtector.parseLong(effect.getEffectId()));
            } catch (NumberFormatException e2) {
                TryCatchGuardChecker.doCheck(e2);
                faceStickerBean.setStickerId(-1L);
            }
            faceStickerBean.setId(effect.getId());
            if (!TextUtils.isEmpty(effect.getSearchType())) {
                faceStickerBean.setPropSource(effect.getSearchType());
            } else if (!TextUtils.isEmpty(str)) {
                faceStickerBean.setPropSource(str);
            } else {
                faceStickerBean.setPropSource(FaceStickerBean.sCurPropSource);
            }
            if (!TextUtils.isEmpty(FaceStickerBean.sSlideCurrentEffectId) && TextUtils.equals(FaceStickerBean.sSlideCurrentEffectId, effect.getEffectId())) {
                faceStickerBean.setTabType("slide_bar");
            }
            faceStickerBean.setMusicIds(effect.getMusic());
            faceStickerBean.setName(effect.getName());
            faceStickerBean.setHint(effect.getHint());
            faceStickerBean.setHintIcon(C1441230nbl.LIZ(effect.getHintIcon()));
            faceStickerBean.setLocalPath(effect.getUnzipPath());
            if (effect.getTypes() == null) {
                types = new ArrayList<>();
            } else {
                types = effect.getTypes();
            }
            faceStickerBean.setTypes(types);
            faceStickerBean.setTags(effect.getTags());
            faceStickerBean.setChildren(effect.getChildren());
            faceStickerBean.setEffectType(effect.getEffectType());
            faceStickerBean.setParentId(effect.getParentId());
            faceStickerBean.setExtra(effect.getExtra());
            faceStickerBean.setSdkExtra(effect.getSdkExtra());
            faceStickerBean.setGradeKey(effect.getGradeKey());
            faceStickerBean.setRequirements(effect.getRequirements());
            faceStickerBean.setProvider(Long.valueOf(effect.getProvider()));
            faceStickerBean.setPackageSize(Long.valueOf(effect.getPackage_size()));
            faceStickerBean.setRecommendReason(effect.getRecommend_reason());
            faceStickerBean.setRecommendRuleTags(effect.getRecommendRuleTags());
            faceStickerBean.setTabKey(str3);
            faceStickerBean.setEffectLabel(effect.getEffectLabel());
            faceStickerBean.setGraphNodes(effect.getGraphNodes());
            if (EffectETGroupEnableConfig.isEnabled()) {
                PropBasicParamGroup.Companion.getClass();
                Map<String, Object> mapKeyParams = C1441220nbk.LIZ(effect).keyParams();
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, Object> entry : mapKeyParams.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (value != null) {
                        arrayList.add(new Pair(key, value));
                    }
                }
                mapLIZJ = C2097608Jq.LJIILLIIL(arrayList);
            } else {
                mapLIZJ = C2097908Jt.LIZJ(new Pair("prop_panel_model_request_id", effect.getLogId()));
            }
            faceStickerBean.setBasicEventParam(mapLIZJ);
            faceStickerBean.setIsCachedData(Boolean.valueOf(effect.is_cached_data()));
            return faceStickerBean;
        }
        return FaceStickerBean.NONE;
    }
}
