package X;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Tzs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C765140Tzs extends AbstractC764660Tz6 {
    public final View LIZ;
    public final C0U22 LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C765140Tzs)) {
            return false;
        }
        C765140Tzs c765140Tzs = (C765140Tzs) obj;
        return Intrinsics.LJFF(this.LIZ, c765140Tzs.LIZ) && Intrinsics.LJFF(this.LIZIZ, c765140Tzs.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DoAddAnimation(iconView=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", songInfo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C765140Tzs(View view, C0U22 c0u22) {
        this.LIZ = view;
        this.LIZIZ = c0u22;
    }
}
