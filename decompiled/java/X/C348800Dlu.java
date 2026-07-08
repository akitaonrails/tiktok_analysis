package X;

import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStyClip;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS288S0000000_5;

/* JADX INFO: renamed from: X.0Dlu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C348800Dlu extends AbstractC350210DoB implements InterfaceC350230DoD {
    public final C348760Dlq LLILLJJLI = C350200DoA.LIZ(this, AFwS288S0000000_5.get$arr$(2));

    @Override // X.InterfaceC350230DoD
    public final void LIZIZ(C348820Dlw c348820Dlw) {
        Iterator it2 = ((ArrayList) this.LLILLJJLI.LIZJ).iterator();
        while (it2.hasNext()) {
            NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) ((NLETrackSlot) it2.next()).getMainSegment());
            if (nLESegmentVideoDynamicCast != null) {
                NLEStyClip clip = nLESegmentVideoDynamicCast.getClip();
                if (clip != null) {
                    int i = C349360Dmo.LIZJ;
                    nLESegmentVideoDynamicCast.setCrop(C350670Dov.LIZ(clip));
                }
                nLESegmentVideoDynamicCast.setClip(null);
            }
        }
    }
}
