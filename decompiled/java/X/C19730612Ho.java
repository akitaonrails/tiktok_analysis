package X;

import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtra;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategoryExtra;
import com.ss.android.ugc.aweme.tools.beauty.service.BeautyFilterConfig;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.12Ho, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19730612Ho {
    public static List LIZ(InterfaceC19730812Hq interfaceC19730812Hq, BeautyFilterConfig beautyFilterConfig) {
        ArrayList arrayList = new ArrayList();
        EffectCategoryResponse effectCategoryResponseLIZIZ = interfaceC19730812Hq.LIZIZ();
        if (effectCategoryResponseLIZIZ == null) {
            effectCategoryResponseLIZIZ = new EffectCategoryResponse(null, null, null, null, null, null, null, null, null, null, null, false, null, 8191, null);
            effectCategoryResponseLIZIZ.setId("-10000");
            effectCategoryResponseLIZIZ.setName("");
        }
        BeautyCategoryExtra beautyCategoryExtraLIZ = interfaceC19730812Hq.LIZ();
        if (beautyCategoryExtraLIZ == null) {
            beautyCategoryExtraLIZ = new BeautyCategoryExtra(null, false, false, false, EnumC19731112Ht.ALL.getFlag(), false, false, false, null, null, null, null, null, false, 16367, null);
        }
        ArrayList arrayList2 = new ArrayList();
        List<C19730712Hp> listLIZJ = interfaceC19730812Hq.LIZJ();
        if (!listLIZJ.isEmpty()) {
            for (C19730712Hp c19730712Hp : listLIZJ) {
                ComposerBeautyExtra composerBeautyExtra = new ComposerBeautyExtra(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, null, null, false, false, 0, null, null, null, 16777215, null);
                Effect effect = new Effect(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0L, null, null, 0L, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 0L, null, null, null, 0L, 0L, null, null, null, null, null, false, false, -1, -1, 15, null);
                effect.setEffectId(c19730712Hp.LIZIZ);
                effect.setResourceId(c19730712Hp.LIZJ);
                effect.setName(c19730712Hp.LIZLLL);
                effect.setUnzipPath(c19730712Hp.LJ);
                ComposerBeautyExtraBeautify composerBeautyExtraBeautify = new ComposerBeautyExtraBeautify(null, null, 3, null);
                ArrayList arrayList3 = new ArrayList();
                ComposerBeautyExtraBeautify.ItemsBean itemsBean = new ComposerBeautyExtraBeautify.ItemsBean(false, 0, 0, 0, null, null, 63, null);
                itemsBean.setDoubleDirection(false);
                itemsBean.setMin(c19730712Hp.LJFF);
                itemsBean.setMax(c19730712Hp.LJII);
                itemsBean.setValue(c19730712Hp.LJI);
                itemsBean.setTag(c19730712Hp.LJIIIIZZ);
                itemsBean.setName(c19730712Hp.LIZLLL);
                arrayList3.add(itemsBean);
                composerBeautyExtraBeautify.setItems(arrayList3);
                ComposerBeauty composerBeauty = new ComposerBeauty(effect, composerBeautyExtra, composerBeautyExtraBeautify, null, false, false, null, null, null, null, false, false, false, 0, 0, false, false, true, c19730712Hp.LIZ, 0, 16, new BeautyCategoryExtra(null, false, false, false, null, false, false, false, null, null, null, null, null, false, 16383, null), false, 4849656, null);
                Function1<? super ComposerBeautyExtraBeautify, Unit> function1 = beautyFilterConfig.getChildrenInitBeautyValueVBlock;
                if (function1 != null) {
                    function1.invoke(composerBeauty.getBeautifyExtra());
                }
                arrayList2.add(composerBeauty);
            }
        }
        arrayList.add(new BeautyCategory(effectCategoryResponseLIZIZ, beautyCategoryExtraLIZ, arrayList2, true));
        return arrayList;
    }
}
