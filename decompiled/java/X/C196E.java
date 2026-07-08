package X;

import Y.ARunnableS101S0200000_32;
import Y.ARunnableS132S0100000_32;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS576S0100000_32;
import mn3.e0;

/* JADX INFO: renamed from: X.196E, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C196E implements InterfaceC194555119t, InterfaceC379610EuV {
    public final C1653750t8X LL;
    public final C1DRG LLILLJJLI;
    public FrameLayout LLILLL;
    public View LLILZ;
    public TuxTextView LLILZIL;
    public C1322110kVd LLILZLL;
    public ConstraintLayout LLIZ;
    public boolean LLIZLLLIL;
    public Function2<? super Integer, ? super ViewGroup, ? extends View> LLJ;
    public final int LLJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(180));
    public long LLJIJIL = 3000;
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 594));
    public final ARunnableS132S0100000_32 LLJILJILJ = new ARunnableS132S0100000_32(this, 67);

    public final View LIZIZ() {
        return (View) this.LLJILJIL.getValue();
    }

    public final void LIZJ() {
        TuxTextView tuxTextView;
        C1322110kVd c1322110kVd = this.LLILZLL;
        if (c1322110kVd != null) {
            C786410Ut5.LLZZLLIL(c1322110kVd, 4);
        }
        String str = this.LL.LIZ;
        if (str == null || str.length() <= 0) {
            this.LLIZLLLIL = false;
            return;
        }
        TuxTextView tuxTextView2 = this.LLILZIL;
        if (tuxTextView2 != null) {
            C786410Ut5.LLLLZLL(tuxTextView2, 0);
        }
        ConstraintLayout constraintLayout = this.LLIZ;
        if (constraintLayout == null || (tuxTextView = this.LLILZIL) == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(0, LIZIZ());
        C786410Ut5.T4(LIZIZ(), 0.3f);
        C19MB c19mb = new C19MB();
        c19mb.LJII(constraintLayout);
        c19mb.LJJIIJZLJL(tuxTextView.getId(), 3, 0);
        c19mb.LJIIIIZZ(tuxTextView.getId(), 3, constraintLayout.getId(), 3);
        c19mb.LJIIIIZZ(tuxTextView.getId(), 4, constraintLayout.getId(), 4);
        c19mb.LIZIZ(constraintLayout);
        HandlerHook.viewPost(tuxTextView, new ARunnableS101S0200000_32(tuxTextView, this, 41));
        this.LLIZLLLIL = true;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC194555119t
    public final boolean isShowing() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC194555119t
    public final void LIZ(FrameLayout frameLayout) {
        View viewTd;
        C1322110kVd c1322110kVd;
        ConstraintLayout constraintLayout;
        boolean z;
        if (frameLayout == null) {
            return;
        }
        this.LLILLL = frameLayout;
        Function2<? super Integer, ? super ViewGroup, ? extends View> function2 = this.LLJ;
        if (function2 == null || (viewTd = function2.invoke(Integer.valueOf(R.layout.d9r), frameLayout)) == null) {
            viewTd = C786410Ut5.Td(C786410Ut5.ne(frameLayout.getContext()), R.layout.d9r, frameLayout, false);
        }
        this.LLILZ = viewTd;
        FrameLayout frameLayout2 = this.LLILLL;
        if (frameLayout2 != null) {
            frameLayout2.addView(viewTd);
        }
        View view = this.LLILZ;
        TuxTextView tuxTextView = null;
        if (view != null) {
            c1322110kVd = (C1322110kVd) view.findViewById(R.id.w5w);
        } else {
            c1322110kVd = null;
        }
        this.LLILZLL = c1322110kVd;
        View view2 = this.LLILZ;
        if (view2 != null) {
            constraintLayout = (ConstraintLayout) view2.findViewById(R.id.eux);
        } else {
            constraintLayout = null;
        }
        this.LLIZ = constraintLayout;
        View view3 = this.LLILZ;
        if (view3 != null) {
            tuxTextView = (TuxTextView) view3.findViewById(R.id.w6v);
        }
        this.LLILZIL = tuxTextView;
        UrlModel urlModel = this.LL.LIZIZ;
        if (urlModel != null) {
            z = !C580130Mp9.LIZ(urlModel.getUrlList());
        } else {
            z = false;
        }
        TuxTextView tuxTextView2 = this.LLILZIL;
        if (tuxTextView2 != null) {
            C786410Ut5.LLLLZLL(tuxTextView2, 4);
            String str = this.LL.LIZ;
            if (str != null && str.length() > 0) {
                tuxTextView2.setText(this.LL.LIZ);
                tuxTextView2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50)});
                tuxTextView2.setTuxFont(12);
            } else {
                tuxTextView2.setText("");
            }
        }
        if (z) {
            C1324750kZt.LJII(this.LLILZLL, C1441230nbl.LIZ(this.LL.LIZIZ), Bitmap.Config.RGB_565, false, new C1320700kTM<InterfaceC1330440kj4>() { // from class: X.196F
                @Override // X.C1320700kTM, X.InterfaceC1320650kTH
                public final void LIZLLL(String str2, Throwable th) {
                    this.LIZIZ.LIZJ();
                }

                @Override // X.C1320700kTM, X.InterfaceC1320650kTH
                public final void LJ(String str2, Object obj, Animatable animatable) {
                    C196E c196e;
                    FrameLayout frameLayout3;
                    C1322110kVd c1322110kVd2;
                    C1322110kVd c1322110kVd3;
                    InterfaceC1330440kj4 interfaceC1330440kj4 = (InterfaceC1330440kj4) obj;
                    C196E c196e2 = this.LIZIZ;
                    ConstraintLayout constraintLayout2 = c196e2.LLIZ;
                    if (constraintLayout2 != null && (c1322110kVd3 = c196e2.LLILZLL) != null && interfaceC1330440kj4 != null && Math.max(interfaceC1330440kj4.getHeight(), interfaceC1330440kj4.getWidth()) > c196e2.LLJI) {
                        C19MB c19mb = new C19MB();
                        c19mb.LJII(constraintLayout2);
                        c19mb.LJIIJJI(c1322110kVd3.getId(), c196e2.LLJI);
                        c19mb.LJIILL(c1322110kVd3.getId(), c196e2.LLJI);
                        c19mb.LIZIZ(constraintLayout2);
                    }
                    C196E c196e3 = this.LIZIZ;
                    String str3 = c196e3.LL.LIZ;
                    if (str3 != null && str3.length() > 0) {
                        TuxTextView tuxTextView3 = c196e3.LLILZIL;
                        if (tuxTextView3 != null) {
                            C786410Ut5.LLLLZLL(tuxTextView3, 0);
                            HandlerHook.viewPost(tuxTextView3, new ARunnableS101S0200000_32(tuxTextView3, c196e3, 40));
                        }
                    } else {
                        TuxTextView tuxTextView4 = c196e3.LLILZIL;
                        if (tuxTextView4 != null) {
                            C786410Ut5.LLLLZLL(tuxTextView4, 4);
                        }
                    }
                    View viewFF2 = (View) ((InterfaceC1650190t2n) c196e3.LLILLJJLI.LJII(e0.class, null)).St2();
                    if (viewFF2.getWidth() / viewFF2.getHeight() != 0.75f) {
                        viewFF2 = ((InterfaceC1650190t2n) c196e3.LLILLJJLI.LJII(e0.class, null)).fF2();
                    }
                    ConstraintLayout constraintLayout3 = c196e3.LLIZ;
                    if (constraintLayout3 != null && (c1322110kVd2 = c196e3.LLILZLL) != null) {
                        C786410Ut5.LJLLLLLL(0, c196e3.LIZIZ());
                        C786410Ut5.T4(c196e3.LIZIZ(), 0.3f);
                        C786410Ut5.LLZZLLIL(c1322110kVd2, 0);
                        C19MB c19mb2 = new C19MB();
                        c19mb2.LJII(constraintLayout3);
                        c19mb2.LJJIIJZLJL(c1322110kVd2.getId(), 3, viewFF2.getTop() + ((int) (viewFF2.getHeight() * 0.25f)));
                        c19mb2.LIZIZ(constraintLayout3);
                    }
                    c196e3.LLIZLLLIL = true;
                    String str4 = this.LIZIZ.LL.LIZ;
                    if ((str4 != null && str4.length() > 0) || (frameLayout3 = (c196e = this.LIZIZ).LLILLL) == null) {
                        return;
                    }
                    HandlerHook.viewPostDelay(frameLayout3, c196e.LLJILJILJ, c196e.LLJIJIL);
                }
            });
        } else {
            LIZJ();
        }
    }

    @Override // X.InterfaceC194555119t
    public final void LJJJJLL(boolean z) {
        FrameLayout frameLayout;
        C786410Ut5.LJLLLLLL(4, LIZIZ());
        FrameLayout frameLayout2 = this.LLILLL;
        if (frameLayout2 != null) {
            HandlerHook.viewRemoveCallbacks(frameLayout2, this.LLJILJILJ);
        }
        View view = this.LLILZ;
        if (view != null && (frameLayout = this.LLILLL) != null) {
            C786410Ut5.LJJJZ(view, frameLayout);
        }
        this.LLIZLLLIL = false;
    }

    public C196E(C1653750t8X c1653750t8X, C1DRG c1drg) {
        this.LL = c1653750t8X;
        this.LLILLJJLI = c1drg;
    }
}
