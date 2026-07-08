package X;

import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0ssd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1643890ssd {
    public static final String LIZ(Pair<? extends FilterBean, C1643870ssb> pair) {
        if (pair == null) {
            return null;
        }
        EffectCategoryResponse effectCategoryResponseLIZ = C1453230nv7.LIZ(pair.getFirst(), pair.getSecond().LIZIZ.LJJI());
        if (effectCategoryResponseLIZ == null) {
            return null;
        }
        return effectCategoryResponseLIZ.getName();
    }
}
