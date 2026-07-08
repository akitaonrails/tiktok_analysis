package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0T9c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C742100T9c {
    public static final C742100T9c LIZ = new C742100T9c();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(558));
    public static InterfaceC420801kM LIZJ;

    public static void LIZ(String str, Map map, Map map2, boolean z) {
        Object obj;
        int serverValue;
        Object obj2;
        HashMap map3 = new HashMap();
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map3.put("is_success", obj);
        for (Map.Entry entry : map.entrySet()) {
            if (map2.containsKey(entry.getKey())) {
                EnumC1159500gHM enumC1159500gHM = (EnumC1159500gHM) map2.get(entry.getKey());
                if (enumC1159500gHM == null) {
                    enumC1159500gHM = (EnumC1159500gHM) entry.getValue();
                }
                serverValue = enumC1159500gHM.getServerValue();
            } else {
                serverValue = ((EnumC1159500gHM) entry.getValue()).getServerValue();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("topic_");
            sbLIZ.append(((Number) entry.getKey()).intValue());
            sbLIZ.append("_strength");
            map3.put(C2188811AlT.LIZIZ(sbLIZ), String.valueOf(serverValue));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("is_");
            sbLIZ2.append(((Number) entry.getKey()).intValue());
            sbLIZ2.append("_changed");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            if (map2.containsKey(entry.getKey())) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            map3.put(strLIZIZ, obj2);
        }
        if (str == null) {
            str = "";
        }
        map3.put("enter_from", str);
        C20684815ws.LJIILLIIL("manage_key_content_topic_confirm_click", map3);
    }
}
