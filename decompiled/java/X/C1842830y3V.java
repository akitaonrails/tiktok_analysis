package X;

import Y.AUListenerS230S0200000_27;
import android.animation.ValueAnimator;
import androidx.cardview.widget.CardView;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0y3V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1842830y3V extends C1843210y47 {
    public long LJJJZ;
    public long LJJL;
    public int LJJLI;
    public int LJJLIIIIJ;

    @Override // X.C1843210y47
    public final void LJIJI(C1842470y2v c1842470y2v) {
        RankTypeV2 rankTypeV2;
        int i;
        int i2;
        C1810410xDD c1810410xDD = c1842470y2v.LJIIIIZZ;
        if (c1810410xDD == null || (rankTypeV2 = c1810410xDD.LIZIZ) == null) {
            rankTypeV2 = c1842470y2v.LIZ.LIZIZ;
        }
        int i3 = rankTypeV2.type;
        C1078930eBP c1078930eBPLIZ = C1078940eBQ.LIZ(i3, this.LIZIZ.LIZ.LIZ, c1842470y2v.LJIIIZ);
        if (c1078930eBPLIZ != null) {
            i = c1078930eBPLIZ.LJFF;
        } else {
            i = 0;
        }
        this.LJJJZ = ((long) i) * 1000;
        C1078930eBP c1078930eBPLIZ2 = C1078940eBQ.LIZ(i3, this.LIZIZ.LIZ.LIZ, c1842470y2v.LJIIIZ);
        if (c1078930eBPLIZ2 != null) {
            i2 = c1078930eBPLIZ2.LIZLLL;
        } else {
            i2 = 5;
        }
        long j = ((long) i2) * 1000;
        this.LJJL = j;
        this.LJJIIZ = j - 500;
        this.LJJIIZI = j;
        this.LJJIJ = 500 + j;
        this.LJJIJIIJI = j;
        AbstractC1842530y31.LJIIL(this, this.LJIILL, c1842470y2v, true, false, 8);
        this.LJIILLIIL.setText(LJJIIZ(c1842470y2v.LJIIIZ, this.LJJJZ));
    }

    @Override // X.C1843210y47
    public final void LJIJJ(C1842470y2v c1842470y2v) {
        this.LJJJJLL = this.LIZJ.getWidth();
        this.LJIIIIZZ.setText(LJJIIZ(c1842470y2v.LJIIIZ, this.LJJJZ));
        AbstractC1842530y31.LJIIJ(this.LJFF);
        this.LJJLI = this.LJFF.getMeasuredWidth();
        this.LJIIIIZZ.setText(LJJIIZ(c1842470y2v.LJIIIZ, this.LJJJZ - this.LJJL));
        AbstractC1842530y31.LJIIJ(this.LJFF);
        this.LJJLIIIIJ = this.LJFF.getMeasuredWidth();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.LJJJJLL, this.LJJLI);
        valueAnimatorOfInt.setInterpolator(C0GY9.LIZIZ(0.66f, 0.0f, 0.34f, 1.0f));
        valueAnimatorOfInt.setStartDelay(0L);
        valueAnimatorOfInt.setDuration(750L);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS230S0200000_27(this, valueAnimatorOfInt, 0));
        valueAnimatorOfInt.addListener(new C1864940ydA(this, 2));
        this.LJJJJL = valueAnimatorOfInt;
        valueAnimatorOfInt.start();
    }

    @Override // X.C1843210y47
    public final void LJJIFFI(final C1842470y2v c1842470y2v) {
        CountDownTimerC1811820xFU countDownTimerC1811820xFU = new CountDownTimerC1811820xFU(this.LJJL);
        countDownTimerC1811820xFU.LIZ = new InterfaceC1811830xFV() { // from class: X.0y3W
            @Override // X.InterfaceC1811830xFV
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC1811830xFV
            public final void LJJI(long j) {
                C1842830y3V c1842830y3V = this.LIZ;
                long j2 = c1842830y3V.LJJL - j;
                if (j2 < 500) {
                    return;
                }
                c1842830y3V.LJIILLIIL.setText(C1842830y3V.LJJIIZ(c1842470y2v.LJIIIZ, c1842830y3V.LJJJZ - j2));
            }
        };
        countDownTimerC1811820xFU.start();
    }

    @Override // X.C1843210y47
    public final void LJJIII(C1842470y2v c1842470y2v) {
        long j;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.LJJLIIIIJ, this.LJJJJLL);
        valueAnimatorOfInt.setInterpolator(C0GY9.LIZIZ(0.66f, 0.0f, 0.34f, 1.0f));
        if (this.LJJII) {
            j = 250;
        } else {
            j = this.LJJIJIIJI;
        }
        valueAnimatorOfInt.setStartDelay(j);
        valueAnimatorOfInt.setDuration(750L);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS230S0200000_27(this, valueAnimatorOfInt, 1));
        valueAnimatorOfInt.addListener(new C1864940ydA(this, 3));
        this.LJJJJLI = valueAnimatorOfInt;
        valueAnimatorOfInt.start();
    }

    public C1842830y3V(CardView cardView, C1842430y2r c1842430y2r) {
        super(cardView, c1842430y2r);
    }

    public static String LJJIIZ(int i, long j) {
        if (i == EnumC1083210eIJ.RANKING_MIDDAY_SPRINT_START.getType()) {
            return C497740JfY.LJIJI(2131851982);
        }
        if (i == EnumC1083210eIJ.RANKING_MIDDAY_SPRINT_COUNTDOWN.getType()) {
            long j2 = j / 1000;
            if (j2 >= 86400) {
                long j3 = (j + 499) / 1000;
                long j4 = 86400;
                long j5 = j3 / j4;
                long j6 = j3 % j4;
                long j7 = 3600;
                return C497740JfY.LJIJJ(2131851981, C497740JfY.LJIJJ(2131841281, Long.valueOf(j5), Long.valueOf(j6 / j7), Long.valueOf((j6 % j7) / ((long) 60))));
            }
            if (j2 >= 3600) {
                long j8 = (j + 499) / 1000;
                long j9 = 3600;
                long j10 = j8 / j9;
                long j11 = j8 % j9;
                long j12 = 60;
                return C497740JfY.LJIJJ(2131851981, C497740JfY.LJIJJ(2131841282, Long.valueOf(j10), Long.valueOf(j11 / j12), Long.valueOf(j11 % j12)));
            }
            long j13 = ((j + 499) / 1000) % ((long) 3600);
            long j14 = 60;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(j13 / j14);
            sbLIZ.append("m ");
            sbLIZ.append(j13 % j14);
            sbLIZ.append('s');
            return C497740JfY.LJIJJ(2131851981, C2188811AlT.LIZIZ(sbLIZ));
        }
        long j15 = j / 1000;
        if (j15 >= 86400) {
            C1124870fNV.LIZJ().getClass();
            String strLIZIZ = C1124870fNV.LIZIZ("pm_mt_Weekly_refresh");
            if (strLIZIZ == null) {
                strLIZIZ = C497740JfY.LJIJI(2131840776);
            }
            long j16 = (j + 499) / 1000;
            long j17 = 86400;
            long j18 = j16 / j17;
            long j19 = j16 % j17;
            long j20 = 3600;
            return C786410Ut5.j4(strLIZIZ, Arrays.copyOf(new Object[]{Long.valueOf(j18), Long.valueOf(j19 / j20), Long.valueOf((j19 % j20) / ((long) 60))}, 3));
        }
        if (j15 >= 3600) {
            long j21 = (j + 499) / 1000;
            long j22 = 3600;
            long j23 = j21 / j22;
            long j24 = j21 % j22;
            long j25 = 60;
            return C497740JfY.LJIJJ(2131841321, C497740JfY.LJIJI(2131842649), C497740JfY.LJIJJ(2131841282, Long.valueOf(j23), Long.valueOf(j24 / j25), Long.valueOf(j24 % j25)));
        }
        C1124870fNV.LIZJ().getClass();
        String strLIZIZ2 = C1124870fNV.LIZIZ("pm_mt_hourly_refresh");
        if (strLIZIZ2 == null) {
            strLIZIZ2 = C497740JfY.LJIJI(2131842176);
        }
        long j26 = ((j + 499) / 1000) % ((long) 3600);
        long j28 = 60;
        return C786410Ut5.j4(strLIZIZ2, Arrays.copyOf(new Object[]{Long.valueOf(j26 / j28), Long.valueOf(j26 % j28)}, 2));
    }
}
