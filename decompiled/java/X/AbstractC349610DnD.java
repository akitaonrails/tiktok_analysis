package X;

import Y.AComparatorS24S0000000_5;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.keva.Keva;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0DnD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC349610DnD implements InterfaceC349480Dn0 {
    public final C1DRG LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1269));
    public boolean LLILLL;

    public final C0E48 LJ() {
        return (C0E48) this.LLILLJJLI.getValue();
    }

    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public AbstractC349610DnD(C1DRG c1drg) {
        this.LL = c1drg;
    }

    public final void LJIIJ(NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2) {
        C0E48 c0e48LJ = LJ();
        if (c0e48LJ != null && C351220Dpo.LLLLIL(nLETrackSlot)) {
            C350700Doy.LJIIJ(C350870DpF.LJI(c0e48LJ), nLETrackSlot, nLETrackSlot2);
        }
    }

    public final void LIZLLL(int i, NLEModel nLEModel, Map<String, ? extends ArrayList<NLETrackSlot>> map) {
        NLETrackSlot nLETrackSlot;
        NLETrack mainTrack;
        VecNLETrackSlotSPtr sortedSlots;
        ArrayList arrayList;
        NLETrackSlot next;
        NLETrack mainTrack2;
        C0E48 c0e48LJ = LJ();
        if (c0e48LJ != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(i, C350870DpF.LJI(c0e48LJ).getMainTrack().getSortedSlots())) != null && (mainTrack = nLEModel.getMainTrack()) != null && (sortedSlots = mainTrack.getSortedSlots()) != null) {
            Iterator<NLETrackSlot> it2 = sortedSlots.iterator();
            while (true) {
                arrayList = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.getUUID(), nLETrackSlot.getUUID())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            NLETrackSlot nLETrackSlot2 = next;
            if (nLETrackSlot2 != null && (mainTrack2 = nLEModel.getMainTrack()) != null) {
                ArrayList arrayList2 = (ArrayList) ((LinkedHashMap) map).get(nLETrackSlot.getUUID());
                if (arrayList2 != null) {
                    arrayList = new ArrayList();
                    for (Object obj : arrayList2) {
                        if (C351220Dpo.LLLLIL((NLETrackSlot) obj)) {
                            arrayList.add(obj);
                        }
                    }
                }
                C351510DqH c351510DqH = C351510DqH.LIZ;
                NLETrack nLETrackRn = c0e48LJ.Rn();
                c351510DqH.getClass();
                long jLJJIJ = C351510DqH.LJJIJ(nLETrackRn, nLETrackSlot);
                long jLJJIJ2 = C351510DqH.LJJIJ(mainTrack2, nLETrackSlot2);
                long j = jLJJIJ - jLJJIJ2;
                long startTime = nLETrackSlot2.getStartTime() + jLJJIJ2;
                Keva keva = C350660Dou.LIZ;
                C350660Dou.LJ(arrayList, nLETrackSlot, startTime, j, C350870DpF.LJI(c0e48LJ), c0e48LJ.LLFII().LJI());
            }
        }
    }

    public final void LJIIIZ(long j, NLETrackSlot nLETrackSlot, long j2, NLETrackSlot nLETrackSlot2) {
        C0E48 c0e48LJ = LJ();
        if (c0e48LJ == null) {
            return;
        }
        if (j > 0) {
            long duration = (j2 + nLETrackSlot.getDuration()) - 100000;
            if (j > j2) {
                if (j2 + 1 <= j && j <= duration) {
                    long j3 = j - j2;
                    long duration2 = nLETrackSlot.getDuration() - j3;
                    c0e48LJ.LLFII().LLJ(nLETrackSlot, j3, duration2, EnumC356070Dxd.NONE);
                    nLETrackSlot.setDuration(duration2);
                    long startTime = nLETrackSlot2.getStartTime();
                    C351510DqH c351510DqH = C351510DqH.LIZ;
                    NLETrack nLETrackRn = c0e48LJ.Rn();
                    c351510DqH.getClass();
                    nLETrackSlot.setStartTime(startTime + C351510DqH.LJJIJ(nLETrackRn, nLETrackSlot2));
                    nLETrackSlot.setEndTime(nLETrackSlot.getStartTime() + duration2);
                    LJIIIIZZ(this, nLETrackSlot, nLETrackSlot2, j3, false, 16);
                    return;
                }
                if (j <= duration) {
                    return;
                }
                NLETrack trackBySlot = C350870DpF.LJI(c0e48LJ).getTrackBySlot(nLETrackSlot);
                if (trackBySlot != null) {
                    trackBySlot.removeSlot(nLETrackSlot);
                }
                LJIIIIZZ(this, nLETrackSlot, nLETrackSlot2, 0L, true, 12);
                return;
            }
            return;
        }
        if (C351220Dpo.LLJJL(nLETrackSlot)) {
            C350640Dos.LIZ(nLETrackSlot, nLETrackSlot2);
        }
        if (C351220Dpo.LLLIIIIL(nLETrackSlot)) {
            C350640Dos.LIZ(nLETrackSlot, nLETrackSlot2);
        }
        LJIIIIZZ(this, nLETrackSlot, nLETrackSlot2, 0L, false, 28);
    }

    public final void LIZIZ(Map<String, ? extends ArrayList<NLETrackSlot>> map, ArrayList<NLETrackSlot> arrayList, NLETrack nLETrack, List<? extends NLETrack> list, boolean z) {
        int layer;
        NLETimeSpaceNode nLETimeSpaceNode;
        NLETimeSpaceNode nLETimeSpaceNode2;
        long endTime;
        VecNLETrackSlotSPtr sortedSlots;
        C0E48 c0e48LJ = LJ();
        if (c0e48LJ == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = ((LinkedHashMap) map).values().iterator();
        while (it2.hasNext()) {
            arrayList2.addAll((ArrayList) it2.next());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        NLEModel nLEModelLJI = C350870DpF.LJI(c0e48LJ);
        VecNLETrackSPtr tracks = nLEModelLJI.getTracks();
        ArrayList<NLETrack> arrayList3 = new ArrayList();
        for (NLETrack nLETrack2 : tracks) {
            NLETrack nLETrack3 = nLETrack2;
            ArrayList arrayListLIZIZ = C348600Dla.LIZIZ();
            if (!nLETrack3.getMainTrack() && arrayListLIZIZ.contains(nLETrack3.getResourceType())) {
                arrayList3.add(nLETrack2);
            }
        }
        for (NLETrack nLETrack4 : arrayList3) {
            ArrayList arrayList4 = new ArrayList();
            if (C351220Dpo.LLLJL(nLETrack4)) {
                VecNLETrackSlotSPtr sortedSlots2 = nLETrack4.getSortedSlots();
                int i = 0;
                for (NLETrackSlot nLETrackSlot : sortedSlots2) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        NLETrackSlot nLETrackSlot2 = nLETrackSlot;
                        NLETimeSpaceNode nLETimeSpaceNode3 = (NLETimeSpaceNode) C13LP.LJJJLZIJ(i2, sortedSlots2);
                        if (nLETimeSpaceNode3 != null && nLETrackSlot2.getStartTime() < nLETimeSpaceNode3.getEndTime() && nLETimeSpaceNode3.getStartTime() < nLETrackSlot2.getEndTime()) {
                            if (z) {
                                NLETrack mainTrack = nLEModelLJI.getMainTrack();
                                if (mainTrack != null && (sortedSlots = mainTrack.getSortedSlots()) != null) {
                                    int i3 = 0;
                                    for (NLETrackSlot nLETrackSlot3 : sortedSlots) {
                                        int i4 = i3 + 1;
                                        if (i3 >= 0) {
                                            if (C349570Dn9.LIZ(LJ(), nLETrackSlot2, nLETrackSlot3, nLEModelLJI)) {
                                                nLETimeSpaceNode2 = (NLETimeSpaceNode) C13LP.LJJJLZIJ(i4, sortedSlots);
                                                break;
                                            }
                                            i3 = i4;
                                        } else {
                                            C1697810uHb.LJIJI();
                                            throw null;
                                        }
                                    }
                                    nLETimeSpaceNode2 = null;
                                    endTime = nLETrackSlot2.getEndTime() - nLETimeSpaceNode3.getStartTime();
                                    if (nLETimeSpaceNode2 != null) {
                                        endTime = nLETrackSlot2.getEndTime() - nLETimeSpaceNode2.getEndTime();
                                    }
                                    c0e48LJ.LLFII().LLJ(nLETrackSlot2, 0L, nLETrackSlot2.getDuration() - endTime, EnumC356070Dxd.NONE);
                                } else {
                                    nLETimeSpaceNode2 = null;
                                    endTime = nLETrackSlot2.getEndTime() - nLETimeSpaceNode3.getStartTime();
                                    if (nLETimeSpaceNode2 != null && nLETimeSpaceNode2.getEndTime() < nLETimeSpaceNode3.getStartTime()) {
                                        endTime = nLETrackSlot2.getEndTime() - nLETimeSpaceNode2.getEndTime();
                                    }
                                    c0e48LJ.LLFII().LLJ(nLETrackSlot2, 0L, nLETrackSlot2.getDuration() - endTime, EnumC356070Dxd.NONE);
                                }
                            } else {
                                nLETrack4.removeSlot(nLETrackSlot2);
                                arrayList4.add(nLETrackSlot2);
                            }
                        }
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            } else {
                VecNLETrackSlotSPtr slots = nLETrack4.getSlots();
                ArrayList<NLETimeSpaceNode> arrayList5 = new ArrayList();
                for (NLETrackSlot nLETrackSlot4 : slots) {
                    if (!arrayList2.contains(nLETrackSlot4)) {
                        arrayList5.add(nLETrackSlot4);
                    }
                }
                VecNLETrackSlotSPtr slots2 = nLETrack4.getSlots();
                ArrayList<NLETrackSlot> arrayList6 = new ArrayList();
                for (NLETrackSlot nLETrackSlot5 : slots2) {
                    if (arrayList.contains(nLETrackSlot5)) {
                        arrayList6.add(nLETrackSlot5);
                    }
                }
                for (NLETimeSpaceNode nLETimeSpaceNode4 : arrayList5) {
                    for (NLETrackSlot nLETrackSlot6 : arrayList6) {
                        if (nLETimeSpaceNode4.getStartTime() < nLETrackSlot6.getEndTime() && nLETrackSlot6.getStartTime() < nLETimeSpaceNode4.getEndTime() && !arrayList4.contains(nLETrackSlot6)) {
                            nLETrack4.removeSlot(nLETrackSlot6);
                            arrayList4.add(nLETrackSlot6);
                        }
                    }
                }
            }
            if (!arrayList4.isEmpty()) {
                if (nLETrack4.getResourceType() == NLEResType.AUTOSUBTITLE_STICKER) {
                    if (nLETrack != null) {
                        nLEModelLJI.removeTrack(nLETrack4);
                        nLEModelLJI.addTrack(nLETrack);
                    }
                } else {
                    if (arrayList4.size() > 1) {
                        C08XD.LJJ(arrayList4, new AComparatorS24S0000000_5(90));
                    }
                    if (C351220Dpo.LLLIIL(nLETrack4)) {
                        linkedHashMap.put(nLETrack4, arrayList4);
                    } else {
                        C348600Dla.LIZ(nLETrack4, arrayList4, nLEModelLJI);
                        int layer2 = -1;
                        if (C351220Dpo.LLJJIII(nLETrack4)) {
                            List<NLETrack> listLJJIJLIJ = C351220Dpo.LJJIJLIJ(C350870DpF.LJI(c0e48LJ));
                            if (listLJJIJLIJ != null && (nLETimeSpaceNode = (NLETimeSpaceNode) C13LP.LJJLIIIJL(listLJJIJLIJ)) != null) {
                                layer = nLETimeSpaceNode.getLayer();
                            } else {
                                layer = -1;
                            }
                            int i5 = layer + 1;
                            if (i5 > C356600DyU.LJ()) {
                                C356600DyU.LIZ = i5;
                            }
                        }
                        if (C351220Dpo.LLJI(nLETrack4) && C349760DnS.LIZIZ(C350870DpF.LJI(c0e48LJ))) {
                            NLETimeSpaceNode nLETimeSpaceNode5 = (NLETimeSpaceNode) C13LP.LJJLIIIJL(C351220Dpo.LJJIIZ(C350870DpF.LJI(c0e48LJ)));
                            if (nLETimeSpaceNode5 != null) {
                                layer2 = nLETimeSpaceNode5.getLayer();
                            }
                            C349760DnS.LIZ = layer2 + 1;
                        }
                    }
                }
            }
        }
        if (!linkedHashMap.isEmpty()) {
            if (C351220Dpo.LJJLIIIJLJLI(nLEModelLJI).size() + linkedHashMap.size() > ((Number) C0E5G.LIZIZ(EnumC357850E1f.MAX_PIP_TRACK_COUNT, Integer.MAX_VALUE)).intValue()) {
                Iterator<NLETrack> it3 = C351220Dpo.LJJLIIIJLJLI(nLEModelLJI).iterator();
                while (it3.hasNext()) {
                    nLEModelLJI.removeTrack(it3.next());
                }
                Iterator it4 = ((ArrayList) list).iterator();
                while (it4.hasNext()) {
                    nLEModelLJI.addTrack((NLETrack) it4.next());
                }
                return;
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                C348600Dla.LIZ((NLETrack) entry.getKey(), (ArrayList) entry.getValue(), nLEModelLJI);
            }
        }
    }

    public final void LJFF(IntRange intRange, long j, ArrayList<NLETrackSlot> arrayList, Map<String, ? extends ArrayList<NLETrackSlot>> map, Function1<? super NLETrackSlot, Boolean> function1) {
        String uuid;
        C0E48 c0e48LJ = LJ();
        if (c0e48LJ == null) {
            return;
        }
        NLEModel nLEModelLJI = C350870DpF.LJI(c0e48LJ);
        int i = intRange.LL;
        int i2 = intRange.LLILLJJLI;
        if (i > i2) {
            return;
        }
        while (true) {
            NLENode nLENode = (NLENode) C13LP.LJJJLZIJ(i, nLEModelLJI.getMainTrack().getSortedSlots());
            if (nLENode != null && (uuid = nLENode.getUUID()) != null) {
                ArrayList<NLETrackSlot> arrayList2 = map.get(uuid);
                if (arrayList2 != null) {
                    for (NLETrackSlot nLETrackSlot : arrayList2) {
                        if (function1 == null || function1.invoke(nLETrackSlot).booleanValue()) {
                            nLETrackSlot.setStartTime(nLETrackSlot.getStartTime() + j);
                            if (!nLETrackSlot.hasEndTime()) {
                                nLETrackSlot.setEndTime(nLETrackSlot.getEndTime());
                            } else {
                                nLETrackSlot.setEndTime(nLETrackSlot.getEndTime() + j);
                            }
                            C350110Do1.LJI(nLEModelLJI, nLETrackSlot);
                            C350640Dos.LIZLLL(C350870DpF.LJI(c0e48LJ), nLETrackSlot);
                            if (arrayList != null) {
                                arrayList.add(nLETrackSlot);
                            }
                            if (nLETrackSlot.getMainSegment().getType() == NLEResType.TEXT_STICKER) {
                                C0EVZ.LIZ.LIZIZ(nLETrackSlot, c0e48LJ);
                            }
                        }
                    }
                }
                if (i != i2) {
                    i++;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void LJII(NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2, NLETrackSlot nLETrackSlot3, long j, long j2) {
        long endTime;
        C0E48 c0e48LJ = LJ();
        if (c0e48LJ == null) {
            return;
        }
        if (j < 0) {
            if (C351220Dpo.LLLLIL(nLETrackSlot)) {
                long startTime = nLETrackSlot2.getStartTime();
                C351510DqH.LIZ.getClass();
                endTime = startTime + C351510DqH.LJJIIZI(nLETrackSlot2);
            } else {
                endTime = nLETrackSlot2.getEndTime();
            }
            long duration = (j2 + nLETrackSlot.getDuration()) - 100000;
            long j3 = -j;
            if ((C349550Dn7.LJI(nLETrackSlot) || C349550Dn7.LJFF(nLETrackSlot)) && endTime < nLETrackSlot.getEndTime()) {
                long startTime2 = endTime - nLETrackSlot.getStartTime();
                if (j3 > startTime2) {
                    j3 = startTime2;
                }
                c0e48LJ.LLFII().LLJ(nLETrackSlot, 0L, nLETrackSlot.getDuration() - j3, EnumC356070Dxd.NONE);
                return;
            }
            if (j2 + 1 <= j3 && j3 <= duration) {
                long duration2 = nLETrackSlot.getDuration() - (j3 - j2);
                c0e48LJ.LLFII().LLJ(nLETrackSlot, 0L, duration2, EnumC356070Dxd.NONE);
                nLETrackSlot.setDuration(duration2);
                C350640Dos.LIZLLL(C350870DpF.LJI(c0e48LJ), nLETrackSlot);
                return;
            }
            if (j3 <= duration) {
                return;
            }
            C350870DpF.LJI(c0e48LJ).getTrackBySlot(nLETrackSlot).removeSlot(nLETrackSlot);
            C350640Dos.LIZJ(nLETrackSlot, nLETrackSlot3, C350870DpF.LJI(c0e48LJ), c0e48LJ.LLFII().LJI());
            return;
        }
        if (!C351220Dpo.LLLIIIIL(nLETrackSlot)) {
            return;
        }
        C350640Dos.LIZ(nLETrackSlot, nLETrackSlot3);
        C350700Doy.LJIIIZ(C350870DpF.LJI(c0e48LJ), nLETrackSlot);
    }

    public static void LJIIIIZZ(AbstractC349610DnD abstractC349610DnD, NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2, long j, boolean z, int i) {
        NLEEditor nLEEditorLJI;
        if ((i & 4) != 0) {
            j = 0;
        }
        if ((i & 16) != 0) {
            z = false;
        }
        abstractC349610DnD.getClass();
        if (C349550Dn7.LJI(nLETrackSlot)) {
            if (z) {
                C0EVZ.LIZJ(nLETrackSlot, abstractC349610DnD.LJ());
                return;
            } else {
                C0EVZ.LIZ.LIZIZ(nLETrackSlot, abstractC349610DnD.LJ());
                return;
            }
        }
        if (C349550Dn7.LJFF(nLETrackSlot)) {
            if (j == 0) {
                return;
            }
            Pair pairLIZ = C349660DnI.LIZ(nLETrackSlot);
            C349660DnI.LIZIZ(((Number) pairLIZ.getFirst()).longValue() + j, nLETrackSlot, ((Number) pairLIZ.getSecond()).longValue() - 0);
            C349680DnK.LIZ(nLETrackSlot);
            abstractC349610DnD.LLILLL = true;
            return;
        }
        if (!C351220Dpo.LLLLIL(nLETrackSlot)) {
            return;
        }
        if (z) {
            C0E48 c0e48LJ = abstractC349610DnD.LJ();
            if (c0e48LJ == null) {
                return;
            }
            NLEModel nLEModelLJI = C350870DpF.LJI(c0e48LJ);
            C0E48 c0e48LJ2 = abstractC349610DnD.LJ();
            if (c0e48LJ2 == null || (nLEEditorLJI = c0e48LJ2.LLFII().LJI()) == null) {
                return;
            } else {
                C350640Dos.LIZJ(nLETrackSlot, nLETrackSlot2, nLEModelLJI, nLEEditorLJI);
            }
        } else {
            C0E48 c0e48LJ3 = abstractC349610DnD.LJ();
            if (c0e48LJ3 != null) {
                C350640Dos.LIZLLL(C350870DpF.LJI(c0e48LJ3), nLETrackSlot);
            }
        }
        abstractC349610DnD.LJIIJ(nLETrackSlot, nLETrackSlot2);
    }
}
