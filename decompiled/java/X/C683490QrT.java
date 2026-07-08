package X;

import Y.ACListenerS114S0200000_10;
import android.text.method.MovementMethod;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0QrT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C683490QrT extends RecyclerView.ViewHolder {
    public C627300Oj2 LL;
    public final /* synthetic */ AbstractC683510QrV LLILLJJLI;

    public final void I5() {
        C679690QlL c679690QlL = (C679690QlL) this.itemView;
        c679690QlL.setEmptyText(this.LLILLJJLI.mmLoadMoreState.LIZIZ);
        c679690QlL.setErrorText(this.LLILLJJLI.mmLoadMoreState.LJFF);
        AbstractC683510QrV abstractC683510QrV = this.LLILLJJLI;
        Integer num = abstractC683510QrV.mmLoadMoreState.LIZLLL;
        if (num != null) {
            c679690QlL.setEmptyTextColor(num.intValue());
        } else {
            Integer numLIZJ = C1308910kAL.LIZJ(abstractC683510QrV.mmLoadMoreState.LIZJ, c679690QlL.getContext());
            if (numLIZJ != null) {
                c679690QlL.setEmptyTextColor(numLIZJ.intValue());
            }
        }
        AbstractC683510QrV abstractC683510QrV2 = this.LLILLJJLI;
        Integer num2 = abstractC683510QrV2.mmLoadMoreState.LJII;
        if (num2 != null) {
            c679690QlL.setErrorTextColor(num2.intValue());
        } else {
            Integer numLIZJ2 = C1308910kAL.LIZJ(abstractC683510QrV2.mmLoadMoreState.LJI, c679690QlL.getContext());
            if (numLIZJ2 != null) {
                c679690QlL.setErrorTextColor(numLIZJ2.intValue());
            }
        }
        MovementMethod movementMethod = this.LLILLJJLI.mmLoadMoreState.LJ;
        if (movementMethod != null) {
            c679690QlL.setEmptyMovementMethod(movementMethod);
        }
        AbstractC683510QrV abstractC683510QrV3 = this.LLILLJJLI;
        int i = abstractC683510QrV3.mmLoadMoreState.LIZ;
        if (i == -1) {
            c679690QlL.LIZJ(true);
            C786410Ut5.V1(c679690QlL, 4);
            C0P6P c0p6p = this.LLILLJJLI.mmLoadMoreListener;
            if (c0p6p != null) {
                c0p6p.LJJIFFI();
                return;
            }
            return;
        }
        if (i == 0) {
            C786410Ut5.V1(c679690QlL, 4);
            c679690QlL.LIZIZ();
            C786410Ut5.V1(c679690QlL, 0);
            return;
        }
        if (i == 1) {
            c679690QlL.LIZJ(false);
            C786410Ut5.V1(c679690QlL, 0);
            return;
        }
        if (i == 2) {
            RecyclerView recyclerView = abstractC683510QrV3.mmRecyclerView;
            ((C679690QlL) this.itemView).LIZ();
            C627300Oj2 c627300Oj2 = this.LL;
            if (c627300Oj2 != null) {
                c627300Oj2.LLILLL = true;
            } else {
                AbstractC683510QrV abstractC683510QrV4 = this.LLILLJJLI;
                if (recyclerView != null) {
                    C627300Oj2 c627300Oj22 = new C627300Oj2(recyclerView, abstractC683510QrV4.mmLoadMoreListener);
                    c627300Oj22.LLILLL = true;
                    this.LL = c627300Oj22;
                }
            }
            C786410Ut5.V1(c679690QlL, 0);
            return;
        }
        if (i == 5) {
            RecyclerView recyclerView2 = abstractC683510QrV3.mmRecyclerView;
            ((C679690QlL) this.itemView).LIZJ(true);
            C627300Oj2 c627300Oj23 = this.LL;
            if (c627300Oj23 != null) {
                c627300Oj23.LLILLL = true;
            } else {
                AbstractC683510QrV abstractC683510QrV5 = this.LLILLJJLI;
                if (recyclerView2 != null) {
                    C627300Oj2 c627300Oj24 = new C627300Oj2(recyclerView2, abstractC683510QrV5.mmLoadMoreListener);
                    c627300Oj24.LLILLL = true;
                    this.LL = c627300Oj24;
                }
            }
            C786410Ut5.V1(c679690QlL, 0);
            c679690QlL.setMinimumHeight(1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C683490QrT(AbstractC683510QrV abstractC683510QrV, ViewGroup viewGroup) {
        super(new C679690QlL(viewGroup.getContext()));
        this.LLILLJJLI = abstractC683510QrV;
        C679690QlL c679690QlL = (C679690QlL) this.itemView;
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c679690QlL);
        c679690QlL.setLayoutParams(layoutParams);
        c679690QlL.setEmptyText(c679690QlL.getContext().getString(2131836755));
        c679690QlL.setErrorText(c679690QlL.getContext().getString(2131845625));
        c679690QlL.setErrorOnClickListener(new ACListenerS114S0200000_10(this, abstractC683510QrV, 32));
    }
}
