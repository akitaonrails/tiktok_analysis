package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0DnB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C349590DnB extends AbstractC349610DnD implements InterfaceC379610EuV {
    public final AbstractC349500Dn2 LLILZ;
    public boolean LLILZIL;

    public C349590DnB(C1DRG c1drg, C349540Dn6 c349540Dn6) {
        super(c1drg);
        this.LLILZ = c349540Dn6;
    }

    @Override // X.InterfaceC349480Dn0
    public final void LIZ(NLEModel nLEModel, Map<String, ? extends ArrayList<NLETrackSlot>> map, ArrayList<C349470Dmz> arrayList) {
        NLETrackSlot nLETrackSlot;
        NLESegmentAudio nLESegmentAudio;
        Integer num;
        NLETrack next;
        long measuredEndTime;
        long measuredStartTime;
        long measuredEndTime2;
        boolean z;
        C0EJ3 c0ej3;
        NLEResType type;
        long endTime;
        long endTime2;
        long timeClipStart;
        long startTime;
        NLEModel nLEModelLJI;
        NLETrack trackBySlot;
        long startTime2;
        NLETrack nLETrackRn;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        NLETrack nLETrackRn2;
        if (arrayList.isEmpty()) {
            return;
        }
        boolean z2 = false;
        C349470Dmz c349470Dmz = (C349470Dmz) ListProtector.get(arrayList, 0);
        NLETrackSlot nLETrackSlot2 = c349470Dmz.LIZIZ;
        if (nLETrackSlot2 == null) {
            return;
        }
        NLENode nLENodeDeepClone = null;
        NLESegmentAudio nLESegmentAudio2 = (NLESegmentAudio) NLESegmentVideo.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot2.getMainSegment());
        if (nLESegmentAudio2 != null && (nLETrackSlot = c349470Dmz.LIZ) != null && (nLESegmentAudio = (NLESegmentAudio) NLESegmentVideo.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot.getMainSegment())) != null && (num = c349470Dmz.LIZLLL) != null) {
            int iIntValue = num.intValue();
            C0E48 c0e48LJ = LJ();
            if (c0e48LJ != null) {
                NLEModel nLEModelLJI2 = C350870DpF.LJI(c0e48LJ);
                ArrayList<NLETrackSlot> arrayList2 = new ArrayList<>();
                Iterator<NLETrack> it2 = nLEModelLJI2.getTracks().iterator();
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
                }
                NLETrack nLETrackDynamicCast = NLETrack.dynamicCast(nLENodeDeepClone);
                VecNLETrackSPtr tracks = nLEModelLJI2.getTracks();
                ArrayList arrayList3 = new ArrayList();
                for (NLETrack nLETrack3 : tracks) {
                    if (C351220Dpo.LLLIIL(nLETrack3)) {
                        arrayList3.add(nLETrack3);
                    }
                }
                ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(NLETrack.dynamicCast(((NLENode) it3.next()).deepClone(true)));
                }
                List<NLETrack> listLJJJLL = C351220Dpo.LJJJLL(nLEModelLJI2);
                List<NLETrack> listLJJIIZ = C351220Dpo.LJJIIZ(nLEModelLJI2);
                NLETrack mainTrack = nLEModel.getMainTrack();
                if (mainTrack != null) {
                    measuredEndTime = mainTrack.getMeasuredEndTime() - mainTrack.getMeasuredStartTime();
                } else {
                    measuredEndTime = 0;
                }
                NLETrack mainTrack2 = nLEModelLJI2.getMainTrack();
                if (mainTrack2 != null) {
                    measuredStartTime = mainTrack2.getMeasuredStartTime();
                } else {
                    measuredStartTime = 0;
                }
                NLETrack mainTrack3 = nLEModelLJI2.getMainTrack();
                if (mainTrack3 != null) {
                    measuredEndTime2 = mainTrack3.getMeasuredEndTime();
                } else {
                    measuredEndTime2 = 0;
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                ArrayList<NLETrackSlot> arrayList5 = (ArrayList) linkedHashMap.get(nLETrackSlot2.getUUID());
                if (arrayList5 != null) {
                    z = false;
                    for (NLETrackSlot nLETrackSlot3 : arrayList5) {
                        this.LLILZIL = z2;
                        if (iIntValue == 0) {
                            float absSpeed = nLESegmentAudio2.getAbsSpeed();
                            if (C351220Dpo.LLJJIJIL(nLETrackSlot)) {
                                timeClipStart = nLESegmentAudio.getTimeClipEnd() - nLESegmentAudio2.getTimeClipEnd();
                            } else {
                                timeClipStart = (long) ((nLESegmentAudio2.getTimeClipStart() - nLESegmentAudio.getTimeClipStart()) / absSpeed);
                            }
                            if (C351220Dpo.LLLLIL(nLETrackSlot3)) {
                                long startTime3 = nLETrackSlot.getStartTime();
                                C351510DqH c351510DqH = C351510DqH.LIZ;
                                C0E48 c0e48LJ2 = LJ();
                                if (c0e48LJ2 != null) {
                                    nLETrackRn2 = c0e48LJ2.Rn();
                                } else {
                                    nLETrackRn2 = null;
                                }
                                c351510DqH.getClass();
                                startTime = startTime3 + C351510DqH.LJJIJ(nLETrackRn2, nLETrackSlot2);
                            } else {
                                startTime = nLETrackSlot.getStartTime();
                            }
                            long startTime4 = nLETrackSlot3.getStartTime() - startTime;
                            C0E48 c0e48LJ3 = LJ();
                            if (c0e48LJ3 != null) {
                                nLEModelLJI = C350870DpF.LJI(c0e48LJ3);
                            } else {
                                nLEModelLJI = null;
                            }
                            if (timeClipStart > 0) {
                                long duration = (nLETrackSlot3.getDuration() + startTime4) - 100000;
                                if (timeClipStart <= startTime4) {
                                    nLETrackSlot3.setStartTime(nLETrackSlot3.getStartTime() - timeClipStart);
                                    nLETrackSlot3.setEndTime(nLETrackSlot3.getEndTime() - timeClipStart);
                                    if (nLEModelLJI != null) {
                                        C350640Dos.LIZLLL(nLEModelLJI, nLETrackSlot3);
                                    }
                                } else if (startTime4 + 1 <= timeClipStart && timeClipStart <= duration) {
                                    long j = timeClipStart - startTime4;
                                    long duration2 = nLETrackSlot3.getDuration() - j;
                                    C0E48 c0e48LJ4 = LJ();
                                    if (c0e48LJ4 != null && (interfaceC351350Dq1LLFII = c0e48LJ4.LLFII()) != null) {
                                        interfaceC351350Dq1LLFII.LLJ(nLETrackSlot3, j, duration2, EnumC356070Dxd.NONE);
                                    }
                                    C349680DnK.LIZ(nLETrackSlot3);
                                    nLETrackSlot3.setDuration(duration2);
                                    if (C351220Dpo.LLLLIL(nLETrackSlot3)) {
                                        long startTime5 = nLETrackSlot2.getStartTime();
                                        C351510DqH c351510DqH2 = C351510DqH.LIZ;
                                        C0E48 c0e48LJ5 = LJ();
                                        if (c0e48LJ5 != null) {
                                            nLETrackRn = c0e48LJ5.Rn();
                                        } else {
                                            nLETrackRn = null;
                                        }
                                        c351510DqH2.getClass();
                                        startTime2 = startTime5 + C351510DqH.LJJIJ(nLETrackRn, nLETrackSlot2);
                                    } else {
                                        startTime2 = nLETrackSlot2.getStartTime();
                                    }
                                    nLETrackSlot3.setStartTime(startTime2);
                                    nLETrackSlot3.setEndTime(nLETrackSlot3.getStartTime() + duration2);
                                    if (nLEModelLJI != null) {
                                        C350640Dos.LIZLLL(nLEModelLJI, nLETrackSlot3);
                                    }
                                } else if (timeClipStart > duration) {
                                    C0E48 c0e48LJ6 = LJ();
                                    if (c0e48LJ6 != null && (trackBySlot = C350870DpF.LJI(c0e48LJ6).getTrackBySlot(nLETrackSlot3)) != null) {
                                        trackBySlot.removeSlot(nLETrackSlot3);
                                    }
                                    C0E48 c0e48LJ7 = LJ();
                                    if (c0e48LJ7 != null) {
                                        C350640Dos.LIZJ(nLETrackSlot3, nLETrackSlot2, C350870DpF.LJI(c0e48LJ7), c0e48LJ7.LLFII().LJI());
                                    }
                                    this.LLILZIL = true;
                                }
                            } else {
                                if (!C351220Dpo.LLJJL(nLETrackSlot3)) {
                                    nLETrackSlot3.setStartTime(nLETrackSlot3.getStartTime() - timeClipStart);
                                    nLETrackSlot3.setEndTime(nLETrackSlot3.getEndTime() - timeClipStart);
                                    if (nLEModelLJI != null) {
                                        C350640Dos.LIZLLL(nLEModelLJI, nLETrackSlot3);
                                    }
                                }
                                if (C351220Dpo.LLLIIIIL(nLETrackSlot3)) {
                                    C350640Dos.LIZ(nLETrackSlot3, nLETrackSlot2);
                                    C0E48 c0e48LJ8 = LJ();
                                    if (c0e48LJ8 != null) {
                                        C350700Doy.LJIIIZ(C350870DpF.LJI(c0e48LJ8), nLETrackSlot3);
                                    }
                                }
                            }
                        } else {
                            float absSpeed2 = nLESegmentAudio2.getAbsSpeed();
                            if (nLESegmentAudio2.getTimeClipStart() == nLESegmentAudio.getTimeClipStart()) {
                                endTime = (long) ((nLESegmentAudio2.getTimeClipEnd() - nLESegmentAudio.getTimeClipEnd()) / absSpeed2);
                            } else {
                                endTime = nLETrackSlot2.getEndTime() - nLETrackSlot.getEndTime();
                            }
                            if (C351220Dpo.LLLLIL(nLETrackSlot3)) {
                                long startTime6 = nLETrackSlot.getStartTime();
                                C351510DqH.LIZ.getClass();
                                endTime2 = startTime6 + C351510DqH.LJJIIZI(nLETrackSlot);
                            } else {
                                endTime2 = nLETrackSlot.getEndTime();
                            }
                            LJII(nLETrackSlot3, nLETrackSlot, nLETrackSlot2, endTime, endTime2 - nLETrackSlot3.getEndTime());
                        }
                        arrayList2.add(nLETrackSlot3);
                        if (nLETrackSlot3.getMainSegment().getType() == NLEResType.TEXT_STICKER) {
                            if (this.LLILZIL) {
                                C0EVZ.LIZJ(nLETrackSlot3, LJ());
                            } else {
                                C0EVZ.LIZ.LIZIZ(nLETrackSlot3, LJ());
                            }
                            if (C385050F7v.LJIIIZ(nLETrackSlot3)) {
                                z = true;
                            }
                        }
                        LJIIJ(nLETrackSlot3, nLETrackSlot2);
                        z2 = false;
                    }
                } else {
                    z = false;
                }
                if (!arrayList2.isEmpty()) {
                    for (NLETrackSlot nLETrackSlot4 : arrayList2) {
                        if (C349550Dn7.LJI(nLETrackSlot4) || C385050F7v.LJIIIZ(nLETrackSlot4)) {
                            ArrayList<NLETrackSlot> arrayList6 = new ArrayList();
                            ArrayList<NLETrackSlot> arrayList7 = (ArrayList) linkedHashMap.get(nLETrackSlot2.getUUID());
                            if (arrayList7 != null) {
                                for (NLETrackSlot nLETrackSlot5 : arrayList7) {
                                    if (!this.LLILZ.LIZIZ(LJ(), nLETrackSlot5, nLETrackSlot2, nLEModelLJI2)) {
                                        arrayList6.add(nLETrackSlot5);
                                    }
                                }
                            }
                            for (NLETrackSlot nLETrackSlot6 : arrayList6) {
                                long duration3 = (nLETrackSlot.getDuration() - nLETrackSlot2.getDuration()) - (nLETrackSlot.getEndTime() - nLETrackSlot6.getStartTime());
                                if (duration3 > 0) {
                                    nLETrackSlot6.setStartTime(nLETrackSlot6.getStartTime() - duration3);
                                    nLETrackSlot6.setEndTime(nLETrackSlot6.getEndTime() - duration3);
                                    NLESegment mainSegment = nLETrackSlot6.getMainSegment();
                                    if (mainSegment != null) {
                                        type = mainSegment.getType();
                                    } else {
                                        type = null;
                                    }
                                    if (type == NLEResType.TEXT_STICKER) {
                                        C0EVZ.LIZ.LIZIZ(nLETrackSlot6, LJ());
                                    }
                                }
                            }
                        }
                    }
                }
                int slotIndex = nLEModelLJI2.getMainTrack().getSlotIndex(nLETrackSlot2);
                int size = nLEModelLJI2.getMainTrack().getSlots().size();
                if (slotIndex != -1 && slotIndex != size - 1) {
                    LJFF(C13LZ.LJIILJJIL(slotIndex + 1, size), nLETrackSlot2.getDuration() - nLETrackSlot.getDuration(), arrayList2, map, null);
                }
                if (mainTrack != null) {
                    Iterator it4 = ((ArrayList) listLJJJLL).iterator();
                    while (it4.hasNext()) {
                        for (NLETrackSlot nLETrackSlot7 : ((NLETrack) it4.next()).getSlots()) {
                            if (nLETrackSlot7.getDuration() == measuredEndTime) {
                                nLETrackSlot7.setStartTime(measuredStartTime);
                                nLETrackSlot7.setEndTime(measuredEndTime2);
                            }
                        }
                    }
                    Iterator<NLETrack> it5 = listLJJIIZ.iterator();
                    while (it5.hasNext()) {
                        for (NLETrackSlot nLETrackSlot8 : it5.next().getSlots()) {
                            if (nLETrackSlot8.getDuration() == measuredEndTime) {
                                nLETrackSlot8.setStartTime(measuredStartTime);
                                nLETrackSlot8.setEndTime(measuredEndTime2);
                            }
                        }
                    }
                }
                LIZIZ(map, arrayList2, nLETrackDynamicCast, arrayList4, false);
                if (z && (c0ej3 = (C0EJ3) this.LL.LJIIL(null, C0EJ3.class)) != null) {
                    c0ej3.Rc();
                }
            }
        }
    }
}
