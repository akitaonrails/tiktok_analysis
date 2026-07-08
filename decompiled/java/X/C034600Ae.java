package X;

import android.graphics.PointF;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00Ae, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C034600Ae {
    public final PointF LIZ;
    public final PointF LIZIZ;
    public final PointF LIZJ;
    public final PointF LIZLLL;

    public C034600Ae() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C034600Ae)) {
            return false;
        }
        C034600Ae c034600Ae = (C034600Ae) obj;
        return Intrinsics.LJFF(this.LIZ, c034600Ae.LIZ) && Intrinsics.LJFF(this.LIZIZ, c034600Ae.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c034600Ae.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c034600Ae.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnBoardingV2LocationData(toolbarBehaviorCenterLoc=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", toolbarLayerCenterLoc=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", titleWidgetCenterLoc=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", uploadBtnCenterLoc=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C034600Ae(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        this.LIZ = pointF;
        this.LIZIZ = pointF2;
        this.LIZJ = pointF3;
        this.LIZLLL = pointF4;
    }

    public static C034600Ae LIZ(C034600Ae c034600Ae, PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4, int i) {
        if ((i & 1) != 0) {
            pointF = c034600Ae.LIZ;
        }
        if ((i & 2) != 0) {
            pointF2 = c034600Ae.LIZIZ;
        }
        if ((i & 4) != 0) {
            pointF3 = c034600Ae.LIZJ;
        }
        if ((i & 8) != 0) {
            pointF4 = c034600Ae.LIZLLL;
        }
        c034600Ae.getClass();
        return new C034600Ae(pointF, pointF2, pointF3, pointF4);
    }
}
