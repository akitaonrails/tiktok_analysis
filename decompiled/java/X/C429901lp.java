package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* JADX INFO: renamed from: X.01lp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C429901lp extends ConstraintLayout {
    public C447270HgL LL;
    public C447270HgL LLILLJJLI;
    public C447270HgL LLILLL;
    public C447270HgL LLILZ;
    public C447270HgL LLILZIL;
    public C447270HgL LLILZLL;
    public final HashMap<Integer, C447270HgL> LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public TuxSheet LLJI;
    public DataChannel LLJIJIL;

    public final long getSelectedDuration() {
        return ((long) this.LLIZLLLIL) * 60;
    }

    public final void e0(int i) {
        for (C447270HgL c447270HgL : this.LLIZ.values()) {
            if (c447270HgL != null) {
                c447270HgL.setSelected(false);
                if (c447270HgL != null) {
                    c447270HgL.setTextColor(C20736316Cj.LIZIZ(R.attr.ezs, getContext()));
                    c447270HgL.setIconColor(C20736316Cj.LIZIZ(R.attr.ezs, getContext()));
                }
            }
        }
        C447270HgL c447270HgL2 = this.LLIZ.get(Integer.valueOf(i));
        if (c447270HgL2 != null) {
            c447270HgL2.setSelected(true);
        }
        C447270HgL c447270HgL3 = this.LLIZ.get(Integer.valueOf(i));
        if (c447270HgL3 != null) {
            c447270HgL3.setTextColor(C20736316Cj.LIZIZ(R.attr.ezq, getContext()));
        }
        C447270HgL c447270HgL4 = this.LLIZ.get(Integer.valueOf(i));
        if (c447270HgL4 != null) {
            c447270HgL4.setIconColor(C20736316Cj.LIZIZ(R.attr.ezq, getContext()));
        }
        if (i == 0) {
            i = this.LLJ;
        }
        this.LLIZLLLIL = i;
    }

    public final void setSelectedButtonByMin(int i) {
        if (this.LLIZ.get(Integer.valueOf(i)) != null) {
            e0(i);
            return;
        }
        C447270HgL c447270HgL = this.LLILZLL;
        if (c447270HgL != null) {
            c447270HgL.setText(C497740JfY.LJIJJ(2131843576, Integer.valueOf(i)));
        }
        this.LLJ = i;
        e0(0);
    }

    public C429901lp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        HashMap<Integer, C447270HgL> map = new HashMap<>();
        this.LLIZ = map;
        this.LLIZLLLIL = 1;
        this.LLJ = 1;
        View viewSd = C786410Ut5.Sd(R.layout.g3s, C786410Ut5.ne(getContext()), this);
        this.LL = (C447270HgL) viewSd.findViewById(R.id.ez7);
        this.LLILLJJLI = (C447270HgL) viewSd.findViewById(R.id.ez8);
        this.LLILLL = (C447270HgL) viewSd.findViewById(R.id.ez4);
        this.LLILZ = (C447270HgL) viewSd.findViewById(R.id.ez5);
        this.LLILZIL = (C447270HgL) viewSd.findViewById(R.id.f701ez6);
        this.LLILZLL = (C447270HgL) viewSd.findViewById(R.id.ez9);
        C447270HgL c447270HgL = this.LL;
        if (c447270HgL != null) {
            c447270HgL.setText(C497740JfY.LJIJJ(2131843576, 3));
        }
        C447270HgL c447270HgL2 = this.LLILLJJLI;
        if (c447270HgL2 != null) {
            c447270HgL2.setText(C497740JfY.LJIJJ(2131843576, 5));
        }
        C447270HgL c447270HgL3 = this.LLILLL;
        if (c447270HgL3 != null) {
            c447270HgL3.setText(C497740JfY.LJIJJ(2131843576, 10));
        }
        C447270HgL c447270HgL4 = this.LLILZ;
        if (c447270HgL4 != null) {
            c447270HgL4.setText(C497740JfY.LJIJJ(2131843576, 15));
        }
        C447270HgL c447270HgL5 = this.LLILZIL;
        if (c447270HgL5 != null) {
            c447270HgL5.setText(C497740JfY.LJIJJ(2131843576, 20));
        }
        map.put(3, this.LL);
        map.put(5, this.LLILLJJLI);
        map.put(10, this.LLILLL);
        map.put(15, this.LLILZ);
        map.put(20, this.LLILZIL);
        map.put(0, this.LLILZLL);
        for (View view : map.values()) {
            if (view != null) {
                view.setBackground(C424030Gjx.LIZ(getContext()));
                view.setSelected(false);
            }
        }
        h0(this.LL, 3);
        h0(this.LLILLJJLI, 5);
        h0(this.LLILLL, 10);
        h0(this.LLILZ, 15);
        h0(this.LLILZIL, 20);
        h0(this.LLILZLL, 0);
    }

    public final void h0(C447270HgL c447270HgL, int i) {
        if (c447270HgL != null) {
            C500260Jjc.LJLIIIL(500L, c447270HgL, new C430101lr(this, i));
        }
    }
}
