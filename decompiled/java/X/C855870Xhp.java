package X;

import com.ss.android.ugc.aweme.creative.model.audio.PreCheckResultModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0Xhp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C855870Xhp extends AbstractC855920Xhu {
    public final VideoPublishEditModel LIZJ;
    public final ArrayList<AbstractC855890Xhr> LIZLLL;

    @Override // X.AbstractC855920Xhu
    public final boolean LJ() {
        return true;
    }

    @Override // X.AbstractC855920Xhu
    public final AbstractC855890Xhr LIZ() {
        AbstractC855890Xhr abstractC855890Xhr = null;
        if (this.LIZJ.creativeModel.privacySettingModel.isSubscribeOnly) {
            Iterator<AbstractC855890Xhr> it2 = this.LIZLLL.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                AbstractC855890Xhr next = it2.next();
                if (next.LIZIZ() == C0FPS.ECOMMERCE.getScene()) {
                    abstractC855890Xhr = next;
                    break;
                }
            }
            return abstractC855890Xhr;
        }
        Iterator<AbstractC855890Xhr> it3 = this.LIZLLL.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            AbstractC855890Xhr next2 = it3.next();
            if (next2.LIZIZ() == C0FPS.LONG_VIDEO.getScene()) {
                abstractC855890Xhr = next2;
                break;
            }
        }
        return abstractC855890Xhr;
    }

    @Override // X.AbstractC855920Xhu
    public final void LJFF() {
        HashMap<Integer, PreCheckResultModel> detectResults;
        PreCheckResultModel preCheckResultModel;
        PreCheckResultModel preCheckResultModel2;
        HashMap<Integer, PreCheckResultModel> detectResults2 = this.LIZJ.creativeModel.audioCopyrightDetectModel.getDetectResults();
        PreCheckResultModel preCheckResultModel3 = detectResults2 != null ? detectResults2.get(Integer.valueOf(C0FPS.LONG_VIDEO.getScene())) : null;
        HashMap<Integer, PreCheckResultModel> detectResults3 = this.LIZJ.creativeModel.audioCopyrightDetectModel.getDetectResults();
        PreCheckResultModel preCheckResultModel4 = detectResults3 != null ? detectResults3.get(Integer.valueOf(C0FPS.ECOMMERCE.getScene())) : null;
        if (preCheckResultModel3 != null) {
            if (preCheckResultModel3.detectPass) {
                if (preCheckResultModel4 != null && !preCheckResultModel4.detectPass) {
                    AbstractC855890Xhr abstractC855890XhrLIZ = LIZ();
                    if (abstractC855890XhrLIZ != null) {
                        abstractC855890XhrLIZ.LJI();
                        return;
                    }
                    return;
                }
                if (preCheckResultModel3 == null) {
                    return;
                }
            }
            if (preCheckResultModel3.detectPass) {
                if (preCheckResultModel4 != null && preCheckResultModel4.detectPass) {
                    HashMap<Integer, PreCheckResultModel> detectResults4 = this.LIZJ.creativeModel.audioCopyrightDetectModel.getDetectResults();
                    if (detectResults4 == null || (preCheckResultModel2 = detectResults4.get(Integer.valueOf(C0FPS.ECOMMERCE.getScene()))) == null) {
                        return;
                    }
                    preCheckResultModel2.hasShowResult = true;
                    return;
                }
                if (preCheckResultModel3 == null) {
                    return;
                }
            }
            if (preCheckResultModel3.detectPass || (detectResults = this.LIZJ.creativeModel.audioCopyrightDetectModel.getDetectResults()) == null || (preCheckResultModel = detectResults.get(Integer.valueOf(C0FPS.ECOMMERCE.getScene()))) == null) {
                return;
            }
            preCheckResultModel.hasShowResult = true;
        }
    }

    @Override // X.AbstractC855920Xhu
    public final VideoPublishEditModel LIZJ() {
        return this.LIZJ;
    }

    @Override // X.AbstractC855920Xhu
    public final ArrayList<AbstractC855890Xhr> LIZLLL() {
        return this.LIZLLL;
    }

    public C855870Xhp(VideoPublishEditModel videoPublishEditModel, ArrayList<AbstractC855890Xhr> arrayList) {
        super(videoPublishEditModel, arrayList);
        this.LIZJ = videoPublishEditModel;
        this.LIZLLL = arrayList;
    }
}
