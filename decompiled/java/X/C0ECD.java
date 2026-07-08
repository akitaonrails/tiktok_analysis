package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ECD, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ECD {
    public static final String LIZIZ(C0E48 c0e48) {
        NLETrack nLETrackPt = c0e48.Pt();
        if (nLETrackPt == null) {
            return "";
        }
        if (C351220Dpo.LLLFF(nLETrackPt)) {
            return "music";
        }
        if (C351220Dpo.LLILL(nLETrackPt)) {
            return "voice";
        }
        if (!C351220Dpo.LLLILZLLLI(nLETrackPt)) {
            return "";
        }
        return "sound_effect";
    }

    public static final void LIZ(NLEModel nLEModel, C0LAB c0lab) {
        int i;
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        int i2 = 0;
        if (tracks != null) {
            ArrayList arrayList = new ArrayList();
            for (NLETrack nLETrack : tracks) {
                NLETrack nLETrack2 = nLETrack;
                if (C351220Dpo.LLLFF(nLETrack2) || C351220Dpo.LLILL(nLETrack2) || C351220Dpo.LLLILZLLLI(nLETrack2)) {
                    arrayList.add(nLETrack);
                }
            }
            Iterator it2 = arrayList.iterator();
            int i3 = 0;
            while (it2.hasNext()) {
                for (NLETrackSlot nLETrackSlot : ((NLETrack) it2.next()).getSlots()) {
                    if (nLETrackSlot.hasExtra("is_ep_fade") && Intrinsics.LJFF(nLETrackSlot.getExtra("is_ep_fade"), "1")) {
                        i2++;
                        i3 = 1;
                    }
                }
            }
            i = i2;
            i2 = i3;
        } else {
            i = 0;
        }
        c0lab.LIZ(i2, "is_editorpro_fade");
        c0lab.LIZ(i, "fade_function_used_cnt");
    }
}
