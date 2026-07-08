package X;

import com.bytedance.android.LiveImageUsDomainAdaptionSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.util.Iterator;
import java.util.Map;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0X2h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C842250X2h {
    public static String LIZ;

    public static final String LIZ() {
        Object next;
        String str;
        String str2 = LIZ;
        String str3 = "";
        if (str2 == null || str2.length() == 0) {
            Iterator<T> it2 = LiveImageUsDomainAdaptionSetting.INSTANCE.getValue().entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (u.LJIJI((String) ((Map.Entry) next).getKey(), ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).getIDCTypeUpperCase(), true)) {
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) next;
            if (entry != null && (str = (String) entry.getValue()) != null) {
                str3 = str;
            }
            LIZ = str3;
        } else {
            String str4 = LIZ;
            if (str4 != null) {
                return str4;
            }
        }
        return str3;
    }
}
