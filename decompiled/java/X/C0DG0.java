package X;

import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DG0, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DG0 {
    public final TextView LIZ;
    public final TextView LIZIZ;
    public final FrameLayout LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0DG0)) {
            return false;
        }
        C0DG0 c0dg0 = (C0DG0) obj;
        return Intrinsics.LJFF(this.LIZ, c0dg0.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0dg0.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0dg0.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CachedSkuViews(tvAttrTitle=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tvSelectedValue=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", flOptionsContainer=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0DG0(TextView textView, TextView textView2, FrameLayout frameLayout) {
        this.LIZ = textView;
        this.LIZIZ = textView2;
        this.LIZJ = frameLayout;
    }
}
