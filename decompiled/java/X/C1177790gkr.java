package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tux.widget.RadiusLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0gkr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1177790gkr {
    public static final /* synthetic */ int LJJIFFI = 0;
    public C16G0 LIZ;
    public Integer LIZJ;
    public Double LIZLLL;
    public Integer LJ;
    public Double LJFF;
    public boolean LJI;
    public Fragment LJII;
    public FragmentManager LJIIIIZZ;
    public BottomSheetBehavior<?> LJIIIZ;
    public InterfaceC1177950gl7 LJIIJ;
    public InterfaceC1175940ghs LJIIJJI;
    public Integer LJIIL;
    public boolean LJIILIIL;
    public RadiusLayout LJIILJJIL;
    public LinearLayout LJIILL;
    public ViewGroup LJIILLIIL;
    public C1177800gks LJIIZILJ;
    public C1066370dr9 LJIJ;
    public C1177850gkx LJIJI;
    public View LJIJJ;
    public View LJIJJLI;
    public boolean LJIL;
    public boolean LJJI;
    public boolean LIZIZ = true;
    public final C1177810gkt LJJ = new AbstractC1177930gl5() { // from class: X.0gkt
        @Override // X.AbstractC1177930gl5
        public final void LIZJ(View view, float f) {
            AbstractC1177930gl5 bottomSheetCallback;
            C1177850gkx c1177850gkx = this.LIZ.LJIJI;
            if (c1177850gkx != null && (bottomSheetCallback = c1177850gkx.getBottomSheetCallback()) != null) {
                bottomSheetCallback.LIZJ(view, f);
            }
            InterfaceC1175940ghs interfaceC1175940ghs = this.LIZ.LJIIJJI;
            if (interfaceC1175940ghs != null) {
                interfaceC1175940ghs.LJJJI(f);
            }
        }

        @Override // X.AbstractC1177930gl5
        public final void LIZLLL(int i, View view) {
            AbstractC1177930gl5 bottomSheetCallback;
            C1177850gkx c1177850gkx = this.LIZ.LJIJI;
            if (c1177850gkx != null && (bottomSheetCallback = c1177850gkx.getBottomSheetCallback()) != null) {
                bottomSheetCallback.LIZLLL(i, view);
            }
            if (i != 3) {
                if (i != 4) {
                    if (i == 6) {
                        InterfaceC1177950gl7 interfaceC1177950gl7 = this.LIZ.LJIIJ;
                        if (interfaceC1177950gl7 != null) {
                            interfaceC1177950gl7.LIZ(6, !r0.LJJI);
                        }
                        this.LIZ.LJJI = false;
                        return;
                    }
                    return;
                }
                InterfaceC1177950gl7 interfaceC1177950gl72 = this.LIZ.LJIIJ;
                if (interfaceC1177950gl72 != null) {
                    interfaceC1177950gl72.LIZ(4, !r0.LJJI);
                }
                this.LIZ.LJJI = false;
                return;
            }
            InterfaceC1177950gl7 interfaceC1177950gl73 = this.LIZ.LJIIJ;
            if (interfaceC1177950gl73 != null) {
                interfaceC1177950gl73.LIZ(3, !r0.LJJI);
            }
            this.LIZ.LJJI = false;
        }
    };

    public final void LIZ() {
        this.LJJI = true;
        C1177800gks c1177800gks = this.LJIIZILJ;
        if (c1177800gks != null && c1177800gks.LLJ) {
            c1177800gks.LLJI = true;
            c1177800gks.requestLayout();
        } else {
            BottomSheetBehavior<?> bottomSheetBehavior = this.LJIIIZ;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setState(4);
            }
        }
    }

    public final void LIZIZ() {
        this.LJJI = true;
        BottomSheetBehavior<?> bottomSheetBehavior = this.LJIIIZ;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setState(3);
        }
    }

    public final int LIZJ() {
        C1177800gks c1177800gks = this.LJIIZILJ;
        if (c1177800gks != null) {
            return c1177800gks.getRealPeekHeight() - C1174710gft.LIZ();
        }
        return 0;
    }

    public final void LIZLLL() {
        Fragment fragment;
        C16G1 c16g1;
        C16G0 c16g0 = this.LIZ;
        if (c16g0 == null) {
            throw new RuntimeException("ParentView is NULL or not CoordinatorLayout");
        }
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(c16g0.getContext()), R.layout.fr, c16g0, false);
        this.LJIJJ = viewTd;
        if (viewTd == null) {
            return;
        }
        this.LJIILJJIL = (RadiusLayout) viewTd.findViewById(R.id.spp);
        this.LJIILL = (LinearLayout) viewTd.findViewById(R.id.g88);
        ViewGroup viewGroup = (ViewGroup) viewTd.findViewById(R.id.v4_);
        this.LJIILLIIL = viewGroup;
        if (viewGroup != null) {
            viewGroup.setTag(this);
        }
        this.LJIIZILJ = (C1177800gks) viewTd.findViewById(R.id.g87);
        this.LJIJJLI = viewTd.findViewById(R.id.uy1);
        this.LJIJ = (C1066370dr9) viewTd.findViewById(R.id.v4f);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, c16g0.getContext());
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            RadiusLayout radiusLayout = this.LJIILJJIL;
            if (radiusLayout != null) {
                radiusLayout.setBackgroundColor(iIntValue);
            }
        }
        Integer num = this.LJIIL;
        if (num != null) {
            int iIntValue2 = num.intValue();
            LinearLayout linearLayout = this.LJIILL;
            if (linearLayout != null) {
                linearLayout.setBackgroundColor(iIntValue2);
            }
        }
        C1066370dr9 c1066370dr9 = this.LJIJ;
        if (c1066370dr9 != null) {
            C786410Ut5.LLLZIL(c1066370dr9, 0);
        }
        View view = this.LJIJJLI;
        if (view != null) {
            C786410Ut5.LJLLLLLL(this.LJIILIIL ? 0 : 8, view);
        }
        if (this.LJIILIIL) {
            RadiusLayout radiusLayout2 = this.LJIILJJIL;
            if (radiusLayout2 != null) {
                C1189060h32.LJJII(radiusLayout2, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), null, null);
            }
        } else {
            RadiusLayout radiusLayout3 = this.LJIILJJIL;
            if (radiusLayout3 != null) {
                C1189060h32.LJJII(radiusLayout3, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, null);
            }
        }
        BottomSheetBehavior<?> bottomSheetBehavior = this.LJIIIZ;
        if (bottomSheetBehavior == null) {
            bottomSheetBehavior = new BottomSheetBehavior<>();
        }
        this.LJIIIZ = bottomSheetBehavior;
        View view2 = this.LJIJJ;
        ViewGroup.LayoutParams layoutParams = view2 != null ? view2.getLayoutParams() : null;
        if ((layoutParams instanceof C16G1) && (c16g1 = (C16G1) layoutParams) != null) {
            c16g1.LIZIZ(this.LJIIIZ);
        }
        BottomSheetBehavior<?> bottomSheetBehavior2 = this.LJIIIZ;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.addBottomSheetCallback(this.LJJ);
        }
        BottomSheetBehavior<?> bottomSheetBehavior3 = this.LJIIIZ;
        if (bottomSheetBehavior3 != null) {
            bottomSheetBehavior3.setHideable(this.LJI);
        }
        C1177800gks c1177800gks = this.LJIIZILJ;
        if (c1177800gks != null) {
            c1177800gks.setBehavior(this.LJIIIZ);
        }
        C1177800gks c1177800gks2 = this.LJIIZILJ;
        if (c1177800gks2 != null) {
            c1177800gks2.setMaxHeightRatio(this.LIZLLL);
        }
        C1177800gks c1177800gks3 = this.LJIIZILJ;
        if (c1177800gks3 != null) {
            c1177800gks3.setMaxHeight(this.LIZJ);
        }
        C1177800gks c1177800gks4 = this.LJIIZILJ;
        if (c1177800gks4 != null) {
            c1177800gks4.setPeekHeightRatio(this.LJFF);
        }
        C1177800gks c1177800gks5 = this.LJIIZILJ;
        if (c1177800gks5 != null) {
            c1177800gks5.setPeekHeight(this.LJ);
        }
        C1177800gks c1177800gks6 = this.LJIIZILJ;
        if (c1177800gks6 != null) {
            c1177800gks6.setInitHeightRatio(null);
        }
        FragmentManager fragmentManager = this.LJIIIIZZ;
        if (fragmentManager != null && (fragment = this.LJII) != null) {
            C19EH c19ehLJIIJ = fragmentManager.LJIIJ();
            c19ehLJIIJ.LIZJ(R.id.v4_, fragment, "content_fragment_tag");
            c19ehLJIIJ.LJIIJ();
        }
        if (!this.LJIL) {
            RadiusLayout radiusLayout4 = this.LJIILJJIL;
            if (radiusLayout4 != null) {
                radiusLayout4.LIZ(C418440Gaw.LIZIZ(16), C418440Gaw.LIZIZ(16), 0.0f, 0.0f);
            }
            this.LJIL = true;
        }
        if (this.LIZIZ) {
            Context context = c16g0.getContext();
            C1177850gkx c1177850gkx = new C1177850gkx(context);
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zc, context);
            if (numLIZJ2 != null) {
                c1177850gkx.setBackgroundColor(numLIZJ2.intValue());
            }
            C16G1 c16g12 = new C16G1(-1, -1);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1177850gkx);
            c1177850gkx.setLayoutParams(c16g12);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1177850gkx);
            c1177850gkx.setAlpha(0.0f);
            c1177850gkx.setClickable(true);
            C786410Ut5.l1(c1177850gkx, 8);
            c1177850gkx.setHalfInitial(false);
            this.LJIJI = c1177850gkx;
            c16g0.addView(c1177850gkx);
        }
        viewTd.setElevation(C418440Gaw.LIZIZ(2));
        c16g0.addView(viewTd);
    }

    public final void LJ(BaseFragment baseFragment) {
        FragmentManager fragmentManager = this.LJIIIIZZ;
        if (fragmentManager == null) {
            return;
        }
        int iLJJLIIIIJ = fragmentManager.LJJLIIIIJ() + 1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("content_fragment_tag_");
        sbLIZ.append(iLJJLIIIIJ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C19EH c19ehLJIIJ = fragmentManager.LJIIJ();
        c19ehLJIIJ.LJIJ(R.id.v4_, baseFragment, strLIZIZ);
        c19ehLJIIJ.LJIIJ();
    }
}
