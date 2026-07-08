package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.frequencycontrol.api.IFrequencyControlService;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.056X, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C056X {
    public static final C056X LIZ = new C056X();
    public static final Map<String, InterfaceC1411705fn> LIZIZ = new LinkedHashMap();

    public static String LIZ(C056Y c056y, EnumC12978056a enumC12978056a) {
        String str;
        int i = C056Z.LIZ[enumC12978056a.ordinal()];
        if (i != 1) {
            if (i == 2) {
                str = "silent_mode";
            } else {
                throw new C1954807lC();
            }
        } else {
            str = "no_permission";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("alert_tone_banner_");
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(c056y.getTag());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static InterfaceC1411705fn LIZIZ(C056Y c056y, EnumC12978056a enumC12978056a) {
        String strLIZ = LIZ(c056y, enumC12978056a);
        LinkedHashMap linkedHashMap = (LinkedHashMap) LIZIZ;
        Object objLIZIZ = linkedHashMap.get(strLIZ);
        if (objLIZIZ == null) {
            LIZ.getClass();
            String strLIZ2 = LIZ(c056y, enumC12978056a);
            IFrequencyControlService iFrequencyControlService = (IFrequencyControlService) PluggableExtentionKt.pluggableSpi$default(IFrequencyControlService.class, false, false, false, 14, null);
            if (iFrequencyControlService != null) {
                objLIZIZ = iFrequencyControlService.LIZIZ(new C053W(strLIZ2, new C12918053s(null, EnumC12928054c.DID, EnumC1502105uN.ALERT_TONE, EnumC12929054d.APP, 1), new C12912053m(3), C12915053p.LIZ));
            } else {
                objLIZIZ = null;
            }
            linkedHashMap.put(strLIZ, objLIZIZ);
        }
        return (InterfaceC1411705fn) objLIZIZ;
    }
}
