package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.nle.editor_jni.NLECommonKeyframe;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEKeyframe;
import com.bytedance.ies.nle.editor_jni.NLEKeyframeType;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLECommonKeyframe;
import com.bytedance.ies.nle.editor_jni.VecNLEKeyframe;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.0DoR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C350370DoR extends C350680Dow implements InterfaceC351610DqR {
    public long LJ;
    public final C347220DjM LJFF;
    public final MutableLiveData<NLETimeSpaceNode> LJI;
    public final MutableLiveData<C350400DoU> LJII;
    public final MutableLiveData<C375830EoP<Boolean>> LJIIIIZZ;

    @Override // X.InterfaceC351610DqR
    public final boolean LJJLIIIJL() {
        return LJIIJ(LLJJI());
    }

    @Override // X.InterfaceC351610DqR
    public final boolean LLFF() {
        VecNLEKeyframe swingKeyframes;
        NLETrackSlot nLETrackSlotLLJJI = LLJJI();
        if (nLETrackSlotLLJJI == null || (swingKeyframes = nLETrackSlotLLJJI.getSwingKeyframes()) == null) {
            return false;
        }
        return !swingKeyframes.isEmpty();
    }

    @Override // X.InterfaceC351610DqR
    public final boolean LLILZLL() {
        NLESegmentVideo nLESegmentVideoDynamicCast;
        NLETrackSlot nLETrackSlotLLJJI = LLJJI();
        if (nLETrackSlotLLJJI == null || (nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlotLLJJI.getMainSegment())) == null) {
            return false;
        }
        return nLESegmentVideoDynamicCast.getEnableAudio();
    }

    @Override // X.InterfaceC351610DqR
    public final boolean X5() {
        VecNLETrackSlotSPtr keyframes;
        NLETrackSlot nLETrackSlotLLJJI = LLJJI();
        if (nLETrackSlotLLJJI == null || (keyframes = nLETrackSlotLLJJI.getKeyframes()) == null) {
            return false;
        }
        return !keyframes.isEmpty();
    }

    @Override // X.InterfaceC351610DqR
    public final MutableLiveData<NLETimeSpaceNode> LJJJJL() {
        return this.LJI;
    }

    @Override // X.InterfaceC351610DqR
    public final MutableLiveData<C375830EoP<Boolean>> LJJLJ() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC351610DqR
    public final long LJLIIL() {
        return this.LJ;
    }

    @Override // X.InterfaceC351610DqR
    public final /* bridge */ /* synthetic */ MutableLiveData LLJIJIL() {
        return this.LJII;
    }

    public C350370DoR(C0E48 c0e48) {
        super(c0e48);
        this.LJ = 100L;
        this.LJFF = new C347220DjM();
        this.LJI = new MutableLiveData<>();
        this.LJII = new MutableLiveData<>();
        this.LJIIIIZZ = new MutableLiveData<>(null);
    }

    @Override // X.InterfaceC351610DqR
    public final NLETrackSlot Ah(long j) {
        NLETrackSlot nLETrackSlotLLJJI;
        if (!X5() || (nLETrackSlotLLJJI = LLJJI()) == null) {
            return null;
        }
        return nLETrackSlotLLJJI.keyframeAtTime(j, this.LJ);
    }

    @Override // X.InterfaceC351610DqR
    public final boolean LJIIJ(NLETrackSlot nLETrackSlot) {
        if (nLETrackSlot == null || !C351230Dpp.LIZIZ() || NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment()) == null) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC351610DqR
    public final void LJIILIIL(long j) {
        float fLJLLLL;
        NLETrackSlot nLETrackSlotLLJJI = LLJJI();
        if (nLETrackSlotLLJJI == null || nLETrackSlotLLJJI.getKeyframes().isEmpty()) {
            return;
        }
        this.LJFF.getClass();
        Float fLIZ = C347220DjM.LIZ(j, nLETrackSlotLLJJI);
        if (fLIZ != null) {
            fLJLLLL = fLIZ.floatValue();
        } else {
            fLJLLLL = C351220Dpo.LJLLLL(nLETrackSlotLLJJI.getMainSegment());
        }
        nLETrackSlotLLJJI.setTransientExtra(NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getSlotVolume(), String.valueOf(fLJLLLL));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("time=");
        sbLIZ.append(j);
        sbLIZ.append(" updateSlotFromLocal: ");
        sbLIZ.append(C351220Dpo.LJLLLL(nLETrackSlotLLJJI.getMainSegment()));
        C355090Dw3.LIZIZ("KeyframeEditor", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC351610DqR
    public final void LJJIII(NLETrackSlot nLETrackSlot) {
        nLETrackSlot.adjustSwingKeyframeForAllType(this.LIZ.og().LJLIIL());
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00fa  */
    @Override // X.InterfaceC351610DqR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJ(com.bytedance.ies.nle.editor_jni.NLETrackSlot r11) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C350370DoR.LJJIIJ(com.bytedance.ies.nle.editor_jni.NLETrackSlot):void");
    }

    @Override // X.InterfaceC351610DqR
    public final List<NLECommonKeyframe> LJJLIIIJJIZ(long j) {
        ArrayList arrayList;
        long startTime;
        if (LLFF()) {
            List<NLEKeyframe> listLLJI = LLJI(j);
            if ((listLLJI != null && listLLJI.isEmpty()) || LLJJI() == null) {
                return C13BV.INSTANCE;
            }
            ArrayList arrayList2 = null;
            if (listLLJI != null) {
                arrayList = new ArrayList();
                Iterator<NLEKeyframe> it2 = listLLJI.iterator();
                while (it2.hasNext()) {
                    C19719612Di.LJJI(it2.next().getSortedCommonKeyframes(), arrayList);
                }
            } else {
                arrayList = null;
            }
            NLETrackSlot nLETrackSlotLLJJI = LLJJI();
            long timeOffset = 0;
            if (nLETrackSlotLLJJI != null) {
                startTime = nLETrackSlotLLJJI.getStartTime();
            } else {
                startTime = 0;
            }
            long j2 = j - startTime;
            if (arrayList != null) {
                Iterator it3 = arrayList.iterator();
                if (it3.hasNext()) {
                    Object next = it3.next();
                    if (it3.hasNext()) {
                        long jAbs = Math.abs(((NLECommonKeyframe) next).getTimeOffset() - j2);
                        do {
                            Object next2 = it3.next();
                            long jAbs2 = Math.abs(((NLECommonKeyframe) next2).getTimeOffset() - j2);
                            if (jAbs > jAbs2) {
                                next = next2;
                                jAbs = jAbs2;
                            }
                        } while (it3.hasNext());
                    }
                    NLECommonKeyframe nLECommonKeyframe = (NLECommonKeyframe) next;
                    if (nLECommonKeyframe != null) {
                        timeOffset = nLECommonKeyframe.getTimeOffset();
                    }
                    arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (((NLECommonKeyframe) obj).getTimeOffset() == timeOffset) {
                            arrayList2.add(obj);
                        }
                    }
                } else {
                    throw new NoSuchElementException();
                }
            }
            return arrayList2;
        }
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC351610DqR
    public final void LLF(long j) {
        this.LJ = j;
    }

    @Override // X.InterfaceC351610DqR
    public final void LLIILII(boolean z) {
        NLETrack nLETrackLLJJIII = LLJJIII();
        NLETrackSlot nLETrackSlotLLJJI = LLJJI();
        if (nLETrackLLJJIII != null && nLETrackSlotLLJJI != null) {
            this.LIZLLL.pause(false);
            nLETrackSlotLLJJI.addOrUpdateKeyframe(C352310DrZ.LIZLLL(this.LIZLLL.Jh()), this.LIZ.og().LJLIIL(), z);
            if (C350110Do1.LJ(LLZ())) {
                C350110Do1.LJIILIIL(LLZ(), nLETrackSlotLLJJI);
            }
            if (nLETrackSlotLLJJI.getKeyframes().size() > 0) {
                nLETrackSlotLLJJI.setExtra("is_editorpro_keyframe", "1");
            }
            if (z) {
                LJIILIIL(this.LIZLLL.Jh() * 1000);
            }
            this.LJII.setValue(new C350400DoU(z));
        }
    }

    @Override // X.InterfaceC351610DqR
    public final void LLILIL(long j) {
        NLETrackSlot nLETrackSlotLLJJI = LLJJI();
        if (nLETrackSlotLLJJI != null) {
            nLETrackSlotLLJJI.removeAllSwingKeyframesAtTime(j, this.LJ);
        }
    }

    @Override // X.InterfaceC351610DqR
    public final List<NLEKeyframe> LLJI(long j) {
        if (LLFF()) {
            NLETrackSlot nLETrackSlotLLJJI = LLJJI();
            if (nLETrackSlotLLJJI != null) {
                return nLETrackSlotLLJJI.swingKeyframesAtTime(j, this.LJ);
            }
            return null;
        }
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC351610DqR
    public final boolean yv(NLEKeyframeType nLEKeyframeType) {
        VecNLEKeyframe swingKeyframes;
        NLETrackSlot nLETrackSlotLLJJI = LLJJI();
        if (nLETrackSlotLLJJI == null || (swingKeyframes = nLETrackSlotLLJJI.getSwingKeyframes()) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (NLEKeyframe nLEKeyframe : swingKeyframes) {
            if (nLEKeyframe.getKeyframeType() == nLEKeyframeType) {
                arrayList.add(nLEKeyframe);
            }
        }
        return !arrayList.isEmpty();
    }

    @Override // X.InterfaceC351610DqR
    public final void LJJI(long j, NLETrackSlot nLETrackSlot) {
        nLETrackSlot.refreshAllSwingKeyframePropertyToSlotAtTime(j);
    }

    @Override // X.InterfaceC351610DqR
    public final void LJJIJL(NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2) {
        boolean zLLJJIJI;
        NLETrack nLETrackRn;
        C0E48 c0e48 = this.LIZ;
        if (c0e48 != null && (nLETrackRn = c0e48.Rn()) != null) {
            zLLJJIJI = C351220Dpo.LLJJIJI(nLETrackRn);
        } else {
            zLLJJIJI = false;
        }
        if (C351230Dpp.LIZLLL(Boolean.valueOf(zLLJJIJI))) {
            nLETrackSlot.adjustSwingKeyframeForAllType(this.LJ, nLETrackSlot2);
            long duration = nLETrackSlot.getDuration();
            VecNLEKeyframe swingKeyframes = nLETrackSlot.getSwingKeyframes();
            if (swingKeyframes != null) {
                for (NLEKeyframe nLEKeyframe : swingKeyframes) {
                    VecNLECommonKeyframe sortedCommonKeyframes = nLEKeyframe.getSortedCommonKeyframes();
                    if (sortedCommonKeyframes != null) {
                        for (NLECommonKeyframe nLECommonKeyframe : sortedCommonKeyframes) {
                            long timeOffset = nLECommonKeyframe.getTimeOffset();
                            if (0 > timeOffset || timeOffset > duration) {
                                nLEKeyframe.removeKeyframe(nLECommonKeyframe);
                            }
                        }
                    }
                }
                return;
            }
            return;
        }
        if (nLETrackSlot.getKeyframes().size() > 0) {
            nLETrackSlot.adjustKeyFrame(this.LJ, nLETrackSlot2);
            long duration2 = nLETrackSlot.getDuration();
            for (NLETrackSlot nLETrackSlot3 : nLETrackSlot.getKeyframes()) {
                long startTime = nLETrackSlot3.getStartTime();
                if (0 > startTime || startTime > duration2) {
                    nLETrackSlot.removeKeyframe(nLETrackSlot3);
                }
            }
        }
    }

    @Override // X.InterfaceC351610DqR
    public final void Xb(NLEKeyframeType nLEKeyframeType, boolean z) {
        NLECommonKeyframe nLECommonKeyframe;
        Long lValueOf;
        NLETrack nLETrackLLJJIII = LLJJIII();
        NLETrackSlot nLETrackSlotLLJJI = LLJJI();
        if (nLETrackLLJJIII != null && nLETrackSlotLLJJI != null) {
            this.LIZLLL.pause(false);
            ArrayList arrayList = new ArrayList();
            if (nLEKeyframeType == null) {
                arrayList.add(NLEKeyframeType.Video);
                arrayList.add(NLEKeyframeType.Alpha);
                arrayList.add(NLEKeyframeType.Volume);
            } else {
                arrayList.add(nLEKeyframeType);
            }
            long jLIZLLL = C352310DrZ.LIZLLL(this.LIZLLL.Jh());
            NLETimeSpaceNode value = this.LJI.getValue();
            if ((value instanceof NLECommonKeyframe) && value != null) {
                NLETimeSpaceNode value2 = this.LJI.getValue();
                if ((value2 instanceof NLECommonKeyframe) && (nLECommonKeyframe = (NLECommonKeyframe) value2) != null && (lValueOf = Long.valueOf(nLECommonKeyframe.getTimeOffset())) != null) {
                    jLIZLLL = nLETrackSlotLLJJI.getStartTime() + lValueOf.longValue();
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                nLETrackSlotLLJJI.addOrUpdateSwingKeyframeOfType((NLEKeyframeType) it2.next(), jLIZLLL, this.LIZ.og().LJLIIL(), z);
            }
            if (C350110Do1.LJ(LLZ())) {
                C350110Do1.LJIILIIL(LLZ(), nLETrackSlotLLJJI);
            }
            if (nLETrackSlotLLJJI.getSwingKeyframes().size() > 0) {
                nLETrackSlotLLJJI.setExtra("is_editorpro_keyframe", "1");
            }
            if (z) {
                LJIILIIL(this.LIZLLL.Jh() * 1000);
            }
            this.LJII.setValue(new C350400DoU(z));
        }
    }

    @Override // X.InterfaceC351610DqR
    public final void LJJJIL(NLEKeyframeType nLEKeyframeType, long j, NLETrackSlot nLETrackSlot) {
        nLETrackSlot.refreshSwingKeyframePropertyToSlotAtTime(nLEKeyframeType, j);
    }

    @Override // X.InterfaceC351610DqR
    public final void LLIFFJFJJ(long j, NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
        if (C351220Dpo.LLIIIJ(nLETrackSlot)) {
            nLETrackSlot.refreshAllSwingKeyframePropertyToSlotAtTime(j);
        }
        if (C351220Dpo.LLF(nLETrackSlot)) {
            this.LIZ.getPlayer().LJIIJJI(j, nLETrack, nLETrackSlot);
        }
    }
}
