package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0LBO, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public abstract class C0LBO implements C0LDD {
    public final C0LBP LIZIZ;
    public final String LIZJ;

    public abstract void LIZLLL(NLETrack nLETrack, long j);

    @Override // X.C0LDD
    public final String getTag() {
        return this.LIZJ;
    }

    @Override // X.C0LDD
    public long LIZ(List<? extends MediaModel> list) {
        ArrayList arrayList = new ArrayList();
        for (MediaModel mediaModel : list) {
            MediaModel mediaModel2 = mediaModel;
            if (mediaModel2.LJIILJJIL() || mediaModel2.LJIIJJI()) {
                arrayList.add(mediaModel);
            }
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            Long lValueOf = Long.valueOf(C576730Mjf.LJIIIIZZ((MediaModel) it2.next()));
            while (it2.hasNext()) {
                Long lValueOf2 = Long.valueOf(C576730Mjf.LJIIIIZZ((MediaModel) it2.next()));
                if (lValueOf.compareTo(lValueOf2) < 0) {
                    lValueOf = lValueOf2;
                }
            }
            if (lValueOf != null) {
                return lValueOf.longValue();
            }
            return 0L;
        }
        return 0L;
    }

    @Override // X.C0LDD
    public final void LIZIZ(NLEModel nLEModel) {
        String resourceFile;
        NLESegment mainSegment;
        NLEResourceNode resource;
        NLESegment mainSegment2;
        NLEResourceNode resource2;
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it2 = tracks.iterator();
        while (true) {
            String resourceFile2 = null;
            if (!it2.hasNext()) {
                break;
            }
            NLETrack next = it2.next();
            Set<String> setKeySet = this.LIZIZ.LIZJ.keySet();
            NLETrackSlot nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(next.getSortedSlots());
            if (nLETrackSlot != null && (mainSegment2 = nLETrackSlot.getMainSegment()) != null && (resource2 = mainSegment2.getResource()) != null) {
                resourceFile2 = resource2.getResourceFile();
            }
            if (C13LP.LJJJJ(resourceFile2, setKeySet)) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() < this.LIZIZ.LIZIZ.size()) {
            String str = this.LIZJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("strategy: filledTrackSize = ");
            sbLIZ.append(arrayList.size());
            sbLIZ.append(", mediaListSize = ");
            sbLIZ.append(this.LIZIZ.LIZIZ.size());
            sbLIZ.append(", return");
            C576730Mjf.LJIIIZ(str, C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        Long lLJ = LJ(arrayList);
        if (lLJ != null) {
            long jLongValue = lLJ.longValue();
            String str2 = this.LIZJ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("strategy: duration = ");
            sbLIZ2.append(jLongValue);
            sbLIZ2.append(", trackSize = ");
            sbLIZ2.append(arrayList.size());
            sbLIZ2.append(", start >>>");
            C576730Mjf.LJIIIZ(str2, C2188811AlT.LIZIZ(sbLIZ2));
            VecNLETrackSPtr tracks2 = nLEModel.getTracks();
            ArrayList<NLETrack> arrayList2 = new ArrayList();
            for (NLETrack nLETrack : tracks2) {
                Set<String> setKeySet2 = this.LIZIZ.LIZJ.keySet();
                NLETrackSlot nLETrackSlot2 = (NLETrackSlot) C13LP.LJJJLL(nLETrack.getSortedSlots());
                if (nLETrackSlot2 != null && (mainSegment = nLETrackSlot2.getMainSegment()) != null && (resource = mainSegment.getResource()) != null) {
                    resourceFile = resource.getResourceFile();
                } else {
                    resourceFile = null;
                }
                if (true ^ C13LP.LJJJJ(resourceFile, setKeySet2)) {
                    arrayList2.add(nLETrack);
                }
            }
            for (NLETrack nLETrack2 : arrayList2) {
                String str3 = this.LIZJ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("adjustToTargetDuration adjust OtherTrack = ");
                sbLIZ3.append(nLETrack2.getId());
                C576730Mjf.LJIIIZ(str3, C2188811AlT.LIZIZ(sbLIZ3));
                LIZJ(nLETrack2, jLongValue);
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList) {
                if (((NLETrack) obj).getResourceType() == NLEResType.IMAGE) {
                    arrayList3.add(obj);
                }
            }
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                LIZJ((NLETrack) it3.next(), jLongValue);
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : arrayList) {
                NLETrack nLETrack3 = (NLETrack) obj2;
                if (nLETrack3.getDuration() < jLongValue && nLETrack3.getResourceType() == NLEResType.VIDEO) {
                    arrayList4.add(obj2);
                }
            }
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                LIZLLL((NLETrack) it4.next(), jLongValue);
            }
            nLEModel.setDuration(jLongValue);
            C576730Mjf.LJIIIZ(this.LIZJ, "strategy: duration = " + jLongValue + ", trackSize = " + arrayList.size() + ", <<< end");
        }
    }

    public Long LJ(List<? extends NLETrack> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (((NLETrack) obj).getResourceType() == NLEResType.VIDEO) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            return null;
        }
        Long lValueOf = Long.valueOf(((NLETimeSpaceNode) it2.next()).getDuration());
        while (it2.hasNext()) {
            Long lValueOf2 = Long.valueOf(((NLETimeSpaceNode) it2.next()).getDuration());
            if (lValueOf.compareTo(lValueOf2) < 0) {
                lValueOf = lValueOf2;
            }
        }
        return lValueOf;
    }

    public C0LBO(C0LBP c0lbp, String str) {
        this.LIZIZ = c0lbp;
        this.LIZJ = str;
    }

    public final void LIZJ(NLETrack nLETrack, long j) {
        NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) C13LP.LJJJLL(nLETrack.getSortedSlots());
        if (nLETimeSpaceNode != null) {
            nLETimeSpaceNode.setEndTime(j);
            nLETimeSpaceNode.setDuration(j);
        }
        nLETrack.setDuration(j);
        String str = this.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("adjustToTargetDuration adjust Track = ");
        sbLIZ.append(nLETrack.getId());
        sbLIZ.append(", targetDuration = ");
        sbLIZ.append(j);
        C576730Mjf.LJIIIZ(str, C2188811AlT.LIZIZ(sbLIZ));
    }
}
