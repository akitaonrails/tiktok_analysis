package X;

import com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoPanelState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0skx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1639130skx extends AbstractC1639150skz {
    public final EffectInfoPanelState LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1639130skx) && Intrinsics.LJFF(this.LIZ, ((C1639130skx) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReloadEffectInfo(state=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1639130skx(EffectInfoPanelState effectInfoPanelState) {
        this.LIZ = effectInfoPanelState;
    }
}
