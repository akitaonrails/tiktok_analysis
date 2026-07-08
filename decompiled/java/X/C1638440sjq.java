package X;

import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sjq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1638440sjq {
    public final List<C1639670slp> LIZ;
    public final List<Pair<EffectCategoryResponse, List<C1639670slp>>> LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1638440sjq)) {
            return false;
        }
        C1638440sjq c1638440sjq = (C1638440sjq) obj;
        return Intrinsics.LJFF(this.LIZ, c1638440sjq.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1638440sjq.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1638440sjq.LIZJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1638440sjq(List<C1639670slp> list, List<? extends Pair<? extends EffectCategoryResponse, ? extends List<C1639670slp>>> list2, String str) {
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = str;
    }
}
