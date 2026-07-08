package X;

import android.view.View;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lWB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1360890lWB implements InterfaceC1365770le3 {
    public final C1389920mH0 LIZ;
    public int LIZIZ;
    public Function1<? super FrameLayout, Unit> LIZJ;
    public int LIZLLL;
    public Function1<? super FrameLayout, Unit> LJ;
    public final Float LJFF;
    public String LJI;
    public Integer LJII;
    public View.OnClickListener LJIIIIZZ;
    public View LJIIIZ;

    public C1360890lWB() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1360890lWB)) {
            return false;
        }
        C1360890lWB c1360890lWB = (C1360890lWB) obj;
        return Intrinsics.LJFF(this.LIZ, c1360890lWB.LIZ) && this.LIZIZ == c1360890lWB.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1360890lWB.LIZJ) && this.LIZLLL == c1360890lWB.LIZLLL && Intrinsics.LJFF(this.LJ, c1360890lWB.LJ) && Intrinsics.LJFF(this.LJFF, c1360890lWB.LJFF) && Intrinsics.LJFF(this.LJI, c1360890lWB.LJI) && Intrinsics.LJFF(this.LJII, c1360890lWB.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1360890lWB.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1360890lWB.LJIIIZ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31;
        Function1<? super FrameLayout, Unit> function1 = this.LIZJ;
        int iHashCode2 = (((iHashCode + (function1 == null ? 0 : function1.hashCode())) * 31) + this.LIZLLL) * 31;
        Function1<? super FrameLayout, Unit> function12 = this.LJ;
        int iHashCode3 = (iHashCode2 + (function12 == null ? 0 : function12.hashCode())) * 31;
        Float f = this.LJFF;
        int iHashCode4 = (iHashCode3 + (f == null ? 0 : f.hashCode())) * 31;
        String str = this.LJI;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.LJII;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        View.OnClickListener onClickListener = this.LJIIIIZZ;
        int iHashCode7 = (iHashCode6 + (onClickListener == null ? 0 : onClickListener.hashCode())) * 31;
        View view = this.LJIIIZ;
        return iHashCode7 + (view != null ? view.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TuxBottomToastBundle(baseBundle=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", startVariant=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", startSlot=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", endVariant=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", endSlot=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", endMaxWidthRatio=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", endMessage=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", bottomMargin=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", onClickListener=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", dispatchViewGroup=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1365770le3
    public final C1389920mH0 LIZ() {
        return this.LIZ;
    }

    public /* synthetic */ C1360890lWB(int i) {
        this(new C1389920mH0(null, null, null, 8191), 3, null, 0, null, null, null, null, null, null);
    }

    public C1360890lWB(C1389920mH0 c1389920mH0, int i, Function1<? super FrameLayout, Unit> function1, int i2, Function1<? super FrameLayout, Unit> function12, Float f, String str, Integer num, View.OnClickListener onClickListener, View view) {
        this.LIZ = c1389920mH0;
        this.LIZIZ = i;
        this.LIZJ = function1;
        this.LIZLLL = i2;
        this.LJ = function12;
        this.LJFF = f;
        this.LJI = str;
        this.LJII = num;
        this.LJIIIIZZ = onClickListener;
        this.LJIIIZ = view;
    }
}
