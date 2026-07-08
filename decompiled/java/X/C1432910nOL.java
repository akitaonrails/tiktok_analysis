package X;

import Y.ACallableS39S1300000_22;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.JobIntentService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.extract.video.VideoFramesUploadService;
import v7.o;

/* JADX INFO: renamed from: X.0nOL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1432910nOL {
    public static void LIZIZ(Context context, String str) {
        Intent intent = new Intent();
        C1444650nhH.LIZ.getClass();
        intent.putExtra("authkey", C1444650nhH.LIZ());
        intent.putExtra("aid", str);
        JobIntentService.enqueueWork(C786410Ut5.N3(context), (Class<?>) VideoFramesUploadService.class, 3009, intent);
    }

    public static C15O7 LIZ(C1432620nNs c1432620nNs, VideoPublishEditModel videoPublishEditModel, String str) {
        C1441390nc1.LIZ(str, "before_create_extractor");
        o oVar = new o();
        AbstractC1432780nO8 abstractC1432780nO8LIZ = C1432680nNy.LIZ(c1432620nNs, videoPublishEditModel);
        if (abstractC1432780nO8LIZ == null) {
            C201955140j.LIZ("SaveLocalWithWatermark -> createExtractFrameTask -> Error: Frame Extractor is null");
            oVar.LIZJ(null);
            return C15O7.LJIIL;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SaveLocalWithWatermark -> createExtractFrameTask -> Frame Extractor is ");
        sbLIZ.append(abstractC1432780nO8LIZ.getClass().getSimpleName());
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C15O7.LIZ(new ACallableS39S1300000_22(abstractC1432780nO8LIZ, str, videoPublishEditModel, oVar, 1));
        return oVar.LIZ;
    }
}
