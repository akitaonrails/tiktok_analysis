package X;

import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: renamed from: X.0b9o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C962620b9o extends C0J8P<C961180b7U, C962730b9z> {
    public final InterfaceC962690b9v LIZIZ;
    public CountDownTimer LIZJ;

    public C962620b9o(InterfaceC962690b9v interfaceC962690b9v) {
        this.LIZIZ = interfaceC962690b9v;
    }

    @Override // X.C0J8P
    public final void LJI(RecyclerView.ViewHolder viewHolder) {
        CountDownTimer countDownTimer = this.LIZJ;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    public static void LJIIIIZZ(C16F5 c16f5, C961180b7U c961180b7U) {
        String strLJI;
        long j = c961180b7U.LJFF;
        long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
        SimpleDateFormat simpleDateFormat = C963140bAe.LIZJ;
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        String str = simpleDateFormat.format(new Date(j * j2));
        if (C963140bAe.LIZLLL(c961180b7U.LJI * j2, c961180b7U.LJFF * j2)) {
            strLJI = C963140bAe.LJI(c961180b7U.LJI * j2);
        } else {
            long j3 = c961180b7U.LJI * j2;
            simpleDateFormat.setTimeZone(TimeZone.getDefault());
            strLJI = simpleDateFormat.format(new Date(j3));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" - ");
        sbLIZ.append(strLJI);
        c16f5.setText(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, C961180b7U c961180b7U) {
        C962730b9z c962730b9z = (C962730b9z) viewHolder;
        C961180b7U c961180b7U2 = c961180b7U;
        if (C158B.LIZJ() < c961180b7U2.LJFF) {
            if (!c961180b7U2.LIZ) {
                c961180b7U2.LIZ = true;
                C955400ayA.LIZ.LJLILLLLZI(EnumC962630b9p.ROUND2_PRE.getValue());
            }
            LJIIIIZZ((C16F5) c962730b9z.LL.getValue(), c961180b7U2);
            long jLIZJ = c961180b7U2.LJFF - C158B.LIZJ();
            CountDownTimer countDownTimer = this.LIZJ;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            final long j = jLIZJ * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            this.LIZJ = new CountDownTimer(j) { // from class: X.0b9u
                @Override // android.os.CountDownTimer
                public final void onTick(long j2) {
                }

                @Override // android.os.CountDownTimer
                public final void onFinish() {
                    this.LIZ.LIZIZ.RQ();
                }
            }.start();
        } else if (C158B.LIZJ() > c961180b7U2.LJI) {
            LJIIIIZZ((C16F5) c962730b9z.LL.getValue(), c961180b7U2);
            if (!c961180b7U2.LIZ) {
                c961180b7U2.LIZ = true;
                C955400ayA.LIZ.LJLILLLLZI(EnumC962630b9p.ROUND2_END.getValue());
            }
        }
        C1143680frq.LJI((View) c962730b9z.LLILLL.getValue(), C1143780fs0.LJIIJ("tiktok_live_interaction_normal_1", "ttlive_cohost_eoy_banner_round2_warmup.png"), null, true);
        C960940b76.LIZIZ(c962730b9z, c961180b7U2);
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C962730b9z(C786410Ut5.Td(layoutInflater, R.layout.gr_, viewGroup, false));
    }
}
