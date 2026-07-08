package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0DPj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C338650DPj {
    public static final C338650DPj LIZ = new C338650DPj();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4295));

    public static String LIZIZ() {
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        if (iUserService != null) {
            return iUserService.getCurrentUserID();
        }
        return null;
    }

    public static String LIZ(Context context) {
        String str;
        String str2;
        String str3;
        String str4;
        if (C268330AfP.LJIIIZ()) {
            str = "left";
        } else {
            str = "center";
        }
        if (C444960Hcc.LIZJ(context)) {
            str2 = "rtl";
        } else {
            str2 = "ltr";
        }
        if (C960203pA.LIZIZ(context)) {
            str3 = "dark";
        } else {
            str3 = "light";
        }
        if (context.getResources().getDisplayMetrics().densityDpi < 480) {
            str4 = "2x";
        } else {
            str4 = "3x";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://sf16-sg.tiktokcdn.com/obj/eden-sg/beeh7nulwpx/campus_revisit_popup/");
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        sbLIZ.append('_');
        sbLIZ.append(str3);
        sbLIZ.append('@');
        sbLIZ.append(str4);
        sbLIZ.append(".jpg");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean LIZJ(EnumC1231460i9Q enumC1231460i9Q) {
        String strLIZIZ;
        if (((Number) C268520Afi.LIZ.getValue()).intValue() == 1 && (strLIZIZ = LIZIZ()) != null && strLIZIZ.length() != 0) {
            Keva keva = (Keva) LIZIZ.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("campus_revisit_popup_shown_");
            sbLIZ.append(strLIZIZ);
            if (!keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false) && enumC1231460i9Q != EnumC1231460i9Q.EDIT_PROFILE_PAGE) {
                return true;
            }
            return false;
        }
        return false;
    }
}
