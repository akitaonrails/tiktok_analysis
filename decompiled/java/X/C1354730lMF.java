package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lMF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1354730lMF {
    public static final boolean LIZ = C295880Bik.LIZIZ;
    public static final boolean LIZIZ = C295880Bik.LIZJ;
    public static String LIZJ;

    public static Map LIZ() {
        return Intrinsics.LJFF(LIZJ, "graphic_detail") ? C2097608Jq.LJ() : LIZ ? C2097908Jt.LIZJ(new Pair("force_theme_style", "light")) : LIZIZ ? C2097908Jt.LIZJ(new Pair("force_theme_style", "dark")) : C2097608Jq.LJ();
    }

    public static Context LIZIZ(Context context) {
        if (!Intrinsics.LJFF(LIZJ, "graphic_detail")) {
            if (LIZ) {
                return new C1361400lX0(context, R.style.y3);
            }
            if (LIZIZ) {
                return new C1361400lX0(context, R.style.y0);
            }
        }
        return context;
    }
}
