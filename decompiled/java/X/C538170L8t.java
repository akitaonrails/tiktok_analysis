package X;

import com.ss.android.ugc.aweme.cktemplate.config.ITemplateConfigKeyService;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0L8t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C538170L8t {
    public static final void LIZ(String str, Map<String, String> map) {
        String strLIZ;
        if (str.length() > 0) {
            Locale locale = Locale.ROOT;
            if (Intrinsics.LJFF(str.toUpperCase(locale), "TT")) {
                map.put("access_key", C0CHQ.LIZ().LJJJ().LIZLLL());
            } else if (Intrinsics.LJFF(str.toUpperCase(locale), "CC")) {
                ITemplateConfigKeyService iTemplateConfigKeyService = C04PO.LIZ;
                if (iTemplateConfigKeyService == null || (strLIZ = iTemplateConfigKeyService.LIZ()) == null) {
                    strLIZ = "";
                }
                map.put("access_key", strLIZ);
            }
        }
        map.put("template_fetch_type", "wuzhui");
    }
}
