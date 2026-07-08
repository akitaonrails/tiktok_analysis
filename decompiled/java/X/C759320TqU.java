package X;

import android.animation.ValueAnimator;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0TqU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C759320TqU extends AbstractC759330TqV {
    public final boolean LL;
    public final LifecycleOwner LLILLJJLI;
    public final TextView LLILLL;
    public final C1110070ezd LLILZ;
    public final C0KVZ LLILZIL;
    public final C0KVZ LLILZLL;
    public final C421320Gfa LLIZ;
    public final C20744116Fj LLIZLLLIL;
    public ValueAnimator LLJ;
    public final BPEAHandler LLJI;
    public final C785820Us8 LLJIJIL;

    @Override // X.AbstractC759330TqV
    public final void I5() {
        if (this.LLJ != null) {
            this.itemView.setBackgroundColor(0);
            ValueAnimator valueAnimator = this.LLJ;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
            }
            ValueAnimator valueAnimator2 = this.LLJ;
            if (valueAnimator2 != null) {
                valueAnimator2.removeAllUpdateListeners();
            }
            ValueAnimator valueAnimator3 = this.LLJ;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
            this.LLJI.removeCallbacksAndMessages(null);
        }
    }

    public C759320TqU(View view, LifecycleOwner lifecycleOwner, boolean z) {
        super(view);
        this.LL = z;
        this.LLILLJJLI = lifecycleOwner;
        view.findViewById(R.id.p0d);
        this.LLILLL = (TextView) view.findViewById(R.id.p09);
        this.LLILZ = (C1110070ezd) view.findViewById(R.id.eu1);
        this.LLILZIL = (C0KVZ) view.findViewById(R.id.bqd);
        this.LLILZLL = (C0KVZ) view.findViewById(R.id.bqh);
        this.LLIZ = (C421320Gfa) view.findViewById(R.id.o95);
        this.LLIZLLLIL = (C20744116Fj) view.findViewById(R.id.cok);
        this.LLJI = new BPEAHandler(Looper.getMainLooper());
        this.LLJIJIL = new C785820Us8(Integer.TYPE, 0);
    }
}
