package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.ss.android.ugc.aweme.audiorecord.Point;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dmi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C349300Dmi {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(NLEEditor nLEEditor) {
        NLETrack next;
        Iterator<NLETrack> it2 = nLEEditor.getModel().getTracks().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.getExtra("AudioTrackType"), "DUB")) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NLETrack nLETrack = next;
        if (nLETrack != null) {
            nLEEditor.getModel().removeTrack(nLETrack);
            C0CNO.LIZLLL(0L, new AwS549S0100000_5(nLEEditor, 64));
        }
    }

    public static NLETrack LIZJ(NLEModel nLEModel) {
        NLETrack next;
        Iterator<NLETrack> it2 = nLEModel.getTracks().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.getExtra("AudioTrackType"), "DUB")) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NLETrack nLETrack = next;
        if (nLETrack == null) {
            NLETrack nLETrack2 = new NLETrack();
            nLETrack2.setExtra("AudioTrackType", "DUB");
            nLETrack2.setEnable(true);
            nLETrack2.setMainTrack(false);
            nLETrack2.setStartTime(0L);
            nLETrack2.setEndTime(-2L);
            nLETrack2.setExtraTrackType(NLETrackType.AUDIO);
            nLEModel.addTrack(nLETrack2);
            return nLETrack2;
        }
        return nLETrack;
    }

    public static int LIZ(NLEEditor nLEEditor, C347650Dk3 c347650Dk3, VideoPublishEditModel videoPublishEditModel) {
        String strLIZJ;
        String str = c347650Dk3.LIZIZ;
        if (str != null && str.length() == 0) {
            return -1;
        }
        C352180DrM c352180DrM = new C352180DrM(videoPublishEditModel);
        Point point = new Point((int) c347650Dk3.LJFF, (int) c347650Dk3.LJI, c347650Dk3.LJ);
        String str2 = c347650Dk3.LIZIZ;
        if (str2 != null) {
            strLIZJ = C349310Dmj.LIZJ(str2, point, c352180DrM);
        } else {
            strLIZJ = null;
        }
        float fLIZ = C0CH4.LIZ();
        NLETrackSlot nLETrackSlot = new NLETrackSlot();
        long j = c347650Dk3.LJ;
        NLESegmentAudio nLESegmentAudio = new NLESegmentAudio();
        NLEResourceAV nLEResourceAV = new NLEResourceAV();
        nLEResourceAV.setResourceName("Record");
        nLEResourceAV.setResourceType(NLEResType.RECORD);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        nLEResourceAV.setDuration(timeUnit.toMicros(j));
        nLEResourceAV.setResourceFile(strLIZJ);
        nLESegmentAudio.setAVFile(nLEResourceAV);
        nLESegmentAudio.setTimeClipStart(0L);
        nLESegmentAudio.setTimeClipEnd(timeUnit.toMicros(j));
        nLESegmentAudio.setKeepTone(true);
        nLESegmentAudio.setVolume(c347650Dk3.LJIIIZ);
        nLETrackSlot.setMainSegment(nLESegmentAudio);
        nLETrackSlot.setDuration(j * 1000);
        nLETrackSlot.setStartTime(c347650Dk3.LJFF * 1000);
        nLETrackSlot.setEndTime(c347650Dk3.LJI * 1000);
        nLETrackSlot.setExtra("volume_enhance_rate", String.valueOf(fLIZ));
        nLETrackSlot.setExtra("volume_before_enhance", String.valueOf(c347650Dk3.LJIIIZ));
        C351220Dpo.LLLLLL(nLETrackSlot.getMainSegment(), c347650Dk3.LJIIIZ * fLIZ);
        LIZJ(nLEEditor.getModel()).addSlot(nLETrackSlot);
        nLEEditor.commit();
        return 0;
    }
}
