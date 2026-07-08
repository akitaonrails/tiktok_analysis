package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;
import com.ss.android.ugc.aweme.multi.strategy.TemplateAnchorStrategy;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.AutoCutAnchorConfig;
import com.ss.android.ugc.aweme.template.TemplateAnchorConfig;

/* JADX INFO: renamed from: X.0maD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1401830maD extends SimpleServiceLoadCallback {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onLoad(AsyncAVService asyncAVService, long j) {
        switch (this.$t) {
            case 0:
                onLoad$0(this, asyncAVService, j);
                break;
            case 1:
                onLoad$1(this, asyncAVService, j);
                break;
            default:
                super.onLoad(asyncAVService, j);
                break;
        }
    }

    public static final void onLoad$0(C1401830maD c1401830maD, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startTemplateAnchorAlbum((Activity) c1401830maD.l0, (TemplateAnchorConfig) c1401830maD.l1);
        TemplateAnchorStrategy templateAnchorStrategy = (TemplateAnchorStrategy) c1401830maD.l2;
        TemplateAnchorConfig templateAnchorConfig = (TemplateAnchorConfig) c1401830maD.l1;
        templateAnchorStrategy.getClass();
        TemplateAnchorStrategy.LJ(templateAnchorConfig);
    }

    public static final void onLoad$1(C1401830maD c1401830maD, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startAutoCutAnchorAlbum(((C1394290mO3) c1401830maD.l0).LIZIZ.LIZIZ(), (AutoCutAnchorConfig) c1401830maD.l1);
        C1394230mNx c1394230mNx = C1394230mNx.LIZ;
        C2344009Gk c2344009Gk = (C2344009Gk) c1401830maD.l2;
        c2344009Gk.getClass();
        c2344009Gk.LJIIIIZZ("shoot_way", "autocut_anchor");
        c2344009Gk.LJIIIIZZ("creation_id", ((AutoCutAnchorConfig) c1401830maD.l1).creativeInfo.getCreationId());
        c2344009Gk.LJIIIIZZ("enter_from", ((C1394290mO3) c1401830maD.l0).LIZIZ.Cf());
        c2344009Gk.LJIIIIZZ("group_id", ((C1394290mO3) c1401830maD.l0).LIZIZ.LJJLIIIJJIZ().getAid());
        c2344009Gk.LIZJ(C1443560nfW.LJIIIIZZ, "from_aigc_theme_status");
        C1394290mO3 c1394290mO3 = (C1394290mO3) c1401830maD.l0;
        AnchorCommonStruct anchorCommonStruct = c1394290mO3.LIZ;
        c1394290mO3.LIZIZ.LJJLIIIJJIZ();
        C1394340mO8.LIZJ(c2344009Gk, anchorCommonStruct);
        String aid = ((C1394290mO3) c1401830maD.l0).LIZIZ.LJJLIIIJJIZ().getAid();
        c2344009Gk.getClass();
        c2344009Gk.LJIIIIZZ("from_group_id", aid);
        C1394340mO8.LIZIZ(c2344009Gk, ((C1394290mO3) c1401830maD.l0).LIZIZ.LJJLIIIJJIZ(), ((C1394290mO3) c1401830maD.l0).LIZIZ.LIZIZ());
        AnchorCommonStruct anchorCommonStruct2 = ((C1394290mO3) c1401830maD.l0).LIZ;
        c1394230mNx.getClass();
        C1394230mNx.LIZ(c2344009Gk, anchorCommonStruct2);
        if (C123100dR.LIZ(((C1394290mO3) c1401830maD.l0).LIZIZ.LJI())) {
            ((C2344009Gk) c1401830maD.l2).LJFF("enter_method", ((C1394290mO3) c1401830maD.l0).LIZIZ.LJI());
        }
        ((IRecordMobService) ServiceManager.get().getService(IRecordMobService.class)).LIZ(((C2344009Gk) c1401830maD.l2).LIZ);
    }

    public C1401830maD(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
