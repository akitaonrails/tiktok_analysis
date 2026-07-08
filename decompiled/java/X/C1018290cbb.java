package X;

import Y.AObjectS348S0100000_4;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0cbb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1018290cbb implements InterfaceC1019330cdH {
    public ViewGroup LIZ;
    public View LIZIZ;
    public final Activity LIZJ;
    public InterfaceC1023590ck9 LIZLLL;
    public int LJ = -1;

    @Override // X.InterfaceC1019330cdH
    public final void LIZ() {
        int i;
        this.LIZ = (ViewGroup) this.LIZJ.getWindow().getDecorView();
        if (this.LIZIZ != null) {
            return;
        }
        View view = new View(this.LIZJ);
        this.LIZIZ = view;
        C786410Ut5.I7(new C0IJO(), view);
        if (((Boolean) C282710B6f.LIZ.getValue()).booleanValue()) {
            final ISplashAdService iSplashAdService = (ISplashAdService) ServiceManager.get().getService(ISplashAdService.class);
            final WeakReference weakReference = new WeakReference(this.LIZIZ);
            C786410Ut5.y3(this.LIZIZ.getViewTreeObserver(), new ViewTreeObserverOnPreDrawListenerC1077330e8p(iSplashAdService, weakReference, 1));
            this.LIZIZ.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.0cRV
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view2) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view2) {
                    iSplashAdService.LJJIIJZLJL(C1018070cbF.LJJIJIL, System.currentTimeMillis());
                    InterfaceC1023590ck9 interfaceC1023590ck9 = this.LLILLL.LIZLLL;
                    if (interfaceC1023590ck9 != null) {
                        interfaceC1023590ck9.logAd(C1018060cbE.LJJJI, new AObjectS348S0100000_4(iSplashAdService, 1));
                    }
                    View view3 = (View) weakReference.get();
                    if (view3 != null) {
                        view3.removeOnAttachStateChangeListener(this);
                    }
                }
            });
        }
        if (C302760Btq.LIZ()) {
            i = -1;
        } else {
            ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LJIIIZ().isEnabled();
            i = 0;
        }
        this.LIZIZ.setBackground(((ISplashAdService) ServiceManager.get().getService(ISplashAdService.class)).LJII(this.LIZJ));
        if (this.LIZ instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            if (C2077408Bw.LIZIZ(this.LIZJ) && !C521230KcL.LIZ(this.LIZJ)) {
                layoutParams.topMargin = C1031100cwG.LIZ().LJJIIZ();
            }
            this.LIZ.addView(this.LIZIZ, i, layoutParams);
        } else {
            this.LIZ.addView(this.LIZIZ, i, new ViewGroup.LayoutParams(-1, -1));
        }
        this.LJ = C446980Hfs.LIZ(this.LIZJ, R.color.dr);
        C497270Jen.LIZLLL(-16777216, this.LIZJ);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("awesome_splash", "addSplashLoadMask");
    }

    @Override // X.InterfaceC1019330cdH
    public final void LIZIZ() {
        View view;
        ViewGroup viewGroup = this.LIZ;
        if (viewGroup != null && (view = this.LIZIZ) != null) {
            C786410Ut5.LJJJLZIJ(view, viewGroup);
            int i = this.LJ;
            if (i != -1) {
                C497270Jen.LIZLLL(i, this.LIZJ);
                this.LJ = -1;
            }
        }
        this.LIZ = null;
        this.LIZIZ = null;
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("awesome_splash", "removeSplashLoadMask");
    }

    public C1018290cbb(C19EG c19eg, InterfaceC1023590ck9 interfaceC1023590ck9) {
        this.LIZJ = c19eg;
        this.LIZLLL = interfaceC1023590ck9;
    }
}
