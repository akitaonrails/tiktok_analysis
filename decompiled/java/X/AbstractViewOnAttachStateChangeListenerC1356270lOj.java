package X;

import android.graphics.Path;
import android.view.View;
import android.view.ViewStub;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0lOj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractViewOnAttachStateChangeListenerC1356270lOj implements View.OnAttachStateChangeListener {
    public ViewStub LL;
    public View LLILLJJLI;
    public int LLILLL = -1;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    public final void LIZIZ() {
        ViewStub viewStub = this.LL;
        if (viewStub == null || this.LLILLJJLI != null) {
            return;
        }
        View viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
        this.LLILLJJLI = viewLJLLLL;
        if (viewLJLLLL != null) {
            viewLJLLLL.addOnAttachStateChangeListener(this);
            C1356260lOi c1356260lOi = (C1356260lOi) this;
            C0GUO c0guo = (C0GUO) viewLJLLLL.findViewById(R.id.cxx);
            c1356260lOi.LLJI = c0guo;
            if (!c1356260lOi.LLILZLL && c0guo != null) {
                c0guo.LL = new Path();
            }
            int i = this.LLILLL;
            if (i == 8) {
                this.LLILLL = i;
                View view = this.LLILLJJLI;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(8, view);
                    View view2 = this.LLILLJJLI;
                    if (view2 != null) {
                        view2.clearAnimation();
                    }
                }
            }
        }
        this.LL = null;
    }

    public AbstractViewOnAttachStateChangeListenerC1356270lOj(ViewStub viewStub) {
        this.LL = viewStub;
    }
}
