package X;

import com.bytedance.ies.nle.editor_jni.NLEAlphaSplitType;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.VecNLEFilterSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEVideoEffectSPtr;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Do2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C350120Do2 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZLLL(C350130Do3 c350130Do3, NLESegmentAudio nLESegmentAudio) {
        long jLongValue;
        long micros;
        NLEResourceAV nLEResourceAV = new NLEResourceAV();
        nLEResourceAV.setResourceType(NLEResType.AUDIO);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        nLEResourceAV.setDuration(timeUnit.toMicros(c350130Do3.LIZLLL));
        nLEResourceAV.setResourceFile(c350130Do3.LIZJ);
        nLESegmentAudio.setAVFile(nLEResourceAV);
        C351220Dpo.LLLLLJLJLL(nLESegmentAudio);
        Long l = c350130Do3.LJ;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        nLESegmentAudio.setTimeClipStart(timeUnit.toMicros(jLongValue));
        Long l2 = c350130Do3.LJFF;
        if (l2 != null && l2.longValue() != 0) {
            micros = timeUnit.toMicros(l2.longValue());
        } else {
            micros = timeUnit.toMicros(c350130Do3.LIZLLL);
        }
        nLESegmentAudio.setTimeClipEnd(micros);
        nLESegmentAudio.setKeepTone(false);
        if (!((Boolean) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_CURVE_SPEED, Boolean.FALSE)).booleanValue()) {
            nLESegmentAudio.setAbsSpeed(1.0f);
        }
    }

    public static void LIZIZ(NLEModel nLEModel, C350130Do3 c350130Do3, NLETrackSlot nLETrackSlot, int i) {
        Object next;
        String str = c350130Do3.LIZJ;
        if (str != null && str.length() != 0) {
            Iterator it2 = ((ArrayList) C346780Die.LIZIZ(nLEModel)).iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (((NLETimeSpaceNode) next).getLayer() == 0) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            NLETrack nLETrack = (NLETrack) next;
            if (nLETrack == null) {
                nLETrack = new NLETrack();
                nLETrack.setMainTrack(false);
                nLETrack.setExtra("AudioTrackType", "ORIGIN");
                nLEModel.addTrack(nLETrack);
            }
            NLETrackSlot nLETrackSlot2 = new NLETrackSlot();
            NLESegmentAudio nLESegmentAudio = new NLESegmentAudio();
            LIZLLL(c350130Do3, nLESegmentAudio);
            nLETrackSlot2.setMainSegment(nLESegmentAudio);
            nLETrackSlot2.setStartTime(nLETrackSlot.getStartTime());
            if (nLETrackSlot.getEndTime() != 0) {
                nLETrackSlot2.setEndTime(nLETrackSlot.getEndTime());
            }
            nLETrackSlot2.setExtra("original_audio_speed_rate", "1.0");
            nLETrackSlot.setExtra("original_audio_uuid", nLETrackSlot2.getUUID());
            nLETrack.addSlotAtIndex(nLETrackSlot2, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.bytedance.ies.nle.editor_jni.NLENode, com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode, com.bytedance.ies.nle.editor_jni.NLETrackSlot] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.bytedance.ies.nle.editor_jni.NLENode] */
    public static void LIZJ(C350130Do3 c350130Do3, NLETrackSlot nLETrackSlot, NLEModel nLEModel, boolean z) {
        Pair pair;
        boolean z2;
        boolean z3;
        NLENode nLENodeDeepClone;
        NLETrack nLETrackLIZ;
        int size;
        VecNLETrackSlotSPtr slots;
        double speed;
        long duration;
        TimeSpeedModelExtension timeSpeedModelExtension;
        String identityKey;
        long duration2;
        long duration3;
        NLEResType nLEResType;
        boolean z4;
        long jLongValue;
        NLEResourceNode resource;
        Integer num = null;
        if (z) {
            pair = C350110Do1.LIZIZ(nLEModel, nLETrackSlot);
        } else {
            pair = new Pair(null, null);
        }
        NLETrackSlot nLETrackSlot2 = (NLETrackSlot) pair.getFirst();
        pair.getSecond();
        String str = c350130Do3.LIZ;
        String str2 = c350130Do3.LIZJ;
        if (str2 != null && str2.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z5 = !z2;
        float measuredEndTime = (nLETrackSlot.getMeasuredEndTime() - nLETrackSlot.getMeasuredStartTime()) * 1.0f;
        if (c350130Do3.LIZIZ && Math.abs((measuredEndTime / LSPassThroughRecordSizeConfig.DEFAULT) - c350130Do3.LIZLLL) >= 10.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        NLESegment mainSegment = nLETrackSlot.getMainSegment();
        if (mainSegment != null) {
            nLENodeDeepClone = mainSegment.deepClone();
        } else {
            nLENodeDeepClone = null;
        }
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast(nLENodeDeepClone);
        if (nLESegmentVideoDynamicCast != null) {
            if (C351220Dpo.LLIL(nLETrackSlot) && (resource = nLESegmentVideoDynamicCast.getResource()) != null) {
                resource.setAlphaSplitType(NLEAlphaSplitType.NONE);
            }
            NLEResourceAV aVFile = nLESegmentVideoDynamicCast.getAVFile();
            if (aVFile != null) {
                if (c350130Do3.LIZIZ) {
                    nLEResType = NLEResType.VIDEO;
                } else {
                    nLEResType = NLEResType.IMAGE;
                }
                aVFile.setResourceType(nLEResType);
                if (c350130Do3.LIZIZ) {
                    aVFile.setDuration(TimeUnit.MILLISECONDS.toMicros(c350130Do3.LIZLLL));
                } else {
                    aVFile.setDuration((long) measuredEndTime);
                }
                if (c350130Do3.LJI != null) {
                    aVFile.setWidth(r0.intValue());
                }
                if (c350130Do3.LJII != null) {
                    aVFile.setHeight(r0.intValue());
                }
                aVFile.setResourceFile(str);
                if (!z5 && z) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                aVFile.setHasAudio(z4);
                if (z3) {
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    Long l = c350130Do3.LJ;
                    if (l != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    nLESegmentVideoDynamicCast.setTimeClipStart(timeUnit.toMicros(jLongValue));
                    nLESegmentVideoDynamicCast.setTimeClipEnd(nLESegmentVideoDynamicCast.getTimeClipStart() + ((long) measuredEndTime));
                    if (nLESegmentVideoDynamicCast.getTimeClipEnd() > aVFile.getDuration()) {
                        nLESegmentVideoDynamicCast.setTimeClipEnd(aVFile.getDuration());
                    }
                } else {
                    nLESegmentVideoDynamicCast.setTimeClipStart(0L);
                    nLESegmentVideoDynamicCast.setTimeClipEnd(aVFile.getDuration());
                }
            }
            C351510DqH.LIZ.getClass();
            C351510DqH.LJJJJ(nLESegmentVideoDynamicCast);
            nLETrackSlot.setAIMatting(null);
            if (((Boolean) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_CURVE_SPEED, Boolean.FALSE)).booleanValue()) {
                TimeSpeedModelExtension timeSpeedModelExtension2 = c350130Do3.LJIIIIZZ;
                if (timeSpeedModelExtension2 != null && timeSpeedModelExtension2.getSpeed() != 1.0d) {
                    nLESegmentVideoDynamicCast.setAbsSpeed(1.0f);
                    nLESegmentVideoDynamicCast.clearSegCurveSpeedPoint();
                    nLETrackSlot.removeExtraWithKey("ep_curve_speed_resource_id");
                    nLETrackSlot.removeExtraWithKey("ep_curve_speed_name");
                    nLETrackSlot.removeExtraWithKey("ep_curve_speed_english_name");
                    NLEResourceNode resource2 = nLESegmentVideoDynamicCast.getResource();
                    if (resource2 != null) {
                        duration3 = resource2.getDuration();
                    } else {
                        duration3 = 0;
                    }
                    nLESegmentVideoDynamicCast.setTimeClipStart(0L);
                    nLESegmentVideoDynamicCast.setTimeClipEnd(duration3);
                    nLETrackSlot.setEndTime(nLETrackSlot.getStartTime() + duration3);
                } else {
                    NLEResourceNode resource3 = nLESegmentVideoDynamicCast.getResource();
                    if (resource3 != null) {
                        duration2 = resource3.getDuration();
                    } else {
                        duration2 = 0;
                    }
                    nLESegmentVideoDynamicCast.setTimeClipStart(0L);
                    nLESegmentVideoDynamicCast.setTimeClipEnd(duration2);
                    nLETrackSlot.setEndTime(nLETrackSlot.getStartTime() + ((long) ((nLESegmentVideoDynamicCast.getTimeClipEnd() - nLESegmentVideoDynamicCast.getTimeClipStart()) / C351220Dpo.LIZ(nLESegmentVideoDynamicCast))));
                }
            } else {
                nLESegmentVideoDynamicCast.setAbsSpeed(1.0f);
                nLETrackSlot.setEndTime(nLETrackSlot.getStartTime() + nLESegmentVideoDynamicCast.getDuration());
            }
            num = null;
            nLESegmentVideoDynamicCast.setCrop(null);
            nLESegmentVideoDynamicCast.setClip(null);
        } else {
            nLESegmentVideoDynamicCast = null;
        }
        nLETrackSlot.setMainSegment(nLESegmentVideoDynamicCast);
        nLETrackSlot.setExtra("slot_extra_source_type", String.valueOf(EnumC356140Dxk.RecordFromEditorPro.getValue()));
        TimeSpeedModelExtension timeSpeedModelExtension3 = c350130Do3.LJIIIIZZ;
        if (timeSpeedModelExtension3 != null && (identityKey = timeSpeedModelExtension3.getIdentityKey()) != null && identityKey.length() > 0) {
            nLETrackSlot.setExtra("extra_identity_key", c350130Do3.LJIIIIZZ.getIdentityKey());
        } else {
            nLETrackSlot.removeExtraWithKey("extra_identity_key");
        }
        nLETrackSlot.removeExtraWithKey("is_editor_pro_speed_used");
        nLETrackSlot.removeExtraWithKey("is_editorpro_adjust_video_speed");
        nLETrackSlot.removeExtraWithKey("adjust_video_speed_duration");
        nLETrackSlot.removeExtraWithKey("enter_video_speed_time");
        if (z5 && z) {
            nLETrackSlot.setExtra("has_origin_audio_slot", "true");
            if (nLETrackSlot2 != null) {
                NLESegment mainSegment2 = nLETrackSlot2.getMainSegment();
                ?? DeepClone = num;
                if (mainSegment2 != null) {
                    DeepClone = mainSegment2.deepClone();
                }
                NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(DeepClone);
                if (nLESegmentAudioDynamicCast != null) {
                    LIZLLL(c350130Do3, nLESegmentAudioDynamicCast);
                    if (((Boolean) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_CURVE_SPEED, Boolean.FALSE)).booleanValue() && (timeSpeedModelExtension = c350130Do3.LJIIIIZZ) != null && timeSpeedModelExtension.getSpeed() != 1.0d) {
                        nLESegmentAudioDynamicCast.setAbsSpeed(1.0f);
                        nLESegmentAudioDynamicCast.clearSegCurveSpeedPoint();
                        nLETrackSlot2.removeExtraWithKey("ep_curve_speed_resource_id");
                        nLETrackSlot2.removeExtraWithKey("ep_curve_speed_name");
                        nLETrackSlot2.removeExtraWithKey("ep_curve_speed_english_name");
                    }
                    nLETrackSlot2.setMainSegment(nLESegmentAudioDynamicCast);
                    if (((Boolean) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_CURVE_SPEED, Boolean.FALSE)).booleanValue()) {
                        TimeSpeedModelExtension timeSpeedModelExtension4 = c350130Do3.LJIIIIZZ;
                        if (timeSpeedModelExtension4 != null) {
                            speed = timeSpeedModelExtension4.getSpeed();
                        } else {
                            speed = 1.0d;
                        }
                        NLEResourceNode resource4 = nLESegmentAudioDynamicCast.getResource();
                        if (resource4 != null) {
                            duration = resource4.getDuration();
                        } else {
                            duration = 0;
                        }
                        nLESegmentAudioDynamicCast.setTimeClipStart(0L);
                        nLESegmentAudioDynamicCast.setTimeClipEnd(duration);
                        if (speed == 1.0d) {
                            nLETrackSlot2.setEndTime(nLETrackSlot2.getStartTime() + ((long) ((nLESegmentAudioDynamicCast.getTimeClipEnd() - nLESegmentAudioDynamicCast.getTimeClipStart()) / C351220Dpo.LIZ(nLESegmentAudioDynamicCast))));
                            return;
                        } else {
                            nLETrackSlot2.setEndTime(nLETrackSlot2.getStartTime() + duration);
                            return;
                        }
                    }
                    nLETrackSlot2.setEndTime(nLETrackSlot2.getStartTime() + nLESegmentAudioDynamicCast.getDuration());
                    return;
                }
                return;
            }
            NLETrack mainTrack = nLEModel.getMainTrack();
            Integer numValueOf = num;
            if (mainTrack != null) {
                numValueOf = Integer.valueOf(mainTrack.getSlotIndex(nLETrackSlot));
            }
            NLETrack mainTrack2 = nLEModel.getMainTrack();
            if (mainTrack2 != null && (slots = mainTrack2.getSlots()) != null) {
                size = slots.size();
            } else {
                size = 0;
            }
            if (numValueOf == null || numValueOf.intValue() < 0 || numValueOf.intValue() >= size) {
                return;
            }
            LIZIZ(nLEModel, c350130Do3, nLETrackSlot, numValueOf.intValue());
            return;
        }
        if (nLETrackSlot2 != null && (nLETrackLIZ = C346780Die.LIZ(nLEModel)) != null) {
            nLETrackLIZ.removeSlot(nLETrackSlot2);
        }
        nLETrackSlot.setExtra("has_origin_audio_slot", "false");
    }

    public static List LIZ(List list, int i, NLEModel nLEModel, NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
        boolean z;
        NLEResType nLEResType;
        boolean z2;
        String identityKey;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C350130Do3 c350130Do3 = (C350130Do3) it2.next();
            String str = c350130Do3.LIZ;
            if (c350130Do3.LIZLLL != 0) {
                String str2 = c350130Do3.LIZJ;
                int iLIZJ = 0;
                if (str2 != null && str2.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                boolean z3 = !z;
                NLETrackSlot nLETrackSlot2 = new NLETrackSlot();
                NLESegmentVideo nLESegmentVideo = new NLESegmentVideo();
                NLEResourceAV nLEResourceAV = new NLEResourceAV();
                if (c350130Do3.LIZIZ) {
                    nLEResType = NLEResType.VIDEO;
                } else {
                    nLEResType = NLEResType.IMAGE;
                }
                nLEResourceAV.setResourceType(nLEResType);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                nLEResourceAV.setDuration(timeUnit.toMicros(c350130Do3.LIZLLL));
                if (c350130Do3.LJI != null) {
                    nLEResourceAV.setWidth(r0.intValue());
                }
                if (c350130Do3.LJII != null) {
                    nLEResourceAV.setHeight(r0.intValue());
                }
                nLEResourceAV.setResourceFile(str);
                nLEResourceAV.setHasAudio(z3);
                nLESegmentVideo.setAVFile(nLEResourceAV);
                nLESegmentVideo.setTimeClipStart(0L);
                long micros = timeUnit.toMicros(c350130Do3.LIZLLL);
                nLESegmentVideo.setTimeClipEnd(micros);
                nLETrackSlot2.setEndTime(micros);
                nLESegmentVideo.setKeepTone(true);
                if (z3) {
                    C351220Dpo.LLLLLJLJLL(nLESegmentVideo);
                } else {
                    nLESegmentVideo.setVolume(0.0f);
                }
                C351510DqH.LIZ.getClass();
                C351510DqH.LJJJJ(nLESegmentVideo);
                nLETrackSlot2.setMainSegment(nLESegmentVideo);
                if (nLETrackSlot != null) {
                    VecNLEVideoEffectSPtr videoEffects = nLETrackSlot.getVideoEffects();
                    if (videoEffects != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (NLEVideoEffect nLEVideoEffect : videoEffects) {
                            String extra = nLEVideoEffect.getExtra("editor_pro_effect_category");
                            if (extra != null && !a0.LJJJIL(extra)) {
                                arrayList2.add(nLEVideoEffect);
                            }
                        }
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            NLEVideoEffect nLEVideoEffectDynamicCast = NLEVideoEffect.dynamicCast(((NLENode) it3.next()).deepClone(true));
                            if (nLEVideoEffectDynamicCast != null) {
                                nLETrackSlot2.addVideoEffect(nLEVideoEffectDynamicCast);
                                nLETrackSlot2.setExtra("is_editorpro_effect", "1");
                            }
                        }
                    }
                    VecNLEFilterSPtr filters = nLETrackSlot.getFilters();
                    if (filters != null) {
                        ArrayList arrayList3 = new ArrayList();
                        for (NLEFilter nLEFilter : filters) {
                            String extra2 = nLEFilter.getExtra("editor_pro_effect_category");
                            if (extra2 != null && !a0.LJJJIL(extra2)) {
                                arrayList3.add(nLEFilter);
                            }
                        }
                        Iterator it4 = arrayList3.iterator();
                        while (it4.hasNext()) {
                            NLEFilter nLEFilterDynamicCast = NLEFilter.dynamicCast(((NLENode) it4.next()).deepClone(true));
                            if (nLEFilterDynamicCast != null) {
                                nLETrackSlot2.addFilter(nLEFilterDynamicCast);
                                nLETrackSlot2.setExtra("is_editorpro_effect", "1");
                            }
                        }
                    }
                }
                nLETrackSlot2.setExtra("slot_extra_source_type", String.valueOf(EnumC356140Dxk.RecordFromEditorPro.getValue()));
                TimeSpeedModelExtension timeSpeedModelExtension = c350130Do3.LJIIIIZZ;
                if (timeSpeedModelExtension != null && (identityKey = timeSpeedModelExtension.getIdentityKey()) != null && identityKey.length() > 0) {
                    nLETrackSlot2.setExtra("extra_identity_key", timeSpeedModelExtension.getIdentityKey());
                }
                nLETrack.addSlotAtIndex(nLETrackSlot2, i);
                String str3 = c350130Do3.LIZJ;
                if (str3 != null && str3.length() != 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2) {
                    nLETrackSlot2.setExtra("has_origin_audio_slot", "true");
                    if (C346780Die.LIZ(nLEModel) != null) {
                        iLIZJ = C350110Do1.LIZJ(nLEModel, nLETrackSlot2);
                    }
                    LIZIZ(nLEModel, c350130Do3, nLETrackSlot2, iLIZJ);
                } else {
                    nLETrackSlot2.setExtra("has_origin_audio_slot", "false");
                }
                i++;
                arrayList.add(new Pair(nLETrackSlot2, c350130Do3));
            }
        }
        return arrayList;
    }
}
