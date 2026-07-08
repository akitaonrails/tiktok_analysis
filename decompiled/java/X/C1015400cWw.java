package X;

import android.util.LruCache;
import com.ss.android.ugc.aweme.AnoleAutomationParamModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: renamed from: X.0cWw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1015400cWw {
    public static final C1015400cWw LIZ = new C1015400cWw();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(229));

    public static AnoleAutomationParamModel LIZ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C01GW c01gw = LIZIZ;
        AnoleAutomationParamModel anoleAutomationParamModel = (AnoleAutomationParamModel) ((LruCache) c01gw.getValue()).get(strLIZIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("use cache,creativeId = ");
        sbLIZ2.append(str);
        sbLIZ2.append(",componentType = ");
        sbLIZ2.append(str2);
        C2188811AlT.LIZIZ(sbLIZ2);
        C811103Ev.LIZ("AnoleGeckoLoggerCache");
        if (anoleAutomationParamModel == null) {
            AnoleAutomationParamModel anoleAutomationParamModel2 = new AnoleAutomationParamModel(null, null, "now_load", null, new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap(), null);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("new creation,creativeId = ");
            sbLIZ3.append(str);
            sbLIZ3.append(",componentType = ");
            sbLIZ3.append(str2);
            C2188811AlT.LIZIZ(sbLIZ3);
            C811103Ev.LIZ("AnoleGeckoLoggerCache");
            ((LruCache) c01gw.getValue()).put(strLIZIZ, anoleAutomationParamModel2);
            return anoleAutomationParamModel2;
        }
        return anoleAutomationParamModel;
    }
}
