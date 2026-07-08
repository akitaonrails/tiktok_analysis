package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;

/* JADX INFO: renamed from: X.0SyU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class ViewTreeObserverOnPreDrawListenerC738800SyU implements ViewTreeObserver.OnPreDrawListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.$t) {
            case 0:
                return onPreDraw$0(this);
            case 1:
                return onPreDraw$1(this);
            case 2:
                return onPreDraw$2(this);
            default:
                return false;
        }
    }

    public static final boolean onPreDraw$0(ViewTreeObserverOnPreDrawListenerC738800SyU viewTreeObserverOnPreDrawListenerC738800SyU) {
        ((VideoViewCell) viewTreeObserverOnPreDrawListenerC738800SyU.l1).LLILLIZIL(0, 0);
        C786410Ut5.D3(((C0RSF) viewTreeObserverOnPreDrawListenerC738800SyU.l0).getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC738800SyU);
        return true;
    }

    public static final boolean onPreDraw$1(ViewTreeObserverOnPreDrawListenerC738800SyU viewTreeObserverOnPreDrawListenerC738800SyU) {
        ((C0SX4) viewTreeObserverOnPreDrawListenerC738800SyU.l0).LJIJJ((TextView) viewTreeObserverOnPreDrawListenerC738800SyU.l1);
        ((C0SX4) viewTreeObserverOnPreDrawListenerC738800SyU.l0).LJJII((TextView) viewTreeObserverOnPreDrawListenerC738800SyU.l1);
        return true;
    }

    public static final boolean onPreDraw$2(ViewTreeObserverOnPreDrawListenerC738800SyU viewTreeObserverOnPreDrawListenerC738800SyU) {
        if (((C0R50) viewTreeObserverOnPreDrawListenerC738800SyU.l1).LIZ) {
            C786410Ut5.D3(((View) viewTreeObserverOnPreDrawListenerC738800SyU.l0).getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC738800SyU);
            return true;
        }
        return false;
    }

    public ViewTreeObserverOnPreDrawListenerC738800SyU(View view, int i) {
        this.$t = i;
        this.l1 = C0R51.LIZ;
        this.l0 = view;
    }

    public ViewTreeObserverOnPreDrawListenerC738800SyU(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
