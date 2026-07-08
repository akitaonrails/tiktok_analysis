package X;

import android.os.CountDownTimer;
import android.view.View;
import com.bytedance.android.livesdk.model.Gift;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.u;

/* JADX INFO: renamed from: X.01A9, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01A9 extends AbstractC1126560fQE {
    public final View LLLILZ;
    public final C01AG LLLILZJ;
    public final String LLLILZLLLI;
    public final C16F5 LLLIZZ;
    public final C16F5 LLLJ;
    public CountDownTimer LLLJIL;

    @Override // X.AbstractC1126560fQE
    public final void e6() {
        CountDownTimer countDownTimer = this.LLLJIL;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.LLLJIL = null;
        this.LLLJ.setText("");
        C786410Ut5.LLJJJJ(this.LLLJ, 8);
    }

    @Override // X.AbstractC1126560fQE
    public final String R5() {
        return this.LLLILZLLLI;
    }

    public C01A9(View view, C01AG c01ag) {
        super(view);
        this.LLLILZ = view;
        this.LLLILZJ = c01ag;
        this.LLLILZLLLI = "ExpandableSectionHeaderViewHolder";
        this.LLLIZZ = (C16F5) view.findViewById(R.id.ypz);
        this.LLLJ = (C16F5) view.findViewById(R.id.ypy);
    }

    public final void C6(final long j, final Function0 function0, final Function1 function1) {
        CountDownTimer countDownTimer = this.LLLJIL;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.LLLJ.setText((CharSequence) function1.invoke(Long.valueOf(j)));
        this.LLLJIL = new CountDownTimer(j) { // from class: X.01AA
            @Override // android.os.CountDownTimer
            public final void onFinish() {
                this.LLLJ.setText(function0.invoke());
            }

            @Override // android.os.CountDownTimer
            public final void onTick(long j2) {
                this.LLLJ.setText(function1.invoke(Long.valueOf(j2)));
            }
        }.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    @Override // X.AbstractC1126560fQE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N5(X.AbstractC1126600fQI<? extends X.AnonymousClass0054> r15, com.bytedance.ies.sdk.datachannel.DataChannel r16, int r17) {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01A9.N5(X.0fQI, com.bytedance.ies.sdk.datachannel.DataChannel, int):void");
    }

    public final void z6(CharSequence charSequence, Gift.GiftSeriesInfo giftSeriesInfo, int i) {
        String str;
        String strLJJIFFI;
        if (giftSeriesInfo == null || (str = giftSeriesInfo.seriesName) == null || str.length() <= 0) {
            str = null;
        }
        C16F5 c16f5 = this.LLLIZZ;
        if (str != null && (strLJJIFFI = u.LJJIFFI(str, "{s_num}", String.valueOf(i), false)) != null) {
            charSequence = strLJJIFFI;
        }
        c16f5.setText(charSequence);
    }
}
