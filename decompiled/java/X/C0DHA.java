package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0DHA, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DHA {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(Context context, String str) {
        if (str == null || !(!a0.LJJJIL(str))) {
            str = "UIShapePrimary";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tux://color?token=");
        sbLIZ.append(str);
        sbLIZ.append("&from=commerce-ucp_pdp_buy_now_button_color");
        Integer numLJ = C2248361CzK.LJ(context, C2188811AlT.LIZIZ(sbLIZ));
        if (numLJ != null) {
            return numLJ.intValue();
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a04, context);
        if (numLIZJ != null) {
            return numLIZJ.intValue();
        }
        return -119723;
    }
}
