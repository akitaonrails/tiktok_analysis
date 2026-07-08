package X;

import android.view.View;
import com.bytedance.poplayer.core.PopupManager;

/* JADX INFO: renamed from: X.0zfh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1904950zfh {
    public static final C1904950zfh LIZ = new C1904950zfh();

    public static void LIZ(C19EG c19eg, String str, String str2) {
        int size;
        EnumC1904890zfb enumC1904890zfbLIZ;
        AbstractC1591090rVT abstractC1591090rVTY01;
        View viewLJIJI;
        if (!PopupManager.LJII(C1246760iY6.class) && (size = ((AbstractC848400XPy) C0XQ7.LJFF()).LJJI().size()) > 1) {
            if (size == 2) {
                boolean zLIZLLL = C849710XUz.LIZLLL();
                EnumC1904890zfb enumC1904890zfb = EnumC1904890zfb.DOUBLE_CLICK;
                boolean zLIZIZ = C1904920zfe.LIZIZ(enumC1904890zfb);
                if (zLIZLLL) {
                    if (!zLIZIZ) {
                        C1904940zfg.LIZ.getClass();
                        enumC1904890zfbLIZ = C1904940zfg.LIZ(enumC1904890zfb);
                    } else {
                        C1904940zfg c1904940zfg = C1904940zfg.LIZ;
                        EnumC1904890zfb enumC1904890zfb2 = EnumC1904890zfb.LONG_PRESS;
                        c1904940zfg.getClass();
                        enumC1904890zfbLIZ = C1904940zfg.LIZ(enumC1904890zfb2);
                    }
                } else {
                    C1904940zfg c1904940zfg2 = C1904940zfg.LIZ;
                    EnumC1904890zfb enumC1904890zfb3 = EnumC1904890zfb.LONG_PRESS;
                    c1904940zfg2.getClass();
                    enumC1904890zfbLIZ = C1904940zfg.LIZ(enumC1904890zfb3);
                }
            } else {
                C1904940zfg c1904940zfg3 = C1904940zfg.LIZ;
                EnumC1904890zfb enumC1904890zfb4 = EnumC1904890zfb.LONG_PRESS;
                c1904940zfg3.getClass();
                enumC1904890zfbLIZ = C1904940zfg.LIZ(enumC1904890zfb4);
                boolean zLIZIZ2 = C1904920zfe.LIZIZ(enumC1904890zfb4);
                if (enumC1904890zfbLIZ != null) {
                    if (zLIZIZ2) {
                        if (C849710XUz.LIZLLL()) {
                            enumC1904890zfbLIZ = C1904940zfg.LIZ(EnumC1904890zfb.DOUBLE_CLICK);
                        } else {
                            return;
                        }
                    }
                } else if (C849710XUz.LIZLLL()) {
                    enumC1904890zfbLIZ = C1904940zfg.LIZ(EnumC1904890zfb.DOUBLE_CLICK);
                } else {
                    return;
                }
            }
            if (enumC1904890zfbLIZ != null && (abstractC1591090rVTY01 = C1591880rWk.LIZIZ.LJIILL(c19eg).y01()) != null && (viewLJIJI = abstractC1591090rVTY01.LJIJI("USER")) != null) {
                PopupManager.LJIJI(new C1904850zfX(c19eg, viewLJIJI, str, str2, enumC1904890zfbLIZ), true);
            }
        }
    }
}
