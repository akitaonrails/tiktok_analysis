package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.IGuestModeService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.journey.INUJAgeRangeService;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSErrorModel;
import com.ss.android.ugc.aweme.secapi.ISecApi;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: renamed from: X.10UJ, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10UJ extends C10UK {
    public final C10UK LIZ;
    public final HashMap<String, String> LIZIZ;
    public final boolean LIZJ;
    public final long LIZLLL = SystemClock.elapsedRealtime();
    public final SimpleDateFormat LJ = new SimpleDateFormat("yyyy-MM-dd", Locale.ROOT);

    @Override // X.C10UK
    public final boolean onCancel() {
        ComplianceServiceProvider.LIZLLL().LJIILL(null);
        LIZIZ(-3001, this.LIZIZ, false);
        return this.LIZ.onCancel();
    }

    @Override // X.C10UK
    public final boolean onDeviceBlocked() {
        ComplianceServiceProvider.LIZLLL().LJIILL(null);
        LIZIZ(56004, this.LIZIZ, false);
        return this.LIZ.onDeviceBlocked();
    }

    @Override // X.C10UK
    public final boolean onError(PNSErrorModel pNSErrorModel) {
        Integer num = pNSErrorModel.errorType;
        if (num != null) {
            LIZIZ(num.intValue(), this.LIZIZ, false);
        }
        return this.LIZ.onError(pNSErrorModel);
    }

    @Override // X.C10UK
    public void onEvent(String str) {
        this.LIZ.onEvent(str);
    }

    @Override // X.C10UK
    public final boolean onSuccess(C19249810Sq c19249810Sq) {
        String str;
        C0XQZ.LIZ().edit().putInt("ftc_age_gate_response_mode", c19249810Sq.LIZ.getValue()).apply();
        LIZJ(c19249810Sq.LIZ, false);
        Date date = c19249810Sq.LIZIZ;
        if (date == null || (str = this.LJ.format(date)) == null) {
            str = "";
        }
        ComplianceServiceProvider.LIZLLL().LJIILL(str);
        if (this.LIZJ) {
            IGuestModeService iGuestModeService = (IGuestModeService) PluggableExtentionKt.pluggableSpi$default(IGuestModeService.class, false, false, false, 14, null);
            if (iGuestModeService != null) {
                iGuestModeService.LJI(str);
            }
            INUJAgeRangeService iNUJAgeRangeService = (INUJAgeRangeService) PluggableExtentionKt.pluggableSpi$default(INUJAgeRangeService.class, false, false, false, 14, null);
            if (iNUJAgeRangeService != null) {
                iNUJAgeRangeService.LIZJ(c19249810Sq.LJIIIIZZ, c19249810Sq.LJIIIZ);
            }
        } else {
            ComplianceServiceProvider.LJIILJJIL().LJIILIIL(EnumC1876780ywG.APPROVE, EnumC1915980zxU.CONSENT_AGE_GATE_PASS, "approveDeviceConsent", null);
            ISecApi iSecApi = (ISecApi) PluggableExtentionKt.pluggableSpi$default(ISecApi.class, false, false, false, 14, null);
            if (iSecApi != null) {
                iSecApi.reportData(C0X4S.AGE_GATE.getReportName());
            }
        }
        LIZIZ(0, LIZ(this.LIZIZ, c19249810Sq), true);
        C19254610Um.LIZIZ.LJIIJJI().LIZJ();
        C10RP.LIZJ(c19249810Sq.LIZ.getValue(), str);
        return this.LIZ.onSuccess(c19249810Sq);
    }

    @Override // X.C10UK
    public final boolean onUnderage(C19249810Sq c19249810Sq) {
        String str;
        C0XQZ.LIZ().edit().putBoolean("ftc_age_gate_response_prompt", c19249810Sq.LIZLLL).apply();
        C0XQZ.LIZ().edit().putInt("ftc_age_gate_response_mode", c19249810Sq.LIZ.getValue()).apply();
        LIZJ(c19249810Sq.LIZ, true);
        IAgeGateService iAgeGateServiceLIZLLL = ComplianceServiceProvider.LIZLLL();
        Date date = c19249810Sq.LIZIZ;
        if (date == null || (str = this.LJ.format(date)) == null) {
            str = "";
        }
        iAgeGateServiceLIZLLL.LJIILL(str);
        LIZIZ(56004, LIZ(this.LIZIZ, c19249810Sq), false);
        return this.LIZ.onUnderage(c19249810Sq);
    }

    public static HashMap LIZ(HashMap map, C19249810Sq c19249810Sq) {
        String str;
        Integer num = c19249810Sq.LJIIIIZZ;
        Integer num2 = c19249810Sq.LJIIIZ;
        if (num != null) {
            if (num.intValue() == 0 && num2 != null && num2.intValue() == 12) {
                str = "below 13";
            } else if (num.intValue() == 13 && num2 != null && num2.intValue() == 15) {
                str = "13-15";
            } else if (num.intValue() == 16 && num2 != null && num2.intValue() == 17) {
                str = "16-17";
            } else if (num.intValue() >= 18) {
                str = "18+";
            }
            if (map == null) {
                map = new HashMap();
            }
            map.put("age_selected", str);
            return map;
        }
        return map;
    }

    public final void LIZJ(C10WF c10wf, boolean z) {
        IGuestModeService iGuestModeService;
        if (this.LIZJ) {
            if (c10wf == C10WF.US_FTC) {
                IGuestModeService iGuestModeService2 = (IGuestModeService) PluggableExtentionKt.pluggableSpi$default(IGuestModeService.class, false, false, false, 14, null);
                if (iGuestModeService2 != null) {
                    iGuestModeService2.LIZLLL();
                }
            } else if (!z && (iGuestModeService = (IGuestModeService) PluggableExtentionKt.pluggableSpi$default(IGuestModeService.class, false, false, false, 14, null)) != null) {
                iGuestModeService.LJIIJ(Integer.valueOf(c10wf.getValue()));
            }
            C10VR.LIZIZ("success");
        }
    }

    public C10UJ(C10UK c10uk, HashMap map, boolean z) {
        this.LIZ = c10uk;
        this.LIZIZ = map;
        this.LIZJ = z;
    }

    public final void LIZIZ(int i, HashMap map, boolean z) {
        String str;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(i, "error_code");
        c2344009Gk.LJIIIIZZ("page_stay_time", String.valueOf(SystemClock.elapsedRealtime() - this.LIZLLL));
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_success", str);
        c2344009Gk.LJI(map);
        C10SV.LIZ(c2344009Gk);
        c2344009Gk.LJFF("final_page_type", "birthday");
        C20684815ws.LJIILLIIL("age_gate_registration_response", c2344009Gk.LIZ);
    }
}
