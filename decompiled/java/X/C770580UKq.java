package X;

import Y.ARunnableS112S0100000_12;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;

/* JADX INFO: renamed from: X.0UKq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C770580UKq {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ(InterfaceC1124060fMC interfaceC1124060fMC) {
        String strLIZ;
        String strName;
        if (interfaceC1124060fMC != null) {
            strLIZ = interfaceC1124060fMC.LIZ();
            Enum enumLLJ = interfaceC1124060fMC.LLJ();
            if (enumLLJ != null) {
                strName = enumLLJ.name();
            }
            C823050WQl.LIZIZ().execute(new RunnableC183300n9("live_slot_click", null, strLIZ, strName));
        }
        strLIZ = null;
        strName = null;
        C823050WQl.LIZIZ().execute(new RunnableC183300n9("live_slot_click", null, strLIZ, strName));
    }

    public static long LIZ(String str, Map map) {
        Map map2;
        String str2;
        if (map == null) {
            return 0L;
        }
        Object obj = map.get("param_live_show_time");
        if (!(obj instanceof Map) || (map2 = (Map) obj) == null || (str2 = (String) map2.get(str)) == null) {
            return 0L;
        }
        try {
            return CastLongProtector.parseLong(str2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0L;
        }
    }

    public static void LIZIZ(InterfaceC1124060fMC interfaceC1124060fMC, Object obj) {
        if (interfaceC1124060fMC != null) {
            interfaceC1124060fMC.LIZ();
            Enum enumLLJ = interfaceC1124060fMC.LLJ();
            if (enumLLJ != null) {
                enumLLJ.name();
            }
        }
        C823050WQl.LIZIZ().submit(new ARunnableS112S0100000_12(obj, 362));
    }

    public static void LIZLLL(InterfaceC1124060fMC interfaceC1124060fMC, Map map) {
        String strLIZ;
        String strName = null;
        if (interfaceC1124060fMC != null) {
            strLIZ = interfaceC1124060fMC.LIZ();
            Enum enumLLJ = interfaceC1124060fMC.LLJ();
            if (enumLLJ != null) {
                strName = enumLLJ.name();
            }
        } else {
            strLIZ = null;
        }
        if (LiveMonitorSampleSetting.INSTANCE.isReportSlardar("ttlive_live_slot_show")) {
            C823050WQl.LIZIZ().execute(new RunnableC183300n9("live_slot_show", map, strLIZ, strName));
        }
    }
}
