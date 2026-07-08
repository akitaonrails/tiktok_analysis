package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardIconGroupAssem;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0maf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC1402110maf implements ViewTreeObserver.OnGlobalLayoutListener {
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

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC1402110maf viewTreeObserverOnGlobalLayoutListenerC1402110maf) {
        if (((TuxIconView) viewTreeObserverOnGlobalLayoutListenerC1402110maf.l0).getViewTreeObserver().isAlive()) {
            C786410Ut5.C3(((TuxIconView) viewTreeObserverOnGlobalLayoutListenerC1402110maf.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1402110maf);
        }
        KeyboardIconGroupAssem keyboardIconGroupAssem = (KeyboardIconGroupAssem) viewTreeObserverOnGlobalLayoutListenerC1402110maf.l1;
        keyboardIconGroupAssem.LLL = null;
        HandlerHook.viewPostDelay((TuxIconView) viewTreeObserverOnGlobalLayoutListenerC1402110maf.l0, keyboardIconGroupAssem.LLLF, 350L);
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC1402110maf viewTreeObserverOnGlobalLayoutListenerC1402110maf) {
        InterfaceC1370280llK interfaceC1370280llK;
        InterfaceC1370280llK interfaceC1370280llK2;
        C1370230llF c1370230llF = (C1370230llF) viewTreeObserverOnGlobalLayoutListenerC1402110maf.l0;
        InterfaceC1370310llN interfaceC1370310llN = c1370230llF.LLJILLL;
        String strKey = null;
        if (interfaceC1370310llN != null) {
            strKey = interfaceC1370310llN.key();
        }
        if (!Intrinsics.LJFF(strKey, "playback_speed")) {
            ConstraintLayout constraintLayout = (ConstraintLayout) c1370230llF.LLILZLL.getParent();
            C19MB c19mb = new C19MB();
            c19mb.LJII(constraintLayout);
            c19mb.LJIIIIZZ(c1370230llF.LLILZLL.getId(), 7, c1370230llF.LLJI.getId(), 6);
            c19mb.LIZIZ(constraintLayout);
        } else if (!C0H4W.LIZ() ? c1370230llF.LLILZLL.getRight() - c1370230llF.LLJILJIL.getLeft() > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) : c1370230llF.LLJILJIL.getRight() - c1370230llF.LLILZLL.getLeft() > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))) {
            FrameLayout frameLayout = c1370230llF.LLJILJIL;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) frameLayout.getParent();
            C19MB c19mb2 = new C19MB();
            c19mb2.LJII(constraintLayout2);
            c19mb2.LJI(frameLayout.getId(), 6);
            c19mb2.LJI(frameLayout.getId(), 7);
            c19mb2.LJI(frameLayout.getId(), 3);
            c19mb2.LJI(c1370230llF.LLILZLL.getId(), 4);
            c19mb2.LJI(c1370230llF.LLILZIL.getId(), 4);
            c19mb2.LJIIIIZZ(frameLayout.getId(), 3, c1370230llF.LLILZLL.getId(), 4);
            c19mb2.LJIIIIZZ(frameLayout.getId(), 6, c1370230llF.LLILZLL.getId(), 6);
            c19mb2.LJIIIIZZ(frameLayout.getId(), 7, 0, 7);
            c19mb2.LIZIZ(constraintLayout2);
            InterfaceC1370310llN interfaceC1370310llN2 = c1370230llF.LLJILLL;
            if ((interfaceC1370310llN2 instanceof InterfaceC1370280llK) && (interfaceC1370280llK2 = (InterfaceC1370280llK) interfaceC1370310llN2) != null) {
                interfaceC1370280llK2.LIZIZ(c1370230llF.itemView.getContext(), frameLayout);
            }
            InterfaceC1370310llN interfaceC1370310llN3 = c1370230llF.LLJILLL;
            if ((interfaceC1370310llN3 instanceof InterfaceC1370280llK) && (interfaceC1370280llK = (InterfaceC1370280llK) interfaceC1370310llN3) != null) {
                interfaceC1370280llK.LJ(c1370230llF.LLILLL, c1370230llF.getPosition(), c1370230llF.LL, new AwS565S0100000_21(c1370230llF, 1307));
            }
            C426750GoL.LJIIIZ(c1370230llF.LLILZLL, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), null, null, false, 29);
        }
        C786410Ut5.C3(((View) viewTreeObserverOnGlobalLayoutListenerC1402110maf.l1).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1402110maf);
    }

    public static final void onGlobalLayout$2(ViewTreeObserverOnGlobalLayoutListenerC1402110maf viewTreeObserverOnGlobalLayoutListenerC1402110maf) {
        if (((TuxIconView) viewTreeObserverOnGlobalLayoutListenerC1402110maf.l0).getViewTreeObserver().isAlive()) {
            C786410Ut5.C3(((TuxIconView) viewTreeObserverOnGlobalLayoutListenerC1402110maf.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1402110maf);
        }
        KeyboardIconGroupAssem keyboardIconGroupAssem = (KeyboardIconGroupAssem) viewTreeObserverOnGlobalLayoutListenerC1402110maf.l1;
        keyboardIconGroupAssem.LLJLL = null;
        HandlerHook.viewPostDelay((TuxIconView) viewTreeObserverOnGlobalLayoutListenerC1402110maf.l0, keyboardIconGroupAssem.LLJLLIL, 350L);
    }

    public static final void onGlobalLayout$3(ViewTreeObserverOnGlobalLayoutListenerC1402110maf viewTreeObserverOnGlobalLayoutListenerC1402110maf) {
        if (((TuxIconView) viewTreeObserverOnGlobalLayoutListenerC1402110maf.l0).getViewTreeObserver().isAlive()) {
            C786410Ut5.C3(((TuxIconView) viewTreeObserverOnGlobalLayoutListenerC1402110maf.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1402110maf);
        }
        KeyboardIconGroupAssem keyboardIconGroupAssem = (KeyboardIconGroupAssem) viewTreeObserverOnGlobalLayoutListenerC1402110maf.l1;
        keyboardIconGroupAssem.LLJLL = null;
        HandlerHook.viewPostDelay((TuxIconView) viewTreeObserverOnGlobalLayoutListenerC1402110maf.l0, keyboardIconGroupAssem.LLJLLIL, 350L);
    }

    public ViewTreeObserverOnGlobalLayoutListenerC1402110maf(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
