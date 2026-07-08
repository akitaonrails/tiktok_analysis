package X;

import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0b93, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C962150b93 extends C0J8P<C960490b6N, C962170b95> {
    public CountDownTimer LIZIZ;

    public static String LJIIIIZZ(long j) {
        if (j < 10) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(CardStruct.IStatusCode.DEFAULT);
            sbLIZ.append(j);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return String.valueOf(j);
    }

    @Override // X.C0J8P
    public final void LJI(RecyclerView.ViewHolder viewHolder) {
        CountDownTimer countDownTimer = this.LIZIZ;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    @Override // X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, C960490b6N c960490b6N) {
        final C962170b95 c962170b95 = (C962170b95) viewHolder;
        C960490b6N c960490b6N2 = c960490b6N;
        long j = c960490b6N2.LIZ;
        CountDownTimer countDownTimer = this.LIZIZ;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        final long j2 = j * 1000;
        this.LIZIZ = new CountDownTimer(j2) { // from class: X.0b94
            @Override // android.os.CountDownTimer
            public final void onFinish() {
                ((TextView) c962170b95.LLILLJJLI.getValue()).setText("00");
                ((TextView) c962170b95.LLILLL.getValue()).setText("00");
                ((TextView) c962170b95.LLILZ.getValue()).setText("00");
            }

            @Override // android.os.CountDownTimer
            public final void onTick(long j3) {
                long j4 = j3 / 1000;
                long j5 = j4 / 3600;
                long j6 = j4 - (3600 * j5);
                long j7 = j6 / 60;
                TextView textView = (TextView) c962170b95.LLILLJJLI.getValue();
                this.getClass();
                textView.setText(C962150b93.LJIIIIZZ(j5));
                TextView textView2 = (TextView) c962170b95.LLILLL.getValue();
                this.getClass();
                textView2.setText(C962150b93.LJIIIIZZ(j7));
                TextView textView3 = (TextView) c962170b95.LLILZ.getValue();
                this.getClass();
                textView3.setText(C962150b93.LJIIIIZZ(j6 - (60 * j7)));
            }
        }.start();
        ((TextView) c962170b95.LL.getValue()).setText(c960490b6N2.LIZIZ);
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C962170b95(C786410Ut5.Td(layoutInflater, R.layout.gs3, viewGroup, false));
    }
}
