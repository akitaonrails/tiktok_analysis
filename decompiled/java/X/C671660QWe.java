package X;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QWe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C671660QWe {
    public final View LIZ;
    public final String LIZIZ;
    public final EnumC671630QWb LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C671660QWe)) {
            return false;
        }
        C671660QWe c671660QWe = (C671660QWe) obj;
        return Intrinsics.LJFF(this.LIZ, c671660QWe.LIZ) && Intrinsics.LJFF(this.LIZIZ, c671660QWe.LIZIZ) && this.LIZJ == c671660QWe.LIZJ;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcSearchIconTextViewWrapper(view=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", iconContent=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", iconViewType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C671660QWe(View view, String str, EnumC671630QWb enumC671630QWb) {
        this.LIZ = view;
        this.LIZIZ = str;
        this.LIZJ = enumC671630QWb;
    }
}
