package X;

import Y.ARunnableS84S0200000_15;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.LetsDancePreviewFragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bnA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class ViewTreeObserverOnPreDrawListenerC987020bnA implements ViewTreeObserver.OnPreDrawListener {
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

    public static final boolean onPreDraw$0(ViewTreeObserverOnPreDrawListenerC987020bnA viewTreeObserverOnPreDrawListenerC987020bnA) {
        View viewLJJLIL;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        InterfaceC947140akq interfaceC947140akqLJJLIIIJLLLLLLLZ;
        if (((LetsDancePreviewFragment) viewTreeObserverOnPreDrawListenerC987020bnA.l0).isAdded() && ((FrameLayout) viewTreeObserverOnPreDrawListenerC987020bnA.l1).getTranslationY() == 0.0f && ((FrameLayout) viewTreeObserverOnPreDrawListenerC987020bnA.l1).isShown()) {
            int[] iArr = new int[2];
            ((FrameLayout) viewTreeObserverOnPreDrawListenerC987020bnA.l1).getLocationOnScreen(iArr);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("container getLocationOnScreen ");
            sbLIZ.append(iArr[0]);
            sbLIZ.append(' ');
            sbLIZ.append(iArr[1]);
            C20441214yg.LIZIZ("LetsDancePreviewFragment", C2188811AlT.LIZIZ(sbLIZ));
            C786410Ut5.D3(((FrameLayout) viewTreeObserverOnPreDrawListenerC987020bnA.l1).getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC987020bnA);
            LetsDancePreviewFragment letsDancePreviewFragment = (LetsDancePreviewFragment) viewTreeObserverOnPreDrawListenerC987020bnA.l0;
            SurfaceView surfaceView = null;
            letsDancePreviewFragment.LLILZLL = null;
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != null && (interfaceC947140akqLJJLIIIJLLLLLLLZ = interfaceC954180awCLLJLL.LJJLIIIJLLLLLLLZ()) != null) {
                interfaceC947140akqLJJLIIIJLLLLLLLZ.LJII(C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ()));
            }
            InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL2 != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL2.LLIIJLIL()) != null) {
                viewLJJLIL = interfaceC937900aVwLLIIJLIL.LJJLIL(letsDancePreviewFragment.LLIZLLLIL);
            } else {
                viewLJJLIL = null;
            }
            if (viewLJJLIL instanceof SurfaceView) {
                surfaceView = (SurfaceView) viewLJJLIL;
            }
            letsDancePreviewFragment.LLILLL = surfaceView;
            if (surfaceView == null) {
                C20441214yg.LJ("LetsDancePreviewFragment", "createAndAttachSurfaceView null");
                C438590HHt.LIZ(letsDancePreviewFragment);
            } else {
                FrameLayout frameLayout = letsDancePreviewFragment.LLILLJJLI;
                if (frameLayout != null) {
                    HandlerHook.viewPost(frameLayout, new ARunnableS84S0200000_15(surfaceView, letsDancePreviewFragment, 40));
                    return true;
                }
            }
        }
        return true;
    }

    public static final boolean onPreDraw$1(ViewTreeObserverOnPreDrawListenerC987020bnA viewTreeObserverOnPreDrawListenerC987020bnA) {
        C786410Ut5.D3(((View) viewTreeObserverOnPreDrawListenerC987020bnA.l0).getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC987020bnA);
        ((Function0) viewTreeObserverOnPreDrawListenerC987020bnA.l1).invoke();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ViewTreeObserverOnPreDrawListenerC987020bnA(Object obj, View view, Function0<Unit> function0) {
        this.$t = function0;
        this.l0 = obj;
        this.l1 = view;
    }
}
