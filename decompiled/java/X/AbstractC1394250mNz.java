package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.anchor.service.ITemplateAnchorStrategyService;
import com.ss.android.ugc.aweme.creative.model.MDPRecommendTemplateInfo;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.UgcTemplateAnchorConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mNz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1394250mNz implements InterfaceC1394050mNf {
    public final AnchorCommonStruct LIZ;
    public final InterfaceC1392640mLO LIZIZ;

    @Override // X.InterfaceC1394050mNf
    public final void LIZJ(C2344009Gk c2344009Gk) {
    }

    @Override // X.InterfaceC1394050mNf
    public final void LIZLLL(C2344009Gk c2344009Gk) {
    }

    public abstract boolean LJI();

    @Override // X.InterfaceC1394050mNf
    public final C1400390mXt o2() {
        C1394270mO1 c1394270mO1 = new C1394270mO1(this);
        return new C1400390mXt(c1394270mO1, c1394270mO1, new C1394260mO0(this), null, null, 24);
    }

    @Override // X.InterfaceC1394050mNf
    public final boolean LIZIZ(C2344009Gk c2344009Gk) {
        MDPRecommendTemplateInfo mDPRecommendTemplateInfoLIZIZ;
        Bundle arguments;
        if (LJI()) {
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).infoService().loadNLELib();
            ITemplateAnchorStrategyService iTemplateAnchorStrategyService = (ITemplateAnchorStrategyService) ServiceManager.get().getService(ITemplateAnchorStrategyService.class);
            Activity activityLIZIZ = this.LIZIZ.LIZIZ();
            AnchorCommonStruct anchorCommonStruct = this.LIZ;
            Aweme awemeLJJLIIIJJIZ = this.LIZIZ.LJJLIIIJJIZ();
            String strCf = this.LIZIZ.Cf();
            String strLLIIJI = this.LIZIZ.LLIIJI();
            String strLJI = this.LIZIZ.LJI();
            String strLJIIIZ = c2344009Gk.LJIIIZ("main_anchor_type");
            Fragment fragmentLJ = this.LIZIZ.LJ();
            if (fragmentLJ == null || (arguments = fragmentLJ.getArguments()) == null || (mDPRecommendTemplateInfoLIZIZ = (MDPRecommendTemplateInfo) arguments.getParcelable("mdp_recommend_template_info")) == null) {
                mDPRecommendTemplateInfoLIZIZ = C1398670mV7.LIZIZ(this.LIZIZ.LJJLIIIJJIZ());
            }
            iTemplateAnchorStrategyService.LIZJ(activityLIZIZ, anchorCommonStruct, awemeLJJLIIIJJIZ, strCf, strLLIIJI, strLJI, strLJIIIZ, mDPRecommendTemplateInfoLIZIZ);
            AnchorCommonStruct anchorCommonStruct2 = this.LIZ;
            this.LIZIZ.LJJLIIIJJIZ();
            C1394340mO8.LIZJ(c2344009Gk, anchorCommonStruct2);
            c2344009Gk.LIZJ(this.LIZIZ.LJJLIIIJJIZ().getAwemeType(), "aweme_type");
            return true;
        }
        return LJ(c2344009Gk);
    }

    @Override // X.InterfaceC1394050mNf
    public boolean LJ(final C2344009Gk c2344009Gk) {
        final boolean z;
        final String str;
        String strCf;
        MDPRecommendTemplateInfo mDPRecommendTemplateInfoLIZIZ;
        Bundle arguments;
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).infoService().loadNLELib();
        if (LJI()) {
            ITemplateAnchorStrategyService iTemplateAnchorStrategyService = (ITemplateAnchorStrategyService) ServiceManager.get().getService(ITemplateAnchorStrategyService.class);
            if (Intrinsics.LJFF(this.LIZIZ.Cf(), "general_search")) {
                strCf = "template_general_search";
            } else {
                strCf = this.LIZIZ.Cf();
            }
            Activity activityLIZIZ = this.LIZIZ.LIZIZ();
            AnchorCommonStruct anchorCommonStruct = this.LIZ;
            Aweme awemeLJJLIIIJJIZ = this.LIZIZ.LJJLIIIJJIZ();
            String strLLIIJI = this.LIZIZ.LLIIJI();
            String strLJI = this.LIZIZ.LJI();
            String strLJIIIZ = c2344009Gk.LJIIIZ("main_anchor_type");
            Fragment fragmentLJ = this.LIZIZ.LJ();
            if (fragmentLJ == null || (arguments = fragmentLJ.getArguments()) == null || (mDPRecommendTemplateInfoLIZIZ = (MDPRecommendTemplateInfo) arguments.getParcelable("mdp_recommend_template_info")) == null) {
                mDPRecommendTemplateInfoLIZIZ = C1398670mV7.LIZIZ(this.LIZIZ.LJJLIIIJJIZ());
            }
            iTemplateAnchorStrategyService.LIZIZ(activityLIZIZ, anchorCommonStruct, awemeLJJLIIIJJIZ, strCf, strLLIIJI, strLJI, strLJIIIZ, mDPRecommendTemplateInfoLIZIZ);
        } else {
            C1394340mO8 c1394340mO8 = C1394340mO8.LIZ;
            final AnchorCommonStruct anchorCommonStruct2 = this.LIZ;
            final InterfaceC1392640mLO interfaceC1392640mLO = this.LIZIZ;
            c1394340mO8.getClass();
            if (C1394440mOI.LJ(anchorCommonStruct2) == EnumC1394470mOL.PUGC) {
                z = true;
            } else {
                z = false;
            }
            if (!C1394330mO7.LIZ()) {
                int type = anchorCommonStruct2.getType();
                if (type == EnumC1430380nKG.ANCHOR_PUGC_TEMPLATE.getTYPE()) {
                    str = "pugc_template";
                } else if (type == EnumC1430380nKG.ANCHOR_UGC_TEMPLATE.getTYPE()) {
                    str = "ugc_template";
                } else if (type == EnumC1430380nKG.ANCHOR_AUTO_CUT.getTYPE()) {
                    str = "autocut_anchor";
                } else {
                    str = "";
                }
            } else {
                str = "tt_template_anchor";
            }
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService(str, new SimpleServiceLoadCallback() { // from class: X.0Mer
                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onLoad(AsyncAVService asyncAVService, long j) {
                    boolean z2;
                    UgcTemplateAnchorConfig ugcTemplateAnchorConfig = new UgcTemplateAnchorConfig();
                    ugcTemplateAnchorConfig.setAweme(interfaceC1392640mLO.LJJLIIIJJIZ());
                    ugcTemplateAnchorConfig.setFromPUgc(z);
                    ugcTemplateAnchorConfig.setMainAnchorType(c2344009Gk.LJIIIZ("main_anchor_type"));
                    ugcTemplateAnchorConfig.setTtTemplateType(anchorCommonStruct2.subType());
                    if (z && anchorCommonStruct2.getType() == EnumC1430380nKG.ANCHOR_AUTO_CUT.getTYPE()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    ugcTemplateAnchorConfig.setPUGCTemplateFromAutoCutAnchor(z2);
                    ugcTemplateAnchorConfig.setEpTemplateInfo(C1394340mO8.LJIIJ(anchorCommonStruct2));
                    if (z) {
                        ugcTemplateAnchorConfig.setTemplateMusicId(C1394340mO8.LJIIJJI(anchorCommonStruct2));
                    }
                    ugcTemplateAnchorConfig.setEnterMethod(interfaceC1392640mLO.LLIIJI());
                    ugcTemplateAnchorConfig.setRelationEnterMethod(interfaceC1392640mLO.LJI());
                    C2344009Gk c2344009Gk2 = c2344009Gk;
                    String str2 = str;
                    c2344009Gk2.getClass();
                    c2344009Gk2.LJIIIIZZ("shoot_way", str2);
                    c2344009Gk2.LJIIIIZZ("enter_from", interfaceC1392640mLO.Cf());
                    c2344009Gk2.LJIIIIZZ("group_id", interfaceC1392640mLO.LJJLIIIJJIZ().getAid());
                    AnchorCommonStruct anchorCommonStruct3 = anchorCommonStruct2;
                    interfaceC1392640mLO.LJJLIIIJJIZ();
                    C1394340mO8.LIZJ(c2344009Gk2, anchorCommonStruct3);
                    c2344009Gk2.LIZJ(interfaceC1392640mLO.LJJLIIIJJIZ().aigcInfo.getAIGCLabelType(), "from_aigc_theme_status");
                    InterfaceC1392640mLO interfaceC1392640mLO2 = interfaceC1392640mLO;
                    if (C123100dR.LIZ(interfaceC1392640mLO2.LJI())) {
                        c2344009Gk2.LJFF("enter_method", interfaceC1392640mLO2.LJI());
                    }
                    asyncAVService.uiService().recordService().startUgcTemplatePreviewActivity(interfaceC1392640mLO.LIZIZ(), ugcTemplateAnchorConfig, c2344009Gk);
                }
            });
        }
        AnchorCommonStruct anchorCommonStruct3 = this.LIZ;
        this.LIZIZ.LJJLIIIJJIZ();
        C1394340mO8.LIZJ(c2344009Gk, anchorCommonStruct3);
        c2344009Gk.LIZJ(this.LIZIZ.LJJLIIIJJIZ().getAwemeType(), "aweme_type");
        return true;
    }

    @Override // X.InterfaceC1394050mNf
    public final void LJFF(C2344009Gk c2344009Gk) {
        AnchorCommonStruct anchorCommonStruct = this.LIZ;
        this.LIZIZ.LJJLIIIJJIZ();
        C1394340mO8.LIZJ(c2344009Gk, anchorCommonStruct);
    }

    @Override // X.InterfaceC1394050mNf
    public final void p1(C2344009Gk c2344009Gk) {
        AnchorCommonStruct anchorCommonStruct = this.LIZ;
        this.LIZIZ.LJJLIIIJJIZ();
        C1394340mO8.LIZJ(c2344009Gk, anchorCommonStruct);
    }

    public AbstractC1394250mNz(InterfaceC1392640mLO interfaceC1392640mLO, AnchorCommonStruct anchorCommonStruct) {
        this.LIZ = anchorCommonStruct;
        this.LIZIZ = interfaceC1392640mLO;
    }
}
