package X;

import Y.ACListenerS130S0200000_28;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.journey.experiment.RevampISExperiment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10HG, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10HG extends RecyclerView.ViewHolder {
    public final /* synthetic */ C10R0 LL;

    public final int I5() {
        return getBindingAdapterPosition() - 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10HG(C10R0 c10r0, View view) {
        int iLIZIZ;
        int dimension;
        int dimension2;
        int dimension3;
        int dimension4;
        float dimension5;
        int dimension6;
        int dimension7;
        int i;
        float dimension8;
        super(view);
        this.LL = c10r0;
        C19233810Mm.LIZ.getClass();
        C10HH c10hh = (C10HH) C19233810Mm.LIZ(C10HH.class);
        if (Intrinsics.LJFF(c10hh.LJFF(), "tablet")) {
            iLIZIZ = c10hh.LIZIZ("card_view_item_count_per_row", 2);
        } else if (RevampISExperiment.LIZ()) {
            RevampISExperiment.LIZ();
            iLIZIZ = ((RevampISExperiment.ExperimentConfig) RevampISExperiment.LJ.getValue()).spanCount;
        } else {
            iLIZIZ = 0;
        }
        if (Intrinsics.LJFF(c10hh.LJFF(), "tablet")) {
            try {
                ConstraintLayout constraintLayout = (ConstraintLayout) this.itemView.findViewById(R.id.kwl);
                C19ME c19me = new C19ME(-1, (int) this.itemView.getResources().getDimension(R.dimen.a3c));
                int dimension9 = (int) this.itemView.getResources().getDimension(R.dimen.a3n);
                c19me.setMargins(dimension9, dimension9, dimension9, dimension9);
                C786410Ut5.m6(constraintLayout, c19me);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("applyCardSpecificAdjustmentOnTablet failed: ");
                sbLIZ.append(e.getMessage());
                C1911410zq7.LIZ("SelectInterestGridAdapter", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        int dimension10 = (int) this.itemView.getResources().getDimension(R.dimen.a35);
        if (this.LL.LLJ) {
            C786410Ut5.LLFF(0, (SmartImageView) this.itemView.findViewById(R.id.kwm));
            dimension2 = (int) this.itemView.getResources().getDimension(R.dimen.a3b);
            dimension7 = (int) this.itemView.getResources().getDimension(R.dimen.a38);
            int dimension11 = (int) this.itemView.getResources().getDimension(R.dimen.a37);
            dimension = (int) this.itemView.getResources().getDimension(R.dimen.a3a);
            dimension4 = (int) this.itemView.getResources().getDimension(R.dimen.a3e);
            dimension6 = (int) this.itemView.getResources().getDimension(R.dimen.a3d);
            if (iLIZIZ == 2) {
                dimension8 = this.itemView.getResources().getDimension(R.dimen.a32);
            } else {
                dimension8 = this.itemView.getResources().getDimension(R.dimen.a33);
            }
            SmartImageView smartImageView = (SmartImageView) this.itemView.findViewById(R.id.kwm);
            C19ME c19me2 = new C19ME(dimension11, dimension11);
            c19me2.topToTop = 0;
            c19me2.startToStart = 0;
            c19me2.endToEnd = 0;
            c19me2.setMargins(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), (int) dimension8, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
            C786410Ut5.G6(smartImageView, c19me2);
            dimension3 = 0;
        } else {
            C786410Ut5.LLFF(8, (SmartImageView) this.itemView.findViewById(R.id.kwm));
            dimension = (int) this.itemView.getResources().getDimension(R.dimen.a3l);
            dimension2 = (int) this.itemView.getResources().getDimension(R.dimen.a3m);
            dimension3 = (int) this.itemView.getResources().getDimension(R.dimen.a38);
            if (iLIZIZ == 2) {
                dimension4 = (int) this.itemView.getResources().getDimension(R.dimen.a3h);
                dimension5 = this.itemView.getResources().getDimension(R.dimen.a3g);
            } else {
                dimension4 = (int) this.itemView.getResources().getDimension(R.dimen.a3k);
                dimension5 = this.itemView.getResources().getDimension(R.dimen.a3j);
            }
            dimension6 = (int) dimension5;
            dimension7 = 0;
        }
        View viewFindViewById = this.itemView.findViewById(R.id.kwh);
        C10R0 c10r02 = this.LL;
        ImageView imageView = (ImageView) viewFindViewById;
        C19ME c19me3 = new C19ME(dimension, dimension);
        if (!c10r02.LLJ && !Intrinsics.LJFF(c10hh.LJFF(), "tablet")) {
            i = -1;
            c19me3.topToTop = -1;
            c19me3.topToBottom = R.id.kwu;
            c19me3.bottomToBottom = 0;
            c19me3.endToEnd = 0;
            c19me3.setMargins(dimension10, dimension2, dimension10, dimension3);
        } else {
            i = -1;
            c19me3.topToTop = 0;
            c19me3.topToBottom = -1;
            c19me3.bottomToBottom = -1;
            c19me3.endToEnd = 0;
            c19me3.setMargins(dimension10, dimension2, dimension10, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
        }
        C786410Ut5.c6(imageView, c19me3);
        View viewFindViewById2 = this.itemView.findViewById(R.id.kwu);
        C10R0 c10r03 = this.LL;
        TuxTextView tuxTextView = (TuxTextView) viewFindViewById2;
        C19ME c19me4 = new C19ME(0, -2);
        if (c10r03.LLJ) {
            c19me4.topToTop = i;
            c19me4.topToBottom = R.id.kwm;
            c19me4.bottomToBottom = 0;
            c19me4.startToStart = 0;
            c19me4.endToEnd = 0;
            tuxTextView.setGravity(1);
        } else {
            c19me4.topToTop = 0;
            c19me4.topToBottom = i;
            c19me4.bottomToBottom = i;
            c19me4.startToStart = 0;
            if (Intrinsics.LJFF(c10hh.LJFF(), "tablet")) {
                c19me4.endToStart = R.id.kwh;
            } else {
                c19me4.endToEnd = 0;
            }
            tuxTextView.setGravity(8388611);
        }
        c19me4.setMargins(dimension6, dimension4, dimension6, dimension7);
        if (Intrinsics.LJFF(c10hh.LJFF(), "tablet")) {
            tuxTextView.setMaxLines(3);
        }
        C786410Ut5.R6(tuxTextView, c19me4);
        C21382118m3.LIZIZ((TextView) this.itemView.findViewById(R.id.kwu), 10, 13, 1, 2);
        C786410Ut5.I7(new ACListenerS130S0200000_28(this.LL, this, 1), view);
    }
}
