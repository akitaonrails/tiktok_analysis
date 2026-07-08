package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.app.PushCameraBlurActivity;
import com.ss.android.ugc.aweme.creative.model.MDPRecommendTemplateInfo;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.external.ui.UgcTemplateAlbumConfig;
import com.ss.android.ugc.tiktok.anchor.StickerAnchorMaker;

/* JADX INFO: renamed from: X.0maC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1401820maC extends SimpleServiceLoadCallback {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onOK$0(C1401820maC c1401820maC) {
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onLoad(AsyncAVService asyncAVService, long j) {
        switch (this.$t) {
            case 0:
                onLoad$0(this, asyncAVService, j);
                break;
            case 1:
                onLoad$1(this, asyncAVService, j);
                break;
            case 2:
                onLoad$2(this, asyncAVService, j);
                break;
            case 3:
                onLoad$3(this, asyncAVService, j);
                break;
            case 4:
                onLoad$4(this, asyncAVService, j);
                break;
            case 5:
                onLoad$5(this, asyncAVService, j);
                break;
            case 6:
                onLoad$6(this, asyncAVService, j);
                break;
            default:
                super.onLoad(asyncAVService, j);
                break;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback, com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onOK() {
        if (2 - this.$t != 0) {
            super.onOK();
        } else {
            onOK$0(this);
        }
    }

    public C1401820maC(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onLoad$0(C1401820maC c1401820maC, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord((Activity) c1401820maC.l0, ((RecordConfig.Builder) c1401820maC.l1).build());
    }

    public static final void onLoad$1(C1401820maC c1401820maC, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord((PushCameraBlurActivity) c1401820maC.l1, (RecordConfig) c1401820maC.l0);
        ((PushCameraBlurActivity) c1401820maC.l1).finish();
    }

    public static final void onLoad$2(C1401820maC c1401820maC, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord((Context) c1401820maC.l0, ((RecordConfig.Builder) c1401820maC.l1).build());
        C1618230sDF.LIZIZ.LIZ.getClass();
    }

    public static final void onLoad$3(C1401820maC c1401820maC, AsyncAVService asyncAVService, long j) {
        IRecordService iRecordServiceRecordService = asyncAVService.uiService().recordService();
        InterfaceC1392640mLO interfaceC1392640mLO = ((StickerAnchorMaker) c1401820maC.l0).LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        iRecordServiceRecordService.startRecord(interfaceC1392640mLO.LIZIZ(), ((RecordConfig.Builder) c1401820maC.l1).build());
    }

    public static final void onLoad$4(C1401820maC c1401820maC, AsyncAVService asyncAVService, long j) {
        MDPRecommendTemplateInfo mDPRecommendTemplateInfoLIZIZ;
        Bundle arguments;
        C1394340mO8 c1394340mO8 = C1394340mO8.LIZ;
        C1392440mL4 c1392440mL4 = (C1392440mL4) c1401820maC.l0;
        AnchorCommonStruct anchorCommonStruct = c1392440mL4.LIZJ;
        Aweme awemeLJJLIIIJJIZ = c1392440mL4.LIZLLL.LJJLIIIJJIZ();
        String strLLIIJI = ((C1392440mL4) c1401820maC.l0).LIZLLL.LLIIJI();
        String strLJI = ((C1392440mL4) c1401820maC.l0).LIZLLL.LJI();
        String strLJIIIZ = ((C2344009Gk) c1401820maC.l1).LJIIIZ("main_anchor_type");
        c1394340mO8.getClass();
        UgcTemplateAlbumConfig ugcTemplateAlbumConfigLJIILJJIL = C1394340mO8.LJIILJJIL(anchorCommonStruct, awemeLJJLIIIJJIZ, strLLIIJI, strLJI, strLJIIIZ, asyncAVService);
        Fragment fragmentLJ = ((C1392440mL4) c1401820maC.l0).LIZLLL.LJ();
        if (fragmentLJ == null || (arguments = fragmentLJ.getArguments()) == null || (mDPRecommendTemplateInfoLIZIZ = (MDPRecommendTemplateInfo) arguments.getParcelable("mdp_recommend_template_info")) == null) {
            mDPRecommendTemplateInfoLIZIZ = C1398670mV7.LIZIZ(((C1392440mL4) c1401820maC.l0).LIZLLL.LJJLIIIJJIZ());
        }
        ugcTemplateAlbumConfigLJIILJJIL.setMdpRecommendTemplateInfo(mDPRecommendTemplateInfoLIZIZ);
        asyncAVService.uiService().recordService().startUgcTemplateAnchorAlbum(((C1392440mL4) c1401820maC.l0).LIZLLL.LIZIZ(), ugcTemplateAlbumConfigLJIILJJIL);
        C1394230mNx c1394230mNx = C1394230mNx.LIZ;
        C2344009Gk c2344009Gk = (C2344009Gk) c1401820maC.l1;
        c2344009Gk.LIZJ(C1443560nfW.LJIIIIZZ, "from_aigc_theme_status");
        C1392440mL4 c1392440mL42 = (C1392440mL4) c1401820maC.l0;
        AnchorCommonStruct anchorCommonStruct2 = c1392440mL42.LIZJ;
        c1392440mL42.LIZLLL.LJJLIIIJJIZ();
        C1394340mO8.LIZJ(c2344009Gk, anchorCommonStruct2);
        AnchorCommonStruct anchorCommonStruct3 = ((C1392440mL4) c1401820maC.l0).LIZJ;
        c1394230mNx.getClass();
        C1394230mNx.LIZ(c2344009Gk, anchorCommonStruct3);
        if (C123100dR.LIZ(((C1392440mL4) c1401820maC.l0).LIZLLL.LJI())) {
            ((C2344009Gk) c1401820maC.l1).LJFF("enter_method", ((C1392440mL4) c1401820maC.l0).LIZLLL.LJI());
        }
        MDPRecommendTemplateInfo mdpRecommendTemplateInfo = ugcTemplateAlbumConfigLJIILJJIL.getMdpRecommendTemplateInfo();
        if (mdpRecommendTemplateInfo != null) {
            C2344009Gk c2344009Gk2 = (C2344009Gk) c1401820maC.l1;
            String ttTemplateGroupId = mdpRecommendTemplateInfo.getTtTemplateGroupId();
            c2344009Gk2.getClass();
            c2344009Gk2.LJIIIIZZ("tt_template_group_id", ttTemplateGroupId);
            c2344009Gk2.LJIIIIZZ("template_rec_reason", mdpRecommendTemplateInfo.getTemplateRecommendReason());
            c2344009Gk2.LJ(mdpRecommendTemplateInfo.getTtTemplatePinType(), "tt_template_pin_type");
        }
        IRecordMobService iRecordMobService = (IRecordMobService) ServiceManager.get().getService(IRecordMobService.class);
        String creationId = ugcTemplateAlbumConfigLJIILJJIL.getCreativeInfo().getCreationId();
        String str = (String) C298980Bnk.LIZIZ("ugc_template", "tt_template_anchor");
        String strCf = ((C1392440mL4) c1401820maC.l0).LIZLLL.Cf();
        String aid = ((C1392440mL4) c1401820maC.l0).LIZLLL.LJJLIIIJJIZ().getAid();
        if (aid == null) {
            aid = "";
        }
        iRecordMobService.LIZLLL(new C1449410nox(creationId, str, strCf, aid, null, null, null, null, 240), ((C2344009Gk) c1401820maC.l1).LIZ);
    }

    public static final void onLoad$5(C1401820maC c1401820maC, AsyncAVService asyncAVService, long j) {
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).draftService().openDraftActivity((C19EG) c1401820maC.l0, (Bundle) c1401820maC.l1);
    }

    public static final void onLoad$6(C1401820maC c1401820maC, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord(((C19M4) c1401820maC.l0).getContext(), ((RecordConfig.Builder) c1401820maC.l1).build());
    }
}
