package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0llF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1370230llF extends RecyclerView.ViewHolder {
    public final InterfaceC1369750lkT LL;
    public final EnumC1369720lkQ LLILLJJLI;
    public final C1370200llC LLILLL;
    public final BaseSharePackage LLILZ;
    public final TuxIconView LLILZIL;
    public final TextView LLILZLL;
    public final View LLIZ;
    public final View LLIZLLLIL;
    public final View LLJ;
    public final View LLJI;
    public final View LLJIJIL;
    public final FrameLayout LLJILJIL;
    public View LLJILJILJ;
    public InterfaceC1370310llN LLJILLL;

    public final void I5(EnumC1370270llJ enumC1370270llJ) {
        InterfaceC1370310llN interfaceC1370310llN;
        if (this.LLJILJILJ == null || ((interfaceC1370310llN = this.LLJILLL) != null && interfaceC1370310llN.LJJJLZIJ())) {
            int i = C1370260llI.LIZ[enumC1370270llJ.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        View view = this.itemView;
                        view.setBackground(view.getContext().getDrawable(R.drawable.aj0));
                        return;
                    }
                    throw new C1954807lC();
                }
                View view2 = this.itemView;
                view2.setBackground(view2.getContext().getDrawable(R.drawable.aj2));
                return;
            }
            View view3 = this.itemView;
            view3.setBackground(view3.getContext().getDrawable(R.drawable.aiy));
            return;
        }
        int i2 = C1370260llI.LIZ[enumC1370270llJ.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    View view4 = this.itemView;
                    view4.setBackground(view4.getContext().getDrawable(R.drawable.aj1));
                    return;
                }
                throw new C1954807lC();
            }
            View view5 = this.itemView;
            view5.setBackground(view5.getContext().getDrawable(R.drawable.aj3));
            return;
        }
        View view6 = this.itemView;
        view6.setBackground(view6.getContext().getDrawable(R.drawable.aiz));
    }

    public C1370230llF(View view, InterfaceC1369750lkT interfaceC1369750lkT, EnumC1369720lkQ enumC1369720lkQ, C1370200llC c1370200llC, BaseSharePackage baseSharePackage) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super(view);
        this.LL = interfaceC1369750lkT;
        this.LLILLJJLI = enumC1369720lkQ;
        this.LLILLL = c1370200llC;
        this.LLILZ = baseSharePackage;
        this.LLILZIL = (TuxIconView) view.findViewById(R.id.uye);
        TextView textView = (TextView) view.findViewById(R.id.uyh);
        this.LLILZLL = textView;
        this.LLIZ = view.findViewById(R.id.uyf);
        this.LLIZLLLIL = view.findViewById(R.id.a3q);
        this.LLJ = view.findViewById(R.id.f683ci3);
        this.LLJI = view.findViewById(R.id.m47);
        this.LLJIJIL = view.findViewById(R.id.okr);
        this.LLJILJIL = (FrameLayout) view.findViewById(R.id.hin);
        if (c1370200llC != null) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if ((layoutParams instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.setMarginStart(c1370200llC.LIZ);
            }
        }
        C786410Ut5.x3(view.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC1402110maf(this, view, 1));
    }
}
