package X;

import Y.ARunnableS124S0100000_24;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0r17, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1572270r17 {
    public final C19EG LIZ;
    public final View LIZIZ;
    public final RelativeLayout LIZJ;
    public final View LIZLLL;
    public final View LJ;
    public final View LJFF;
    public final LinearLayout LJI;
    public Runnable LJII;
    public final TuxTextView LJIIIIZZ;
    public final View LJIIIZ;
    public boolean LJIIJ;

    public C1572270r17(C19EG c19eg) {
        View viewLJLLLL;
        RelativeLayout relativeLayout;
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        LinearLayout linearLayout;
        TuxTextView tuxTextView;
        View viewFindViewById4;
        int iLIZJ;
        ViewGroup.LayoutParams layoutParams;
        RelativeLayout.LayoutParams layoutParams2;
        RelativeLayout.LayoutParams layoutParams3;
        ViewGroup.LayoutParams layoutParams4;
        Context context;
        this.LIZ = c19eg;
        ViewStub viewStub = (ViewStub) c19eg.findViewById(R.id.kke);
        if (viewStub != null) {
            viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
        } else {
            viewLJLLLL = null;
        }
        this.LIZIZ = viewLJLLLL;
        if (viewLJLLLL != null) {
            relativeLayout = (RelativeLayout) viewLJLLLL.findViewById(R.id.ien);
        } else {
            relativeLayout = null;
        }
        this.LIZJ = relativeLayout;
        if (relativeLayout != null) {
            relativeLayout.setClickable(true);
        }
        if (viewLJLLLL != null) {
            viewFindViewById = viewLJLLLL.findViewById(R.id.je3);
        } else {
            viewFindViewById = null;
        }
        this.LIZLLL = viewFindViewById;
        if (viewLJLLLL != null) {
            viewFindViewById2 = viewLJLLLL.findViewById(R.id.jbm);
        } else {
            viewFindViewById2 = null;
        }
        this.LJ = viewFindViewById2;
        if (viewLJLLLL != null) {
            viewFindViewById3 = viewLJLLLL.findViewById(R.id.jc1);
        } else {
            viewFindViewById3 = null;
        }
        this.LJFF = viewFindViewById3;
        if (viewLJLLLL != null) {
            linearLayout = (LinearLayout) viewLJLLLL.findViewById(R.id.jcd);
        } else {
            linearLayout = null;
        }
        this.LJI = linearLayout;
        if (viewLJLLLL != null) {
            tuxTextView = (TuxTextView) viewLJLLLL.findViewById(R.id.jdm);
        } else {
            tuxTextView = null;
        }
        this.LJIIIIZZ = tuxTextView;
        if (viewLJLLLL != null) {
            viewFindViewById4 = viewLJLLLL.findViewById(R.id.b3y);
        } else {
            viewFindViewById4 = null;
        }
        this.LJIIIZ = viewFindViewById4;
        if (viewFindViewById != null && (context = viewFindViewById.getContext()) != null) {
            iLIZJ = C497820Jfg.LIZJ(context);
        } else {
            iLIZJ = 0;
        }
        if (viewFindViewById != null && (layoutParams4 = viewFindViewById.getLayoutParams()) != null) {
            layoutParams4.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(54)) + iLIZJ;
        }
        if (viewFindViewById2 != null) {
            layoutParams = viewFindViewById2.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        } else {
            layoutParams2 = null;
        }
        if (layoutParams2 != null) {
            layoutParams2.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(180.0d))) + iLIZJ;
        }
        ViewGroup.LayoutParams layoutParams5 = linearLayout != null ? linearLayout.getLayoutParams() : null;
        if ((layoutParams5 instanceof RelativeLayout.LayoutParams) && (layoutParams3 = (RelativeLayout.LayoutParams) layoutParams5) != null) {
            layoutParams3.height = (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(180.0d))) + iLIZJ) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(54)) + iLIZJ);
        }
    }

    public final void LIZ(Runnable runnable) {
        this.LJII = runnable;
        C0J9A c0j9aV3 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).v3();
        String strLJII = c0j9aV3.LJII("following_hand.webp");
        View view = this.LJIIIZ;
        if (view != null) {
            c0j9aV3.LJFF(view, strLJII);
        }
        this.LJIIJ = true;
    }

    public final void LIZIZ(long j) {
        View view = this.LJIIIZ;
        if (view != null) {
            HandlerHook.viewPostDelay(view, new ARunnableS124S0100000_24(this, 159), j);
        }
    }
}
