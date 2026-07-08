package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.text.u;
import wh6.AbS710S0100000_31;

/* JADX INFO: renamed from: X.156L, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C156L extends C156W {
    public final View LIZLLL;
    public final Function0<Unit> LJ;
    public final Function0<Unit> LJFF;
    public C156M LJI;

    public final void LJIILIIL() {
        if (LIZ().LIZ(new C2217381BqS() { // from class: X.156S
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C156U) obj).LJ;
            }
        }).LJIIIIZZ(new C2217381BqS() { // from class: X.156Q
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C156K) obj).LIZ;
            }
        }).LIZJ() == C156O.FAIL) {
            return;
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LIZ.LJI), null, null, new C156H(this, LJIIJJI(), null), 3);
    }

    @Override // X.C156W
    public final void LJ(boolean z) {
        if (z) {
            C337180DJs.LIZJ(this.LJI);
        } else {
            C337180DJs.LIZ(this.LJI);
        }
    }

    @Override // X.C156W
    public final void LJFF(boolean z) {
        this.LJ.invoke();
    }

    @Override // X.C156W
    public final void LJII(int i) {
        TuxTextView tuxTextView;
        C156M c156m = this.LJI;
        if (c156m != null && c156m.LLJILJIL == C156O.STRIPPING && (tuxTextView = c156m.LLIZLLLIL) != null) {
            tuxTextView.setText(u.LJJIFFI(c156m.LL.getString(2131857895), "%1$s", String.valueOf(i), false));
        }
    }

    @Override // X.C156W
    public final void LJIIIIZZ(C156O c156o) {
        C156O c156o2;
        View viewLJLLLL;
        TuxTextView tuxTextView;
        View viewFindViewById;
        View viewLJLLLL2;
        View viewFindViewById2;
        boolean z;
        int i;
        View viewLJLLLL3;
        TuxTextView tuxTextView2;
        C156M c156m = this.LJI;
        boolean z2 = true;
        if (c156m != null && ((c156o2 = c156m.LLJILJIL) == null || c156o.ordinal() != c156o2.ordinal())) {
            C156O c156o3 = c156m.LLJILJIL;
            if (c156o3 != null) {
                int i2 = C156N.LIZ[c156o3.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3 && i2 != 4) {
                            throw new C1954807lC();
                        }
                        View view = c156m.LLJI;
                        if (view != null) {
                            C337180DJs.LIZ(view);
                        }
                    } else {
                        View view2 = c156m.LLIZ;
                        if (view2 != null) {
                            C337180DJs.LIZ(view2);
                        }
                    }
                } else {
                    View view3 = c156m.LLILLL;
                    if (view3 != null) {
                        C337180DJs.LIZ(view3);
                    }
                }
            }
            int i3 = C156N.LIZ[c156o.ordinal()];
            TuxTextView tuxTextView3 = null;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3 && i3 != 4) {
                        throw new C1954807lC();
                    }
                    if (c156o == C156O.SUCCESS) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (c156m.LLJI == null) {
                        ViewStub viewStub = c156m.LLJ;
                        if (viewStub != null) {
                            viewLJLLLL3 = C786410Ut5.LJLLLL(viewStub);
                        } else {
                            viewLJLLLL3 = null;
                        }
                        c156m.LLJI = viewLJLLLL3;
                        if (viewLJLLLL3 != null) {
                            tuxTextView2 = (TuxTextView) viewLJLLLL3.findViewById(R.id.tv_result);
                        } else {
                            tuxTextView2 = null;
                        }
                        c156m.LLJIJIL = tuxTextView2;
                    }
                    if (z) {
                        View view4 = c156m.LLJI;
                        if (view4 != null) {
                            C786410Ut5.I7(null, view4);
                        }
                    } else {
                        View view5 = c156m.LLJI;
                        if (view5 != null) {
                            C786410Ut5.I7(new AbS710S0100000_31(c156m, 17), view5);
                        }
                    }
                    TuxTextView tuxTextView4 = c156m.LLJIJIL;
                    if (tuxTextView4 != null) {
                        Context context = c156m.LL;
                        if (z) {
                            i = 2131857892;
                        } else {
                            i = 2131857891;
                        }
                        tuxTextView4.setText(context.getString(i));
                    }
                    C337180DJs.LIZJ(c156m.LLJI);
                } else {
                    if (c156m.LLIZ == null) {
                        ViewStub viewStub2 = c156m.LLILZLL;
                        if (viewStub2 != null) {
                            viewLJLLLL2 = C786410Ut5.LJLLLL(viewStub2);
                        } else {
                            viewLJLLLL2 = null;
                        }
                        c156m.LLIZ = viewLJLLLL2;
                        if (viewLJLLLL2 != null) {
                            tuxTextView3 = (TuxTextView) viewLJLLLL2.findViewById(R.id.zvw);
                        }
                        c156m.LLIZLLLIL = tuxTextView3;
                        View view6 = c156m.LLIZ;
                        if (view6 != null && (viewFindViewById2 = view6.findViewById(R.id.njq)) != null) {
                            C786410Ut5.I7(new AbS710S0100000_31(c156m, 16), viewFindViewById2);
                        }
                    }
                    TuxTextView tuxTextView5 = c156m.LLIZLLLIL;
                    if (tuxTextView5 != null) {
                        tuxTextView5.setText(c156m.LL.getString(2131857894));
                    }
                    C337180DJs.LIZJ(c156m.LLIZ);
                }
            } else {
                if (c156m.LLILLL == null) {
                    ViewStub viewStub3 = c156m.LLILLJJLI;
                    if (viewStub3 != null && (viewLJLLLL = C786410Ut5.LJLLLL(viewStub3)) != null) {
                        C786410Ut5.I7(new AbS710S0100000_31(c156m, 15), viewLJLLLL);
                    } else {
                        viewLJLLLL = null;
                    }
                    c156m.LLILLL = viewLJLLLL;
                    if (viewLJLLLL != null) {
                        tuxTextView = (TuxTextView) viewLJLLLL.findViewById(R.id.tv_prepare);
                    } else {
                        tuxTextView = null;
                    }
                    c156m.LLILZ = tuxTextView;
                    View view7 = c156m.LLILLL;
                    if (view7 != null) {
                        tuxTextView3 = (TuxTextView) view7.findViewById(R.id.tv_prepare_desc);
                    }
                    c156m.LLILZIL = tuxTextView3;
                    View view8 = c156m.LLILLL;
                    if (view8 != null && (viewFindViewById = view8.findViewById(R.id.djn)) != null) {
                        C384050F3z c384050F3z = new C384050F3z();
                        c384050F3z.LJFF = Integer.valueOf(R.attr.a1h);
                        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(1.5f))));
                        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(Float.valueOf(999.0f)));
                        viewFindViewById.setBackground(c384050F3z.LIZ(viewFindViewById.getContext()));
                    }
                }
                TuxTextView tuxTextView6 = c156m.LLILZ;
                if (tuxTextView6 != null) {
                    tuxTextView6.setText(c156m.LL.getString(2131857899));
                }
                TuxTextView tuxTextView7 = c156m.LLILZIL;
                if (tuxTextView7 != null) {
                    tuxTextView7.setText(c156m.LL.getString(2131857898));
                }
                View view9 = c156m.LLILLL;
                if (view9 != null) {
                    C337180DJs.LIZJ(view9);
                }
            }
            c156m.LLJILJIL = c156o;
        }
        if (c156o == C156O.STRIPPING) {
            z2 = false;
        }
        Object obj = this.LIZIZ;
        if (obj instanceof InterfaceC1459070o4X) {
            ((InterfaceC1459070o4X) obj).LJII(z2);
        }
    }

    public C156L(C155H c155h, AbstractC204621154x abstractC204621154x, C204646155w c204646155w, View view, AwS575S0100000_31 awS575S0100000_31, AwS575S0100000_31 awS575S0100000_312) {
        C156M c156m;
        super(c155h, abstractC204621154x);
        this.LIZLLL = view;
        this.LJ = awS575S0100000_31;
        this.LJFF = awS575S0100000_312;
        C204655156f c204655156f = new C204655156f(this);
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.vs_bottom_strip_banner_v2);
        View viewLJLLLL = viewStub != null ? C786410Ut5.LJLLLL(viewStub) : null;
        if ((viewLJLLLL instanceof C156M) && (c156m = (C156M) viewLJLLLL) != null) {
            this.LJI = c156m;
            c156m.LLJILJILJ = c204655156f;
        }
        LIZIZ();
        c204646155w.LLJILJIL.LIZ(new C2217381BqS() { // from class: X.1563
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((AnonymousClass1562) obj).LJFF;
            }
        }).LJIIIZ(c155h.LJI, Lifecycle.State.STARTED, new AwS610S0100000_31(this, 455));
        LIZIZ();
        if (abstractC204621154x.LJIJJ().LJIIJJI) {
            LIZ().LIZLLL(AFwS276S0000000_31.get$arr$(320), true);
            c155h.LJIIL.LJIIL();
        } else {
            LIZ().LIZLLL(new AwS610S0100000_31(this, 456), true);
            c155h.LJIIL.LJIILJJIL(LJIIJJI());
        }
    }
}
