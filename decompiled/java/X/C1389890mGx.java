package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.PopupWindow;
import androidx.fragment.app.Fragment;
import com.ss.android.agilelogger.ALog;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0mGx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1389890mGx {
    public static int LJFF;
    public C1383230m6D LIZ;
    public final Context LIZIZ;
    public final View LIZJ;
    public C1390090mHH LIZLLL;
    public C1361400lX0 LJ;

    public C1389890mGx() {
        throw null;
    }

    public final void LIZIZ() {
        this.LIZ.LIZ.LJII = false;
        C1390090mHH c1390090mHH = this.LIZLLL;
        if (c1390090mHH != null) {
            c1390090mHH.LJJIJIL(C1389900mGy.LIZ);
        }
        C1390090mHH c1390090mHH2 = this.LIZLLL;
        if (c1390090mHH2 != null) {
            c1390090mHH2.dismiss();
        }
    }

    public final void LJIIJJI() {
        Integer num = this.LIZ.LIZ.LJIIL;
        if (num != null) {
            int iIntValue = num.intValue();
            Context context = this.LIZIZ;
            if (context != null) {
                this.LJ = C1388190mED.LJ(iIntValue, context);
            }
        }
        Context context2 = this.LJ;
        if (context2 == null) {
            context2 = this.LIZIZ;
        }
        View view = this.LIZJ;
        CharSequence charSequence = this.LIZ.LIZ.LIZIZ;
        if (context2 != null && view != null && charSequence != null && charSequence.length() > 0) {
            C1390090mHH c1390090mHH = new C1390090mHH(context2, view, this.LIZ);
            c1390090mHH.show();
            if (this.LIZ.LIZ.LJII) {
                C1378370lyN.LIZ.getClass();
                C1378370lyN.LIZJ(c1390090mHH);
            }
            this.LIZLLL = c1390090mHH;
        }
        Context context3 = this.LIZIZ;
        C1383230m6D c1383230m6D = this.LIZ;
        if (context3 == null || c1383230m6D == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("context is ");
        sbLIZ.append(context3.getClass());
        sbLIZ.append(", bundle is ");
        sbLIZ.append(c1383230m6D);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("TUX", C2188811AlT.LIZIZ(sbLIZ));
    }

    public C1389890mGx(Dialog dialog) {
        this.LIZ = new C1383230m6D(null, 31);
        Window window = dialog.getWindow();
        this.LIZJ = window != null ? window.getDecorView() : null;
        Context context = dialog.getContext();
        this.LIZIZ = context;
        LJIIIIZZ(context);
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

    public final void LIZJ(Function0 function0) {
        this.LIZ.LIZ.LJIIIZ = new WeakReference<>(function0);
    }

    public final void LIZLLL(long j) {
        this.LIZ.LIZ.LJ = j;
    }

    public final void LJ(Integer num) {
        Context context = this.LIZIZ;
        if (context == null) {
            return;
        }
        this.LIZ.LIZ.LJIIL = num;
        if (num != null) {
            this.LJ = C1388190mED.LJ(num.intValue(), context);
        } else {
            LJIIIIZZ(context);
        }
    }

    public final void LJFF(int i) {
        this.LIZ.LIZ.LIZJ = Integer.valueOf(i);
    }

    public final void LJI(int i) {
        this.LIZ.LIZ.LIZLLL = Integer.valueOf(i);
    }

    public final void LJII(int i) {
        Integer numLIZJ;
        C1389920mH0 c1389920mH0 = this.LIZ.LIZ;
        Context context = this.LJ;
        if (context == null && (context = this.LIZIZ) == null) {
            numLIZJ = null;
        } else {
            numLIZJ = C1308910kAL.LIZJ(i, context);
        }
        c1389920mH0.LIZLLL = numLIZJ;
    }

    public final void LJIIIIZZ(Context context) {
        if (context != null) {
            this.LJ = C1388190mED.LJ(C1388190mED.LIZJ(context, true), context);
        }
    }

    public final void LJIIIZ(int i) {
        String string;
        C1389920mH0 c1389920mH0 = this.LIZ.LIZ;
        Context context = this.LJ;
        if (context == null && (context = this.LIZIZ) == null) {
            string = null;
        } else {
            string = context.getString(i);
        }
        c1389920mH0.LIZIZ = string;
    }

    public final void LJIIJ(CharSequence charSequence) {
        this.LIZ.LIZ.LIZIZ = charSequence;
    }

    public final void LJIIL(int i) {
        this.LIZ.LIZJ = Integer.valueOf(i);
    }

    public C1389890mGx(PopupWindow popupWindow) {
        this.LIZ = new C1383230m6D(null, 31);
        this.LIZJ = popupWindow.getContentView();
        View contentView = popupWindow.getContentView();
        Context context = contentView != null ? contentView.getContext() : null;
        this.LIZIZ = context;
        LJIIIIZZ(context);
    }

    public C1389890mGx(Fragment fragment) {
        this.LIZ = new C1383230m6D(null, 31);
        View view = fragment.getView();
        this.LIZJ = view != null ? view.getRootView() : null;
        Context context = fragment.getContext();
        this.LIZIZ = context;
        LJIIIIZZ(context);
    }

    public C1389890mGx(Activity activity) {
        this.LIZ = new C1383230m6D(null, 31);
        Window window = activity.getWindow();
        this.LIZJ = window != null ? window.getDecorView() : null;
        this.LIZIZ = activity;
        LJIIIIZZ(activity);
    }

    public C1389890mGx(View view) {
        this.LIZ = new C1383230m6D(null, 31);
        this.LIZJ = view;
        Context context = view.getContext();
        this.LIZIZ = context;
        LJIIIIZZ(context);
    }
}
