package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AwS474S0200000_5;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0MNC, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public interface C0MNC {
    void LIZ(VideoPublishEditModel videoPublishEditModel, String str);

    void LIZIZ(VideoPublishEditModel videoPublishEditModel, AwS587S0100000_8 awS587S0100000_8);

    void LIZJ(VideoPublishEditModel videoPublishEditModel);

    VideoPublishEditModel LIZLLL(AwemeDraft awemeDraft, C0M2T c0m2t);

    boolean LJ(VideoPublishEditModel videoPublishEditModel);

    void LJFF(CanvasVideoData canvasVideoData, String str, AwS474S0200000_5 awS474S0200000_5);

    AwemeDraft LJI(VideoPublishEditModel videoPublishEditModel, C0M2T c0m2t);

    boolean LJII(VideoPublishEditModel videoPublishEditModel);

    VideoPublishEditModel LJIIIIZZ(Intent intent);
}
