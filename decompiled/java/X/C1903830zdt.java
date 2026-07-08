package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.topnotice.agegraduation.AgeGraduationViewModel;
import com.zhiliaoapp.musically.R;
import wh6.AbS707S0100000_28;

/* JADX INFO: renamed from: X.0zdt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1903830zdt extends RecyclerView.ViewHolder implements InterfaceC1508640pMU {
    public static final /* synthetic */ int LL = 0;

    @Override // X.InterfaceC1508640pMU
    public final String T() {
        return "AgeGraduationViewHolder";
    }

    public C1903830zdt(View view) {
        super(view);
        View view2 = this.itemView;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ.LIZ = R.raw.icon_paperplane_fill;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a04);
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(view2.getContext());
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        c384050F3z.LJFF = Integer.valueOf(R.attr.a03);
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zi);
        c384050F3z.LIZJ = Float.valueOf(Float.MAX_VALUE);
        ((TuxIconView) view2.findViewById(R.id.akj)).setImageDrawable(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(view2.getContext())));
    }

    public final void I5(AgeGraduationViewModel ageGraduationViewModel) {
        View view = this.itemView;
        C786410Ut5.I7(new AbS707S0100000_28(ageGraduationViewModel, 0, 42), view.findViewById(R.id.miz));
        C786410Ut5.I7(new AbS707S0100000_28(ageGraduationViewModel, 1, 42), view.findViewById(R.id.view_more_btn));
        C786410Ut5.I7(new AbS707S0100000_28(ageGraduationViewModel, 2, 42), view.findViewById(R.id.e1v));
    }
}
