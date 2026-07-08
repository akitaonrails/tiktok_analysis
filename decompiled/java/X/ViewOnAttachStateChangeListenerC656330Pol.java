package X;

import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.commercialize.model.SearchChallengeAdData;

/* JADX INFO: renamed from: X.0Pol, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class ViewOnAttachStateChangeListenerC656330Pol implements View.OnAttachStateChangeListener, Runnable {
    public final View LL;
    public SearchChallengeAdData LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("SearchChallengeViewHolder$SearchAdLogTracker@de95.run");
        try {
            if (this.LLILLL) {
                if (this.LLILLJJLI != null) {
                    if (!C0J0T.LIZJ(this.LL)) {
                        this.LLILZ = false;
                    } else if (!this.LLILZ) {
                        this.LLILZ = true;
                    }
                }
                HandlerHook.viewPostDelay(this.LL, this, 500L);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchChallengeViewHolder$SearchAdLogTracker@de95.run");
    }

    public ViewOnAttachStateChangeListenerC656330Pol(View view) {
        this.LL = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.LLILLL = true;
        this.LLILZ = false;
        run();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.LLILLL = false;
        this.LLILZ = false;
        HandlerHook.viewRemoveCallbacks(this.LL, this);
    }
}
