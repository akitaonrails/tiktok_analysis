package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS109S0101000_1;

/* JADX INFO: renamed from: X.0mGz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1389910mGz {
    public C1360890lWB LIZ = new C1360890lWB(0);
    public Context LIZIZ;
    public final View LIZJ;
    public C1390030mHB LIZLLL;

    public final void LIZJ() {
        this.LIZ.LIZ.LJII = false;
        C1390030mHB c1390030mHB = this.LIZLLL;
        if (c1390030mHB != null) {
            c1390030mHB.LJJIJIL(C1389900mGy.LIZ);
        }
        C1390030mHB c1390030mHB2 = this.LIZLLL;
        if (c1390030mHB2 != null) {
            c1390030mHB2.dismiss();
        }
    }

    public final void LJIIJJI() {
        Integer num = this.LIZ.LIZ.LJIIL;
        if (num != null) {
            int iIntValue = num.intValue();
            Context context = this.LIZIZ;
            if (context != null) {
                this.LIZIZ = C1388190mED.LJ(iIntValue, context);
            }
        }
        Context context2 = this.LIZIZ;
        View view = this.LIZJ;
        CharSequence charSequence = this.LIZ.LIZ.LIZIZ;
        if (context2 != null && view != null && charSequence != null && charSequence.length() != 0) {
            C1390030mHB c1390030mHB = new C1390030mHB(context2, view, this.LIZ);
            c1390030mHB.show();
            if (this.LIZ.LIZ.LJII) {
                C1378370lyN.LIZ.getClass();
                C1378370lyN.LIZJ(c1390030mHB);
            }
            this.LIZLLL = c1390030mHB;
        }
        PopupMonitorServiceImpl.LIZ.getClass();
        if (PopupMonitorServiceImpl.LJJJJIZL()) {
            C1390660mIC c1390660mICLJJIJL = PopupMonitorServiceImpl.LJJIJL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PopupWindow-");
            sbLIZ.append(this);
            C23250099c.LIZLLL(PopupMonitorServiceImpl.LIZIZ, null, null, new C1390170mHP(this, new C1389930mH1(C2188811AlT.LIZIZ(sbLIZ), "popup_window"), c1390660mICLJJIJL, null), 3);
        }
    }

    public C1389910mGz(Dialog dialog) {
        View decorView;
        Window window = dialog.getWindow();
        if (window != null) {
            decorView = window.getDecorView();
        } else {
            decorView = null;
        }
        this.LIZJ = decorView;
        this.LIZIZ = dialog.getContext();
    }

    public final void LIZ(boolean z) {
        C1389920mH0 c1389920mH0 = this.LIZ.LIZ;
        c1389920mH0.LJII = z;
        if (z) {
            int i = AbstractC1389950mH3.LLILZ + 1;
            AbstractC1389950mH3.LLILZ = i;
            if (i >= Integer.MAX_VALUE) {
                AbstractC1389950mH3.LLILZ = 1;
            }
            c1389920mH0.LJIIIIZZ = AbstractC1389950mH3.LLILZ;
        }
    }

    public final void LIZIZ(int i) {
        this.LIZ.LJII = Integer.valueOf(i);
    }

    public final void LIZLLL(Function0 function0) {
        this.LIZ.LIZ.LJIIIZ = new WeakReference<>(function0);
    }

    public final void LJ(long j) {
        this.LIZ.LIZ.LJ = j;
    }

    public final void LJFF(int i) {
        String string;
        C1360890lWB c1360890lWB = this.LIZ;
        Context context = this.LIZIZ;
        if (context != null) {
            string = context.getString(i);
        } else {
            string = null;
        }
        c1360890lWB.LJI = string;
    }

    public final void LJI(int i) {
        Context context = this.LIZIZ;
        if (context == null) {
            return;
        }
        this.LIZ.LIZ.LJIIL = Integer.valueOf(i);
        this.LIZIZ = C1388190mED.LJ(i, context);
    }

    public final void LJII(boolean z) {
        this.LIZ.LIZ.LJI = z;
    }

    public final void LJIIIIZZ(boolean z) {
        this.LIZ.LIZ.LJFF = z;
    }

    public final void LJIIIZ(int i) {
        String string;
        C1389920mH0 c1389920mH0 = this.LIZ.LIZ;
        Context context = this.LIZIZ;
        if (context != null) {
            string = context.getString(i);
        } else {
            string = null;
        }
        c1389920mH0.LIZIZ = string;
    }

    public final void LJIIJ(CharSequence charSequence) {
        this.LIZ.LIZ.LIZIZ = charSequence;
    }

    public final void LJIIL(C419910GdJ c419910GdJ) {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        this.LIZ.LIZJ = new AwS109S0101000_1(c419910GdJ, iLIZIZ, 7);
    }

    public C1389910mGz(Fragment fragment) {
        View rootView;
        View view = fragment.getView();
        if (view != null) {
            rootView = view.getRootView();
        } else {
            rootView = null;
        }
        this.LIZJ = rootView;
        this.LIZIZ = fragment.getContext();
    }

    public C1389910mGz(Activity activity) {
        View decorView;
        Window window = activity.getWindow();
        if (window != null) {
            decorView = window.getDecorView();
        } else {
            decorView = null;
        }
        this.LIZJ = decorView;
        this.LIZIZ = activity;
    }

    public C1389910mGz(View view) {
        this.LIZJ = view;
        this.LIZIZ = view.getContext();
    }
}
