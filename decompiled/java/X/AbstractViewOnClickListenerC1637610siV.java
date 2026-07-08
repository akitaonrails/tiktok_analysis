package X;

import Y.ARunnableS125S0100000_25;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0siV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractViewOnClickListenerC1637610siV implements View.OnClickListener {
    public final long LL;
    public boolean LLILLJJLI;
    public final ARunnableS125S0100000_25 LLILLL;

    public abstract void LIZ(View view);

    public /* synthetic */ AbstractViewOnClickListenerC1637610siV() {
        this(300L);
    }

    public AbstractViewOnClickListenerC1637610siV(long j) {
        this.LLILLJJLI = true;
        this.LLILLL = new ARunnableS125S0100000_25(this, 111);
        this.LL = j;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.LLILLJJLI) {
            this.LLILLJJLI = false;
            HandlerHook.viewPostDelay(view, this.LLILLL, this.LL);
            LIZ(view);
        }
    }
}
