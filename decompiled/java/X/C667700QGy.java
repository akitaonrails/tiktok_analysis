package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.discover.model.suggest.RecomDataWrapper;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QGy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C667700QGy implements InterfaceC663970Q2p {
    public final long LIZ;
    public final Map<?, ?> LIZIZ;
    public final RecomDataWrapper LIZJ;
    public final boolean LIZLLL;

    public C667700QGy() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C667700QGy)) {
            return false;
        }
        C667700QGy c667700QGy = (C667700QGy) obj;
        return this.LIZ == c667700QGy.LIZ && Intrinsics.LJFF(this.LIZIZ, c667700QGy.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c667700QGy.LIZJ) && this.LIZLLL == c667700QGy.LIZLLL;
    }

    public final int hashCode() {
        int iY2 = ((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31;
        RecomDataWrapper recomDataWrapper = this.LIZJ;
        return ((iY2 + (recomDataWrapper == null ? 0 : recomDataWrapper.hashCode())) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchSuggestState(time_stamp=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", last_suggest_words=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", last_suggest_data=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", preload_active=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LIZIZ() {
        if (C1837507Hp.LIZ()) {
            RecomDataWrapper recomDataWrapper = this.LIZJ;
            return recomDataWrapper != null ? recomDataWrapper.rawString : "[]";
        }
        Map<?, ?> map = this.LIZIZ;
        return (map == null || map.isEmpty()) ? "[]" : GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), this.LIZIZ);
    }

    public /* synthetic */ C667700QGy(int i) {
        this(System.currentTimeMillis(), C2097608Jq.LJ(), null, false);
    }

    public C667700QGy(long j, Map<?, ?> map, RecomDataWrapper recomDataWrapper, boolean z) {
        this.LIZ = j;
        this.LIZIZ = map;
        this.LIZJ = recomDataWrapper;
        this.LIZLLL = z;
    }

    public static C667700QGy LIZ(C667700QGy c667700QGy, long j, Map map, RecomDataWrapper recomDataWrapper, boolean z, int i) {
        boolean z2 = z;
        RecomDataWrapper recomDataWrapper2 = recomDataWrapper;
        Map map2 = map;
        long j2 = j;
        if ((i & 1) != 0) {
            j2 = c667700QGy.LIZ;
        }
        if ((i & 2) != 0) {
            map2 = c667700QGy.LIZIZ;
        }
        if ((i & 4) != 0) {
            recomDataWrapper2 = c667700QGy.LIZJ;
        }
        if ((i & 8) != 0) {
            z2 = c667700QGy.LIZLLL;
        }
        c667700QGy.getClass();
        return new C667700QGy(j2, map2, recomDataWrapper2, z2);
    }
}
