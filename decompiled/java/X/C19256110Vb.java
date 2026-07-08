package X;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.keva.KevaImpl;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.compliance.agegate.AgeGateServiceImpl;
import com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSErrorModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10Vb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19256110Vb extends C10UK {
    public final Context LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;

    @Override // X.C10UK
    public final boolean onCancel() {
        AgeGateServiceImpl.LJIIIZ = false;
        return true;
    }

    @Override // X.C10UK
    public final boolean onDeviceBlocked() {
        AgeGateServiceImpl.LJIIIZ = false;
        return false;
    }

    @Override // X.C10UK
    public final boolean onError(PNSErrorModel pNSErrorModel) {
        AgeGateServiceImpl.LJIIIZ = false;
        String str = pNSErrorModel.appealUrl;
        if (str != null) {
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            Context context = this.LIZ;
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJLIIJ(str);
            sparkContext.LJJLIIIJJIZ(new InterfaceC1554220qY0() { // from class: X.0wsQ
                @Override // X.InterfaceC1554220qY0
                public final void LIZ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJII() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIIIIZZ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIIIZ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIIJ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIIJJI(SparkPopup sparkPopup, LayoutInflater layoutInflater) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIIL(SparkPopup sparkPopup, Configuration configuration) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIILIIL(SparkPopup sparkPopup, View view) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIILJJIL(SparkPopup sparkPopup) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIILL(SparkPopup sparkPopup, int i) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIILLIIL() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIIZILJ(SparkPopup sparkPopup) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIJ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final boolean LJIJI(SparkPopup sparkPopup) {
                    return false;
                }

                @Override // X.InterfaceC1554220qY0
                public final boolean LJIJJ(SparkPopup sparkPopup) {
                    return false;
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIJJLI(SparkPopup sparkPopup, float f) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIL(SparkPopup sparkPopup) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJI(SparkPopup sparkPopup) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJIFFI(SparkPopup sparkPopup) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJII() {
                }

                @Override // X.InterfaceC1554220qY0
                public final boolean LJJIII(SparkPopup sparkPopup, SparkContext sparkContext2) {
                    return false;
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJIIJ(SparkPopup sparkPopup) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJIIJZLJL(SparkPopup sparkPopup, boolean z) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJIIZ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJIIZI() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void onViewAttachedToWindow() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void onViewDetachedFromWindow() {
                }
            });
            c1537900q7g.getClass();
            new C1541950qED(context, sparkContext).LIZIZ();
            IAgeGateService iAgeGateService = (IAgeGateService) PluggableExtentionKt.pluggableSpi$default(IAgeGateService.class, false, false, false, 14, null);
            if (iAgeGateService != null) {
                iAgeGateService.dismiss();
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // X.C10UK
    public final boolean onSuccess(C19249810Sq c19249810Sq) {
        String str;
        String str2;
        String str3;
        Date date = c19249810Sq.LIZIZ;
        String str4 = "";
        if (date == null || (str = new SimpleDateFormat("yyyy-MM-dd", Locale.ROOT).format(date)) == null) {
            str = "";
        }
        AgeGateServiceImpl.LJ = str;
        if (Intrinsics.LJFF(c19249810Sq.LJFF, Boolean.TRUE)) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LIZ, "aweme://hyd_action/mixed_age_user_consent");
            if (Intrinsics.LJFF(this.LIZIZ, "from_edit_age")) {
                str3 = "from_edit_dob";
            } else {
                str3 = "from_existing_agegate";
            }
            smartRouteBuildRoute.withParam("enter_from", str3);
            smartRouteBuildRoute.withParam("is_prompt", c19249810Sq.LIZLLL ? 1 : 0);
            smartRouteBuildRoute.open();
            KevaImpl.getRepo("age_gate", 1).storeString("mixed_age_seen", "1");
            String str5 = AgeGateServiceImpl.LJ;
            if (str5 != null) {
                str4 = str5;
            }
            AgeGateServiceImpl.LJII = false;
            C10VY c10vy = AgeGateServiceImpl.LJFF;
            if (c10vy != null) {
                c10vy.LIZ(str4, true);
            }
            AgeGateServiceImpl.LJFF = null;
            InterfaceC19256710Vh interfaceC19256710Vh = AgeGateServiceImpl.LJI;
            if (interfaceC19256710Vh != null) {
                interfaceC19256710Vh.LIZ(str4, true);
            }
            AgeGateServiceImpl.LJI = null;
            return true;
        }
        if (c19249810Sq.LIZLLL) {
            if (this.LIZJ) {
                str2 = "aweme://hyd_action/delete_video_us";
            } else {
                str2 = "aweme://hyd_action/delete_video";
            }
            SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(this.LIZ, str2);
            smartRouteBuildRoute2.withParam("enter_from", this.LIZIZ);
            smartRouteBuildRoute2.withParam("is_prompt", 1);
            smartRouteBuildRoute2.withParam("age_gate_post_action", c19249810Sq.LIZ.getValue());
            smartRouteBuildRoute2.withParam("is_kids", 0);
            smartRouteBuildRoute2.open();
        } else {
            String str6 = AgeGateServiceImpl.LJ;
            if (str6 != null) {
                str4 = str6;
            }
            AgeGateServiceImpl.LJII = false;
            C10VY c10vy2 = AgeGateServiceImpl.LJFF;
            if (c10vy2 != null) {
                c10vy2.LIZ(str4, true);
            }
            AgeGateServiceImpl.LJFF = null;
            InterfaceC19256710Vh interfaceC19256710Vh2 = AgeGateServiceImpl.LJI;
            if (interfaceC19256710Vh2 != null) {
                interfaceC19256710Vh2.LIZ(str4, true);
            }
            AgeGateServiceImpl.LJI = null;
        }
        AgeGateServiceImpl.LJIIIZ = false;
        return true;
    }

    @Override // X.C10UK
    public final boolean onUnderage(C19249810Sq c19249810Sq) {
        C10WF c10wf = c19249810Sq.LIZ;
        if (c10wf == C10WF.US_FTC) {
            Bundle bundle = new Bundle();
            bundle.putInt("next_page", 1);
            bundle.putBoolean("is_existing_user", true);
            bundle.putInt("is_prompt", c19249810Sq.LIZLLL ? 1 : 0);
            bundle.putInt("age_gate_post_action", EnumC191814102i.US_FTC.getValue());
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LIZ, "//account/ftc");
            smartRouteBuildRoute.withParam(bundle);
            smartRouteBuildRoute.open();
        } else if (c10wf == C10WF.EU_EEA) {
            SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(this.LIZ, "aweme://hyd_action/account_deleted");
            smartRouteBuildRoute2.withParam("age_gate_time", C0XQ7.LJFF().getCurUser().getAgeGateTime());
            smartRouteBuildRoute2.withParam("is_prompt", c19249810Sq.LIZLLL ? 1 : 0);
            smartRouteBuildRoute2.withParam("age_gate_post_action", c19249810Sq.LIZ.getValue());
            smartRouteBuildRoute2.open();
        }
        AgeGateServiceImpl.LJIIIZ = false;
        return true;
    }

    public C19256110Vb(Context context, String str, boolean z) {
        this.LIZ = context;
        this.LIZIZ = str;
        this.LIZJ = z;
    }
}
