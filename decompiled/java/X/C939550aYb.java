package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestRemoveDividingLineSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.BugFixLayoutContainerLayerSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aYb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C939550aYb {
    public static boolean LIZ;
    public static String LIZIZ;
    public static String LIZJ;

    public static void LJFF() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (LIZLLL()) {
            linkedHashMap.put("p", "seamless");
        }
        linkedHashMap.put("b", "3");
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            interfaceC954180awCLLJLL.LJJIIZI("lp", linkedHashMap, true);
        }
    }

    public static boolean LIZJ() {
        return LinkCoreModelKt.currentUserIsAnchor() || MultiGuestRemoveDividingLineSetting.INSTANCE.getValue() == 1;
    }

    public static boolean LIZLLL() {
        if (LinkCoreModelKt.currentUserIsAnchor()) {
            return true;
        }
        return C930540aK4.LJFF() ? MultiGuestRemoveDividingLineSetting.INSTANCE.isEnable() : LIZ && MultiGuestRemoveDividingLineSetting.INSTANCE.isEnable();
    }

    public static void LJ(String str, Map map) {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        if (Intrinsics.LJFF(LIZIZ, str)) {
            return;
        }
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL();
        } else {
            interfaceC937900aVwLLIIJLIL = null;
        }
        if (map != null) {
            try {
                Map map2 = (Map) map.get("lp");
                if (map2 != null) {
                    String str2 = (String) map2.get("p");
                    if (str2 != null && interfaceC937900aVwLLIIJLIL != null) {
                        interfaceC937900aVwLLIIJLIL.LJLL(str2);
                    }
                    if (((String) map2.get("b")) != null) {
                        MultiGuestRemoveDividingLineSetting multiGuestRemoveDividingLineSetting = MultiGuestRemoveDividingLineSetting.INSTANCE;
                        LIZJ = String.valueOf(multiGuestRemoveDividingLineSetting.getValue());
                        int value = multiGuestRemoveDividingLineSetting.getValue();
                        boolean z = true;
                        if (value != 1 && value != 3) {
                            z = false;
                        }
                        LIZ = z;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJ("parseSeiToRemoveDividingLineSetting", e.toString());
                return;
            }
        }
        LIZIZ = str;
    }

    public static FrameLayout.LayoutParams LIZ(Context context, Rect rect, Rect rect2, boolean z) {
        int i;
        int iWidth;
        int iHeight;
        int iHeight2;
        Resources resources;
        DisplayMetrics displayMetrics;
        if ((rect.width() != 0 || rect.height() != 0) && rect2 != null) {
            if (context != null && (resources = context.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                i = (int) displayMetrics.density;
            } else {
                i = 0;
            }
            Rect rect3 = new Rect();
            if (z) {
                int i2 = rect.left - rect2.left;
                rect3.left = i2;
                rect3.top = rect.top - rect2.top;
                rect3.right = i2 + rect.width();
                rect3.bottom = rect3.top + rect.height();
            } else {
                rect3.set(rect);
            }
            if (rect3.right + i <= rect2.width()) {
                iWidth = rect3.width() + i;
            } else {
                iWidth = rect3.width();
            }
            if (rect3.bottom + i > rect2.height() ? (iHeight = rect3.height()) <= (iHeight2 = rect2.height() - rect3.top) : (iHeight2 = rect3.height() + i) > (iHeight = rect2.height() - rect3.top)) {
                iHeight2 = iHeight;
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iWidth, iHeight2);
            layoutParams.leftMargin = rect.left;
            layoutParams.topMargin = rect.top;
            return layoutParams;
        }
        return new FrameLayout.LayoutParams(rect.width(), rect.height());
    }

    public static FrameLayout.LayoutParams LIZIZ(Context context, Rect rect, Rect rect2, InterfaceC937900aVw interfaceC937900aVw) {
        int i;
        int iWidth;
        int iHeight;
        int iWidth2;
        ViewGroup viewGroupLLILLIZIL;
        InterfaceC954180awC interfaceC954180awCLLJLL;
        Resources resources;
        DisplayMetrics displayMetrics;
        if ((rect.width() != 0 || rect.height() != 0) && rect2 != null) {
            boolean zLJJ = false;
            if (context != null && (resources = context.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                i = (int) displayMetrics.density;
            } else {
                i = 0;
            }
            Rect rect3 = new Rect();
            rect3.set(rect);
            if (rect3.right + i <= rect2.width()) {
                iWidth = rect3.width() + i;
            } else {
                iWidth = rect3.width();
            }
            if (rect3.bottom + i <= rect2.height()) {
                iHeight = rect3.height() + i;
            } else {
                iHeight = rect3.height();
            }
            if (BugFixLayoutContainerLayerSetting.INSTANCE.isEnable()) {
                if ((interfaceC937900aVw != null || ((interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL()) != null && (interfaceC937900aVw = interfaceC954180awCLLJLL.LLIIJLIL()) != null)) && (viewGroupLLILLIZIL = interfaceC937900aVw.LLILLIZIL()) != null && viewGroupLLILLIZIL.getLayoutDirection() == 1) {
                    zLJJ = true;
                }
            } else {
                zLJJ = C497740JfY.LJJ();
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iWidth, iHeight);
            if (zLJJ) {
                iWidth2 = rect2.width() - rect.right;
            } else {
                iWidth2 = rect.left;
            }
            layoutParams.setMarginStart(iWidth2);
            layoutParams.topMargin = rect.top;
            return layoutParams;
        }
        return new FrameLayout.LayoutParams(rect.width(), rect.height());
    }
}
