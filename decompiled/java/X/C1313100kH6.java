package X;

import android.graphics.PointF;
import android.text.Layout;
import android.text.Spanned;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0kH6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1313100kH6 {
    public static void LIZ(C1316780kN2 c1316780kN2, LynxBaseUI lynxBaseUI) {
        Set set = c1316780kN2.LIZLLL;
        for (LynxBaseUI lynxBaseUI2 : lynxBaseUI.getChildren()) {
            if (lynxBaseUI2 instanceof LynxUI) {
                LynxUI lynxUI = (LynxUI) lynxBaseUI2;
                if (set != null && set.contains(Integer.valueOf(lynxUI.getSign()))) {
                    if (lynxUI.getVisibility()) {
                        lynxUI.setVisibilityForView(4);
                    }
                } else if (!lynxUI.getVisibility()) {
                    lynxUI.setVisibilityForView(0);
                }
            }
        }
    }

    public static void LIZIZ(int i, int i2, String str, Map map) {
        if ((i & i2) == 0) {
            return;
        }
        ((HashMap) map).put(str, null);
    }

    public static InterfaceC1311410kEN LIZLLL(LynxBaseUI lynxBaseUI, float f, float f2, InterfaceC1311410kEN interfaceC1311410kEN, boolean z) {
        if (interfaceC1311410kEN instanceof C1311630kEj) {
            for (LynxBaseUI lynxBaseUI2 : lynxBaseUI.getChildren()) {
                if (lynxBaseUI2.getSign() == interfaceC1311410kEN.getSign()) {
                    return lynxBaseUI2.hitTest(f - lynxBaseUI2.getOriginLeft(), f2 - lynxBaseUI2.getOriginTop(), z);
                }
            }
        }
        return interfaceC1311410kEN;
    }

    public static InterfaceC1311410kEN LIZJ(LynxBaseUI lynxBaseUI, float f, float f2, InterfaceC1311410kEN interfaceC1311410kEN, Layout layout, Spanned spanned, PointF pointF, InterfaceC1312730kGV interfaceC1312730kGV, boolean z) {
        C1311620kEi[] c1311620kEiArr;
        C1311620kEi c1311620kEi;
        HashMap map = null;
        int i = 0;
        if (interfaceC1312730kGV != null) {
            int[] iArrYa = interfaceC1312730kGV.ya(f, f2);
            if (iArrYa != null && iArrYa.length >= 3) {
                int i2 = iArrYa[0];
                int i3 = iArrYa[1];
                if (iArrYa[2] != 0) {
                    i = 1;
                } else if (i2 == interfaceC1311410kEN.getSign()) {
                    return interfaceC1311410kEN;
                }
                if (i3 != 0) {
                    HashMap map2 = new HashMap();
                    LIZIZ(i3, 1, "tap", map2);
                    LIZIZ(i3, 2, "click", map2);
                    LIZIZ(i3, 4, "longpress", map2);
                    LIZIZ(i3, 8, "touchstart", map2);
                    LIZIZ(i3, 16, "touchmove", map2);
                    LIZIZ(i3, 32, "touchend", map2);
                    LIZIZ(i3, 64, "touchcancel", map2);
                    if (!map2.isEmpty()) {
                        map = map2;
                    }
                }
                if (i != 0) {
                    EnumC1311650kEl enumC1311650kEl = EnumC1311650kEl.Undefined;
                    c1311620kEi = new C1311630kEj(i2, map, enumC1311650kEl, true, enumC1311650kEl, EnumC1311640kEk.Unset, new JavaOnlyMap());
                } else {
                    EnumC1311650kEl enumC1311650kEl2 = EnumC1311650kEl.Undefined;
                    c1311620kEi = new C1311620kEi(i2, map, enumC1311650kEl2, true, enumC1311650kEl2, EnumC1311640kEk.Unset, new JavaOnlyMap());
                }
                c1311620kEi.LLILLL = new WeakReference<>(interfaceC1311410kEN);
                return LIZLLL(lynxBaseUI, f, f2, c1311620kEi, z);
            }
            return interfaceC1311410kEN;
        }
        if (layout != null && f <= layout.getWidth() && f2 <= layout.getHeight()) {
            int lineForVertical = layout.getLineForVertical((int) f2);
            int paragraphDirection = layout.getParagraphDirection(lineForVertical);
            float f3 = f - pointF.x;
            float f4 = f2 - pointF.y;
            if (f4 <= layout.getLineBottom(lineForVertical) && f4 >= layout.getLineTop(lineForVertical) && f3 >= layout.getLineLeft(lineForVertical) && f3 <= layout.getLineRight(lineForVertical)) {
                int iU3 = C786410Ut5.U3(layout, lineForVertical, f3);
                float primaryHorizontal = layout.getPrimaryHorizontal(iU3);
                if (paragraphDirection != 1 ? f3 >= primaryHorizontal : f3 < primaryHorizontal) {
                    iU3--;
                }
                if (spanned != null && (c1311620kEiArr = (C1311620kEi[]) spanned.getSpans(iU3, iU3, C1311620kEi.class)) != null && c1311620kEiArr.length != 0) {
                    int length = spanned.length();
                    int length2 = c1311620kEiArr.length;
                    InterfaceC1311410kEN interfaceC1311410kEN2 = interfaceC1311410kEN;
                    int i4 = 0;
                    while (i < length2) {
                        C1311620kEi c1311620kEi2 = c1311620kEiArr[i];
                        c1311620kEi2.getClass();
                        c1311620kEi2.LLILLL = new WeakReference<>(interfaceC1311410kEN);
                        int spanStart = spanned.getSpanStart(c1311620kEi2);
                        int spanEnd = spanned.getSpanEnd(c1311620kEi2);
                        if (iU3 >= spanStart && iU3 <= spanEnd && spanStart >= i4 && spanEnd <= length) {
                            c1311620kEi2.LLILLL = new WeakReference<>(interfaceC1311410kEN);
                            interfaceC1311410kEN2 = c1311620kEi2;
                        }
                        i++;
                        i4 = spanStart;
                        length = spanEnd;
                    }
                    return LIZLLL(lynxBaseUI, f, f2, interfaceC1311410kEN2, z);
                }
            }
        }
        return interfaceC1311410kEN;
    }
}
