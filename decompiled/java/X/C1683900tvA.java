package X;

import android.view.DisplayCutout;
import java.util.Objects;

/* JADX INFO: renamed from: X.0tvA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1683900tvA {
    public final DisplayCutout LIZ;

    public final int hashCode() {
        DisplayCutout displayCutout = this.LIZ;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DisplayCutoutCompat{");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1683900tvA(DisplayCutout displayCutout) {
        this.LIZ = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1683900tvA.class == obj.getClass()) {
            return Objects.equals(this.LIZ, ((C1683900tvA) obj).LIZ);
        }
        return false;
    }
}
