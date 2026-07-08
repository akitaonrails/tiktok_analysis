package X;

import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0E3f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C358370E3f implements InterfaceC371030Egf {
    public List<? extends NLETrackSlot> LIZ;
    public InterfaceC358390E3h LIZIZ;
    public NLETrackSlot LIZJ;
    public Map<NLETrackSlot, Set<C370780EgG>> LIZLLL = new LinkedHashMap();
    public final List<InterfaceC358400E3i> LJ = new ArrayList();

    @Override // X.InterfaceC371030Egf
    public final C371000Egc LIZ() {
        String resourceFile;
        NLEResourceNode resource;
        NLETrackSlot nLETrackSlot = this.LIZJ;
        InterfaceC358390E3h interfaceC358390E3h = this.LIZIZ;
        if (nLETrackSlot == null || interfaceC358390E3h == null) {
            List listLJIJJLI = C15438062q.LJIJJLI(((LinkedHashMap) this.LIZLLL).values());
            C13BV c13bv = C13BV.INSTANCE;
            return new C371000Egc(listLJIJJLI, c13bv, c13bv);
        }
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        boolean z = nLETrackSlot.getMainSegment().getType() == NLEResType.IMAGE;
        C370720EgA.LIZ.getClass();
        String strLIZIZ = C370720EgA.LIZIZ(nLETrackSlot);
        int duration = (int) (nLESegmentVideoDynamicCast.getResource().getDuration() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iLIZJ = interfaceC358390E3h.LIZJ();
        int iLIZIZ = interfaceC358390E3h.LIZIZ();
        int iLIZLLL = interfaceC358390E3h.LIZLLL();
        float fLIZ = interfaceC358390E3h.LIZ();
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        boolean zLLLL = C351220Dpo.LLLL(nLETrackSlot);
        List<? extends NLETrackSlot> list = this.LIZ;
        if (list != null) {
            for (NLETrackSlot nLETrackSlot2 : (ArrayList) list) {
                NLESegment mainSegment = nLETrackSlot2.getMainSegment();
                if (mainSegment == null || (resource = mainSegment.getResource()) == null || (resourceFile = resource.getResourceFile()) == null) {
                    resourceFile = "";
                }
                NLESegment mainSegment2 = nLETrackSlot2.getMainSegment();
                boolean z2 = (mainSegment2 != null ? mainSegment2.getType() : null) == NLEResType.IMAGE;
                C370720EgA.LIZ.getClass();
                linkedHashSet4.add(new C370780EgG(C370720EgA.LIZ(0), 3, resourceFile, z2, zLLLL));
            }
        }
        if (z) {
            linkedHashSet4.add(new C370780EgG(0, 3, nLESegmentVideoDynamicCast.getResource().getResourceFile(), true, zLLLL));
        } else {
            int iMax = Math.max(0, iLIZJ - iLIZLLL);
            int iMin = Math.min(duration, iLIZIZ + iLIZLLL);
            int i = (int) (iMax / fLIZ);
            int i2 = (int) (iMin / fLIZ);
            LinkedHashSet linkedHashSet5 = new LinkedHashSet();
            if (i <= i2) {
                while (true) {
                    C370720EgA.LIZ.getClass();
                    linkedHashSet5.add(new C370780EgG(C370720EgA.LIZ((int) (i * fLIZ)), 3, strLIZIZ, false, zLLLL));
                    if (i == i2) {
                        break;
                    }
                    i++;
                }
            }
            linkedHashSet4.addAll(linkedHashSet5);
        }
        Set<C370780EgG> setRemove = this.LIZLLL.remove(nLETrackSlot);
        if (setRemove == null) {
            linkedHashSet2.addAll(linkedHashSet4);
        } else {
            linkedHashSet.addAll(C15442062u.LJII(setRemove, linkedHashSet4));
            linkedHashSet2.addAll(C15442062u.LJII(linkedHashSet4, setRemove));
        }
        linkedHashSet3.addAll(linkedHashSet4);
        linkedHashMap.put(nLETrackSlot, linkedHashSet4);
        Iterator it2 = ((LinkedHashMap) this.LIZLLL).entrySet().iterator();
        while (it2.hasNext()) {
            linkedHashSet.addAll((Set) ((Map.Entry) it2.next()).getValue());
        }
        this.LIZLLL = linkedHashMap;
        return new C371000Egc(new ArrayList(linkedHashSet), new ArrayList(linkedHashSet2), new ArrayList(linkedHashSet3));
    }

    @Override // X.InterfaceC371030Egf
    public final void LIZIZ(C370820EgK c370820EgK) {
        C01TT.LIZLLL(new C358380E3g(c370820EgK, this));
    }
}
