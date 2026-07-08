package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.0Do4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C350140Do4 {
    public static final /* synthetic */ int LIZ = 0;

    public static long LIZIZ(NLEModel nLEModel) {
        Object next;
        VecNLETrackSlotSPtr slots;
        Iterator it2 = ((ArrayList) C351220Dpo.LJIJJ(nLEModel)).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                NLETrack nLETrack = (NLETrack) next;
                if (C351220Dpo.LLILLL(nLETrack) || C351220Dpo.LLJILLL(nLETrack)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NLETrack nLETrack2 = (NLETrack) next;
        long duration = 0;
        if (nLETrack2 != null && (slots = nLETrack2.getSlots()) != null) {
            Iterator<NLETrackSlot> it3 = slots.iterator();
            while (it3.hasNext()) {
                duration += it3.next().getDuration() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            }
        }
        return duration;
    }

    public static Map LIZ(long j, NLEModel nLEModel) {
        try {
            HashMap map = new HashMap();
            map.put("editor_pro_main_track_slot_num", String.valueOf(nLEModel.getMainTrack().getSlots().size()));
            Iterator<NLETrackSlot> it2 = nLEModel.getMainTrack().getSlots().iterator();
            long duration = 0;
            while (it2.hasNext()) {
                duration += it2.next().getDuration() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            }
            map.put("editor_pro_main_track_duration", String.valueOf(duration));
            map.put("editor_pro_pip_track_num", String.valueOf(C351220Dpo.LJJLIIIJLJLI(nLEModel).size()));
            map.put("editor_pro_pip_slot_num", String.valueOf(C351220Dpo.LJJLIIIJL(nLEModel)));
            map.put("editor_pro_text_track_num", String.valueOf(((ArrayList) C351220Dpo.LJLLI(nLEModel)).size()));
            map.put("editor_pro_text_slot_num", String.valueOf(C351220Dpo.LJLL(nLEModel)));
            map.put("editor_pro_audio_track_duration", String.valueOf(LIZIZ(nLEModel)));
            map.put("editor_pro_sound_effect_track_num", String.valueOf(((ArrayList) C351220Dpo.LJLIL(nLEModel)).size()));
            map.put("editor_pro_sound_effect_slot_num", String.valueOf(C351220Dpo.LJLIIL(nLEModel)));
            map.put("editor_pro_total_duration", String.valueOf(j));
            map.put("editor_pro_effect_track_num", String.valueOf(C351220Dpo.LJJIJLIJ(nLEModel).size()));
            map.put("editor_pro_effect_slot_num", String.valueOf(C351220Dpo.LJJIJL(nLEModel)));
            map.put("editor_pro_amazing_effect_slot_num", String.valueOf(C351220Dpo.LJIILJJIL(nLEModel)));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("editorProCommonParams::");
            sbLIZ.append(map);
            C355090Dw3.LIZIZ("EditorProPerfManager", C2188811AlT.LIZIZ(sbLIZ));
            return map;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("editorProCommonParams::Exception = ");
            sbLIZ2.append(e);
            C355090Dw3.LIZLLL("EditorProPerfManager", C2188811AlT.LIZIZ(sbLIZ2));
            return new HashMap();
        }
    }
}
