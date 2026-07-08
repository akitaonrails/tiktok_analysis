package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: X.0DuM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C354040DuM {
    public final C0E48 LIZ;

    public C354040DuM(C0E48 c0e48) {
        this.LIZ = c0e48;
    }

    public static int LIZ(long j, NLEModel nLEModel, boolean z) {
        NLEResType resourceType;
        NLEResourceNode resource;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList<NLETrack> arrayList = new ArrayList();
        Iterator<NLETrack> it2 = tracks.iterator();
        while (true) {
            boolean zLLILL = true;
            if (!it2.hasNext()) {
                break;
            }
            NLETrack next = it2.next();
            NLETrack nLETrack = next;
            if (nLETrack.getMainTrack() || !C351220Dpo.LLLILZJ(nLETrack, true)) {
                zLLILL = false;
            }
            if (z) {
                zLLILL = C351220Dpo.LLILL(nLETrack);
            }
            if (zLLILL) {
                arrayList.add(next);
            }
        }
        for (NLETrack nLETrack2 : arrayList) {
            if (linkedHashMap.get(Integer.valueOf(nLETrack2.getLayer())) == null) {
                linkedHashMap.put(Integer.valueOf(nLETrack2.getLayer()), new ArrayList());
            }
            List list = (List) linkedHashMap.get(Integer.valueOf(nLETrack2.getLayer()));
            if (list != null) {
                list.addAll(nLETrack2.getSortedSlots());
            }
        }
        Iterator it3 = ((TreeMap) C2097908Jt.LIZLLL(new Comparator() { // from class: X.0DuN
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Integer) obj).intValue() - ((Integer) obj2).intValue();
            }
        }, linkedHashMap)).entrySet().iterator();
        int i = 0;
        while (it3.hasNext()) {
            boolean z2 = true;
            for (NLETrackSlot nLETrackSlot : (Iterable) ((Map.Entry) it3.next()).getValue()) {
                NLESegment mainSegment = nLETrackSlot.getMainSegment();
                if (mainSegment != null && (resource = mainSegment.getResource()) != null) {
                    resourceType = resource.getResourceType();
                } else {
                    resourceType = null;
                }
                if (resourceType != NLEResType.RECORD || nLETrackSlot.getStartTime() >= j || nLETrackSlot.getEndTime() > j) {
                    z2 = false;
                }
            }
            if (z2) {
                break;
            }
            i++;
        }
        return Math.max(0, i);
    }
}
