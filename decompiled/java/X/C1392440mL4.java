package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.anchor.service.ITemplateAnchorStrategyService;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.creative.model.MDPRecommendTemplateInfo;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mL4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1392440mL4 extends AbstractC1394250mNz {
    public final AnchorCommonStruct LIZJ;
    public final InterfaceC1392640mLO LIZLLL;

    /* JADX WARN: Removed duplicated region for block: B:69:0x01f2  */
    @Override // X.InterfaceC1394050mNf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.EnumC1050190dR3 LIZ() {
        /*
            Method dump skipped, instruction units count: 801
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1392440mL4.LIZ():X.0dR3");
    }

    @Override // X.AbstractC1394250mNz
    public final boolean LJI() {
        String extra;
        if (C1392450mL5.LIZ("ugc") && (extra = this.LIZJ.getExtra()) != null) {
            Object objOpt = new JSONObject(extra).opt("access_aggregation_page");
            if (Intrinsics.LJFF("1", objOpt != null ? objOpt.toString() : null)) {
                return true;
            }
        }
        return C0C64.LJIILLIIL().LJIIIZ(31744, "studio_show_v2t_template_detail_ignore_experiment", true, false);
    }

    @Override // X.AbstractC1394250mNz, X.InterfaceC1394050mNf
    public final boolean LJ(C2344009Gk c2344009Gk) {
        MDPRecommendTemplateInfo mDPRecommendTemplateInfoLIZIZ;
        Bundle arguments;
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).infoService().loadNLELib();
        CommentService.LIZ.getClass();
        Map<String, String> contentRecReasonParams = C523420Kfs.LIZ().getContentRecReasonParams(this.LIZLLL.LJJLIIIJJIZ(), this.LIZLLL.Cf());
        if (contentRecReasonParams != null) {
            c2344009Gk.LJII(contentRecReasonParams);
        }
        if (LJI() && (!Intrinsics.LJFF(this.LIZJ.subType(), "sgt") || !C0FQJ.LIZ())) {
            ITemplateAnchorStrategyService iTemplateAnchorStrategyService = (ITemplateAnchorStrategyService) ServiceManager.get().getService(ITemplateAnchorStrategyService.class);
            Activity activityLIZIZ = this.LIZLLL.LIZIZ();
            AnchorCommonStruct anchorCommonStruct = this.LIZJ;
            Aweme awemeLJJLIIIJJIZ = this.LIZLLL.LJJLIIIJJIZ();
            String strCf = this.LIZLLL.Cf();
            String strLLIIJI = this.LIZLLL.LLIIJI();
            String strLJI = this.LIZLLL.LJI();
            String strLJIIIZ = c2344009Gk.LJIIIZ("main_anchor_type");
            Fragment fragmentLJ = this.LIZLLL.LJ();
            if (fragmentLJ == null || (arguments = fragmentLJ.getArguments()) == null || (mDPRecommendTemplateInfoLIZIZ = (MDPRecommendTemplateInfo) arguments.getParcelable("mdp_recommend_template_info")) == null) {
                mDPRecommendTemplateInfoLIZIZ = C1398670mV7.LIZIZ(this.LIZLLL.LJJLIIIJJIZ());
            }
            iTemplateAnchorStrategyService.LIZIZ(activityLIZIZ, anchorCommonStruct, awemeLJJLIIIJJIZ, strCf, strLLIIJI, strLJI, strLJIIIZ, mDPRecommendTemplateInfoLIZIZ);
        } else {
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService("ugc_template", new C1401820maC(this, c2344009Gk, 4));
        }
        AnchorCommonStruct anchorCommonStruct2 = this.LIZJ;
        this.LIZLLL.LJJLIIIJJIZ();
        C1394340mO8.LIZJ(c2344009Gk, anchorCommonStruct2);
        c2344009Gk.LIZJ(this.LIZLLL.LJJLIIIJJIZ().getAwemeType(), "aweme_type");
        return true;
    }

    public C1392440mL4(InterfaceC1392640mLO interfaceC1392640mLO, AnchorCommonStruct anchorCommonStruct) {
        super(interfaceC1392640mLO, anchorCommonStruct);
        this.LIZJ = anchorCommonStruct;
        this.LIZLLL = interfaceC1392640mLO;
    }
}
