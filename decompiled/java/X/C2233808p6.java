package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08p6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2233808p6 {
    public static final C2233808p6 LIZ = new C2233808p6();
    public static final ConcurrentHashMap<String, C2152408by> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, C2233908p7> LIZJ = new ConcurrentHashMap<>();

    public static void LIZ(String str, Map map) {
        Object c098200Yq;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinVoiceMonitor ");
        sbLIZ.append(map);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (Intrinsics.LJFF(str, "error")) {
            C0OPX.LJIIIIZZ(strLIZIZ);
        } else {
            C0OPX.LJII(strLIZIZ);
        }
        try {
            C20684815ws.LJIILLIIL("bb_voice_publish", map);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("BulletinVoiceMonitor mob report failed: ");
            sbLIZ2.append(thM5exceptionOrNullimpl.getMessage());
            C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public static void LIZIZ(C2233908p7 c2233908p7, String str) {
        Object obj;
        String str2;
        long j = 0;
        if (c2233908p7.LJIIIZ == 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - c2233908p7.LJIIIZ;
        if (jCurrentTimeMillis < 0) {
            jCurrentTimeMillis = 0;
        }
        long j2 = c2233908p7.LJIIIZ - c2233908p7.LIZLLL;
        if (j2 >= 0) {
            j = j2;
        }
        String str3 = c2233908p7.LJIIJ;
        if (str3 == null) {
            str3 = "unknown";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("bulletin_board_id", String.valueOf(c2233908p7.LIZIZ));
        linkedHashMap.put("message_id", String.valueOf(c2233908p7.LIZJ));
        linkedHashMap.put("vid", c2233908p7.LIZ);
        String str4 = "1";
        if (c2233908p7.LJ) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_creator", obj);
        linkedHashMap.put("identity_type", String.valueOf(c2233908p7.LJFF));
        linkedHashMap.put("cache_state", str3);
        if (!Intrinsics.LJFF(str3, "hit_file")) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("cache_hit", str4);
        linkedHashMap.put("time_since_expose_ms", String.valueOf(j));
        linkedHashMap.put("wait_ms", String.valueOf(jCurrentTimeMillis));
        linkedHashMap.put("click_result", str);
        if (Intrinsics.LJFF(str, "download_failed")) {
            str2 = "error";
        } else {
            str2 = "info";
        }
        LIZJ("bb_voice_cell_click_play", str2, linkedHashMap);
        c2233908p7.LJIIJJI = true;
    }

    public static void LJ(String str, String str2) {
        C2233908p7 c2233908p7;
        if (str.length() != 0 && (c2233908p7 = LIZJ.get(str)) != null && c2233908p7.LJIIIZ != 0 && !c2233908p7.LJIIJJI) {
            LIZIZ(c2233908p7, str2);
        }
    }

    public static void LIZJ(String str, String str2, Map map) {
        Object c098200Yq;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinVoiceMonitor[");
        sbLIZ.append(str);
        sbLIZ.append("] ");
        sbLIZ.append(map);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (Intrinsics.LJFF(str2, "error")) {
            C0OPX.LJIIIIZZ(strLIZIZ);
        } else {
            C0OPX.LJII(strLIZIZ);
        }
        try {
            C20684815ws.LJIILLIIL(str, map);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("BulletinVoiceMonitor[");
            sbLIZ2.append(str);
            sbLIZ2.append("] mob report failed: ");
            sbLIZ2.append(thM5exceptionOrNullimpl.getMessage());
            C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public static void LJI(String str, String str2, boolean z) {
        C2233908p7 c2233908p7;
        if (str.length() == 0 || (c2233908p7 = LIZJ.get(str)) == null) {
            return;
        }
        if (c2233908p7.LJII == null) {
            c2233908p7.LJII = str2;
            c2233908p7.LJI = System.currentTimeMillis();
        }
        if (z) {
            c2233908p7.LJIIIIZZ = true;
        }
    }

    public static C2152408by LIZLLL(long j, String str, String str2, boolean z) {
        boolean z2;
        ConcurrentHashMap<String, C2152408by> concurrentHashMap = LIZIZ;
        C2152408by c2152408by = concurrentHashMap.get(str2);
        if (c2152408by == null) {
            if (C2185908hN.LIZ.getValue() != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            c2152408by = new C2152408by(str, j, str2, z, z2);
            C2152408by c2152408byPutIfAbsent = concurrentHashMap.putIfAbsent(str2, c2152408by);
            if (c2152408byPutIfAbsent != null) {
                c2152408by = c2152408byPutIfAbsent;
            }
        }
        return c2152408by;
    }

    public static void LJFF(int i, long j, Long l, String str, String str2, String str3) {
        C2233908p7 c2233908p7;
        Object obj;
        String str4;
        if (str.length() == 0 || (c2233908p7 = LIZJ.get(str)) == null) {
            return;
        }
        long j2 = c2233908p7.LJI;
        String str5 = c2233908p7.LJII;
        if (str5 == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - j2;
        if (jCurrentTimeMillis < 0) {
            jCurrentTimeMillis = 0;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("bulletin_board_id", String.valueOf(c2233908p7.LIZIZ));
        linkedHashMap.put("message_id", String.valueOf(c2233908p7.LIZJ));
        linkedHashMap.put("vid", str);
        String str6 = "1";
        if (c2233908p7.LJ) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_creator", obj);
        linkedHashMap.put("identity_type", String.valueOf(c2233908p7.LJFF));
        linkedHashMap.put("trigger", str5);
        linkedHashMap.put("download_status", str2);
        linkedHashMap.put("duration_ms", String.valueOf(jCurrentTimeMillis));
        if (Intrinsics.LJFF(str2, "success")) {
            linkedHashMap.put("file_bytes", String.valueOf(j));
        }
        if (l != null) {
            linkedHashMap.put("err_code", String.valueOf(l.longValue()));
        }
        if (str3 != null && str3.length() != 0) {
            linkedHashMap.put("err_msg", C13LN.LJZL(200, str3));
        }
        linkedHashMap.put("concurrent_inflight_count", String.valueOf(i));
        if (!c2233908p7.LJIIIIZZ) {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("was_join_to_preload", str6);
        if (Intrinsics.LJFF(str2, "fail")) {
            str4 = "error";
        } else {
            str4 = "info";
        }
        LIZJ("bb_voice_cell_download", str4, linkedHashMap);
        c2233908p7.LJI = 0L;
        c2233908p7.LJII = null;
        c2233908p7.LJIIIIZZ = false;
    }
}
