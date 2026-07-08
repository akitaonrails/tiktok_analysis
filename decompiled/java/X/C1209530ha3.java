package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0ha3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1209530ha3 {
    public final Context LIZ;
    public View LIZIZ;
    public View LIZJ;
    public View LIZLLL;
    public View LJ;
    public int LJFF = -1;

    public final void LJ() {
        C1235900iGa c1235900iGa = new C1235900iGa(this.LIZ, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1235900iGa);
        c1235900iGa.setLayoutParams(layoutParams);
        this.LIZIZ = c1235900iGa;
        C786410Ut5.W5(this.LIZIZ, new FrameLayout.LayoutParams(-1, -1));
    }

    public C1209530ha3(Context context) {
        if (context != null) {
            this.LIZ = context;
            return;
        }
        throw new IllegalArgumentException("DmtStatusView.Builder:Context can not be null");
    }

    public static C1209530ha3 LIZ(Context context) {
        C1209530ha3 c1209530ha3 = new C1209530ha3(context);
        c1209530ha3.LJ();
        return c1209530ha3;
    }

    public final void LIZIZ(View view) {
        this.LIZJ = view;
        C786410Ut5.W5(this.LIZJ, new FrameLayout.LayoutParams(-1, -1));
    }

    public final void LIZJ(int i) {
        C1209270hZd c1209270hZd = new C1209270hZd(this.LIZ);
        c1209270hZd.LIZ.LIZ = c1209270hZd.LIZIZ.getString(i);
        C1209260hZc c1209260hZc = c1209270hZd.LIZ;
        C1213330hgB c1213330hgB = new C1213330hgB(this.LIZ);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1213330hgB);
        c1213330hgB.setLayoutParams(layoutParams);
        c1213330hgB.setStatus(c1209260hZc);
        this.LIZLLL = c1213330hgB;
    }

    public final void LIZLLL(View view) {
        this.LIZLLL = view;
        C786410Ut5.W5(this.LIZLLL, new FrameLayout.LayoutParams(-1, -1));
    }
}
