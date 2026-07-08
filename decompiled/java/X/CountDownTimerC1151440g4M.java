package X;

import android.os.CountDownTimer;
import androidx.lifecycle.LiveData;
import com.bytedance.android.livesdk.impl.revenue.starcomment.paymentdialog.StarCommentPaymentDialog;
import com.bytedance.android.livesdk.interaction.poll.selectpoll.SelectPollViewModel;
import com.bytedance.android.livesdk.livegoal.LiveGoalPinCardWidget;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0g4M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class CountDownTimerC1151440g4M extends CountDownTimer {
    public final int $t;
    public Object l0;

    public static final void onFinish$0(CountDownTimerC1151440g4M countDownTimerC1151440g4M) {
    }

    public static final void onTick$2(CountDownTimerC1151440g4M countDownTimerC1151440g4M, long j) {
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        switch (this.$t) {
            case 0:
                onFinish$0(this);
                break;
            case 1:
                C1086830eO9.LIZLLL = false;
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

    public static final void onFinish$2(CountDownTimerC1151440g4M countDownTimerC1151440g4M) {
        ((LiveGoalPinCardWidget) countDownTimerC1151440g4M.l0).z1(EnumC1108010ewJ.AUTO);
    }

    public static final void onTick$0(CountDownTimerC1151440g4M countDownTimerC1151440g4M, long j) {
        long j2 = j / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        for (C1116450f9v c1116450f9v : ((StarCommentPaymentDialog) countDownTimerC1151440g4M.l0).LLJ) {
            if (c1116450f9v.LIZLLL) {
                c1116450f9v.LIZJ = j2;
            }
        }
        StarCommentPaymentDialog starCommentPaymentDialog = (StarCommentPaymentDialog) countDownTimerC1151440g4M.l0;
        C1116500fA0 c1116500fA0 = starCommentPaymentDialog.LLJIJIL;
        if (c1116500fA0 != null) {
            c1116500fA0.LLLFZ(starCommentPaymentDialog.LLJ);
        }
    }

    public static final void onTick$1(CountDownTimerC1151440g4M countDownTimerC1151440g4M, long j) {
        SelectPollViewModel selectPollViewModel = (SelectPollViewModel) countDownTimerC1151440g4M.l0;
        if (selectPollViewModel.LLILLJJLI == EnumC1086920eOI.GIFT) {
            C1086830eO9.LIZLLL = true;
        }
        ((LiveData) selectPollViewModel.LLIZLLLIL.getValue()).postValue(Long.valueOf(j));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC1151440g4M(long j, Object obj, int i) {
        super(j, 1000L);
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC1151440g4M(long j, LiveGoalPinCardWidget liveGoalPinCardWidget, int i) {
        super(j, j);
        this.$t = i;
        this.l0 = liveGoalPinCardWidget;
    }
}
