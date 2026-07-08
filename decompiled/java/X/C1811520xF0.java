package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xF0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1811520xF0 {
    public final View LIZ;
    public final LinearLayout LIZIZ;
    public final View LIZJ;
    public final FrameLayout LIZLLL;
    public final View LJ;
    public final TextView LJFF;
    public final TextView LJI;
    public final TextView LJII;
    public final View LJIIIIZZ;
    public final TuxTextView LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1811520xF0)) {
            return false;
        }
        C1811520xF0 c1811520xF0 = (C1811520xF0) obj;
        return Intrinsics.LJFF(this.LIZ, c1811520xF0.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1811520xF0.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1811520xF0.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1811520xF0.LIZLLL) && Intrinsics.LJFF(this.LJ, c1811520xF0.LJ) && Intrinsics.LJFF(this.LJFF, c1811520xF0.LJFF) && Intrinsics.LJFF(this.LJI, c1811520xF0.LJI) && Intrinsics.LJFF(this.LJII, c1811520xF0.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1811520xF0.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1811520xF0.LJIIIZ);
    }

    public final int hashCode() {
        return (((((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ScoreChipViews(container=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", chip=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", teamScoreIcon=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", rankTag=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", rankIcon=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", rankText=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", scoreText=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", enigmaPlus=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", enigmaHiddenIcon=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", enigmaRevealedText=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1811520xF0(View view, LinearLayout linearLayout, C1324720kZq c1324720kZq, FrameLayout frameLayout, View view2, TextView textView, TextView textView2, TextView textView3, View view3, TuxTextView tuxTextView) {
        this.LIZ = view;
        this.LIZIZ = linearLayout;
        this.LIZJ = c1324720kZq;
        this.LIZLLL = frameLayout;
        this.LJ = view2;
        this.LJFF = textView;
        this.LJI = textView2;
        this.LJII = textView3;
        this.LJIIIIZZ = view3;
        this.LJIIIZ = tuxTextView;
    }
}
