package X;

import android.os.CountDownTimer;
import com.ss.android.ugc.aweme.choosemusic.utils.ChooseMusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS92S0210000_9;

/* JADX INFO: renamed from: X.16Gv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class CountDownTimerC20747916Gv extends CountDownTimer {
    public final int $t;
    public Object l0;

    public static final void onFinish$4(CountDownTimerC20747916Gv countDownTimerC20747916Gv) {
    }

    public static final void onTick$0(CountDownTimerC20747916Gv countDownTimerC20747916Gv, long j) {
    }

    public static final void onTick$3(CountDownTimerC20747916Gv countDownTimerC20747916Gv, long j) {
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
            case 3:
                onFinish$3(this);
                break;
            case 4:
                onFinish$4(this);
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
            case 3:
                onTick$3(this, j);
                break;
            case 4:
                onTick$4(this, j);
                break;
            default:
                super.onTick(j);
                break;
        }
    }

    public static final void onFinish$0(CountDownTimerC20747916Gv countDownTimerC20747916Gv) {
        ((ChooseMusicDownloadPlayHelper) countDownTimerC20747916Gv.l0).LLILZ.pause();
        C15JP c15jp = ((ChooseMusicDownloadPlayHelper) countDownTimerC20747916Gv.l0).LLJJLIIIJLLLLLLLZ;
        if (c15jp != null) {
            c15jp.LIZIZ();
        }
    }

    public static final void onFinish$1(CountDownTimerC20747916Gv countDownTimerC20747916Gv) {
        ((C0N0Y) countDownTimerC20747916Gv.l0).LJJLIL(1.0f, 1.0f);
    }

    public static final void onFinish$2(CountDownTimerC20747916Gv countDownTimerC20747916Gv) {
        InterfaceC20665015tg interfaceC20665015tg = ((C20664415ta) countDownTimerC20747916Gv.l0).LLILZ;
        if (interfaceC20665015tg != null) {
            interfaceC20665015tg.LJIJI(null, false);
        }
    }

    public static final void onFinish$3(CountDownTimerC20747916Gv countDownTimerC20747916Gv) {
        ((C20730716Af) countDownTimerC20747916Gv.l0).LLJILJILJ = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC20747916Gv(AwS92S0210000_9 awS92S0210000_9, int i) {
        super(Long.MAX_VALUE, 60L);
        this.$t = i;
        this.l0 = awS92S0210000_9;
    }

    public static final void onTick$1(CountDownTimerC20747916Gv countDownTimerC20747916Gv, long j) {
        float f = 1.0f - ((j * 1.0f) / 2000);
        ((C0N0Y) countDownTimerC20747916Gv.l0).LJJLIL(f, f);
    }

    public static final void onTick$2(CountDownTimerC20747916Gv countDownTimerC20747916Gv, long j) {
        C20664415ta c20664415ta;
        C20730716Af c20730716Af;
        if (((Boolean) C20731216Ak.LIZLLL.getValue()).booleanValue() && (c20730716Af = (c20664415ta = (C20664415ta) countDownTimerC20747916Gv.l0).LL) != null && c20730716Af.LLIZLLLIL) {
            c20664415ta.LIZJ();
        }
    }

    public static final void onTick$4(CountDownTimerC20747916Gv countDownTimerC20747916Gv, long j) {
        ((Function0) countDownTimerC20747916Gv.l0).invoke();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC20747916Gv(C0N0Y c0n0y, int i) {
        super(2000L, 40L);
        this.$t = i;
        this.l0 = c0n0y;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC20747916Gv(C20664415ta c20664415ta, int i) {
        super(Mp4ScreenVideoLoadTimeout.CONTROL, 50L);
        this.$t = i;
        this.l0 = c20664415ta;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC20747916Gv(ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper, long j, int i) {
        super(j, 1000L);
        this.$t = i;
        this.l0 = chooseMusicDownloadPlayHelper;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC20747916Gv(C20730716Af c20730716Af, long j, long j2, int i) {
        super(j, j2);
        this.$t = i;
        this.l0 = c20730716Af;
    }
}
