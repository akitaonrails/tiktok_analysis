package X;

import com.ss.android.ugc.aweme.creative.model.ailive.PromptModel;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptRequestState;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.ailive.newprompt.NewPromptPageModel;

/* JADX INFO: renamed from: X.0MDA, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MDA {
    public final NewPromptPageModel LIZ;
    public final VideoPublishEditModel LIZIZ;
    public final PromptModel LIZJ;
    public final MediaModel LIZLLL;
    public final PromptRequestState LJ;
    public final int LJFF;
    public final boolean LJI;

    public C0MDA(NewPromptPageModel newPromptPageModel, VideoPublishEditModel videoPublishEditModel, PromptModel promptModel, MediaModel mediaModel, PromptRequestState promptRequestState, int i, boolean z) {
        this.LIZ = newPromptPageModel;
        this.LIZIZ = videoPublishEditModel;
        this.LIZJ = promptModel;
        this.LIZLLL = mediaModel;
        this.LJ = promptRequestState;
        this.LJFF = i;
        this.LJI = z;
    }

    public static C0MDA LIZ(C0MDA c0mda, PromptModel promptModel, MediaModel mediaModel, PromptRequestState promptRequestState, int i, boolean z, int i2) {
        NewPromptPageModel newPromptPageModel;
        boolean z2 = z;
        int i3 = i;
        PromptRequestState promptRequestState2 = promptRequestState;
        MediaModel mediaModel2 = mediaModel;
        PromptModel promptModel2 = promptModel;
        VideoPublishEditModel videoPublishEditModel = null;
        if ((i2 & 1) != 0) {
            newPromptPageModel = c0mda.LIZ;
        } else {
            newPromptPageModel = null;
        }
        if ((i2 & 2) != 0) {
            videoPublishEditModel = c0mda.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            promptModel2 = c0mda.LIZJ;
        }
        if ((i2 & 8) != 0) {
            mediaModel2 = c0mda.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            promptRequestState2 = c0mda.LJ;
        }
        if ((i2 & 32) != 0) {
            i3 = c0mda.LJFF;
        }
        if ((i2 & 64) != 0) {
            z2 = c0mda.LJI;
        }
        c0mda.getClass();
        return new C0MDA(newPromptPageModel, videoPublishEditModel, promptModel2, mediaModel2, promptRequestState2, i3, z2);
    }
}
