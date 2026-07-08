package X;

import Y.ACListenerS169S0100000_35;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ViewSwitcher;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.1DWA, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DWA extends ConstraintLayout implements InterfaceC1632106aF {
    public static final /* synthetic */ int LLJILJIL = 0;
    public final /* synthetic */ C1631706aB LL;
    public boolean LLILLJJLI;
    public final C0ZFW LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;
    public TuxTextView LLIZ;
    public TuxTextView LLIZLLLIL;
    public ViewSwitcher LLJ;
    public C0ZFY LLJI;
    public EnumC2255581DQe LLJIJIL;

    @Override // X.InterfaceC1632106aF
    public final void LJIILIIL() {
        this.LL.LJIILIIL();
    }

    @Override // X.C06OA
    public final void LLLZIL(C06MF c06mf) {
        this.LL.LLLZIL(c06mf);
    }

    @Override // X.C06OA
    public final void LLZLI() {
        this.LL.LLZLI();
    }

    @Override // X.C06OA
    public final void l(C06MF c06mf) {
        this.LL.l(c06mf);
    }

    public final void h0(C1DWB c1dwb) {
        int iLIZIZ;
        int iLIZIZ2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        TuxTextView tuxTextView = this.LLILZ;
        if (tuxTextView != null) {
            e0(tuxTextView, c1dwb.LIZ);
        }
        TuxTextView tuxTextView2 = this.LLILZIL;
        if (tuxTextView2 != null) {
            e0(tuxTextView2, c1dwb.LIZIZ);
        }
        boolean z = !(c1dwb.LIZ instanceof C07YW);
        boolean z2 = !(c1dwb.LIZJ instanceof C1DWD);
        TuxTextView tuxTextView3 = this.LLILZIL;
        if (tuxTextView3 != null) {
            if (z) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            }
            if (z2) {
                iLIZIZ2 = 0;
            } else {
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            }
            ViewGroup.LayoutParams layoutParams = tuxTextView3.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null && (marginLayoutParams.topMargin != iLIZIZ || marginLayoutParams.bottomMargin != iLIZIZ2)) {
                ViewGroup.LayoutParams layoutParams2 = tuxTextView3.getLayoutParams();
                if (layoutParams2 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.topMargin = iLIZIZ;
                    marginLayoutParams2.bottomMargin = iLIZIZ2;
                    C786410Ut5.W5(tuxTextView3, marginLayoutParams2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
        }
        C1DWC c1dwc = c1dwb.LIZJ;
        if (c1dwc instanceof C1DWD) {
            ViewSwitcher viewSwitcher = this.LLJ;
            if (viewSwitcher != null) {
                int visibility = viewSwitcher.getVisibility();
                viewSwitcher.setVisibility(8);
                C1602160rnK.LIZIZ(visibility, 8, viewSwitcher);
                return;
            }
            return;
        }
        if (c1dwc instanceof C1782510wUD) {
            ViewSwitcher viewSwitcher2 = this.LLJ;
            if (viewSwitcher2 != null) {
                int visibility2 = viewSwitcher2.getVisibility();
                viewSwitcher2.setVisibility(0);
                C1602160rnK.LIZIZ(visibility2, 0, viewSwitcher2);
            }
            ViewSwitcher viewSwitcher3 = this.LLJ;
            if (viewSwitcher3 != null) {
                viewSwitcher3.setDisplayedChild(0);
            }
            TuxTextView tuxTextView4 = this.LLILZLL;
            if (tuxTextView4 != null) {
                tuxTextView4.setText(getContext().getString(((C1782510wUD) c1dwc).LIZ));
            }
            TuxTextView tuxTextView5 = this.LLILZLL;
            if (tuxTextView5 == null) {
                return;
            }
            C786410Ut5.h9(tuxTextView5, new ACListenerS169S0100000_35(c1dwc, 3));
            return;
        }
        if (c1dwc instanceof C2190661AoS) {
            ViewSwitcher viewSwitcher4 = this.LLJ;
            if (viewSwitcher4 != null) {
                int visibility3 = viewSwitcher4.getVisibility();
                viewSwitcher4.setVisibility(0);
                C1602160rnK.LIZIZ(visibility3, 0, viewSwitcher4);
            }
            ViewSwitcher viewSwitcher5 = this.LLJ;
            if (viewSwitcher5 != null) {
                viewSwitcher5.setDisplayedChild(1);
            }
            TuxTextView tuxTextView6 = this.LLIZ;
            if (tuxTextView6 != null) {
                tuxTextView6.setText(tuxTextView6.getContext().getString(((C2190661AoS) c1dwc).LIZ));
                C786410Ut5.h9(tuxTextView6, new ACListenerS169S0100000_35(c1dwc, 4));
            }
            TuxTextView tuxTextView7 = this.LLIZLLLIL;
            if (tuxTextView7 == null) {
                return;
            }
            tuxTextView7.setText(tuxTextView7.getContext().getString(((C2190661AoS) c1dwc).LIZJ));
            C786410Ut5.h9(tuxTextView7, new ACListenerS169S0100000_35(c1dwc, 5));
            return;
        }
        throw new C1954807lC();
    }

    public final void i0(int i) {
        if (!this.LLILLJJLI && i != 8) {
            this.LLILLJJLI = true;
            C786410Ut5.LJLLJ(getContext(), R.layout.col, this);
            this.LLILZ = (TuxTextView) findViewById(R.id.tv_title);
            this.LLILZIL = (TuxTextView) findViewById(R.id.zi5);
            this.LLILZLL = (TuxTextView) findViewById(R.id.tv_one_action_button);
            this.LLIZ = (TuxTextView) findViewById(R.id.tv_two_action_button_1);
            this.LLIZLLLIL = (TuxTextView) findViewById(R.id.tv_two_action_button_2);
            this.LLJ = (ViewSwitcher) findViewById(R.id.a29);
            LJIILIIL();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        i0(i);
        super.setVisibility(i);
    }

    public C1DWA(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void e0(TuxTextView tuxTextView, C07YV c07yv) {
        if (c07yv instanceof C07YW) {
            C786410Ut5.LJLLLLLL(8, tuxTextView);
            return;
        }
        if (c07yv instanceof C07YU) {
            C786410Ut5.LJLLLLLL(0, tuxTextView);
            tuxTextView.setText(tuxTextView.getContext().getString(((C07YU) c07yv).LIZ));
        } else {
            if (c07yv instanceof C07YT) {
                C786410Ut5.LJLLLLLL(0, tuxTextView);
                tuxTextView.setText(((C07YT) c07yv).LIZ);
                return;
            }
            throw new C1954807lC();
        }
    }

    public C1DWA(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = new C1631706aB();
        this.LLILLL = C0ZFW.LIZ;
        i0(getVisibility());
        this.LLJI = C896520ZFa.LIZ;
        this.LLJIJIL = EnumC2255581DQe.NONE;
    }
}
