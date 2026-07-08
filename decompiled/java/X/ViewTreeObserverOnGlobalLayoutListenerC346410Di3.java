package X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.services.publish.IPublishOptionCustomViewFactory;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Di3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC346410Di3 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                break;
            case 1:
                onGlobalLayout$1(this);
                break;
            case 2:
                onGlobalLayout$2(this);
                break;
            case 3:
                onGlobalLayout$3(this);
                break;
            case 4:
                onGlobalLayout$4(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC346410Di3 viewTreeObserverOnGlobalLayoutListenerC346410Di3) {
        TuxTextView tuxTextView = (TuxTextView) viewTreeObserverOnGlobalLayoutListenerC346410Di3.l0;
        C786410Ut5.C3(tuxTextView.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC346410Di3);
        View view = (View) tuxTextView.getParent();
        Rect rect = new Rect();
        tuxTextView.getHitRect(rect);
        int iLIZIZ = (int) C497740JfY.LIZIZ(10);
        rect.top -= iLIZIZ;
        rect.bottom += iLIZIZ;
        rect.left -= iLIZIZ;
        rect.right += iLIZIZ;
        view.setTouchDelegate(new TouchDelegate(rect, tuxTextView));
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC346410Di3 viewTreeObserverOnGlobalLayoutListenerC346410Di3) {
        Rect rect = new Rect();
        ((View) viewTreeObserverOnGlobalLayoutListenerC346410Di3.l0).getWindowVisibleDisplayFrame(rect);
        int i = ((View) viewTreeObserverOnGlobalLayoutListenerC346410Di3.l0).getContext().getResources().getDisplayMetrics().heightPixels;
        int i2 = rect.bottom;
        if (i < i2) {
            i = i2;
        }
        int i3 = i - i2;
        if (i3 != 0) {
            int iLIZIZ = i3 + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
            if (((View) viewTreeObserverOnGlobalLayoutListenerC346410Di3.l0).getPaddingBottom() != iLIZIZ) {
                ((View) viewTreeObserverOnGlobalLayoutListenerC346410Di3.l0).setPadding(0, 0, 0, iLIZIZ);
                return;
            }
            return;
        }
        if (((View) viewTreeObserverOnGlobalLayoutListenerC346410Di3.l0).getPaddingBottom() == 0) {
            return;
        }
        ((View) viewTreeObserverOnGlobalLayoutListenerC346410Di3.l0).setPadding(0, 0, 0, 0);
    }

    public static final void onGlobalLayout$2(ViewTreeObserverOnGlobalLayoutListenerC346410Di3 viewTreeObserverOnGlobalLayoutListenerC346410Di3) {
        View view = (View) viewTreeObserverOnGlobalLayoutListenerC346410Di3.l0;
        if (!(view instanceof ConstraintLayout)) {
            return;
        }
        int maxWidth = ((ConstraintLayout) view).getMaxWidth();
        View viewFindViewById = ((View) viewTreeObserverOnGlobalLayoutListenerC346410Di3.l0).findViewById(R.id.tlf);
        if (viewFindViewById == null) {
            return;
        }
        int width = viewFindViewById.getWidth();
        TextView textView = (TextView) ((View) viewTreeObserverOnGlobalLayoutListenerC346410Di3.l0).findViewById(R.id.tv_title);
        if (textView != null) {
            textView.setMaxWidth((maxWidth - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36))) - width);
        }
        if (width > 0) {
            IPublishOptionCustomViewFactory.DefaultImpls.expandRightPartHitRect$default(C0DVV.LIZ, (View) viewTreeObserverOnGlobalLayoutListenerC346410Di3.l0, null, 2, null);
        }
    }

    public static final void onGlobalLayout$3(ViewTreeObserverOnGlobalLayoutListenerC346410Di3 viewTreeObserverOnGlobalLayoutListenerC346410Di3) {
        C786410Ut5.C3(((C16FS) viewTreeObserverOnGlobalLayoutListenerC346410Di3.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC346410Di3);
        View view = (View) ((C16FS) viewTreeObserverOnGlobalLayoutListenerC346410Di3.l0).getParent();
        Rect rect = new Rect();
        ((C16FS) viewTreeObserverOnGlobalLayoutListenerC346410Di3.l0).getHitRect(rect);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        rect.top -= iLIZIZ;
        rect.bottom += iLIZIZ;
        rect.left -= iLIZIZ;
        rect.right += iLIZIZ;
        view.setTouchDelegate(new TouchDelegate(rect, (C16FS) viewTreeObserverOnGlobalLayoutListenerC346410Di3.l0));
    }

    public static final void onGlobalLayout$4(ViewTreeObserverOnGlobalLayoutListenerC346410Di3 viewTreeObserverOnGlobalLayoutListenerC346410Di3) {
        TuxTextView tuxTextView = (TuxTextView) viewTreeObserverOnGlobalLayoutListenerC346410Di3.l0;
        C786410Ut5.C3(tuxTextView.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC346410Di3);
        View view = (View) tuxTextView.getParent();
        Rect rect = new Rect();
        tuxTextView.getHitRect(rect);
        int iLIZIZ = (int) C497740JfY.LIZIZ(10);
        rect.top -= iLIZIZ;
        rect.bottom += iLIZIZ;
        rect.left -= iLIZIZ;
        rect.right += iLIZIZ;
        view.setTouchDelegate(new TouchDelegate(rect, tuxTextView));
    }

    public ViewTreeObserverOnGlobalLayoutListenerC346410Di3(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
