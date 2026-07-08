package X;

import com.bytedance.crash.CrashType;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.general.IGeneralExperienceService;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QO8, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QO8 implements IGeneralExperienceService {
    public static final C0QO8 LIZ = new C0QO8();
    public static final IGeneralExperienceService LIZIZ = (IGeneralExperienceService) PluggableExtentionKt.pluggableSpi$default(IGeneralExperienceService.class, false, false, false, 14, null);

    @Override // com.ss.android.ugc.aweme.search.general.IGeneralExperienceService
    public final void LJIIIIZZ() {
        IGeneralExperienceService iGeneralExperienceService = LIZIZ;
        if (iGeneralExperienceService != null) {
            iGeneralExperienceService.LJIIIIZZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.search.general.IGeneralExperienceService
    public final C0QGC getSessionInfo() {
        C0QGC sessionInfo;
        IGeneralExperienceService iGeneralExperienceService = LIZIZ;
        return (iGeneralExperienceService == null || (sessionInfo = iGeneralExperienceService.getSessionInfo()) == null) ? new C0QGC("", "", "", 0, 0) : sessionInfo;
    }

    @Override // com.ss.android.ugc.aweme.search.general.IGeneralExperienceService
    public final void LIZ(String str) {
        IGeneralExperienceService iGeneralExperienceService = LIZIZ;
        if (iGeneralExperienceService != null) {
            iGeneralExperienceService.LIZ(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.general.IGeneralExperienceService
    public final void LJFF(String str) {
        IGeneralExperienceService iGeneralExperienceService = LIZIZ;
        if (iGeneralExperienceService != null) {
            iGeneralExperienceService.LJFF(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.general.IGeneralExperienceService
    public final boolean LJI(int i) {
        IGeneralExperienceService iGeneralExperienceService = LIZIZ;
        if (iGeneralExperienceService == null) {
            return false;
        }
        return iGeneralExperienceService.LJI(i);
    }

    @Override // com.ss.android.ugc.aweme.search.general.IGeneralExperienceService
    public final void LJII(C666110QAv c666110QAv) {
        IGeneralExperienceService iGeneralExperienceService = LIZIZ;
        if (iGeneralExperienceService != null) {
            iGeneralExperienceService.LJII(c666110QAv);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.general.IGeneralExperienceService
    public final void LJIIIZ(String str) {
        IGeneralExperienceService iGeneralExperienceService = LIZIZ;
        if (iGeneralExperienceService != null) {
            iGeneralExperienceService.LJIIIZ(str);
        }
    }

    public static void LIZIZ(CrashType crashType, JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        String strOptString;
        int i;
        if (C0QOA.LIZ < 0) {
            C0QOA.LIZ = C0C64.LJIILLIIL().LJIJ(31744, 0, "search_bsr_crash", true);
        }
        if (C0QOA.LIZ == 1 && jSONObject != null && (jSONObjectOptJSONObject = jSONObject.optJSONObject("filters")) != null && (strOptString = jSONObjectOptJSONObject.optString("search_session_id")) != null && strOptString.length() != 0) {
            int i2 = C803600Vfi.LIZ[crashType.ordinal()];
            int i3 = 501;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            i = 0;
                        } else {
                            i = 502;
                        }
                    } else {
                        i = 501;
                    }
                } else {
                    i = 503;
                }
            } else {
                i = 504;
            }
            String strOptString2 = jSONObject.optString("data");
            if (!a0.LJJIIZI(strOptString2, "java.lang.OutOfMemoryError", false)) {
                i3 = i;
                if (i == 0) {
                    return;
                }
            }
            C666110QAv c666110QAv = new C666110QAv(i3, a0.LJJZ(strOptString2, "\n", strOptString2));
            c666110QAv.LIZJ = new C0QGC(strOptString, jSONObjectOptJSONObject.optString("search_id"), "", 0, 0);
            long jOptLong = jSONObject.optLong("crash_time");
            if (jOptLong > 0) {
                c666110QAv.LJII = jOptLong;
            }
            IGeneralExperienceService iGeneralExperienceService = LIZIZ;
            if (iGeneralExperienceService != null) {
                iGeneralExperienceService.LJII(c666110QAv);
            }
        }
    }
}
