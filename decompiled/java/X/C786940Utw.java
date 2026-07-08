package X;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Utw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C786940Utw {
    public final View LIZ;
    public final View LIZIZ;
    public final View LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C786940Utw)) {
            return false;
        }
        C786940Utw c786940Utw = (C786940Utw) obj;
        return Intrinsics.LJFF(this.LIZ, c786940Utw.LIZ) && Intrinsics.LJFF(this.LIZIZ, c786940Utw.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c786940Utw.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        View view = this.LIZJ;
        return iHashCode + (view == null ? 0 : view.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MorphSourceViews(avatarCircleView=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", avatarContentView=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", bubbleView=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C786940Utw(C427660Gpo c427660Gpo, View view, View view2) {
        this.LIZ = c427660Gpo;
        this.LIZIZ = view;
        this.LIZJ = view2;
    }
}
