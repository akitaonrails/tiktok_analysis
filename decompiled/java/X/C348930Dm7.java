package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dm7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C348930Dm7 {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(NLEModel nLEModel) {
        VecNLETrackSlotSPtr sortedSlots;
        ArrayList arrayList = new ArrayList();
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null && (sortedSlots = mainTrack.getSortedSlots()) != null) {
            for (NLETrackSlot nLETrackSlot : sortedSlots) {
                if (C351220Dpo.LLI(nLETrackSlot)) {
                    if (C351220Dpo.LLIFFJFJJ(nLETrackSlot)) {
                        NLETrackSlot nLETrackSlotLIZIZ = LIZIZ(nLEModel, nLETrackSlot);
                        if (nLETrackSlotLIZIZ != null) {
                            arrayList.add(LJII(nLETrackSlotLIZIZ));
                        }
                    } else {
                        NLEModel nLEModel2 = new NLEModel();
                        NLETrack nLETrack = new NLETrack();
                        nLETrack.setExtra("__DEFAULT__", "__DEFAULT__");
                        nLETrack.setMainTrack(true);
                        nLETrack.setExtraTrackType(NLETrackType.VIDEO);
                        nLEModel2.addTrack(nLETrack);
                        nLETrack.addSlot(nLETrackSlot);
                        arrayList.add(nLEModel2);
                    }
                }
            }
        }
        return arrayList;
    }

    public static List LIZJ(NLEModel nLEModel) {
        ArrayList arrayList = new ArrayList();
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList2 = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if (nLETrack2.getTrackType() == NLETrackType.AUDIO && Intrinsics.LJFF(nLETrack2.getExtra("AudioTrackType"), "DUB")) {
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
        return arrayList;
    }

    public static List LIZLLL(NLEModel nLEModel) {
        NLEResourceNode resource;
        String resourceFile;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (Intrinsics.LJFF(nLETrack.getExtra("AudioTrackType"), "ORIGIN_VOICE_CONVERSION")) {
                arrayList.add(nLETrack);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Iterator<NLETrackSlot> it3 = ((NLETrack) it2.next()).getSlots().iterator();
            while (it3.hasNext()) {
                NLESegment mainSegment = it3.next().getMainSegment();
                if (mainSegment != null && (resource = mainSegment.getResource()) != null && (resourceFile = resource.getResourceFile()) != null) {
                    linkedHashSet.add(resourceFile);
                }
            }
        }
        return C13LP.LLIIII(linkedHashSet);
    }

    public static String LJ(NLETrackSlot nLETrackSlot) {
        NLEResourceNode resource;
        String extra;
        if (!nLETrackSlot.hasExtra("extra_origin_voice_file_path") || (extra = nLETrackSlot.getExtra("extra_origin_voice_file_path")) == null || extra.length() == 0) {
            NLESegment mainSegment = nLETrackSlot.getMainSegment();
            if (mainSegment == null || (resource = mainSegment.getResource()) == null) {
                return null;
            }
            return resource.getResourceFile();
        }
        return extra;
    }

    public static boolean LJFF(NLEModel nLEModel) {
        return !((ArrayList) C349080DmM.LJII(nLEModel)).isEmpty();
    }

    public static boolean LJI(NLEModel nLEModel) {
        VecNLETrackSlotSPtr slots;
        NLENode nLENode;
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null && (slots = mainTrack.getSlots()) != null && (nLENode = (NLENode) C13LP.LJJJLL(slots)) != null) {
            return nLENode.hasExtra("extra_has_style_conversion");
        }
        return false;
    }

    public static NLEModel LJII(NLETrackSlot nLETrackSlot) {
        NLEModel nLEModel = new NLEModel();
        NLETrack nLETrack = new NLETrack();
        nLETrack.setEnable(true);
        nLETrack.setMainTrack(false);
        nLETrack.setExtraTrackType(NLETrackType.AUDIO);
        nLETrack.setExtra("AudioTrackType", "ORIGIN");
        nLEModel.addTrack(nLETrack);
        nLETrack.addSlot(nLETrackSlot);
        return nLEModel;
    }

    public static NLETrackSlot LIZIZ(NLEModel nLEModel, NLETrackSlot nLETrackSlot) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (C351220Dpo.LLLII(nLETrack)) {
                arrayList.add(nLETrack);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            VecNLETrackSlotSPtr slots = ((NLETrack) it2.next()).getSlots();
            if (slots != null) {
                for (NLETrackSlot nLETrackSlot2 : slots) {
                    if (nLETrackSlot2.getStartTime() == nLETrackSlot.getStartTime() && nLETrackSlot2.getEndTime() == nLETrackSlot.getEndTime()) {
                        return nLETrackSlot2;
                    }
                }
            }
        }
        return null;
    }
}
