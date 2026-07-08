package X;

import Y.ARunnableS131S0100000_31;
import android.app.Activity;
import android.os.Bundle;
import android.os.Process;
import com.ss.android.ugc.aweme.account.login.passkey.BasePasskeySetUpFragment;
import com.ss.android.ugc.aweme.minis.page.main.fragment.MiniDramaFragment;

/* JADX INFO: renamed from: X.16H2, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16H2 extends C0W9W {
    public final int $t;
    public Object l0;

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            default:
                super.run();
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(C16H2 c16h2) {
        C1C7U.LIZ("BasePasskeySetUpFragment@e4be.startPasskeyRegistration$1$1$onSuccess$1");
        boolean zLJ = C0W9U.LJ(c16h2.bpeaTraceContext);
        try {
            C19EG activity = ((BasePasskeySetUpFragment) c16h2.l0).getActivity();
            if (activity != null) {
                activity.finishAffinity();
            }
            Process.killProcess(Process.myPid());
            ((BasePasskeySetUpFragment) c16h2.l0).WR(new Bundle());
        } finally {
        }
        if (zLJ) {
            C0W9U.LJFF();
        }
        C1C7U.LIZIZ("BasePasskeySetUpFragment@e4be.startPasskeyRegistration$1$1$onSuccess$1");
    }

    public static final void run$1(C16H2 c16h2) {
        C1C7U.LIZ("MiniDramaFragment@ea5a.startDevInfoRefreshTimer$1");
        boolean zLJ = C0W9U.LJ(c16h2.bpeaTraceContext);
        try {
            Activity activityHS = ((MiniDramaFragment) c16h2.l0).hS();
            if (activityHS != null) {
                activityHS.runOnUiThread(new ARunnableS131S0100000_31((MiniDramaFragment) c16h2.l0, 209));
            }
        } finally {
        }
        if (zLJ) {
            C0W9U.LJFF();
        }
        C1C7U.LIZIZ("MiniDramaFragment@ea5a.startDevInfoRefreshTimer$1");
    }

    public C16H2(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
