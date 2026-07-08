package X;

import Y.AObjectS395S0100000_21;
import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0lwB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class ViewOnClickListenerC1377010lwB extends C214906198m implements InterfaceC1238780iLE, InterfaceC1380420m1g, View.OnClickListener {
    public int LL;
    public C1380390m1d LLILLJJLI;
    public boolean LLILLL;
    public final RunnableC1377030lwD LLILZ;
    public long LLILZIL;
    public final View LLILZLL;
    public Activity LLIZ;
    public RelativeLayout LLIZLLLIL;
    public RemoteImageView LLJ;
    public Aweme LLJI;

    @Override // X.InterfaceC1380420m1g
    public final void LIZ() {
    }

    @Override // X.InterfaceC1380420m1g
    public final void LIZIZ() {
        this.LLILLL = false;
        onDismiss();
    }

    @Override // X.InterfaceC1238780iLE
    public final void show() {
        Activity activity = this.LLIZ;
        PopupManager.LJIJI(new C1383390m6T(activity instanceof C19EG ? (C19EG) activity : null, 0, new AObjectS395S0100000_21(this, 8)), true);
    }

    @Override // X.InterfaceC1238780iLE
    public final void onDismiss() {
        if (!isShowing() || this.LLILLL) {
            return;
        }
        try {
            Activity activity = this.LLIZ;
            if (activity != null && !activity.isFinishing()) {
                C1380390m1d c1380390m1d = this.LLILLJJLI;
                if (c1380390m1d != null) {
                    c1380390m1d.LIZ(0.0f, true);
                }
                dismiss();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LLIZ = null;
        PopupManager.LIZJ(C1383390m6T.class);
    }

    public ViewOnClickListenerC1377010lwB(Activity activity) {
        super(activity);
        this.LL = 4000;
        this.LLIZ = activity;
        View viewSd = C786410Ut5.Sd(R.layout.f8c, C786410Ut5.ne(activity), null);
        this.LLILZLL = viewSd;
        this.LLJ = (RemoteImageView) viewSd.findViewById(R.id.lle);
        this.LLIZLLLIL = (RelativeLayout) viewSd.findViewById(R.id.tp_);
        C1380390m1d c1380390m1d = (C1380390m1d) viewSd.findViewById(R.id.si1);
        this.LLILLJJLI = c1380390m1d;
        c1380390m1d.LLILLL = this.LLIZLLLIL;
        c1380390m1d.setPullUpListener(this);
        C786410Ut5.E9(this.LLJ, this);
        this.LLILLJJLI.setInternalTouchEventListener(new InterfaceC1380410m1f() { // from class: X.0lwC
            @Override // X.InterfaceC1380410m1f
            public final void onTouchEvent(MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action == 2) {
                            this.LIZ.LLILLL = true;
                            return;
                        }
                        return;
                    }
                    ViewOnClickListenerC1377010lwB viewOnClickListenerC1377010lwB = this.LIZ;
                    viewOnClickListenerC1377010lwB.LLILLL = false;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    ViewOnClickListenerC1377010lwB viewOnClickListenerC1377010lwB2 = this.LIZ;
                    int i = viewOnClickListenerC1377010lwB2.LL;
                    viewOnClickListenerC1377010lwB.LLILZIL = jCurrentTimeMillis + ((long) i);
                    viewOnClickListenerC1377010lwB2.LLILZ.LL = false;
                    if (viewOnClickListenerC1377010lwB2.LLIZLLLIL == null) {
                        return;
                    }
                    HandlerHook.viewPostDelay(viewOnClickListenerC1377010lwB2.LLIZLLLIL, viewOnClickListenerC1377010lwB2.LLILZ, i);
                    return;
                }
                ViewOnClickListenerC1377010lwB viewOnClickListenerC1377010lwB3 = this.LIZ;
                viewOnClickListenerC1377010lwB3.LLILLL = true;
                RunnableC1377030lwD runnableC1377030lwD = viewOnClickListenerC1377010lwB3.LLILZ;
                if (runnableC1377030lwD == null) {
                    return;
                }
                runnableC1377030lwD.LL = true;
            }
        });
        this.LLILZ = new RunnableC1377030lwD(this);
        setBackgroundDrawable(new ColorDrawable(0));
        setContentView(viewSd);
        C844470XAv.LIZ.getClass();
        setWidth(C12ES.LJIIJ(C844470XAv.LIZ()));
        setHeight(-2);
        update();
        setAnimationStyle(R.style.afu);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        IAVPublishService iAVPublishServicePublishService = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService();
        if (id == R.id.lle) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("aweme://aweme/detail/");
            sbLIZ.append(this.LLJI.getAid());
            C686150Qvl c686150Qvl = new C686150Qvl(C2188811AlT.LIZIZ(sbLIZ));
            c686150Qvl.LIZIZ("refer", "upload");
            String strLIZJ = c686150Qvl.LIZJ();
            if (iAVPublishServicePublishService.privateLandingToProfile()) {
                strLIZJ = UriProtector.parse("aweme://main").buildUpon().appendQueryParameter("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "USER").appendQueryParameter("profile_from_scene", "1031").build().toString();
            }
            SmartRouter.buildRoute(this.LLIZ, strLIZJ).open();
            iAVPublishServicePublishService.setPublishStatus(11);
            onDismiss();
        }
    }

    @Override // android.widget.PopupWindow, X.InterfaceC1238780iLE
    public final void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        super.setOnDismissListener(onDismissListener);
    }
}
