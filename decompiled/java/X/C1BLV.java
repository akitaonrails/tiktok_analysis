package X;

import com.bytedance.morpheus.PluginEntity;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.u;

/* JADX INFO: renamed from: X.1BLV, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BLV {
    public static final Map<String, String> LIZ = new HashMap();
    public static final Map<String, String> LIZIZ = new HashMap();

    static {
        for (PluginEntity pluginEntity : (List) C08EV.LIZ.getValue()) {
            String packageName = pluginEntity.getPackageName();
            String aabName = pluginEntity.getAabName();
            HashMap map = (HashMap) LIZ;
            if (!(!map.containsKey(packageName))) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("duplicate config for package name ");
                sbLIZ.append(packageName);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                strLIZIZ.toString();
                throw new IllegalArgumentException(strLIZIZ);
            }
            HashMap map2 = (HashMap) LIZIZ;
            if (!(!map2.containsKey(aabName))) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("duplicate config for aab name ");
                sbLIZ2.append(aabName);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                strLIZIZ2.toString();
                throw new IllegalArgumentException(strLIZIZ2);
            }
            map.put(packageName, aabName);
            map2.put(aabName, packageName);
        }
    }

    public static String LIZ(String str) {
        String strLIZIZ;
        if (u.LJJIIJZLJL(str, "com.ss.android.ugc.aweme.dflanguage", false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("df_language_");
            sbLIZ.append(C13LN.LJLJLJ(36, str));
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = (String) ((HashMap) LIZ).get(str);
        }
        if (strLIZIZ != null) {
            return strLIZIZ;
        }
        return str;
    }

    public static String LIZIZ(String str) {
        if (u.LJJIIJZLJL(str, "df_language", false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("com.ss.android.ugc.aweme.dflanguage.");
            sbLIZ.append(C13LN.LJLJLJ(12, str));
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return (String) ((HashMap) LIZIZ).get(str);
    }
}
