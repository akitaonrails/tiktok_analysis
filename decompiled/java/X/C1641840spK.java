package X;

import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0spK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1641840spK {
    public final Map<EffectCategoryResponse, List<FilterBean>> LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1641840spK)) {
            return false;
        }
        C1641840spK c1641840spK = (C1641840spK) obj;
        return Intrinsics.LJFF(this.LIZ, c1641840spK.LIZ) && this.LIZIZ == c1641840spK.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1641840spK(Map<EffectCategoryResponse, ? extends List<? extends FilterBean>> map, boolean z) {
        this.LIZ = map;
        this.LIZIZ = z;
    }
}
