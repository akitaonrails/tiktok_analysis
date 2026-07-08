package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0JLw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C490620JLw {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str) {
        return GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, C2097608Jq.LJIIIIZZ(new Pair("a:sq_id", str), new Pair("a:set_by", "live"), new Pair("a:landing_msg_type", "suggested_question")));
    }

    public static String LIZIZ(String str, String str2, String str3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("&input_auto_filled_sync_ext=");
        sbLIZ.append(Uri.encode(str3));
        sbLIZ.append("&input_auto_filled_awe_type=");
        sbLIZ.append(711);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append("&input_auto_filled_content=");
        sbLIZ2.append(Uri.encode(str2));
        return C2188811AlT.LIZIZ(sbLIZ2);
    }
}
