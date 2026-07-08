package X;

import android.graphics.drawable.Drawable;
import com.bytedance.tux.drawable.TuxIconDrawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IPE, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IPE {
    public final int LIZ;
    public final Drawable LIZIZ;
    public final Integer LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0IPE)) {
            return false;
        }
        C0IPE c0ipe = (C0IPE) obj;
        return this.LIZ == c0ipe.LIZ && Intrinsics.LJFF(this.LIZIZ, c0ipe.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0ipe.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31;
        Integer num = this.LIZJ;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BroadcastNetworkV3StatusInfo(status=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", drawable=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", reason=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0IPE(int i, TuxIconDrawable tuxIconDrawable, Integer num) {
        this.LIZ = i;
        this.LIZIZ = tuxIconDrawable;
        this.LIZJ = num;
    }
}
