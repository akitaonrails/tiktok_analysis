package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tDi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1656960tDi extends AbstractC1656970tDj {
    public final List<Effect> LIZ;
    public final Effect LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1656960tDi)) {
            return false;
        }
        C1656960tDi c1656960tDi = (C1656960tDi) obj;
        return Intrinsics.LJFF(this.LIZ, c1656960tDi.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1656960tDi.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Effect effect = this.LIZIZ;
        return iHashCode + (effect == null ? 0 : effect.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(allCategoryEffects=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", defaultDuetLayout=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1656960tDi(Effect effect, List list) {
        this.LIZ = list;
        this.LIZIZ = effect;
    }
}
