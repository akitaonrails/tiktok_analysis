package X;

import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.mix.profile.entry.PlayListNameCell;
import com.ss.android.ugc.aweme.slash.page.SlashFragment;

/* JADX INFO: renamed from: X.0hYu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class ViewTreeObserverOnPreDrawListenerC1208820hYu implements ViewTreeObserver.OnPreDrawListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final boolean onPreDraw$0(ViewTreeObserverOnPreDrawListenerC1208820hYu viewTreeObserverOnPreDrawListenerC1208820hYu) {
        return ((PlayListNameCell) viewTreeObserverOnPreDrawListenerC1208820hYu.l0).I5((C1169370gXH) viewTreeObserverOnPreDrawListenerC1208820hYu.l1, (C197039127h) viewTreeObserverOnPreDrawListenerC1208820hYu.l2, viewTreeObserverOnPreDrawListenerC1208820hYu);
    }

    public static final boolean onPreDraw$1(ViewTreeObserverOnPreDrawListenerC1208820hYu viewTreeObserverOnPreDrawListenerC1208820hYu) {
        int iLIZ = C0DMR.LIZ((LinearLayout) viewTreeObserverOnPreDrawListenerC1208820hYu.l0);
        if (iLIZ != ((C118300cf) viewTreeObserverOnPreDrawListenerC1208820hYu.l1).element) {
            ((SlashFragment) viewTreeObserverOnPreDrawListenerC1208820hYu.l2).SU(iLIZ);
        }
        ((C118300cf) viewTreeObserverOnPreDrawListenerC1208820hYu.l1).element = iLIZ;
        return true;
    }

    public static final boolean onPreDraw$2(ViewTreeObserverOnPreDrawListenerC1208820hYu viewTreeObserverOnPreDrawListenerC1208820hYu) {
        return ((PlayListNameCell) viewTreeObserverOnPreDrawListenerC1208820hYu.l0).I5((C1169370gXH) viewTreeObserverOnPreDrawListenerC1208820hYu.l1, (C197039127h) viewTreeObserverOnPreDrawListenerC1208820hYu.l2, viewTreeObserverOnPreDrawListenerC1208820hYu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ViewTreeObserverOnPreDrawListenerC1208820hYu(Object obj, LinearLayout linearLayout, C118300cf c118300cf, SlashFragment<CONTEXT> slashFragment) {
        this.$t = slashFragment;
        this.l0 = obj;
        this.l1 = linearLayout;
        this.l2 = c118300cf;
    }
}
