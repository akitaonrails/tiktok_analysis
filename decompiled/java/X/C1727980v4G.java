package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0v4G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1727980v4G {
    public static final void LIZ(C1749190vcT c1749190vcT, View view, C1727990v4H c1727990v4H) {
        String strLIZIZ;
        if (c1727990v4H.LJFF) {
            String str = c1727990v4H.LIZJ;
            Context context = c1749190vcT.getContext();
            if (C426750GoL.LJFF()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("* ");
                sbLIZ.append(str);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append(" *");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            SpannableString spannableString = new SpannableString(strLIZIZ);
            if (context != null) {
                int iLJJIZ = a0.LJJIZ(strLIZIZ, '*', 0, false, 6);
                C786410Ut5.p2(spannableString, new ForegroundColorSpan(C14MF.LIZIZ(R.attr.f00, context)), iLJJIZ, iLJJIZ + 1, 33);
            }
            c1749190vcT.LJII(spannableString);
        } else {
            c1749190vcT.LJII(c1727990v4H.LIZJ);
        }
        c1749190vcT.setFormField(view);
    }
}
