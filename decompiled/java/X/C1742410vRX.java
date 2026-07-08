package X;

import android.content.Context;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0vRX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1742410vRX {
    public static final C1742410vRX LIZ = new C1742410vRX();
    public static final int LIZIZ = C20642515q3.LJFF().getDisplayMetrics().heightPixels;
    public static final int LIZJ = C20642515q3.LJFF().getDisplayMetrics().widthPixels;

    public static int LIZ() {
        return (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(340)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))) / 2;
    }

    public static int LIZJ() {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(254)) + C341940Daq.LIZ(44.0d) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    }

    public static String LIZIZ(String str) {
        String str2;
        String str3;
        if (Intrinsics.LJFF(str, "auction")) {
            str2 = "b17128";
        } else {
            str2 = "b90718";
        }
        if (Intrinsics.LJFF(str, "auction")) {
            str3 = "c30191";
        } else {
            str3 = "c53863";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("a2270.");
        sbLIZ.append(str2);
        sbLIZ.append('.');
        sbLIZ.append(str3);
        sbLIZ.append(".d0");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static int LIZLLL(Context context) {
        return ((LIZIZ - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(340)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)))) - C341940Daq.LIZ(44.0d)) - C12ES.LJIIJJI(context);
    }

    public static void LJ(Aweme aweme, String str, String str2, String str3, boolean z) {
        String str4;
        String strLJIIIIZZ;
        if (str == null) {
            return;
        }
        StringBuilder sb = new StringBuilder(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("&need_swipe_up_guide=");
        sbLIZ.append(z);
        sb.append(C2188811AlT.LIZIZ(sbLIZ));
        sb.append("&enter_from=homepage_mall&aweme_struct=");
        String strLIZ = null;
        if (aweme != null && (strLJIIIIZZ = C1741890vQh.LJIIIIZZ(aweme)) != null) {
            strLIZ = C010M.LIZ(strLJIIIIZZ);
        }
        sb.append(strLIZ);
        JSONObject jSONObject = new JSONObject();
        if (Intrinsics.LJFF(str3, "auction")) {
            str4 = "rec_auction";
        } else {
            str4 = "rec_trends";
        }
        if (str2 != null && str2.length() > 0) {
            str4 = str2;
        }
        jSONObject.put("source_module", str4);
        String strLIZ2 = C010M.LIZ(C786410Ut5.J3(jSONObject));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("&log_extra=");
        sbLIZ2.append(strLIZ2);
        sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        SmartRouter.buildRoute(C2214201BlK.LJFF(), sb.toString()).open();
    }
}
