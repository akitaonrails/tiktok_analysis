package X;

import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudioFadeFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudioSamiFilter;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DoN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C350330DoN extends C350680Dow implements InterfaceC354910Dvl {
    @Override // X.InterfaceC354910Dvl
    public final boolean LJLIIIL() {
        NLESegmentAudio nLESegmentAudioDynamicCast;
        NLETrackSlot nLETrackSlotLLJJI = LLJJI();
        if (nLETrackSlotLLJJI == null || (nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlotLLJJI.getMainSegment())) == null) {
            return false;
        }
        return nLESegmentAudioDynamicCast.getKeepTone();
    }

    @Override // X.InterfaceC354910Dvl
    public final float LLIILZL() {
        NLESegmentAudio nLESegmentAudioDynamicCast;
        NLETrackSlot nLETrackSlotLLJJI = LLJJI();
        if (nLETrackSlotLLJJI == null || (nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlotLLJJI.getMainSegment())) == null) {
            return 1.0f;
        }
        return nLESegmentAudioDynamicCast.getAbsSpeed();
    }

    public C350330DoN(C0E48 c0e48) {
        super(c0e48);
    }

    @Override // X.InterfaceC354910Dvl
    public final Pair<Long, Long> LJJIJ(NLETrackSlot nLETrackSlot) {
        NLEFilter filterByName = nLETrackSlot.getFilterByName(NLEEditorJniJNI.NLEFilterName_getAUDIO_FADE_FILTER());
        if (filterByName == null) {
            return new Pair<>(0L, 0L);
        }
        NLESegmentAudioFadeFilter nLESegmentAudioFadeFilterDynamicCast = NLESegmentAudioFadeFilter.dynamicCast((NLENode) filterByName.getSegment());
        if (nLESegmentAudioFadeFilterDynamicCast == null) {
            return new Pair<>(0L, 0L);
        }
        return new Pair<>(Long.valueOf(nLESegmentAudioFadeFilterDynamicCast.getFadeInLength()), Long.valueOf(nLESegmentAudioFadeFilterDynamicCast.getFadeOutLength()));
    }

    @Override // X.InterfaceC354910Dvl
    public final void LJJIL(long j) {
        NLETrackSlot nLETrackSlotLLJJI = LLJJI();
        if (nLETrackSlotLLJJI != null) {
            long j2 = 30000;
            long measuredStartTime = 0;
            if (nLETrackSlotLLJJI.getMeasuredStartTime() - j2 > 0) {
                measuredStartTime = nLETrackSlotLLJJI.getMeasuredStartTime() - j2;
            }
            this.LIZLLL.LJJIIZI(measuredStartTime, nLETrackSlotLLJJI.getMeasuredEndTime(), false, true);
        }
    }

    @Override // X.InterfaceC354910Dvl
    public final void LJLJJL(long j) {
        NLETrackSlot nLETrackSlotLLJJI = LLJJI();
        if (nLETrackSlotLLJJI != null) {
            long j2 = 30000;
            long measuredEndTime = 0;
            if ((nLETrackSlotLLJJI.getMeasuredEndTime() - j) - j2 > 0) {
                measuredEndTime = (nLETrackSlotLLJJI.getMeasuredEndTime() - j) - j2;
            }
            this.LIZLLL.LJJIIZI(measuredEndTime, nLETrackSlotLLJJI.getMeasuredEndTime() + j2, false, true);
        }
    }

    @Override // X.InterfaceC354910Dvl
    public final NLETrackSlot LJLJJLL(C350340DoO c350340DoO) {
        NLEResType nLEResType;
        C20137613qo c20137613qo = C20137613qo.LIZ;
        C350360DoQ c350360DoQLIZIZ = C20137613qo.LIZIZ(c350340DoO.LIZIZ);
        if (c350360DoQLIZIZ == null && !c350340DoO.LJIILLIIL) {
            C355090Dw3.LJFF("Invalid audio file path");
            return null;
        }
        Number numberValueOf = c350340DoO.LJIIL;
        if (numberValueOf == null && (c350360DoQLIZIZ == null || (numberValueOf = Integer.valueOf(c350360DoQLIZIZ.LIZ)) == null)) {
            numberValueOf = 0;
        }
        NLETrackSlot nLETrackSlot = new NLETrackSlot();
        NLESegmentAudio nLESegmentAudio = new NLESegmentAudio();
        NLEResourceAV nLEResourceAV = new NLEResourceAV();
        nLEResourceAV.setResourceName(c350340DoO.LIZ);
        if (c350340DoO.LJI) {
            C351510DqH c351510DqH = C351510DqH.LIZ;
            NLEModel nLEModelLJI = C350870DpF.LJI(this.LIZ);
            c351510DqH.getClass();
            nLETrackSlot.setExtra("ep_slot_add_order", String.valueOf(C351510DqH.LJIL(nLEModelLJI) + 1));
            nLEResType = NLEResType.RECORD;
        } else if (c350340DoO.LJII) {
            nLEResType = NLEResType.SOUND;
        } else {
            nLEResType = NLEResType.AUDIO;
        }
        nLEResourceAV.setResourceType(nLEResType);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        nLEResourceAV.setDuration(timeUnit.toMicros(numberValueOf.longValue()));
        nLEResourceAV.setResourceFile(c350340DoO.LIZIZ);
        nLESegmentAudio.setAVFile(nLEResourceAV);
        Float f = c350340DoO.LJIJI;
        if (f != null) {
            nLESegmentAudio.setVolume(f.floatValue());
        } else {
            C351220Dpo.LLLLLJLJLL(nLESegmentAudio);
        }
        nLESegmentAudio.setTimeClipStart(c350340DoO.LJIIIIZZ);
        long micros = c350340DoO.LJIIIZ;
        if (micros == 0) {
            micros = timeUnit.toMicros(numberValueOf.longValue());
        }
        nLESegmentAudio.setTimeClipEnd(micros);
        nLESegmentAudio.setKeepTone(false);
        nLESegmentAudio.setBalancedGain(c350340DoO.LJIILL);
        nLETrackSlot.setMainSegment(nLESegmentAudio);
        nLETrackSlot.setStartTime(c350340DoO.LIZLLL);
        long j = c350340DoO.LJ;
        if (j != 0) {
            nLETrackSlot.setEndTime(j);
        } else if (c350340DoO.LJIIIZ - c350340DoO.LJIIIIZZ > timeUnit.toMicros(numberValueOf.longValue())) {
            nLETrackSlot.setEndTime(c350340DoO.LIZLLL + timeUnit.toMicros(numberValueOf.longValue()));
        }
        if (!((Boolean) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_SUBTRACK_OVER_MAIN, Boolean.TRUE)).booleanValue() || c350340DoO.LJIIJJI) {
            long maxTargetEnd = LLZ().getMaxTargetEnd();
            long endTime = nLETrackSlot.getEndTime();
            long j2 = endTime - maxTargetEnd;
            if (endTime > maxTargetEnd) {
                nLETrackSlot.setEndTime(maxTargetEnd);
                NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
                if (nLESegmentAudioDynamicCast != null) {
                    nLESegmentAudioDynamicCast.setTimeClipEnd(nLESegmentAudioDynamicCast.getTimeClipEnd() - j2);
                }
            }
        }
        String str = c350340DoO.LIZJ;
        if (str != null) {
            nLETrackSlot.setExtra("ep_audio_music_id", str);
        }
        if (c350340DoO.LJI) {
            nLETrackSlot.setExtra("volume_enhance_rate", String.valueOf(c350340DoO.LJIILJJIL));
            nLETrackSlot.setExtra("volume_before_enhance", String.valueOf(C351220Dpo.LJLLLL(nLETrackSlot.getMainSegment())));
            NLESegmentAudio nLESegmentAudioDynamicCast2 = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
            if (nLESegmentAudioDynamicCast2 != null) {
                nLESegmentAudioDynamicCast2.setVolume(nLESegmentAudioDynamicCast2.getVolume() * c350340DoO.LJIILJJIL);
            }
        }
        return nLETrackSlot;
    }

    @Override // X.InterfaceC354910Dvl
    public final void LJZ(NLETrack nLETrack) {
        long measuredEndTime = nLETrack.getMeasuredEndTime();
        long j = 0;
        for (NLETrackSlot nLETrackSlot : nLETrack.getSortedSlots()) {
            long jMin = Math.min(measuredEndTime, nLETrackSlot.getDuration() + j);
            nLETrackSlot.setStartTime(j);
            nLETrackSlot.setEndTime(jMin);
            j = jMin;
        }
    }

    @Override // X.InterfaceC354910Dvl
    public final void LJJJJZ(NLETrackSlot nLETrackSlot, EnumC356070Dxd enumC356070Dxd) {
        NLEFilter nLEFilterLJJLL = C351220Dpo.LJJLL(nLETrackSlot);
        if (nLEFilterLJJLL != null) {
            nLETrackSlot.removeFilter(nLEFilterLJJLL);
            EnumC356070Dxd enumC356070Dxd2 = EnumC356070Dxd.DONE;
            if (enumC356070Dxd2 == enumC356070Dxd) {
                LLJJ(C051R.LIZIZ(new C0E1X(C0E1V.REDUCE_NOISE.getNameId(), null, null, null, null, 30)), enumC356070Dxd2);
            } else {
                LLJJ(null, enumC356070Dxd);
            }
        }
    }

    @Override // X.InterfaceC354910Dvl
    public final Pair<NLETrack, NLETrackSlot> LJJLIIIJLJLI(NLETrackSlot nLETrackSlot, EnumC356070Dxd enumC356070Dxd) {
        NLETrack trackBySlot;
        NLETrackType nLETrackTypeLJIIIIZZ;
        VecNLETrackSlotSPtr slots;
        if (nLETrackSlot == null) {
            nLETrackSlot = LLJJI();
            trackBySlot = LLJJIII();
        } else {
            trackBySlot = C350870DpF.LJI(this.LIZ).getTrackBySlot(nLETrackSlot);
        }
        if (trackBySlot != null) {
            nLETrackTypeLJIIIIZZ = C350870DpF.LJIIIIZZ(trackBySlot);
        } else {
            nLETrackTypeLJIIIIZZ = null;
        }
        if (nLETrackTypeLJIIIIZZ != NLETrackType.AUDIO) {
            C355090Dw3.LJFF("selectedNleTrack is not audio track");
            return new Pair<>(null, null);
        }
        if (trackBySlot != null) {
            trackBySlot.removeSlot(nLETrackSlot);
            if (Intrinsics.LJFF(trackBySlot.getExtra("AudioTrackType"), "BGM")) {
                trackBySlot.setExtra("AudioTrackType", "EDITOR_MUSIC");
            }
            if (!LLZ().hasExtra("model_extra_is_audio_deleted")) {
                LLZ().setExtra("model_extra_is_audio_deleted", "true");
            }
            if (C351220Dpo.LLLFF(trackBySlot) && (slots = trackBySlot.getSlots()) != null && slots.size() > 1) {
                trackBySlot.setExtra("is_ep_multi_music", "true");
            }
            LLJJ(null, enumC356070Dxd);
            return new Pair<>(trackBySlot, nLETrackSlot);
        }
        return new Pair<>(null, null);
    }

    @Override // X.InterfaceC354910Dvl
    public final NLETrackSlot LLILLIZIL(C350340DoO c350340DoO, EnumC356070Dxd enumC356070Dxd) {
        C20137613qo c20137613qo = C20137613qo.LIZ;
        String strLIZIZ = null;
        if (C20137613qo.LIZIZ(c350340DoO.LIZIZ) == null && !c350340DoO.LJIILLIIL) {
            C355090Dw3.LJFF("Invalid audio file path");
            return null;
        }
        NLETrack nLETrack = new NLETrack();
        nLETrack.setMainTrack(false);
        nLETrack.setLayer(c350340DoO.LJIIJ);
        nLETrack.setExtra("track_type", "audio");
        nLETrack.setExtraTrackType(NLETrackType.AUDIO);
        nLETrack.setExtra("music_name", c350340DoO.LIZ);
        NLETrackSlot nLETrackSlotLJLJJLL = LJLJJLL(c350340DoO);
        if (nLETrackSlotLJLJJLL == null) {
            return null;
        }
        if (c350340DoO.LJIIZILJ) {
            LLIIIILZ(nLETrackSlotLJLJJLL, EnumC356070Dxd.NONE, c350340DoO.LJIJ);
        }
        nLETrack.addSlot(nLETrackSlotLJLJJLL);
        List<NLETrack> listLJIJJ = C351220Dpo.LJIJJ(LLZ());
        ArrayList<NLETimeSpaceNode> arrayList = new ArrayList();
        for (Object obj : (ArrayList) listLJIJJ) {
            if (((NLETimeSpaceNode) obj).getLayer() >= c350340DoO.LJIIJ) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            for (NLETimeSpaceNode nLETimeSpaceNode : arrayList) {
                nLETimeSpaceNode.setLayer(nLETimeSpaceNode.getLayer() + 1);
            }
        }
        String str = c350340DoO.LJIILIIL;
        if (str != null) {
            nLETrack.setExtra("AudioTrackType", str);
        }
        LLZ().addTrack(nLETrack);
        this.LIZ.Rn().timeSort();
        if (Intrinsics.LJFF(c350340DoO.LJIILIIL, "AUDIO_RECORD")) {
            strLIZIZ = C051R.LIZIZ(new C0E1X(C0E1V.ADD_RECORDED_AUDIO.getNameId(), null, null, null, null, 30));
        }
        LLJJ(strLIZIZ, enumC356070Dxd);
        return nLETrackSlotLJLJJLL;
    }

    @Override // X.InterfaceC354910Dvl
    public final Pair<Long, Long> LJLI(NLETrackSlot nLETrackSlot, EnumC356070Dxd enumC356070Dxd, String str) {
        String strLIZIZ;
        NLETrackSlot nLETrackSlotLLJJI = nLETrackSlot;
        if (nLETrackSlotLLJJI == null) {
            nLETrackSlotLLJJI = LLJJI();
        }
        if (nLETrackSlotLLJJI != null) {
            String strNLEFilterName_getAUDIO_FADE_FILTER = NLEEditorJniJNI.NLEFilterName_getAUDIO_FADE_FILTER();
            NLEFilter filterByName = nLETrackSlotLLJJI.getFilterByName(strNLEFilterName_getAUDIO_FADE_FILTER);
            Pair pair = new Pair(0L, 0L);
            long jLongValue = ((Number) pair.getFirst()).longValue();
            long jLongValue2 = ((Number) pair.getSecond()).longValue();
            if (filterByName != null) {
                NLESegmentAudioFadeFilter nLESegmentAudioFadeFilterDynamicCast = NLESegmentAudioFadeFilter.dynamicCast((NLENode) filterByName.getSegment());
                if (nLESegmentAudioFadeFilterDynamicCast != null) {
                    jLongValue = nLESegmentAudioFadeFilterDynamicCast.getFadeInLength();
                    jLongValue2 = nLESegmentAudioFadeFilterDynamicCast.getFadeOutLength();
                }
                NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlotLLJJI.getMainSegment());
                if (nLESegmentAudioDynamicCast != null) {
                    nLESegmentAudioDynamicCast.setFadeInLength(0L);
                    nLESegmentAudioDynamicCast.setFadeOutLength(0L);
                }
                nLETrackSlotLLJJI.removeFilterByName(strNLEFilterName_getAUDIO_FADE_FILTER);
            }
            if (str != null && (strLIZIZ = C051R.LIZIZ(new C0E1X(str, null, null, null, null, 30))) != null) {
                LLJJ(strLIZIZ, enumC356070Dxd);
            } else {
                LLJJ(null, enumC356070Dxd);
            }
            return new Pair<>(Long.valueOf(jLongValue), Long.valueOf(jLongValue2));
        }
        return new Pair<>(0L, 0L);
    }

    @Override // X.InterfaceC354910Dvl
    public final void LLIIIILZ(NLETrackSlot nLETrackSlot, EnumC356070Dxd enumC356070Dxd, String str) {
        if (C351220Dpo.LJJLL(nLETrackSlot) == null) {
            NLESegmentAudioSamiFilter nLESegmentAudioSamiFilter = new NLESegmentAudioSamiFilter();
            nLESegmentAudioSamiFilter.setFilterName(NLEEditorJniJNI.NLEFilterName_getAUDIO_SAMI_FILTER());
            nLESegmentAudioSamiFilter.setSamiType(NLEEditorJniJNI.NLESegmentAudioSamiFilter_TYPE_DENOISE_V3_get());
            NLEResourceNode nLEResourceNode = new NLEResourceNode();
            nLEResourceNode.setResourceType(NLEResType.FILTER);
            nLEResourceNode.setResourceFile(str);
            nLESegmentAudioSamiFilter.setEffectSDKFilter(nLEResourceNode);
            NLEFilter nLEFilter = new NLEFilter();
            nLEFilter.setSegment(nLESegmentAudioSamiFilter);
            nLEFilter.setName(NLEEditorJniJNI.NLEFilterName_getAUDIO_SAMI_FILTER());
            nLETrackSlot.addFilter(nLEFilter);
            EnumC356070Dxd enumC356070Dxd2 = EnumC356070Dxd.DONE;
            if (enumC356070Dxd2 == enumC356070Dxd) {
                LLJJ(C051R.LIZIZ(new C0E1X(C0E1V.REDUCE_NOISE.getNameId(), null, null, null, null, 30)), enumC356070Dxd2);
            } else {
                LLJJ(null, enumC356070Dxd);
            }
        }
    }

    @Override // X.InterfaceC354910Dvl
    public final NLETrackSlot LLILLL(C350340DoO c350340DoO, NLETrack nLETrack, EnumC356070Dxd enumC356070Dxd) {
        NLETrackSlot nLETrackSlotLJLJJLL = LJLJJLL(c350340DoO);
        nLETrack.addSlot(nLETrackSlotLJLJJLL);
        LLJJ(null, enumC356070Dxd);
        return nLETrackSlotLJLJJLL;
    }

    @Override // X.InterfaceC354910Dvl
    public final void LJIIZILJ(C350350DoP c350350DoP, NLETrackSlot nLETrackSlot, EnumC356070Dxd enumC356070Dxd, String str) {
        long fadeInLength;
        long fadeOutLength;
        long fadeInLength2;
        long fadeOutLength2;
        String strLIZIZ;
        long fadeInLength3;
        long fadeOutLength3;
        long fadeInLength4;
        long fadeOutLength4;
        if (nLETrackSlot != null || (nLETrackSlot = LLJJI()) != null) {
            NLEFilter filterByName = nLETrackSlot.getFilterByName(NLEEditorJniJNI.NLEFilterName_getAUDIO_FADE_FILTER());
            if (filterByName == null) {
                NLEFilter nLEFilter = new NLEFilter();
                NLESegmentAudioFadeFilter nLESegmentAudioFadeFilter = new NLESegmentAudioFadeFilter();
                Long l = c350350DoP.LIZ;
                if (l != null) {
                    fadeInLength3 = l.longValue();
                } else {
                    fadeInLength3 = nLESegmentAudioFadeFilter.getFadeInLength();
                }
                nLESegmentAudioFadeFilter.setFadeInLength(fadeInLength3);
                Long l2 = c350350DoP.LIZIZ;
                if (l2 != null) {
                    fadeOutLength3 = l2.longValue();
                } else {
                    fadeOutLength3 = nLESegmentAudioFadeFilter.getFadeOutLength();
                }
                nLESegmentAudioFadeFilter.setFadeOutLength(fadeOutLength3);
                nLESegmentAudioFadeFilter.setFadeType(c350350DoP.LIZJ);
                nLESegmentAudioFadeFilter.setFilterName(NLEEditorJniJNI.NLEFilterName_getAUDIO_FADE_FILTER());
                NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
                if (nLESegmentAudioDynamicCast != null) {
                    Long l3 = c350350DoP.LIZ;
                    if (l3 != null) {
                        fadeInLength4 = l3.longValue();
                    } else {
                        fadeInLength4 = nLESegmentAudioDynamicCast.getFadeInLength();
                    }
                    nLESegmentAudioDynamicCast.setFadeInLength(fadeInLength4);
                    Long l4 = c350350DoP.LIZIZ;
                    if (l4 != null) {
                        fadeOutLength4 = l4.longValue();
                    } else {
                        fadeOutLength4 = nLESegmentAudioDynamicCast.getFadeOutLength();
                    }
                    nLESegmentAudioDynamicCast.setFadeOutLength(fadeOutLength4);
                }
                nLEFilter.setSegment(nLESegmentAudioFadeFilter);
                nLETrackSlot.addFilter(nLEFilter);
            } else {
                NLESegmentAudioFadeFilter nLESegmentAudioFadeFilterDynamicCast = NLESegmentAudioFadeFilter.dynamicCast((NLENode) filterByName.getSegment());
                if (nLESegmentAudioFadeFilterDynamicCast != null) {
                    Long l5 = c350350DoP.LIZ;
                    if (l5 != null) {
                        fadeInLength2 = l5.longValue();
                    } else {
                        fadeInLength2 = nLESegmentAudioFadeFilterDynamicCast.getFadeInLength();
                    }
                    nLESegmentAudioFadeFilterDynamicCast.setFadeInLength(fadeInLength2);
                    Long l6 = c350350DoP.LIZIZ;
                    if (l6 != null) {
                        fadeOutLength2 = l6.longValue();
                    } else {
                        fadeOutLength2 = nLESegmentAudioFadeFilterDynamicCast.getFadeOutLength();
                    }
                    nLESegmentAudioFadeFilterDynamicCast.setFadeOutLength(fadeOutLength2);
                    nLESegmentAudioFadeFilterDynamicCast.setFadeType(c350350DoP.LIZJ);
                }
                NLESegmentAudio nLESegmentAudioDynamicCast2 = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
                if (nLESegmentAudioDynamicCast2 != null) {
                    Long l7 = c350350DoP.LIZ;
                    if (l7 != null) {
                        fadeInLength = l7.longValue();
                    } else {
                        fadeInLength = nLESegmentAudioDynamicCast2.getFadeInLength();
                    }
                    nLESegmentAudioDynamicCast2.setFadeInLength(fadeInLength);
                    Long l8 = c350350DoP.LIZIZ;
                    if (l8 != null) {
                        fadeOutLength = l8.longValue();
                    } else {
                        fadeOutLength = nLESegmentAudioDynamicCast2.getFadeOutLength();
                    }
                    nLESegmentAudioDynamicCast2.setFadeOutLength(fadeOutLength);
                }
            }
            if (str != null && (strLIZIZ = C051R.LIZIZ(new C0E1X(str, null, null, null, null, 30))) != null) {
                LLJJ(strLIZIZ, enumC356070Dxd);
            } else {
                LLJJ(null, enumC356070Dxd);
            }
        }
    }

    @Override // X.InterfaceC354910Dvl
    public final void LLII(long j, NLETrack nLETrack, long j2, NLETrackSlot nLETrackSlot) {
        NLESegmentAudio nLESegmentAudioDynamicCast;
        int slotIndex = nLETrack.getSlotIndex(nLETrackSlot);
        if (slotIndex >= 0 && slotIndex < nLETrack.getSlots().size()) {
            VecNLETrackSlotSPtr sortedSlots = nLETrack.getSortedSlots();
            if (slotIndex != nLETrack.getSlots().size() - 1) {
                j2 = sortedSlots.get(slotIndex + 1).getStartTime();
            }
            if (nLETrackSlot.getEndTime() >= j2 || (nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment())) == null) {
                return;
            }
            long jMax = Math.max(Math.min((j - nLESegmentAudioDynamicCast.getTimeClipStart()) - nLETrackSlot.getDuration(), j2 - nLETrackSlot.getEndTime()), 0L);
            nLETrackSlot.setEndTime(nLETrackSlot.getEndTime() + jMax);
            nLESegmentAudioDynamicCast.setTimeClipEnd(nLESegmentAudioDynamicCast.getTimeClipEnd() + jMax);
        }
    }

    @Override // X.InterfaceC354910Dvl
    public final NLETrackSlot LJJJJJL(NLETrackSlot nLETrackSlot, C350340DoO c350340DoO, int i, boolean z, EnumC356070Dxd enumC356070Dxd) {
        NLETrack trackBySlot;
        NLETrackSlot nLETrackSlotLLJJI = nLETrackSlot;
        if (nLETrackSlotLLJJI == null) {
            nLETrackSlotLLJJI = LLJJI();
            trackBySlot = LLJJIII();
        } else {
            trackBySlot = C350870DpF.LJI(this.LIZ).getTrackBySlot(nLETrackSlotLLJJI);
        }
        if (trackBySlot == null || nLETrackSlotLLJJI == null) {
            return null;
        }
        C20137613qo c20137613qo = C20137613qo.LIZ;
        C350360DoQ c350360DoQLIZIZ = C20137613qo.LIZIZ(c350340DoO.LIZIZ);
        if (c350360DoQLIZIZ == null) {
            C355090Dw3.LJFF("Invalid audio file path");
            return null;
        }
        VecNLETrackSlotSPtr sortedSlots = trackBySlot.getSortedSlots();
        int i2 = c350360DoQLIZIZ.LIZ;
        int slotIndex = trackBySlot.getSlotIndex(nLETrackSlotLLJJI);
        if (sortedSlots.isEmpty() || slotIndex < 0 || slotIndex >= sortedSlots.size()) {
            return null;
        }
        NLETrackSlot nLETrackSlot2 = new NLETrackSlot();
        NLESegmentAudio nLESegmentAudio = new NLESegmentAudio();
        NLEResourceAV nLEResourceAV = new NLEResourceAV();
        nLEResourceAV.setResourceName(c350340DoO.LIZ);
        nLEResourceAV.setResourceType(NLEResType.AUDIO);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j = i2;
        nLEResourceAV.setDuration(timeUnit.toMicros(j));
        nLEResourceAV.setResourceFile(c350340DoO.LIZIZ);
        nLESegmentAudio.setAVFile(nLEResourceAV);
        C351220Dpo.LLLLLJLJLL(nLESegmentAudio);
        nLESegmentAudio.setTimeClipStart(c350340DoO.LJIIIIZZ);
        long micros = c350340DoO.LJIIIZ;
        if (micros == 0) {
            micros = timeUnit.toMicros(j);
        }
        nLESegmentAudio.setTimeClipEnd(micros);
        nLESegmentAudio.setKeepTone(false);
        nLESegmentAudio.setBalancedGain(c350340DoO.LJIILL);
        nLETrackSlot2.setMainSegment(nLESegmentAudio);
        nLETrackSlot2.setStartTime(c350340DoO.LIZLLL);
        long j2 = c350340DoO.LJ;
        if (j2 != 0) {
            nLETrackSlot2.setEndTime(j2);
        } else if (c350340DoO.LJIIIZ - c350340DoO.LJIIIIZZ > timeUnit.toMicros(j)) {
            nLETrackSlot2.setEndTime(c350340DoO.LIZLLL + timeUnit.toMicros(j));
        }
        String str = c350340DoO.LIZJ;
        if (str != null) {
            nLETrackSlot2.setExtra("ep_audio_music_id", str);
        }
        if (!((Boolean) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_SUBTRACK_OVER_MAIN, Boolean.TRUE)).booleanValue() || c350340DoO.LJIIJJI) {
            long jLJII = C351220Dpo.LJII(C350870DpF.LJI(this.LIZ));
            long endTime = nLETrackSlot2.getEndTime();
            long j3 = endTime - jLJII;
            if (endTime > jLJII) {
                nLETrackSlot2.setEndTime(jLJII);
                NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot2.getMainSegment());
                if (nLESegmentAudioDynamicCast != null) {
                    nLESegmentAudioDynamicCast.setTimeClipEnd(nLESegmentAudioDynamicCast.getTimeClipEnd() - j3);
                }
            }
        }
        if (sortedSlots.size() == 1 || slotIndex == 0) {
            trackBySlot.removeSlot(nLETrackSlotLLJJI);
            trackBySlot.addSlot(nLETrackSlot2);
            if (z) {
                trackBySlot.timeSort();
            }
            LLJJ(null, enumC356070Dxd);
            return nLETrackSlot2;
        }
        if (z) {
            NLETrackSlot nLETrackSlot3 = sortedSlots.get(slotIndex - 1);
            trackBySlot.removeSlot(nLETrackSlotLLJJI);
            trackBySlot.addSlotAfterSlot(nLETrackSlot2, nLETrackSlot3);
            trackBySlot.timeSort();
            LLJJ(null, enumC356070Dxd);
            return nLETrackSlot2;
        }
        trackBySlot.removeSlot(nLETrackSlotLLJJI);
        trackBySlot.addSlot(nLETrackSlot2);
        LLJJ(null, enumC356070Dxd);
        return nLETrackSlot2;
    }
}
