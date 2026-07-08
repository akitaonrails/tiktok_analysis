package X;

import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0nWL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC1437870nWL implements InterfaceC1444130ngR {
    public final VideoPublishEditModel LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;

    public AbstractC1437870nWL(VideoPublishEditModel videoPublishEditModel) {
        this.LIZ = videoPublishEditModel;
    }

    @Override // X.InterfaceC1444130ngR
    public int LIZ(boolean z) {
        if (z) {
            return this.LIZ.videoHeight();
        }
        return this.LIZ.sourceVideoHeight();
    }

    @Override // X.InterfaceC1444130ngR
    public int LIZIZ(boolean z) {
        if (z) {
            return this.LIZ.videoWidth();
        }
        return this.LIZ.sourceVideoWidth();
    }

    @Override // X.InterfaceC1444130ngR
    public final void LJ(boolean z, boolean z2) {
        this.LIZIZ = z;
        this.LIZJ = z2;
        CoverPublishModel coverPublishModel = this.LIZ.getCoverPublishModel();
        if (coverPublishModel != null) {
            coverPublishModel.setNeedExpandCompiledSize(z);
        }
        this.LIZ.setVideoCanvasWidth(LJFF());
        this.LIZ.setVideoCanvasHeight(LIZJ());
        this.LIZ.setOutVideoWidth(LIZLLL());
        this.LIZ.setOutVideoHeight(LJI());
    }
}
