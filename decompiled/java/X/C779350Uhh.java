package X;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.android.livesdk.livesetting.broadcast.GameFloatTipsEdge2Edge;

/* JADX INFO: renamed from: X.0Uhh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C779350Uhh {
    public static WindowManager LIZ;
    public static final Point LIZIZ = new Point();

    public static final int LIZ() {
        Configuration configuration;
        Integer numValueOf;
        if (Build.VERSION.SDK_INT < 35 || !GameFloatTipsEdge2Edge.INSTANCE.isEnable()) {
            return LIZJ();
        }
        int iLIZJ = LIZJ();
        Resources resourcesLJIILJJIL = C497740JfY.LJIILJJIL();
        return (resourcesLJIILJJIL == null || (configuration = resourcesLJIILJJIL.getConfiguration()) == null || (numValueOf = Integer.valueOf(configuration.orientation)) == null || numValueOf.intValue() != 2) ? iLIZJ - C497740JfY.LJIJ() : iLIZJ;
    }

    public static final int LIZIZ() {
        Configuration configuration;
        Integer numValueOf;
        if (Build.VERSION.SDK_INT < 35 || !GameFloatTipsEdge2Edge.INSTANCE.isEnable()) {
            return LIZLLL();
        }
        int iLIZLLL = LIZLLL();
        Resources resourcesLJIILJJIL = C497740JfY.LJIILJJIL();
        return (resourcesLJIILJJIL == null || (configuration = resourcesLJIILJJIL.getConfiguration()) == null || (numValueOf = Integer.valueOf(configuration.orientation)) == null || numValueOf.intValue() != 2) ? iLIZLLL : iLIZLLL - C497740JfY.LJIJ();
    }

    public static final int LIZJ() {
        Context contextN3;
        if (LIZ == null) {
            Context contextLJII = C497740JfY.LJII();
            Object objH2 = (contextLJII == null || (contextN3 = C786410Ut5.N3(contextLJII)) == null) ? null : C786410Ut5.H2(contextN3, "window");
            LIZ = objH2 instanceof WindowManager ? (WindowManager) objH2 : null;
        }
        WindowManager windowManager = LIZ;
        if (windowManager == null) {
            return C497740JfY.LJIILLIIL();
        }
        Display displayLLILZIL = C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl7Cugu7MyFf9A4/HWWwV5Pcxu60PMS15pSSfb84zHJ6VV", null));
        if (displayLLILZIL != null) {
            displayLLILZIL.getSize(LIZIZ);
        }
        return LIZIZ.y;
    }

    public static final int LIZLLL() {
        Context contextN3;
        if (LIZ == null) {
            Context contextLJII = C497740JfY.LJII();
            Object objH2 = (contextLJII == null || (contextN3 = C786410Ut5.N3(contextLJII)) == null) ? null : C786410Ut5.H2(contextN3, "window");
            LIZ = objH2 instanceof WindowManager ? (WindowManager) objH2 : null;
        }
        WindowManager windowManager = LIZ;
        if (windowManager == null) {
            return C497740JfY.LJIIZILJ();
        }
        Display displayLLILZIL = C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl7Cugu7MyFf9A4/HWWwV5Pcxu60PMS15pSSfb84zHJ6VV", null));
        if (displayLLILZIL != null) {
            displayLLILZIL.getSize(LIZIZ);
        }
        return LIZIZ.x;
    }
}
