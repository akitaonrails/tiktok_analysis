package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zG6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1889080zG6 {
    public final LinearLayout LIZ;
    public final ImageView LIZIZ;
    public final C16F5 LIZJ;
    public final View LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1889080zG6)) {
            return false;
        }
        C1889080zG6 c1889080zG6 = (C1889080zG6) obj;
        return Intrinsics.LJFF(this.LIZ, c1889080zG6.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1889080zG6.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1889080zG6.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1889080zG6.LIZLLL);
    }

    public final int hashCode() {
        LinearLayout linearLayout = this.LIZ;
        int iHashCode = (linearLayout == null ? 0 : linearLayout.hashCode()) * 31;
        ImageView imageView = this.LIZIZ;
        int iHashCode2 = (iHashCode + (imageView == null ? 0 : imageView.hashCode())) * 31;
        C16F5 c16f5 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (c16f5 == null ? 0 : c16f5.hashCode())) * 31;
        View view = this.LIZLLL;
        return iHashCode3 + (view != null ? view.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrivilegeViewStruct(container=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", text=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", iconBg=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1889080zG6(LinearLayout linearLayout, ImageView imageView, C16F5 c16f5, View view) {
        this.LIZ = linearLayout;
        this.LIZIZ = imageView;
        this.LIZJ = c16f5;
        this.LIZLLL = view;
    }
}
