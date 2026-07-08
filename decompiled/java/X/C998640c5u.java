package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0c5u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C998640c5u extends LinearLayout {
    public final C998650c5v LL;
    public final View LLILLJJLI;
    public final View LLILLL;
    public final View LLILZ;
    public final View LLILZIL;
    public final View LLILZLL;

    public final void LIZ() {
        C998650c5v c998650c5v = this.LL;
        if (c998650c5v != null) {
            C786410Ut5.LJLLLLLL(c998650c5v.LIZ ^ true ? 0 : 8, this.LLILLL);
            C786410Ut5.LJLLLLLL(this.LL.LIZ ? 0 : 8, this.LLILZ);
            C786410Ut5.LJLLLLLL(this.LL.LIZJ ? 0 : 8, this.LLILZLL);
            this.LLILZLL.setBackground(this.LL.LIZIZ ? getContext().getDrawable(R.drawable.abi) : getContext().getDrawable(R.drawable.abj));
        }
    }

    public final void setBgHeight(int i) {
        ViewGroup.LayoutParams layoutParams = this.LLILZIL.getLayoutParams();
        layoutParams.height = i;
        C786410Ut5.W5(this.LLILZIL, layoutParams);
        if (this.LLILZ.getVisibility() == 0) {
            ViewGroup.LayoutParams layoutParams2 = this.LLILZ.getLayoutParams();
            layoutParams2.height = i;
            C786410Ut5.W5(this.LLILZ, layoutParams2);
        }
    }

    public C998640c5u(Context context, C998650c5v c998650c5v) {
        super(context, null, 0);
        this.LL = c998650c5v;
        View viewSd = C786410Ut5.Sd(R.layout.vw, C786410Ut5.ne(context), this);
        this.LLILLJJLI = viewSd;
        this.LLILLL = viewSd.findViewById(R.id.ad7);
        this.LLILZ = viewSd.findViewById(R.id.e17);
        this.LLILZIL = viewSd.findViewById(R.id.e19);
        this.LLILZLL = viewSd.findViewById(R.id.l1d);
        LIZ();
    }
}
