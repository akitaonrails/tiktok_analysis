package Y;

import X.C0HZQ;
import X.C1420180n3o;
import X.C1421110n5J;
import X.C1421140n5M;
import X.C1421170n5P;
import X.C800330VaR;
import X.InterfaceC1421120n5K;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSelectItem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes23.dex */
public class ACListenerS49S0201000_22 implements View.OnClickListener {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS49S0201000_22 aCListenerS49S0201000_22, View view) {
        boolean z;
        if (((C1421140n5M) aCListenerS49S0201000_22.l0).LL != aCListenerS49S0201000_22.i2) {
            z = true;
        } else {
            z = false;
        }
        InterfaceC1421120n5K povPanelClickListener = ((C1421110n5J) aCListenerS49S0201000_22.l1).getPovPanelClickListener();
        if (povPanelClickListener != null) {
            povPanelClickListener.LJI(((C1421170n5P) ListProtector.get(((C1421140n5M) aCListenerS49S0201000_22.l0).LLILLJJLI, aCListenerS49S0201000_22.i2)).LIZ, z);
        }
        C1421140n5M c1421140n5M = (C1421140n5M) aCListenerS49S0201000_22.l0;
        int i = aCListenerS49S0201000_22.i2;
        int i2 = c1421140n5M.LL;
        if (!z) {
            i = -1;
        }
        c1421140n5M.LL = i;
        if (i2 != -1) {
            c1421140n5M.notifyItemChanged(i2);
        }
        int i3 = c1421140n5M.LL;
        if (i3 != -1) {
            c1421140n5M.notifyItemChanged(i3);
        }
    }

    public static final void onClick$1(ACListenerS49S0201000_22 aCListenerS49S0201000_22, View view) {
        C0HZQ c0hzq = ((C1420180n3o) aCListenerS49S0201000_22.l0).LLILZIL;
        if (c0hzq != null) {
            c0hzq.setChecked(!((ImageSelectItem) aCListenerS49S0201000_22.l1).isSelected);
        }
        C0HZQ c0hzq2 = ((C1420180n3o) aCListenerS49S0201000_22.l0).LLILZIL;
        if (c0hzq2 != null && c0hzq2.isChecked()) {
            FrameLayout frameLayout = ((C1420180n3o) aCListenerS49S0201000_22.l0).LLILZLL;
            if (frameLayout != null) {
                frameLayout.setBackgroundColor(0);
            }
        } else {
            C1420180n3o c1420180n3o = (C1420180n3o) aCListenerS49S0201000_22.l0;
            FrameLayout frameLayout2 = c1420180n3o.LLILZLL;
            if (frameLayout2 != null) {
                frameLayout2.setBackground(C800330VaR.LIZIZ(c1420180n3o.itemView.getContext(), R.drawable.c1p));
            }
        }
        ((C1420180n3o) aCListenerS49S0201000_22.l0).LL.LIZ(aCListenerS49S0201000_22.i2, true ^ ((ImageSelectItem) aCListenerS49S0201000_22.l1).isSelected);
    }

    public ACListenerS49S0201000_22(Object obj, int i, Object obj2, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i2 = i;
        this.l1 = obj2;
    }
}
