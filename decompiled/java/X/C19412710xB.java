package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.10xB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19412710xB {
    public final Context LIZ;
    public View LIZIZ;
    public View LIZJ;
    public View LIZLLL;
    public int LJ = -1;

    public C19412710xB(Context context) {
        if (context != null) {
            this.LIZ = context;
            return;
        }
        throw new IllegalArgumentException("DmtStatusView.Builder:Context can not be null");
    }

    public static C19412710xB LIZ(Context context) {
        C19412710xB c19412710xB = new C19412710xB(context);
        C1688850u39 c1688850u39 = new C1688850u39(context, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1688850u39);
        c1688850u39.setLayoutParams(layoutParams);
        c19412710xB.LIZIZ = c1688850u39;
        C786410Ut5.W5(c19412710xB.LIZIZ, new FrameLayout.LayoutParams(-1, -1));
        return c19412710xB;
    }
}
