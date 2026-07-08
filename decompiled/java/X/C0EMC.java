package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS371S0200000_5;

/* JADX INFO: renamed from: X.0EMC, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EMC {
    public final InterfaceC1455860nzM LIZ;
    public final InterfaceC1454960nxu LIZIZ;
    public final InterfaceC1419190n2D LIZJ;
    public final InterfaceC1418580n1E LIZLLL;
    public final Function0<VideoPublishEditModel> LJ;

    public final void LIZIZ() {
        NLEModel nLEModelLIZ;
        NLETrack mainTrack;
        VecNLETrackSlotSPtr slots;
        AbstractC1452680nuE abstractC1452680nuEGc = this.LIZ.gc();
        if (abstractC1452680nuEGc == null || (nLEModelLIZ = C352130DrH.LIZ(abstractC1452680nuEGc.LJJ())) == null || (mainTrack = nLEModelLIZ.getMainTrack()) == null || (slots = mainTrack.getSlots()) == null) {
            return;
        }
        for (NLETrackSlot nLETrackSlot : slots) {
            NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
            if (nLESegmentVideoDynamicCast != null && C351220Dpo.LJ(nLETrackSlot)) {
                nLETrackSlot.setAbsSpeed(1.0f);
                nLESegmentVideoDynamicCast.clearSegCurveSpeedPoint();
                nLETrackSlot.removeExtraWithKey("ep_curve_speed_resource_id");
                nLETrackSlot.removeExtraWithKey("ep_curve_speed_name");
                nLETrackSlot.removeExtraWithKey("ep_curve_speed_english_name");
                nLETrackSlot.removeExtraWithKey("is_editor_pro_speed_used");
                nLETrackSlot.removeExtraWithKey("is_editorpro_adjust_video_speed");
                nLETrackSlot.removeExtraWithKey("is_editor_pro_curve_speed_used");
                nLETrackSlot.removeExtraWithKey("adjust_video_speed_duration");
                nLETrackSlot.removeExtraWithKey("enter_video_speed_time");
                NLEResourceNode resource = nLESegmentVideoDynamicCast.getResource();
                long duration = resource != null ? resource.getDuration() : 0L;
                nLESegmentVideoDynamicCast.setTimeClipStart(0L);
                nLESegmentVideoDynamicCast.setTimeClipEnd(duration);
                nLETrackSlot.setEndTime(nLETrackSlot.getStartTime() + duration);
            }
            NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
            if (nLESegmentAudioDynamicCast != null) {
                nLESegmentAudioDynamicCast.clearSegCurveSpeedPoint();
                if (nLESegmentAudioDynamicCast.getAbsSpeed() != 1.0f) {
                    nLESegmentAudioDynamicCast.setAbsSpeed(1.0f);
                }
                nLETrackSlot.setEndTime(nLETrackSlot.getStartTime() + ((long) ((nLESegmentAudioDynamicCast.getTimeClipEnd() - nLESegmentAudioDynamicCast.getTimeClipStart()) / nLESegmentAudioDynamicCast.getCurveAveSpeed())));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EMC.LIZJ():void");
    }

    public final void LIZ(AVMusic aVMusic, Function1<? super Boolean, Unit> function1) {
        VideoPublishEditModel videoPublishEditModelInvoke;
        InterfaceC1454960nxu interfaceC1454960nxu = this.LIZIZ;
        if (interfaceC1454960nxu != null) {
            InterfaceC1419190n2D interfaceC1419190n2D = this.LIZJ;
            if (interfaceC1419190n2D != null) {
                interfaceC1419190n2D.Z10(true);
            }
            interfaceC1454960nxu.M9(aVMusic, false, new AwS371S0200000_5(this, (C0EMC) function1, (Function1<? super Boolean, Unit>) 245));
        } else if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        Function0<VideoPublishEditModel> function0 = this.LJ;
        if (function0 != null && (videoPublishEditModelInvoke = function0.invoke()) != null) {
            videoPublishEditModelInvoke.creativeModel.editModel.editMusicSyncMode = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0EMC(InterfaceC1455860nzM interfaceC1455860nzM, InterfaceC1454960nxu interfaceC1454960nxu, InterfaceC1419190n2D interfaceC1419190n2D, InterfaceC1418580n1E interfaceC1418580n1E, Function0<? extends VideoPublishEditModel> function0) {
        this.LIZ = interfaceC1455860nzM;
        this.LIZIZ = interfaceC1454960nxu;
        this.LIZJ = interfaceC1419190n2D;
        this.LIZLLL = interfaceC1418580n1E;
        this.LJ = function0;
    }
}
