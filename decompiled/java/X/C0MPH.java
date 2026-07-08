package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0MPH, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MPH extends ProgressDialogC1397800mTi {
    public C0MPH(Context context) {
        super(context);
        this.LL = false;
    }

    public static C0MPH LIZLLL(Context context, String str) {
        if (context != null && (context instanceof Activity) && !C20622515mp.LJIILIIL(C1388190mED.LIZ(context))) {
            C0MPH c0mph = new C0MPH(context);
            c0mph.setCancelable(false);
            c0mph.setIndeterminate(false);
            c0mph.setMax(100);
            c0mph.show();
            C785410UrT.LIZIZ(c0mph);
            PopupMonitorServiceImpl.LIZ.getClass();
            PopupMonitorServiceImpl.LJJJ(c0mph);
            C816490W1f.LIZ(c0mph);
            c0mph.setContentView(R.layout.uq);
            c0mph.setMessage(str);
            c0mph.LIZIZ();
            return c0mph;
        }
        return null;
    }
}
