package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.05ys, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1530005ys {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZ(C0Y8T c0y8t) {
        C0Y8Y coreInfo;
        Map<String, String> ext;
        String str;
        String strLIZIZ = C461720I8s.LIZIZ();
        if (c0y8t != null && (coreInfo = c0y8t.getCoreInfo()) != null && (ext = coreInfo.getExt()) != null) {
            C13DA c13da = new C13DA();
            String str2 = ext.get("a:conv_entrance_log");
            if (str2 != null && str2.length() > 0) {
                c13da.put("conv_entrance_log", str2);
            }
            String str3 = ext.get("multi_send_msg_user_ids");
            if (str3 != null && a0.LJJIIZI(str3, strLIZIZ, false)) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c13da.put("is_send_msg", str);
            return c13da.build();
        }
        return C2097608Jq.LJ();
    }
}
