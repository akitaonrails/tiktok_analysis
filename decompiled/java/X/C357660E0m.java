package X;

import Y.AComparatorS24S0000000_5;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.beats.logic.BeatInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0E0m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C357660E0m {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(NLEModel nLEModel) {
        NLETrack next;
        VecNLETrackSlotSPtr sortedSlots;
        NLETrackSlot nLETrackSlot;
        long timeClipStart;
        VecNLETrackSlotSPtr sortedSlots2;
        ArrayList arrayList = new ArrayList();
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        int i = 0;
        if (tracks != null) {
            Iterator<NLETrack> it2 = tracks.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    NLETrack nLETrack = next;
                    if (C351220Dpo.LLILLL(nLETrack) || C351220Dpo.LLJILLL(nLETrack)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            NLETrack nLETrack2 = next;
            if (nLETrack2 != null && (sortedSlots = nLETrack2.getSortedSlots()) != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(sortedSlots)) != null) {
                NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
                if (nLESegmentAudioDynamicCast != null) {
                    timeClipStart = nLESegmentAudioDynamicCast.getTimeClipStart();
                } else {
                    timeClipStart = 0;
                }
                NLETrack mainTrack = nLEModel.getMainTrack();
                if (mainTrack != null && (sortedSlots2 = mainTrack.getSortedSlots()) != null) {
                    for (NLETrackSlot nLETrackSlot2 : sortedSlots2) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            NLETrackSlot nLETrackSlot3 = nLETrackSlot2;
                            if (i != nLEModel.getMainTrack().getSortedSlots().size() - 1) {
                                arrayList.add(new BeatInfo(C352310DrZ.LIZ(nLETrackSlot3.getEndTime() + timeClipStart), 0, 0.0f, 2));
                            }
                            i = i2;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }
                List listLJLLLL = C13LP.LJLLLL(new AComparatorS24S0000000_5(140), arrayList);
                String strLIZJ = LIZJ(listLJLLLL, AFwS234S0000000_5.get$arr$(549));
                String strLIZJ2 = LIZJ(listLJLLLL, AFwS234S0000000_5.get$arr$(550));
                nLETrackSlot.setExtra("audio_stick_points", strLIZJ);
                nLETrackSlot.setExtra("beats_source", strLIZJ2);
                nLETrackSlot.setExtra("sound_sync_beats_count", String.valueOf(listLJLLLL.size()));
            }
        }
    }

    public static List LIZLLL(NLETrackSlot nLETrackSlot) {
        if (nLETrackSlot == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        String strLJLJL = C351220Dpo.LJLJL(nLETrackSlot, "audio_stick_points", null);
        String str = "";
        if (strLJLJL == null) {
            strLJLJL = "";
        }
        String strLJLJL2 = C351220Dpo.LJLJL(nLETrackSlot, "beats_source", null);
        if (strLJLJL2 != null) {
            str = strLJLJL2;
        }
        LJIIJ(strLJLJL, str);
        arrayList.addAll(LJIIJ(strLJLJL, str));
        if (arrayList.size() > 1) {
            C08XD.LJJ(arrayList, new AComparatorS24S0000000_5(141));
        }
        return arrayList;
    }

    public static boolean LJI(NLETrackSlot nLETrackSlot) {
        if (nLETrackSlot.getEndTransition() != null && nLETrackSlot.getEndTransition().hasOverlap() && !nLETrackSlot.getEndTransition().hasTimeChange()) {
            return true;
        }
        return false;
    }

    public static boolean LJIIIIZZ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if (C351220Dpo.LLILLL(nLETrack2) || C351220Dpo.LLJILLL(nLETrack2)) {
                arrayList.add(nLETrack);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            VecNLETrackSlotSPtr slots = ((NLETrack) it2.next()).getSlots();
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(slots, 10));
            Iterator<NLETrackSlot> it3 = slots.iterator();
            while (it3.hasNext()) {
                arrayList3.add(Boolean.valueOf(LJIIIZ(it3.next())));
            }
            C19719612Di.LJJI(arrayList3, arrayList2);
        }
        if (!arrayList2.isEmpty()) {
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                if (((Boolean) it4.next()).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static boolean LJIIIZ(NLETrackSlot nLETrackSlot) {
        int iIntValue;
        if (nLETrackSlot.hasExtra("audio_stick_points") && nLETrackSlot.hasExtra("beats_source")) {
            Integer numLJJJLZIJ = C351220Dpo.LJJJLZIJ(nLETrackSlot, "sound_sync_beats_count", null);
            if (numLJJJLZIJ != null) {
                iIntValue = numLJJJLZIJ.intValue();
            } else {
                iIntValue = 0;
            }
            List listLJIIJJI = LJIIJJI(nLETrackSlot.getExtra("audio_stick_points"));
            List listLJIIJJI2 = LJIIJJI(nLETrackSlot.getExtra("beats_source"));
            if (!(listLJIIJJI2 instanceof Collection) || !listLJIIJJI2.isEmpty()) {
                Iterator it2 = listLJIIJJI2.iterator();
                while (it2.hasNext()) {
                    int iIntValue2 = ((Number) it2.next()).intValue();
                    if (iIntValue2 == 0 || iIntValue2 == 1) {
                        return true;
                    }
                }
            }
            if (listLJIIJJI.size() != iIntValue) {
                return true;
            }
        }
        return false;
    }

    public static List LJIIJJI(String str) {
        if (str.length() == 0) {
            return C13BV.INSTANCE;
        }
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = listLJJLIIIJILLIZJL.iterator();
        while (it2.hasNext()) {
            Integer numLJIIJJI = C2095008Iq.LJIIJJI(a0.LJLIIIL((String) it2.next()).toString());
            if (numLJIIJJI != null) {
                arrayList.add(numLJIIJJI);
            }
        }
        return arrayList;
    }

    public static String LIZJ(List list, Function1 function1) {
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                sb.append(function1.invoke(obj).toString());
                if (i < list.size() - 1) {
                    sb.append(',');
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return sb.toString();
    }

    public static List LJ(NLETrackSlot nLETrackSlot, List list) {
        int iLIZ;
        int iLIZ2;
        if (nLETrackSlot == null) {
            return C13BV.INSTANCE;
        }
        NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
        if (nLESegmentAudioDynamicCast != null) {
            iLIZ2 = C352310DrZ.LIZ(nLESegmentAudioDynamicCast.getTimeClipStart());
            iLIZ = C352310DrZ.LIZ(nLESegmentAudioDynamicCast.getTimeClipEnd()) + 1;
        } else {
            iLIZ = 0;
            iLIZ2 = 0;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            int i = ((BeatInfo) obj).timestampInMS;
            if (iLIZ2 <= i && i <= iLIZ) {
                arrayList.add(obj);
            }
        }
        return C13LP.LJLLLL(new AComparatorS24S0000000_5(142), arrayList);
    }

    public static boolean LJFF(NLETrackSlot nLETrackSlot, List list) {
        String strLJLJL;
        String strLIZJ = LIZJ(list, AFwS234S0000000_5.get$arr$(553));
        String strLIZJ2 = LIZJ(list, AFwS234S0000000_5.get$arr$(554));
        String strLJLJL2 = null;
        if (nLETrackSlot != null) {
            strLJLJL = C351220Dpo.LJLJL(nLETrackSlot, "audio_stick_points", "");
            strLJLJL2 = C351220Dpo.LJLJL(nLETrackSlot, "beats_source", strLIZJ2);
        } else {
            strLJLJL = null;
        }
        if (Intrinsics.LJFF(strLIZJ, strLJLJL) && Intrinsics.LJFF(strLIZJ2, strLJLJL2)) {
            return false;
        }
        return true;
    }

    public static boolean LJII(NLETrackSlot nLETrackSlot, List list) {
        int iLIZ;
        int iLIZ2;
        if (nLETrackSlot == null) {
            return false;
        }
        NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
        if (nLESegmentAudioDynamicCast != null) {
            iLIZ2 = C352310DrZ.LIZ(nLESegmentAudioDynamicCast.getTimeClipStart());
            iLIZ = C352310DrZ.LIZ(nLESegmentAudioDynamicCast.getTimeClipEnd());
        } else {
            iLIZ = 0;
            iLIZ2 = 0;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            int i = iLIZ + 1;
            int i2 = ((BeatInfo) obj).timestampInMS;
            if (iLIZ2 <= i2 && i2 <= i) {
                arrayList.add(obj);
            }
        }
        return !arrayList.isEmpty();
    }

    public static List LJIIJ(String str, String str2) {
        int iIntValue;
        List listLJIIJJI = LJIIJJI(str);
        List listLJIIJJI2 = LJIIJJI(str2);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIIJJI, 10));
        int i = 0;
        for (Object obj : listLJIIJJI) {
            int i2 = i + 1;
            if (i >= 0) {
                int iIntValue2 = ((Number) obj).intValue();
                Integer num = (Integer) C13LP.LJJJLZIJ(i, listLJIIJJI2);
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 2;
                }
                arrayList.add(new BeatInfo(iIntValue2, 0, 0.0f, iIntValue));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return arrayList;
    }

    public static void LJIILJJIL(List list, VecNLETrackSlotSPtr vecNLETrackSlotSPtr) {
        int i = 0;
        for (Object obj : C13LP.LJLLLL(new AComparatorS24S0000000_5(147), list)) {
            int i2 = i + 1;
            if (i >= 0) {
                C357670E0n c357670E0n = (C357670E0n) obj;
                NLETrackSlot nLETrackSlot = (NLETrackSlot) ListProtector.get(vecNLETrackSlotSPtr, c357670E0n.LIZ);
                if (NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment()) != null) {
                    if (i > 0) {
                        C357670E0n c357670E0n2 = (C357670E0n) ListProtector.get(list, i - 1);
                        if (c357670E0n2.LJII) {
                            c357670E0n.LIZJ = c357670E0n2.LIZLLL - c357670E0n2.LJIIIZ;
                        } else {
                            c357670E0n.LIZJ = c357670E0n2.LIZLLL;
                        }
                    }
                    c357670E0n.LIZLLL = c357670E0n.LIZJ + nLETrackSlot.getDuration();
                    nLETrackSlot.setStartTime(c357670E0n.LIZJ);
                    nLETrackSlot.setEndTime(c357670E0n.LIZLLL);
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public static void LIZIZ(int i, int i2, List list) {
        int i3 = i2 + 1;
        List listSubList = list.subList(i, i3);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSubList) {
            if (!((C357670E0n) obj).LJI) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        long j = 0;
        while (it2.hasNext()) {
            j += ((C357670E0n) it2.next()).LJFF;
        }
        if (j == 0) {
            return;
        }
        List listSubList2 = list.subList(i, i3);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listSubList2) {
            if (!((C357670E0n) obj2).LJI) {
                arrayList2.add(obj2);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            ((C357670E0n) it3.next()).LIZIZ = r6.LJFF / j;
        }
    }

    public static void LJIIL(int i, int i2, VecNLETrackSlotSPtr vecNLETrackSlotSPtr) {
        long duration;
        if (vecNLETrackSlotSPtr.isEmpty()) {
            return;
        }
        ArrayList<NLETrackSlot> arrayList = new ArrayList();
        int i3 = 0;
        for (NLETrackSlot nLETrackSlot : vecNLETrackSlotSPtr) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                if (i <= i3 && i3 <= i2) {
                    arrayList.add(nLETrackSlot);
                }
                i3 = i4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        for (NLETrackSlot nLETrackSlot2 : arrayList) {
            NLESegment mainSegment = nLETrackSlot2.getMainSegment();
            C351510DqH.LIZ.getClass();
            NLEResourceNode nLEResourceNodeLJJIIJZLJL = C351510DqH.LJJIIJZLJL(nLETrackSlot2);
            if (!C351510DqH.LJJIL(nLETrackSlot2) || nLEResourceNodeLJJIIJZLJL == null) {
                if (mainSegment != null) {
                    nLEResourceNodeLJJIIJZLJL = mainSegment.getResource();
                } else {
                    nLEResourceNodeLJJIIJZLJL = null;
                }
            }
            if (nLEResourceNodeLJJIIJZLJL != null || (mainSegment != null && (nLEResourceNodeLJJIIJZLJL = mainSegment.getResource()) != null)) {
                duration = nLEResourceNodeLJJIIJZLJL.getDuration();
            } else {
                duration = 0;
            }
            if (C351220Dpo.LLJJIJIL(nLETrackSlot2)) {
                duration = 3000000;
            }
            NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) mainSegment);
            if (nLESegmentVideoDynamicCast != null) {
                nLESegmentVideoDynamicCast.setTimeClipStart(0L);
                nLESegmentVideoDynamicCast.setTimeClipEnd(duration);
                nLETrackSlot2.setEnable(true);
                nLETrackSlot2.setDuration((long) ((nLESegmentVideoDynamicCast.getTimeClipEnd() - nLESegmentVideoDynamicCast.getTimeClipStart()) / nLESegmentVideoDynamicCast.getAbsSpeed()));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x0429, code lost:
    
        r30 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILL(java.util.List r43, X.C0E48 r44, com.bytedance.ies.nle.editor_jni.NLETrackSlot r45) {
        /*
            Method dump skipped, instruction units count: 1355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C357660E0m.LJIILL(java.util.List, X.0E48, com.bytedance.ies.nle.editor_jni.NLETrackSlot):void");
    }

    public static void LJIILIIL(List list, NLETrackSlot nLETrackSlot, C0E48 c0e48, boolean z) {
        String strLIZJ = LIZJ(list, AFwS234S0000000_5.get$arr$(551));
        String strLIZJ2 = LIZJ(list, AFwS234S0000000_5.get$arr$(552));
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (((BeatInfo) obj).beatSource == 2) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        if (nLETrackSlot != null) {
            if (strLIZJ != null) {
                nLETrackSlot.setExtra("audio_stick_points", strLIZJ);
            }
            if (strLIZJ2 != null) {
                nLETrackSlot.setExtra("beats_source", strLIZJ2);
            }
            nLETrackSlot.setExtra("sound_sync_beats_count", String.valueOf(size));
            nLETrackSlot.setExtra("beats_auto_generate_enable", String.valueOf(z));
        }
        if (c0e48 != null) {
            C350870DpF.LIZJ(c0e48, C2292508yZ.LIZJ(new C0E1X(C0E1V.MUSIC_BEAT.getNameId(), null, null, null, null, 30)));
        }
    }
}
