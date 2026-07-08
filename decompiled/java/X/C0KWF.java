package X;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.bytedance.ies.ugc.aweme.rich.impression.api.edge2edge.Edge2EdgeApi;
import com.ss.android.ugc.aweme.commercialize.measurement.common.CommerceEdge2EdgeImpl;

/* JADX INFO: renamed from: X.0KWF, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KWF {
    public static int LIZ;
    public static int LIZIZ;
    public static final Edge2EdgeApi LIZJ;

    static {
        Edge2EdgeApi edge2EdgeApi;
        Object objLIZ = C04TD.LIZ(Edge2EdgeApi.class, false);
        if (objLIZ != null) {
            edge2EdgeApi = (Edge2EdgeApi) objLIZ;
        } else {
            if (C04TD.LLLIIL == null) {
                synchronized (Edge2EdgeApi.class) {
                    if (C04TD.LLLIIL == null) {
                        C04TD.LLLIIL = new CommerceEdge2EdgeImpl();
                    }
                }
            }
            edge2EdgeApi = C04TD.LLLIIL;
        }
        LIZJ = edge2EdgeApi;
    }

    public static int LIZ(Context context) {
        int i = LIZIZ;
        if (i != 0) {
            return i;
        }
        Edge2EdgeApi edge2EdgeApi = LIZJ;
        if (edge2EdgeApi != null && edge2EdgeApi.LIZ()) {
            Rect rectLIZ = C0IO4.LIZ(context);
            LIZ = rectLIZ.width();
            int iHeight = rectLIZ.height();
            LIZIZ = iHeight;
            if (LIZ != 0 && iHeight != 0) {
                return iHeight;
            }
        }
        WindowManager windowManager = (WindowManager) C786410Ut5.H2(context, "window");
        if (windowManager != null) {
            Point point = new Point();
            C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YsGxLrjrnefn6WvofFe5V6Gw2EWE1prX9z9ZoO+131uf+kaQ7jxt6BE77JyIphdhN", null)).getSize(point);
            LIZ = point.x;
            LIZIZ = point.y;
        }
        if (LIZ == 0 || LIZIZ == 0) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            LIZ = displayMetrics.widthPixels;
            LIZIZ = displayMetrics.heightPixels;
        }
        return LIZIZ;
    }

    public static int LIZIZ(Context context) {
        int i = LIZ;
        if (i != 0) {
            return i;
        }
        Edge2EdgeApi edge2EdgeApi = LIZJ;
        if (edge2EdgeApi != null && edge2EdgeApi.LIZ()) {
            Rect rectLIZ = C0IO4.LIZ(context);
            LIZ = rectLIZ.width();
            int iHeight = rectLIZ.height();
            LIZIZ = iHeight;
            int i2 = LIZ;
            if (i2 != 0 && iHeight != 0) {
                return i2;
            }
        }
        WindowManager windowManager = (WindowManager) C786410Ut5.H2(context, "window");
        if (windowManager != null) {
            Point point = new Point();
            C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YsGxLrjrnefn6WvofFe5V6Gw2EWE1prX9z9ZoO+131uf+kaQ7jxt6BE77JyIphdhN", null)).getSize(point);
            LIZ = point.x;
            LIZIZ = point.y;
        }
        if (LIZ == 0 || LIZIZ == 0) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            LIZ = displayMetrics.widthPixels;
            LIZIZ = displayMetrics.heightPixels;
        }
        return LIZ;
    }
}
