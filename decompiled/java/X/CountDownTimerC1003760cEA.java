package X;

import android.os.CountDownTimer;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.component.nativeendlayercomponent.model.CountdownButton;
import com.ss.android.ugc.aweme.component.nativeendlayercomponent.model.NativeEndLayerDataModel;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0cEA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class CountDownTimerC1003760cEA extends CountDownTimer {
    public final /* synthetic */ ViewOnClickListenerC1003740cE8 LIZ;

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.LIZ.LLLILZ = 0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryStartCountdown() onFinish() remainingSeconds = ");
        sbLIZ.append(this.LIZ.LLLILZ);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LIZ.getClass();
        ViewOnClickListenerC1003740cE8 viewOnClickListenerC1003740cE8 = this.LIZ;
        viewOnClickListenerC1003740cE8.LLILLL.LJIJ(new C989550brF(new C1003800cEE()), viewOnClickListenerC1003740cE8);
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        String str;
        CountdownButton countdownButton;
        this.LIZ.LLLILZ = (int) Math.ceil(j / 1000.0d);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryStartCountdown() onTick() millisUntilFinished = ");
        sbLIZ.append(j);
        sbLIZ.append(", remainingSeconds = ");
        sbLIZ.append(this.LIZ.LLLILZ);
        C2188811AlT.LIZIZ(sbLIZ);
        ViewOnClickListenerC1003740cE8 viewOnClickListenerC1003740cE8 = this.LIZ;
        TuxTextView tuxTextView = viewOnClickListenerC1003740cE8.LLJLLIL;
        if (tuxTextView != null) {
            NativeEndLayerDataModel nativeEndLayerDataModelLJJ = viewOnClickListenerC1003740cE8.LJJ();
            if (nativeEndLayerDataModelLJJ == null || (countdownButton = nativeEndLayerDataModelLJJ.countdownButton) == null || (str = countdownButton.text) == null) {
                str = "";
            }
            tuxTextView.setText(u.LJJIFFI(str, "{second}", String.valueOf(this.LIZ.LLLILZ), false));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC1003760cEA(ViewOnClickListenerC1003740cE8 viewOnClickListenerC1003740cE8, long j) {
        super(j, 1000L);
        this.LIZ = viewOnClickListenerC1003740cE8;
    }
}
