package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.coverpreview.activity.NewCoverPreviewActivity;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Di2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class ViewTreeObserverOnPreDrawListenerC346400Di2 implements ViewTreeObserver.OnPreDrawListener {
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
            default:
                return false;
        }
    }

    public static final boolean onPreDraw$0(ViewTreeObserverOnPreDrawListenerC346400Di2 viewTreeObserverOnPreDrawListenerC346400Di2) {
        C786410Ut5.D3(((View) viewTreeObserverOnPreDrawListenerC346400Di2.l0).getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC346400Di2);
        TuxImmersionBar tuxImmersionBarLJ = C1766560w4U.LJ((NewCoverPreviewActivity) viewTreeObserverOnPreDrawListenerC346400Di2.l1);
        tuxImmersionBarLJ.LJ(R.attr.bo);
        tuxImmersionBarLJ.LIZIZ.LJIIJ(true);
        tuxImmersionBarLJ.LIZLLL();
        return true;
    }

    public static final boolean onPreDraw$1(ViewTreeObserverOnPreDrawListenerC346400Di2 viewTreeObserverOnPreDrawListenerC346400Di2) {
        ((C0DIT) viewTreeObserverOnPreDrawListenerC346400Di2.l0).N5();
        int width = (((C0DIT) viewTreeObserverOnPreDrawListenerC346400Di2.l0).LLJ.getWidth() - ((C0DIT) viewTreeObserverOnPreDrawListenerC346400Di2.l0).LLJ.getPaddingLeft()) - ((C0DIT) viewTreeObserverOnPreDrawListenerC346400Di2.l0).LLJ.getPaddingRight();
        if (width > 0) {
            ((C0DIT) viewTreeObserverOnPreDrawListenerC346400Di2.l0).I5((C0D4T) viewTreeObserverOnPreDrawListenerC346400Di2.l1, width);
            return true;
        }
        return true;
    }

    public ViewTreeObserverOnPreDrawListenerC346400Di2(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
