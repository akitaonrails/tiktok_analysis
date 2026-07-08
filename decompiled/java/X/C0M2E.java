package X;

import android.content.Context;
import android.content.res.Resources;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0M2E, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M2E {
    public static final C0M2E LIZ = new C0M2E();

    public static void LIZIZ(int i, String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", str);
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LIZJ(i, "draft_cnt");
        C20684815ws.LJIILLIIL("draft_delete_confirm_popup", c2344009Gk.LIZ);
    }

    public static String LIZ(int i, long j, Context context, String str) {
        Pair pair;
        int i2;
        Boolean bool = Boolean.TRUE;
        if (j < 0) {
            pair = new Pair("", "");
        } else {
            double d = j;
            double d2 = d / 1048576.0d;
            if (Intrinsics.LJFF(bool, bool) || d < 1.073741824E9d) {
                pair = new Pair(C786410Ut5.j4("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d2)}, 1)), "MB");
            } else {
                pair = new Pair(C786410Ut5.j4("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d2 / ((double) 1024))}, 1)), "GB");
            }
        }
        if (Intrinsics.LJFF(str, "managedrafts")) {
            return context.getResources().getQuantityString(2131755035, i, pair.getFirst());
        }
        Resources resources = context.getResources();
        if (C297750Bll.LIZ()) {
            i2 = 2131755278;
        } else {
            i2 = 2131755277;
        }
        return resources.getQuantityString(i2, i, pair.getFirst(), pair.getSecond());
    }
}
