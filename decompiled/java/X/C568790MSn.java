package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS106S0400000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS68S0301000_8;
import lth.o;

/* JADX INFO: renamed from: X.0MSn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C568790MSn {
    public final C054G LIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));

    public static final void LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        C1443400nfG.LJIIZILJ(videoPublishEditModel);
        C1443030nef.LJII().LJIIL(videoPublishEditModel.getCreationId());
        DraftInfoModel draftInfoModel = videoPublishEditModel.creativeModel.draftInfoModel;
        draftInfoModel.saveDraftScene = "saveBeforePublish";
        draftInfoModel.saveDraftRoutedToWaveDag = true;
    }

    public final void LIZ(VideoPublishEditModel videoPublishEditModel) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        LJ(videoPublishEditModel, o.LIZ, 16, new AwS552S0100000_8(countDownLatch, 820));
        try {
            if (!countDownLatch.await(150L, TimeUnit.MILLISECONDS)) {
                C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ensureVideoCoverReadySync timeout, creationId=");
                sbLIZ.append(videoPublishEditModel.getCreationId());
                C201955140j.LJIJJ(c830690WiJ, "DmtInternalPublishServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
            }
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
            C786410Ut5.u3().interrupt();
        }
    }

    public final void LIZJ(C19EG c19eg, VideoPublishEditModel videoPublishEditModel, AwS601S0100000_22 awS601S0100000_22, AwS601S0100000_22 awS601S0100000_222) {
        LIZLLL(1, videoPublishEditModel, new AwS106S0400000_8(awS601S0100000_22, this, c19eg, videoPublishEditModel, 4), new AwS587S0100000_8(awS601S0100000_222, 550));
    }

    public final void LIZLLL(int i, VideoPublishEditModel videoPublishEditModel, Function1<? super AwemeDraft, Unit> function1, Function1<? super DraftSaveResult, Unit> function12) {
        LJ(videoPublishEditModel, o.LIZ, i, new AwS68S0301000_8(i, videoPublishEditModel, function12, function1, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0207 A[PHI: r8
      0x0207: PHI (r8v2 com.ss.android.ugc.aweme.creative.model.forward.ForwardVideo) = 
      (r8v1 com.ss.android.ugc.aweme.creative.model.forward.ForwardVideo)
      (r8v4 com.ss.android.ugc.aweme.creative.model.forward.ForwardVideo)
      (r8v4 com.ss.android.ugc.aweme.creative.model.forward.ForwardVideo)
     binds: [B:105:0x0210, B:97:0x01fd, B:99:0x0205] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r19, android.content.Context r20, int r21, final kotlin.jvm.functions.Function0<kotlin.Unit> r22) {
        /*
            Method dump skipped, instruction units count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C568790MSn.LJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, android.content.Context, int, kotlin.jvm.functions.Function0):void");
    }
}
