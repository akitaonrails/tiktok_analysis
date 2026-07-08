package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0iBy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@InterfaceC1294060jmO
public final class C1233040iBy {
    public static long LJ;
    public static String LJFF;
    public final Context LIZ;
    public final C1389890mGx LIZIZ;
    public String LIZJ;
    public boolean LIZLLL;

    public final void LJ() {
        Context context = this.LIZ;
        if (context == null || C2213981Bky.LIZIZ.isAppBackground()) {
            return;
        }
        C1361400lX0 c1361400lX0 = new C1361400lX0(context, R.style.y0);
        Toast toast = new Toast(c1361400lX0);
        toast.setDuration(0);
        toast.setGravity(55, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        if (this.LIZLLL) {
            context = c1361400lX0;
        }
        View viewSd = C786410Ut5.Sd(R.layout.i3k, (LayoutInflater) C786410Ut5.H2(context, "layout_inflater"), null);
        View viewFindViewById = viewSd.findViewById(R.id.tp_);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.uj);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        viewFindViewById.setBackgroundDrawable(c384050F3z.LIZ(c1361400lX0));
        TextView textView = (TextView) viewSd.findViewById(R.id.zf0);
        textView.setText(this.LIZJ);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, c1361400lX0);
        textView.setTextColor(numLIZJ != null ? numLIZJ.intValue() : -1);
        toast.setView(viewSd);
        C786410Ut5.re(toast);
    }

    public final void LIZLLL() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - LJ > 2000 || !TextUtils.equals(LJFF, this.LIZJ)) {
            LJFF = this.LIZJ;
            LJ = jCurrentTimeMillis;
            String str = this.LIZJ;
            if (str == null || str.length() == 0) {
                return;
            }
            C1389890mGx c1389890mGx = this.LIZIZ;
            if (c1389890mGx != null) {
                c1389890mGx.LJIIJJI();
                return;
            }
            try {
                LJ();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public C1233040iBy(Context context) {
        Activity activityLIZ;
        this.LIZ = context;
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            this.LIZIZ = c1389890mGx;
            c1389890mGx.LJ(Integer.valueOf(R.style.y0));
            c1389890mGx.LIZLLL(2000L);
        }
    }

    public final void LIZ(long j) {
        C1389890mGx c1389890mGx = this.LIZIZ;
        if (c1389890mGx != null) {
            c1389890mGx.LIZLLL(j);
        }
    }

    public final void LIZIZ(int i) {
        String string;
        Resources resources;
        C1389890mGx c1389890mGx = this.LIZIZ;
        if (c1389890mGx != null) {
            c1389890mGx.LJIIIZ(i);
        }
        Context context = this.LIZ;
        if (context != null && (resources = context.getResources()) != null) {
            string = resources.getString(i);
        } else {
            string = null;
        }
        this.LIZJ = string;
    }

    public final void LIZJ(CharSequence charSequence) {
        if (charSequence == null) {
            return;
        }
        C1389890mGx c1389890mGx = this.LIZIZ;
        if (c1389890mGx != null) {
            c1389890mGx.LJIIJ(charSequence);
        }
        this.LIZJ = charSequence.toString();
    }
}
