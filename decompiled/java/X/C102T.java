package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.model.AgeGateInfo;
import com.ss.android.ugc.aweme.compliance.api.model.BanInfo;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* JADX INFO: renamed from: X.102T, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C102T {
    public ComplianceSetting LIZ;
    public final Keva LIZIZ = Keva.getRepo("compliance_setting");
    public List<BanInfo> LIZJ;
    public Boolean LIZLLL;
    public Integer LJ;
    public Boolean LJFF;
    public String LJI;
    public Integer LJII;
    public ComplianceSetting LJIIIIZZ;
    public Boolean LJIIIZ;
    public Long LJIIJ;

    public final ComplianceSetting LIZ() {
        ComplianceSetting complianceSetting = this.LJIIIIZZ;
        if (complianceSetting != null) {
            return complianceSetting;
        }
        ComplianceSetting complianceSetting2 = this.LIZ;
        if (complianceSetting2 != null) {
            return complianceSetting2;
        }
        String string = this.LIZIZ.getString("cached_setting", "");
        if (!TextUtils.isEmpty(string)) {
            try {
                this.LIZ = (ComplianceSetting) new Gson().LJII(string, ComplianceSetting.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return this.LIZ;
    }

    public final void LIZIZ(ComplianceSetting complianceSetting) {
        String imprId;
        this.LJIIIIZZ = complianceSetting;
        ComplianceServiceProvider.LJIIZILJ().LIZ();
        this.LIZ = complianceSetting;
        if (complianceSetting == null) {
            this.LIZIZ.clear();
            return;
        }
        this.LIZIZ.storeString("cached_setting", GsonProtectorUtils.toJson(new Gson(), complianceSetting));
        AgeGateInfo ageGateInfo = complianceSetting.getAgeGateInfo();
        if (ageGateInfo != null && ageGateInfo.registerAgeGateAction != 0) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("type", "api");
        LogPbBean logPb = complianceSetting.getLogPb();
        if (logPb == null || (imprId = logPb.getImprId()) == null) {
            imprId = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("log_id", imprId);
        C20684815ws.LJIILLIIL("no_age_gate_for_registration_error", c2344009Gk.LIZ);
    }
}
