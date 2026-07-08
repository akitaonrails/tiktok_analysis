package X;

import com.bytedance.android.livesdk.livesetting.security.LiveApiZtiConfigSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.client.Request;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.text.u;

/* JADX INFO: renamed from: X.07d5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1904507d5 {
    public static Boolean LIZ(String str) {
        if (str != null && str.length() != 0) {
            if (!u.LJJIIJZLJL(str, "/", false)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('/');
                sbLIZ.append(str);
                str = C2188811AlT.LIZIZ(sbLIZ);
            }
            if (u.LJIIZILJ(str, "/", false)) {
                str = str.substring(0, str.length() - 1);
            }
            return LiveApiZtiConfigSetting.INSTANCE.getValue().get(str);
        }
        return null;
    }

    public static Request LIZIZ(Request request) {
        Boolean boolLIZ = LIZ(request.getPath());
        if (boolLIZ != null) {
            boolean zBooleanValue = boolLIZ.booleanValue();
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(request.getHeaders());
            arrayList.add(new C080U("tt-ticket-guard-enabled", String.valueOf(zBooleanValue)));
            C0XMB c0xmbNewBuilder = request.newBuilder();
            c0xmbNewBuilder.LIZJ = arrayList;
            return c0xmbNewBuilder.LIZ();
        }
        return request;
    }

    public static void LIZJ(String str, Map map) {
        Boolean boolLIZ;
        if (str != null && (boolLIZ = LIZ(UriProtector.parse(str).getPath())) != null) {
            ((HashMap) map).put("tt-ticket-guard-enabled", String.valueOf(boolLIZ.booleanValue()));
        }
    }
}
