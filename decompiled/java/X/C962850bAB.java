package X;

import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS559S0100000_15;
import wh6.AbS696S0100000_15;

/* JADX INFO: renamed from: X.0bAB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C962850bAB extends AbstractC960400b6E<C962860bAC> {
    public final Function1<Integer, Unit> LLILZ;
    public final int LLILZIL;
    public final C01GW LLILZLL;

    @Override // X.AbstractC960400b6E
    public final String getName() {
        return "InteractRandomLinkMicUnselectedInterestTagViewHolder";
    }

    public C962850bAB(int i, View view, Function1 function1) {
        super(view);
        this.LLILZ = function1;
        this.LLILZIL = i;
        this.LLILZLL = C1935407i4.LIZ(new AwS559S0100000_15(view, 1010));
    }

    @Override // X.AbstractC960400b6E
    public final void I5(List list, int i, Object obj) {
        C962860bAC c962860bAC = (C962860bAC) obj;
        int iLIZ = 0;
        if (list != null && list.isEmpty()) {
            TextView textView = (TextView) this.LLILZLL.getValue();
            if (textView != null) {
                textView.setText(c962860bAC.LJ);
            }
            C786410Ut5.I7(new AbS696S0100000_15(this, 10), this.itemView);
        }
        View view = this.itemView;
        if (!c962860bAC.LJII) {
            iLIZ = C439101nJ.LIZ(this.LLILZIL);
        }
        C500260Jjc.LJJLJLI(iLIZ, view);
        int i2 = c962860bAC.LJI;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    this.itemView.setBackgroundResource(R.drawable.e5_);
                    TextView textView2 = (TextView) this.LLILZLL.getValue();
                    if (textView2 != null) {
                        textView2.setTextColor(C497740JfY.LIZLLL(R.attr.ezt, this.itemView.getContext()));
                    }
                    C786410Ut5.T4(this.itemView, 0.34f);
                    return;
                }
                return;
            }
            this.itemView.setBackgroundResource(R.drawable.e59);
            TextView textView3 = (TextView) this.LLILZLL.getValue();
            if (textView3 != null) {
                textView3.setTextColor(C497740JfY.LIZLLL(R.attr.ey7, this.itemView.getContext()));
            }
            C786410Ut5.T4(this.itemView, 1.0f);
            return;
        }
        this.itemView.setBackgroundResource(R.drawable.e5_);
        TextView textView4 = (TextView) this.LLILZLL.getValue();
        if (textView4 != null) {
            textView4.setTextColor(C497740JfY.LIZLLL(R.attr.ezt, this.itemView.getContext()));
        }
        C786410Ut5.T4(this.itemView, 1.0f);
    }
}
