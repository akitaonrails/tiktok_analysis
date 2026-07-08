package X;

import com.bytedance.android.livesdk.comp.api.pcs.infra.flashcomponent.setting.FlashComponentSetting;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.u;

/* JADX INFO: renamed from: X.00qH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C202700qH {
    public static final Map<String, C202800qI> LIZ;

    static {
        new LinkedHashMap();
        LIZ = new LinkedHashMap();
    }

    public static C202800qI LIZ(String str) {
        Map<String, C202800qI> map = LIZ;
        if (map.containsKey(str)) {
            C202800qI c202800qI = (C202800qI) ((LinkedHashMap) map).get(str);
            if (c202800qI == null) {
                return new C202800qI(null);
            }
            return c202800qI;
        }
        u.LJJIIJZLJL(str, "list_view_", false);
        C202800qI c202800qI2 = new C202800qI(FlashComponentSetting.INSTANCE.getFlashComponentSetting().optJSONObject(str));
        map.put(str, c202800qI2);
        return c202800qI2;
    }
}
