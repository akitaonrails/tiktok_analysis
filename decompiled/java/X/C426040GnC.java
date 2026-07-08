package X;

import Y.ACListenerS141S0100000_6;
import Y.ARunnableS15S0400000_6;
import Y.ARunnableS39S0300000_6;
import Y.ARunnableS75S0200000_6;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.viewmodel.ShareInviteContentVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: renamed from: X.0GnC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C426040GnC implements InterfaceC1371380ln6 {
    public final ShareInviteContentVM LIZ;
    public C1369580lkC LIZIZ;
    public SmartAvatarImageView LIZJ;
    public TuxIconView LIZLLL;
    public TuxIconView LJ;
    public TuxIconView LJFF;

    @Override // X.InterfaceC1371380ln6
    public final C1369580lkC LIZJ() {
        C1369580lkC c1369580lkC = this.LIZIZ;
        if (c1369580lkC == null) {
            return null;
        }
        return c1369580lkC;
    }

    public C426040GnC(ShareInviteContentVM shareInviteContentVM) {
        this.LIZ = shareInviteContentVM;
    }

    public static void LIZ(TuxIconView tuxIconView) {
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(14));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.bx);
        tuxIconView.setBackground(c384050F3z.LIZ(tuxIconView.getContext()));
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_tick_fill;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a04);
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        tuxIconView.setTuxIcon(c419910GdJ);
    }

    public static void LIZLLL(TuxIconView tuxIconView) {
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(14));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a04);
        tuxIconView.setBackground(c384050F3z.LIZ(tuxIconView.getContext()));
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_plus_small;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LJ = Integer.valueOf(R.attr.bx);
        tuxIconView.setTuxIcon(c419910GdJ);
    }

    public final void LJ(TuxIconView tuxIconView) {
        Interpolator interpolatorLIZ = C1619980sG4.LIZ();
        new ARunnableS39S0300000_6(tuxIconView, interpolatorLIZ, new ARunnableS39S0300000_6(tuxIconView, interpolatorLIZ, new ARunnableS15S0400000_6(new ARunnableS75S0200000_6(tuxIconView, interpolatorLIZ, 101), tuxIconView, interpolatorLIZ, this, 4), 15), 14).run();
    }

    @Override // X.InterfaceC1371380ln6
    public final void onViewCreated(View view) {
        User curUser;
        UrlModel avatarThumb;
        this.LIZIZ = (C1369580lkC) view.findViewById(R.id.uyu);
        this.LIZJ = (SmartAvatarImageView) view.findViewById(R.id.p07);
        this.LIZLLL = (TuxIconView) view.findViewById(R.id.p08);
        this.LJ = (TuxIconView) view.findViewById(R.id.pv4);
        this.LJFF = (TuxIconView) view.findViewById(R.id.oc1);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.ccd);
        TuxIconView tuxIconView = this.LIZLLL;
        TuxIconView tuxIconView2 = null;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        LIZLLL(tuxIconView);
        TuxIconView tuxIconView3 = this.LJ;
        if (tuxIconView3 == null) {
            tuxIconView3 = null;
        }
        LIZLLL(tuxIconView3);
        SmartAvatarImageView smartAvatarImageView = this.LIZJ;
        if (smartAvatarImageView == null) {
            smartAvatarImageView = null;
        }
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF != null && (curUser = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUser()) != null && (avatarThumb = curUser.getAvatarThumb()) != null) {
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(avatarThumb));
            c1331670kl3LJIIIIZZ.LJJ(smartAvatarImageView);
            c1331670kl3LJIIIIZZ.LIZLLL("ShareInviteSheet");
            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        c384050F3z.LJFF = Integer.valueOf(R.attr.ng);
        linearLayout.setBackground(c384050F3z.LIZ(linearLayout.getContext()));
        C786410Ut5.R7(linearLayout, new ACListenerS141S0100000_6(this, 123));
        C1234470iEH.LIZ.getClass();
        if (C1234470iEH.LIZLLL) {
            C1234470iEH.LIZLLL = false;
            AwS585S0100000_6 awS585S0100000_6 = new AwS585S0100000_6(this, 317);
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null) {
                ViewTreeObserverOnGlobalLayoutListenerC462880IDe viewTreeObserverOnGlobalLayoutListenerC462880IDe = new ViewTreeObserverOnGlobalLayoutListenerC462880IDe(view, awS585S0100000_6, 10);
                viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC462880IDe);
                C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC462880IDe, ViewTreeObserver.OnGlobalLayoutListener.class);
                return;
            }
            return;
        }
        TuxIconView tuxIconView4 = this.LIZLLL;
        if (tuxIconView4 == null) {
            tuxIconView4 = null;
        }
        LIZ(tuxIconView4);
        TuxIconView tuxIconView5 = this.LJ;
        if (tuxIconView5 == null) {
            tuxIconView5 = null;
        }
        LIZ(tuxIconView5);
        TuxIconView tuxIconView6 = this.LJFF;
        if (tuxIconView6 != null) {
            tuxIconView2 = tuxIconView6;
        }
        C786410Ut5.x5(tuxIconView2, 1.0f);
    }

    @Override // X.InterfaceC1371380ln6
    public final View LIZIZ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C786410Ut5.Td(layoutInflater, R.layout.ca2, viewGroup, false);
    }
}
