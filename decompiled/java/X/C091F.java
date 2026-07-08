package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import wuk.d0;

/* JADX INFO: renamed from: X.091F, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.repository.internals.main.DefaultStickerSource$postPanelInfoDataUpdate$4$resolveCategoryEffect$1$1", f = "DefaultStickerSource.kt", l = {}, m = "invokeSuspend")
public final class C091F extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ d0 LL;
    public final /* synthetic */ PanelInfoModel LLILLJJLI;
    public final /* synthetic */ List<EffectCategoryModel> LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C091F(d0 d0Var, PanelInfoModel panelInfoModel, List<EffectCategoryModel> list, int i, InterfaceC1364105Vn<? super C091F> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = d0Var;
        this.LLILLJJLI = panelInfoModel;
        this.LLILLL = list;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C091F(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String categoryKey;
        C1C7U.LIZ("DefaultStickerSource@cf79.postPanelInfoDataUpdate$4$resolveCategoryEffect$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        d0 d0Var = this.LL;
        CategoryEffectModel categoryEffectModel = this.LLILLJJLI.getCategoryEffectModel();
        if (categoryEffectModel == null || (categoryKey = categoryEffectModel.getCategoryKey()) == null) {
            categoryKey = "";
        }
        d0Var.LJJIII = categoryKey;
        this.LL.LJIJ.getValue().setValue(this.LLILLL);
        if (this.LL.LJJIII.length() > 0) {
            d0 d0Var2 = this.LL;
            Map<String, MutableLiveData<Integer>> map = d0Var2.LJIIJ;
            String str = d0Var2.LJJIII;
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            Object mutableLiveData = linkedHashMap.get(str);
            if (mutableLiveData == null) {
                mutableLiveData = new MutableLiveData();
                linkedHashMap.put(str, mutableLiveData);
            }
            ((LiveData) mutableLiveData).setValue(C2286608xc.LJ(this.LLILZ));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultStickerSource@cf79.postPanelInfoDataUpdate$4$resolveCategoryEffect$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
