package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.setting.PcsMonitorEnableApplogSetting;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.PcsMonitorSampleConfigSetting;
import java.util.Map;

/* JADX INFO: renamed from: X.0KAw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C513240KAw {
    public static void LIZ(InterfaceC513250KAx interfaceC513250KAx, String str, String str2, String str3, Map<String, Object> map, Map<String, Object> map2, Map<String, String> map3, double d) {
        C0K6H c0k6h;
        String strLIZIZ = interfaceC513250KAx.LIZIZ(str, str2);
        boolean zBooleanValue = false;
        if (interfaceC513250KAx.LIZ().containsKey(strLIZIZ)) {
            Boolean bool = interfaceC513250KAx.LIZ().get(strLIZIZ);
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("can't report: viewName=");
            sbLIZ.append(str);
            sbLIZ.append(" linkId=");
            sbLIZ.append(str2);
            sbLIZ.append(" eventName=");
            sbLIZ.append(str3);
            C20441214yg.LIZIZ("IPcsPerfReporter", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (AbstractC19994813Le.Default.nextDouble(0.0d, 1.0d) <= PcsMonitorSampleConfigSetting.INSTANCE.getSampleConfig(strLIZIZ, d)) {
            zBooleanValue = true;
        }
        interfaceC513250KAx.LIZ().put(strLIZIZ, Boolean.valueOf(zBooleanValue));
        if (zBooleanValue) {
            if (C500260Jjc.LJJIJIIJIL(Boolean.valueOf(map.containsKey("name")))) {
                map.put("name", str);
            }
            map3.put("time_stamp_milli", String.valueOf(System.currentTimeMillis()));
            map3.putAll(C500260Jjc.LLD(C0K02.LJIIL()));
            if (PcsMonitorEnableApplogSetting.INSTANCE.getValue()) {
                c0k6h = C0K6H.EVENT_TYPE_TEA_AND_SLARDAR_LOG;
            } else {
                c0k6h = C0K6H.EVENT_TYPE_SLARDAR_LOG;
            }
            C0K6I.LIZ(str3, map, map2, map3, c0k6h);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("can't report: viewName=");
        sbLIZ2.append(str);
        sbLIZ2.append(" linkId=");
        sbLIZ2.append(str2);
        sbLIZ2.append(" eventName=");
        sbLIZ2.append(str3);
        C20441214yg.LIZIZ("IPcsPerfReporter", C2188811AlT.LIZIZ(sbLIZ2));
    }
}
