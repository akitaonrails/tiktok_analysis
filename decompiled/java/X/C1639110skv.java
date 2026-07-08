package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0skv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1639110skv extends AbstractC1639150skz {
    public final Effect LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1639110skv) && Intrinsics.LJFF(this.LIZ, ((C1639110skv) obj).LIZ);
    }

    public final int hashCode() {
        Effect effect = this.LIZ;
        if (effect == null) {
            return 0;
        }
        return effect.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LaunchReportEffect(effect=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1639110skv(Effect effect) {
        this.LIZ = effect;
    }
}
