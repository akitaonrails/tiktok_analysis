package X;

import com.bytedance.effectcreatormobile.infrastructure.effectplatform.api.AssetsLibData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0uUh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1705930uUh implements InterfaceC1705510uU1 {
    @Override // X.InterfaceC1705480uTy
    public final void LJI(InterfaceC1705380uTo<? super AssetsLibData> interfaceC1705380uTo) {
        String str;
        C1705360uTm c1705360uTmLIZ = C1706360uVO.LIZ().LIZ();
        if (C0A10.LIZ()) {
            c1705360uTmLIZ.getClass();
            str = "effecttooldistortionnew";
        } else {
            c1705360uTmLIZ.getClass();
            str = "effecttooldistortion";
        }
        C2256241DSs.LJIIIZ().LIZIZ(str, "all");
        C1706380uVQ.LIZ().LJIIL(str, new AbstractC1705800uUU<AssetsLibData>() { // from class: X.0uUg
            @Override // X.AbstractC1705800uUU
            public final AssetsLibData LJ(EffectChannelResponse effectChannelResponse) {
                String str2;
                String unzipPath;
                ArrayList arrayList = new ArrayList();
                for (EffectCategoryResponse effectCategoryResponse : effectChannelResponse.getCategory_responses()) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<Effect> it2 = effectCategoryResponse.getTotal_effects().iterator();
                    while (true) {
                        str2 = "";
                        if (!it2.hasNext()) {
                            break;
                        }
                        Effect next = it2.next();
                        boolean zLJFF = C1706380uVQ.LIZ().LJFF(next.getEffect_id());
                        String effect_id = next.getEffect_id();
                        String panel = next.getPanel();
                        String strLIZIZ = AbstractC1705830uUX.LIZIZ(next.getIcon_url().getUrlList());
                        String name = next.getName();
                        String extra = next.getExtra();
                        if (extra == null) {
                            extra = "";
                        }
                        String extra2 = next.getExtra();
                        if (extra2 != null) {
                            str2 = extra2;
                        }
                        if (zLJFF) {
                            unzipPath = next.getUnzipPath();
                        } else {
                            unzipPath = null;
                        }
                        arrayList2.add(new AssetsLibData.AssetsItemData(effect_id, panel, strLIZIZ, name, extra, str2, unzipPath, zLJFF, AbstractC1705830uUX.LIZLLL(this, next.getExtra(), "capabilities"), null, next.getResourceId(), 0, 0, null, null, null, AbstractC1705830uUX.LIZLLL(this, next.getExtra(), "item_type"), null, null, false, next, 981504));
                    }
                    String extra3 = effectCategoryResponse.getExtra();
                    if (extra3 != null) {
                        str2 = extra3;
                    }
                    arrayList.add(new AssetsLibData.AssetsLibCategory(str2, effectCategoryResponse.getName(), effectCategoryResponse.getKey(), arrayList2, effectCategoryResponse.getId(), null, null, false, 0, 0, null, false, 4064));
                }
                return new AssetsLibData(arrayList);
            }
        }, interfaceC1705380uTo);
    }
}
