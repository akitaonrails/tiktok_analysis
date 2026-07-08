package X;

import android.os.CountDownTimer;
import com.ss.android.ugc.aweme.search.player.core.viewmodel.MusicPlayHelper;
import com.ss.android.ugc.gamora.editor.sticker.read.instantvop.InstantCloneFinishFragment;
import com.ss.android.ugc.gamora.editor.sticker.read.instantvop.InstantCloneRecordFragment;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS75S0100100_29;

/* JADX INFO: renamed from: X.12Xs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class CountDownTimerC19772612Xs extends CountDownTimer {
    public final int $t;
    public Object l0;

    public static final void onTick$0(CountDownTimerC19772612Xs countDownTimerC19772612Xs, long j) {
    }

    public static final void onTick$2(CountDownTimerC19772612Xs countDownTimerC19772612Xs, long j) {
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

    public static final void onFinish$0(CountDownTimerC19772612Xs countDownTimerC19772612Xs) {
        C01TT.LIZLLL(new AwS573S0100000_29((InstantCloneFinishFragment) countDownTimerC19772612Xs.l0, 674));
    }

    public static final void onFinish$1(CountDownTimerC19772612Xs countDownTimerC19772612Xs) {
        C01TT.LIZLLL(new AwS573S0100000_29((InstantCloneRecordFragment) countDownTimerC19772612Xs.l0, 957));
    }

    public static final void onFinish$2(CountDownTimerC19772612Xs countDownTimerC19772612Xs) {
        ((MusicPlayHelper) countDownTimerC19772612Xs.l0).BQ2(null, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC19772612Xs(InstantCloneFinishFragment instantCloneFinishFragment, int i) {
        super(10000L, 1000L);
        this.$t = i;
        this.l0 = instantCloneFinishFragment;
    }

    public static final void onTick$1(CountDownTimerC19772612Xs countDownTimerC19772612Xs, long j) {
        C01TT.LIZLLL(new AwS75S0100100_29(j, (InstantCloneRecordFragment) countDownTimerC19772612Xs.l0, 3));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC19772612Xs(InstantCloneRecordFragment instantCloneRecordFragment, int i) {
        super(30000L, 1000L);
        this.$t = i;
        this.l0 = instantCloneRecordFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC19772612Xs(long j, MusicPlayHelper musicPlayHelper, int i) {
        super(j, 1000L);
        this.$t = i;
        this.l0 = musicPlayHelper;
    }
}
