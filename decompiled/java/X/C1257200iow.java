package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0iow, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1257200iow {
    public static C1257530ipT LIZ(int i, Context context, C1257500ipQ c1257500ipQ) {
        C1257530ipT c1257530ipT;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (C1ELC.LIZLLL() && C20673215v0.LIZIZ(context, "profile_view_tab_additional_support_layout")) {
            c1257530ipT = (C1257530ipT) C20673215v0.LJFF(context, context, R.layout.ejj, c1257500ipQ, false);
        } else {
            c1257530ipT = (C1257530ipT) C786410Ut5.Td(C786410Ut5.ne(context), R.layout.ejj, c1257500ipQ, false);
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getProfileTabAdditionalSupportView cost time: ");
        sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
        C1720106oR.LJI("Profile_MusProfileTabFactory", C2188811AlT.LIZIZ(sbLIZ));
        c1257530ipT.setImageResource(i);
        c1257530ipT.setAdditionalSupportImageResource(R.raw.icon_arrow_triangle_down_large_fill);
        c1257530ipT.setAnimationEnabled(true);
        C428150Gqb.LIZ(c1257530ipT, EnumC428940Grs.ALPHA, 0.0f);
        return c1257530ipT;
    }
}
