package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import java.util.HashMap;
import java.util.Map;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0EWm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C365980EWm {
    public static void LIZ(AwemeDraft awemeDraft) {
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LJI(null)) {
            String strLJIJ = C2354709Kn.LJIJ(awemeDraft.LIZ.nleInfoModel.imageNleDataPath);
            if (C123100dR.LIZ(strLJIJ)) {
                HashMap<String, String> map = (HashMap) GsonProtectorUtils.fromJson(C0CHQ.LIZ().getGson(), strLJIJ, new TypeToken<HashMap<String, String>>() { // from class: X.0EWn
                }.getType());
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (C123100dR.LIZ(entry.getValue())) {
                        String value = entry.getValue();
                        for (String str : awemeDraft.LJIJJ.keySet()) {
                            String str2 = awemeDraft.LJIJJ.get(str);
                            int i = C365960EWk.LIZ;
                            if (C365960EWk.LIZJ(str, str2) && str2 != null) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(str);
                                sbLIZ.append(" -> ");
                                sbLIZ.append(str2);
                                sbLIZ.append("; ");
                                C2188811AlT.LIZIZ(sbLIZ);
                                value = u.LJJIFFI(value, str, str2, false);
                            }
                        }
                        map.put(entry.getKey(), value);
                    }
                }
                awemeDraft.LIZ.imageEditModel.map = map;
            }
        }
    }
}
