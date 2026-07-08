package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.favorites.business.video.FavoriteVideoTabRootFragment;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.19Lh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC21523919Lh implements ViewTreeObserver.OnGlobalLayoutListener {
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
            case 3:
                onGlobalLayout$3(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC21523919Lh viewTreeObserverOnGlobalLayoutListenerC21523919Lh) {
        Rect rect = new Rect();
        ((C21515719Id) viewTreeObserverOnGlobalLayoutListenerC21523919Lh.l0).LIZIZ.getWindowVisibleDisplayFrame(rect);
        C118300cf c118300cf = (C118300cf) viewTreeObserverOnGlobalLayoutListenerC21523919Lh.l1;
        int i = c118300cf.element;
        if (i == 0) {
            c118300cf.element = rect.height();
            return;
        }
        if (i == rect.height()) {
            return;
        }
        int iHeight = ((C118300cf) viewTreeObserverOnGlobalLayoutListenerC21523919Lh.l1).element - rect.height();
        C21515719Id c21515719Id = (C21515719Id) viewTreeObserverOnGlobalLayoutListenerC21523919Lh.l0;
        if (c21515719Id.LIZJ + iHeight >= 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("rootViewVisibleHeight: ");
            sbLIZ.append(((C118300cf) viewTreeObserverOnGlobalLayoutListenerC21523919Lh.l1).element);
            C1706630uVp.LIZ("KeyBoardUtils", C2188811AlT.LIZIZ(sbLIZ));
            C21515719Id c21515719Id2 = (C21515719Id) viewTreeObserverOnGlobalLayoutListenerC21523919Lh.l0;
            c21515719Id2.LIZJ += iHeight;
            Iterator<InterfaceC21515819Ie> it2 = c21515719Id2.LIZLLL.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(iHeight);
            }
            C21515719Id c21515719Id3 = (C21515719Id) viewTreeObserverOnGlobalLayoutListenerC21523919Lh.l0;
            c21515719Id3.LIZ(c21515719Id3.LIZJ);
        } else {
            c21515719Id.LIZJ = 0;
            Iterator<InterfaceC21515819Ie> it3 = c21515719Id.LIZLLL.iterator();
            while (it3.hasNext()) {
                it3.next().LIZ(0);
            }
            ((C21515719Id) viewTreeObserverOnGlobalLayoutListenerC21523919Lh.l0).LIZ(-1);
        }
        ((C118300cf) viewTreeObserverOnGlobalLayoutListenerC21523919Lh.l1).element = rect.height();
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC21523919Lh viewTreeObserverOnGlobalLayoutListenerC21523919Lh) {
        if (((TuxTextView) viewTreeObserverOnGlobalLayoutListenerC21523919Lh.l0).getHeight() != 0 && ((TuxTextView) viewTreeObserverOnGlobalLayoutListenerC21523919Lh.l0).getWidth() != 0) {
            C196T c196t = (C196T) viewTreeObserverOnGlobalLayoutListenerC21523919Lh.l1;
            ((TuxTextView) viewTreeObserverOnGlobalLayoutListenerC21523919Lh.l0).getHeight();
            c196t.getClass();
            ((C196T) viewTreeObserverOnGlobalLayoutListenerC21523919Lh.l1).LLJJIJIIJIL = Integer.valueOf(((TuxTextView) viewTreeObserverOnGlobalLayoutListenerC21523919Lh.l0).getWidth());
        }
        ViewTreeObserver viewTreeObserver = ((TuxTextView) viewTreeObserverOnGlobalLayoutListenerC21523919Lh.l0).getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC21523919Lh);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC21523919Lh, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
    }

    public static final void onGlobalLayout$2(ViewTreeObserverOnGlobalLayoutListenerC21523919Lh viewTreeObserverOnGlobalLayoutListenerC21523919Lh) {
        boolean zLJIIIIZZ;
        FavoriteVideoTabRootFragment favoriteVideoTabRootFragment = (FavoriteVideoTabRootFragment) viewTreeObserverOnGlobalLayoutListenerC21523919Lh.l0;
        View view = (View) viewTreeObserverOnGlobalLayoutListenerC21523919Lh.l1;
        favoriteVideoTabRootFragment.getClass();
        C20246014Ju c20246014JuLIZ = C14K4.LIZ(view);
        if (c20246014JuLIZ != null) {
            zLJIIIIZZ = c20246014JuLIZ.LJIIIIZZ(8);
        } else {
            view.getWindowVisibleDisplayFrame(new Rect());
            if (r0.bottom < view.getHeight() * 0.75f) {
                zLJIIIIZZ = true;
            } else {
                zLJIIIIZZ = false;
            }
        }
        FavoriteVideoTabRootFragment favoriteVideoTabRootFragment2 = (FavoriteVideoTabRootFragment) viewTreeObserverOnGlobalLayoutListenerC21523919Lh.l0;
        if (zLJIIIIZZ != favoriteVideoTabRootFragment2.LLJILJILJ) {
            favoriteVideoTabRootFragment2.LLJILJILJ = zLJIIIIZZ;
            if (zLJIIIIZZ) {
                favoriteVideoTabRootFragment2.aS();
            } else {
                if (!favoriteVideoTabRootFragment2.VR()) {
                    return;
                }
                favoriteVideoTabRootFragment2.iS(false);
            }
        }
    }

    public static final void onGlobalLayout$3(ViewTreeObserverOnGlobalLayoutListenerC21523919Lh viewTreeObserverOnGlobalLayoutListenerC21523919Lh) {
        C786410Ut5.C3(((C21155517qb) viewTreeObserverOnGlobalLayoutListenerC21523919Lh.l0).LJ.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC21523919Lh);
        ((Function0) viewTreeObserverOnGlobalLayoutListenerC21523919Lh.l1).invoke();
    }

    public ViewTreeObserverOnGlobalLayoutListenerC21523919Lh(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
