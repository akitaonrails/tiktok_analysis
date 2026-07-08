package X;

import Y.ARunnableS118S0100000_18;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0gRM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public abstract class AbstractViewOnClickListenerC1165700gRM implements View.OnClickListener {
    public final long LL;
    public boolean LLILLJJLI = true;
    public final ARunnableS118S0100000_18 LLILLL = new ARunnableS118S0100000_18(this, 1);

    public abstract void LIZ(View view);

    public AbstractViewOnClickListenerC1165700gRM(long j) {
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
