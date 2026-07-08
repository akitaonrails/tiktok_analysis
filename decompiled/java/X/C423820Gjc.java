package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gjc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C423820Gjc implements InterfaceC423860Gjg {
    public final int LIZ = R.raw.icon_color_verified_badge;
    public final Integer LIZIZ = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C423820Gjc)) {
            return false;
        }
        C423820Gjc c423820Gjc = (C423820Gjc) obj;
        return this.LIZ == c423820Gjc.LIZ && Intrinsics.LJFF(this.LIZIZ, c423820Gjc.LIZIZ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        Integer num = this.LIZIZ;
        return i + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Icon(tuxIconIdentifier=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tuxTintColorIdentifier=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
