package X;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import irm.AkS92S0100000_25;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0siJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1637490siJ extends AbstractC1664490tPr<C1630350sWn, C1628220sTM> {
    public static final float LLLIILIL = C418440Gaw.LIZIZ(-20);
    public final boolean LLJJJIL;
    public TuxIconView LLJJJJ;
    public TuxIconView LLJJJJJIL;
    public TuxIconView LLJJJJLIIL;
    public TuxTextView LLJJL;
    public TuxIconView LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public TuxTextView LLJLIL;
    public ViewGroup LLJLILLLLZIIL;
    public ViewGroup LLJLL;
    public boolean LLJLLIL;
    public C417550GYv LLJLLL;
    public AnimatorSet LLJZIJLIL;
    public boolean LLL;
    public final int LLLIIII;
    public final C01GW LLLIIIIL;
    public final C01GW LLLIIIL;
    public final C01GW LLLIIL;
    public final C2252321DDq LLJZ = C1BNE.LIZ(null);
    public final C01GW LLLF = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(369));
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS569S0100000_25(this, 736));
    public final C01GW LLLFFI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 735));
    public final C01GW LLLFZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(367));
    public final C01GW LLLI = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(368));
    public final C01GW LLLII = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2300));

    public final ViewGroup LLLLLJLJLL() {
        return this.LLJJJIL ? this.LLJLL : this.LLJLILLLLZIIL;
    }

    public final boolean LLLLLL() {
        return ((Boolean) this.LLLFZ.getValue()).booleanValue();
    }

    public final boolean LLLLLLIL() {
        return ((Boolean) this.LLLIIIIL.getValue()).booleanValue();
    }

    public final boolean LLLLLLJ() {
        return ((Boolean) this.LLLII.getValue()).booleanValue();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        AnimatorSet animatorSet = this.LLJZIJLIL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.LLJZIJLIL = null;
        super.onDestroyView();
    }

    public C1637490siJ(boolean z) {
        int i;
        this.LLJJJIL = z;
        if (z) {
            i = R.layout.tx;
        } else if (LLLLLL()) {
            i = R.layout.wi;
        } else {
            i = R.layout.wj;
        }
        this.LLLIIII = i;
        this.LLLIIIIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2303));
        this.LLLIIIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2302));
        this.LLLIIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2301));
    }

    public final void LLLLLLLLL(boolean z) {
        C417550GYv c417550GYv;
        float f;
        C417580GYy c417580GYy = (C417580GYy) this.LLJZ.getValue();
        if (c417580GYy == null || (c417550GYv = this.LLJLLL) == null) {
            return;
        }
        if (z) {
            f = 0.08f;
        } else {
            f = 0.3f;
        }
        C417580GYy c417580GYy2 = new C417580GYy(f, c417580GYy.LIZ);
        C417550GYv.LIZIZ(c417550GYv, c417580GYy2);
        this.LLJZ.setValue(c417580GYy2);
    }

    public final void LLLLLLL(Context context, boolean z) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4 = -16777216;
        if (!this.LLJJJIL && !LLLLLLJ()) {
            if (LLLLLL()) {
                ViewGroup viewGroup = this.LLJLILLLLZIIL;
                if (viewGroup != null) {
                    float fLIZIZ = C418440Gaw.LIZIZ(200);
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LIZJ = Float.valueOf(fLIZIZ);
                    c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.a1g, context);
                    viewGroup.setBackground(LLLLLJIL(C1308910kAL.LIZJ(R.attr.zk, context), C1308910kAL.LIZJ(R.attr.zj, context), c384050F3z.LIZ(context), viewGroup.getResources().getDisplayMetrics().density, fLIZIZ));
                    viewGroup.setClipToOutline(true);
                }
                LLLLLLLLL(z);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
                if (numLIZJ != null) {
                    iIntValue4 = numLIZJ.intValue();
                }
                TuxIconView tuxIconView = this.LLJJJJ;
                if (tuxIconView != null) {
                    tuxIconView.setTintColor(iIntValue4);
                }
                TuxIconView tuxIconView2 = this.LLJJJJJIL;
                if (tuxIconView2 != null) {
                    tuxIconView2.setTintColor(iIntValue4);
                }
                TuxIconView tuxIconView3 = this.LLJJLIIIJLLLLLLLZ;
                if (tuxIconView3 != null) {
                    tuxIconView3.setTintColor(iIntValue4);
                }
                TuxTextView tuxTextView = this.LLJJL;
                if (tuxTextView != null) {
                    tuxTextView.setTextColor(iIntValue4);
                }
                C384050F3z c384050F3z2 = new C384050F3z();
                c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
                c384050F3z2.LIZ = C1308910kAL.LIZJ(R.attr.a02, context);
                Drawable drawableLIZ = c384050F3z2.LIZ(context);
                TuxIconView tuxIconView4 = this.LLJJJJ;
                if (tuxIconView4 != null) {
                    tuxIconView4.setBackground(drawableLIZ);
                }
                TuxIconView tuxIconView5 = this.LLJJJJJIL;
                if (tuxIconView5 != null) {
                    tuxIconView5.setBackground(drawableLIZ);
                }
                TuxIconView tuxIconView6 = this.LLJJLIIIJLLLLLLLZ;
                if (tuxIconView6 != null) {
                    tuxIconView6.setBackground(drawableLIZ);
                    return;
                }
                return;
            }
            if (!((Boolean) this.LLLI.getValue()).booleanValue()) {
                return;
            }
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, context);
            if (numLIZJ2 != null) {
                iIntValue4 = numLIZJ2.intValue();
            }
            TuxIconView tuxIconView7 = this.LLJJJJ;
            if (tuxIconView7 != null) {
                tuxIconView7.setTintColor(iIntValue4);
            }
            TuxIconView tuxIconView8 = this.LLJJJJJIL;
            if (tuxIconView8 != null) {
                tuxIconView8.setTintColor(iIntValue4);
            }
            TuxIconView tuxIconView9 = this.LLJJLIIIJLLLLLLLZ;
            if (tuxIconView9 != null) {
                tuxIconView9.setTintColor(iIntValue4);
            }
            C384050F3z c384050F3z3 = new C384050F3z();
            c384050F3z3.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
            c384050F3z3.LIZ = C1308910kAL.LIZJ(R.attr.a02, context);
            Drawable drawableLIZ2 = c384050F3z3.LIZ(context);
            TuxIconView tuxIconView10 = this.LLJJJJ;
            if (tuxIconView10 == null) {
                return;
            }
            tuxIconView10.setBackground(drawableLIZ2);
            return;
        }
        ViewGroup viewGroup2 = this.LLJLILLLLZIIL;
        if (viewGroup2 != null) {
            float fLIZIZ2 = C418440Gaw.LIZIZ(200);
            C384050F3z c384050F3z4 = new C384050F3z();
            c384050F3z4.LIZJ = Float.valueOf(fLIZIZ2);
            c384050F3z4.LIZ = C1308910kAL.LIZJ(R.attr.a1g, context);
            viewGroup2.setBackground(LLLLLJIL(C1308910kAL.LIZJ(R.attr.zk, context), C1308910kAL.LIZJ(R.attr.zj, context), c384050F3z4.LIZ(context), viewGroup2.getResources().getDisplayMetrics().density, fLIZIZ2));
            viewGroup2.setClipToOutline(true);
        }
        LLLLLLLLL(z);
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1h, context);
        if (numLIZJ3 != null) {
            iIntValue = numLIZJ3.intValue();
        } else {
            iIntValue = -16777216;
        }
        Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.a1k, context);
        if (numLIZJ4 != null) {
            iIntValue2 = numLIZJ4.intValue();
        } else {
            iIntValue2 = -16777216;
        }
        TuxIconView tuxIconView11 = this.LLJJJJ;
        if (tuxIconView11 != null) {
            tuxIconView11.setTintColor(iIntValue);
        }
        TuxIconView tuxIconView12 = this.LLJJJJLIIL;
        if (tuxIconView12 != null) {
            tuxIconView12.setTintColor(iIntValue);
        }
        TuxIconView tuxIconView13 = this.LLJJLIIIJLLLLLLLZ;
        if (tuxIconView13 != null) {
            tuxIconView13.setTintColor(iIntValue);
        }
        TuxIconView tuxIconView14 = this.LLJJJJJIL;
        if (tuxIconView14 != null) {
            Integer numLIZJ5 = C1308910kAL.LIZJ(R.attr.bk, context);
            if (numLIZJ5 != null) {
                iIntValue3 = numLIZJ5.intValue();
            } else {
                iIntValue3 = -16777216;
            }
            tuxIconView14.setTintColor(iIntValue3);
        }
        if (z) {
            C384050F3z c384050F3z5 = new C384050F3z();
            c384050F3z5.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
            c384050F3z5.LIZ = C1308910kAL.LIZJ(R.attr.a1g, context);
            Drawable drawableLIZ3 = c384050F3z5.LIZ(context);
            TuxIconView tuxIconView15 = this.LLJJJJJIL;
            if (tuxIconView15 != null) {
                tuxIconView15.setTintColor(-16777216);
            }
            TuxIconView tuxIconView16 = this.LLJJJJJIL;
            if (tuxIconView16 != null) {
                tuxIconView16.setBackground(drawableLIZ3);
            }
        } else {
            C384050F3z c384050F3z6 = new C384050F3z();
            c384050F3z6.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
            c384050F3z6.LIZ = -1;
            Drawable drawableLIZ4 = c384050F3z6.LIZ(context);
            TuxIconView tuxIconView17 = this.LLJJJJJIL;
            if (tuxIconView17 != null) {
                tuxIconView17.setBackground(drawableLIZ4);
            }
        }
        TuxTextView tuxTextView2 = this.LLJJL;
        if (tuxTextView2 != null) {
            tuxTextView2.setTextColor(iIntValue);
        }
        TuxTextView tuxTextView3 = this.LLJL;
        if (tuxTextView3 != null) {
            tuxTextView3.setTextColor(iIntValue);
        }
        TuxTextView tuxTextView4 = this.LLJLIL;
        if (tuxTextView4 != null) {
            tuxTextView4.setTextColor(iIntValue2);
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroupLLLLLJLJLL;
        ViewGroup.LayoutParams layoutParams;
        TuxIconView tuxIconView;
        TuxIconView tuxIconView2;
        View viewTd = C786410Ut5.Td(layoutInflater, this.LLLIIII, viewGroup, false);
        TuxIconView tuxIconView3 = (TuxIconView) viewTd.findViewById(R.id.vjx);
        this.LLJJJJJIL = tuxIconView3;
        if (tuxIconView3 != null) {
            C786410Ut5.I7(new AkS92S0100000_25(this, 7), tuxIconView3);
        }
        this.LLJLILLLLZIIL = (ViewGroup) viewTd.findViewById(R.id.vjv);
        this.LLJLL = (ViewGroup) viewTd.findViewById(R.id.vjw);
        TuxIconView tuxIconView4 = (TuxIconView) viewTd.findViewById(R.id.vjy);
        this.LLJJJJ = tuxIconView4;
        if (tuxIconView4 != null) {
            C786410Ut5.I7(new AkS92S0100000_25(this, 8), tuxIconView4);
        }
        TuxIconView tuxIconView5 = (TuxIconView) viewTd.findViewById(R.id.vjz);
        this.LLJJLIIIJLLLLLLLZ = tuxIconView5;
        if (tuxIconView5 != null) {
            C786410Ut5.I7(new AkS92S0100000_25(this, 9), tuxIconView5);
        }
        if (LLLLLLIL() && (tuxIconView2 = this.LLJJJJ) != null) {
            tuxIconView2.setIconRes(R.raw.icon_bookmark);
        }
        if (this.LLJJJIL) {
            TuxIconView tuxIconView6 = (TuxIconView) viewTd.findViewById(R.id.vk1);
            this.LLJJJJLIIL = tuxIconView6;
            if (tuxIconView6 != null) {
                C786410Ut5.I7(new AkS92S0100000_25(this, 10), tuxIconView6);
            }
            if (((Boolean) this.LLLIIIL.getValue()).booleanValue() && (tuxIconView = this.LLJJJJLIIL) != null) {
                tuxIconView.setIconRes(R.raw.icon_magnifying_glass_sparkles);
            }
        }
        if (LLLLLL() || this.LLJJJIL) {
            TuxTextView tuxTextView = (TuxTextView) viewTd.findViewById(R.id.vk2);
            this.LLJJL = tuxTextView;
            if (tuxTextView != null) {
                C786410Ut5.I7(new AkS92S0100000_25(this, 11), tuxTextView);
            }
        }
        if (LLLLLLJ()) {
            LinearLayout linearLayout = (LinearLayout) viewTd.findViewById(R.id.y0w);
            if (linearLayout != null) {
                C786410Ut5.LJZL(0, linearLayout);
                C786410Ut5.I7(new AkS92S0100000_25(this, 12), linearLayout);
            }
            TuxTextView tuxTextView2 = this.LLJJL;
            if (tuxTextView2 != null) {
                C786410Ut5.LLLLZLL(tuxTextView2, 8);
            }
            this.LLJL = (TuxTextView) viewTd.findViewById(R.id.vk4);
            this.LLJLIL = (TuxTextView) viewTd.findViewById(R.id.vk3);
        }
        if (this.LLJJJIL) {
            TuxIconView tuxIconView7 = this.LLJJJJJIL;
            if (tuxIconView7 != null) {
                C632780Ors.LIZ(tuxIconView7, 8, 8, 8, 8);
            }
            TuxIconView tuxIconView8 = this.LLJJLIIIJLLLLLLLZ;
            if (tuxIconView8 != null) {
                C632780Ors.LIZ(tuxIconView8, 8, 8, 8, 8);
            }
            TuxIconView tuxIconView9 = this.LLJJJJ;
            if (tuxIconView9 != null) {
                C632780Ors.LIZ(tuxIconView9, 8, 8, 8, 8);
            }
        } else if (LLLLLL()) {
            TuxIconView tuxIconView10 = this.LLJJJJJIL;
            if (tuxIconView10 != null) {
                C632780Ors.LIZ(tuxIconView10, 8, 8, 8, 8);
            }
            TuxIconView tuxIconView11 = this.LLJJLIIIJLLLLLLLZ;
            if (tuxIconView11 != null) {
                C632780Ors.LIZ(tuxIconView11, 8, 8, 8, 8);
            }
            TuxIconView tuxIconView12 = this.LLJJJJ;
            if (tuxIconView12 != null) {
                C632780Ors.LIZ(tuxIconView12, 8, 8, 8, 8);
            }
        } else if (((Boolean) this.LLLI.getValue()).booleanValue()) {
            TuxIconView tuxIconView13 = this.LLJJJJJIL;
            if (tuxIconView13 != null) {
                C632780Ors.LIZ(tuxIconView13, 8, 8, 8, 8);
            }
            TuxIconView tuxIconView14 = this.LLJJLIIIJLLLLLLLZ;
            if (tuxIconView14 != null) {
                C632780Ors.LIZ(tuxIconView14, 8, 8, 8, 8);
            }
            TuxIconView tuxIconView15 = this.LLJJJJ;
            if (tuxIconView15 != null) {
                C632780Ors.LIZ(tuxIconView15, 6, 6, 6, 6);
            }
        }
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0sWm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1630350sWn) obj).LIZIZ;
            }
        }, new AwS587S0100000_8(this, 522));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0sWp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1630350sWn) obj).LIZJ;
            }
        }, new AwS595S0100000_16(this, 172));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0sXM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1630350sWn) obj).LJFF);
            }
        }, Lifecycle.State.STARTED, new AwS598S0100000_19(this, 499));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0siK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1630350sWn) obj).LJ);
            }
        }, Lifecycle.State.STARTED, new AwS604S0100000_25(this, 475));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0siL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1630350sWn) obj).LIZLLL);
            }
        }, Lifecycle.State.STARTED, new AwS604S0100000_25(this, 437));
        if (!this.LLJJJIL) {
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0sWo
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1630350sWn) obj).LJI;
                }
            }, Lifecycle.State.STARTED, new AwS598S0100000_19(this, 498));
        }
        if (this.LLJJJIL && (viewGroupLLLLLJLJLL = LLLLLJLJLL()) != null && (layoutParams = viewGroupLLLLLJLJLL.getLayoutParams()) != null && (layoutParams instanceof C19ME)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
            marginLayoutParams.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
        }
        if (this.LLJJJIL || LLLLLLJ()) {
            LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0sWq
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1630350sWn) obj).LJII;
                }
            }, Lifecycle.State.STARTED, new AwS595S0100000_16(this, 165));
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0sWs
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1630350sWn) obj).LJIIIZ;
            }
        }, Lifecycle.State.STARTED, new AwS604S0100000_25(this, 464));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0sWr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1630350sWn) obj).LJIIIIZZ;
            }
        }, Lifecycle.State.STARTED, new AwS595S0100000_16(this, 169));
        return (ViewGroup) viewTd;
    }

    public final Drawable LLLLLJIL(Integer num, Integer num2, Drawable drawable, float f, float f2) {
        if (((Boolean) this.LLLIIL.getValue()).booleanValue() && num != null && num2 != null) {
            C417550GYv c417550GYv = new C417550GYv(num.intValue(), num2.intValue(), f, f2);
            this.LLJLLL = c417550GYv;
            return new LayerDrawable(new Drawable[]{drawable, c417550GYv});
        }
        return drawable;
    }
}
