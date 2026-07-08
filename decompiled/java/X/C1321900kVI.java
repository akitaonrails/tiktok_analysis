package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS31S0101000_20;
import android.app.Activity;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.xelement.input.LynxBaseInputView;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll;
import j27.s;

/* JADX INFO: renamed from: X.0kVI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1321900kVI {
    public final LynxBaseInputView LIZ;
    public boolean LIZIZ;
    public final s LIZJ;
    public ViewTreeObserverOnGlobalLayoutListenerC1339270kxJ LIZLLL;
    public C21397018oS LJ;
    public final C1321710kUz LJFF;
    public Rect LJI;
    public int LJII;
    public String LJIIIIZZ;
    public boolean LJIIIZ;
    public int LJIIJ;
    public boolean LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public boolean LJIILJJIL;

    public final EnumC1321910kVJ LIZIZ() {
        Activity activityLIZ = C1298530jtb.LIZ(this.LIZJ);
        if (activityLIZ == null) {
            return EnumC1321910kVJ.NONE;
        }
        int i = activityLIZ.getWindow().getAttributes().softInputMode & 240 & 240;
        if (i != 16) {
            return i != 32 ? i != 48 ? EnumC1321910kVJ.NONE : EnumC1321910kVJ.NOTHING : EnumC1321910kVJ.NONE;
        }
        Activity activityLIZ2 = C1298530jtb.LIZ(this.LIZJ);
        return (activityLIZ2 == null || (activityLIZ2.getWindow().getDecorView().getSystemUiVisibility() & 1024) == 0) ? EnumC1321910kVJ.NORMAL : EnumC1321910kVJ.IMMERSIVE;
    }

    public final void LIZJ() {
        if (this.LIZIZ) {
            LynxLog.d("LynxInputScrollHelper", "inputScrollerHelper has already initialized");
            return;
        }
        if (this.LJFF.LJ == null) {
            LynxLog.d("LynxInputScrollHelper", "keyboardMonitor has not been created");
            return;
        }
        C21397018oS c21397018oS = this.LIZ.LL;
        if (c21397018oS == null) {
            c21397018oS = null;
        }
        this.LJ = c21397018oS;
        if (LIZIZ() != EnumC1321910kVJ.NONE) {
            this.LIZLLL = new ViewTreeObserverOnGlobalLayoutListenerC1339270kxJ(this, 1);
            C1321710kUz c1321710kUz = this.LJFF;
            c1321710kUz.LJIIJ.put(this.LJ, this.LIZLLL);
            c1321710kUz.LIZJ();
        }
        this.LIZIZ = true;
    }

    public final boolean LIZLLL() {
        return (C1298530jtb.LIZ(this.LIZJ) == null || !this.LJIIJJI || TextUtils.equals(this.LJIIIIZZ, "none") || LIZIZ() == EnumC1321910kVJ.NONE || this.LJFF.LJ == null) ? false : true;
    }

    public final void LJ() {
        int iHeight;
        int iHeight2;
        if (C1298530jtb.LIZ(this.LIZJ) == null) {
            return;
        }
        if (!this.LIZIZ) {
            this.LJFF.LIZJ();
            LIZJ();
        }
        if (this.LJ == null && this.LJFF.LJ == null) {
            return;
        }
        if (this.LJII == 0) {
            C1321710kUz c1321710kUz = this.LJFF;
            int i = c1321710kUz.LJFF;
            this.LJII = i;
            this.LJI = c1321710kUz.LJII;
            if (i == 0) {
                return;
            }
        }
        Rect rect = new Rect();
        this.LJ.getDrawingRect(rect);
        for (LynxBaseUI parentBaseUI = this.LIZ.getParentBaseUI(); parentBaseUI != null; parentBaseUI = parentBaseUI.getParentBaseUI()) {
            if (parentBaseUI instanceof AbsLynxUIScroll) {
                C21397018oS c21397018oS = this.LJ;
                if (c21397018oS == null || !c21397018oS.isFocused()) {
                    return;
                }
                LynxUI lynxUI = (LynxUI) parentBaseUI;
                if (lynxUI.mView instanceof C1318590kPx) {
                    EnumC1321910kVJ enumC1321910kVJLIZIZ = LIZIZ();
                    C1321710kUz c1321710kUz2 = this.LJFF;
                    this.LJII = c1321710kUz2.LJFF;
                    this.LJI = c1321710kUz2.LJII;
                    if (enumC1321910kVJLIZIZ == EnumC1321910kVJ.NORMAL) {
                        if (!this.LJIIIZ) {
                            ((ViewGroup) lynxUI.mView).getChildAt(0).setPadding(0, 0, 0, 0);
                            return;
                        }
                        ((ViewGroup) lynxUI.mView).offsetDescendantRectToMyCoords(this.LJ, rect);
                        int bottom = ((ViewGroup) lynxUI.mView).getChildAt(0).getBottom() - rect.bottom;
                        int iHeight3 = TextUtils.equals(this.LJIIIIZZ, "center") ? bottom - ((this.LJIILIIL - rect.height()) / 2) : bottom - this.LJIIJ;
                        if (iHeight3 >= 0) {
                            return;
                        }
                        T t = lynxUI.mView;
                        if (t == 0) {
                            throw new NullPointerException("null cannot be cast to non-null type com.lynx.tasm.behavior.ui.scroll.AndroidScrollView");
                        }
                        C1318590kPx c1318590kPx = (C1318590kPx) t;
                        View childAt = c1318590kPx.getChildAt(0);
                        if (childAt.getPaddingBottom() != 0) {
                            c1318590kPx.setFillViewport(true);
                            childAt.setPadding(0, 0, 0, childAt.getPaddingBottom() - iHeight3);
                            LIZ(c1318590kPx, iHeight3);
                            return;
                        } else {
                            if (childAt.getPaddingBottom() == 0) {
                                childAt.setPadding(0, 0, 0, -iHeight3);
                                LIZ(c1318590kPx, iHeight3);
                                return;
                            }
                            return;
                        }
                    }
                    if (enumC1321910kVJLIZIZ == EnumC1321910kVJ.IMMERSIVE || enumC1321910kVJLIZIZ == EnumC1321910kVJ.NOTHING) {
                        T t2 = lynxUI.mView;
                        if (t2 == 0) {
                            throw new NullPointerException("null cannot be cast to non-null type com.lynx.tasm.behavior.ui.scroll.AndroidScrollView");
                        }
                        C1318590kPx c1318590kPx2 = (C1318590kPx) t2;
                        View childAt2 = c1318590kPx2.getChildAt(0);
                        int[] iArr = {-1, -1};
                        this.LJ.getLocationOnScreen(iArr);
                        int i2 = iArr[0];
                        Rect rect2 = new Rect(i2, iArr[1], this.LJ.getWidth() + i2, iArr[1] + this.LJ.getHeight());
                        int height = (this.LJFF.LJ.LJJLIIJ().getHeight() + this.LJI.top) - rect2.bottom;
                        if (TextUtils.equals(this.LJIIIIZZ, "center")) {
                            iHeight2 = height - ((this.LJIILIIL - rect2.height()) / 2);
                            iHeight = (this.LJIILIIL - rect2.height()) / 2;
                        } else {
                            iHeight = this.LJIIJ;
                            iHeight2 = height - iHeight;
                        }
                        if (iHeight2 >= 0) {
                            return;
                        }
                        c1318590kPx2.offsetDescendantRectToMyCoords(this.LJ, rect2);
                        if (c1318590kPx2.getContentHeight() - rect2.bottom >= iHeight) {
                            iHeight = 0;
                        }
                        if (!this.LJIIIZ) {
                            ((ViewGroup) lynxUI.mView).getChildAt(0).setPadding(0, 0, 0, 0);
                            return;
                        }
                        int paddingBottom = childAt2.getPaddingBottom();
                        int i3 = this.LJIIL + iHeight;
                        if (paddingBottom != i3) {
                            c1318590kPx2.setFillViewport(true);
                            childAt2.setPadding(0, 0, 0, this.LJIIL + iHeight);
                            LIZ(c1318590kPx2, iHeight2);
                            return;
                        } else {
                            if (paddingBottom == i3) {
                                LIZ(c1318590kPx2, iHeight2);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }

    public C1321900kVI(LynxBaseInputView lynxBaseInputView) {
        this.LIZ = lynxBaseInputView;
        s sVar = lynxBaseInputView.mContext;
        this.LIZJ = sVar;
        C1321710kUz keyboardEvent = sVar.LJIILJJIL().getKeyboardEvent();
        this.LJFF = keyboardEvent;
        this.LJI = new Rect();
        this.LJIIIIZZ = "end";
        this.LJIIIZ = true;
        this.LJIIJJI = true;
        this.LJIILIIL = -1;
        if (C1298530jtb.LIZ(sVar) != null) {
            if (!keyboardEvent.LIZLLL) {
                if (!C1289620jfE.LIZIZ()) {
                    C1289620jfE.LIZJ(new ARunnableS120S0100000_20(this, 142));
                    return;
                } else {
                    keyboardEvent.LIZJ();
                    LIZJ();
                    return;
                }
            }
            LIZJ();
            return;
        }
        LynxLog.e("LynxInputScrollHelper", "input's smart-scroll doesn't work properly since the context is not an activity");
    }

    public final void LIZ(C1318590kPx c1318590kPx, int i) {
        HandlerHook.viewPost(this.LIZ.mView, new ARunnableS31S0101000_20(i, c1318590kPx, 5));
    }
}
