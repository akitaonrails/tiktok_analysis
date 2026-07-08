package X;

import Y.ARunnableS129S0100000_29;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import webcast.data.RealtimeLiveCenterLopInfo;

/* JADX INFO: renamed from: X.10xi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19416010xi extends C12O8 {
    public RealtimeLiveCenterLopInfo LJ;
    public final C16F5 LJFF;
    public final View LJI;
    public final ConstraintLayout LJII;
    public final ARunnableS129S0100000_29 LJIIIIZZ;

    @Override // X.C12O8
    public final int LJIIIZ() {
        return 76;
    }

    @Override // X.C12O8
    public final int LJIIJJI() {
        return 1;
    }

    @Override // X.C12O8
    public final void LJIIZILJ() {
    }

    @Override // X.C12O8
    public final boolean LJIJ(C12O8 c12o8) {
        return true;
    }

    @Override // X.C12O8
    public final void LJIILJJIL() {
        ConstraintLayout constraintLayout = this.LJII;
        if (constraintLayout != null) {
            C786410Ut5.c5(constraintLayout, 1.0f);
        }
        View view = this.LJI;
        if (view != null) {
            C786410Ut5.T4(view, 1.0f);
        }
        ConstraintLayout constraintLayout2 = this.LJII;
        if (constraintLayout2 != null) {
            C786410Ut5.LL(0, constraintLayout2);
        }
        C473410IhP.LIZJ(this.LJIIIIZZ, 10000L);
    }

    @Override // X.C12O8
    public final View LIZJ() {
        return this.LJII;
    }

    public C19416010xi(View view) {
        super(C12OE.LOP, 9, 0);
        this.LJIIIIZZ = new ARunnableS129S0100000_29(this, 190);
        this.LJI = view.findViewById(R.id.e8s);
        this.LJII = (ConstraintLayout) view.findViewById(R.id.nqu);
        this.LJFF = (C16F5) view.findViewById(R.id.nqx);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    @Override // X.C12O8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.String> LJIIJ(java.lang.String r4) {
        /*
            r3 = this;
            X.0Uky r1 = X.C781380Uky.LIZ
            webcast.data.RealtimeLiveCenterLopInfo r0 = r3.LJ
            r1.getClass()
            if (r0 == 0) goto L28
            int r1 = r0.status
            r0 = 1
            if (r1 != r0) goto L1c
            java.lang.String r2 = "lop_first_live"
        L10:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "lop_status"
            r1.<init>(r0, r2)
            java.util.Map r0 = X.C2097908Jt.LIZJ(r1)
            return r0
        L1c:
            r0 = 2
            if (r1 != r0) goto L22
            java.lang.String r2 = "lop_1_task_done"
            goto L10
        L22:
            r0 = 3
            if (r1 != r0) goto L28
            java.lang.String r2 = "lop_all_task_done"
            goto L10
        L28:
            java.lang.String r2 = ""
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19416010xi.LJIIJ(java.lang.String):java.util.Map");
    }

    @Override // X.C12O8
    public final void LJIIL(C12OB c12ob) {
        ConstraintLayout constraintLayout = this.LJII;
        if (constraintLayout != null) {
            C786410Ut5.LL(8, constraintLayout);
        }
        View view = this.LJI;
        if (view != null) {
            C786410Ut5.T4(view, 0.0f);
        }
        c12ob.invoke();
    }
}
