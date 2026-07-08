package X;

import Y.AComparatorS24S0000000_5;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dlz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C348850Dlz {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (C351220Dpo.LLILL(nLETrack)) {
                arrayList.add(nLETrack);
            }
        }
        return arrayList;
    }

    public static List LIZIZ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (C351220Dpo.LLLILZJ(nLETrack, true)) {
                arrayList.add(nLETrack);
            }
        }
        return arrayList;
    }

    public static List LIZJ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (C351220Dpo.LLLILZLLLI(nLETrack)) {
                arrayList.add(nLETrack);
            }
        }
        return arrayList;
    }

    public static boolean LIZLLL(NLETrackSlot nLETrackSlot) {
        NLEResType resourceType;
        NLEResourceNode resource;
        NLESegment mainSegment = nLETrackSlot.getMainSegment();
        if (mainSegment != null && (resource = mainSegment.getResource()) != null) {
            resourceType = resource.getResourceType();
        } else {
            resourceType = null;
        }
        if (resourceType == NLEResType.RECORD) {
            return true;
        }
        return false;
    }

    public static void LJII(NLEModel nLEModel) {
        boolean z;
        NLETrack nLETrack = (NLETrack) C13LP.LJJJLL(C349930Dnj.LJFF(nLEModel));
        if (nLETrack != null && nLETrack.getSlots().size() == 0) {
            nLEModel.removeTrack(nLETrack);
            z = true;
        } else {
            z = false;
        }
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack2 : tracks) {
            if (C351220Dpo.LLLILZJ(nLETrack2, true)) {
                arrayList.add(nLETrack2);
            }
        }
        List<NLETimeSpaceNode> listLJLLLL = C13LP.LJLLLL(new AComparatorS24S0000000_5(7), arrayList);
        if (z) {
            for (NLETimeSpaceNode nLETimeSpaceNode : listLJLLLL) {
                nLETimeSpaceNode.setLayer(nLETimeSpaceNode.getLayer() - 1);
            }
        }
        Iterator it2 = listLJLLLL.iterator();
        while (it2.hasNext()) {
            NLETrack nLETrack3 = (NLETrack) it2.next();
            if (nLETrack3.getSlots().size() == 0) {
                nLEModel.removeTrack(nLETrack3);
            } else {
                return;
            }
        }
    }

    public static boolean LJ(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel) {
        int size = videoPublishEditModel.creativeModel.soundEffectInfoModel.soundEffectList.size();
        List listLIZJ = LIZJ(nLEModel);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZJ, 10));
        Iterator it2 = ((ArrayList) listLIZJ).iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((NLETrack) it2.next()).getSortedSlots().size()));
        }
        if (size == C13LP.LJZI(arrayList)) {
            return true;
        }
        return false;
    }

    public static boolean LJFF(NLETrackSlot nLETrackSlot, C0E48 c0e48) {
        NLETrack trackBySlot = C350870DpF.LJI(c0e48).getTrackBySlot(nLETrackSlot);
        if (trackBySlot != null) {
            if (C351220Dpo.LLILLL(trackBySlot) || C351220Dpo.LLJILLL(trackBySlot)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LJI(NLETrackSlot nLETrackSlot, C0E48 c0e48) {
        String extra;
        NLETrack trackBySlot;
        if (c0e48 != null && (trackBySlot = C350870DpF.LJI(c0e48).getTrackBySlot(nLETrackSlot)) != null) {
            extra = trackBySlot.getExtra("AudioTrackType");
        } else {
            extra = null;
        }
        return Intrinsics.LJFF(extra, "SOUND_EFFECT");
    }

    public static boolean LJIIIIZZ(C0E48 c0e48, boolean z) {
        if (c0e48 == null) {
            return false;
        }
        if (z && ((ArrayList) C351220Dpo.LJIJJ(C350870DpF.LJI(c0e48))).isEmpty()) {
            return true;
        }
        return C357540E0a.LJJIJIL(C350870DpF.LJI(c0e48));
    }
}
