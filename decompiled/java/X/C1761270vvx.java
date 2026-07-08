package X;

import Y.ACListenerS160S0100000_26;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0vvx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1761270vvx implements InterfaceC1761370vw7 {
    public final C1761310vw1 LL;
    public View LLILLJJLI;
    public C1744710vVF LLILLL;
    public Integer LLILZ;

    public /* synthetic */ C1761270vvx() {
        this(new C1761310vw1(true, null));
    }

    @Override // X.InterfaceC1761370vw7
    public final void LJFF() {
        View view = this.LLILLJJLI;
        if (view == null) {
            return;
        }
        C786410Ut5.LJJJLZIJ(this.LLILLJJLI, (ViewGroup) view.getParent());
    }

    public C1761270vvx(C1761310vw1 c1761310vw1) {
        this.LL = c1761310vw1;
    }

    @Override // X.InterfaceC1761370vw7
    public final void onPageSelected(int i) {
        C1744710vVF c1744710vVF;
        if (this.LLILLJJLI != null && (c1744710vVF = this.LLILLL) != null) {
            c1744710vVF.LJJJJJ(i);
        }
    }

    @Override // X.InterfaceC1761370vw7
    public final void onShow(int i) {
        View view = this.LLILLJJLI;
        if (view == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(0, view);
        if (!this.LL.LIZIZ) {
            C1744710vVF c1744710vVF = this.LLILLL;
            if (c1744710vVF != null) {
                C786410Ut5.K(c1744710vVF, 8);
                return;
            }
            return;
        }
        C1744710vVF c1744710vVF2 = this.LLILLL;
        if (c1744710vVF2 != null) {
            c1744710vVF2.setRealSize(i);
        }
        if (i <= 1) {
            C1744710vVF c1744710vVF3 = this.LLILLL;
            if (c1744710vVF3 != null) {
                C786410Ut5.K(c1744710vVF3, 8);
                return;
            }
            return;
        }
        C1744710vVF c1744710vVF4 = this.LLILLL;
        if (c1744710vVF4 == null) {
            return;
        }
        C786410Ut5.K(c1744710vVF4, 0);
    }

    @Override // X.InterfaceC1761370vw7
    public final void setAlpha(float f) {
        View view = this.LLILLJJLI;
        if (view == null) {
            return;
        }
        C786410Ut5.T4(view, f);
    }

    @Override // X.InterfaceC1761370vw7
    public final void LJII(FrameLayout frameLayout, InterfaceC1763860w08 interfaceC1763860w08) {
        TuxIconView tuxIconView;
        C1744710vVF c1744710vVF = null;
        View viewSd = C786410Ut5.Sd(R.layout.ani, C786410Ut5.ne(frameLayout.getContext()), null);
        this.LLILLJJLI = viewSd;
        if (viewSd != null && (tuxIconView = (TuxIconView) viewSd.findViewById(R.id.rp1)) != null) {
            Integer num = this.LL.LIZ;
            if (num != null) {
                tuxIconView.setIconRes(num.intValue());
            }
            C786410Ut5.a9(tuxIconView, new ACListenerS160S0100000_26(interfaceC1763860w08, 76));
        }
        Integer num2 = this.LLILZ;
        if (num2 != null) {
            int iIntValue = num2.intValue();
            View view = this.LLILLJJLI;
            if (view != null) {
                view.setBackground(frameLayout.getContext().getDrawable(iIntValue));
            }
        }
        View view2 = this.LLILLJJLI;
        if (view2 != null) {
            c1744710vVF = (C1744710vVF) view2.findViewById(R.id.rqx);
        }
        this.LLILLL = c1744710vVF;
        if (!this.LL.LIZIZ && c1744710vVF != null) {
            C786410Ut5.K(c1744710vVF, 8);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 48;
        frameLayout.addView(this.LLILLJJLI, layoutParams);
        View view3 = this.LLILLJJLI;
        if (view3 != null) {
            view3.setPadding(0, C497820Jfg.LIZJ(frameLayout.getContext()), 0, 0);
        }
    }
}
