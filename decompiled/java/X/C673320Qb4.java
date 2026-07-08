package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.s;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Qb4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C673320Qb4 {
    public static C673400QbC LIZIZ;
    public static final C673320Qb4 LIZ = new C673320Qb4();
    public static final Gson LIZJ = C7740030o.LIZ().getGson();
    public static int LIZLLL = 1;

    public static final void LIZ() {
        C673400QbC c673400QbC = LIZIZ;
        if (c673400QbC != null) {
            c673400QbC.LJIILL = System.currentTimeMillis() - c673400QbC.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startToEnterNativeMiddlePageCost:");
            C673400QbC c673400QbC2 = LIZIZ;
            sbLIZ.append(c673400QbC2 != null ? Long.valueOf(c673400QbC2.LJIILL) : null);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static final void LIZIZ() {
        C673400QbC c673400QbC = LIZIZ;
        if (c673400QbC == null || c673400QbC.LJIIJJI == 0 || c673400QbC.LJIIL != 0) {
            return;
        }
        c673400QbC.LJIIL = System.currentTimeMillis() - c673400QbC.LJIIJJI;
    }

    public static Long LIZLLL() {
        C673400QbC c673400QbC = LIZIZ;
        if (c673400QbC != null) {
            return Long.valueOf(c673400QbC.LIZ);
        }
        return null;
    }

    public static final void LJ() {
        C673400QbC c673400QbC = LIZIZ;
        if (c673400QbC != null) {
            c673400QbC.LJJ = System.currentTimeMillis() - c673400QbC.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startToGuessDataFetched:");
            C673400QbC c673400QbC2 = LIZIZ;
            sbLIZ.append(c673400QbC2 != null ? Long.valueOf(c673400QbC2.LJJ) : null);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static final void LJFF() {
        C673400QbC c673400QbC = LIZIZ;
        if (c673400QbC == null || c673400QbC.LJIILIIL == 0 || c673400QbC.LJIILJJIL != 0) {
            return;
        }
        c673400QbC.LJIILJJIL = System.currentTimeMillis() - c673400QbC.LJIILIIL;
    }

    public static final void LJI() {
        C673400QbC c673400QbC = LIZIZ;
        if (c673400QbC != null) {
            c673400QbC.LJIJ = System.currentTimeMillis() - c673400QbC.LIZ;
            c673400QbC.LJIJI = c673400QbC.LJIIZILJ - System.currentTimeMillis();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startToLoadMiddleLynx:");
            C673400QbC c673400QbC2 = LIZIZ;
            sbLIZ.append(c673400QbC2 != null ? Long.valueOf(c673400QbC2.LJIJ) : null);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static final void LJII() {
        C673400QbC c673400QbC = LIZIZ;
        if (c673400QbC != null) {
            c673400QbC.LJIIZILJ = System.currentTimeMillis() - c673400QbC.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startToLoadMiddleLynxStart:");
            C673400QbC c673400QbC2 = LIZIZ;
            sbLIZ.append(c673400QbC2 != null ? Long.valueOf(c673400QbC2.LJIIZILJ) : null);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static void LJIIIIZZ() {
        C673400QbC c673400QbC = LIZIZ;
        if (c673400QbC != null) {
            c673400QbC.LJJII = (System.currentTimeMillis() - c673400QbC.LIZ) - c673400QbC.LJJIFFI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("middleFragmentCreateCost:");
            C673400QbC c673400QbC2 = LIZIZ;
            sbLIZ.append(c673400QbC2 != null ? Long.valueOf(c673400QbC2.LJJII) : null);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static void LJIIIZ() {
        C673400QbC c673400QbC = LIZIZ;
        if (c673400QbC != null) {
            c673400QbC.LJJIFFI = System.currentTimeMillis() - c673400QbC.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startToMiddleFragmentCreate:");
            C673400QbC c673400QbC2 = LIZIZ;
            sbLIZ.append(c673400QbC2 != null ? Long.valueOf(c673400QbC2.LJJIFFI) : null);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static void LJIIJ() {
        C673400QbC c673400QbC = LIZIZ;
        if (c673400QbC != null) {
            c673400QbC.LJJIIJ = (System.currentTimeMillis() - c673400QbC.LIZ) - c673400QbC.LJJIII;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("middleFragmentViewCreatedCost:");
            C673400QbC c673400QbC2 = LIZIZ;
            sbLIZ.append(c673400QbC2 != null ? Long.valueOf(c673400QbC2.LJJIIJ) : null);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static void LJIIJJI() {
        C673400QbC c673400QbC = LIZIZ;
        if (c673400QbC != null) {
            c673400QbC.LJJIII = System.currentTimeMillis() - c673400QbC.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startToMiddleFragmentViewCreated:");
            C673400QbC c673400QbC2 = LIZIZ;
            sbLIZ.append(c673400QbC2 != null ? Long.valueOf(c673400QbC2.LJJIII) : null);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static final void LJIIL() {
        C673400QbC c673400QbC = LIZIZ;
        if (c673400QbC != null) {
            c673400QbC.LJIILLIIL = System.currentTimeMillis() - c673400QbC.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startToParseMiddleSchema:");
            C673400QbC c673400QbC2 = LIZIZ;
            sbLIZ.append(c673400QbC2 != null ? Long.valueOf(c673400QbC2.LJIILLIIL) : null);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static final void LJIILIIL() {
        C673400QbC c673400QbC = LIZIZ;
        if (c673400QbC != null) {
            c673400QbC.LJIJJ = System.currentTimeMillis() - c673400QbC.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startToProcessGuessCache:");
            C673400QbC c673400QbC2 = LIZIZ;
            sbLIZ.append(c673400QbC2 != null ? Long.valueOf(c673400QbC2.LJIJJ) : null);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static final void LJIILJJIL() {
        C673400QbC c673400QbC = LIZIZ;
        if (c673400QbC == null || c673400QbC.LJI == 0 || c673400QbC.LJII != 0) {
            return;
        }
        c673400QbC.LJII = System.currentTimeMillis() - c673400QbC.LJI;
    }

    public static final void LJIILL() {
        C673400QbC c673400QbC = LIZIZ;
        if (c673400QbC != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            c673400QbC.LJI = jCurrentTimeMillis;
            c673400QbC.LJFF = jCurrentTimeMillis - c673400QbC.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("triggerRecommendRequestCost:");
            C673400QbC c673400QbC2 = LIZIZ;
            sbLIZ.append(c673400QbC2 != null ? Long.valueOf(c673400QbC2.LJFF) : null);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static final void LJIIZILJ() {
        C673400QbC c673400QbC = LIZIZ;
        if (c673400QbC != null) {
            c673400QbC.LJIL = System.currentTimeMillis() - c673400QbC.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startToTriggerGuessFetch:");
            C673400QbC c673400QbC2 = LIZIZ;
            sbLIZ.append(c673400QbC2 != null ? Long.valueOf(c673400QbC2.LJIL) : null);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static final void LJIJ() {
        C673400QbC c673400QbC = LIZIZ;
        if (c673400QbC != null) {
            c673400QbC.LJIJJLI = System.currentTimeMillis() - c673400QbC.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startToUpdateGuessCache:");
            C673400QbC c673400QbC2 = LIZIZ;
            sbLIZ.append(c673400QbC2 != null ? Long.valueOf(c673400QbC2.LJIJJLI) : null);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static final void LJIJI() {
        C673400QbC c673400QbC = LIZIZ;
        if (c673400QbC != null) {
            c673400QbC.LJJI = System.currentTimeMillis() - c673400QbC.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startToUpdateOnlineGuess:");
            C673400QbC c673400QbC2 = LIZIZ;
            sbLIZ.append(c673400QbC2 != null ? Long.valueOf(c673400QbC2.LJJI) : null);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static HashMap LIZJ(Boolean bool) throws JSONException {
        C673400QbC c673400QbC = LIZIZ;
        if (c673400QbC == null) {
            return new HashMap();
        }
        if (c673400QbC.LIZ == 0) {
            return new HashMap();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_use_cache", c673400QbC.LIZIZ);
        jSONObject.put("is_spark", 1);
        jSONObject.put("start_time", c673400QbC.LIZ);
        jSONObject.put("preload_cost", 0L);
        jSONObject.put("get_schema_cost", 0L);
        jSONObject.put("create_page_cost", 0L);
        jSONObject.put("create_container_cost", c673400QbC.LJIIIZ);
        jSONObject.put("trigger_recommend_request_cost", c673400QbC.LJFF);
        jSONObject.put("page_resume_cost", 0L);
        jSONObject.put("recommend_request_cost", c673400QbC.LJII);
        jSONObject.put("history_update_time", 0L);
        jSONObject.put("recommend_update_time", c673400QbC.LJIIJ);
        jSONObject.put("full_data_process_cost", c673400QbC.LJIIL);
        jSONObject.put("guess_screen_data_process_cost", c673400QbC.LJIILJJIL);
        jSONObject.put("is_cold_start", c673400QbC.LIZLLL);
        jSONObject.put("enter_type", c673400QbC.LIZJ);
        jSONObject.put("start_to_guess_data_fetched", c673400QbC.LJJ);
        jSONObject.put("start_to_update_online_guess", c673400QbC.LJJI);
        jSONObject.put("start_to_trigger_guess_fetch", c673400QbC.LJIL);
        jSONObject.put("start_to_process_guess_cache", c673400QbC.LJIJJ);
        jSONObject.put("start_to_enter_native_middle_page", c673400QbC.LJIILL);
        jSONObject.put("start_to_load_middle_lynx_start", c673400QbC.LJIIZILJ);
        jSONObject.put("start_to_load_middle_lynx", c673400QbC.LJIJ);
        jSONObject.put("load_middle_lynx_cost", c673400QbC.LJIJI);
        jSONObject.put("start_to_parse_middle_schema", c673400QbC.LJIILLIIL);
        jSONObject.put("start_to_update_guess_cache", c673400QbC.LJIJJLI);
        jSONObject.put("is_suggest_cache", C672200QYg.LIZIZ ? 1 : 0);
        jSONObject.put("start_to_middle_fragment_create", c673400QbC.LJJIFFI);
        jSONObject.put("middle_fragment_create_cost", c673400QbC.LJJII);
        jSONObject.put("start_to_middle_fragment_view_created", c673400QbC.LJJIII);
        jSONObject.put("middle_fragment_view_created_cost", c673400QbC.LJJIIJ);
        jSONObject.put("is_reuse_spark", c673400QbC.LJJIIJZLJL);
        jSONObject.put("is_reuse_lynx", c673400QbC.LJJIIZ);
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            LIZIZ = null;
        }
        try {
            return (HashMap) GsonProtectorUtils.fromJson(LIZJ, C786410Ut5.J3(jSONObject), HashMap.class);
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            return new HashMap();
        }
    }

    public static final void LJIILLIIL(EnumC673010QaZ enumC673010QaZ) {
        C673400QbC c673400QbC;
        Long lValueOf;
        if (LIZIZ == null) {
            C673400QbC c673400QbC2 = new C673400QbC();
            LIZIZ = c673400QbC2;
            c673400QbC2.LIZ = System.currentTimeMillis();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start time:");
            C673400QbC c673400QbC3 = LIZIZ;
            if (c673400QbC3 != null) {
                lValueOf = Long.valueOf(c673400QbC3.LIZ);
            } else {
                lValueOf = null;
            }
            sbLIZ.append(lValueOf);
            C2188811AlT.LIZIZ(sbLIZ);
            C673400QbC c673400QbC4 = LIZIZ;
            if (c673400QbC4 != null) {
                c673400QbC4.LIZLLL = LIZLLL;
            }
            LIZLLL = 0;
        }
        if (enumC673010QaZ != null && (c673400QbC = LIZIZ) != null) {
            c673400QbC.LIZJ = enumC673010QaZ.getValue();
        }
    }
}
