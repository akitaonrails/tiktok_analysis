package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MuS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C583420MuS {
    public static final C583420MuS LIZ = new C583420MuS();
    public static final C0S4J LIZIZ = new C0S4J("VQOSMobReporter");
    public static long LIZJ;
    public static long LIZLLL;
    public static long LJ;
    public static long LJFF;

    public static final Map<String, Long> LIZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("s_p_select", Long.valueOf(LIZJ));
        linkedHashMap.put("s_p_settling", Long.valueOf(LIZLLL));
        linkedHashMap.put("s_p_s_to_item", Long.valueOf(LJ));
        linkedHashMap.put("s_p_t_play", Long.valueOf(LJFF));
        LIZJ = 0L;
        LIZLLL = 0L;
        LJ = 0L;
        LJFF = 0L;
        return linkedHashMap;
    }

    public static final void LJ(String str) {
        if (str != null) {
            if (Intrinsics.LJFF(str, EnumC584510MwD.S_PAGE_SELECT.toString())) {
                LIZJ = System.currentTimeMillis();
                return;
            }
            if (Intrinsics.LJFF(str, EnumC584510MwD.S_PAGE_SETTLING.toString())) {
                LIZLLL = System.currentTimeMillis();
            } else if (Intrinsics.LJFF(str, EnumC584510MwD.S_SCROLL_TO_ITEM.toString())) {
                LJ = System.currentTimeMillis();
            } else {
                if (!Intrinsics.LJFF(str, EnumC584510MwD.S_PAGE_TRY_PLAY.toString())) {
                    return;
                }
                LJFF = System.currentTimeMillis();
            }
        }
    }

    public static final void LIZJ(String str, C0RRP c0rrp) {
        LIZLLL(str, c0rrp.toString(), null);
    }

    public static final void LIZIZ(Aweme aweme, C0RRP c0rrp, String str) {
        String aid;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        LIZLLL(aid, c0rrp.toString(), str);
    }

    public static final void LIZLLL(String str, String str2, String str3) {
        if (((Boolean) C266270Ac5.LIZ.getValue()).booleanValue() && str != null && str.length() != 0) {
            LIZ.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("S_");
            sbLIZ.append(str2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (str3 != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(" E_");
                sbLIZ2.append(str3);
                C2188811AlT.LIZIZ(sbLIZ2);
            } else {
                str3 = "";
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append(str3);
            try {
                C1475000oUE.LIZIZ().setBusinessLog(C2188811AlT.LIZIZ(sbLIZ3), str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                String message = e.getMessage();
                if (message != null) {
                    LIZIZ.LJ(message);
                }
                C1AF0.LJ(e);
            }
        }
    }
}
