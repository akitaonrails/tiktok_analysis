package X;

import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.08Co, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2079208Co implements AttachUserData {
    public static final List<String> LIZ;

    static {
        C2079208Co c2079208Co = new C2079208Co();
        LIZ = new ArrayList();
        Npth.addAttachUserData(c2079208Co, CrashType.ALL);
    }

    public static void LIZ(String str) {
        if (u.LJJIIJZLJL(str, "http://", false) || u.LJJIIJZLJL(str, "https://", false)) {
            Npth.addTag("web_url", str);
            Npth.addTag("web_url_no_query", (String) C13LP.LJJJJZI(a0.LJJLIIIJILLIZJL(str, new String[]{"?"}, 0, 6)));
            ((ArrayList) LIZ).add(str);
        }
    }

    @Override // com.bytedance.crash.AttachUserData
    public final Map<? extends String, ? extends String> getUserData(CrashType crashType) {
        return C2097608Jq.LJIIJ(new Pair("webview_url_list", LIZ.toString()));
    }
}
