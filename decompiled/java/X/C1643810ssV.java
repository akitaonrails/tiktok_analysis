package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectPanelModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0ssV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1643810ssV {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;

    public final EffectChannelResponse LIZ(EffectChannelModel effectChannelModel) {
        Effect effect;
        Effect effect2;
        List<String> urlList;
        String str;
        List<String> urlList2;
        List<String> urlList3;
        String str2;
        List<String> urlList4;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        for (Effect effect3 : effectChannelModel.getEffect_list()) {
            map.put(effect3.getEffect_id(), effect3);
        }
        for (Effect effect4 : effectChannelModel.getCollection_list()) {
            map2.put(effect4.getEffect_id(), effect4);
        }
        EffectChannelResponse effectChannelResponse = new EffectChannelResponse(null, null, null, null, new ArrayList(), new ArrayList(), new EffectPanelModel(null, null, new UrlModel(new ArrayList(), null, null, null, null), new ArrayList(), null, null), new ArrayList(), new ArrayList(), null, false);
        effectChannelResponse.setPanel(this.LIZ);
        effectChannelResponse.setVersion(effectChannelModel.getVersion());
        effectChannelResponse.setAll_category_effects(effectChannelModel.getEffect_list());
        effectChannelResponse.setCollection_list(effectChannelModel.getCollection_list());
        effectChannelResponse.setUrl_prefix(effectChannelModel.getUrl_prefix());
        ArrayList arrayList = new ArrayList();
        if (!effectChannelModel.getCategory_list().isEmpty()) {
            for (EffectCategoryModel effectCategoryModel : effectChannelModel.getCategory_list()) {
                EffectCategoryResponse effectCategoryResponse = new EffectCategoryResponse(null, null, null, null, null, null, null, null, null, null, null, false, null, 8191, null);
                effectCategoryResponse.setId(effectCategoryModel.getId());
                effectCategoryResponse.setName(effectCategoryModel.getName());
                effectCategoryResponse.setKey(effectCategoryModel.getKey());
                UrlModel icon = effectCategoryModel.getIcon();
                if (icon != null && (urlList3 = icon.getUrlList()) != null && (!urlList3.isEmpty())) {
                    UrlModel icon2 = effectCategoryModel.getIcon();
                    if (icon2 != null && (urlList4 = icon2.getUrlList()) != null) {
                        str2 = (String) ListProtector.get(urlList4, 0);
                    } else {
                        str2 = null;
                    }
                    effectCategoryResponse.setIcon_normal_url(str2);
                }
                UrlModel icon_selected = effectCategoryModel.getIcon_selected();
                if (icon_selected != null && (urlList = icon_selected.getUrlList()) != null && (!urlList.isEmpty())) {
                    UrlModel icon_selected2 = effectCategoryModel.getIcon_selected();
                    if (icon_selected2 != null && (urlList2 = icon_selected2.getUrlList()) != null) {
                        str = (String) ListProtector.get(urlList2, 0);
                    } else {
                        str = null;
                    }
                    effectCategoryResponse.setIcon_selected_url(str);
                }
                ArrayList arrayList2 = new ArrayList();
                if (effectCategoryModel.getEffects() == null) {
                    C13SS.LIZ.getClass();
                    C13SS.LIZ("BuildEffectChannelResponse", "categoryModel is null");
                }
                List<String> effects = effectCategoryModel.getEffects();
                if (effects != null) {
                    Iterator<String> it2 = effects.iterator();
                    while (it2.hasNext()) {
                        Object obj = map.get(it2.next());
                        if (obj != null) {
                            arrayList2.add(obj);
                        }
                    }
                }
                effectCategoryResponse.setTotal_effects(arrayList2);
                List<String> tags = effectCategoryModel.getTags();
                if (tags == null) {
                    tags = new ArrayList<>();
                }
                effectCategoryResponse.setTags(tags);
                effectCategoryResponse.setTags_update_time(effectCategoryModel.getTags_updated_at());
                effectCategoryResponse.setCollection_effect(effectChannelModel.getCollection_list());
                effectCategoryResponse.setExtra(effectCategoryModel.getExtra());
                effectCategoryResponse.set_default(effectCategoryModel.is_default());
                arrayList.add(effectCategoryResponse);
            }
        }
        effectChannelResponse.setCategory_responses(arrayList);
        for (Effect effect5 : effectChannelModel.getEffect_list()) {
            if (effect5.getEffect_type() == 1) {
                ArrayList arrayList3 = new ArrayList();
                List<String> children = effect5.getChildren();
                if (children == null) {
                    children = new ArrayList<>();
                }
                Iterator<String> it3 = children.iterator();
                while (it3.hasNext()) {
                    Object obj2 = map2.get(it3.next());
                    if (obj2 != null) {
                        arrayList3.add(obj2);
                    }
                }
                effect5.setChild_effects(arrayList3);
            }
        }
        effectChannelResponse.setPanel_model(effectChannelModel.getPanel_model());
        String front_effect_id = effectChannelModel.getFront_effect_id();
        if (front_effect_id == null) {
            effect = null;
        } else {
            effect = (Effect) map.get(front_effect_id);
        }
        effectChannelResponse.setFront_effect(effect);
        String rear_effect_id = effectChannelModel.getRear_effect_id();
        if (rear_effect_id == null) {
            effect2 = null;
        } else {
            effect2 = (Effect) map.get(rear_effect_id);
        }
        effectChannelResponse.setRear_effect(effect2);
        if (!this.LIZJ) {
            C13LD c13ld = C13LD.LIZ;
            String str3 = this.LIZIZ;
            String str4 = this.LIZ;
            List<Effect> effect_list = effectChannelModel.getEffect_list();
            c13ld.getClass();
            C13LD.LJIILIIL(str3, str4, "", effect_list);
            C13LD.LJIILIIL(this.LIZIZ, this.LIZ, "", effectChannelModel.getCollection_list());
        }
        return effectChannelResponse;
    }

    public C1643810ssV(String str, String str2, boolean z) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = z;
    }
}
