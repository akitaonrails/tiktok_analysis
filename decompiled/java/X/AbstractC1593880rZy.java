package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.hox.Hox;
import com.bytedance.tiktok.homepage.mainpagefragment.notification.NoticeAbility;
import com.ss.android.ugc.aweme.service.protection.ITooltipApplicabilityService;
import com.ss.android.ugc.aweme.service.protection.TooltipApplicabilityService;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rZy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public abstract class AbstractC1593880rZy implements InterfaceC1590940rVE {
    public final InterfaceC19244510Qp LIZ;
    public final WeakReference<Context> LIZIZ;
    public C0P0T LIZJ;
    public String LIZLLL = "disallow";

    @Override // X.InterfaceC1590940rVE
    public final boolean shouldShow() {
        C19EG c19egLIZIZ;
        NoticeAbility noticeAbility;
        if (!TooltipApplicabilityService.LJII().LIZLLL(this.LIZ)) {
            this.LIZLLL = "disallow";
            LIZ();
            return false;
        }
        Context context = this.LIZIZ.get();
        Boolean boolValueOf = null;
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            Fragment fragmentKi = Hox.LLJILJIL.LIZ(c19egLIZIZ).Ki("page_feed");
            if (fragmentKi != null && (noticeAbility = (NoticeAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentKi, null), NoticeAbility.class, null)) != null) {
                boolValueOf = Boolean.valueOf(noticeAbility.Rq1());
            }
            if (Intrinsics.LJFF(boolValueOf, Boolean.FALSE)) {
                this.LIZLLL = "disallow";
                LIZ();
                return false;
            }
        }
        this.LIZLLL = "allow";
        LIZ();
        return LIZIZ();
    }

    @Override // X.InterfaceC1590940rVE
    public final void LIZJ(String str) {
        C20684815ws.LJIILLIIL("tooltip_protection_show", LIZLLL(str).LIZ);
    }

    public final C2344009Gk LIZLLL(String str) {
        ITooltipApplicabilityService iTooltipApplicabilityServiceLJII = TooltipApplicabilityService.LJII();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("scene_id", String.valueOf(this.LIZ.getScene()));
        c2344009Gk.LIZJ(iTooltipApplicabilityServiceLJII.LIZIZ(), "user_active_days");
        c2344009Gk.LJIIIIZZ("result", this.LIZLLL);
        c2344009Gk.LIZJ(iTooltipApplicabilityServiceLJII.LIZJ(this.LIZ), "tooltip_unlock_active_day");
        c2344009Gk.LIZJ(iTooltipApplicabilityServiceLJII.isNewUser() ? 1 : 0, "is_new_user");
        c2344009Gk.LIZJ(iTooltipApplicabilityServiceLJII.LIZ() ? 1 : 0, "is_logged_in");
        c2344009Gk.LIZJ(iTooltipApplicabilityServiceLJII.LJFF() ? 1 : 0, "is_new_signup_user");
        c2344009Gk.LJIIIIZZ("tooltip_id", str);
        c2344009Gk.LIZJ(!iTooltipApplicabilityServiceLJII.LJ() ? 1 : 0, "protection_test_group");
        return c2344009Gk;
    }

    public AbstractC1593880rZy(InterfaceC19244510Qp interfaceC19244510Qp, WeakReference<Context> weakReference) {
        this.LIZ = interfaceC19244510Qp;
        this.LIZIZ = weakReference;
    }

    public static void LJ(String str, String str2, String str3, String str4, String str5, String str6) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("position", str2);
        c2344009Gk.LJIIIIZZ("content", str3);
        c2344009Gk.LJIIIIZZ("product_line", str4);
        c2344009Gk.LJIIIIZZ("sub_type", str5);
        c2344009Gk.LJIIIIZZ("tooltip_id", str6);
        C20684815ws.LJIILLIIL("show_tooltip", c2344009Gk.LIZ);
    }
}
