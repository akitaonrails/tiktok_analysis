package X;

import Y.ACListenerS163S0100000_29;
import Y.ATListenerS461S0100000_29;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.SoftKeyBoardListener;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.114F, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C114F extends AbstractC1664490tPr<C194410114e, C114H> {
    public C19YA LLJJJIL;
    public View LLJJJJ;
    public View LLJJJJJIL;
    public View LLJJJJLIIL;
    public TuxIconView LLJJL;
    public TuxIconView LLJJLIIIJLLLLLLLZ;
    public ViewPager LLJL;
    public View LLJLIL;
    public C0I7D LLJLILLLLZIIL;
    public RelativeLayout LLJLL;
    public View LLJLLIL;
    public View LLJLLL;
    public C1749280vcc LLJZ;
    public View LLJZIJLIL;
    public View LLL;
    public View LLLF;
    public View LLLFF;
    public AnonymousClass1148 LLLFFI;
    public C0FMR LLLFZ;
    public C114C LLLI;
    public Integer LLLII;
    public boolean LLLIIII;
    public final SafeHandler LLLIIIIL = new SafeHandler(this);
    public final C19775212Ys LLLIIIL = new C19775212Ys(this, 3);
    public final C01GW LLLIIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 517));
    public final C19773412Ya LLLIILIL = new C19773412Ya(this, 10);
    public boolean LLLIL;

    public final boolean LLLLLL() {
        Activity activity = this.mActivity;
        return activity != null && ScreenUtils.getScreenHeight(activity) > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(640));
    }

    public final void LLLLLJIL() {
        if (LLLLLL()) {
            C0I7D c0i7d = this.LLJLILLLLZIIL;
            if (c0i7d != null) {
                c0i7d.setMaxLines(2);
            }
            C0I7D c0i7d2 = this.LLJLILLLLZIIL;
            if (c0i7d2 != null) {
                TuxIconView tuxIconView = this.LLJJL;
                ViewGroup.LayoutParams layoutParams = tuxIconView != null ? tuxIconView.getLayoutParams() : null;
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                int lineCount = c0i7d2.getLineCount();
                if (lineCount == 1) {
                    c0i7d2.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                    if (marginLayoutParams != null) {
                        marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
                    }
                    TuxIconView tuxIconView2 = this.LLJJL;
                    if (tuxIconView2 != null) {
                        C786410Ut5.M6(tuxIconView2, marginLayoutParams);
                    }
                    LLLLIL().LJIILJJIL.invoke(Boolean.FALSE);
                    return;
                }
                if (lineCount >= 2) {
                    c0i7d2.setMaxLines(2);
                    c0i7d2.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
                    if (marginLayoutParams != null) {
                        marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
                    }
                    TuxIconView tuxIconView3 = this.LLJJL;
                    if (tuxIconView3 != null) {
                        C786410Ut5.M6(tuxIconView3, marginLayoutParams);
                    }
                    LLLLIL().LJIILJJIL.invoke(Boolean.TRUE);
                }
            }
        }
    }

    public final void LLLLLLJ() {
        ViewGroup.LayoutParams layoutParams;
        if (LLLLLL()) {
            C0I7D c0i7d = this.LLJLILLLLZIIL;
            if (c0i7d != null && (layoutParams = c0i7d.getLayoutParams()) != null) {
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
            }
            C0I7D c0i7d2 = this.LLJLILLLLZIIL;
            if (c0i7d2 != null) {
                c0i7d2.setMaxLines(1);
            }
            TuxIconView tuxIconView = this.LLJJL;
            ViewGroup.MarginLayoutParams marginLayoutParams = null;
            ViewGroup.LayoutParams layoutParams2 = tuxIconView != null ? tuxIconView.getLayoutParams() : null;
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
            }
            TuxIconView tuxIconView2 = this.LLJJL;
            if (tuxIconView2 != null) {
                C786410Ut5.M6(tuxIconView2, marginLayoutParams);
            }
        }
    }

    public final void LLLLLLL() {
        SoftKeyBoardListener softKeyBoardListener;
        if ((LLLLIL().LJFF.invoke() == EnumC388580FLk.PANEL_EDITOR || LLLLIL().LJFF.invoke() == EnumC388580FLk.ONLY_PANEL) && (softKeyBoardListener = (SoftKeyBoardListener) this.LLLIIL.getValue()) != null) {
            softKeyBoardListener.LIZIZ(new InterfaceC1391500mJY() { // from class: X.114G
                @Override // X.InterfaceC1391500mJY
                public final void LLLL(int i) {
                }

                @Override // X.InterfaceC1391500mJY
                public final void LJJIIJ(int i) {
                    if (this.LL.LLLLIL().LJFF.invoke() == EnumC388580FLk.ONLY_PANEL) {
                        this.LL.LLLLIL().LJI.invoke(EnumC388580FLk.PANEL_EDITOR);
                    }
                }

                @Override // X.InterfaceC1391500mJY
                public final void LJZI(int i) {
                    if (this.LL.LLLLIL().LJFF.invoke() == EnumC388580FLk.PANEL_EDITOR) {
                        C114F c114f = this.LL;
                        if (c114f.LLLIL) {
                            c114f.LLLLIL().LJI.invoke(EnumC388580FLk.ONLY_PANEL);
                            View view = this.LL.LLJJJJ;
                            if (view != null) {
                                view.requestFocus();
                            }
                        }
                    }
                }
            });
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        SoftKeyBoardListener softKeyBoardListener = (SoftKeyBoardListener) this.LLLIIL.getValue();
        if (softKeyBoardListener != null) {
            softKeyBoardListener.LIZ();
        }
        this.LLLIIIIL.destroy();
    }

    @Override // X.AbstractC1664490tPr
    public final void onHide() {
        C1447800nmM.LIZIZ(this).LLLLLLLZIL(this.LLLIIIL);
    }

    @Override // X.AbstractC1664490tPr
    public final void onShow() {
        C1447800nmM.LIZIZ(this).LLLIILIL(this, this.LLLIIIL);
    }

    public final void LLLLLJLJLL(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C0I7D c0i7d = this.LLJLILLLLZIIL;
        ViewGroup.LayoutParams layoutParams = null;
        if (c0i7d != null) {
            layoutParams = c0i7d.getLayoutParams();
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i))));
            C0I7D c0i7d2 = this.LLJLILLLLZIIL;
            if (c0i7d2 != null) {
                C786410Ut5.P6(c0i7d2, marginLayoutParams);
            }
        }
    }

    public final void LLLLLLIL(boolean z) {
        View view = this.LLJLLL;
        if (view == null) {
            return;
        }
        C1462750oAT.LIZIZ(view, z, view.getHeight(), new View(requireSceneContext()), new C19773812Ye(this, z, 3));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (C545820Lau.LIZIZ(this) != null) {
            this.LLJJJIL = (C19YA) requireViewById(R.id.xik);
            this.LLJJJJJIL = requireViewById(R.id.o1o);
            this.LLJJJJ = requireViewById(R.id.mpt);
            this.LLJJJJLIIL = requireViewById(R.id.o1p);
            this.LLJL = (ViewPager) requireViewById(R.id.viewpager);
            this.LLJLILLLLZIIL = (C0I7D) requireViewById(R.id.gsi);
            this.LLJLIL = requireViewById(R.id.kg7);
            this.LLJJL = (TuxIconView) requireViewById(R.id.k3j);
            this.LLJJLIIIJLLLLLLLZ = (TuxIconView) requireViewById(R.id.k3m);
            this.LLJLL = (RelativeLayout) requireViewById(R.id.tes);
            this.LLJLLIL = requireViewById(R.id.tf5);
            this.LLJZ = (C1749280vcc) requireViewById(R.id.xr4);
            this.LLJZIJLIL = requireViewById(R.id.gsd);
            this.LLL = requireViewById(R.id.mfw);
            this.LLLFF = requireViewById(R.id.p8x);
            this.LLLF = requireViewById(R.id.m43);
            View viewRequireViewById = requireViewById(R.id.q1i);
            this.LLJLLL = viewRequireViewById;
            if (viewRequireViewById != null) {
                C786410Ut5.I7(new View.OnClickListener() { // from class: X.114I
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                    }
                }, viewRequireViewById);
            }
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_text_template_enable_redirect_to_l8", true, false) && C1205504nd.LIZ().length() > 0) {
                View view = this.LLLF;
                if (view != null) {
                    C786410Ut5.I7(new ACListenerS163S0100000_29(this, 115), view);
                }
            } else {
                View view2 = this.LLLF;
                if (view2 != null) {
                    C786410Ut5.I7(new View.OnClickListener() { // from class: X.114J
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                        }
                    }, view2);
                }
                View view3 = this.LLLFF;
                if (view3 != null) {
                    C786410Ut5.LJLLLLLL(8, view3);
                }
            }
            View view4 = this.LLLF;
            if (view4 != null) {
                C786410Ut5.LJLLLLLL(8, view4);
            }
            View view5 = this.LLL;
            if (view5 != null) {
                C786410Ut5.LJLLLLLL(4, view5);
            }
            C1749280vcc c1749280vcc = this.LLJZ;
            if (c1749280vcc != null) {
                c1749280vcc.LJ();
            }
            View view6 = this.LLL;
            if (view6 != null) {
                C786410Ut5.LJLLLLLL(4, view6);
            }
            ViewPager viewPager = this.LLJL;
            if (viewPager != null) {
                C786410Ut5.LLJ(viewPager, 4);
            }
            C19YA c19ya = this.LLJJJIL;
            if (c19ya != null) {
                c19ya.setTabMode(1);
            }
            C19YA c19ya2 = this.LLJJJIL;
            if (c19ya2 != null) {
                c19ya2.setTabMargin(12);
            }
            TuxIconView tuxIconView = this.LLJJL;
            if (tuxIconView != null) {
                C786410Ut5.a9(tuxIconView, new ACListenerS163S0100000_29(this, 116));
            }
            TuxIconView tuxIconView2 = this.LLJJLIIIJLLLLLLLZ;
            if (tuxIconView2 != null) {
                C786410Ut5.a9(tuxIconView2, new ACListenerS163S0100000_29(this, 117));
            }
            View view7 = this.LLJJJJJIL;
            if (view7 != null) {
                C786410Ut5.I7(new ACListenerS163S0100000_29(this, 118), view7);
            }
            View view8 = this.LLJJJJLIIL;
            if (view8 != null) {
                C786410Ut5.I7(new ACListenerS163S0100000_29(this, 119), view8);
            }
            View view9 = this.LLJLLIL;
            if (view9 != null) {
                C786410Ut5.ed(view9, -C814420VxA.LIZIZ(C418440Gaw.LIZIZ(70)));
            }
            View view10 = this.LLJLLIL;
            if (view10 != null) {
                C786410Ut5.I7(new ACListenerS163S0100000_29(this, 120), view10);
            }
            View view11 = this.LLJJJJLIIL;
            if (view11 != null) {
                C786410Ut5.T4(view11, 0.0f);
            }
            View view12 = this.LLJJJJJIL;
            if (view12 != null) {
                C786410Ut5.LJLLLLLL(8, view12);
            }
            TuxIconView tuxIconView3 = this.LLJJL;
            if (tuxIconView3 != null) {
                C786410Ut5.LJLLLLLL(8, tuxIconView3);
            }
            TuxIconView tuxIconView4 = this.LLJJLIIIJLLLLLLLZ;
            if (tuxIconView4 != null) {
                C786410Ut5.LJLLLLLL(8, tuxIconView4);
            }
            C0I7D c0i7d = this.LLJLILLLLZIIL;
            if (c0i7d != null) {
                c0i7d.addTextChangedListener(this.LLLIILIL);
            }
            C0I7D c0i7d2 = this.LLJLILLLLZIIL;
            if (c0i7d2 != null) {
                c0i7d2.setOnFocusChangeListener(new C12YL(this, 1));
            }
            C0I7D c0i7d3 = this.LLJLILLLLZIIL;
            if (c0i7d3 != null) {
                c0i7d3.setOnTouchListener(new ATListenerS461S0100000_29(this, 12));
            }
            View view13 = this.LLJLIL;
            if (view13 != null) {
                C786410Ut5.I7(new ACListenerS163S0100000_29(this, 114), view13);
            }
        }
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.114p
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C194410114e) obj).LIZ;
            }
        }, new AwS608S0100000_29(this, 297));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.114m
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C194410114e) obj).LIZIZ;
            }
        }, new AwS607S0100000_28(this, 159));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.114o
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C194410114e) obj).LJIIIIZZ;
            }
        }, new AwS608S0100000_29(this, 306));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.114q
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C194410114e) obj).LJIIIZ;
            }
        }, new AwS608S0100000_29(this, 288));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.114Y
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C194410114e) obj).LIZLLL;
            }
        }, new AwS608S0100000_29(this, 301));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0mnG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C194410114e) obj).LJ;
            }
        }, new AwS608S0100000_29(this, 302));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.114h
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C194410114e) obj).LJFF;
            }
        }, new AwS608S0100000_29(this, 303));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.114j
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C194410114e) obj).LJIIJ;
            }
        }, new AwS608S0100000_29(this, 304));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.114l
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C194410114e) obj).LJI;
            }
        }, new AwS608S0100000_29(this, 305));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.114n
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C194410114e) obj).LJII;
            }
        }, new AwS608S0100000_29(this, 307));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.114X
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C194410114e) obj).LJIIJJI;
            }
        }, new AwS608S0100000_29(this, 289));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.114Z
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C194410114e) obj).LJIIL;
            }
        }, new AwS608S0100000_29(this, 290));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.114a
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C194410114e) obj).LJIJ;
            }
        }, new AwS608S0100000_29(this, 291));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.114b
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C194410114e) obj).LJIJI;
            }
        }, new AwS608S0100000_29(this, 292));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.114c
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C194410114e) obj).LJIJJLI;
            }
        }, new AwS608S0100000_29(this, 298));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.114d
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C194410114e) obj).LJIJJ;
            }
        }, new AwS608S0100000_29(this, 299));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.114f
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C194410114e) obj).LJIILIIL;
            }
        }, new AwS584S0100000_5(this, 128));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.114g
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C194410114e) obj).LJIILL;
            }
        }, new AwS607S0100000_28(this, 157));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.114i
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C194410114e) obj).LJIIZILJ;
            }
        }, new AwS607S0100000_28(this, 158));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.114k
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C194410114e) obj).LJIILLIIL;
            }
        }, new AwS584S0100000_5(this, 131));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.fst, viewGroup, false);
    }
}
