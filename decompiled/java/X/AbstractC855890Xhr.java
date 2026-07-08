package X;

import Y.ARunnableS33S0110000_14;
import android.app.Activity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.audio.copyrightdetect.PreCheckResult;
import com.ss.android.ugc.aweme.creative.model.audio.PreCheckResultModel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.VideoPublishViewModel;
import java.util.HashMap;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: renamed from: X.0Xhr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC855890Xhr {
    public final VideoPublishEditModel LIZ;
    public final Scene LIZIZ;
    public final VideoPublishViewModel LIZJ;
    public final C19EG LIZLLL;
    public final Activity LJ;
    public final String LJFF = "BasePublishAudioCopyrightController";
    public final MutableLiveData<Integer> LJI = new MutableLiveData<>(-1);
    public final MutableLiveData<Boolean> LJII = new MutableLiveData<>(Boolean.FALSE);
    public boolean LJIIIIZZ = true;
    public PreCheckResult LJIIIZ;

    public abstract int LIZIZ();

    public abstract boolean LJ();

    public boolean LJFF() {
        return true;
    }

    public final void LJI() {
        Integer value;
        PreCheckResultModel preCheckResultModel;
        PreCheckResultModel preCheckResultModel2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LJFF);
        sbLIZ.append(" -> uiTrigger -> needShowUI() = ");
        sbLIZ.append(LJFF());
        sbLIZ.append(", isResumed = ");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", detectProcessStatus.value = ");
        sbLIZ.append(this.LJI.getValue());
        sbLIZ.append(", getDetectScene = ");
        sbLIZ.append(LIZIZ());
        sbLIZ.append("  detectResult == null : ");
        sbLIZ.append(this.LJIIIZ == null);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (LJFF() && this.LJIIIIZZ && !C362370EIp.LIZ(LIZIZ())) {
            if ((!C362380EIq.LIZ() || (!LIZJ().creativeModel.audioCopyrightDetectModel.getContinueSelected() && LIZJ().getVoiceVolume() > 0.0f && LIZJ().hasOriginalAudio(false))) && (value = this.LJI.getValue()) != null) {
                if (value.intValue() == 101) {
                    if (this.LJIIIZ == null) {
                        return;
                    }
                    FragmentManager fragmentManagerLJIILL = C20622515mp.LJIILL(this.LIZLLL, this.LIZIZ);
                    Activity activity = this.LJ;
                    PreCheckResult preCheckResult = this.LJIIIZ;
                    if (preCheckResult == null) {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    C858290Xlj.LIZ(fragmentManagerLJIILL, activity, preCheckResult, LIZJ(), "video_post_page", "", LIZIZ(), null, new AwS593S0100000_14(this, 325));
                    this.LJIIIZ = null;
                    HashMap<Integer, PreCheckResultModel> detectResults = LIZJ().creativeModel.audioCopyrightDetectModel.getDetectResults();
                    if (detectResults != null && (preCheckResultModel2 = detectResults.get(Integer.valueOf(LIZIZ()))) != null) {
                        preCheckResultModel2.hasShowResult = true;
                    }
                    this.LJI.setValue(0);
                    return;
                }
                if (value.intValue() == 100) {
                    if (!C856830XjN.LIZ()) {
                        C855900Xhs.LIZIZ(this.LJ);
                    }
                    this.LJIIIZ = null;
                    HashMap<Integer, PreCheckResultModel> detectResults2 = LIZJ().creativeModel.audioCopyrightDetectModel.getDetectResults();
                    if (detectResults2 != null && (preCheckResultModel = detectResults2.get(Integer.valueOf(LIZIZ()))) != null) {
                        preCheckResultModel.hasShowResult = true;
                    }
                    this.LJI.setValue(0);
                    return;
                }
                if (value.intValue() != 102 || C856830XjN.LIZ()) {
                    return;
                }
                Activity activity2 = this.LJ;
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(2131822166);
                creativeToastBuilder.duration(Mp4ScreenVideoLoadTimeout.CONTROL);
                C1390380mHk.LIZ(activity2, 3012, creativeToastBuilder);
            }
        }
    }

    public VideoPublishEditModel LIZJ() {
        return this.LIZ;
    }

    public final void LIZ(boolean z) {
        C895680ZBu.LIZ.getClass();
        if (!(!C895680ZBu.LJI) && (!C895680ZBu.LJFF) && C856830XjN.LIZ()) {
            C895680ZBu.LJFF = true;
            this.LJ.runOnUiThread(new ARunnableS33S0110000_14(this, z, 1));
        }
    }

    public void LIZLLL(C857220Xk0 c857220Xk0, AbstractC857240Xk2 abstractC857240Xk2) {
        c857220Xk0.LIZ(abstractC857240Xk2);
    }

    public AbstractC855890Xhr(VideoPublishEditModel videoPublishEditModel, Scene scene, VideoPublishViewModel videoPublishViewModel) {
        this.LIZ = videoPublishEditModel;
        this.LIZIZ = scene;
        this.LIZJ = videoPublishViewModel;
        this.LIZLLL = C12WG.LJ(scene);
        this.LJ = scene.requireActivity();
    }
}
