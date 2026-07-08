package X;

import android.os.CountDownTimer;
import com.ss.android.ugc.aweme.biz.wallet.biz.finish.WalletAccountFinishAssem;
import com.ss.android.ugc.aweme.biz.wallet.biz.result.WalletAccountResultAssem;
import com.ss.android.ugc.aweme.verify.otp.OtpFragment;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0wJ9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class CountDownTimerC1775650wJ9 extends CountDownTimer {
    public final int $t;
    public Object l0;

    public static final void onTick$3(CountDownTimerC1775650wJ9 countDownTimerC1775650wJ9, long j) {
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
            default:
                super.onTick(j);
                break;
        }
    }

    public static final void onFinish$0(CountDownTimerC1775650wJ9 countDownTimerC1775650wJ9) {
        ((WalletAccountResultAssem) countDownTimerC1775650wJ9.l0).Ho();
    }

    public static final void onFinish$1(CountDownTimerC1775650wJ9 countDownTimerC1775650wJ9) {
        OtpFragment otpFragment = (OtpFragment) countDownTimerC1775650wJ9.l0;
        otpFragment.LLJJJJJIL = false;
        otpFragment.LLJJLIIIJLLLLLLLZ = null;
        otpFragment.sS();
    }

    public static final void onFinish$2(CountDownTimerC1775650wJ9 countDownTimerC1775650wJ9) {
        WalletAccountFinishAssem walletAccountFinishAssem = (WalletAccountFinishAssem) countDownTimerC1775650wJ9.l0;
        walletAccountFinishAssem.LLJJIJIL = "next";
        walletAccountFinishAssem.Ho(null, false);
    }

    public static final void onFinish$3(CountDownTimerC1775650wJ9 countDownTimerC1775650wJ9) {
        ((Function0) countDownTimerC1775650wJ9.l0).invoke();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC1775650wJ9(OtpFragment otpFragment, int i) {
        super(60000L, 1000L);
        this.$t = i;
        this.l0 = otpFragment;
    }

    public static final void onTick$0(CountDownTimerC1775650wJ9 countDownTimerC1775650wJ9, long j) {
        WalletAccountResultAssem walletAccountResultAssem = (WalletAccountResultAssem) countDownTimerC1775650wJ9.l0;
        int i = walletAccountResultAssem.LLJILJIL - 1;
        walletAccountResultAssem.LLJILJIL = i;
        walletAccountResultAssem.Go(i);
    }

    public static final void onTick$1(CountDownTimerC1775650wJ9 countDownTimerC1775650wJ9, long j) {
        long j2 = j / 1000;
        OtpFragment otpFragment = (OtpFragment) countDownTimerC1775650wJ9.l0;
        String strLJI = C20642515q3.LJI(2131840404);
        Object[] objArr = new Object[1];
        if (j2 < 0) {
            j2 = 0;
        }
        objArr[0] = Long.valueOf(j2);
        otpFragment.LLJJLIIIJLLLLLLLZ = C786410Ut5.j4(strLJI, Arrays.copyOf(objArr, 1));
        ((OtpFragment) countDownTimerC1775650wJ9.l0).sS();
    }

    public static final void onTick$2(CountDownTimerC1775650wJ9 countDownTimerC1775650wJ9, long j) {
        WalletAccountFinishAssem walletAccountFinishAssem = (WalletAccountFinishAssem) countDownTimerC1775650wJ9.l0;
        int i = walletAccountFinishAssem.LLJJI - 1;
        walletAccountFinishAssem.LLJJI = i;
        walletAccountFinishAssem.Go(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC1775650wJ9(WalletAccountResultAssem walletAccountResultAssem, int i) {
        super(3000L, 1000L);
        this.$t = i;
        this.l0 = walletAccountResultAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC1775650wJ9(WalletAccountFinishAssem walletAccountFinishAssem, long j, int i) {
        super(j, 1000L);
        this.$t = i;
        this.l0 = walletAccountFinishAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC1775650wJ9(long j, long j2, AwS570S0100000_26 awS570S0100000_26, int i) {
        super(j, j2);
        this.$t = i;
        this.l0 = awS570S0100000_26;
    }
}
