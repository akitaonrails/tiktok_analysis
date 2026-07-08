package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.tablet.impl.business.login.QRCodeLoginFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: renamed from: X.10GZ, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10GZ implements InterfaceC19303410fY {
    public static final C10GZ LIZ = new C10GZ();
    public static final int LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(358));
    public static final int LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL)));
    public static final int LIZLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(280));
    public static final int LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
    public static final int LJFF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
    public static final int LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
    public static final int LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(76));
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(254));

    @Override // X.InterfaceC19303410fY
    public final String LIZ() {
        return C19252910Tv.LIZIZ.LIZLLL().LJIJ().LIZIZ() ? "login_show_qr" : "login";
    }

    @Override // X.InterfaceC19303410fY
    public final boolean LIZIZ() {
        EnumC1915930zxP enumC1915930zxPLJIIL;
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        C20593115i5.LIZ.getClass();
        if (C20593115i5.LJIIIIZZ(contextLIZ) || C0VFU.LIZ(contextLIZ) || (((enumC1915930zxPLJIIL = ComplianceServiceProvider.LJIILJJIL().LJIIL()) == EnumC1915930zxP.EU && C051F.LIZ().length() == 0) || (enumC1915930zxPLJIIL == EnumC1915930zxP.US && C051F.LIZLLL().length() == 0))) {
            return false;
        }
        if ((enumC1915930zxPLJIIL != EnumC1915930zxP.ROW || C051F.LIZJ().length() != 0) && (!C051F.LJ().isEmpty()) && C051F.LIZIZ().length() > 0) {
            C1389350mG5 c1389350mG5LIZJ = C1389340mG4.LIZJ(null, null);
            if (c1389350mG5LIZJ.LIZ() >= 650 && c1389350mG5LIZJ.LIZIZ() >= 600) {
                C01GW c01gw = LJIIIIZZ;
                return ((Number) c01gw.getValue()).intValue() == 1 || ((Number) c01gw.getValue()).intValue() == 2;
            }
        }
        return false;
    }

    @Override // X.InterfaceC19303410fY
    public final void LIZLLL(TuxTextView tuxTextView, boolean z) {
        int marginStart;
        int marginEnd;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (!z && LIZIZ()) {
            ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
            int i = 0;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
            } else {
                marginStart = 0;
            }
            Integer numValueOf = Integer.valueOf(marginStart);
            ViewGroup.LayoutParams layoutParams2 = tuxTextView.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
            } else {
                marginEnd = 0;
            }
            Integer numValueOf2 = Integer.valueOf(marginEnd);
            ViewGroup.LayoutParams layoutParams3 = tuxTextView.getLayoutParams();
            if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                i = marginLayoutParams.bottomMargin;
            }
            C426750GoL.LJIIIZ(tuxTextView, numValueOf, 0, numValueOf2, Integer.valueOf(i), false, 16);
        }
    }

    @Override // X.InterfaceC19303410fY
    public final void LIZJ(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TuxTextView tuxTextView, FragmentManager fragmentManager, C19EG c19eg, boolean z, Bundle bundle) {
        boolean z2;
        int i;
        int i2;
        int iLIZIZ;
        int i3;
        C19ME c19me;
        C19ME c19me2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i4;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        int i5;
        ViewGroup.MarginLayoutParams marginLayoutParams5;
        if (z) {
            return;
        }
        ConstraintLayout constraintLayout3 = (ConstraintLayout) constraintLayout.findViewById(R.id.h45);
        if (LIZIZ()) {
            QRCodeLoginFragment qRCodeLoginFragment = new QRCodeLoginFragment();
            ConstraintLayout constraintLayout4 = (ConstraintLayout) constraintLayout.findViewById(R.id.sjl);
            constraintLayout4.setId(View.generateViewId());
            View viewFindViewById = constraintLayout.findViewById(R.id.sjk);
            LinearLayout linearLayout = (LinearLayout) constraintLayout.findViewById(R.id.pqn);
            TuxIconView tuxIconView = (TuxIconView) constraintLayout.findViewById(R.id.xvp);
            int iLIZIZ2 = C1389340mG4.LIZJ(c19eg, null).LIZIZ();
            int iLIZ = C1389340mG4.LIZJ(c19eg, null).LIZ();
            if (iLIZIZ2 > 850 && iLIZ > 600) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                i = LIZIZ;
                i2 = LJ;
            } else if (iLIZIZ2 >= 710) {
                i = LIZJ;
                i2 = LJFF;
            } else {
                i = LIZLLL;
                i2 = LJI;
            }
            if (iLIZ < 850) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
            } else {
                iLIZIZ = LJII;
            }
            ViewGroup.LayoutParams layoutParams = constraintLayout2.getLayoutParams();
            if ((layoutParams instanceof C19ME) && (marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams4.width = i;
                C786410Ut5.m6(constraintLayout2, marginLayoutParams4);
                Integer numValueOf = Integer.valueOf(i2);
                Integer numValueOf2 = Integer.valueOf(iLIZIZ);
                ViewGroup.LayoutParams layoutParams2 = constraintLayout2.getLayoutParams();
                if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                    i5 = marginLayoutParams5.bottomMargin;
                } else {
                    i5 = 0;
                }
                C426750GoL.LJIIIZ(constraintLayout2, numValueOf, numValueOf2, 0, Integer.valueOf(i5), false, 16);
            }
            ViewGroup.LayoutParams layoutParams3 = constraintLayout3.getLayoutParams();
            if ((layoutParams3 instanceof C19ME) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                marginLayoutParams3.width = i;
                C786410Ut5.m6(constraintLayout3, marginLayoutParams3);
            }
            ViewGroup.LayoutParams layoutParams4 = constraintLayout4.getLayoutParams();
            if ((layoutParams4 instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                marginLayoutParams.width = i;
                C786410Ut5.m6(constraintLayout4, marginLayoutParams);
                Integer numValueOf3 = Integer.valueOf(iLIZIZ);
                ViewGroup.LayoutParams layoutParams5 = constraintLayout4.getLayoutParams();
                if ((layoutParams5 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams5) != null) {
                    i4 = marginLayoutParams2.bottomMargin;
                } else {
                    i4 = 0;
                }
                C426750GoL.LJIIIZ(constraintLayout4, 0, numValueOf3, 0, Integer.valueOf(i4), false, 16);
            }
            ViewGroup.LayoutParams layoutParams6 = tuxTextView.getLayoutParams();
            if ((layoutParams6 instanceof C19ME) && (c19me2 = (C19ME) layoutParams6) != null) {
                c19me2.topToBottom = constraintLayout4.getId();
            }
            ViewGroup.LayoutParams layoutParams7 = linearLayout.getLayoutParams();
            if ((layoutParams7 instanceof C19ME) && (c19me = (C19ME) layoutParams7) != null) {
                c19me.topToTop = constraintLayout4.getId();
                c19me.bottomToBottom = constraintLayout4.getId();
            }
            viewFindViewById.setId(View.generateViewId());
            qRCodeLoginFragment.setArguments(bundle);
            C19EH c19ehLJIIJ = fragmentManager.LJIIJ();
            c19ehLJIIJ.LJIJ(viewFindViewById.getId(), qRCodeLoginFragment, null);
            c19ehLJIIJ.LJIIIZ();
            C786410Ut5.LL(0, constraintLayout4);
            if (iLIZIZ2 >= 710) {
                C786410Ut5.LJZL(0, linearLayout);
            }
            if (tuxIconView != null) {
                if (C960203pA.LIZIZ(constraintLayout.getContext())) {
                    i3 = R.raw.icon_color_tiktok_logo_light;
                } else {
                    i3 = R.raw.icon_color_tiktok_logo_dark;
                }
                tuxIconView.setIconRes(i3);
            }
            C786410Ut5.LLLLLLZZ(tuxIconView, 0);
        }
    }
}
