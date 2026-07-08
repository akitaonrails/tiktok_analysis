package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.creative.compileconfig.BaseCompileConfigParams;
import com.ss.android.ugc.aweme.creative.compileconfig.VEVideoEncodeConfigParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.nletemplate.INLETemplateOfflineService;

/* JADX INFO: renamed from: X.0nVT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1437330nVT extends AbstractC1440790nb3<VEVideoEncodeConfigParams> {
    public final C1437060nV2 LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;

    @Override // X.InterfaceC1440780nb2
    public final String getName() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1440780nb2
    public final int getPriority() {
        return this.LJ;
    }

    @Override // X.InterfaceC1440780nb2
    public final String getStage() {
        return this.LIZJ;
    }

    @Override // X.AbstractC1440790nb3
    public final void LIZ(BaseCompileConfigParams baseCompileConfigParams) {
        String strLJI;
        VEVideoEncodeConfigParams vEVideoEncodeConfigParams = (VEVideoEncodeConfigParams) baseCompileConfigParams;
        this.LIZIZ.LIZIZ.LJ.LIZ = C1442670ne5.LIZ();
        SettingsManager.LIZLLL().getClass();
        vEVideoEncodeConfigParams.setGopSize(SettingsManager.LJ("synthetic_video_gop", 35));
        if (C1442650ne3.LIZ() && C1442660ne4.LIZ().length() > 0) {
            strLJI = C1442660ne4.LIZ();
        } else {
            SettingsManager.LIZLLL().getClass();
            strLJI = SettingsManager.LJI("avtools_720p_mv_photo_ve_synthesis_settings", "");
        }
        if (C1442670ne5.LIZ() && !this.LIZIZ.LIZ()) {
            SettingsManager.LIZLLL().getClass();
            strLJI = SettingsManager.LJI("avtools_720p_mv_photo_ve_synthesis_settings", "");
        }
        if (this.LIZIZ.LIZ.isPhotoMvMode() && strLJI.length() > 0) {
            this.LIZIZ.LIZIZ.LJ.LJFF = false;
        } else if (C1428470nHB.LJLJLJ(this.LIZIZ.LIZ)) {
            int[] iArrLJII = C1431750nMT.LJII(this.LIZIZ.LIZ);
            if (Math.min(iArrLJII[0], iArrLJII[1]) >= 1080 && !C1444940nhk.LJIIJ(this.LIZIZ.LIZ.getCanvasVideoData())) {
                strLJI = C1442600ndy.LIZ();
                if (strLJI.length() <= 0) {
                    strLJI = C1428470nHB.LJJIJIIJI(this.LIZIZ.LIZ);
                }
            } else {
                strLJI = C1428470nHB.LJJIJIIJI(this.LIZIZ.LIZ);
            }
        } else if (this.LIZIZ.LIZ()) {
            strLJI = C1442600ndy.LIZ();
        } else {
            strLJI = C1428470nHB.LJJIJIIJI(this.LIZIZ.LIZ);
        }
        if (((INLETemplateOfflineService) ServiceManager.get().getService(INLETemplateOfflineService.class)).LJFF()) {
            strLJI = C1428470nHB.LJJIJIIJI(this.LIZIZ.LIZ);
        }
        vEVideoEncodeConfigParams.setExternalSettingsJsonStr(strLJI);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1437330nVT(InterfaceC1440780nb2 interfaceC1440780nb2, C1437060nV2 c1437060nV2) {
        super(interfaceC1440780nb2);
        C1437140nVA c1437140nVA = C1437140nVA.LIZ;
        String str = c1437140nVA.key;
        int i = c1437140nVA.priority;
        this.LIZIZ = c1437060nV2;
        this.LIZJ = "upload";
        this.LIZLLL = str;
        this.LJ = i;
    }
}
