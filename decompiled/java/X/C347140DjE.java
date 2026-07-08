package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DjE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C347140DjE {
    public static void LIZ(NLEModel nLEModel, VideoPublishEditModel videoPublishEditModel, InterfaceC347150DjF interfaceC347150DjF) {
        float f;
        Float fLJIIIIZZ;
        Float fLJIIIIZZ2;
        if (videoPublishEditModel == null) {
            return;
        }
        ArrayList<NLETrackSlot> arrayList = new ArrayList();
        if (interfaceC347150DjF != null) {
            arrayList.addAll(interfaceC347150DjF.LIZ());
        } else {
            VecNLETrackSPtr tracks = nLEModel.getTracks();
            ArrayList arrayList2 = new ArrayList();
            for (NLETrack nLETrack : tracks) {
                NLETrack nLETrack2 = nLETrack;
                NLETrackType trackType = nLETrack2.getTrackType();
                NLETrackType nLETrackType = NLETrackType.AUDIO;
                if ((trackType == nLETrackType && Intrinsics.LJFF(nLETrack2.getExtra("AudioTrackType"), "AUDIO_RECORD")) || (nLETrack2.getTrackType() == nLETrackType && Intrinsics.LJFF(nLETrack2.getExtra("AudioTrackType"), "DUB"))) {
                    arrayList2.add(nLETrack);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Iterator<NLETrackSlot> it3 = ((NLETrack) it2.next()).getSlots().iterator();
                while (it3.hasNext()) {
                    arrayList.add(it3.next());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        float f2 = 0.0f;
        for (NLETrackSlot nLETrackSlot : arrayList) {
            NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
            if (nLESegmentAudioDynamicCast != null) {
                float volume = nLESegmentAudioDynamicCast.getVolume();
                if (nLETrackSlot.hasExtra("volume_before_enhance") && (fLJIIIIZZ2 = C2327809Ae.LJIIIIZZ(nLETrackSlot.getExtra("volume_before_enhance"))) != null) {
                    volume = fLJIIIIZZ2.floatValue();
                }
                if (volume > f2) {
                    f2 = volume;
                }
            }
        }
        AudioRecorderParam veAudioRecorderParam = videoPublishEditModel.getVeAudioRecorderParam();
        if (veAudioRecorderParam != null) {
            veAudioRecorderParam.setRecordVolume(f2);
        }
        for (NLETrackSlot nLETrackSlot2 : arrayList) {
            NLESegmentAudio nLESegmentAudioDynamicCast2 = NLESegmentAudio.dynamicCast(nLETrackSlot2.getMainSegment());
            if (nLESegmentAudioDynamicCast2 != null) {
                float volume2 = nLESegmentAudioDynamicCast2.getVolume();
                if (nLETrackSlot2.hasExtra("volume_before_enhance") && (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(nLETrackSlot2.getExtra("volume_before_enhance"))) != null) {
                    volume2 = fLJIIIIZZ.floatValue();
                }
                if (f2 == 0.0f) {
                    f = 1.0f;
                } else {
                    f = volume2 / f2;
                }
                nLETrackSlot2.setExtra("multi_record_voice_rate", String.valueOf(f));
            }
        }
    }
}
