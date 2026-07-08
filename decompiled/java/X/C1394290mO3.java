package X;

import com.ss.android.ugc.aweme.anchor.service.ITemplateAnchorStrategyService;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.internal.IPrivacyService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.TemplateScene;
import com.ss.android.ugc.aweme.services.external.ui.AutoCutAnchorConfig;
import java.util.List;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0mO3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1394290mO3 implements InterfaceC1394050mNf {
    public final AnchorCommonStruct LIZ;
    public final InterfaceC1392640mLO LIZIZ;

    @Override // X.InterfaceC1394050mNf
    public final void LIZJ(C2344009Gk c2344009Gk) {
    }

    @Override // X.InterfaceC1394050mNf
    public final void LIZLLL(C2344009Gk c2344009Gk) {
    }

    @Override // X.InterfaceC1394050mNf
    public final C1400390mXt o2() {
        AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(this, 1329);
        return new C1400390mXt(awS565S0100000_21, awS565S0100000_21, new AwS565S0100000_21(this, 1330), null, null, 24);
    }

    @Override // X.InterfaceC1394050mNf
    public final EnumC1050190dR3 LIZ() {
        if (((IPrivacyService) ServiceManager.get().getService(IPrivacyService.class)).LIZ()) {
            return EnumC1050190dR3.NOT_FOUND;
        }
        AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(this, 1331);
        if (!C298890Bnb.LIZ() || !C298980Bnk.LIZ()) {
            boolean z = true;
            Boolean boolValueOf = Boolean.valueOf(!((Boolean) awS565S0100000_21.invoke()).booleanValue());
            if (this.LIZ.getType() != EnumC1430380nKG.ANCHOR_AUTO_CUT.getTYPE() ? C0AYL.LIZ(Integer.valueOf(this.LIZ.getType())) : ((Boolean) awS565S0100000_21.invoke()).booleanValue()) {
                z = false;
            }
            if (((Boolean) C298980Bnk.LIZIZ(boolValueOf, Boolean.valueOf(z))).booleanValue()) {
                return EnumC1050190dR3.NOT_FOUND;
            }
        } else if (!C0AYL.LIZ(Integer.valueOf(this.LIZ.getType()))) {
            return EnumC1050190dR3.NOT_FOUND;
        }
        if (((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJ()) {
            return EnumC1050190dR3.NOT_FOUND;
        }
        C1392420mL2 c1392420mL2 = C1392420mL2.LIZ;
        AnchorCommonStruct anchorCommonStruct = this.LIZ;
        TemplateScene templateScene = TemplateScene.AUTO_CUT;
        c1392420mL2.getClass();
        EnumC1050190dR3 enumC1050190dR3LIZ = C1392420mL2.LIZ(anchorCommonStruct, templateScene);
        EnumC1050190dR3 enumC1050190dR3 = EnumC1050190dR3.NOT_FOUND;
        if (enumC1050190dR3LIZ == enumC1050190dR3) {
            return enumC1050190dR3;
        }
        return null;
    }

    @Override // X.InterfaceC1394050mNf
    public final boolean LIZIZ(C2344009Gk c2344009Gk) {
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).infoService().loadNLELib();
        AnchorCommonStruct anchorCommonStruct = this.LIZ;
        this.LIZIZ.LJJLIIIJJIZ();
        C1394340mO8.LIZJ(c2344009Gk, anchorCommonStruct);
        LJII(c2344009Gk);
        return true;
    }

    @Override // X.InterfaceC1394050mNf
    public final boolean LJ(C2344009Gk c2344009Gk) {
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).infoService().loadNLELib();
        if (C1392450mL5.LIZ("capcut") && (this.LIZ.getType() == EnumC1430380nKG.CAPCUT.getTYPE() || C1394440mOI.LJ(this.LIZ) == EnumC1394470mOL.CAPCUT)) {
            ((ITemplateAnchorStrategyService) ServiceManager.get().getService(ITemplateAnchorStrategyService.class)).LIZIZ(this.LIZIZ.LIZIZ(), this.LIZ, this.LIZIZ.LJJLIIIJJIZ(), this.LIZIZ.Cf(), this.LIZIZ.LLIIJI(), this.LIZIZ.LJI(), c2344009Gk.LJIIIZ("main_anchor_type"), null);
            AnchorCommonStruct anchorCommonStruct = this.LIZ;
            this.LIZIZ.LJJLIIIJJIZ();
            C1394340mO8.LIZJ(c2344009Gk, anchorCommonStruct);
            c2344009Gk.LIZJ(this.LIZIZ.LJJLIIIJJIZ().getAwemeType(), "aweme_type");
            return true;
        }
        AnchorCommonStruct anchorCommonStruct2 = this.LIZ;
        this.LIZIZ.LJJLIIIJJIZ();
        C1394340mO8.LIZJ(c2344009Gk, anchorCommonStruct2);
        c2344009Gk.LIZJ(this.LIZIZ.LJJLIIIJJIZ().getAwemeType(), "aweme_type");
        LJII(c2344009Gk);
        return true;
    }

    @Override // X.InterfaceC1394050mNf
    public final void LJFF(C2344009Gk c2344009Gk) {
        AnchorCommonStruct anchorCommonStruct = this.LIZ;
        this.LIZIZ.LJJLIIIJJIZ();
        C1394340mO8.LIZJ(c2344009Gk, anchorCommonStruct);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0140  */
    /* JADX WARN: Type inference failed for: r10v3, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, X.13BV] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(X.C2344009Gk r40) {
        /*
            Method dump skipped, instruction units count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1394290mO3.LJII(X.09Gk):void");
    }

    @Override // X.InterfaceC1394050mNf
    public final void p1(C2344009Gk c2344009Gk) {
        AnchorCommonStruct anchorCommonStruct = this.LIZ;
        this.LIZIZ.LJJLIIIJJIZ();
        C1394340mO8.LIZJ(c2344009Gk, anchorCommonStruct);
    }

    public C1394290mO3(InterfaceC1392640mLO interfaceC1392640mLO, AnchorCommonStruct anchorCommonStruct) {
        this.LIZ = anchorCommonStruct;
        this.LIZIZ = interfaceC1392640mLO;
    }

    public static void LJI(C1394290mO3 c1394290mO3, boolean z, String str, AutoCutAnchorConfig autoCutAnchorConfig, Integer num, String str2, int i) {
        String str3;
        Boolean boolValueOf;
        Integer numValueOf;
        Integer numValueOf2;
        List<Float> list;
        String str4;
        String strLJJLIIIJ = null;
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            autoCutAnchorConfig = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        c1394290mO3.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mobAutoCutAnchorParseData: success = ");
        sbLIZ.append(z);
        sbLIZ.append(", templateId = ");
        sbLIZ.append(str);
        sbLIZ.append(", errCode = ");
        sbLIZ.append(num);
        sbLIZ.append(", errMsg = ");
        sbLIZ.append(str2);
        sbLIZ.append(", config = ");
        sbLIZ.append(autoCutAnchorConfig);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("AutoCutTemplateHandler");
        sbLIZ2.append(' ');
        sbLIZ2.append(strLIZIZ);
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ2));
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(!z ? 1 : 0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c2344009Gk.LJ(num, "error_code");
        c2344009Gk.LJIIIIZZ("error_msg", str2);
        if (autoCutAnchorConfig != null && (str4 = autoCutAnchorConfig.templateId) != null) {
            str = str4;
        }
        c2344009Gk.LJIIIIZZ("template_id", str);
        if (autoCutAnchorConfig != null) {
            str3 = autoCutAnchorConfig.musicId;
        } else {
            str3 = null;
        }
        c2344009Gk.LJIIIIZZ("music_id", str3);
        if (autoCutAnchorConfig != null) {
            boolValueOf = Boolean.valueOf(autoCutAnchorConfig.isCommerceMusic());
        } else {
            boolValueOf = null;
        }
        c2344009Gk.LJ(boolValueOf, "is_commerce_music");
        if (autoCutAnchorConfig != null) {
            numValueOf = Integer.valueOf(autoCutAnchorConfig.minClips);
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJ(numValueOf, "min_clips");
        if (autoCutAnchorConfig != null) {
            numValueOf2 = Integer.valueOf(autoCutAnchorConfig.maxClips);
        } else {
            numValueOf2 = null;
        }
        c2344009Gk.LJ(numValueOf2, "max_clips");
        if (autoCutAnchorConfig != null && (list = autoCutAnchorConfig.durationList) != null) {
            strLJJLIIIJ = C13LP.LJJLIIIJ(list, null, null, null, 0, null, null, 63);
        }
        c2344009Gk.LJIIIIZZ("duration_list", strLJJLIIIJ);
        C20684815ws.LJIILLIIL("tool_performance_autocut_anchor_parse_data", c2344009Gk.LIZ);
    }
}
