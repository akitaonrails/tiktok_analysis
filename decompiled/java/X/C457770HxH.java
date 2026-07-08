package X;

import android.app.Activity;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0HxH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C457770HxH {
    public static final /* synthetic */ C457770HxH LIZ = new C457770HxH();

    public static void LIZ(ViewGroup viewGroup, Function0 function0) {
        boolean zLIZJ = C457760HxG.LIZJ();
        boolean zLIZIZ = C457760HxG.LIZIZ(false);
        if (zLIZJ) {
            if (zLIZIZ) {
                Activity activityLIZ = C1388190mED.LIZ(viewGroup.getContext());
                if (activityLIZ != null) {
                    C2274381E0m.LIZIZ.LJI(activityLIZ);
                }
                C2274381E0m.LIZIZ.LIZ("sticker_panel", true);
            } else {
                C2274381E0m c2274381E0m = C2274381E0m.LIZIZ;
                c2274381E0m.LJ();
                c2274381E0m.LIZ("sticker_panel", false);
            }
        }
        function0.invoke();
    }
}
