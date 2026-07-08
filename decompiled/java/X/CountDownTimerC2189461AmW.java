package X;

import android.os.CountDownTimer;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.broadcast.interaction.widget.TryModeGoLiveWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.game.moment.PreviewGameMomentWidget;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.1AmW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class CountDownTimerC2189461AmW extends CountDownTimer {
    public final int $t;
    public Object l0;

    public static final void onTick$1(CountDownTimerC2189461AmW countDownTimerC2189461AmW, long j) {
    }

    public static final void onTick$2(CountDownTimerC2189461AmW countDownTimerC2189461AmW, long j) {
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        switch (this.$t) {
            case 0:
                onFinish$0(this);
                break;
            case 1:
                onFinish$1(this);
                break;
            case 2:
                onFinish$2(this);
                break;
            default:
                super.onFinish();
                break;
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        switch (this.$t) {
            case 0:
                onTick$0(this, j);
                break;
            case 1:
                onTick$1(this, j);
                break;
            case 2:
                onTick$2(this, j);
                break;
            default:
                super.onTick(j);
                break;
        }
    }

    public static final void onFinish$0(CountDownTimerC2189461AmW countDownTimerC2189461AmW) {
        TryModeGoLiveWidget tryModeGoLiveWidget = (TryModeGoLiveWidget) countDownTimerC2189461AmW.l0;
        tryModeGoLiveWidget.LLJ = true;
        tryModeGoLiveWidget.A1();
    }

    public static final void onFinish$1(CountDownTimerC2189461AmW countDownTimerC2189461AmW) {
        PreviewGameMomentWidget previewGameMomentWidget = (PreviewGameMomentWidget) countDownTimerC2189461AmW.l0;
        previewGameMomentWidget.LLJJIJIL = true;
        if (previewGameMomentWidget.isShowing()) {
            ((PreviewGameMomentWidget) countDownTimerC2189461AmW.l0).P1("show");
        }
    }

    public static final void onFinish$2(CountDownTimerC2189461AmW countDownTimerC2189461AmW) {
        PreviewGameMomentWidget previewGameMomentWidget = (PreviewGameMomentWidget) countDownTimerC2189461AmW.l0;
        previewGameMomentWidget.LLJJIJIL = true;
        if (previewGameMomentWidget.isShowing()) {
            ((PreviewGameMomentWidget) countDownTimerC2189461AmW.l0).O1("show", true);
        } else {
            ((PreviewGameMomentWidget) countDownTimerC2189461AmW.l0).O1("show", false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC2189461AmW(TryModeGoLiveWidget tryModeGoLiveWidget, int i) {
        super(5500L, 1000L);
        this.$t = i;
        this.l0 = tryModeGoLiveWidget;
    }

    public static final void onTick$0(CountDownTimerC2189461AmW countDownTimerC2189461AmW, long j) {
        int i = ((int) j) / LSPassThroughRecordSizeConfig.DEFAULT;
        LiveDialog liveDialog = ((TryModeGoLiveWidget) countDownTimerC2189461AmW.l0).LLILLJJLI;
        if (liveDialog != null) {
            liveDialog.LJLLILLLL(C497740JfY.LJIJJ(2131855361, Integer.valueOf(i)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC2189461AmW(PreviewGameMomentWidget previewGameMomentWidget, int i) {
        super(2000L, 1000L);
        this.$t = i;
        this.l0 = previewGameMomentWidget;
    }
}
