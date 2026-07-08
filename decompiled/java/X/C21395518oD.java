package X;

import Y.ACListenerS166S0100000_32;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.scene.Scene;
import com.zhiliaoapp.musically.R;
import java.io.File;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18oD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21395518oD extends AbstractC1542070qEP implements InterfaceC1538610q8p {
    public final ViewGroup LLILLJJLI;
    public View LLILLL;
    public LinearLayout LLILZ;
    public C197039127h LLILZIL;
    public C1390410mHn LLILZLL;
    public Context LLIZ;

    @Override // X.AbstractC1542070qEP, X.InterfaceC1163130gND
    public final void release() {
        this.LLIZ = null;
    }

    public final void LJJIJL() {
        ImageView imageView;
        if (this.LLILLL == null) {
            C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
            this.LLIZ = C1161970gLL.LIZIZ().LIZJ();
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(C1161970gLL.LIZIZ().LIZJ()), R.layout.a64, this.LLILLJJLI, false);
            this.LLILLL = viewTd;
            if (viewTd != null && (imageView = (ImageView) viewTd.findViewById(R.id.cyj)) != null) {
                C0HTI c0hti = new C0HTI();
                c0hti.LIZ = R.drawable.nj;
                imageView.setImageDrawable(c0hti.LIZ(imageView.getContext()));
            }
            View view = this.LLILLL;
            this.LLILZ = view != null ? (LinearLayout) view.findViewById(R.id.czk) : null;
            View view2 = this.LLILLL;
            this.LLILZIL = view2 != null ? (C197039127h) view2.findViewById(R.id.czj) : null;
            View view3 = this.LLILLL;
            this.LLILZLL = view3 != null ? (C1390410mHn) view3.findViewById(R.id.czl) : null;
            C1520080pew.LIZLLL("hybrid_log_report", C2097908Jt.LIZJ(new Pair(Scene.SCENE_SERVICE, "status_view_not_initialized_by_spark")));
        }
    }

    @Override // X.InterfaceC1163110gNB
    public final View LJJL() {
        LJJIJL();
        C1390410mHn c1390410mHn = this.LLILZLL;
        if (c1390410mHn != null) {
            C786410Ut5.LLLZZIL(c1390410mHn, 0);
        }
        C1390410mHn c1390410mHn2 = this.LLILZLL;
        if (c1390410mHn2 != null) {
            c1390410mHn2.LIZJ();
        }
        LinearLayout linearLayout = this.LLILZ;
        if (linearLayout != null) {
            C786410Ut5.LJZL(8, linearLayout);
        }
        View view = this.LLILLL;
        if (view == null) {
            return null;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.gravity = 17;
        C786410Ut5.W5(view, layoutParams);
        return view;
    }

    @Override // X.InterfaceC1538610q8p
    public final View LJJLIIIJILLIZJL() {
        return LJJL();
    }

    @Override // X.InterfaceC1538610q8p
    public final ViewGroup LJJLJ() {
        return this.LLILLJJLI;
    }

    public C21395518oD(ViewGroup viewGroup) {
        this.LLILLJJLI = viewGroup;
    }

    @Override // X.InterfaceC1163110gNB
    public final void LJIIJ(Context context) {
        LinearLayout linearLayout;
        C197039127h c197039127h;
        ImageView imageView;
        this.LLIZ = context;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.a64, this.LLILLJJLI, false);
        this.LLILLL = viewTd;
        if (viewTd != null && (imageView = (ImageView) viewTd.findViewById(R.id.cyj)) != null) {
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.nj;
            imageView.setImageDrawable(c0hti.LIZ(imageView.getContext()));
        }
        View view = this.LLILLL;
        C1390410mHn c1390410mHn = null;
        if (view != null) {
            linearLayout = (LinearLayout) view.findViewById(R.id.czk);
        } else {
            linearLayout = null;
        }
        this.LLILZ = linearLayout;
        View view2 = this.LLILLL;
        if (view2 != null) {
            c197039127h = (C197039127h) view2.findViewById(R.id.czj);
        } else {
            c197039127h = null;
        }
        this.LLILZIL = c197039127h;
        View view3 = this.LLILLL;
        if (view3 != null) {
            c1390410mHn = (C1390410mHn) view3.findViewById(R.id.czl);
        }
        this.LLILZLL = c1390410mHn;
    }

    @Override // X.InterfaceC1538610q8p
    public final View LJJJJLI(final C1537720q7O c1537720q7O) {
        return LJJJLIIL(new InterfaceC1051240dSk() { // from class: X.18oE
            @Override // X.InterfaceC1051240dSk
            public final void refresh() {
                c1537720q7O.reload();
            }
        });
    }

    @Override // X.InterfaceC1163110gNB
    public final View LJJJLIIL(InterfaceC1051240dSk interfaceC1051240dSk) {
        LJJIJL();
        LinearLayout linearLayout = this.LLILZ;
        if (linearLayout != null) {
            C786410Ut5.LJZL(0, linearLayout);
        }
        C197039127h c197039127h = this.LLILZIL;
        if (c197039127h != null) {
            c197039127h.setEnabled(true);
        }
        C197039127h c197039127h2 = this.LLILZIL;
        if (c197039127h2 != null) {
            C786410Ut5.U8(c197039127h2, new ACListenerS166S0100000_32(interfaceC1051240dSk, 134));
        }
        C1390410mHn c1390410mHn = this.LLILZLL;
        if (c1390410mHn != null) {
            c1390410mHn.LIZLLL();
        }
        C1390410mHn c1390410mHn2 = this.LLILZLL;
        if (c1390410mHn2 != null) {
            C786410Ut5.LLLZZIL(c1390410mHn2, 8);
        }
        return this.LLILLL;
    }

    @Override // X.InterfaceC1538610q8p
    public final void LJJIIJ(Context context, C1537480q70 c1537480q70) {
        LJIIJ(context);
    }

    @Override // X.AbstractC1542070qEP
    public final View LJIJ(File file, Boolean bool, Float f, Float f2, Long l) {
        Context context = this.LLIZ;
        if (context != null) {
            if (C1545540qK0.LIZIZ(context)) {
                C21405218pm c21405218pm = new C21405218pm(context);
                C786410Ut5.Vb(c21405218pm, -1.0f);
                c21405218pm.setHasAnimation(Intrinsics.LJFF(bool, Boolean.TRUE));
                c21405218pm.setFromAlpha(f);
                c21405218pm.setToAlpha(f2);
                c21405218pm.setDuration(l);
                c21405218pm.LIZ(file);
                C786410Ut5.LLJILJILJ(c21405218pm, 0);
                return c21405218pm;
            }
            C21405218pm c21405218pm2 = new C21405218pm(context);
            C786410Ut5.Vb(c21405218pm2, 1.0f);
            c21405218pm2.setHasAnimation(Intrinsics.LJFF(bool, Boolean.TRUE));
            c21405218pm2.setFromAlpha(f);
            c21405218pm2.setToAlpha(f2);
            c21405218pm2.setDuration(l);
            c21405218pm2.LIZ(file);
            C786410Ut5.LLJILJILJ(c21405218pm2, 0);
            return c21405218pm2;
        }
        return null;
    }
}
