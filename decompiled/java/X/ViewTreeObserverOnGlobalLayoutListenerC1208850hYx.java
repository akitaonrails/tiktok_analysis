package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.favorites.business.collection.collaborative.EditCollectionFragment;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0hYx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC1208850hYx implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;
    public Object l1;

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
        }
    }

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC1208850hYx viewTreeObserverOnGlobalLayoutListenerC1208850hYx) {
        Rect rect = new Rect();
        ((View) viewTreeObserverOnGlobalLayoutListenerC1208850hYx.l0).getWindowVisibleDisplayFrame(rect);
        int height = ((View) viewTreeObserverOnGlobalLayoutListenerC1208850hYx.l0).getRootView().getHeight();
        double d = height - rect.bottom;
        double d2 = height;
        if (d > 0.15d * d2) {
            C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
            if (c19252910Tv.LIZLLL().LJIIJ().isPad() != 1 || c19252910Tv.LIZLLL().LJIIJ().LIZ() != 1) {
                double d3 = (d2 * 0.85d) - d;
                C0GUG c0gug = ((EditCollectionFragment) viewTreeObserverOnGlobalLayoutListenerC1208850hYx.l1).LLJJIII;
                if (c0gug != null) {
                    c0gug.setMaxHeight((int) d3);
                    return;
                }
                return;
            }
        }
        C0GUG c0gug2 = ((EditCollectionFragment) viewTreeObserverOnGlobalLayoutListenerC1208850hYx.l1).LLJJIII;
        if (c0gug2 == null) {
            return;
        }
        c0gug2.setMaxHeight(Integer.MAX_VALUE);
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC1208850hYx viewTreeObserverOnGlobalLayoutListenerC1208850hYx) {
        boolean z;
        ((Rect) ((C1199760hKI) viewTreeObserverOnGlobalLayoutListenerC1208850hYx.l0).LIZ.getValue()).setEmpty();
        ((View) viewTreeObserverOnGlobalLayoutListenerC1208850hYx.l1).getWindowVisibleDisplayFrame((Rect) ((C1199760hKI) viewTreeObserverOnGlobalLayoutListenerC1208850hYx.l0).LIZ.getValue());
        int height = ((View) viewTreeObserverOnGlobalLayoutListenerC1208850hYx.l1).getHeight();
        C1199760hKI c1199760hKI = (C1199760hKI) viewTreeObserverOnGlobalLayoutListenerC1208850hYx.l0;
        if (height - ((Rect) c1199760hKI.LIZ.getValue()).bottom > ((double) height) * 0.15d) {
            C1199760hKI c1199760hKI2 = (C1199760hKI) viewTreeObserverOnGlobalLayoutListenerC1208850hYx.l0;
            c1199760hKI2.LIZJ = ((Rect) c1199760hKI2.LIZ.getValue()).bottom;
            ((C1199760hKI) viewTreeObserverOnGlobalLayoutListenerC1208850hYx.l0).LIZ();
            C1199760hKI c1199760hKI3 = (C1199760hKI) viewTreeObserverOnGlobalLayoutListenerC1208850hYx.l0;
            if (!c1199760hKI3.LJI && c1199760hKI3.LIZLLL > 0) {
                Iterator it2 = ((ArrayList) c1199760hKI3.LJ).iterator();
                while (it2.hasNext()) {
                    ((Function1) it2.next()).invoke(Integer.valueOf(c1199760hKI3.LIZLLL));
                }
            }
            z = true;
        } else {
            C1199760hKI c1199760hKI4 = (C1199760hKI) viewTreeObserverOnGlobalLayoutListenerC1208850hYx.l0;
            int i = ((Rect) c1199760hKI4.LIZ.getValue()).bottom;
            int height2 = ((View) viewTreeObserverOnGlobalLayoutListenerC1208850hYx.l1).getHeight();
            if (i < height2) {
                i = height2;
            }
            c1199760hKI4.LIZIZ = i;
            ((C1199760hKI) viewTreeObserverOnGlobalLayoutListenerC1208850hYx.l0).LIZ();
            C1199760hKI c1199760hKI5 = (C1199760hKI) viewTreeObserverOnGlobalLayoutListenerC1208850hYx.l0;
            if (c1199760hKI5.LJI) {
                Iterator it3 = ((ArrayList) c1199760hKI5.LJFF).iterator();
                while (it3.hasNext()) {
                    ((Function0) it3.next()).invoke();
                }
            }
            z = false;
        }
        c1199760hKI.LJI = z;
    }

    public static final void onGlobalLayout$2(ViewTreeObserverOnGlobalLayoutListenerC1208850hYx viewTreeObserverOnGlobalLayoutListenerC1208850hYx) {
        RecyclerView.LayoutManager layoutManager = ((ViewOnAttachStateChangeListenerC20604515jv) viewTreeObserverOnGlobalLayoutListenerC1208850hYx.l0).getLayoutManager();
        if (layoutManager != null && layoutManager.getChildCount() > 0) {
            ((Function0) viewTreeObserverOnGlobalLayoutListenerC1208850hYx.l1).invoke();
            ViewTreeObserver viewTreeObserver = ((ViewOnAttachStateChangeListenerC20604515jv) viewTreeObserverOnGlobalLayoutListenerC1208850hYx.l0).getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1208850hYx);
                C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1208850hYx, ViewTreeObserver.OnGlobalLayoutListener.class);
            }
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC1208850hYx(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
