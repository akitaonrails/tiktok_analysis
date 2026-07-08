package X;

import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.12QV, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12QV {
    public static final Map<Integer, Integer> LIZ = C2097608Jq.LJIIIIZZ(new Pair(1, 2131829830), new Pair(-1, 2131822393));

    public static C19754712Qv LIZ(VideoPublishEditModel videoPublishEditModel, AudioRecorderParam audioRecorderParam, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4 = true;
        boolean z5 = false;
        if (C1428520nHG.LJIIJJI(videoPublishEditModel) && videoPublishEditModel.getOrigin() == 2) {
            if (videoPublishEditModel.getTimeEffect() != null) {
                z5 = true;
            }
            return new C19754712Qv(true, z5, 6);
        }
        if (C1428520nHG.LJIIIIZZ(videoPublishEditModel) || (C1428520nHG.LJIIJJI(videoPublishEditModel) && C1428470nHB.LJJZZI(videoPublishEditModel))) {
            AudioRecorderParam veAudioRecorderParam = videoPublishEditModel.getVeAudioRecorderParam();
            if (veAudioRecorderParam != null && veAudioRecorderParam.hasRecord()) {
                if (z) {
                    if (audioRecorderParam != null && (!audioRecorderParam.getMStack().isEmpty())) {
                        if (videoPublishEditModel.getTimeEffect() != null) {
                            z5 = true;
                        }
                        return new C19754712Qv(true, z5, 6);
                    }
                    Integer num = LIZ.get(1);
                    if (videoPublishEditModel.getTimeEffect() != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    return new C19754712Qv(1, num, false, z3);
                }
                if (videoPublishEditModel.getTimeEffect() != null) {
                    z5 = true;
                }
                return new C19754712Qv(true, z5, 6);
            }
            if (audioRecorderParam != null && (!audioRecorderParam.getMStack().isEmpty())) {
                if (videoPublishEditModel.getTimeEffect() != null) {
                    z5 = true;
                }
                return new C19754712Qv(true, z5, 6);
            }
            Integer num2 = LIZ.get(1);
            if (videoPublishEditModel.getTimeEffect() != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new C19754712Qv(1, num2, false, z2);
        }
        if (C1428520nHG.LJIIJJI(videoPublishEditModel)) {
            if (videoPublishEditModel.getTimeEffect() != null) {
                z5 = true;
            }
            return new C19754712Qv(true, z5, 6);
        }
        Integer num3 = LIZ.get(-1);
        if (videoPublishEditModel.getTimeEffect() == null) {
            z4 = false;
        }
        return new C19754712Qv(-1, num3, false, z4);
    }
}
