package X;

import Y.ARunnableS97S0200000_28;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.unifiedauth.push.UniAuthGuidePopupServiceImpl;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.ss.android.ugc.aweme.unifiedauthapi.model.CustomizedFrequencyControl;
import com.ss.android.ugc.aweme.unifiedauthapi.model.OneClickSysPopupConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupInstanceConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import com.ss.android.ugc.awemepushapi.IPushApi;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.10Cs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19208410Cs implements InterfaceC2214621Bm0 {
    public final /* synthetic */ UnifiedAuthPopupConfig LIZ;
    public final /* synthetic */ C10DS LIZIZ;
    public final /* synthetic */ PopupInstanceConfig LIZJ;
    public final /* synthetic */ UniAuthGuidePopupServiceImpl LIZLLL;
    public final /* synthetic */ Context LJ;
    public final /* synthetic */ C259800zU<Class<?>> LJFF;

    /* JADX WARN: Type inference failed for: r0v21, types: [T, java.lang.Class] */
    @Override // X.InterfaceC2214621Bm0
    public final void LIZ() throws JSONException {
        C1917270zzZ c1917270zzZ;
        String strLIZ;
        C10D2 c10d2;
        CustomizedFrequencyControl customizedFrequencyControl;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("System.notShownBack(combineType: ");
        sbLIZ.append(this.LIZJ.popupCombinationType);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("[Push-Sys]");
        UniAuthGuidePopupServiceImpl uniAuthGuidePopupServiceImpl = this.LIZLLL;
        PopupInstanceConfig popupInstanceConfig = this.LIZJ;
        uniAuthGuidePopupServiceImpl.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("type: ");
        sbLIZ2.append(popupInstanceConfig.popupCombinationType);
        sbLIZ2.append(", manufacturer: ");
        sbLIZ2.append(Build.MANUFACTURER);
        sbLIZ2.append(", version: ");
        int i = Build.VERSION.SDK_INT;
        sbLIZ2.append(i);
        sbLIZ2.append(", experiment: ");
        C01GW c01gw = C299420BoS.LIZ;
        sbLIZ2.append(((Number) c01gw.getValue()).intValue() == 1);
        C2188811AlT.LIZIZ(sbLIZ2);
        C211000rc.LIZ("[OPPO]");
        if (popupInstanceConfig.popupCombinationType != 3 || i < 33 || ((Number) c01gw.getValue()).intValue() != 1) {
            int i2 = this.LIZJ.popupCombinationType;
            if (i2 == 0 || i2 == 3) {
                this.LJFF.element = this.LIZLLL.LJFF(this.LJ, this.LIZIZ, this.LIZ);
                return;
            } else {
                this.LIZLLL.LJI(this.LJ, this.LIZIZ, this.LIZ);
                return;
            }
        }
        C211000rc.LIZ("[OPPO]");
        IPushApi.Companion.getClass();
        IPushApi value = C815820VzQ.LIZIZ.getValue();
        if (!(value != null && value.isOppoPushDfReady(this.LJ))) {
            C211000rc.LIZ("[OPPO]");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Scene.SCENE_SERVICE, "oppo_push_popup");
            jSONObject.put("exception_msg", "df_not_ready");
            AppLogNewUtils.onEventV3("oppo_df_invoke_exception", jSONObject);
            this.LIZLLL.LJFF(this.LJ, this.LIZIZ, this.LIZ);
            return;
        }
        OneClickSysPopupConfig oneClickSysPopupConfig = this.LIZJ.oneClickSysPopup;
        ARunnableS97S0200000_28 aRunnableS97S0200000_28 = null;
        if (oneClickSysPopupConfig == null || (customizedFrequencyControl = oneClickSysPopupConfig.customizedFrequencyControl) == null) {
            c1917270zzZ = null;
            strLIZ = null;
        } else {
            c1917270zzZ = new C1917270zzZ(customizedFrequencyControl.name, customizedFrequencyControl.showUpInterval, customizedFrequencyControl.exitingLimit, customizedFrequencyControl.showUpIntervalAfterExiting);
            strLIZ = c1917270zzZ.LIZ();
        }
        if (strLIZ == null) {
            strLIZ = "";
        }
        if (strLIZ.length() > 0) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("oneClickSysPopup hit freq control: ");
            sbLIZ3.append(strLIZ);
            C2188811AlT.LIZIZ(sbLIZ3);
            C211000rc.LIZ("[OPPO]");
            this.LIZLLL.LJFF(this.LJ, this.LIZIZ, this.LIZ);
            return;
        }
        C013C c013c = new C013C();
        boolean z = oneClickSysPopupConfig != null && oneClickSysPopupConfig.showMask;
        Handler handlerLIZJ = C799570VYd.LIZJ();
        if (z) {
            c10d2 = new C10D2(this.LJ);
            aRunnableS97S0200000_28 = new ARunnableS97S0200000_28(c10d2, oneClickSysPopupConfig, 3);
        } else {
            c10d2 = null;
        }
        try {
            try {
                if (C0C64.LJIILLIIL().LJIIIZ(31744, "oppo_df_enable_exception", true, false)) {
                    throw new RuntimeException("oppo_df_enable_exception: forced exception for testing");
                }
                if (aRunnableS97S0200000_28 != null) {
                    long delayInMs = OppoPermissionPopupMaskDelayExp.INSTANCE.getDelayInMs();
                    if (delayInMs <= 0) {
                        C786410Ut5.LJJZZIII(handlerLIZJ, aRunnableS97S0200000_28);
                    } else {
                        C786410Ut5.LJLIIL(delayInMs, handlerLIZJ, aRunnableS97S0200000_28);
                    }
                }
                UnifiedAuthPopupConfig unifiedAuthPopupConfig = this.LIZ;
                String str = unifiedAuthPopupConfig.sysPage;
                if (str == null) {
                    str = "system";
                }
                C809020VoS.LIZIZ(new C10DC(aRunnableS97S0200000_28, handlerLIZJ, c10d2, this.LIZLLL, this.LJ, unifiedAuthPopupConfig, this.LIZIZ, c013c, c1917270zzZ), str);
                return;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        TryCatchGuardChecker.doCheck(th);
        if (aRunnableS97S0200000_28 != null) {
            handlerLIZJ.removeCallbacks(aRunnableS97S0200000_28);
        }
        if (c10d2 != null) {
            c10d2.LIZ();
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("OppoPushPopup exception: ");
        sbLIZ4.append(th.getMessage());
        C2188811AlT.LIZIZ(sbLIZ4);
        C211000rc.LIZ("[OPPO]");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(Scene.SCENE_SERVICE, "oppo_push_popup");
        String message = th.getMessage();
        jSONObject2.put("exception_msg", message != null ? message : "");
        AppLogNewUtils.onEventV3("oppo_df_invoke_exception", jSONObject2);
        this.LIZLLL.LJFF(this.LJ, this.LIZIZ, this.LIZ);
    }

    @Override // X.InterfaceC2214621Bm0
    public final void LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("System.onShownBack(");
        sbLIZ.append(this.LIZ.sysPage);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("[Push-Sys]");
        C10DS c10ds = this.LIZIZ;
        if (c10ds != null) {
            c10ds.LIZIZ(0, null);
        }
    }

    public C19208410Cs(UnifiedAuthPopupConfig unifiedAuthPopupConfig, C10DS c10ds, PopupInstanceConfig popupInstanceConfig, UniAuthGuidePopupServiceImpl uniAuthGuidePopupServiceImpl, Context context, C259800zU<Class<?>> c259800zU) {
        this.LIZ = unifiedAuthPopupConfig;
        this.LIZIZ = c10ds;
        this.LIZJ = popupInstanceConfig;
        this.LIZLLL = uniAuthGuidePopupServiceImpl;
        this.LJ = context;
        this.LJFF = c259800zU;
    }
}
