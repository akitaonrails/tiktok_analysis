package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DjK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C347200DjK {
    public static final Map<String, C1463770oC7> LIZ = new LinkedHashMap();

    public static void LIZ(NLEEditor nLEEditor) {
        VecNLETrackSPtr tracks = nLEEditor.getModel().getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if (nLETrack2.getMainTrack() || (nLETrack2.hasExtra("track_extra_pip") && Intrinsics.LJFF(nLETrack2.getExtra("track_extra_pip"), "true"))) {
                arrayList.add(nLETrack);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (NLESegmentVideo.dynamicCast((NLENode) ((NLETrackSlot) obj).getMainSegment()) != null) {
                arrayList3.add(obj);
            }
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) ((NLETrackSlot) it3.next()).getMainSegment());
            if (nLESegmentVideoDynamicCast != null) {
                nLESegmentVideoDynamicCast.setEnableAudio(true);
            }
        }
        nLEEditor.commit();
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZIZ(com.bytedance.ies.nle.editor_jni.NLEEditor r16, int r17, int r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C347200DjK.LIZIZ(com.bytedance.ies.nle.editor_jni.NLEEditor, int, int, boolean):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0236  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZJ(com.bytedance.ies.nle.editor_jni.NLEEditor r13, com.ss.android.vesdk.VETimelineParams r14, boolean r15, int r16, boolean r17) {
        /*
            Method dump skipped, instruction units count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C347200DjK.LIZJ(com.bytedance.ies.nle.editor_jni.NLEEditor, com.ss.android.vesdk.VETimelineParams, boolean, int, boolean):int");
    }
}
