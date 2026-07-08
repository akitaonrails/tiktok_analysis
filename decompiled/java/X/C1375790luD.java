package X;

import Y.ARunnableS121S0100000_21;
import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0luD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1375790luD extends C214906198m implements InterfaceC1238780iLE, InterfaceC1380420m1g, InterfaceC1586360rNq {
    public final Activity LL;
    public final C1371590lnR LLILLJJLI;
    public final View LLILLL;
    public LinearLayout LLILZ;
    public final int LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public C1378330lyJ LLIZLLLIL;
    public long LLJ;
    public final DialogC1389620mGW LLJI;
    public final ARunnableS121S0100000_21 LLJIJIL;

    @Override // X.InterfaceC1380420m1g
    public final void LIZ() {
    }

    @Override // X.InterfaceC1380420m1g
    public final void LIZIZ() {
        this.LLILZLL = false;
        onDismiss();
        C343710Ddh.LIZ(C1388190mED.LIZIZ(this.LL)).HQ2(this);
    }

    @Override // X.InterfaceC1586360rNq
    public final void LLLZLZ(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
    }

    @Override // X.InterfaceC1238780iLE
    public final void show() {
        C1378330lyJ c1378330lyJ = this.LLIZLLLIL;
        if (c1378330lyJ != null) {
            c1378330lyJ.LIZIZ();
        }
        if (isShowing()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.LLILZIL;
        this.LLJ = jCurrentTimeMillis + j;
        C1378330lyJ c1378330lyJ2 = this.LLIZLLLIL;
        if (c1378330lyJ2 != null) {
            HandlerHook.viewPostDelay(c1378330lyJ2, this.LLJIJIL, j);
        }
        if (getContentView().getParent() != null) {
            C786410Ut5.LJJJLZIJ(getContentView(), (ViewGroup) getContentView().getParent());
        }
        try {
            showAtLocation(this.LL.getWindow().getDecorView(), 48, 0, -C497820Jfg.LIZJ(this.LL));
            PopupMonitorServiceImpl.LIZ.getClass();
            PopupMonitorServiceImpl.LJJJI(this);
            C787990Uvd.LIZ.getClass();
            C994003uc.LIZ();
            C1373930lrD.LIZIZ(this.LLILLJJLI, "share_head_panel");
        } catch (WindowManager.BadTokenException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC1238780iLE
    public final void onDismiss() {
        if (!isShowing() || this.LLILZLL) {
            return;
        }
        try {
            C1378330lyJ c1378330lyJ = this.LLIZLLLIL;
            if (c1378330lyJ != null) {
                c1378330lyJ.LIZ(0.0f, true);
            }
            dismiss();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // android.widget.PopupWindow, X.InterfaceC1238780iLE
    public final void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        super.setOnDismissListener(onDismissListener);
    }

    public C1375790luD(Activity activity, C1371590lnR c1371590lnR) {
        super(activity);
        this.LL = activity;
        this.LLILLJJLI = c1371590lnR;
        View viewSd = C786410Ut5.Sd(R.layout.ccx, C786410Ut5.ne(activity), null);
        this.LLILLL = viewSd;
        this.LLILZIL = 5000;
        DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(activity);
        this.LLJI = dialogC1389620mGW;
        this.LLJIJIL = new ARunnableS121S0100000_21(this, 5);
        setBackgroundDrawable(new ColorDrawable(0));
        setContentView(viewSd);
        setWidth(C12ES.LJIIJ(activity));
        setHeight(-2);
        update();
        setAnimationStyle(R.style.afu);
        this.LLILZ = (LinearLayout) viewSd.findViewById(R.id.tp_);
        C1378330lyJ c1378330lyJ = (C1378330lyJ) viewSd.findViewById(R.id.si1);
        this.LLIZLLLIL = c1378330lyJ;
        if (c1378330lyJ != null) {
            c1378330lyJ.LLILLL = this.LLILZ;
            c1378330lyJ.setPullUpListener(this);
        }
        C1368040lhi c1368040lhi = (C1368040lhi) C786410Ut5.LJLLLL((ViewStub) viewSd.findViewById(R.id.v11)).findViewById(R.id.v10);
        C1368040lhi c1368040lhi2 = c1368040lhi != null ? c1368040lhi : null;
        List<InterfaceC1369790lkX> list = c1371590lnR.LIZ;
        c1368040lhi2.LL = list;
        c1368040lhi2.LLILLL.setData(list);
        c1368040lhi2.LLILLJJLI = new InterfaceC1368050lhj() { // from class: X.0luE
            @Override // X.InterfaceC1368050lhj
            public final void LJIIIIZZ(InterfaceC1369790lkX interfaceC1369790lkX, View view) {
                C786410Ut5.LJJJI("enter_from", "guide_personal_videos_share_panel", this.LL.LLILLJJLI.LJIJJ.extras);
                this.LL.LLILLJJLI.LJIJJ.extras.getString("share_aweme_id");
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1375810luF(this.LL, interfaceC1369790lkX, view, null), 3);
            }
        };
        dialogC1389620mGW.LJJLJ(R.string.txr);
        C1378330lyJ c1378330lyJ2 = this.LLIZLLLIL;
        if (c1378330lyJ2 != null) {
            c1378330lyJ2.setInternalTouchEventListener(new InterfaceC1380410m1f() { // from class: X.0luI
                @Override // X.InterfaceC1380410m1f
                public final void onTouchEvent(MotionEvent motionEvent) {
                    int action = motionEvent.getAction();
                    if (action != 0) {
                        if (action != 1) {
                            if (action == 2) {
                                this.LIZ.LLILZLL = true;
                                return;
                            }
                            return;
                        }
                        C1375790luD c1375790luD = this.LIZ;
                        c1375790luD.LLILZLL = false;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        C1375790luD c1375790luD2 = this.LIZ;
                        long j = c1375790luD2.LLILZIL;
                        c1375790luD.LLJ = jCurrentTimeMillis + j;
                        c1375790luD2.LLIZ = false;
                        LinearLayout linearLayout = c1375790luD2.LLILZ;
                        if (linearLayout == null) {
                            return;
                        }
                        HandlerHook.viewPostDelay(linearLayout, c1375790luD2.LLJIJIL, j);
                        return;
                    }
                    C1375790luD c1375790luD3 = this.LIZ;
                    c1375790luD3.LLILZLL = true;
                    c1375790luD3.LLIZ = true;
                }
            });
        }
        C343710Ddh.LIZ(C1388190mED.LIZIZ(activity)).wQ2(this);
    }
}
