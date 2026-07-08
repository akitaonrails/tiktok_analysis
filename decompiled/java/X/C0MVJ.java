package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasFilterParam;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.canvas.ForwardCanvasExtra;
import com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardVideo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.LighteningExtraInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS474S0200000_5;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0MVJ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MVJ extends C09AY implements Function0<C0MNB> {
    public C0MVJ() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0MNB] */
    @Override // kotlin.jvm.functions.Function0
    public final C0MNB invoke() {
        return new C0MNC() { // from class: X.0MNB
            @Override // X.C0MNC
            public final void LIZJ(VideoPublishEditModel videoPublishEditModel) {
                C1402930mbz.LJII(videoPublishEditModel, "");
            }

            @Override // X.C0MNC
            public final boolean LJ(VideoPublishEditModel videoPublishEditModel) {
                return u4.LJLL(videoPublishEditModel);
            }

            @Override // X.C0MNC
            public final boolean LJII(VideoPublishEditModel videoPublishEditModel) {
                if (C0CHQ.LIZ().getAccountService().LIZ()) {
                    return false;
                }
                if (!C338630DPh.LIZ() && !u4.LJJIIZ(videoPublishEditModel)) {
                    return false;
                }
                return true;
            }

            @Override // X.C0MNC
            public final VideoPublishEditModel LJIIIIZZ(Intent intent) {
                new C1438570nXT("internal_edit_service");
                return C1438570nXT.LJFF(intent);
            }

            @Override // X.C0MNC
            public final void LIZ(VideoPublishEditModel videoPublishEditModel, String str) {
                C1402930mbz.LJI(videoPublishEditModel, "video_edit_page", str);
            }

            @Override // X.C0MNC
            public final void LIZIZ(VideoPublishEditModel videoPublishEditModel, AwS587S0100000_8 awS587S0100000_8) {
                C0MO4.LIZ.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                C0MND c0mnd = videoPublishEditModel.creativeModel.commentForwardModel;
                if (c0mnd == null) {
                    awS587S0100000_8.invoke(Boolean.FALSE);
                } else if (c0mnd.LIZJ.getEnableSmallVideoCard()) {
                    C23250099c.LIZLLL((InterfaceC497601wk) C0MO4.LJFF.getValue(), null, null, new C567440MNi(c0mnd, c0mnd.LIZIZ, videoPublishEditModel, jCurrentTimeMillis, awS587S0100000_8, null), 3);
                } else {
                    C23250099c.LIZLLL((InterfaceC497601wk) C0MO4.LJFF.getValue(), null, null, new C567430MNh(c0mnd, c0mnd.LIZIZ, videoPublishEditModel, jCurrentTimeMillis, awS587S0100000_8, null), 3);
                }
            }

            @Override // X.C0MNC
            public final VideoPublishEditModel LIZLLL(AwemeDraft awemeDraft, C0M2T c0m2t) {
                new C1438570nXT(c0m2t.LIZ);
                return C1438570nXT.LIZJ(awemeDraft, false);
            }

            @Override // X.C0MNC
            public final AwemeDraft LJI(VideoPublishEditModel videoPublishEditModel, C0M2T c0m2t) {
                new C1438570nXT(c0m2t.LIZ);
                AwemeDraft awemeDraftLJ = C1438570nXT.LJ(videoPublishEditModel, String.valueOf(c0m2t.LIZIZ));
                awemeDraftLJ.lastEditTime = System.currentTimeMillis();
                int i = c0m2t.LIZIZ;
                awemeDraftLJ.LIZJ = i;
                int iLJIIJJI = 0;
                if (i == 16) {
                    awemeDraftLJ.LJJJJIZL.lighteningExtraInfo = new LighteningExtraInfo("");
                } else if (i == 21 || i == 36) {
                    awemeDraftLJ.LJFF = false;
                }
                awemeDraftLJ.LJJJJIZL.saveDraftAppVersion = C0CHQ.LIZ().getVersionCode();
                DraftInfoModel draftInfoModel = awemeDraftLJ.LIZ.draftInfoModel;
                if (C1428470nHB.LJIIJJI(videoPublishEditModel) >= 0) {
                    iLJIIJJI = C1428470nHB.LJIIJJI(videoPublishEditModel);
                }
                draftInfoModel.draftAwemeType = iLJIIJJI;
                return awemeDraftLJ;
            }

            @Override // X.C0MNC
            public final void LJFF(CanvasVideoData canvasVideoData, String str, AwS474S0200000_5 awS474S0200000_5) {
                String str2;
                CanvasFilterParam canvasFilterParam;
                ForwardCanvasExtra forwardCanvasExtra;
                ForwardVideo forwardVideo;
                C01GW c01gw = C567130MMd.LIZ;
                if (C1444940nhk.LJIILJJIL(canvasVideoData)) {
                    awS474S0200000_5.invoke(Boolean.TRUE, Boolean.FALSE, str);
                    return;
                }
                List<String> list = canvasVideoData.sourceInfo;
                if (list != null) {
                    str2 = (String) C13LP.LJJJLL(list);
                } else {
                    str2 = null;
                }
                List<CanvasFilterParam> transformList = canvasVideoData.getTransformList();
                if (transformList != null) {
                    canvasFilterParam = (CanvasFilterParam) C13LP.LJJJLL(transformList);
                } else {
                    canvasFilterParam = null;
                }
                CanvasExtra canvasExtra = canvasVideoData.extra;
                if (canvasExtra != null && (forwardCanvasExtra = canvasExtra.forwardCanvasExtra) != null && (forwardVideo = forwardCanvasExtra.video) != null && canvasFilterParam != null) {
                    C23250099c.LIZLLL((InterfaceC497601wk) C567130MMd.LIZ.getValue(), null, null, new C0MMY(str2, canvasFilterParam, awS474S0200000_5, str, canvasVideoData, forwardVideo, null), 3);
                } else {
                    Boolean bool = Boolean.FALSE;
                    awS474S0200000_5.invoke(bool, bool, str);
                }
            }
        };
    }
}
