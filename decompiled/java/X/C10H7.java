package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.10H7, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10H7 {
    public static final C10H7 LIZ = new C10H7();
    public static boolean LIZIZ;
    public static int LIZJ;
    public static int LIZLLL;

    static {
        C0TA0 next;
        IPluginService.PluginDataWrapper value;
        IPluginService.SimplePluginData simplePluginData;
        List<IPluginService.SpKvItem> list;
        String str;
        LIZJ = 1;
        LIZLLL = 1;
        Iterator<C0TA0> it2 = ((IPluginService) ServiceManager.get().getService(IPluginService.class)).getCurrentPluginList().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (next.getType() == EnumC19241510Pl.LOGIN_GUIDE_SEARCH) {
                    break;
                }
            }
        }
        C0TA0 c0ta0 = next;
        if (c0ta0 == null || (value = c0ta0.getValue()) == null || (simplePluginData = value.simplePluginData) == null || (list = simplePluginData.kvList) == null || list.isEmpty()) {
            return;
        }
        Iterator<IPluginService.SpKvItem> it3 = list.iterator();
        while (it3.hasNext()) {
            IPluginService.SpKvItem next2 = it3.next();
            if (next2 != null && (str = next2.key) != null) {
                int iHashCode = str.hashCode();
                if (iHashCode != -883477761) {
                    if (iHashCode != -883477759) {
                        if (iHashCode == -101655184 && str.equals("show_login_on_search")) {
                            String str2 = next2.boolValue;
                            LIZIZ = str2 != null ? Boolean.parseBoolean(str2) : false;
                        }
                    } else if (str.equals("frequency_parameter_z")) {
                        String str3 = next2.intValue;
                        LIZLLL = str3 != null ? CastIntegerProtector.parseInt(str3) : 1;
                    }
                } else if (str.equals("frequency_parameter_x")) {
                    String str4 = next2.intValue;
                    LIZJ = str4 != null ? CastIntegerProtector.parseInt(str4) : 1;
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("unknown parameter ");
            sbLIZ.append(next2 != null ? next2.key : null);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }
}
