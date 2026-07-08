package X;

import android.graphics.drawable.Drawable;
import com.bytedance.tux.drawable.TuxIconDrawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IPD, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IPD {
    public final int LIZ;
    public final Drawable LIZIZ;
    public final Integer LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0IPD)) {
            return false;
        }
        C0IPD c0ipd = (C0IPD) obj;
        return this.LIZ == c0ipd.LIZ && Intrinsics.LJFF(this.LIZIZ, c0ipd.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0ipd.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31;
        Integer num = this.LIZJ;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BroadcastAudioStatusInfo(status=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", drawable=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", reason=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0IPD(int i, TuxIconDrawable tuxIconDrawable, Integer num) {
        this.LIZ = i;
        this.LIZIZ = tuxIconDrawable;
        this.LIZJ = num;
    }
}
