package X;

import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.vesdk.VEUtils;
import java.util.List;

/* JADX INFO: renamed from: X.0LIZ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LIZ {
    public static NLEResourceAV LIZ(SrcImageInfo srcImageInfo, long j) {
        String path = srcImageInfo.getPath();
        C533730KwV.LIZ.getClass();
        NLEResType nLEResTypeLJ = C533730KwV.LJ(path);
        NLEResourceAV nLEResourceAV = new NLEResourceAV();
        nLEResourceAV.setResourceFile(path);
        nLEResourceAV.setResourceType(nLEResTypeLJ);
        nLEResourceAV.setDuration(j);
        boolean z = false;
        if (!C297420BlE.LIZ() || nLEResTypeLJ != NLEResType.IMAGE) {
            if (path == null) {
                path = "";
            }
            List<VEUtils.VEAudioFileInfo> audioFileInfoForAllTracks = VEUtils.getAudioFileInfoForAllTracks(path);
            if (audioFileInfoForAllTracks != null && !audioFileInfoForAllTracks.isEmpty()) {
                z = true;
            }
        }
        nLEResourceAV.setHasAudio(z);
        return nLEResourceAV;
    }
}
