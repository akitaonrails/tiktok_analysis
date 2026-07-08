package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0zIS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1890540zIS extends AbstractC960460b6K<C1890550zIT, C1890530zIR> {
    public final boolean LIZIZ;

    public C1890540zIS(boolean z) {
        this.LIZIZ = z;
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        if (this.LIZIZ) {
            i = R.layout.h_d;
        } else {
            i = R.layout.h_k;
        }
        final View viewTd = C786410Ut5.Td(layoutInflater, i, viewGroup, false);
        return new AbstractC960470b6L<C1890550zIT>(viewTd) { // from class: X.0zIR
            public final View LL;

            {
                int i2;
                super(viewTd);
                View viewFindViewById = viewTd.findViewById(R.id.vg_empty);
                if (viewFindViewById != null) {
                    Context context = viewFindViewById.getContext();
                    if (C500260Jjc.LJJIL() && C960203pA.LIZIZ(viewFindViewById.getContext())) {
                        i2 = R.attr.ezk;
                    } else {
                        i2 = R.attr.ext;
                    }
                    viewFindViewById.setBackgroundColor(C20736316Cj.LIZIZ(i2, context));
                } else {
                    viewFindViewById = null;
                }
                this.LL = viewFindViewById;
            }

            @Override // X.AbstractC960470b6L
            public final void I5(int i2, Object obj) {
                ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
                layoutParams.height = ((C1890550zIT) obj).LIZ;
                C786410Ut5.W5(this.itemView, layoutParams);
            }
        };
    }
}
