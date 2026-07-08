package X;

import Y.ARunnableS119S0100000_19;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0hex, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public abstract class AbstractViewOnClickListenerC1212570hex implements View.OnClickListener {
    public final long LL = 300;
    public boolean LLILLJJLI = true;
    public final ARunnableS119S0100000_19 LLILLL = new ARunnableS119S0100000_19(this, 132);

    public abstract void LIZ(View view);

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.LLILLJJLI) {
            this.LLILLJJLI = false;
            HandlerHook.viewPostDelay(view, this.LLILLL, this.LL);
            LIZ(view);
        }
    }
}
