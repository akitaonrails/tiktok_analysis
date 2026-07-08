package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.sticker.repository.params.FetchMode;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel;
import com.ss.android.ugc.effectmanager.effect.model.SearchEffectResponseV2;
import com.ss.ugc.effectplatform.model.net.RecommendSearchWordsResponse;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0sPa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public interface InterfaceC1625880sPa {
    List<EffectCategoryModel> LIZIZ();

    long LIZJ();

    void LIZLLL(List<String> list);

    Map<String, Effect> LJ();

    MutableLiveData LJFF();

    LiveData<List<EffectCategoryModel>> LJI();

    void LJII(List<? extends Effect> list);

    CategoryEffectModel LJIIIIZZ(String str);

    LiveData<C1641640sp0<HorizontalEffectsModel>> LJIIIZ(List<String> list, boolean z, FetchMode fetchMode, Integer num);

    LiveData LJIIJ(String str, boolean z, boolean z2, boolean z3);

    LiveData LJIIJJI(boolean z, boolean z2, String str, int i, int i2, int i3, Map map);

    List<C1449380nou> LJIIL(String str);

    HorizontalEffectsModel LJIILIIL();

    List<EffectCategoryModel> LJIILJJIL();

    MutableLiveData LJIILL();

    LiveData<C1641640sp0<RecommendSearchWordsResponse>> LJIILLIIL();

    LiveData<C1641640sp0<SearchEffectResponseV2>> LJIIZILJ();

    void LJIJ(List<? extends Effect> list);

    Map<String, LiveData<C1641640sp0<CategoryEffectModel>>> LJIJI();

    MutableLiveData LJIJJ();

    MutableLiveData LJIJJLI(String str, Map map, boolean z, boolean z2);

    LiveData<Integer> LJIL(String str);

    MutableLiveData LJJ();
}
