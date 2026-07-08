package X;

import Y.ARunnableS77S0200000_8;
import Y.AUListenerS258S0100000_8;
import android.animation.ValueAnimator;
import android.app.Activity;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0MPG, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MPG extends ProgressDialogC1397800mTi {
    public final Activity LLIZLLLIL;
    public final BPEAHandler LLJ;
    public final ValueAnimator LLJI;

    @Override // X.ProgressDialogC1397800mTi, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        this.LLJ.removeCallbacksAndMessages(null);
    }

    public C0MPG(C19EG c19eg) {
        super(c19eg);
        this.LLIZLLLIL = c19eg;
        this.LLJ = new BPEAHandler();
        setCancelable(false);
        setIndeterminate(false);
        setMax(100);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 83);
        valueAnimatorOfInt.setDuration(Mp4ScreenVideoLoadTimeout.CONTROL);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS258S0100000_8(this, 0));
        this.LLJI = valueAnimatorOfInt;
    }

    public final void LIZLLL(Function0<Unit> function0) {
        if (this.LLJI.isRunning()) {
            this.LLJI.end();
        }
        setProgress(100);
        C786410Ut5.LJLIIL(70L, this.LLJ, new ARunnableS77S0200000_8(this, function0, 0));
    }
}
