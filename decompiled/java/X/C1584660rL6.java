package X;

import Y.AUListenerS272S0100000_24;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.a;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.hox.Hox;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService;
import com.ss.android.ugc.aweme.main.MainFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0rL6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1584660rL6 implements InterfaceC1570900qyu, InterfaceC1602790roL {
    public C19EG LL;
    public InterfaceC1617760sCU LLILLJJLI;
    public final String LLILLL = EnumC1584350rKb.INBOX.getTag();
    public int LLILZ = 8388611;
    public View.OnClickListener LLILZIL;
    public View LLILZLL;

    @Override // X.InterfaceC1570900qyu
    public final void LIZ() {
    }

    @Override // X.InterfaceC1602790roL
    public final boolean LJIIIIZZ() {
        return false;
    }

    @Override // X.InterfaceC1570900qyu
    public final void S1(boolean z) {
    }

    @Override // X.InterfaceC1570900qyu
    public final void T1() {
    }

    @Override // X.InterfaceC1570900qyu
    public final void X1(int i) {
    }

    @Override // X.InterfaceC1570900qyu
    public final void Z1() {
    }

    @Override // X.InterfaceC1570900qyu
    public final void a2() {
    }

    @Override // X.InterfaceC1570900qyu
    public final boolean c2() {
        return false;
    }

    @Override // X.InterfaceC1570900qyu
    public final void d2(Integer num) {
    }

    @Override // X.InterfaceC1570900qyu
    public final void e2() {
    }

    @Override // X.InterfaceC1570900qyu
    public final boolean enabled() {
        return true;
    }

    @Override // X.InterfaceC1570900qyu
    public final void g2() {
    }

    @Override // X.InterfaceC1570900qyu
    public final void onCreate() {
    }

    @Override // X.InterfaceC1570900qyu
    public final void onDestroyView() {
    }

    @Override // X.InterfaceC1570900qyu
    public final void onPause() {
    }

    @Override // X.InterfaceC1570900qyu
    public final void onResume() {
    }

    @Override // X.InterfaceC1602790roL
    public final void LIZIZ() {
        U1(this.LLILZLL);
    }

    @Override // X.InterfaceC1602790roL
    public final void LIZJ() {
        C19212010Ec.LIZJ.LJJJLZIJ();
    }

    @Override // X.InterfaceC1602790roL
    public final void LIZLLL() {
        C19212010Ec.LIZJ.LJJLI();
    }

    @Override // X.InterfaceC1602790roL
    public final C1602830roP LJ() {
        int iLIZIZ;
        int iLIZIZ2;
        Resources resources;
        if (this.LLILZ == 5) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        }
        View view = this.LLILZLL;
        C19EG c19eg = this.LL;
        return new C1602830roP(view, (c19eg == null || (resources = c19eg.getResources()) == null) ? null : resources.getString(2131849395), this.LLILZ, iLIZIZ, iLIZIZ2);
    }

    @Override // X.InterfaceC1570900qyu
    public final boolean b2() {
        C0CXE.LIZ.getClass();
        return C0CXE.LIZ() && C305150Bxh.LIZ();
    }

    @Override // X.InterfaceC1570900qyu
    public final String getTag() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1602790roL
    public final ImageView LJI(Context context) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ.LJ = Integer.valueOf(R.attr.ej);
        c419910GdJ.LJFF = true;
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        C10VO.LIZJ(tuxIconView, 0.75f);
        tuxIconView.setTuxIcon(c419910GdJ);
        tuxIconView.setClickable(true);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)));
        layoutParams.gravity = 17;
        C786410Ut5.M6(tuxIconView, layoutParams);
        return tuxIconView;
    }

    @Override // X.InterfaceC1602790roL
    public final Animator LJII(TuxIconView tuxIconView) {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(a.LIZIZ(R.attr.e1, contextLIZ), a.LIZIZ(R.attr.ee, contextLIZ));
        valueAnimatorOfArgb.setInterpolator(new LinearInterpolator());
        valueAnimatorOfArgb.setDuration(100L);
        valueAnimatorOfArgb.addUpdateListener(new AUListenerS272S0100000_24(tuxIconView, 20));
        return valueAnimatorOfArgb;
    }

    @Override // X.InterfaceC1570900qyu
    public final void U1(View view) {
        Bundle extras;
        if (C0OBG.LIZ(400L, view)) {
            return;
        }
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("InboxTopIconGenerator", "onIconClick");
        View.OnClickListener onClickListener = this.LLILZIL;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        C19EG c19eg = this.LL;
        if (c19eg != null) {
            Intent intent = c19eg.getIntent();
            if (intent != null) {
                try {
                    extras = intent.getExtras();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (extras == null) {
                    extras = new Bundle();
                }
            } else {
                extras = new Bundle();
            }
            C786410Ut5.LJJJI("fromStart", "RootNode", extras);
            extras.putBoolean("isSmoothScroll", true);
            C786410Ut5.LJJJI("enter_from", "click_top_icon", extras);
            Hox.LLJILJIL.LIZ(c19eg).TQ2(extras, "NOTIFICATION", false);
        }
    }

    @Override // X.InterfaceC1570900qyu
    public final void V1(InterfaceC1617760sCU interfaceC1617760sCU) {
        this.LL = interfaceC1617760sCU.getActivity();
        this.LLILLJJLI = interfaceC1617760sCU;
    }

    @Override // X.InterfaceC1570900qyu
    public final View f2(Context context) {
        Activity activityLIZ = C06MM.LIZ(this.LL);
        if (activityLIZ != null) {
            this.LLILZIL = C19212010Ec.LIZJ.LJLIIL(activityLIZ);
        }
        HomePageUIFrameService homePageUIFrameService = (HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class);
        InterfaceC1617760sCU interfaceC1617760sCU = this.LLILLJJLI;
        if (interfaceC1617760sCU == null) {
            interfaceC1617760sCU = null;
        }
        View viewBuildInboxIcon = homePageUIFrameService.buildInboxIcon(interfaceC1617760sCU.getActivity());
        this.LLILZLL = viewBuildInboxIcon;
        return viewBuildInboxIcon;
    }

    @Override // X.InterfaceC1570900qyu
    public final void W1(MainFragment mainFragment, InterfaceC1617760sCU interfaceC1617760sCU) {
        this.LLILLJJLI = interfaceC1617760sCU;
    }

    @Override // X.InterfaceC1570900qyu
    public final void Y1(InterfaceC1571160qzK interfaceC1571160qzK, int i) {
        if (interfaceC1571160qzK != null) {
            interfaceC1571160qzK.LIZLLL("NOTIFICATION", this);
        }
        if (i != 8388611) {
            if (i == 8388613) {
                this.LLILZ = 5;
                return;
            }
            return;
        }
        this.LLILZ = 3;
    }
}
