package Y;

import X.C03DT;
import X.C1C7U;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: loaded from: classes2.dex */
public class ARunnableS13S0101000_1 implements Runnable {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        View view;
        Rect rect = new Rect();
        ((View) this.l0).setEnabled(true);
        ((View) this.l0).getHitRect(rect);
        int i = rect.top;
        int i2 = this.i1;
        rect.top = i - i2;
        rect.bottom += i2;
        rect.left -= i2;
        rect.right += i2;
        Object parent = ((View) this.l0).getParent();
        if (!(parent instanceof View) || (view = (View) parent) == null) {
            return;
        }
        view.setTouchDelegate(new TouchDelegate(rect, (View) this.l0));
    }

    public static final void run$0(ARunnableS13S0101000_1 aRunnableS13S0101000_1) {
        boolean zLIZ;
        C1C7U.LIZ("NewSuggestedTitle@410f.setNewSuggestedCount$1");
        try {
            TuxTextView titleTextView = ((C03DT) aRunnableS13S0101000_1.l0).getTitleTextView();
            C03DT c03dt = (C03DT) aRunnableS13S0101000_1.l0;
            int i = aRunnableS13S0101000_1.i1;
            titleTextView.setText(c03dt.getContext().getResources().getQuantityString(2131755312, i, Integer.valueOf(i)));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NewSuggestedTitle@410f.setNewSuggestedCount$1");
    }

    public static final void run$1(ARunnableS13S0101000_1 aRunnableS13S0101000_1) {
        boolean zLIZ;
        LinearLayoutManager linearLayoutManager;
        View viewFindViewByPosition;
        C1C7U.LIZ("BankInstallmentAssem@3551.scrollToCenter$1$1");
        try {
            RecyclerView.LayoutManager layoutManager = ((ViewOnAttachStateChangeListenerC20604515jv) aRunnableS13S0101000_1.l0).getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null && (viewFindViewByPosition = linearLayoutManager.findViewByPosition(aRunnableS13S0101000_1.i1)) != null) {
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) aRunnableS13S0101000_1.l0;
                viewOnAttachStateChangeListenerC20604515jv.smoothScrollBy(0, viewFindViewByPosition.getTop() - (viewOnAttachStateChangeListenerC20604515jv.getHeight() / 3));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BankInstallmentAssem@3551.scrollToCenter$1$1");
    }

    public static final void run$2(ARunnableS13S0101000_1 aRunnableS13S0101000_1) {
        boolean zLIZ;
        C1C7U.LIZ("PreviewRootScene@2e13.expandTouchDelegate$1");
        try {
            aRunnableS13S0101000_1.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PreviewRootScene@2e13.expandTouchDelegate$1");
    }

    public ARunnableS13S0101000_1(int i, Object obj, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
