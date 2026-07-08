package X;

import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIBody;
import j27.s;

/* JADX INFO: renamed from: X.0jjr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1292490jjr {
    public static PointF LIZIZ(UIBody uIBody, PointF pointF) {
        View view;
        if (uIBody == null) {
            LynxLog.e("LynxUIHelper", "convertPointFromUIToScreen failed since ui is null");
            return pointF;
        }
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        if (uIBody.isFlatten()) {
            pointF2.x += uIBody.getLeft();
            pointF2.y += uIBody.getTop();
            if (uIBody.getDrawParent() == null) {
                LynxLog.e("LynxUIHelper", "mDrawParent of flattenUI is null, which causes the value convertPointFromUIToScreen returns is not the correct coordinates relative to the screen!");
                return pointF;
            }
            view = ((LynxUI) uIBody.getDrawParent()).mView;
            pointF2.x -= view.getScrollX();
            pointF2.y -= view.getScrollY();
        } else {
            view = uIBody.mView;
        }
        return C1292480jjq.LIZIZ(pointF2, view, view.getRootView());
    }

    public static RectF LIZLLL(LynxBaseUI lynxBaseUI, RectF rectF) {
        s sVar = lynxBaseUI.mContext;
        if (sVar == null) {
            LynxLog.e("LynxUIHelper", "convertRectFromUIToRootUI failed since context is null");
            return rectF;
        }
        UIBody uIBody = sVar.LLJILJILJ;
        if (uIBody == null) {
            LynxLog.e("LynxUIHelper", "convertRectFromUIToRootUI failed since rootUI is null");
            return rectF;
        }
        return LIZJ(lynxBaseUI, uIBody, rectF);
    }

    public static RectF LJ(LynxBaseUI lynxBaseUI, RectF rectF) {
        View view;
        if (lynxBaseUI == null) {
            LynxLog.e("LynxUIHelper", "convertRectFromUIToScreen failed since ancestor or descendant is null");
            return rectF;
        }
        RectF rectF2 = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
        if (lynxBaseUI.isFlatten()) {
            rectF2.left += lynxBaseUI.getLeft();
            rectF2.top += lynxBaseUI.getTop();
            if (lynxBaseUI.getDrawParent() == null) {
                LynxLog.e("LynxUIHelper", "mDrawParent of flattenUI is null, which causes the value convertRectFromUIToScreen returns is not the correct coordinates relative to the screen!");
                return rectF;
            }
            view = ((LynxUI) lynxBaseUI.getDrawParent()).mView;
            rectF2.left -= view.getScrollX();
            rectF2.top -= view.getScrollY();
            rectF2.right = rectF2.left + rectF.width();
            rectF2.bottom = rectF2.top + rectF.height();
        } else {
            view = ((LynxUI) lynxBaseUI).mView;
        }
        return C1292480jjq.LJ(view, view.getRootView(), rectF2);
    }

    public static RectF LJFF(LynxBaseUI lynxBaseUI, ReadableMap readableMap) {
        String string;
        if (readableMap != null && readableMap.getBoolean("androidEnableTransformProps", false)) {
            LynxBaseUI lynxBaseUILJIIL = null;
            if (readableMap.hasKey("relativeTo") && readableMap.getString("relativeTo") != null) {
                string = readableMap.getString("relativeTo");
            } else {
                string = null;
            }
            if (lynxBaseUI != null && string != null) {
                InterfaceC1313090kH5 interfaceC1313090kH5 = lynxBaseUI.mParent;
                while (true) {
                    LynxBaseUI lynxBaseUI2 = (LynxBaseUI) interfaceC1313090kH5;
                    if (lynxBaseUI2 instanceof LynxBaseUI) {
                        if (string.equals(lynxBaseUI2.getIdSelector())) {
                            lynxBaseUILJIIL = lynxBaseUI2;
                            break;
                        }
                        interfaceC1313090kH5 = lynxBaseUI2.mParent;
                    } else {
                        s sVar = lynxBaseUI.mContext;
                        if (sVar == null) {
                            LynxLog.e("LynxUIHelper", "getRelativeUI failed since context is null");
                        } else if (sVar.LJIILIIL() == null) {
                            LynxLog.e("LynxUIHelper", "getRelativeUI failed since uiowner is null");
                        } else {
                            lynxBaseUILJIIL = lynxBaseUI.mContext.LJIILIIL().LJIIL(string);
                        }
                    }
                }
            } else {
                LynxLog.e("LynxUIHelper", "getRelativeUI failed since ui or relativeID is null");
            }
            if ("screen".equals(string)) {
                return LJ(lynxBaseUI, new RectF(0.0f, 0.0f, lynxBaseUI.getWidth(), lynxBaseUI.getHeight()));
            }
            if (lynxBaseUILJIIL != null) {
                return LIZJ(lynxBaseUI, lynxBaseUILJIIL, new RectF(0.0f, 0.0f, lynxBaseUI.getWidth(), lynxBaseUI.getHeight()));
            }
            return LIZLLL(lynxBaseUI, new RectF(0.0f, 0.0f, lynxBaseUI.getWidth(), lynxBaseUI.getHeight()));
        }
        return new RectF(lynxBaseUI.getBoundingClientRect());
    }

    public static int LJI(float f, s sVar) {
        if (sVar != null && sVar.getResources() != null && sVar.getResources().getDisplayMetrics() != null) {
            return (int) (((double) (f / sVar.getResources().getDisplayMetrics().density)) + 0.5d);
        }
        return (int) f;
    }

    public static PointF LIZ(UIBody uIBody, LynxBaseUI lynxBaseUI, PointF pointF) {
        View view;
        View view2;
        float scrollY;
        if (uIBody == null) {
            LynxLog.e("LynxUIHelper", "convertPointFromUIToAnotherUI failed since ui is null");
            return pointF;
        }
        if (lynxBaseUI == null) {
            LynxLog.e("LynxUIHelper", "convertPointFromUIToAnotherUI failed since another ui is null");
            return pointF;
        }
        if (uIBody == lynxBaseUI) {
            return pointF;
        }
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        if (uIBody.isFlatten()) {
            pointF2.x += uIBody.getLeft();
            pointF2.y += uIBody.getTop();
            if (uIBody.getDrawParent() == null) {
                LynxLog.e("LynxUIHelper", "mDrawParent of flattenUI is null, which causes the value convertPointFromUIToAnotherUI returns is not the correct coordinates relative to the another ui!");
                return pointF;
            }
            view = ((LynxUI) uIBody.getDrawParent()).mView;
            pointF2.x -= view.getScrollX();
            pointF2.y -= view.getScrollY();
        } else {
            view = uIBody.mView;
        }
        float scrollX = 0.0f;
        if (lynxBaseUI.isFlatten()) {
            float left = lynxBaseUI.getLeft() + 0.0f;
            float top = lynxBaseUI.getTop() + 0.0f;
            if (lynxBaseUI.getDrawParent() == null) {
                LynxLog.e("LynxUIHelper", "mDrawParent of flattenUI is null, which causes the value convertPointFromUIToAnotherUI returns is not the correct coordinates relative to the another ui!");
                return pointF;
            }
            view2 = ((LynxUI) lynxBaseUI.getDrawParent()).mView;
            scrollX = left - view2.getScrollX();
            scrollY = top - view2.getScrollY();
        } else {
            view2 = ((LynxUI) lynxBaseUI).mView;
            scrollY = 0.0f;
        }
        PointF pointFLIZJ = C1292480jjq.LIZJ(pointF2, view, view2);
        pointFLIZJ.offset(-scrollX, -scrollY);
        return pointFLIZJ;
    }

    public static RectF LIZJ(LynxBaseUI lynxBaseUI, LynxBaseUI lynxBaseUI2, RectF rectF) {
        View view;
        View view2;
        float scrollY;
        if (lynxBaseUI == null) {
            LynxLog.e("LynxUIHelper", "convertRectFromUIToRootUI failed since descendant is null");
            return rectF;
        }
        if (lynxBaseUI == lynxBaseUI2) {
            return rectF;
        }
        RectF rectF2 = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
        if (lynxBaseUI.isFlatten()) {
            rectF2.left += lynxBaseUI.getLeft();
            rectF2.top += lynxBaseUI.getTop();
            if (lynxBaseUI.getDrawParent() == null) {
                LynxLog.e("LynxUIHelper", "mDrawParent of flattenUI is null, which causes the value convertRectFromUIToAnotherUI returns is not the correct coordinates relative to the another ui!");
                return rectF;
            }
            view = ((LynxUI) lynxBaseUI.getDrawParent()).mView;
            rectF2.left -= view.getScrollX();
            rectF2.top -= view.getScrollY();
            rectF2.right = rectF2.left + rectF.width();
            rectF2.bottom = rectF2.top + rectF.height();
        } else {
            view = ((LynxUI) lynxBaseUI).mView;
        }
        float scrollX = 0.0f;
        if (lynxBaseUI2.isFlatten()) {
            float left = lynxBaseUI2.getLeft() + 0.0f;
            float top = lynxBaseUI2.getTop() + 0.0f;
            if (lynxBaseUI2.getDrawParent() == null) {
                LynxLog.e("LynxUIHelper", "mDrawParent of flattenUI is null, which causes the value convertRectFromUIToAnotherUI returns is not the correct coordinates relative to the another ui!");
                return rectF;
            }
            view2 = ((LynxUI) lynxBaseUI2.getDrawParent()).mView;
            scrollX = left - view2.getScrollX();
            scrollY = top - view2.getScrollY();
        } else {
            view2 = ((LynxUI) lynxBaseUI2).mView;
            scrollY = 0.0f;
        }
        if (view != null && view2 != null) {
            if (view != view2) {
                if (C1292480jjq.LJFF(view, view2)) {
                    rectF2 = C1292480jjq.LIZLLL(view, view2, rectF2);
                } else if (C1292480jjq.LJFF(view2, view)) {
                    rectF2 = C1292480jjq.LJ(view, view2, rectF2);
                } else {
                    rectF2 = C1292480jjq.LIZLLL(view2.getRootView(), view2, C1292480jjq.LJ(view, view.getRootView(), rectF2));
                }
            }
        } else {
            LynxLog.e("ViewHelper", "convertRectFromViewToAnother failed since view or another is null");
        }
        rectF2.offset(-scrollX, -scrollY);
        return rectF2;
    }
}
