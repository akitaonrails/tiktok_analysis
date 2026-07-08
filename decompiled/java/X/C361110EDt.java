package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0EDt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C361110EDt extends RecyclerView.ViewHolder {
    public final C383710F2r LL;
    public final TextView LLILLJJLI;
    public final TuxIconView LLILLL;
    public final FrameLayout LLILZ;
    public final ImageView LLILZIL;
    public final TextView LLILZLL;
    public final ImageView LLIZ;
    public final C1295960jpS LLIZLLLIL;
    public final C365580EUy LLJ;
    public final View LLJI;
    public final View LLJIJIL;

    public C361110EDt(ConstraintLayout constraintLayout) {
        super(constraintLayout);
        this.LL = (C383710F2r) constraintLayout.findViewById(R.id.tcn);
        this.LLILLJJLI = (TextView) constraintLayout.findViewById(R.id.tcr);
        this.LLILLL = (TuxIconView) constraintLayout.findViewById(R.id.tcp);
        FrameLayout frameLayout = (FrameLayout) constraintLayout.findViewById(R.id.tco);
        this.LLILZ = frameLayout;
        this.LLILZIL = (ImageView) constraintLayout.findViewById(R.id.tcj);
        this.LLILZLL = (TextView) constraintLayout.findViewById(R.id.tcq);
        this.LLIZ = (ImageView) constraintLayout.findViewById(R.id.tcg);
        this.LLIZLLLIL = (C1295960jpS) constraintLayout.findViewById(R.id.tcs);
        C365580EUy c365580EUy = (C365580EUy) constraintLayout.findViewById(R.id.dtg);
        this.LLJ = c365580EUy;
        this.LLJI = constraintLayout.findViewById(R.id.tck);
        this.LLJIJIL = constraintLayout.findViewById(R.id.dte);
        if (((Boolean) C0E5G.LIZIZ(EnumC357850E1f.DEFAULT_EDIT_MODE, Boolean.FALSE)).booleanValue()) {
            C786410Ut5.LJZ(8, frameLayout);
            if (c365580EUy != null) {
                c365580EUy.setBgCircleColor(C446980Hfs.LIZ(c365580EUy.getContext(), R.color.tw));
                c365580EUy.setProgressColor(-1);
                c365580EUy.setMaxProgress(100);
                c365580EUy.setCircleWidth(C390810FTz.LIZ(2.0f));
                c365580EUy.setBgCircleWidth(C390810FTz.LIZ(4.0f));
                return;
            }
            return;
        }
        String str = C0ED9.LIZ.LJ;
        if (str == null) {
            return;
        }
        C1294250jmh.LIZIZ(constraintLayout.getContext(), str).LIZIZ(new C0FXG(this, 2));
    }
}
