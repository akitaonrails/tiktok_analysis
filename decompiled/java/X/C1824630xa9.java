package X;

import android.content.Context;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.chatroom.api.SMBOptInStep;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.PcsServicePlusOptinPageParams;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.onboarding.LivePcsSmbOnboardingC2BSchemaConfig;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.onboarding.LivePcsSmbOnboardingKybSchemaConfig;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.showcase.PcsOnboardingKYBFragment;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.net.URLEncoder;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0xa9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1824630xa9 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PcsOnboardingKYBFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1824630xa9(PcsOnboardingKYBFragment pcsOnboardingKYBFragment) {
        super(0);
        this.LL = pcsOnboardingKYBFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String strEncode;
        String strLIZIZ;
        Gson gson = C1822270xWL.LIZ;
        PcsServicePlusOptinPageParams pcsServicePlusOptinPageParamsDQ2 = this.LL.JS().DQ2();
        List<SMBOptInStep> list = this.LL.JS().getState().LLILZIL;
        boolean z = this.LL.JS().LLJJIJIL;
        boolean z2 = this.LL.JS().LLILZLL + 1 == 2;
        boolean z3 = this.LL.JS().LLILZLL + 1 == 1;
        String strEncode2 = "";
        try {
            strEncode = URLEncoder.encode(GsonProtectorUtils.toJson(C1822270xWL.LIZ, list), "UTF-8");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            strEncode = "";
        }
        StringBuilder sb = new StringBuilder("aweme://webcast_pcs/opt_in_result?");
        sb.append("show_entrance=" + pcsServicePlusOptinPageParamsDQ2.getShowEntrance() + '&');
        sb.append("anchor_id=" + pcsServicePlusOptinPageParamsDQ2.getAnchorId() + '&');
        sb.append("identity_type=enterprise&");
        sb.append("opt_in_steps=" + strEncode + '&');
        sb.append("skip_form_setup=" + z + '&');
        sb.append("need_pop_to_root=false&");
        sb.append("is_kyb_complete=" + z2 + '&');
        StringBuilder sb2 = new StringBuilder("is_kyc_complete=");
        sb2.append(z3);
        sb.append(sb2.toString());
        try {
            strEncode2 = URLEncoder.encode(sb.toString(), "UTF-8");
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        this.LL.AT("click_verify");
        this.LL.vT("verify");
        Gson gson2 = C1822270xWL.LIZ;
        String value = LivePcsSmbOnboardingC2BSchemaConfig.INSTANCE.getValue();
        if (value.length() == 0) {
            String value2 = LivePcsSmbOnboardingKybSchemaConfig.INSTANCE.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("openKYBPage enterFrom=");
            sbLIZ.append("service_plus_onboarding");
            sbLIZ.append(" encodedRedirectSchema=");
            sbLIZ.append(strEncode2);
            C20441214yg.LIZIZ("PCS", C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("openKYBPage configSchema=");
            sbLIZ2.append(value2);
            C20441214yg.LIZIZ("PCS", C2188811AlT.LIZIZ(sbLIZ2));
            try {
                strEncode2 = URLEncoder.encode(strEncode2, "UTF-8");
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            if (value2.length() > 0) {
                int iLJJIZ = a0.LJJIZ(value2, '&', 0, false, 6);
                if (iLJJIZ != -1) {
                    String strSubstring = value2.substring(0, iLJJIZ);
                    String strSubstring2 = value2.substring(iLJJIZ);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(strSubstring);
                    sbLIZ3.append("%26enter_from%3D");
                    sbLIZ3.append("service_plus_onboarding");
                    sbLIZ3.append("%26redirect_schema%3D");
                    sbLIZ3.append(strEncode2);
                    sbLIZ3.append(strSubstring2);
                    sbLIZ3.append("&theme=light");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                } else {
                    strLIZIZ = value2 + "%26enter_from%3Dservice_plus_onboarding%26redirect_schema%3D" + strEncode2 + "&theme=light";
                }
            } else {
                strLIZIZ = "aweme://webview/?url=https%3A%2F%2Flf-main-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2F10%2Fgecko%2Fresource%2Ftiktok_ba_pia%2Fregistration.html%3F_pia_%3D1%26enter_from%3Dservice_plus_onboarding%26redirect_schema%3D" + strEncode2 + "%26gecko_channel%3Dtiktok_ba_pia%26gecko_bundle%3Dregistration.html&use_spark=1&container_color_auto_dark=1&hide_nav_bar=1&use_forest=1&disable_ttnet_proxy=0&status_bar_color=00000000&bdhm_bid=tiktok_ba_pia_hybrid";
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("openKYBPage schema=");
            sbLIZ4.append(strLIZIZ);
            C20441214yg.LIZIZ("PCS", C2188811AlT.LIZIZ(sbLIZ4));
            Context contextLIZ = C176600m4.LIZ();
            if (contextLIZ != null) {
                ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(contextLIZ, strLIZIZ);
            }
        } else {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("openC2BPage enterFrom=");
            sbLIZ5.append("service_plus_onboarding");
            sbLIZ5.append(" encodedRedirectSchema=");
            sbLIZ5.append(strEncode2);
            C20441214yg.LIZIZ("PCS", C2188811AlT.LIZIZ(sbLIZ5));
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("openC2BPage configSchema=");
            sbLIZ6.append(value);
            C20441214yg.LIZIZ("PCS", C2188811AlT.LIZIZ(sbLIZ6));
            String str = a0.LJJIIZI(value, "?", false) ? "&" : "?";
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append(value);
            sbLIZ7.append(str);
            sbLIZ7.append("enter_from=");
            sbLIZ7.append("service_plus_onboarding");
            sbLIZ7.append("&redirect_schema=");
            sbLIZ7.append(strEncode2);
            sbLIZ7.append("&force_theme_style=light");
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ7);
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append("openC2BPage schema=");
            sbLIZ8.append(strLIZIZ2);
            C20441214yg.LIZIZ("PCS", C2188811AlT.LIZIZ(sbLIZ8));
            Context contextLIZ2 = C176600m4.LIZ();
            if (contextLIZ2 != null) {
                ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(contextLIZ2, strLIZIZ2);
            }
        }
        return Unit.LIZ;
    }
}
