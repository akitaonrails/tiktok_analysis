package X;

import com.ss.android.ugc.aweme.creative.compileconfig.BaseCompileConfigParams;
import com.ss.android.ugc.aweme.creative.compileconfig.CompileConfigResolution;
import com.ss.android.ugc.aweme.creative.compileconfig.VEVideoEncodeConfigParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.nletemplate.INLETemplateOfflineService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nVJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1437230nVJ extends AbstractC1440790nb3<VEVideoEncodeConfigParams> {
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
        boolean z;
        int[] iArrLIZIZ;
        CompileConfigResolution compileConfigResolution;
        VEVideoEncodeConfigParams vEVideoEncodeConfigParams = (VEVideoEncodeConfigParams) baseCompileConfigParams;
        C1437060nV2 c1437060nV2 = this.LIZIZ;
        VideoPublishEditModel videoPublishEditModel = c1437060nV2.LIZ;
        if (!c1437060nV2.LJFF && !c1437060nV2.LJ) {
            z = false;
        } else {
            z = true;
        }
        boolean zLIZLLL = C1431750nMT.LIZLLL(videoPublishEditModel, z, c1437060nV2.LIZ());
        VideoPublishEditModel videoPublishEditModel2 = this.LIZIZ.LIZ;
        if (videoPublishEditModel2.isPhotoMvMode()) {
            C1437060nV2 c1437060nV22 = this.LIZIZ;
            C1437400nVa c1437400nVa = c1437060nV22.LIZIZ;
            iArrLIZIZ = C1431750nMT.LJFF(videoPublishEditModel2, c1437400nVa.LJ.LIZ, c1437400nVa.LIZ(c1437060nV22.LIZ()));
        } else if (C1444940nhk.LJII(videoPublishEditModel2.getCanvasVideoData())) {
            iArrLIZIZ = C1431750nMT.LJ(videoPublishEditModel2);
        } else if (videoPublishEditModel2.isMvThemeVideoType()) {
            iArrLIZIZ = C1431750nMT.LJIIIZ(videoPublishEditModel2);
        } else if (Intrinsics.LJFF(C1416310mxZ.LJJIJIIJI(videoPublishEditModel2, null, true), C1412630mrd.LIZLLL(EnumC1412640mre.PUGC_TEMPLATE)) && !Intrinsics.LJFF(C1412380mrE.LIZ(videoPublishEditModel2), C1412390mrF.LJIIIIZZ)) {
            iArrLIZIZ = C1431750nMT.LJIIIZ(videoPublishEditModel2);
        } else if (zLIZLLL) {
            iArrLIZIZ = C1431750nMT.LJI(videoPublishEditModel2, this.LIZIZ.LIZ());
        } else if (videoPublishEditModel2.isDuet()) {
            iArrLIZIZ = C1431750nMT.LIZJ(videoPublishEditModel2);
        } else if (C1428470nHB.LLFF(videoPublishEditModel2)) {
            C1437060nV2 c1437060nV23 = this.LIZIZ;
            iArrLIZIZ = C1431750nMT.LIZ(videoPublishEditModel2, c1437060nV23.LIZIZ.LIZ(c1437060nV23.LIZ()));
        } else if (videoPublishEditModel2.hasText()) {
            C1437060nV2 c1437060nV24 = this.LIZIZ;
            iArrLIZIZ = C1431750nMT.LJIIJ(videoPublishEditModel2, c1437060nV24.LIZIZ.LIZ(c1437060nV24.LIZ()));
        } else {
            C1437060nV2 c1437060nV25 = this.LIZIZ;
            iArrLIZIZ = C1431750nMT.LIZIZ(videoPublishEditModel2, c1437060nV25.LIZIZ.LIZ(c1437060nV25.LIZ()));
        }
        if (((INLETemplateOfflineService) ServiceManager.get().getService(INLETemplateOfflineService.class)).LJFF()) {
            compileConfigResolution = new CompileConfigResolution(0, 0, null, null, 15, null);
        } else {
            compileConfigResolution = new CompileConfigResolution(iArrLIZIZ[0], iArrLIZIZ[1], null, null, 12, null);
        }
        vEVideoEncodeConfigParams.setOutputSize(compileConfigResolution);
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_2k_4k_remus_video_res_enable", true, false)) {
            vEVideoEncodeConfigParams.setEnableRemuxVideoRes(C0C64.LJIILLIIL().LJIJ(31744, -1, "studio_2k_4k_remus_video_res_value", true));
        }
        AwS601S0100000_22 awS601S0100000_22 = new AwS601S0100000_22(vEVideoEncodeConfigParams, 852);
        AwS601S0100000_22 awS601S0100000_222 = new AwS601S0100000_22(vEVideoEncodeConfigParams, 853);
        AwS601S0100000_22 awS601S0100000_223 = new AwS601S0100000_22(vEVideoEncodeConfigParams, 854);
        if (C1428470nHB.LJLLJ(videoPublishEditModel2) || (C1428470nHB.LIZLLL(videoPublishEditModel2) && (iArrLIZIZ[0] > videoPublishEditModel2.videoWidth() || iArrLIZIZ[1] > videoPublishEditModel2.videoHeight()))) {
            C564000MAc.LIZJ("UploadResizeModel; resizeModel : 3, resizeX : 0.0f, resizeY : 0.0f");
            awS601S0100000_22.invoke(3);
            awS601S0100000_222.invoke(Float.valueOf(0.0f));
            awS601S0100000_223.invoke(Float.valueOf(0.0f));
        } else if (videoPublishEditModel2.isFastImport() || videoPublishEditModel2.isDuet() || videoPublishEditModel2.isStitchMode()) {
            C564000MAc.LIZJ("UploadResizeModel; resizeModel : 1");
            awS601S0100000_22.invoke(1);
        }
        if (C1428470nHB.LLIIIJ(videoPublishEditModel2)) {
            C564000MAc.LIZJ("UploadResizeModel; resizeModel : 1");
            awS601S0100000_22.invoke(1);
        } else if (videoPublishEditModel2.getCanvasVideoData() != null) {
            C564000MAc.LIZJ("UploadResizeModel; resizeModel : 4");
            awS601S0100000_22.invoke(4);
        }
        vEVideoEncodeConfigParams.setPseudoLandscape(zLIZLLL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1437230nVJ(InterfaceC1440780nb2 interfaceC1440780nb2, C1437060nV2 c1437060nV2) {
        super(interfaceC1440780nb2);
        C1437160nVC c1437160nVC = C1437160nVC.LIZ;
        String str = c1437160nVC.key;
        int i = c1437160nVC.priority;
        this.LIZIZ = c1437060nV2;
        this.LIZJ = "upload";
        this.LIZLLL = str;
        this.LJ = i;
    }
}
