package X;

import Y.ARunnableS106S0100000_6;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0Ged, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractViewOnClickListenerC420730Ged implements View.OnClickListener {
    public final long LL;
    public boolean LLILLJJLI = true;
    public final ARunnableS106S0100000_6 LLILLL = new ARunnableS106S0100000_6(this, 159);

    public abstract void LIZ(View view);

    public AbstractViewOnClickListenerC420730Ged(long j) {
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
