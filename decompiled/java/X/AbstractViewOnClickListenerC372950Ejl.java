package X;

import Y.ARunnableS105S0100000_5;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0Ejl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractViewOnClickListenerC372950Ejl implements View.OnClickListener {
    public final long LL;
    public boolean LLILLJJLI;
    public final ARunnableS105S0100000_5 LLILLL;

    public abstract void LIZ(View view);

    public AbstractViewOnClickListenerC372950Ejl() {
        this(300L);
    }

    public AbstractViewOnClickListenerC372950Ejl(long j) {
        this.LLILLJJLI = true;
        this.LLILLL = new ARunnableS105S0100000_5(this, 25);
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
