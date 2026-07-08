package X;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.ies.xelement.input.LynxBaseInputView;
import com.bytedance.ies.xelement.overlay.LynxOverlayView;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll;
import j27.s;

/* JADX INFO: renamed from: X.0kxJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC1339270kxJ implements ViewTreeObserver.OnGlobalLayoutListener {
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
            case 5:
                onGlobalLayout$5(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC1339270kxJ viewTreeObserverOnGlobalLayoutListenerC1339270kxJ) {
        ((C1317140kNc) viewTreeObserverOnGlobalLayoutListenerC1339270kxJ.l0).getClass();
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC1339270kxJ viewTreeObserverOnGlobalLayoutListenerC1339270kxJ) {
        boolean z;
        C1321900kVI c1321900kVI = (C1321900kVI) viewTreeObserverOnGlobalLayoutListenerC1339270kxJ.l0;
        C1321710kUz c1321710kUz = c1321900kVI.LJFF;
        c1321900kVI.LJII = c1321710kUz.LJFF;
        c1321900kVI.LJI = c1321710kUz.LJII;
        boolean z2 = true;
        if (c1321900kVI.LIZLLL()) {
            int height = c1321900kVI.LJFF.LJ.LJJLIIJ().getHeight();
            int i = c1321900kVI.LJII;
            if (((double) height) / ((double) i) < 0.8d) {
                z = true;
            } else {
                z = false;
            }
            int i2 = i - height;
            if (c1321900kVI.LJIIL != i2) {
                c1321900kVI.LJIILJJIL = true;
                c1321900kVI.LJIIL = i2;
            } else {
                c1321900kVI.LJIILJJIL = false;
            }
            if (c1321900kVI.LJIILJJIL) {
                if (z) {
                    C21397018oS c21397018oS = c1321900kVI.LJ;
                    if (c21397018oS != null && c21397018oS.isFocused()) {
                        LynxBaseUI parentBaseUI = c1321900kVI.LIZ.getParentBaseUI();
                        while (true) {
                            if (parentBaseUI == null) {
                                break;
                            }
                            if (parentBaseUI instanceof AbsLynxUIScroll) {
                                height -= ((LynxUI) parentBaseUI).mView.getTop();
                                break;
                            }
                            parentBaseUI = parentBaseUI.getParentBaseUI();
                        }
                        c1321900kVI.LJIILIIL = height;
                        c1321900kVI.LJ();
                    }
                } else if (c1321900kVI.LJIIIZ) {
                    LynxBaseUI parentBaseUI2 = c1321900kVI.LIZ.getParentBaseUI();
                    while (true) {
                        if (parentBaseUI2 == null) {
                            break;
                        }
                        if (parentBaseUI2 instanceof AbsLynxUIScroll) {
                            LynxUI lynxUI = (LynxUI) parentBaseUI2;
                            if (((ViewGroup) lynxUI.mView).getChildAt(0).getPaddingBottom() != 0) {
                                ((ViewGroup) lynxUI.mView).getChildAt(0).setPadding(0, 0, 0, 0);
                            }
                        } else {
                            parentBaseUI2 = parentBaseUI2.getParentBaseUI();
                        }
                    }
                }
            }
        }
        LynxBaseInputView lynxBaseInputView = c1321900kVI.LIZ;
        if (((double) lynxBaseInputView.mContext.LJIILJJIL().getKeyboardEvent().LJ.LJJLIIJ().getHeight()) / ((double) lynxBaseInputView.LLJZ.LJII) >= 0.8d) {
            z2 = false;
        }
        if (lynxBaseInputView.LLJLL && !z2) {
            C21397018oS c21397018oS2 = lynxBaseInputView.LL;
            if (c21397018oS2 == null) {
                c21397018oS2 = null;
            }
            c21397018oS2.clearFocus();
        }
    }

    public static final void onGlobalLayout$2(ViewTreeObserverOnGlobalLayoutListenerC1339270kxJ viewTreeObserverOnGlobalLayoutListenerC1339270kxJ) {
        C1309670kBZ c1309670kBZ;
        LynxOverlayView lynxOverlayView = (LynxOverlayView) viewTreeObserverOnGlobalLayoutListenerC1339270kxJ.l0;
        int i = LynxOverlayView.LLJJIJIL;
        s sVar = lynxOverlayView.mContext;
        if (sVar != null && (c1309670kBZ = sVar.LLJJJJLIIL) != null) {
            c1309670kBZ.LJIIJ();
        }
    }

    public static final void onGlobalLayout$3(ViewTreeObserverOnGlobalLayoutListenerC1339270kxJ viewTreeObserverOnGlobalLayoutListenerC1339270kxJ) {
        ((AbstractC1298500jtY) viewTreeObserverOnGlobalLayoutListenerC1339270kxJ.l0).LJIIJ();
    }

    public static final void onGlobalLayout$4(ViewTreeObserverOnGlobalLayoutListenerC1339270kxJ viewTreeObserverOnGlobalLayoutListenerC1339270kxJ) {
        LynxLog.d("Lynx", "onGlobalLayout invoked.");
        ((C1321710kUz) viewTreeObserverOnGlobalLayoutListenerC1339270kxJ.l0).LIZ();
    }

    public static final void onGlobalLayout$5(ViewTreeObserverOnGlobalLayoutListenerC1339270kxJ viewTreeObserverOnGlobalLayoutListenerC1339270kxJ) {
        C1309670kBZ c1309670kBZ;
        com.lynx.xelement.overlay.LynxOverlayView lynxOverlayView = (com.lynx.xelement.overlay.LynxOverlayView) viewTreeObserverOnGlobalLayoutListenerC1339270kxJ.l0;
        int i = com.lynx.xelement.overlay.LynxOverlayView.LLJLILLLLZIIL;
        s sVar = lynxOverlayView.mContext;
        if (sVar != null && (c1309670kBZ = sVar.LLJJJJLIIL) != null) {
            c1309670kBZ.LJIIJ();
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC1339270kxJ(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
