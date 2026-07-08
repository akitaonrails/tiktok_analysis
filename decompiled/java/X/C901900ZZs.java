package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZZs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C901900ZZs {
    public final View LIZ;
    public final C902070Za9 LIZIZ;
    public final SmartImageView LIZJ;
    public final View LIZLLL;
    public final TuxIconView LJ;
    public final TuxTextView LJFF;
    public final TuxIconView LJI;
    public final View LJII;
    public final TuxIconView LJIIIIZZ;
    public final TuxTextView LJIIIZ;
    public final View LJIIJ;
    public final C426320Gne LJIIJJI;
    public final TuxTextView LJIIL;
    public final View LJIILIIL;
    public final TuxSpinner LJIILJJIL;
    public final View LJIILL;
    public final TuxTextView LJIILLIIL;
    public final View LJIIZILJ;
    public final C197039127h LJIJ;
    public final View LJIJI;
    public final C01GW LJIJJ;
    public final C01GW LJIJJLI;
    public final C01GW LJIL;
    public View LJJ;
    public TuxTextView LJJI;
    public C197039127h LJJIFFI;

    public final Context LIZ() {
        return this.LIZ.getContext();
    }

    public final RemoteImageView LIZIZ() {
        return (RemoteImageView) this.LJIJJLI.getValue();
    }

    public final void LIZJ(int i) {
        C197039127h c197039127h;
        TuxTextView tuxTextView;
        if (this.LJJ == null) {
            ((ViewStub) this.LJIL.getValue()).setLayoutResource(i);
            this.LJJ = C786410Ut5.LJLLLL((ViewStub) this.LJIL.getValue());
        }
        C197039127h c197039127h2 = null;
        if (this.LJJI == null) {
            View view = this.LJJ;
            if (view != null) {
                tuxTextView = (TuxTextView) view.findViewById(R.id.tv_photo_swap_hint);
            } else {
                tuxTextView = null;
            }
            this.LJJI = tuxTextView;
        }
        if (this.LJJIFFI == null) {
            View view2 = this.LJJ;
            if (view2 != null && (c197039127h = (C197039127h) view2.findViewById(R.id.ltg)) != null) {
                c197039127h.setButtonSize(1);
                c197039127h.setButtonVariant(0);
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.zi);
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(5));
                c197039127h.setBackground(c384050F3z.LIZ(c197039127h.getContext()));
                c197039127h.setTextColorRes(R.attr.z_);
                c197039127h.setText(c197039127h.getContext().getString(2131831784));
                C427690Gpr.LJ(c197039127h, C418440Gaw.LIZIZ(5));
                c197039127h2 = c197039127h;
            }
            this.LJJIFFI = c197039127h2;
        }
    }

    public C901900ZZs(View view, InterfaceC902110ZaD interfaceC902110ZaD) {
        View viewFindViewById;
        C902070Za9 c902070Za9 = (C902070Za9) view.findViewById(R.id.xuu);
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.eun);
        View viewFindViewById2 = view.findViewById(R.id.pgg);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.pgi);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.pgh);
        TuxIconView tuxIconView2 = (TuxIconView) view.findViewById(R.id.pgj);
        View viewFindViewById3 = view.findViewById(R.id.xln);
        TuxIconView tuxIconView3 = (TuxIconView) viewFindViewById3.findViewById(R.id.xlo);
        TuxTextView tuxTextView2 = (TuxTextView) viewFindViewById3.findViewById(R.id.xll);
        if (Intrinsics.LJFF(interfaceC902110ZaD, C902010Za3.LIZ)) {
            viewFindViewById = view.findViewById(R.id.lr3);
        } else {
            viewFindViewById = null;
        }
        C426320Gne c426320Gne = (C426320Gne) view.findViewById(R.id.s91);
        TuxTextView tuxTextView3 = (TuxTextView) view.findViewById(R.id.s9j);
        View viewFindViewById4 = view.findViewById(R.id.xvv);
        TuxSpinner tuxSpinner = (TuxSpinner) view.findViewById(R.id.nnd);
        View viewFindViewById5 = view.findViewById(R.id.hb1);
        TuxTextView tuxTextView4 = (TuxTextView) view.findViewById(R.id.tv_safety_copy);
        View viewFindViewById6 = view.findViewById(R.id.j5n);
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.fa1);
        c197039127h.LJJJJL(AFwS248S0000000_14.get$arr$(432));
        C1378990lzN.LIZIZ(c197039127h, Float.valueOf(C418440Gaw.LIZIZ(10)), null, null, null, null, 30);
        C426750GoL.LJIIIZ(c197039127h, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), false, 16);
        View viewFindViewById7 = view.findViewById(R.id.video_card_bottom_gradient);
        this.LIZ = view;
        this.LIZIZ = c902070Za9;
        this.LIZJ = smartImageView;
        this.LIZLLL = viewFindViewById2;
        this.LJ = tuxIconView;
        this.LJFF = tuxTextView;
        this.LJI = tuxIconView2;
        this.LJII = viewFindViewById3;
        this.LJIIIIZZ = tuxIconView3;
        this.LJIIIZ = tuxTextView2;
        this.LJIIJ = viewFindViewById;
        this.LJIIJJI = c426320Gne;
        this.LJIIL = tuxTextView3;
        this.LJIILIIL = viewFindViewById4;
        this.LJIILJJIL = tuxSpinner;
        this.LJIILL = viewFindViewById5;
        this.LJIILLIIL = tuxTextView4;
        this.LJIIZILJ = viewFindViewById6;
        this.LJIJ = c197039127h;
        this.LJIJI = viewFindViewById7;
        this.LJIJJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1417));
        this.LJIJJLI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1416));
        this.LJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1418));
    }
}
