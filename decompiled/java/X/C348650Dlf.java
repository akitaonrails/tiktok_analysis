package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dlf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C348650Dlf implements C0EXJ {
    public Map<String, C348660Dlg> LIZ = C2097608Jq.LJ();
    public Map<String, C348660Dlg> LIZIZ = C2097608Jq.LJ();
    public Map<String, C348660Dlg> LIZJ = C2097608Jq.LJ();
    public Map<String, String> LIZLLL = C2097608Jq.LJ();
    public boolean LJ;

    @Override // X.C0EXJ
    public final boolean LIZ() {
        return this.LJ;
    }

    @Override // X.C0EXJ
    public final void LIZIZ(NLEModel nLEModel) {
        this.LJ = LIZLLL(nLEModel);
    }

    public final boolean LIZLLL(NLEModel nLEModel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (nLETrack.getTrackType() == NLETrackType.VIDEO) {
                arrayList.add(nLETrack);
            }
        }
        if (arrayList.isEmpty()) {
            Map<String, C348660Dlg> map = this.LIZ;
            if (map != null && !map.isEmpty()) {
                z5 = false;
            } else {
                z5 = true;
            }
            z = !z5;
        } else {
            Iterator it2 = arrayList.iterator();
            z = false;
            while (it2.hasNext()) {
                if (LIZJ((NLETrack) it2.next(), this.LIZ)) {
                    z = true;
                }
            }
        }
        C201955140j.LIZ("AudioTrackChecker -> videoTrackChanged = " + z);
        VecNLETrackSPtr tracks2 = nLEModel.getTracks();
        ArrayList arrayList2 = new ArrayList();
        for (NLETrack nLETrack2 : tracks2) {
            if (C351220Dpo.LLLII(nLETrack2)) {
                arrayList2.add(nLETrack2);
            }
        }
        if (arrayList2.isEmpty()) {
            Map<String, C348660Dlg> map2 = this.LIZIZ;
            if (map2 != null && !map2.isEmpty()) {
                z4 = false;
            } else {
                z4 = true;
            }
            z2 = !z4;
        } else {
            Iterator it3 = arrayList2.iterator();
            z2 = false;
            while (it3.hasNext()) {
                if (LIZJ((NLETrack) it3.next(), this.LIZIZ)) {
                    z2 = true;
                }
            }
        }
        C201955140j.LIZ("AudioTrackChecker -> audioTrackChange = " + z2);
        VecNLETrackSPtr tracks3 = nLEModel.getTracks();
        ArrayList<NLETrack> arrayList3 = new ArrayList();
        for (NLETrack nLETrack3 : tracks3) {
            NLETrack nLETrack4 = nLETrack3;
            if (C351220Dpo.LLILLL(nLETrack4) || C351220Dpo.LLJILLL(nLETrack4)) {
                arrayList3.add(nLETrack3);
            }
        }
        if (arrayList3.isEmpty()) {
            z3 = !this.LIZJ.isEmpty();
        } else {
            z3 = false;
            for (NLETrack nLETrack5 : arrayList3) {
                if (!LIZJ(nLETrack5, this.LIZJ)) {
                    VecNLETrackSlotSPtr slots = nLETrack5.getSlots();
                    if (slots != null) {
                        for (NLETrackSlot nLETrackSlot : slots) {
                            if (!Intrinsics.LJFF(this.LIZLLL.get(nLETrackSlot.getUUID()), nLETrackSlot.getExtra("d_bgmId"))) {
                            }
                        }
                    }
                }
                z3 = true;
            }
        }
        if (!z && !z2 && !z3) {
            return false;
        }
        return true;
    }

    public final void LJ(NLEModel nLEModel) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(this.LIZLLL);
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (nLETrack.getTrackType() == NLETrackType.VIDEO) {
                arrayList.add(nLETrack);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            for (NLETrackSlot nLETrackSlot : ((NLETrack) it2.next()).getSlots()) {
                C348660Dlg c348660DlgLIZ = C347310DjV.LIZ(nLETrackSlot);
                if (c348660DlgLIZ != null) {
                    linkedHashMap.put(nLETrackSlot.getUUID(), c348660DlgLIZ);
                }
            }
        }
        VecNLETrackSPtr tracks2 = nLEModel.getTracks();
        ArrayList arrayList2 = new ArrayList();
        for (NLETrack nLETrack2 : tracks2) {
            if (C351220Dpo.LLLII(nLETrack2)) {
                arrayList2.add(nLETrack2);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            for (NLETrackSlot nLETrackSlot2 : ((NLETrack) it3.next()).getSlots()) {
                C348660Dlg c348660DlgLIZ2 = C347310DjV.LIZ(nLETrackSlot2);
                if (c348660DlgLIZ2 != null) {
                    linkedHashMap2.put(nLETrackSlot2.getUUID(), c348660DlgLIZ2);
                }
            }
        }
        VecNLETrackSPtr tracks3 = nLEModel.getTracks();
        ArrayList arrayList3 = new ArrayList();
        for (NLETrack nLETrack3 : tracks3) {
            NLETrack nLETrack4 = nLETrack3;
            if (C351220Dpo.LLILLL(nLETrack4) || C351220Dpo.LLJILLL(nLETrack4)) {
                arrayList3.add(nLETrack3);
            }
        }
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            for (NLETrackSlot nLETrackSlot3 : ((NLETrack) it4.next()).getSlots()) {
                C348660Dlg c348660DlgLIZ3 = C347310DjV.LIZ(nLETrackSlot3);
                if (c348660DlgLIZ3 != null) {
                    linkedHashMap3.put(nLETrackSlot3.getUUID(), c348660DlgLIZ3);
                }
                linkedHashMap4.put(nLETrackSlot3.getUUID(), nLETrackSlot3.getExtra("d_bgmId"));
            }
        }
        C201955140j.LIZ("AudioTrackChecker -> update");
        this.LIZ = linkedHashMap;
        this.LIZIZ = linkedHashMap2;
        this.LIZJ = linkedHashMap3;
        this.LIZLLL = linkedHashMap4;
        this.LJ = false;
    }

    public static boolean LIZJ(NLETrack nLETrack, Map map) {
        NLEResourceAV aVFile;
        if (nLETrack.getSlots().size() != map.size()) {
            return true;
        }
        for (NLETrackSlot nLETrackSlot : nLETrack.getSlots()) {
            C348660Dlg c348660Dlg = (C348660Dlg) map.get(nLETrackSlot.getUUID());
            if (c348660Dlg != null) {
                String resourceFile = null;
                NLESegmentAudio nLESegmentAudio = (NLESegmentAudio) NLESegmentAudio.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot.getMainSegment());
                if (c348660Dlg.LIZ == nLETrackSlot.getStartTime() && c348660Dlg.LIZIZ == nLETrackSlot.getEndTime()) {
                    String str = c348660Dlg.LIZJ;
                    if (nLESegmentAudio != null && (aVFile = nLESegmentAudio.getAVFile()) != null) {
                        resourceFile = aVFile.getResourceFile();
                    }
                    if (!Intrinsics.LJFF(str, resourceFile) || c348660Dlg.LIZLLL != nLESegmentAudio.getTimeClipStart() || c348660Dlg.LJ != nLESegmentAudio.getTimeClipEnd() || c348660Dlg.LJFF != nLESegmentAudio.getVolume() || c348660Dlg.LJI != C351220Dpo.LLLFFI(nLETrackSlot)) {
                    }
                }
            }
            return true;
        }
        return false;
    }
}
