package X;

import android.net.Uri;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0KYM, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public class C0KYM {
    public static final /* synthetic */ int LIZJ = 0;
    public final Map<String, String> LIZ = new HashMap();
    public final Uri.Builder LIZIZ = new Uri.Builder().scheme("sslocal");

    public final Uri LIZ() {
        String strLIZIZ = "webcast";
        ((HashMap) this.LIZ).put("__live_platform__", "webcast");
        String str = ((HashMap) this.LIZ).containsKey("target_handler") ? (String) ((HashMap) this.LIZ).get("target_handler") : null;
        Map<String, String> map = this.LIZ;
        if (str != null) {
            if (a0.LJJIIZI(str, "webcast", false)) {
                strLIZIZ = str;
            } else {
                if (((HashMap) this.LIZ).get("business_from") == null && !a0.LJJIJ(str, ',')) {
                    ((HashMap) this.LIZ).put("business_from", str);
                }
                if (u.LJIIZILJ(str, ",", false)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append("webcast");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str);
                    sbLIZ2.append(",webcast");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                }
            }
        }
        ((HashMap) map).put("target_handler", strLIZIZ);
        return LIZLLL();
    }

    public final Uri LIZLLL() {
        for (Map.Entry entry : ((HashMap) this.LIZ).entrySet()) {
            this.LIZIZ.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return this.LIZIZ.build();
    }

    public final String LIZIZ(String str) {
        return (String) ((HashMap) this.LIZ).get(str);
    }

    public final boolean LIZJ(String str) {
        boolean z;
        String strLIZIZ = LIZIZ(str);
        if (strLIZIZ != null && !a0.LJJJIL(strLIZIZ)) {
            z = false;
        } else {
            z = true;
        }
        return !z;
    }

    public final void LJ(int i) {
        ((HashMap) this.LIZ).put("container_bg_color", C2469909m5.LIZ(i));
    }

    public C0KYM LJFF(boolean z) {
        String str;
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        ((HashMap) this.LIZ).put("hide_loading", str);
        return this;
    }

    public C0KYM LJI(String str) {
        ((HashMap) this.LIZ).put("url", str);
        return this;
    }

    public void LJII(String str, String str2) {
        ((HashMap) this.LIZ).put(str, str2);
    }
}
