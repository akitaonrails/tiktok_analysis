package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.edit.audio.enhance.AudioEnhanceParam;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS217S0300000_8;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MbA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C571460MbA {
    public static final C571460MbA LIZ = new C571460MbA();

    public static void LIZ(C19EG c19eg, int i, StringBuilder sb) {
        if (sb.length() == 0) {
            sb.append(c19eg.getString(i));
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(", ");
        sbLIZ.append(c19eg.getString(i));
        sb.append(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel, C19EG c19eg, Function0 function0) {
        boolean z;
        boolean zLJFF;
        boolean z2;
        boolean zLIZ;
        boolean z3;
        int i;
        AudioRecorderParam veAudioRecorderParam;
        boolean zIsCurrentAutoCutMode = videoPublishEditModel.isCurrentAutoCutMode();
        if (nLEModel != null && nLEModel.hasExtra("ep_stick_point_switch")) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            zLJFF = Intrinsics.LJFF(nLEModel.getExtra("ep_stick_point_switch"), "true");
        } else if (nLEModel != null && nLEModel.hasExtra("stick_point_on_off_key")) {
            zLJFF = Intrinsics.LJFF(nLEModel.getExtra("stick_point_on_off_key"), "true");
        } else {
            zLJFF = false;
        }
        boolean autoEnhanceOn = videoPublishEditModel.getAutoEnhanceOn();
        if (videoPublishEditModel.getVeAudioEffectParam() != null || ((veAudioRecorderParam = videoPublishEditModel.getVeAudioRecorderParam()) != null && veAudioRecorderParam.hasRecord())) {
            z2 = true;
        } else {
            z2 = false;
        }
        AudioEnhanceParam audioEnhanceParam = videoPublishEditModel.getAudioEnhanceParam();
        if (audioEnhanceParam != null) {
            zLIZ = C349220Dma.LIZ(audioEnhanceParam);
        } else {
            zLIZ = false;
        }
        boolean zIsPipUsed = videoPublishEditModel.getEditorProModel().isPipUsed();
        boolean z4 = !videoPublishEditModel.creativeModel.soundEffectInfoModel.soundEffectList.isEmpty();
        if (videoPublishEditModel.creativeModel.inlineCaptionModel != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z5 = !videoPublishEditModel.getEditorProModel().getTransitionResourcePaths().isEmpty();
        if (zIsCurrentAutoCutMode) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c19eg.getString(2131825163));
            sbLIZ.append("  ");
            LIZJ(c19eg, videoPublishEditModel, C2188811AlT.LIZIZ(sbLIZ), function0);
            return;
        }
        if (zLJFF) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(c19eg.getString(2131825164));
            sbLIZ2.append("  ");
            LIZJ(c19eg, videoPublishEditModel, C2188811AlT.LIZIZ(sbLIZ2), function0);
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (autoEnhanceOn) {
            LIZ(c19eg, 2131833216, sb);
        }
        if (z2) {
            if (C0C1F.LIZ()) {
                i = 2131858287;
            } else {
                i = 2131858286;
            }
            LIZ(c19eg, i, sb);
        }
        if (zLIZ) {
            LIZ(c19eg, 2131838191, sb);
        }
        if (z5) {
            LIZ(c19eg, 2131825162, sb);
        }
        if (zIsPipUsed) {
            LIZ(c19eg, 2131833403, sb);
        }
        if (z4) {
            LIZ(c19eg, 2131833391, sb);
        }
        if (z3) {
            LIZ(c19eg, 2131826898, sb);
        }
        if (!autoEnhanceOn && !zLIZ && !zIsPipUsed && !z4 && !z2 && !z5 && !z3) {
            function0.invoke();
        } else {
            LIZJ(c19eg, videoPublishEditModel, c19eg.getString(2131825165, sb.toString()), function0);
        }
    }

    public static void LIZJ(C19EG c19eg, VideoPublishEditModel videoPublishEditModel, String str, Function0 function0) {
        C013C c013c = new C013C();
        C0CHQ.LIZ().LJII().LIZJ(videoPublishEditModel);
        C1397580mTM c1397580mTM = new C1397580mTM(c19eg);
        c1397580mTM.LJII = true;
        c1397580mTM.LJFF(2131846548);
        c1397580mTM.LIZIZ(str);
        c1397580mTM.LIZLLL(new AwS374S0200000_8(videoPublishEditModel, c013c, 5));
        C985403tE.LIZ(c1397580mTM, new AwS217S0300000_8(function0, (Function0<Unit>) videoPublishEditModel, (VideoPublishEditModel) c013c, (C013C) 2));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }
}
