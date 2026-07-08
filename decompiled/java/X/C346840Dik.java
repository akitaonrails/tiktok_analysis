package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dik, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C346840Dik {
    public static boolean LIZ(NLEModel nLEModel) {
        if (nLEModel != null) {
            ArrayList arrayList = (ArrayList) C346740Dia.LIZ(nLEModel);
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (((NLENode) it2.next()).hasExtra("freeze_from_uuid")) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static String LIZJ(NLETrackSlot nLETrackSlot) {
        boolean z;
        NLESegment mainSegment;
        NLEResourceNode resource;
        String resourceFile;
        NLETrackSlot renderProxy = nLETrackSlot.getRenderProxy();
        if (renderProxy != null && (mainSegment = renderProxy.getMainSegment()) != null && (resource = mainSegment.getResource()) != null && (resourceFile = resource.getResourceFile()) != null && resourceFile.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (Intrinsics.LJFF(nLETrackSlot.getExtra("is_ep_reverse_video"), "true")) {
                return nLETrackSlot.getMainSegment().getExtra("ep_origin_media_path");
            }
            return nLETrackSlot.getMainSegment().getResource().getResourceFile();
        }
        if (Intrinsics.LJFF(nLETrackSlot.getExtra("is_ep_reverse_video"), "true")) {
            return nLETrackSlot.getRenderProxy().getMainSegment().getExtra("ep_origin_media_path");
        }
        return nLETrackSlot.getRenderProxy().getMainSegment().getResource().getResourceFile();
    }

    public static boolean LIZIZ(NLEModel nLEModel, NLETrackSlot nLETrackSlot) {
        Object next;
        String strLIZJ;
        if (!nLETrackSlot.hasExtra("freeze_from_uuid")) {
            return false;
        }
        String extra = nLETrackSlot.getExtra("freeze_from_uuid");
        String extra2 = nLETrackSlot.getExtra("freeze_from_resource_path");
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (nLETrack.getTrackType() == NLETrackType.VIDEO) {
                arrayList.add(nLETrack);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
        }
        Iterator it3 = arrayList2.iterator();
        while (true) {
            if (it3.hasNext()) {
                next = it3.next();
                if (Intrinsics.LJFF(((NLENode) next).getUUID(), extra)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NLETrackSlot nLETrackSlot2 = (NLETrackSlot) next;
        if (nLETrackSlot2 == null || (strLIZJ = LIZJ(nLETrackSlot2)) == null) {
            return false;
        }
        return Intrinsics.LJFF(strLIZJ, extra2);
    }
}
