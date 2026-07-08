package X;

import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.creative.model.story.stickercreate.StoryCommonStickerModel;
import com.ss.android.ugc.aweme.property.AVSettingsWrapper;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.ROTATE_DEGREE;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEUtils;
import kotlin.jvm.internal.Intrinsics;
import nv7.c0;

/* JADX INFO: renamed from: X.0nYi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1439340nYi extends AbstractC1437870nWL {
    public final VideoPublishEditModel LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;

    public final void LJII() {
        int iVideoWidth;
        FrameLayout.LayoutParams layoutParamsT2;
        if (C1428470nHB.LLFFF(this.LIZLLL)) {
            StoryCommonStickerModel commonStickerData = this.LIZLLL.creativeModel.storyEventStickerData.getCommonStickerData();
            this.LJ = commonStickerData.getWidth();
            this.LJFF = commonStickerData.getHeight();
            return;
        }
        if (this.LIZJ) {
            this.LJI = 0;
            this.LJ = 0;
            C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("forceUpdate, canvasWidth: ");
            sbLIZ.append(this.LJ);
            sbLIZ.append(", calcTargetWidth: ");
            sbLIZ.append(this.LJI);
            c1437510nVlLJJLIIIJ.LIZ("VideoSizeProvider", C2188811AlT.LIZIZ(sbLIZ));
            this.LIZJ = false;
        }
        if (this.LJI == 0 || this.LJII == 0) {
            if (this.LIZLLL.isFastImport()) {
                VESize vESizeCalcTargetRes = VEUtils.calcTargetRes(new int[]{LIZIZ(true)}, new int[]{LIZ(true)}, new ROTATE_DEGREE[]{ROTATE_DEGREE.ROTATE_NONE}, this.LIZLLL.getPreviewInfo().getPreviewWidth());
                this.LJI = vESizeCalcTargetRes.width;
                this.LJII = vESizeCalcTargetRes.height;
                C1437510nVl c1437510nVlLJJLIIIJ2 = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Not FastImport, calcTargetWidth: ");
                sbLIZ2.append(this.LJI);
                sbLIZ2.append(",calTargetHeight: ");
                sbLIZ2.append(this.LJII);
                sbLIZ2.append(", srcWidth: ");
                sbLIZ2.append(LIZIZ(true));
                sbLIZ2.append(", srcHeight: ");
                sbLIZ2.append(LIZ(true));
                c1437510nVlLJJLIIIJ2.LIZ("VideoSizeProvider", C2188811AlT.LIZIZ(sbLIZ2));
            } else {
                this.LJI = this.LIZLLL.videoWidth();
                this.LJII = this.LIZLLL.videoHeight();
                C1437510nVl c1437510nVlLJJLIIIJ3 = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Not FastImport, calcTargetWidth: ");
                sbLIZ3.append(this.LIZLLL.videoWidth());
                sbLIZ3.append(",calTargetHeight: ");
                sbLIZ3.append(this.LIZLLL.videoHeight());
                c1437510nVlLJJLIIIJ3.LIZ("VideoSizeProvider", C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        if (this.LJ == 0 || this.LJFF == 0) {
            boolean zLJFF = Intrinsics.LJFF(C1412630mrd.LIZLLL(EnumC1412640mre.AUTO_PICK_TEMPLATE), C1416310mxZ.LJJIJIIJI(this.LIZLLL, null, false));
            VideoPublishEditModel videoPublishEditModel = this.LIZLLL;
            if (videoPublishEditModel.mIsFromDraft && videoPublishEditModel.hasStickers() && !zLJFF) {
                this.LJ = this.LIZLLL.getVideoCanvasWidth() > 0 ? this.LIZLLL.getVideoCanvasWidth() : this.LIZLLL.videoWidth();
                this.LJFF = this.LIZLLL.getVideoCanvasHeight() > 0 ? this.LIZLLL.getVideoCanvasHeight() : this.LIZLLL.videoHeight();
                C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("VideoSizeProvider", "fromDraft, " + this.LJ + ", videoCanvasWidth: " + this.LIZLLL.getVideoCanvasWidth() + ", videoWidth: " + this.LIZLLL.videoWidth());
                C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("VideoSizeProvider", "fromDraft, " + this.LJFF + ", videoCanvasHeight: " + this.LIZLLL.getVideoCanvasHeight() + ", videoWidth: " + this.LIZLLL.videoHeight());
                return;
            }
            boolean zLIZ = C537820L7k.LIZ(this.LIZLLL.videoWidth(), this.LIZLLL.videoHeight());
            if (zLIZ) {
                iVideoWidth = this.LIZLLL.videoWidth();
            } else {
                int[] importVideoSize = AVSettingsWrapper.getImportVideoSize();
                int i = importVideoSize != null ? importVideoSize[0] : 720;
                int iVideoWidth2 = this.LIZLLL.videoWidth();
                if (iVideoWidth2 <= i) {
                    i = iVideoWidth2;
                }
                iVideoWidth = ((Boolean) C287060BMy.LIZ.getValue()).booleanValue() ? ((i + 4) - 1) & (-4) : ((i + 16) - 1) & (-16);
            }
            this.LJ = iVideoWidth;
            this.LJFF = zLIZ ? this.LIZLLL.videoHeight() : (int) (((double) 16) * Math.ceil(((double) iVideoWidth) / 9.0d));
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
            C1437510nVl c1437510nVlLJJLIIIJ4 = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
            StringBuilder sb = new StringBuilder("Not fromDraft, canvasWidth: ");
            sb.append(this.LJ);
            sb.append(", settingsWidth: ");
            int[] importVideoSize2 = AVSettingsWrapper.getImportVideoSize();
            sb.append(importVideoSize2 != null ? Integer.valueOf(importVideoSize2[0]) : null);
            sb.append(", videoWidth: ");
            sb.append(this.LIZLLL.videoWidth());
            sb.append(", isVideoMatch: ");
            sb.append(zLIZ);
            c1437510nVlLJJLIIIJ4.LIZ("VideoSizeProvider", sb.toString());
            C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ("VideoSizeProvider", "Not fromDraft, canvasHeight: " + this.LJFF + ", videoWidth: " + this.LIZLLL.videoHeight() + ", isVideoMatch: " + zLIZ);
        }
    }

    @Override // X.InterfaceC1444130ngR
    public final int LIZJ() {
        LJII();
        return this.LJFF;
    }

    @Override // X.InterfaceC1444130ngR
    public final int LIZLLL() {
        LJII();
        return this.LIZIZ ? this.LJ : this.LJI;
    }

    @Override // X.InterfaceC1444130ngR
    public final int LJFF() {
        LJII();
        return this.LJ;
    }

    @Override // X.InterfaceC1444130ngR
    public final int LJI() {
        LJII();
        return this.LIZIZ ? this.LJFF : this.LJII;
    }

    public C1439340nYi(VideoPublishEditModel videoPublishEditModel) {
        super(videoPublishEditModel);
        this.LIZLLL = videoPublishEditModel;
    }
}
