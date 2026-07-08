package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* JADX INFO: renamed from: X.0U4b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C766270U4b {
    public static void LIZLLL(int i) {
        LJFF(i, C497740JfY.LJII());
    }

    public static void LJIIJ(C0U4R c0u4r) {
        int i;
        Context contextLJII = c0u4r.LIZ;
        if (contextLJII == null && (contextLJII = C497740JfY.LJII()) == null) {
            return;
        }
        if (TextUtils.isEmpty(c0u4r.LIZIZ) && (i = c0u4r.LIZLLL) != 0) {
            c0u4r.LIZIZ = contextLJII.getString(i);
        }
        if (!TextUtils.isEmpty(c0u4r.LIZIZ)) {
            LJIIIIZZ(c0u4r.LJ, c0u4r.LIZ, c0u4r.LIZIZ);
            if (c0u4r.LJFF && c0u4r.LJII != null) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("toast_msg_show");
                if (C500260Jjc.LJIIZILJ(c0u4r.LJII)) {
                    c474500IjALIZ.LJJII("anchor", "user_type");
                } else if (C500260Jjc.LJIJI(c0u4r.LJII)) {
                    c474500IjALIZ.LJJII("user", "user_type");
                }
                c474500IjALIZ.LJJII(c0u4r.LIZIZ, "msg_content");
                if (!TextUtils.isEmpty(c0u4r.LIZJ)) {
                    c474500IjALIZ.LJJII(c0u4r.LIZJ, "msg_id");
                }
                Map<String, String> map = c0u4r.LJI;
                if (map != null && !map.isEmpty()) {
                    c474500IjALIZ.LJJIIZI(c0u4r.LJI);
                }
                c474500IjALIZ.LIZ();
            }
        }
    }

    public static void LJIIJJI(String str) {
        LJIIIZ(C497740JfY.LJII(), str);
    }

    public static void LIZ(Fragment fragment, String str) {
        if (fragment != null && !TextUtils.isEmpty(str)) {
            C1389880mGw c1389880mGw = new C1389880mGw(fragment);
            c1389880mGw.LJIIIZ(str);
            c1389880mGw.LIZLLL(Mp4ScreenVideoLoadTimeout.CONTROL);
            c1389880mGw.LJIIJ();
        }
    }

    public static void LIZJ(C19EG c19eg, CharSequence charSequence) {
        C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
        c1389890mGx.LJFF(R.drawable.esb);
        c1389890mGx.LJIIJ(charSequence);
        c1389890mGx.LJIIJJI();
    }

    public static void LJFF(int i, Context context) {
        if (context == null && (context = C497740JfY.LJII()) == null) {
            return;
        }
        LJIIIZ(context, context.getString(i));
    }

    public static void LJI(int i, String str) {
        LJIIIIZZ(0L, C497740JfY.LJII(), str);
    }

    public static void LJII(int i, Object... objArr) {
        Context contextLJII = C497740JfY.LJII();
        if (contextLJII == null && (contextLJII = C497740JfY.LJII()) == null) {
            return;
        }
        LJIIIZ(contextLJII, contextLJII.getString(i, objArr));
    }

    public static void LJIIIZ(Context context, String str) {
        LJIIIIZZ(0L, context, str);
    }

    public static void LJIILIIL(View view, String str) {
        if (view != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(view);
            c1389890mGx.LJFF(R.drawable.eqq);
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LIZLLL(Mp4ScreenVideoLoadTimeout.CONTROL);
            c1389890mGx.LJIIJJI();
        }
    }

    public static void LJIILJJIL(C19EG c19eg, String str) {
        C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
        c1389890mGx.LJFF(R.drawable.eqq);
        c1389890mGx.LJIIJ(str);
        c1389890mGx.LIZLLL(Mp4ScreenVideoLoadTimeout.CONTROL);
        c1389890mGx.LJIIJJI();
    }

    public static final void LIZIZ(Context context, String str, long j) {
        C1389890mGx c1389890mGx;
        if (context == null) {
            context = C497740JfY.LJII();
        }
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null && !TextUtils.isEmpty(str)) {
            if (j > 0) {
                c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIJ(str);
                c1389890mGx.LIZLLL(j);
            } else {
                c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIJ(str);
            }
            c1389890mGx.LJIIJJI();
        }
    }

    public static void LJ(int i, int i2, Context context) {
        if (context == null && (context = C497740JfY.LJII()) == null) {
            return;
        }
        LJIIIIZZ(0L, context, context.getString(i));
    }

    public static void LJIIIIZZ(long j, Context context, String str) {
        boolean z;
        Context contextLJII = context;
        if (contextLJII == null) {
            contextLJII = C497740JfY.LJII();
        }
        if (contextLJII != null && !TextUtils.isEmpty(str)) {
            IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
            if (Build.VERSION.SDK_INT >= 35) {
                z = true;
            } else {
                z = false;
            }
            iHostAction.showLegacyToast(contextLJII, str, j, Boolean.valueOf(z));
        }
    }

    public static void LJIIL(int i, Activity activity, String str) {
        C1389890mGx c1389890mGx = new C1389890mGx(activity);
        c1389890mGx.LJFF(i);
        c1389890mGx.LJIIJ(str);
        c1389890mGx.LJIIJJI();
    }
}
