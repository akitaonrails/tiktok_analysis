package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AFwS234S0000000_5;

/* JADX INFO: renamed from: X.0DnF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C349630DnF extends AbstractC349610DnD {
    public C349630DnF(C1DRG c1drg) {
        super(c1drg);
    }

    @Override // X.InterfaceC349480Dn0
    public void LIZ(NLEModel nLEModel, Map<String, ? extends ArrayList<NLETrackSlot>> map, ArrayList<C349470Dmz> arrayList) {
        C0E48 c0e48LJ;
        NLETrack next;
        NLENode nLENodeDeepClone;
        NLESegmentVideo nLESegmentVideo;
        NLETrackSlot nLETrackSlot;
        NLESegmentVideo nLESegmentVideo2;
        NLESegmentVideo nLESegmentVideo3;
        NLETrackSlot nLETrackSlot2;
        NLESegmentVideo nLESegmentVideo4;
        if (arrayList.isEmpty() || (c0e48LJ = LJ()) == null) {
            return;
        }
        NLEModel nLEModelLJI = C350870DpF.LJI(c0e48LJ);
        Iterator<NLETrack> it2 = nLEModelLJI.getTracks().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                NLETrack nLETrack = next;
                if (!nLETrack.getMainTrack() && nLETrack.getResourceType() == NLEResType.SUBTITLE_STICKER) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NLETrack nLETrack2 = next;
        if (nLETrack2 != null) {
            nLENodeDeepClone = nLETrack2.deepClone(true);
        } else {
            nLENodeDeepClone = null;
        }
        NLETrack nLETrackDynamicCast = NLETrack.dynamicCast(nLENodeDeepClone);
        VecNLETrackSPtr tracks = nLEModelLJI.getTracks();
        ArrayList arrayList2 = new ArrayList();
        for (NLETrack nLETrack3 : tracks) {
            if (C351220Dpo.LLLIIL(nLETrack3)) {
                arrayList2.add(nLETrack3);
            }
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(NLETrack.dynamicCast(((NLENode) it3.next()).deepClone(true)));
        }
        ArrayList<NLETrackSlot> arrayList4 = new ArrayList<>();
        if (arrayList.size() > 1) {
            for (C349470Dmz c349470Dmz : arrayList) {
                NLETrackSlot nLETrackSlot3 = c349470Dmz.LIZIZ;
                if (nLETrackSlot3 != null && (nLESegmentVideo3 = (NLESegmentVideo) NLESegmentVideo.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot3.getMainSegment())) != null && (nLETrackSlot2 = c349470Dmz.LIZ) != null && (nLESegmentVideo4 = (NLESegmentVideo) NLESegmentVideo.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot2.getMainSegment())) != null) {
                    LJIIJJI(map, nLETrackSlot3, nLESegmentVideo3, nLESegmentVideo4, nLETrackSlot2, arrayList4);
                }
            }
        } else {
            C349470Dmz c349470Dmz2 = (C349470Dmz) ListProtector.get(arrayList, 0);
            NLETrackSlot nLETrackSlot4 = c349470Dmz2.LIZIZ;
            if (nLETrackSlot4 == null || (nLESegmentVideo = (NLESegmentVideo) NLESegmentVideo.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot4.getMainSegment())) == null || (nLETrackSlot = c349470Dmz2.LIZ) == null || (nLESegmentVideo2 = (NLESegmentVideo) NLESegmentVideo.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot.getMainSegment())) == null) {
                return;
            }
            LJIIJJI(map, nLETrackSlot4, nLESegmentVideo, nLESegmentVideo2, nLETrackSlot, arrayList4);
            C0E48 c0e48LJ2 = LJ();
            if (c0e48LJ2 != null) {
                int slotIndex = C350870DpF.LJI(c0e48LJ2).getMainTrack().getSlotIndex(nLETrackSlot4);
                int size = C350870DpF.LJI(c0e48LJ2).getMainTrack().getSlots().size();
                if (slotIndex != -1 && slotIndex != size - 1) {
                    LJFF(C13LZ.LJIILJJIL(slotIndex + 1, size), nLETrackSlot4.getDuration() - nLETrackSlot.getDuration(), arrayList4, map, AFwS234S0000000_5.get$arr$(469));
                }
            }
        }
        LIZIZ(map, arrayList4, nLETrackDynamicCast, arrayList3, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x032f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(java.util.Map<java.lang.String, ? extends java.util.ArrayList<com.bytedance.ies.nle.editor_jni.NLETrackSlot>> r31, com.bytedance.ies.nle.editor_jni.NLETrackSlot r32, com.bytedance.ies.nle.editor_jni.NLESegmentVideo r33, com.bytedance.ies.nle.editor_jni.NLESegmentVideo r34, com.bytedance.ies.nle.editor_jni.NLETrackSlot r35, java.util.ArrayList<com.bytedance.ies.nle.editor_jni.NLETrackSlot> r36) {
        /*
            Method dump skipped, instruction units count: 1126
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C349630DnF.LJIIJJI(java.util.Map, com.bytedance.ies.nle.editor_jni.NLETrackSlot, com.bytedance.ies.nle.editor_jni.NLESegmentVideo, com.bytedance.ies.nle.editor_jni.NLESegmentVideo, com.bytedance.ies.nle.editor_jni.NLETrackSlot, java.util.ArrayList):void");
    }
}
