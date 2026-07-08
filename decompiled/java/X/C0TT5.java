package X;

import android.app.Activity;
import android.content.Intent;
import android.os.SystemClock;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.ss.android.ugc.aweme.account.login.authorize.AuthorizeNewActivity;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0TT5, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TT5 {
    public static final C0TT5 LIZ = new C0TT5();

    public static final Class<?> LIZ() {
        return ((ArrayList) C304770Bx5.LIZIZ.getValue()).isEmpty() ^ true ? AuthorizeNewActivity.class : AuthorizeActivity.class;
    }

    public static final void LIZIZ(final Activity activity, final Intent intent, String str) {
        C0CQH.LIZ.getClass();
        C0CQH.LIZIZ.put("authorize", Long.valueOf(SystemClock.elapsedRealtime()));
        if (((ArrayList) C304770Bx5.LIZIZ.getValue()).contains(str) && (activity instanceof BaseActivity)) {
            C2204931BRj c2204931BRj = new C2204931BRj();
            activity.getWindow().setFlags(16, 16);
            c2204931BRj.LJIIJJI(new InterfaceC19305410fs() { // from class: X.0TT4
                public boolean LL;

                @Override // X.InterfaceC19305410fs
                public final boolean LJLJI() {
                    return activity.isFinishing() || activity.isDestroyed() || this.LL;
                }

                @Override // X.InterfaceC19305410fs
                public final int LLLLLJIL() {
                    return activity.getTaskId();
                }

                @Override // X.InterfaceC19305410fs
                public final C19EG getFragmentActivity() {
                    return (C19EG) activity;
                }

                @Override // X.InterfaceC19305410fs
                public final Intent getParameter() {
                    return intent;
                }

                @Override // X.InterfaceC19305410fs
                public final void LLILII(Intent intent2, Integer num) {
                    this.LL = true;
                    activity.getWindow().clearFlags(16);
                }
            });
        } else {
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Activity_startActivityForResult_2");
            C1701330uNH.LIZ(intent, activity);
            C2204961BRm.LJIIZILJ(1001, activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owskw7ZzjpAkGL23W6ZUpSsOMbBq/TuSENdRhpJwjoadQ5/D", null));
        }
    }
}
