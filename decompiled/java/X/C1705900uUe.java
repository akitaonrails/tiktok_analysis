package X;

import com.bytedance.effectcreatormobile.infrastructure.effectplatform.api.AssetsLibData;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0uUe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1705900uUe extends AbstractC1705810uUV<AssetsLibData> {
    @Override // X.AbstractC1705810uUV
    public final AssetsLibData LJ(PanelInfoModel panelInfoModel) {
        List<EffectCategoryModel> categoryList;
        ArrayList arrayList = new ArrayList();
        if (panelInfoModel != null && (categoryList = panelInfoModel.getCategoryList()) != null && !categoryList.isEmpty()) {
            for (EffectCategoryModel effectCategoryModel : panelInfoModel.getCategoryList()) {
                String extra = effectCategoryModel.getExtra();
                if (extra == null) {
                    extra = "";
                }
                arrayList.add(new AssetsLibData.AssetsLibCategory(extra, effectCategoryModel.getName(), effectCategoryModel.getKey(), C13BV.INSTANCE, effectCategoryModel.getId(), null, null, false, 0, 0, null, false, 4064));
            }
            return new AssetsLibData(arrayList);
        }
        return new AssetsLibData(arrayList);
    }
}
