package X;

import android.content.Context;
import com.google.gson.internal.s;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioTextService;
import java.util.Map;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0CIc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C311280CIc {
    public static final Map<String, s<String, String>> LIZ = C2097608Jq.LJ();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(533));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(534));

    public static String LIZ(Context context, String str) {
        MixStudioTextService mixStudioTextService;
        String strLIZ;
        s sVar = (s) ((Map) LIZIZ.getValue()).get(str);
        if (sVar == null) {
            return null;
        }
        String str2 = (String) sVar.get("localized_prompt_key");
        if (str2 == null || (mixStudioTextService = (MixStudioTextService) LIZJ.getValue()) == null || (strLIZ = mixStudioTextService.LIZ(context, str2)) == null) {
            return (String) sVar.get("placeholder_prompt");
        }
        return strLIZ;
    }
}
