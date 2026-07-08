package X;

import com.ss.android.ugc.aweme.creative.compileconfig.BaseCompileConfigParams;
import com.ss.android.ugc.aweme.creative.compileconfig.VEVideoEncodeConfigParams;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.property.StoryUploadSpeedEncodeSettings;
import com.ss.android.ugc.aweme.shortvideo.upload.StoryPublishNetworkInfo;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import java.util.List;

/* JADX INFO: renamed from: X.0nVK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1437240nVK extends AbstractC1440790nb3<VEVideoEncodeConfigParams> {
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
        StoryPublishNetworkInfo storyPublishNetworkInfo;
        Integer numValueOf;
        VEVideoEncodeConfigParams vEVideoEncodeConfigParams = (VEVideoEncodeConfigParams) baseCompileConfigParams;
        if (C1428470nHB.LLI(this.LIZIZ.LIZ)) {
            if (vEVideoEncodeConfigParams.getBitrateMode() != VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("StoryWeakNet skip: non-ABR mode=");
                sbLIZ.append(vEVideoEncodeConfigParams.getBitrateMode());
                C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            CreativeModel creativeModel = this.LIZIZ.LIZ.creativeModel;
            List listLJJLL = null;
            if (creativeModel == null || (storyPublishNetworkInfo = creativeModel.storyPublishNetworkInfo) == null) {
                return;
            }
            long speedToGetEncodeSetting = storyPublishNetworkInfo.getSpeedToGetEncodeSetting();
            if (speedToGetEncodeSetting <= 0) {
                return;
            }
            Object[] objArr = (Object[]) C308520C7m.LIZ.getValue();
            if (objArr != null) {
                listLJJLL = C13LQ.LJJLL(objArr);
            }
            StoryUploadSpeedEncodeSettings storyUploadSpeedEncodeSettingsLIZ = C1420140n3k.LIZ(Long.valueOf(speedToGetEncodeSetting), listLJJLL);
            if (storyUploadSpeedEncodeSettingsLIZ == null || (numValueOf = Integer.valueOf(storyUploadSpeedEncodeSettingsLIZ.videoBitrate)) == null || numValueOf.intValue() <= 0) {
                return;
            }
            int i = storyUploadSpeedEncodeSettingsLIZ.forceReencode;
            if (i == 1) {
                if (numValueOf.intValue() > vEVideoEncodeConfigParams.getVideoBitrate()) {
                    vEVideoEncodeConfigParams.setEnableRemuxVideo(false);
                }
            } else if (i == 2) {
                if (numValueOf.intValue() < vEVideoEncodeConfigParams.getVideoBitrate()) {
                    vEVideoEncodeConfigParams.setEnableRemuxVideo(false);
                }
            } else if (i == 3) {
                vEVideoEncodeConfigParams.setEnableRemuxVideo(false);
            }
            int hwBps = vEVideoEncodeConfigParams.getHwBps();
            vEVideoEncodeConfigParams.setHwBps(numValueOf.intValue());
            vEVideoEncodeConfigParams.setVideoBitrate(numValueOf.intValue());
            if (storyPublishNetworkInfo != null) {
                storyPublishNetworkInfo.setSuccessResetBitrate(true ^ vEVideoEncodeConfigParams.getEnableRemuxVideo());
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("StoryWeakNet override HwBps: ");
            sbLIZ2.append(hwBps);
            sbLIZ2.append(" -> ");
            sbLIZ2.append(numValueOf);
            sbLIZ2.append(" (videoBitrate=");
            sbLIZ2.append(vEVideoEncodeConfigParams.getVideoBitrate());
            sbLIZ2.append(')');
            C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1437240nVK(InterfaceC1440780nb2 interfaceC1440780nb2, C1437060nV2 c1437060nV2) {
        super(interfaceC1440780nb2);
        C1437170nVD c1437170nVD = C1437170nVD.LIZ;
        String str = c1437170nVD.key;
        int i = c1437170nVD.priority;
        this.LIZIZ = c1437060nV2;
        this.LIZJ = "upload";
        this.LIZLLL = str;
        this.LJ = i;
    }
}
