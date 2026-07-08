package X;

import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.record.logic.AudioRecordActivityViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Do5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C350150Do5 {
    public static AudioRecordActivityViewModel LIZIZ(View view) {
        return (AudioRecordActivityViewModel) C1659630tI1.LJII(view, null, 6).get(AudioRecordActivityViewModel.class);
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [T, java.util.Set] */
    public static void LIZ(NLEModel nLEModel, boolean z) {
        ArrayList arrayList = new ArrayList();
        C259800zU c259800zU = new C259800zU();
        for (NLETrack nLETrack : nLEModel.getTracks()) {
            if (C351220Dpo.LLILL(nLETrack)) {
                nLETrack.setEnable(false);
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Long.valueOf(((NLETimeSpaceNode) it2.next()).getStartTime()));
                }
                c259800zU.element = C13LP.LLIIJI(arrayList2);
                for (NLETrackSlot nLETrackSlot : nLETrack.getSlots()) {
                    if (((Set) c259800zU.element).contains(Long.valueOf(nLETrackSlot.getStartTime()))) {
                        nLETrackSlot.setStartTime(nLETrackSlot.getStartTime() + 1);
                    }
                    arrayList.add(nLETrackSlot);
                }
            } else if (Intrinsics.LJFF(nLETrack.getExtra("AudioTrackType"), "DUB")) {
                if (z) {
                    nLEModel.removeTrack(nLETrack);
                } else {
                    nLETrack.setEnable(true);
                }
            }
        }
        if (z) {
            NLETrack nLETrack2 = new NLETrack();
            nLETrack2.setExtra("AudioTrackType", "DUB");
            nLETrack2.setStartTime(0L);
            nLETrack2.setEndTime(-2L);
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                nLETrack2.addSlot(NLETrackSlot.dynamicCast(((NLENode) it3.next()).deepClone(true)));
            }
            nLEModel.addTrack(nLETrack2);
        }
    }
}
