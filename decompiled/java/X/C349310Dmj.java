package X;

import Y.AComparatorS24S0000000_5;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.audiorecord.Point;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0Dmj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C349310Dmj {
    public static final /* synthetic */ int LIZ = 0;

    public static NLETrack LIZIZ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (C351220Dpo.LLILL(nLETrack)) {
                arrayList.add(nLETrack);
            }
        }
        NLETrack nLETrack2 = (NLETrack) C13LP.LJJJLZIJ(0, C13LP.LJLLLL(new AComparatorS24S0000000_5(13), arrayList));
        if (nLETrack2 == null) {
            VecNLETrackSPtr tracks2 = nLEModel.getTracks();
            ArrayList arrayList2 = new ArrayList();
            for (NLETrack nLETrack3 : tracks2) {
                if (C351220Dpo.LLLILZJ(nLETrack3, true)) {
                    arrayList2.add(nLETrack3);
                }
            }
            Iterator it2 = arrayList2.iterator();
            int iMax = -1;
            while (it2.hasNext()) {
                iMax = Math.max(((NLETimeSpaceNode) it2.next()).getLayer(), iMax);
            }
            NLETrack nLETrack4 = new NLETrack();
            nLETrack4.setEnable(false);
            nLETrack4.setMainTrack(false);
            nLETrack4.setLayer(iMax + 1);
            nLETrack4.setExtraTrackType(NLETrackType.AUDIO);
            nLETrack4.setExtra("AudioTrackType", "AUDIO_RECORD");
            nLEModel.addTrack(nLETrack4);
            return nLETrack4;
        }
        return nLETrack2;
    }

    public static NLETrackSlot LIZ(C349320Dmk c349320Dmk, int i) {
        NLETrackSlot nLETrackSlot = new NLETrackSlot();
        int y = c349320Dmk.LIZ.getY() - c349320Dmk.LIZ.getX();
        NLESegmentAudio nLESegmentAudio = new NLESegmentAudio();
        NLEResourceAV nLEResourceAV = new NLEResourceAV();
        nLEResourceAV.setResourceName("Record");
        nLEResourceAV.setResourceType(NLEResType.RECORD);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j = y;
        nLEResourceAV.setDuration(timeUnit.toMicros(j));
        nLEResourceAV.setResourceFile(c349320Dmk.LIZIZ);
        nLESegmentAudio.setAVFile(nLEResourceAV);
        nLESegmentAudio.setTimeClipStart(0L);
        nLESegmentAudio.setTimeClipEnd(timeUnit.toMicros(j));
        nLESegmentAudio.setKeepTone(false);
        nLETrackSlot.setMainSegment(nLESegmentAudio);
        nLETrackSlot.setStartTime(((long) c349320Dmk.LIZ.getX()) * 1000);
        nLETrackSlot.setExtra("ep_slot_add_order", String.valueOf(i));
        return nLETrackSlot;
    }

    public static String LIZJ(String str, Point point, InterfaceC349330Dml interfaceC349330Dml) {
        String strLIZ = interfaceC349330Dml.LIZ("split1");
        String strLIZ2 = interfaceC349330Dml.LIZ("split2");
        String[] strArr = {strLIZ, strLIZ2, interfaceC349330Dml.LIZ("split3")};
        int[] iArr = {point.getX(), point.getY()};
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iNativeSplitVideo = TEVideoUtils.nativeSplitVideo(str, strArr, iArr, true);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        C0E5P c0e5p = C0E5P.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("split audio cost: ");
        sbLIZ.append(jCurrentTimeMillis2 - jCurrentTimeMillis);
        sbLIZ.append("ms  VEUtils.splitVideo res:");
        sbLIZ.append(iNativeSplitVideo);
        C356530DyN.LJ(c0e5p, C2188811AlT.LIZIZ(sbLIZ));
        if (iNativeSplitVideo != 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("VEUtils.splitVideo error, return:");
            sbLIZ2.append(iNativeSplitVideo);
            C356530DyN.LIZJ(c0e5p, C2188811AlT.LIZIZ(sbLIZ2));
            return "";
        }
        return strLIZ2;
    }
}
