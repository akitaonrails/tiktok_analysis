package X;

import Y.ACListenerS154S0100000_19;
import Y.ATListenerS452S0100000_19;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.homepage.ui.slide.SlideGuideController;
import com.ss.android.ugc.aweme.homepage.ui.slide.SlideGuideViewModel;
import com.ss.android.ugc.aweme.main.assems.mainfragment.MFSocialAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0rki, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class RunnableC1600540rki implements Runnable {
    public final /* synthetic */ MFSocialAssem LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ Fragment LLILLL;

    public RunnableC1600540rki(MFSocialAssem mFSocialAssem, View view, Fragment fragment) {
        this.LL = mFSocialAssem;
        this.LLILLJJLI = view;
        this.LLILLL = fragment;
    }

    public final void LIZ() {
        boolean z;
        if (this.LL.LLJJ != null) {
            return;
        }
        if (!C1569860qxE.LIZIZ()) {
            synchronized (C1580330rE7.LIZ) {
                z = C1580330rE7.LIZIZ;
            }
            if (!z) {
                return;
            }
        }
        LinearLayout linearLayout = (LinearLayout) this.LLILLJJLI.findViewById(R.id.vji);
        MFSocialAssem mFSocialAssem = this.LL;
        Fragment fragment = this.LLILLL;
        final SlideGuideController slideGuideController = new SlideGuideController(fragment, linearLayout);
        TuxTextView tuxTextView = (TuxTextView) linearLayout.findViewById(R.id.jdv);
        C786410Ut5.h9(tuxTextView, new View.OnClickListener() { // from class: X.0qxD
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SlideGuideController slideGuideController2 = slideGuideController;
                if (slideGuideController2.LLJIJIL) {
                    slideGuideController2.LIZ(true);
                    return;
                }
                SlideGuideViewModel slideGuideViewModel = slideGuideController2.LLIZLLLIL;
                if (slideGuideViewModel == null) {
                    return;
                }
                slideGuideViewModel.LLJ = true;
                slideGuideViewModel.setVisible(false);
            }
        });
        slideGuideController.LLILLL = tuxTextView;
        TuxTextView tuxTextView2 = (TuxTextView) linearLayout.findViewById(R.id.thv);
        View view = null;
        if (tuxTextView2 != null) {
            C786410Ut5.h9(tuxTextView2, new ACListenerS154S0100000_19(slideGuideController, 312));
        } else {
            tuxTextView2 = null;
        }
        slideGuideController.LLILZ = tuxTextView2;
        slideGuideController.LLILZIL = linearLayout.findViewById(R.id.thx);
        C786410Ut5.R7(linearLayout, new ACListenerS154S0100000_19(slideGuideController, 313));
        linearLayout.setOnTouchListener(new ATListenerS452S0100000_19(slideGuideController, 16));
        C1295960jpS c1295960jpS = (C1295960jpS) linearLayout.findViewById(R.id.thw);
        if (c1295960jpS != null) {
            c1295960jpS.setAnimation(R.raw.tux_lottie_tux_gestures_only_tt_swipe_right);
            c1295960jpS.setRepeatMode(1);
            c1295960jpS.setRepeatCount(-1);
        } else {
            c1295960jpS = null;
        }
        slideGuideController.LLILZLL = c1295960jpS;
        View viewFindViewById = linearLayout.findViewById(R.id.w12);
        if (viewFindViewById != null) {
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = C497820Jfg.LIZJ(linearLayout.getContext());
            C786410Ut5.W5(viewFindViewById, layoutParams);
        }
        View viewFindViewById2 = linearLayout.findViewById(R.id.j4i);
        if (viewFindViewById2 != null) {
            C12P5 c12p5 = new C12P5();
            c12p5.LIZJ = Integer.valueOf(C960203pA.LIZ(R.attr.e1, viewFindViewById2.getContext()));
            c12p5.LJ = Float.valueOf(0.43f);
            c12p5.LJFF = Float.valueOf(0.0f);
            c12p5.LJI = C12KQ.VERTICAL;
            c12p5.LJII = EnumC197015126j.LINEAR;
            viewFindViewById2.setBackground(c12p5.LIZ(viewFindViewById2.getContext()));
            view = viewFindViewById2;
        }
        slideGuideController.LLIZ = view;
        slideGuideController.LJFF();
        slideGuideController.LIZIZ();
        linearLayout.addOnAttachStateChangeListener(slideGuideController.LLJJIII);
        C1580330rE7.LJFF.add(slideGuideController.LLJILJILJ);
        fragment.getLifecycle().addObserver(slideGuideController.LLJJIJI);
        mFSocialAssem.LLJJ = slideGuideController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("MFSocialAssem@caeb.setupGuideController$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MFSocialAssem@caeb.setupGuideController$1");
    }
}
