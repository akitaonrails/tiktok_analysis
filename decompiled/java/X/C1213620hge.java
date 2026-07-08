package X;

import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0hge, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1213620hge {
    public final Context LIZ;

    public C1213620hge(Context context) {
        this.LIZ = context;
    }

    public final void LIZ(View view, float f) {
        if (f < -1.0f) {
            C786410Ut5.Ob(view, 0.9f);
            C786410Ut5.pc(view, 0.9f);
            C786410Ut5.T4(view, 0.34f);
            return;
        }
        if (f <= 1.0f) {
            float f2 = 1;
            float fAbs = ((f2 - Math.abs(f)) * 0.100000024f) + 0.9f;
            float fAbs2 = ((f2 - Math.abs(f)) * 0.65999997f) + 0.34f;
            float fAbs3 = 7 + (f2 * (f2 - Math.abs(f)));
            float fAbs4 = 12 * Math.abs(f);
            C786410Ut5.Ob(view, fAbs);
            C786410Ut5.pc(view, fAbs);
            C786410Ut5.T4(view, fAbs2);
            C786410Ut5.ed(view, C12ES.LIZJ(fAbs4, this.LIZ));
            C21537519Qn c21537519Qn = (C21537519Qn) view.findViewById(R.id.ey_);
            if (c21537519Qn == null) {
                return;
            }
            c21537519Qn.setRadius((int) C12ES.LIZJ(fAbs3, this.LIZ));
            return;
        }
        C786410Ut5.Ob(view, 0.9f);
        C786410Ut5.pc(view, 0.9f);
        C786410Ut5.T4(view, 0.34f);
    }
}
