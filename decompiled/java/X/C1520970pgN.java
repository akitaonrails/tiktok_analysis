package X;

import Y.ARunnableS27S1200000_23;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0pgN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1520970pgN {
    public static final C1520970pgN LIZ = new C1520970pgN();
    public static volatile String LIZIZ = "";
    public static volatile String LIZJ = "";
    public static volatile String LIZLLL = "";
    public static volatile String LJ = "";

    static {
        try {
            Npth.addAttachUserData(new AttachUserData() { // from class: X.0pgO
                @Override // com.bytedance.crash.AttachUserData
                public final Map<? extends String, ? extends String> getUserData(CrashType crashType) {
                    HashMap map = new HashMap();
                    map.put("last_bdhm_url", C01CJ.LIZ(C1520970pgN.LIZJ));
                    map.put("last_bdhm_schema", C1520970pgN.LIZIZ);
                    map.put("last_bdhm_bid", C1520970pgN.LIZLLL);
                    map.put("last_bdhm_pid", C1520970pgN.LJ);
                    return map;
                }
            }, CrashType.ALL);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Npth.setCustomCrashReasonArrayLimit("alive_web_identifier", 20);
        Npth.setCustomCrashReasonArrayLimit("alive_lynx_identifier", 20);
    }

    public static void LIZIZ(String str, EnumC1520910pgH enumC1520910pgH, List list) {
        C824310WVh.LIZ(new ARunnableS27S1200000_23(enumC1520910pgH, list, str, 13));
    }

    public static void LIZ(String str, String str2, String str3, String str4) {
        if (str2 != null && (!a0.LJJJIL(str2))) {
            LIZJ = str2;
        }
        if (str != null && (!a0.LJJJIL(str))) {
            LIZIZ = str;
        }
        if (str3 != null && (!a0.LJJJIL(str3))) {
            LIZLLL = str3;
        }
        if (str4 != null && (!a0.LJJJIL(str4))) {
            LJ = str4;
        }
        HashMap map = new HashMap();
        map.put("last_bdhm_url", C01CJ.LIZ(LIZJ));
        map.put("last_bdhm_schema", LIZIZ);
        map.put("last_bdhm_bid", LIZLLL);
        map.put("last_bdhm_pid", LJ);
        Npth.addTags(map);
    }
}
