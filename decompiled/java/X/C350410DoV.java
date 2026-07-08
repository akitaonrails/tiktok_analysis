package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEMask;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.VecNLEMaskSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEVideoEffectSPtr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DoV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C350410DoV {
    public static final void LIZ(NLEEditor nLEEditor, boolean z, boolean z2) {
        LIZLLL(nLEEditor, z, null, false, z2);
    }

    public static void LIZJ(NLEEditor nLEEditor, String str, boolean z, int i) {
        boolean z2;
        if ((i & 1) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        LIZLLL(nLEEditor, z2, C051R.LIZIZ(new C0E1X(str, null, null, null, null, 30)), z, true);
    }

    public static final void LIZLLL(NLEEditor nLEEditor, boolean z, String str, boolean z2, boolean z3) {
        NLEModel model;
        VecNLETrackSlotSPtr sortedSlots;
        NLEModel model2;
        boolean zLLJJIJI;
        boolean zLLJJIJI2;
        int i;
        if (nLEEditor != null && (model2 = nLEEditor.getModel()) != null) {
            VecNLETrackSPtr tracks = model2.getTracks();
            ArrayList<NLETrack> arrayList = new ArrayList();
            for (NLETrack nLETrack : tracks) {
                NLETrack nLETrack2 = nLETrack;
                if (!Intrinsics.LJFF(nLETrack2.getExtra("follow_max"), "FALSE") && nLETrack2.getEnable() && !Intrinsics.LJFF(nLETrack2.getExtra("AudioTrackType"), "TEXT_SPEAK")) {
                    arrayList.add(nLETrack);
                }
            }
            long maxEnd = 0;
            for (NLETrack nLETrack3 : arrayList) {
                if (nLETrack3.getMaxEnd() > maxEnd) {
                    maxEnd = nLETrack3.getMaxEnd();
                }
            }
            VecNLETrackSPtr tracks2 = model2.getTracks();
            ArrayList<NLETrack> arrayList2 = new ArrayList();
            for (NLETrack nLETrack4 : tracks2) {
                if (Intrinsics.LJFF(nLETrack4.getExtra("AudioTrackType"), "TEXT_SPEAK")) {
                    arrayList2.add(nLETrack4);
                }
            }
            for (NLETrack nLETrack5 : arrayList2) {
                NLETrackSlot nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(0, nLETrack5.getSlots());
                if (nLETrackSlot != null && ((int) nLETrackSlot.getEndTime()) != -2 && nLETrackSlot.getEndTime() > maxEnd) {
                    if (nLETrackSlot.getStartTime() > maxEnd) {
                        nLETrack5.removeSlot(nLETrackSlot);
                    } else {
                        long endTime = (long) ((nLETrackSlot.getEndTime() - maxEnd) * C351220Dpo.LJLILLLLZI(nLETrackSlot.getMainSegment()));
                        nLETrackSlot.setEndTime(maxEnd);
                        NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
                        if (nLESegmentAudioDynamicCast != null) {
                            nLESegmentAudioDynamicCast.setTimeClipEnd(nLESegmentAudioDynamicCast.getTimeClipEnd() - endTime);
                            if (nLESegmentAudioDynamicCast.getTimeClipEnd() - nLESegmentAudioDynamicCast.getTimeClipStart() < 100000) {
                                nLETrack5.removeSlot(nLETrackSlot);
                            }
                        }
                    }
                }
            }
            Iterator<NLETrack> it2 = model2.getTracks().iterator();
            while (it2.hasNext()) {
                VecNLETrackSlotSPtr slots = it2.next().getSlots();
                ArrayList arrayList3 = new ArrayList();
                for (NLETrackSlot nLETrackSlot2 : slots) {
                    if (nLETrackSlot2.getKeyframes().size() > 0) {
                        arrayList3.add(nLETrackSlot2);
                    }
                }
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    for (NLETrackSlot nLETrackSlot3 : ((NLETrackSlot) it3.next()).getKeyframes()) {
                        if (nLETrackSlot3.getScale() == 1.0f) {
                            nLETrackSlot3.setScale(1.0f);
                        }
                        if (Intrinsics.LIZLLL(C351220Dpo.LJIILIIL(nLETrackSlot3), 1.0f)) {
                            C351220Dpo.LLLLLILLIL(nLETrackSlot3, 1.0f);
                        }
                        if (nLETrackSlot3.getTransformX() == 0.0f) {
                            nLETrackSlot3.setTransformX(0.0f);
                        }
                        if (nLETrackSlot3.getTransformY() == 0.0f) {
                            nLETrackSlot3.setTransformY(0.0f);
                        }
                        if (nLETrackSlot3.getRotation() == 0.0f) {
                            nLETrackSlot3.setRotation(0.0f);
                        }
                    }
                }
            }
            NLETrack mainTrack = model2.getMainTrack();
            if (mainTrack != null) {
                zLLJJIJI = C351220Dpo.LLJJIJI(mainTrack);
            } else {
                zLLJJIJI = false;
            }
            if (C351230Dpp.LIZLLL(Boolean.valueOf(zLLJJIJI))) {
                VecNLETrackSPtr tracks3 = model2.getTracks();
                ArrayList arrayList4 = new ArrayList();
                for (NLETrack nLETrack6 : tracks3) {
                    if (nLETrack6.getEnable()) {
                        arrayList4.add(nLETrack6);
                    }
                }
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    VecNLETrackSlotSPtr slots2 = ((NLETrack) it4.next()).getSlots();
                    ArrayList<NLETrackSlot> arrayList5 = new ArrayList();
                    for (NLETrackSlot nLETrackSlot4 : slots2) {
                        if (nLETrackSlot4.getKeyframes().size() > 0) {
                            arrayList5.add(nLETrackSlot4);
                        }
                    }
                    for (NLETrackSlot nLETrackSlot5 : arrayList5) {
                        nLETrackSlot5.convertSlotKeyframe2SwingKeyframe();
                        nLETrackSlot5.clearKeyframe();
                    }
                }
            }
            NLETrack mainTrack2 = model2.getMainTrack();
            if (mainTrack2 != null) {
                zLLJJIJI2 = C351220Dpo.LLJJIJI(mainTrack2);
            } else {
                zLLJJIJI2 = false;
            }
            if (C351230Dpp.LIZJ(Boolean.valueOf(zLLJJIJI2))) {
                VecNLETrackSPtr tracks4 = model2.getTracks();
                ArrayList arrayList6 = new ArrayList();
                for (NLETrack nLETrack7 : tracks4) {
                    NLETrack nLETrack8 = nLETrack7;
                    if (nLETrack8.getEnable() && NLETrackType.VIDEO == nLETrack8.getTrackType()) {
                        arrayList6.add(nLETrack7);
                    }
                }
                ArrayList arrayList7 = new ArrayList();
                Iterator it5 = arrayList6.iterator();
                while (it5.hasNext()) {
                    C19719612Di.LJJI(((NLETrack) it5.next()).getSlots(), arrayList7);
                }
                ArrayList<NLETrackSlot> arrayList8 = new ArrayList();
                for (Object obj : arrayList7) {
                    VecNLEMaskSPtr masks = ((NLETrackSlot) obj).getMasks();
                    if (masks != null && !masks.isEmpty()) {
                        arrayList8.add(obj);
                    }
                }
                for (NLETrackSlot nLETrackSlot6 : arrayList8) {
                    VecNLEVideoEffectSPtr videoEffects = nLETrackSlot6.getVideoEffects();
                    if (videoEffects != null && !videoEffects.isEmpty()) {
                        Iterator<NLEVideoEffect> it6 = nLETrackSlot6.getVideoEffects().iterator();
                        if (it6.hasNext()) {
                            int layer = it6.next().getLayer();
                            while (it6.hasNext()) {
                                int layer2 = it6.next().getLayer();
                                if (layer < layer2) {
                                    layer = layer2;
                                }
                            }
                            i = layer + 1;
                        } else {
                            throw new NoSuchElementException();
                        }
                    } else {
                        i = 1;
                    }
                    Iterator<NLEMask> it7 = nLETrackSlot6.getMasks().iterator();
                    while (it7.hasNext()) {
                        it7.next().setLayer(i + 10000);
                    }
                }
            }
        }
        if (!z2 && nLEEditor != null) {
            nLEEditor.commit();
        }
        if (z) {
            if (nLEEditor != null && (model = nLEEditor.getModel()) != null) {
                VecNLETrackSPtr sortedTracks = model.getSortedTracks();
                ArrayList arrayList9 = new ArrayList();
                for (NLETrack nLETrack9 : sortedTracks) {
                    NLETrack nLETrack10 = nLETrack9;
                    if (nLETrack10.getTrackType() == NLETrackType.VIDEO && !nLETrack10.getMainTrack()) {
                        arrayList9.add(nLETrack9);
                    }
                }
                ArrayList<NLETrackSlot> arrayList10 = new ArrayList();
                Iterator it8 = arrayList9.iterator();
                while (it8.hasNext()) {
                    C19719612Di.LJJI(((NLETrack) it8.next()).getSortedSlots(), arrayList10);
                }
                NLETrack mainTrack3 = model.getMainTrack();
                if (mainTrack3 != null && (sortedSlots = mainTrack3.getSortedSlots()) != null) {
                    for (NLETrackSlot nLETrackSlot7 : sortedSlots) {
                        if (nLETrackSlot7 != null && C351220Dpo.LLIIJI(nLETrackSlot7)) {
                            NLETrack mainTrack4 = model.getMainTrack();
                            C351510DqH.LIZ.getClass();
                            C350690Dox.LIZIZ(nLETrackSlot7, C351510DqH.LJJIJ(mainTrack4, nLETrackSlot7), C351510DqH.LJJIIZI(nLETrackSlot7));
                        }
                    }
                }
                for (NLETrackSlot nLETrackSlot8 : arrayList10) {
                    if (nLETrackSlot8 != null && C351220Dpo.LLIIJI(nLETrackSlot8)) {
                        C351510DqH.LIZ.getClass();
                        C350690Dox.LIZIZ(nLETrackSlot8, C351510DqH.LJJIJ(null, nLETrackSlot8), C351510DqH.LJJIIZI(nLETrackSlot8));
                    }
                }
            }
            if (z3) {
                Iterator it9 = ((ArrayList) C350440DoY.LIZ).iterator();
                while (it9.hasNext()) {
                    ((InterfaceC350420DoW) it9.next()).LIZLLL();
                }
                InterfaceC350420DoW interfaceC350420DoW = C350440DoY.LIZIZ;
                if (interfaceC350420DoW != null) {
                    interfaceC350420DoW.LIZLLL();
                }
            }
            if (str == null) {
                if (nLEEditor != null) {
                    nLEEditor.done();
                    nLEEditor.trim(500L, 500L);
                }
            } else if (nLEEditor != null) {
                nLEEditor.done(str);
                nLEEditor.trim(500L, 500L);
            }
            if (z3) {
                Iterator it10 = ((ArrayList) C350440DoY.LIZ).iterator();
                while (it10.hasNext()) {
                    ((InterfaceC350420DoW) it10.next()).LIZ();
                }
                InterfaceC350420DoW interfaceC350420DoW2 = C350440DoY.LIZIZ;
                if (interfaceC350420DoW2 != null) {
                    interfaceC350420DoW2.LIZ();
                }
            }
        }
    }
}
