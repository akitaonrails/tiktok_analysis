package X;

import android.os.Message;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.TopViewSkipButton;

/* JADX INFO: renamed from: X.0e8d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1077210e8d extends C0W9W {
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

    public static final void run$0(C1077210e8d c1077210e8d) {
        C1C7U.LIZ("TopViewSkipButton@ed4c.startCountDown$1");
        boolean zLJ = C0W9U.LJ(c1077210e8d.bpeaTraceContext);
        try {
            Message messageObtainMessage = ((TopViewSkipButton) c1077210e8d.l0).LLILZLL.obtainMessage();
            messageObtainMessage.what = 1;
            ((TopViewSkipButton) c1077210e8d.l0).LLILZLL.sendMessage(messageObtainMessage);
        } finally {
        }
        if (zLJ) {
            C0W9U.LJFF();
        }
        C1C7U.LIZIZ("TopViewSkipButton@ed4c.startCountDown$1");
    }

    public static final void run$1(C1077210e8d c1077210e8d) {
        C1C7U.LIZ("BDASplashView2@ed0a.startCountDownTimer$1");
        boolean zLJ = C0W9U.LJ(c1077210e8d.bpeaTraceContext);
        try {
            Message messageObtainMessage = ((C2212931BjH) c1077210e8d.l0).LLJLL.obtainMessage();
            messageObtainMessage.what = 2;
            ((C2212931BjH) c1077210e8d.l0).LLJLL.sendMessage(messageObtainMessage);
        } finally {
        }
        if (zLJ) {
            C0W9U.LJFF();
        }
        C1C7U.LIZIZ("BDASplashView2@ed0a.startCountDownTimer$1");
    }

    public C1077210e8d(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
