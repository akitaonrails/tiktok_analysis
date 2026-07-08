package X;

import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import wuk.d0;

/* JADX INFO: renamed from: X.091G, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.repository.internals.main.DefaultStickerSource$postPanelInfoDataUpdate$4$resolveCategoryEffect$1", f = "DefaultStickerSource.kt", l = {609, 626}, m = "invokeSuspend")
public final class C091G extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super CategoryEffectModel>, Object> {
    public CategoryEffectModel LL;
    public int LLILLJJLI;
    public final /* synthetic */ PanelInfoModel LLILLL;
    public final /* synthetic */ d0 LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C091G(PanelInfoModel panelInfoModel, d0 d0Var, int i, InterfaceC1364105Vn<? super C091G> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = panelInfoModel;
        this.LLILZ = d0Var;
        this.LLILZIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C091G(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        CategoryEffectModel categoryEffectModel;
        C1C7U.LIZ("DefaultStickerSource@cf79.postPanelInfoDataUpdate$4$resolveCategoryEffect$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    categoryEffectModel = this.LL;
                    C155000ia.LIZIZ(obj);
                    C1C7U.LIZIZ("DefaultStickerSource@cf79.postPanelInfoDataUpdate$4$resolveCategoryEffect$1");
                    return categoryEffectModel;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            ArrayList arrayList = new ArrayList(this.LLILLL.getCategoryList());
            this.LLILZ.LIZJ.getValue().LIZJ(arrayList);
            this.LLILLL.setCategoryList(arrayList);
            C2238608ps c2238608ps = C2107708Nn.LIZ;
            C091F c091f = new C091F(this.LLILZ, this.LLILLL, arrayList, this.LLILZIL, null);
            this.LLILLJJLI = 1;
            if (C23250099c.LJI(this, c2238608ps, c091f) == objLJFF) {
                C1C7U.LIZIZ("DefaultStickerSource@cf79.postPanelInfoDataUpdate$4$resolveCategoryEffect$1");
                return objLJFF;
            }
        }
        categoryEffectModel = this.LLILLL.getCategoryEffectModel();
        if (categoryEffectModel != null) {
            d0 d0Var = this.LLILZ;
            d0Var.LJIJ(categoryEffectModel.getCollectEffects());
            d0Var.LJII(categoryEffectModel.getBindEffects());
            Map<String, List<Effect>> map = d0Var.LJIIL;
            String categoryKey = categoryEffectModel.getCategoryKey();
            List<Effect> effects = categoryEffectModel.getEffects();
            if (effects == null) {
                effects = C13BV.INSTANCE;
            }
            map.put(categoryKey, effects);
            Intrinsics.LJFF(categoryEffectModel.getCategoryKey(), d0Var.LJJII);
            this.LL = categoryEffectModel;
            this.LLILLJJLI = 2;
            if (d0Var.LJJIIZ(categoryEffectModel, false, this) == objLJFF) {
                C1C7U.LIZIZ("DefaultStickerSource@cf79.postPanelInfoDataUpdate$4$resolveCategoryEffect$1");
                return objLJFF;
            }
        } else {
            categoryEffectModel = null;
        }
        C1C7U.LIZIZ("DefaultStickerSource@cf79.postPanelInfoDataUpdate$4$resolveCategoryEffect$1");
        return categoryEffectModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super CategoryEffectModel> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
