package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0lpQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class DialogC1372820lpQ extends DialogC1389100mFg implements InterfaceC1374230lrh {
    public static final /* synthetic */ int LLJILLL = 0;
    public final C1372830lpR LLJILJIL;
    public final C1373630lqj LLJILJILJ;

    @Override // X.InterfaceC1374230lrh
    public final void LJIILJJIL() {
        this.LLJILJILJ.LIZLLL(true);
    }

    @Override // X.InterfaceC1374230lrh
    public final ViewGroup LJIJ() {
        return this.LLJILJILJ.LJIIIZ;
    }

    @Override // X.InterfaceC1374230lrh
    public final ViewGroup LJJIIJ() {
        return this.LLJILJILJ.LJIIJJI;
    }

    @Override // X.InterfaceC1374230lrh
    public final void LJJLI() {
        this.LLJILJILJ.getClass();
    }

    @Override // X.C19EK, android.app.Dialog
    public final void onBackPressed() {
        C1373630lqj c1373630lqj = this.LLJILJILJ;
        ViewGroup viewGroup = c1373630lqj.LJIIIZ;
        if (viewGroup == null || viewGroup.getVisibility() != 0) {
            super.onBackPressed();
            return;
        }
        View view = c1373630lqj.LJI;
        if (view != null) {
            InterfaceC1373720lqs interfaceC1373720lqs = c1373630lqj.LIZJ;
            KeyEvent.Callback callback = c1373630lqj.LJ;
            C1376920lw2 c1376920lw2LIZLLL = interfaceC1373720lqs.LIZLLL(callback instanceof InterfaceC1374230lrh ? (InterfaceC1374230lrh) callback : null);
            if (c1376920lw2LIZLLL != null) {
                c1376920lw2LIZLLL.LIZIZ(view);
            }
        }
    }

    @Override // X.DialogC19728412Gs, android.app.Dialog
    public final void show() throws Throwable {
        Object obj;
        View decorView;
        if (!(((Number) C277960Auw.LIZ.getValue()).intValue() == 1) && this.LLJILJIL.LJFF) {
            Activity activityLIZ = C1388190mED.LIZ(getContext());
            ((Vibrator) (activityLIZ != null ? C786410Ut5.F2(activityLIZ, "vibrator") : null)).vibrate(15L);
        }
        Window window = getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(R.id.vshot_dialog_can_expose, Boolean.TRUE);
        }
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgYo3Lkh5YcZySDGwCGifqOmohX+c4vZdofkNraQ==", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "com/google/android/material/bottomsheet/BottomSheetDialog", "show", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(300000, "com/google/android/material/bottomsheet/BottomSheetDialog", "show", null, objArr, this, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        DialogC19728412Gs dialogC19728412Gs = (objArr2 == null || (obj = objArr2[0]) == null) ? this : (DialogC19728412Gs) obj;
        super.show();
        c0wst.LIZ(300000, "com/google/android/material/bottomsheet/BottomSheetDialog", "show", null, objArr, dialogC19728412Gs, c0wzw, true);
    }

    @Override // X.C19GU, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() throws Exception {
        C2211631BhB.LIZIZ(this);
        super.dismiss();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLJILJILJ.getClass();
        FypAutoScrollService fypAutoScrollServiceLIZJ = C1386360mBG.LIZJ();
        if (fypAutoScrollServiceLIZJ != null) {
            fypAutoScrollServiceLIZJ.LJIJI(false);
        }
    }

    @Override // X.DialogC1389100mFg, X.C19EK, android.app.Dialog
    public final void onStart() {
        super.onStart();
        super.setOnDismissListener(new DialogInterfaceOnDismissListenerC1402040maY(this, 1));
        this.LLJILJILJ.LJ();
    }

    @Override // X.DialogC1389100mFg, X.C19GU, X.C19EK, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        try {
            Window window = getWindow();
            if (window != null) {
                window.addFlags(Integer.MIN_VALUE);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LJ(e.getMessage());
        }
        super.onCreate(bundle);
        setContentView(R.layout.b91);
        Window window2 = getWindow();
        if (window2 != null && Build.VERSION.SDK_INT >= 26) {
            window2.setNavigationBarColor(-1);
            C1360720lVu.LIZJ(window2, true);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setStatusBarColor(0);
        }
        this.LLJILJILJ.LIZIZ(findViewById(R.id.q1v));
    }

    @Override // android.app.Dialog
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.LLJILJILJ.LJIJ = onDismissListener;
    }

    public DialogC1372820lpQ(Context context, C1372830lpR c1372830lpR, InterfaceC1373720lqs interfaceC1373720lqs, float f) {
        super(context, R.style.ab7);
        this.LLJILJIL = c1372830lpR;
        this.LLJILJILJ = new C1373630lqj(context, c1372830lpR, interfaceC1373720lqs, f, this, null);
    }
}
