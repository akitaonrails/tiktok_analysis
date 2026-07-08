package X;

import Y.ARunnableS128S0100000_28;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10Js, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19226610Js {
    public final Function0<Unit> LIZ;
    public final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());
    public final DialogC1389620mGW LIZJ;
    public final DialogC19217610Gg LIZLLL;
    public C0DA3 LJ;
    public boolean LJFF;
    public long LJI;
    public final ARunnableS128S0100000_28 LJII;

    public final void LIZ() {
        this.LIZIZ.removeCallbacks(this.LJII);
        this.LJI = 0L;
        this.LJ = null;
        LIZIZ();
    }

    public final void LIZIZ() {
        this.LJI = 0L;
        if (this.LIZJ.isShowing()) {
            C786410Ut5.LJIIJ(this.LIZJ);
        }
        if (this.LIZLLL.isShowing()) {
            DialogC19217610Gg dialogC19217610Gg = this.LIZLLL;
            dialogC19217610Gg.dismiss();
            C785410UrT.LIZ(dialogC19217610Gg);
        }
    }

    public final void LIZLLL() {
        if (this.LJFF) {
            this.LIZLLL.setCancelable(false);
            this.LIZLLL.setCanceledOnTouchOutside(false);
            this.LIZLLL.setOnCancelListener(null);
        } else {
            this.LIZJ.setCancelable(false);
            this.LIZJ.setCanceledOnTouchOutside(false);
            this.LIZJ.LJJLL(false);
        }
    }

    public final void LIZJ(C0DBT c0dbt) {
        boolean z;
        if (c0dbt == null) {
            LIZ();
            return;
        }
        if (c0dbt.LIZ == C0DA3.COMPLETING_CHECKOUT) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.LJFF) {
            LIZIZ();
        }
        this.LJFF = z;
        if (z) {
            if (!this.LIZLLL.isShowing()) {
                this.LIZLLL.setCancelable(false);
                this.LIZLLL.setCanceledOnTouchOutside(false);
                this.LIZLLL.setOnCancelListener(null);
                String str = c0dbt.LIZJ;
                if (str != null) {
                    this.LIZLLL.LJJLIIIJLLLLLLLZ(str);
                }
                DialogC19217610Gg dialogC19217610Gg = this.LIZLLL;
                dialogC19217610Gg.show();
                C785410UrT.LIZIZ(dialogC19217610Gg);
                PopupMonitorServiceImpl.LIZ.getClass();
                PopupMonitorServiceImpl.LJJJ(dialogC19217610Gg);
                C816490W1f.LIZ(dialogC19217610Gg);
            }
            C0DA3 c0da3 = this.LJ;
            C0DA3 c0da32 = c0dbt.LIZ;
            if (c0da3 != c0da32) {
                this.LJ = c0da32;
                LIZLLL();
                String str2 = c0dbt.LIZJ;
                if (str2 != null) {
                    this.LIZLLL.LJJLIIIJLLLLLLLZ(str2);
                }
                LJ(c0dbt.LIZIZ);
                return;
            }
            return;
        }
        if (!this.LIZJ.isShowing()) {
            this.LIZJ.setCancelable(false);
            this.LIZJ.setCanceledOnTouchOutside(false);
            this.LIZJ.LJJLL(false);
            C786410Ut5.J4(this.LIZJ);
        }
        C0DA3 c0da33 = this.LJ;
        C0DA3 c0da34 = c0dbt.LIZ;
        if (c0da33 == c0da34) {
            return;
        }
        this.LJ = c0da34;
        LIZLLL();
        LJ(c0dbt.LIZIZ);
    }

    public final void LJ(Long l) {
        if (l == null) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.LJI > jElapsedRealtime) {
            return;
        }
        this.LIZIZ.removeCallbacks(this.LJII);
        this.LJI = jElapsedRealtime + l.longValue();
        C786410Ut5.LJLIIL(l.longValue(), this.LIZIZ, this.LJII);
    }

    public C19226610Js(Context context, Function0<Unit> function0) {
        this.LIZ = function0;
        DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(context);
        dialogC1389620mGW.LJJLIIJ(false);
        dialogC1389620mGW.setCancelable(false);
        dialogC1389620mGW.setCanceledOnTouchOutside(false);
        dialogC1389620mGW.setOnCancelListener(new DialogInterfaceOnCancelListenerC19332810kI(this, 14));
        this.LIZJ = dialogC1389620mGW;
        this.LIZLLL = new DialogC19217610Gg(context);
        this.LJII = new ARunnableS128S0100000_28(this, 130);
    }
}
