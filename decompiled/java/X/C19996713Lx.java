package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectPanelModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13Lx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19996713Lx extends AbstractC20000013Ne {
    public final C13RD LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    @Override // X.AbstractC20000013Ne
    public final void execute() {
        String strLJFF;
        InterfaceC20004513Ox interfaceC20004513Ox;
        if (C504670Jqj.LIZIZ(this.LIZIZ)) {
            runOnMainThread(new AwS431S0200000_30(this, new C1662010tLr(10007), 101));
            return;
        }
        EffectChannelResponse effectChannelResponse = new EffectChannelResponse(null, null, null, null, new ArrayList(), new ArrayList(), new EffectPanelModel(null, null, new UrlModel(new ArrayList(), null, null, null, null), new ArrayList(), null, null), new ArrayList(), new ArrayList(), null, false);
        C13RD c13rd = this.LIZ;
        InterfaceC20004513Ox interfaceC20004513Ox2 = c13rd.LJJIFFI;
        if (interfaceC20004513Ox2 != null && (strLJFF = interfaceC20004513Ox2.LJFF(C13OQ.LJIILLIIL(c13rd, this.LIZIZ))) != null) {
            try {
                C13R7 c13r7 = this.LIZ.LJIJI;
                if (c13r7 != null) {
                    EffectChannelModel effectChannelModel = (EffectChannelModel) c13r7.LIZ.convertJsonToObj(strLJFF, EffectChannelModel.class);
                    if (effectChannelModel != null && effectChannelModel.checkValued()) {
                        List<Effect> effect_list = effectChannelModel.getEffect_list();
                        ArrayList<Effect> arrayList = new ArrayList();
                        if (effect_list != null && (interfaceC20004513Ox = this.LIZ.LJJIFFI) != null) {
                            for (Effect effect : effect_list) {
                                if (interfaceC20004513Ox.LJIILJJIL(effect.getId())) {
                                    arrayList.add(effect);
                                }
                            }
                        }
                        if (arrayList.isEmpty()) {
                            runOnMainThread(new AwS431S0200000_30(this, new EffectChannelResponse(this.LIZIZ, null, null, null, new ArrayList(), new ArrayList(), new EffectPanelModel(null, null, new UrlModel(new ArrayList(), null, null, null, null), new ArrayList(), null, null), new ArrayList(), new ArrayList(), null, false), 102));
                            return;
                        }
                        effectChannelResponse.setAll_category_effects(arrayList);
                        List<EffectCategoryModel> category_list = effectChannelModel.getCategory_list();
                        ArrayList arrayList2 = new ArrayList();
                        for (EffectCategoryModel effectCategoryModel : category_list) {
                            if (effectCategoryModel.checkValued()) {
                                String id = effectCategoryModel.getId();
                                String name = effectCategoryModel.getName();
                                String key = effectCategoryModel.getKey();
                                List<String> effects = effectCategoryModel.getEffects();
                                ArrayList arrayList3 = new ArrayList();
                                if (effects != null) {
                                    for (String str : effects) {
                                        for (Effect effect2 : arrayList) {
                                            if (Intrinsics.LJFF(str, effect2.getEffect_id())) {
                                                arrayList3.add(effect2);
                                            }
                                        }
                                    }
                                }
                                List<String> tags = effectCategoryModel.getTags();
                                if (tags == null) {
                                    tags = new ArrayList<>();
                                }
                                EffectCategoryResponse effectCategoryResponse = new EffectCategoryResponse(id, name, key, null, null, null, null, arrayList3, tags, effectCategoryModel.getTags_updated_at(), null, false, null, 7288, null);
                                effectCategoryResponse.setCollection_effect(effectChannelModel.getCollection_list());
                                effectCategoryResponse.set_default(effectCategoryModel.is_default());
                                effectCategoryResponse.setExtra(effectCategoryModel.getExtra());
                                arrayList2.add(effectCategoryResponse);
                            }
                        }
                        effectChannelResponse.setCategory_responses(arrayList2);
                        effectChannelResponse.setPanel(this.LIZIZ);
                        effectChannelResponse.setPanel_model(effectChannelModel.getPanel_model());
                        runOnMainThread(new AwS431S0200000_30(this, effectChannelResponse, 102));
                        return;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C13SS c13ss = C13SS.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Json Parse Exception: ");
                sbLIZ.append(e);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c13ss.getClass();
                C13SS.LIZIZ("FetchDownloadedEffectListTask", strLIZIZ, null);
            }
        }
        runOnMainThread(new AwS431S0200000_30(this, new C1662010tLr(10004), 101));
    }

    @Override // X.AbstractC20000013Ne
    public final void onCancel() {
        runOnMainThread(new AwS574S0100000_30(this, 427));
    }

    public C19996713Lx(C13RD c13rd, String str, String str2) {
        super(str2, null);
        this.LIZ = c13rd;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
