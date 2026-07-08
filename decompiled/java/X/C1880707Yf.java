package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Yf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1880707Yf implements InterfaceC1626470sQX {
    public final Effect LIZ = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1880707Yf) && Intrinsics.LJFF(this.LIZ, ((C1880707Yf) obj).LIZ);
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
        sbLIZ.append("PlaceHolderEffect(effect=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
