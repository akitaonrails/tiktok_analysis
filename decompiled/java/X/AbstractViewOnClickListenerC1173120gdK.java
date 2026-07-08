package X;

import Y.ARunnableS118S0100000_18;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0gdK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public abstract class AbstractViewOnClickListenerC1173120gdK implements View.OnClickListener {
    public final long LL;
    public boolean LLILLJJLI;
    public final ARunnableS118S0100000_18 LLILLL;

    public abstract void LIZ(View view);

    public AbstractViewOnClickListenerC1173120gdK() {
        this(300L);
    }

    public AbstractViewOnClickListenerC1173120gdK(long j) {
        this.LLILLJJLI = true;
        this.LLILLL = new ARunnableS118S0100000_18(this, 68);
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
