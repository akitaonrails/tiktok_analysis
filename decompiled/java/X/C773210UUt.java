package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0UUt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C773210UUt {
    public final EnumC773230UUv LIZ;
    public long LIZIZ = SystemClock.uptimeMillis();
    public final ConcurrentHashMap<String, String> LIZJ = new ConcurrentHashMap<>();

    public static Map LJFF() {
        String string;
        C1163660gO4.LIZ.getClass();
        Map mapLIZ = C1163660gO4.LIZ("livesdk_game_host_broadcast_whole_link_tracking");
        Map mapLIZ2 = C1163660gO4.LIZ("livesdk_game_host_broadcast_whole_link_tracking");
        Object[] objArr = new Object[1];
        Double d = (Double) mapLIZ.get("cpu_rate");
        objArr[0] = Double.valueOf(d != null ? d.doubleValue() : 0.0d);
        String strJ4 = C786410Ut5.j4("%.2f", Arrays.copyOf(objArr, 1));
        Double d2 = (Double) mapLIZ2.get("mem_java_free");
        if (d2 == null || (string = d2.toString()) == null) {
            string = "";
        }
        return C2097608Jq.LJIIIIZZ(new Pair("cpu_rate", strJ4), new Pair("mem_free", string));
    }

    public static C773210UUt LJI() {
        EnumC773230UUv enumC773230UUv = C773220UUu.LJI;
        if (enumC773230UUv != null) {
            int i = C773250UUx.LIZ[enumC773230UUv.ordinal()];
            if (i == 1) {
                EnumC773230UUv enumC773230UUv2 = EnumC773230UUv.STATE_T1;
                C773220UUu.LJI = enumC773230UUv2;
                C773220UUu.LIZ.getClass();
                return C773220UUu.LJIILIIL(enumC773230UUv2);
            }
            if (i == 2) {
                EnumC773230UUv enumC773230UUv3 = EnumC773230UUv.STATE_T2;
                C773220UUu.LJI = enumC773230UUv3;
                C773220UUu.LIZ.getClass();
                return C773220UUu.LJIILIIL(enumC773230UUv3);
            }
        }
        EnumC773230UUv enumC773230UUv4 = EnumC773230UUv.STATE_T0;
        C773220UUu.LJI = enumC773230UUv4;
        C773220UUu.LIZ.getClass();
        return C773220UUu.LJIILIIL(enumC773230UUv4);
    }

    public final void LJIIIIZZ() {
        if (C773220UUu.LJIIIZ) {
            return;
        }
        LIZIZ();
        LJIIJJI("system_enter_room_api_succeeded", "");
        C773220UUu.LJIIIZ = true;
    }

    public final void LJIIIZ() {
        if (this.LIZ == EnumC773230UUv.STATE_T0) {
            ConcurrentHashMap<String, String> concurrentHashMap = C773220UUu.LJFF;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            C773220UUu.LIZ.getClass();
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            sbLIZ.append(interfaceC500940JkiUser != null ? interfaceC500940JkiUser.getCurrentUserId() : 0L);
            sbLIZ.append('-');
            sbLIZ.append(UUID.randomUUID());
            concurrentHashMap.put("live_log_id", C2188811AlT.LIZIZ(sbLIZ));
            long jUptimeMillis = SystemClock.uptimeMillis();
            this.LIZIZ = jUptimeMillis;
            C773220UUu.LJIIIIZZ = jUptimeMillis;
            this.LIZJ.put("state", this.LIZ.toString());
            C773220UUu.LJI = this.LIZ;
            LiveMode liveMode = C773220UUu.LJ;
            concurrentHashMap.put("room_type", String.valueOf(liveMode != null ? liveMode.name() : null).toLowerCase(Locale.getDefault()));
            LIZ("user_enter_start_live");
            concurrentHashMap.put("live_support_resolution", C773220UUu.LJII.toString());
            LJIILIIL();
        }
    }

    public final void LJIILIIL() {
        this.LIZJ.put("resume_scene", String.valueOf(C773220UUu.LJIILL));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_host_broadcast_whole_link_tracking");
        c474500IjALIZ.LJJIIZI(C773220UUu.LJFF);
        c474500IjALIZ.LJJIIZI(this.LIZJ);
        c474500IjALIZ.LJJII(0, "state_time");
        c474500IjALIZ.LJJIIZI(LJFF());
        c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis()), "timestamp");
        c474500IjALIZ.LJJII("start", "stage");
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C773210UUt.LIZIZ():void");
    }

    public C773210UUt(EnumC773230UUv enumC773230UUv) {
        this.LIZ = enumC773230UUv;
    }

    public static void LJIILJJIL(C773210UUt c773210UUt) {
        c773210UUt.getClass();
        C773220UUu.LJI = EnumC773230UUv.STATE_T0;
        C773220UUu.LJFF.clear();
        C773220UUu.LJ = null;
        C773220UUu.LJIIIZ = false;
        C773220UUu.LJIIJ = false;
        C773220UUu.LJIIJJI = false;
        C773220UUu.LJIILIIL = false;
        C773220UUu.LJIIL = false;
    }

    public final void LIZ(String str) {
        this.LIZJ.put("action_type", str);
    }

    public final void LJ(String str) {
        this.LIZJ.put("error_code", str);
    }

    public final void LJII(Exception exc) {
        int cronetError;
        String str;
        if (exc instanceof C501470JlZ) {
            C501470JlZ c501470JlZ = (C501470JlZ) exc;
            cronetError = c501470JlZ.getErrorCode();
            c501470JlZ.getErrorMsg();
            str = "system_exit_room_server_exception";
        } else if (exc instanceof C1811850xFX) {
            C1811850xFX c1811850xFX = (C1811850xFX) exc;
            cronetError = c1811850xFX.getCronetError();
            c1811850xFX.getMessage();
            str = "system_exit_room_network_exception";
        } else {
            if (exc != null) {
                exc.getMessage();
            }
            cronetError = -1;
            str = "system_exit_room_other_exception";
        }
        LIZ(str);
        LJ(String.valueOf(cronetError));
        LJIIJ("");
        if (this.LIZ == EnumC773230UUv.STATE_T2) {
            LJIILJJIL(this);
        }
    }

    public final void LJIIJ(String str) {
        C773220UUu.LIZIZ.remove(this.LIZ);
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.LIZJ.put("resume_scene", String.valueOf(C773220UUu.LJIILL));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_host_broadcast_whole_link_tracking");
        if (str.length() > 0) {
            c474500IjALIZ.LJJII(str, "error_reason");
        }
        c474500IjALIZ.LJJIIZI(C773220UUu.LJFF);
        c474500IjALIZ.LJJIIZI(LJFF());
        c474500IjALIZ.LJJIIZI(this.LIZJ);
        c474500IjALIZ.LJJII(Long.valueOf(jUptimeMillis - this.LIZIZ), "state_time");
        c474500IjALIZ.LJJII(Long.valueOf(jUptimeMillis - C773220UUu.LJIIIIZZ), "live_duration");
        c474500IjALIZ.LJJII("end", "stage");
        c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis()), "timestamp");
        c474500IjALIZ.LIZ();
    }

    public final void LJIILL(String str) {
        String strName;
        long currentUserId;
        if (this.LIZ == EnumC773230UUv.STATE_T0) {
            ConcurrentHashMap<String, String> concurrentHashMap = C773220UUu.LJFF;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            C773220UUu.LIZ.getClass();
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            if (interfaceC500940JkiUser != null) {
                currentUserId = interfaceC500940JkiUser.getCurrentUserId();
            } else {
                currentUserId = 0;
            }
            sbLIZ.append(currentUserId);
            sbLIZ.append('-');
            sbLIZ.append(UUID.randomUUID());
            concurrentHashMap.put("live_log_id", C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LIZIZ = SystemClock.uptimeMillis();
        this.LIZJ.put("state", this.LIZ.toString());
        C773220UUu.LJI = this.LIZ;
        LiveMode liveMode = C773220UUu.LJ;
        if (liveMode != null) {
            strName = liveMode.name();
        } else {
            strName = null;
        }
        String strValueOf = String.valueOf(strName);
        ConcurrentHashMap<String, String> concurrentHashMap2 = C773220UUu.LJFF;
        concurrentHashMap2.put("room_type", strValueOf.toLowerCase(Locale.getDefault()));
        LIZ(str);
        concurrentHashMap2.put("live_support_resolution", C773220UUu.LJII.toString());
        LJIILIIL();
    }

    public final void LIZJ(String str, String str2) {
        LIZ(str);
        LJIIJ(str2);
        if (this.LIZ == EnumC773230UUv.STATE_T2) {
            LJIILJJIL(this);
        }
    }

    public final void LJIIJJI(String str, String str2) {
        LIZ(str);
        this.LIZJ.put("resume_scene", String.valueOf(C773220UUu.LJIILL));
        long jUptimeMillis = SystemClock.uptimeMillis();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_host_broadcast_whole_link_tracking");
        c474500IjALIZ.LJJIIZI(C773220UUu.LJFF);
        c474500IjALIZ.LJJIIZI(LJFF());
        if (str2.length() > 0) {
            c474500IjALIZ.LJJII(str2, "error_reason");
        }
        c474500IjALIZ.LJJIIZI(this.LIZJ);
        c474500IjALIZ.LJJII(Long.valueOf(jUptimeMillis - this.LIZIZ), "state_time");
        c474500IjALIZ.LJJII(Long.valueOf(jUptimeMillis - C773220UUu.LJIIIIZZ), "live_duration");
        c474500IjALIZ.LJJII("middle", "stage");
        c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis()), "timestamp");
        c474500IjALIZ.LIZ();
    }
}
