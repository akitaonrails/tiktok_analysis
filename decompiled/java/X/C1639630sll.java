package X;

import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0sll, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1639630sll {
    public final List<FilterBean> LIZ;
    public final List<EffectCategoryResponse> LIZIZ;
    public final List<Pair<EffectCategoryResponse, List<FilterBean>>> LIZJ;
    public final Map<String, Effect> LIZLLL;
    public final List<FilterBean> LJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C1639630sll(List<? extends FilterBean> list, List<? extends EffectCategoryResponse> list2, List<? extends Pair<? extends EffectCategoryResponse, ? extends List<? extends FilterBean>>> list3, Map<String, ? extends Effect> map, List<? extends FilterBean> list4) {
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = list3;
        this.LIZLLL = map;
        this.LJ = list4;
    }
}
