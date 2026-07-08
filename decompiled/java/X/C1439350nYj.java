package X;

import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.property.AVSettingsWrapper;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.util.List;
import nv7.c0;

/* JADX INFO: renamed from: X.0nYj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1439350nYj extends AbstractC1437870nWL {
    public final VideoPublishEditModel LIZLLL;
    public int LJ;
    public int LJFF;

    @Override // X.InterfaceC1444130ngR
    public final int LIZJ() {
        if (this.LJFF == 0) {
            LJII();
        }
        return this.LJFF;
    }

    @Override // X.InterfaceC1444130ngR
    public final int LIZLLL() {
        return this.LIZIZ ? LJFF() : this.LIZLLL.videoWidth();
    }

    @Override // X.InterfaceC1444130ngR
    public final int LJFF() {
        if (this.LJ == 0) {
            LJII();
        }
        return this.LJ;
    }

    @Override // X.InterfaceC1444130ngR
    public final int LJI() {
        return this.LIZIZ ? LIZJ() : this.LIZLLL.videoHeight();
    }

    public final void LJII() {
        int iVideoWidth;
        FrameLayout.LayoutParams layoutParamsT2;
        EditPreviewInfo previewInfo;
        List<EditVideoSegment> videoList;
        if (this.LIZLLL.isPhotoMvMode()) {
            if (C0BVV.LIZ() && ((previewInfo = this.LIZLLL.getPreviewInfo()) == null || (videoList = previewInfo.getVideoList()) == null || videoList.isEmpty())) {
                this.LJ = this.LIZLLL.getVideoCanvasWidth() > 0 ? this.LIZLLL.getVideoCanvasWidth() : this.LIZLLL.videoWidth();
                this.LJFF = this.LIZLLL.getVideoCanvasHeight() > 0 ? this.LIZLLL.getVideoCanvasHeight() : this.LIZLLL.videoHeight();
                return;
            } else {
                this.LJ = ((EditVideoSegment) ListProtector.get(this.LIZLLL.getPreviewInfo().getVideoList(), 0)).getVideoFileInfo().getWidth();
                this.LJFF = ((EditVideoSegment) ListProtector.get(this.LIZLLL.getPreviewInfo().getVideoList(), 0)).getVideoFileInfo().getHeight();
                return;
            }
        }
        VideoPublishEditModel videoPublishEditModel = this.LIZLLL;
        if (videoPublishEditModel.mIsFromDraft && videoPublishEditModel.hasStickers()) {
            this.LJ = this.LIZLLL.getVideoCanvasWidth() > 0 ? this.LIZLLL.getVideoCanvasWidth() : this.LIZLLL.videoWidth();
            this.LJFF = this.LIZLLL.getVideoCanvasHeight() > 0 ? this.LIZLLL.getVideoCanvasHeight() : this.LIZLLL.videoHeight();
            return;
        }
        boolean zLIZ = C537820L7k.LIZ(this.LIZLLL.videoWidth(), this.LIZLLL.videoHeight());
        if (zLIZ) {
            iVideoWidth = this.LIZLLL.videoWidth();
        } else {
            int[] importVideoSize = this.LIZLLL.isUploadVideo() ? AVSettingsWrapper.getImportVideoSize() : AVSettingsWrapper.getRecordVideoSize(this.LIZLLL);
            int i = importVideoSize != null ? importVideoSize[0] : 720;
            int iVideoWidth2 = this.LIZLLL.videoWidth();
            if (iVideoWidth2 <= i) {
                i = iVideoWidth2;
            }
            iVideoWidth = ((Boolean) C287060BMy.LIZ.getValue()).booleanValue() ? ((i + 4) - 1) & (-4) : ((i + 16) - 1) & (-16);
        }
        this.LJ = iVideoWidth;
        this.LJFF = zLIZ ? this.LIZLLL.videoHeight() : this.LIZLLL.isPhotoSwap() ? this.LJ : (int) (((double) 16) * Math.ceil(((double) this.LJ) / 9.0d));
        if (zLIZ && C301490Brn.LIZ()) {
            if (((Boolean) C284410BCt.LIZ.getValue()).booleanValue()) {
                c0 c0Var = c0.LIZ;
                layoutParamsT2 = c0Var.LIZLLL(this.LIZLLL.videoWidth(), this.LIZLLL.videoHeight());
                if (layoutParamsT2 == null) {
                    layoutParamsT2 = c0Var.t2(this.LIZLLL.videoWidth(), this.LIZLLL.videoHeight());
                }
            } else {
                layoutParamsT2 = c0.LIZ.t2(this.LIZLLL.videoWidth(), this.LIZLLL.videoHeight());
            }
            this.LJ = layoutParamsT2.width;
            this.LJFF = layoutParamsT2.height;
        }
    }

    public C1439350nYj(VideoPublishEditModel videoPublishEditModel) {
        super(videoPublishEditModel);
        this.LIZLLL = videoPublishEditModel;
    }
}
