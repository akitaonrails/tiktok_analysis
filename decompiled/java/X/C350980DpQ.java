package X;

import android.graphics.PointF;
import com.bytedance.ies.nle.editor_jni.NLEAlphaSplitType;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEPoint;
import com.bytedance.ies.nle.editor_jni.NLERenderProxySegment;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudioFadeFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentTransition;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.VecNLEFilterSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEPointSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEVideoEffectSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.vesdk.VEUtils;
import com.ss.ugc.android.editor.core.api.params.EditMedia;
import com.ss.ugc.android.editor.core.tracklinkage.TrackLinkageManagerProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS214S0300000_5;
import kotlin.jvm.internal.AwS249S0300000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0DpQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C350980DpQ extends C350680Dow implements InterfaceC353130Dst {
    public C350980DpQ(C0E48 c0e48) {
        super(c0e48);
    }

    public static void LLJJIJI(NLETrackSlot nLETrackSlot) {
        NLEResourceNode resource;
        nLETrackSlot.clearKeyframe();
        nLETrackSlot.clearSwingKeyframe();
        nLETrackSlot.removeExtraWithKey("ep_crop_scale");
        nLETrackSlot.removeExtraWithKey("ep_crop_transX");
        nLETrackSlot.removeExtraWithKey("ep_crop_transY");
        nLETrackSlot.removeExtraWithKey("ep_crop_degree");
        nLETrackSlot.removeExtraWithKey("ep_crop_ratio");
        nLETrackSlot.removeExtraWithKey("ep_crop_mode");
        nLETrackSlot.removeExtraWithKey("is_editorpro_crop_video");
        nLETrackSlot.removeExtraWithKey("last_hsl_item");
        nLETrackSlot.removeExtraWithKey("last_adjust_item");
        nLETrackSlot.removeExtraWithKey("crop_matrix");
        nLETrackSlot.removeExtraWithKey("crop_slider_rotation");
        nLETrackSlot.removeExtraWithKey("crop_button_rotation");
        nLETrackSlot.removeExtraWithKey("crop_is_photo_cropped");
        nLETrackSlot.removeExtraWithKey("crop_mirror_x");
        nLETrackSlot.setExtra("is_editorpro_replace_video_clip", "1");
        if (nLETrackSlot.getRenderProxy() != null) {
            nLETrackSlot.setRenderProxy(null);
        }
        VecNLEVideoEffectSPtr videoEffects = nLETrackSlot.getVideoEffects();
        ArrayList arrayList = new ArrayList();
        for (NLEVideoEffect nLEVideoEffect : videoEffects) {
            C351510DqH.LIZ.getClass();
            if (C351510DqH.LJJIJIL(nLEVideoEffect)) {
                arrayList.add(nLEVideoEffect);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            nLETrackSlot.removeVideoEffect((NLEVideoEffect) it2.next());
        }
        VecNLEFilterSPtr filters = nLETrackSlot.getFilters();
        ArrayList arrayList2 = new ArrayList();
        for (NLEFilter nLEFilter : filters) {
            NLEFilter nLEFilter2 = nLEFilter;
            C351510DqH.LIZ.getClass();
            if (C351510DqH.LJJIJL(nLEFilter2) || C351220Dpo.LLIIL(nLEFilter2) || C351220Dpo.LLILZIL(nLEFilter2)) {
                arrayList2.add(nLEFilter);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            nLETrackSlot.removeFilter((NLEFilter) it3.next());
        }
        NLESegment mainSegment = nLETrackSlot.getMainSegment();
        if (mainSegment != null && (resource = mainSegment.getResource()) != null) {
            resource.removeExtraWithKey("ep_ai_generating");
            resource.removeExtraWithKey("ep_ai_generated");
            resource.removeExtraWithKey("ep_ai_generated_fail");
        }
        nLETrackSlot.removeExtraWithKey("ep_magic_resource_id");
        nLETrackSlot.removeExtraWithKey("ep_magic_effect_id");
        nLETrackSlot.removeExtraWithKey("ep_magic_category_id");
        nLETrackSlot.removeExtraWithKey("freeze_from_uuid");
        nLETrackSlot.removeExtraWithKey("freeze_timestamp");
        nLETrackSlot.removeExtraWithKey("freeze_from_resource_path");
        nLETrackSlot.removeExtraWithKey("freeze_ref_video_uuid");
        nLETrackSlot.removeExtraWithKey("freeze_group");
        nLETrackSlot.removeExtraWithKey("is_ep_reverse_video");
        nLETrackSlot.getMainSegment().removeExtraWithKey("ep_origin_media_path");
        nLETrackSlot.removeExtraWithKey("is_beauty_auto_retouch_off");
        nLETrackSlot.removeExtraWithKey("ep_retouch_last_selected_resId");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x013b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6 A[EDGE_INSN: B:276:0x00c6->B:38:0x00c6 BREAK  A[LOOP:0: B:32:0x00aa->B:277:0x00aa]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01da  */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28, types: [T, com.bytedance.ies.nle.editor_jni.NLETrackSlot] */
    /* JADX WARN: Type inference failed for: r8v32, types: [com.bytedance.ies.nle.editor_jni.NLETrackSlot] */
    @Override // X.InterfaceC353130Dst
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC351020DpU LLIIIL(com.bytedance.ies.nle.editor_jni.NLETrackSlot r33) {
        /*
            Method dump skipped, instruction units count: 1874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C350980DpQ.LLIIIL(com.bytedance.ies.nle.editor_jni.NLETrackSlot):X.0DpU");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r31v0, types: [kotlin.jvm.internal.AwS214S0300000_5] */
    @Override // X.InterfaceC353130Dst
    public final boolean LJJIJLIJ(List list, AwS214S0300000_5 awS214S0300000_5) {
        NLETrack nLETrackLLJJIII;
        long maxEnd;
        long maxEnd2;
        boolean zLLJJIJI;
        Pair pair;
        TimeSpeedModelExtension timeSpeedModelExtension;
        ?? arrayList;
        String extra;
        VecNLEPointSPtr segCurveSpeedPoints;
        float absSpeed;
        boolean keepTone;
        NLETrackSlot nLETrackSlotLLJJI = LLJJI();
        if (nLETrackSlotLLJJI == null || (nLETrackLLJJIII = LLJJIII()) == null) {
            return false;
        }
        boolean mainTrack = nLETrackLLJJIII.getMainTrack();
        NLEModel nLEModelDynamicCast = NLEModel.dynamicCast(C350870DpF.LJI(this.LIZ).deepClone());
        NLETrackSlot nLETrackSlotDynamicCast = NLETrackSlot.dynamicCast(nLETrackSlotLLJJI.deepClone());
        NLETrack mainTrack2 = LLZ().getMainTrack();
        if (mainTrack2 != null) {
            maxEnd = mainTrack2.getMaxEnd();
        } else {
            maxEnd = 0;
        }
        NLEModel nLEModelLJI = C350870DpF.LJI(this.LIZ);
        if (C350110Do1.LJIIIIZZ(nLEModelLJI)) {
            C350110Do1.LIZJ.getClass();
            C349070DmL.LIZ(nLEModelLJI, nLETrackSlotLLJJI, true);
            nLEModelLJI.setExtra("extra_key_realign_origin_slots", "true");
        }
        NLEModel nLEModelLLZ = LLZ();
        C0E48 c0e48 = this.LIZ;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = (ArrayList) list;
        if (!arrayList3.isEmpty()) {
            boolean mainTrack3 = nLETrackLLJJIII.getMainTrack();
            if (arrayList3.size() == 1) {
                C350120Do2.LIZJ((C350130Do3) ListProtector.get(list, 0), nLETrackSlotLLJJI, nLEModelLLZ, mainTrack3);
                arrayList2.add(nLETrackSlotLLJJI);
            } else {
                int slotIndex = nLETrackLLJJIII.getSlotIndex(nLETrackSlotLLJJI);
                C350120Do2.LIZJ((C350130Do3) ListProtector.get(list, 0), nLETrackSlotLLJJI, nLEModelLLZ, mainTrack3);
                arrayList2.add(nLETrackSlotLLJJI);
                NLETrack mainTrack4 = nLEModelLLZ.getMainTrack();
                if (mainTrack4 != null) {
                    zLLJJIJI = C351220Dpo.LLJJIJI(mainTrack4);
                } else {
                    zLLJJIJI = false;
                }
                if (C351230Dpp.LJ(Boolean.valueOf(zLLJJIJI))) {
                    nLETrackSlotLLJJI.clearVideoAnim();
                    C350690Dox.LJIIJ(nLETrackSlotLLJJI);
                }
                List listLIZ = C350120Do2.LIZ(C13LP.LJJJJIZL(list, 1), slotIndex + 1, nLEModelLLZ, nLETrackLLJJIII, nLETrackSlotLLJJI);
                ArrayList<Pair> arrayList4 = (ArrayList) listLIZ;
                for (Pair pair2 : arrayList4) {
                    ((NLENode) pair2.getFirst()).setExtra("is_editorpro_replace_video_clip", "1");
                    if (((Boolean) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_CURVE_SPEED, Boolean.FALSE)).booleanValue() && ((timeSpeedModelExtension = ((C350130Do3) pair2.getSecond()).LJIIIIZZ) == null || timeSpeedModelExtension.getSpeed() == 1.0d)) {
                        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) ((NLETrackSlot) pair2.getFirst()).getMainSegment());
                        if (nLESegmentVideoDynamicCast != null) {
                            if (C351220Dpo.LJZ(nLETrackSlotLLJJI)) {
                                C351510DqH c351510DqH = C351510DqH.LIZ;
                                NLETrackSlot nLETrackSlot = (NLETrackSlot) pair2.getFirst();
                                c351510DqH.getClass();
                                NLESegmentVideo nLESegmentVideoDynamicCast2 = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlotLLJJI.getMainSegment());
                                if (nLESegmentVideoDynamicCast2 != null && (segCurveSpeedPoints = nLESegmentVideoDynamicCast2.getSegCurveSpeedPoints()) != null) {
                                    arrayList = new ArrayList(C15438062q.LJIJJ(segCurveSpeedPoints, 10));
                                    for (NLEPoint nLEPoint : segCurveSpeedPoints) {
                                        arrayList.add(new PointF(nLEPoint.getX(), nLEPoint.getY()));
                                    }
                                } else {
                                    arrayList = C13BV.INSTANCE;
                                }
                                String strLJJI = C351510DqH.LJJI(nLETrackSlotLLJJI);
                                if (!nLETrackSlotLLJJI.hasExtra("ep_curve_speed_english_name") || (extra = nLETrackSlotLLJJI.getExtra("ep_curve_speed_english_name")) == null) {
                                    extra = "";
                                }
                                c0e48.LLFII().LLIIJLIL(nLETrackSlot, new C350730Dp1(arrayList, strLJJI, extra, C351220Dpo.LJJIJ(nLETrackSlotLLJJI), EnumC356090Dxf.VIDEO), EnumC356070Dxd.NONE);
                                if (nLETrackLLJJIII.getMainTrack()) {
                                    C351510DqH.LJIILIIL(c0e48, nLEModelLLZ, nLETrackSlot, arrayList, strLJJI);
                                }
                            } else {
                                NLESegmentVideo nLESegmentVideoDynamicCast3 = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlotLLJJI.getMainSegment());
                                if (nLESegmentVideoDynamicCast3 != null) {
                                    absSpeed = nLESegmentVideoDynamicCast3.getAbsSpeed();
                                } else {
                                    absSpeed = 1.0f;
                                }
                                NLESegmentVideo nLESegmentVideoDynamicCast4 = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlotLLJJI.getMainSegment());
                                if (nLESegmentVideoDynamicCast4 != null) {
                                    keepTone = nLESegmentVideoDynamicCast4.getKeepTone();
                                } else {
                                    keepTone = true;
                                }
                                nLESegmentVideoDynamicCast.setAbsSpeed(absSpeed);
                                nLESegmentVideoDynamicCast.setKeepTone(keepTone);
                                ((NLETimeSpaceNode) pair2.getFirst()).setEndTime(((long) ((nLESegmentVideoDynamicCast.getTimeClipEnd() - nLESegmentVideoDynamicCast.getTimeClipStart()) / nLESegmentVideoDynamicCast.getAbsSpeed())) + ((NLETimeSpaceNode) pair2.getFirst()).getStartTime());
                                NLETrack mainTrack5 = nLEModelLLZ.getMainTrack();
                                if (mainTrack5 != null) {
                                    mainTrack5.timeSort();
                                }
                                c0e48.og().LJJIJL((NLETrackSlot) pair2.getFirst(), null);
                                C350110Do1.LJIILJJIL(nLEModelLLZ, (NLETrackSlot) pair2.getFirst(), new C350740Dp2(Float.valueOf(absSpeed), Boolean.valueOf(keepTone)));
                            }
                        }
                    }
                }
                NLESegmentTransition endTransition = nLETrackSlotLLJJI.getEndTransition();
                if (endTransition != null && (pair = (Pair) C13LP.LJJLIIIJL(listLIZ)) != null) {
                    NLETrackSlot nLETrackSlot2 = (NLETrackSlot) pair.getFirst();
                    nLETrackSlot2.setEndTransition(endTransition);
                    nLETrackSlot2.setExtra("slot_extra_transition_effect_id", nLETrackSlotLLJJI.getExtra("slot_extra_transition_effect_id"));
                    nLETrackSlot2.setExtra("slot_extra_transition_resource_category", nLETrackSlotLLJJI.getExtra("slot_extra_transition_resource_category"));
                    nLETrackSlot2.setExtra("slot_extra_transition_resource_id", nLETrackSlotLLJJI.getExtra("slot_extra_transition_resource_id"));
                    nLETrackSlot2.setExtra("ep_transition_cache_duration", nLETrackSlotLLJJI.getExtra("ep_transition_cache_duration"));
                    C351220Dpo.LLLLLIL(nLETrackSlotLLJJI);
                    nLETrackSlotLLJJI.removeExtraWithKey("ep_transition_cache_duration");
                    NLETrack mainTrack6 = nLEModelLLZ.getMainTrack();
                    if (mainTrack6 != null) {
                        mainTrack6.timeSort();
                    }
                }
                ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(listLIZ, 10));
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    arrayList5.add(((Pair) it2.next()).getFirst());
                }
                arrayList2.addAll(arrayList5);
            }
        }
        LLJJIJI(nLETrackSlotLLJJI);
        if (mainTrack) {
            C350110Do1.LJII(LLZ());
            this.LIZ.Rn().timeSort();
        }
        if (!((Boolean) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_OPERATE_CAUSE_BLACK_SLOT, Boolean.TRUE)).booleanValue()) {
            C351510DqH.LJIIIZ(C351510DqH.LIZ, this.LIZ);
        }
        NLETrack mainTrack7 = LLZ().getMainTrack();
        if (mainTrack7 != null) {
            maxEnd2 = mainTrack7.getMaxEnd();
        } else {
            maxEnd2 = 0;
        }
        if (maxEnd2 > maxEnd) {
            C351510DqH c351510DqH2 = C351510DqH.LIZ;
            C0E48 c0e482 = this.LIZ;
            c351510DqH2.getClass();
            C351510DqH.LIZIZ(maxEnd, c0e482);
        }
        if (nLETrackSlotDynamicCast != null && nLETrackSlotDynamicCast.getDuration() != nLETrackSlotLLJJI.getDuration()) {
            LLJJJIL(nLEModelDynamicCast, nLETrackSlotDynamicCast, nLETrackSlotLLJJI);
        }
        if (mainTrack) {
            C350110Do1.LJFF(LLZ());
        }
        awS214S0300000_5.invoke(arrayList2);
        LLJJ(C051R.LIZIZ(new C0E1X(C0E1V.REPLACE.getNameId(), null, null, null, null, 30)), EnumC356070Dxd.DONE);
        return true;
    }

    @Override // X.InterfaceC353130Dst
    public final void LJLLLLLL(List<C350130Do3> list, C350990DpR c350990DpR) {
        long maxEnd;
        Integer num = c350990DpR.LIZJ;
        if (num != null) {
            int iIntValue = num.intValue();
            NLEModel nLEModelLLZ = LLZ();
            if (nLEModelLLZ.getMainTrack() == null) {
                return;
            }
            NLETrack mainTrack = nLEModelLLZ.getMainTrack();
            if (mainTrack != null) {
                maxEnd = mainTrack.getMaxEnd();
            } else {
                maxEnd = 0;
            }
            NLEModel nLEModelDynamicCast = NLEModel.dynamicCast(nLEModelLLZ.deepClone());
            List listLIZ = C350120Do2.LIZ(list, iIntValue, nLEModelLLZ, nLEModelLLZ.getMainTrack(), null);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZ, 10));
            Iterator it2 = ((ArrayList) listLIZ).iterator();
            while (it2.hasNext()) {
                arrayList.add(((Pair) it2.next()).getFirst());
            }
            NLETrackSlot nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(arrayList);
            C350110Do1.LJII(nLEModelLLZ);
            this.LIZ.Rn().timeSort();
            LLJJIJIL(c350990DpR.LIZJ, ((ArrayList) list).size(), nLEModelDynamicCast, maxEnd);
            C350870DpF.LIZJ(this.LIZ, C051R.LIZIZ(new C0E1X(C0E1V.ADD_VIDEO.getNameId(), null, null, null, null, 30)));
            if (c350990DpR.LJ) {
                C350870DpF.LJIIIZ(this.LIZ, "select_slot_event", new C358740E4q(nLETrackSlot, 0, null, false, 0, 254));
            } else {
                C350870DpF.LJIIIZ(this.LIZ, "select_slot_and_seek_to_start", new C358740E4q(nLETrackSlot, 0, null, false, 0, 250));
            }
        }
    }

    @Override // X.InterfaceC353130Dst
    public final boolean LLIIL(List list, Boolean bool, AwS249S0300000_5 awS249S0300000_5) {
        boolean z;
        NLEResourceNode resource;
        NLEResType nLEResType;
        NLETrackSlot nLETrackSlotLLJJI = LLJJI();
        boolean z2 = false;
        if (nLETrackSlotLLJJI == null) {
            return false;
        }
        NLEModel nLEModelDynamicCast = NLEModel.dynamicCast(C350870DpF.LJI(this.LIZ).deepClone());
        NLETrackSlot nLETrackSlotDynamicCast = NLETrackSlot.dynamicCast(nLETrackSlotLLJJI.deepClone());
        EditMedia editMedia = (EditMedia) ListProtector.get(list, 0);
        String path = editMedia.getPath();
        C351000DpS.LIZ(editMedia);
        C01GW<C365840EVy> c01gw = C365840EVy.LIZIZ;
        C351010DpT.LIZ().getClass();
        C558340Lv6 c558340Lv6LJFF = C351220Dpo.LJFF(path);
        float measuredEndTime = (nLETrackSlotLLJJI.getMeasuredEndTime() - nLETrackSlotLLJJI.getMeasuredStartTime()) * C351220Dpo.LIZ(NLESegmentVideo.dynamicCast((NLENode) nLETrackSlotLLJJI.getMainSegment()));
        if (editMedia.isVideo() && Math.abs((measuredEndTime / LSPassThroughRecordSizeConfig.DEFAULT) - c558340Lv6LJFF.LJ) >= 10.0f) {
            z = true;
        } else {
            z = false;
        }
        if (editMedia.isVideo() && (!VEUtils.getAudioFileInfoForAllTracks(path).isEmpty())) {
            z2 = true;
        }
        C350110Do1.LJIIL(C350870DpF.LJI(this.LIZ), nLETrackSlotLLJJI);
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast(nLETrackSlotLLJJI.getMainSegment().deepClone());
        String strLIZJ = null;
        if (nLESegmentVideoDynamicCast != null) {
            if (!z2) {
                nLESegmentVideoDynamicCast.setVolume(0.0f);
            }
            NLEResourceAV aVFile = nLESegmentVideoDynamicCast.getAVFile();
            if (editMedia.isVideo()) {
                nLEResType = NLEResType.VIDEO;
            } else {
                nLEResType = NLEResType.IMAGE;
            }
            aVFile.setResourceType(nLEResType);
            if (editMedia.isVideo()) {
                aVFile.setDuration(TimeUnit.MILLISECONDS.toMicros(c558340Lv6LJFF.LJ));
            } else {
                aVFile.setDuration((long) measuredEndTime);
            }
            int i = c558340Lv6LJFF.LIZLLL;
            if (i != 90 && i != 270) {
                aVFile.setHeight(c558340Lv6LJFF.LIZJ);
                aVFile.setWidth(c558340Lv6LJFF.LIZIZ);
            } else {
                aVFile.setHeight(c558340Lv6LJFF.LIZIZ);
                aVFile.setWidth(c558340Lv6LJFF.LIZJ);
            }
            aVFile.setResourceFile(path);
            aVFile.setHasAudio(z2);
            long jLongValue = 0;
            if (z) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                Long clipStartTime = editMedia.getClipStartTime();
                if (clipStartTime != null) {
                    jLongValue = clipStartTime.longValue();
                }
                nLESegmentVideoDynamicCast.setTimeClipStart(timeUnit.toMicros(jLongValue));
                nLESegmentVideoDynamicCast.setTimeClipEnd(nLESegmentVideoDynamicCast.getTimeClipStart() + ((long) measuredEndTime));
                if (nLESegmentVideoDynamicCast.getTimeClipEnd() > nLESegmentVideoDynamicCast.getAVFile().getDuration()) {
                    nLESegmentVideoDynamicCast.setTimeClipEnd(nLESegmentVideoDynamicCast.getAVFile().getDuration());
                }
            } else {
                nLESegmentVideoDynamicCast.setTimeClipStart(0L);
                nLESegmentVideoDynamicCast.setTimeClipEnd(nLESegmentVideoDynamicCast.getAVFile().getDuration());
            }
            C351510DqH.LIZ.getClass();
            C351510DqH.LJJJJ(nLESegmentVideoDynamicCast);
            nLETrackSlotLLJJI.setAIMatting(null);
            nLETrackSlotLLJJI.clearChromaChannel();
            nLETrackSlotLLJJI.setEndTime(nLETrackSlotLLJJI.getStartTime() + nLESegmentVideoDynamicCast.getDuration());
            nLESegmentVideoDynamicCast.setCrop(null);
            nLESegmentVideoDynamicCast.setClip(null);
        } else {
            nLESegmentVideoDynamicCast = null;
        }
        nLETrackSlotLLJJI.setMainSegment(nLESegmentVideoDynamicCast);
        LLJJIJI(nLETrackSlotLLJJI);
        nLETrackSlotLLJJI.setExtra("slot_extra_source_type", String.valueOf(EnumC356140Dxk.UploadFromEditorPro.getValue()));
        NLESegment mainSegment = nLETrackSlotLLJJI.getMainSegment();
        if (mainSegment != null && (resource = mainSegment.getResource()) != null) {
            resource.setAlphaSplitType(NLEAlphaSplitType.NONE);
        }
        AIGCInfo aigcInfo = editMedia.getAigcInfo();
        if (aigcInfo != null) {
            strLIZJ = C140C.LIZJ(aigcInfo);
        }
        nLETrackSlotLLJJI.setExtra("aigc_info", strLIZJ);
        nLETrackSlotLLJJI.removeExtraWithKey("has_origin_audio_slot");
        nLETrackSlotLLJJI.removeExtraWithKey("original_audio_uuid");
        nLETrackSlotLLJJI.removeExtraWithKey("has_use_default_intensity");
        C350110Do1.LJII(LLZ());
        this.LIZ.Rn().timeSort();
        if (!((Boolean) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_OPERATE_CAUSE_BLACK_SLOT, Boolean.TRUE)).booleanValue()) {
            C351510DqH.LJIIIZ(C351510DqH.LIZ, this.LIZ);
        }
        if (nLETrackSlotDynamicCast != null && nLETrackSlotDynamicCast.getDuration() != nLETrackSlotLLJJI.getDuration()) {
            LLJJJIL(nLEModelDynamicCast, nLETrackSlotDynamicCast, nLETrackSlotLLJJI);
        }
        C350110Do1.LJFF(LLZ());
        awS249S0300000_5.invoke();
        LLJJ(C051R.LIZIZ(new C0E1X(C0E1V.REPLACE.getNameId(), null, null, null, null, 30)), EnumC356070Dxd.DONE);
        return true;
    }

    public final void LLJJJIL(NLEModel nLEModel, NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2) {
        if (!C351230Dpp.LJ(null)) {
            TrackLinkageManagerProvider.Companion.getClass();
            AbstractC349500Dn2 businessTrackLinkageManager = C356700Dye.LIZ().getBusinessTrackLinkageManager();
            if (businessTrackLinkageManager != null) {
                businessTrackLinkageManager.LIZLLL.clear();
                businessTrackLinkageManager.LIZLLL.addAll(C1697810uHb.LJ(NLEResType.ANIMATION_VIDEO_IN, NLEResType.ANIMATION_VIDEO_OUT, NLEResType.ANIMATION_VIDEO_COMBO, NLEResType.TEXT_STICKER));
                businessTrackLinkageManager.LIZJ(new C349510Dn3("replace", C1697810uHb.LJ(new C349470Dmz(nLETrackSlot, nLETrackSlot2, null, null, 28)), nLEModel));
                businessTrackLinkageManager.LIZLLL.clear();
                businessTrackLinkageManager.LIZLLL.addAll(C348600Dla.LIZIZ());
                return;
            }
            return;
        }
        C350690Dox.LJI(nLETrackSlot.getDuration(), nLETrackSlot2, this.LIZ);
    }

    @Override // X.InterfaceC353130Dst
    public final void LJIJI(NLETrack nLETrack, NLETrackSlot nLETrackSlot, boolean z, boolean z2) {
        String uuid;
        long startTime;
        Float fValueOf;
        String str;
        String extra;
        String uuid2;
        NLESegment mainSegment;
        NLESegment mainSegment2;
        NLETrack nLETrackPt = this.LIZ.Pt();
        NLETrackSlot nLETrackSlotLLLLLLIL = this.LIZ.LLLLLLIL();
        String str2 = "";
        if (nLETrackSlotLLLLLLIL == null || (uuid = nLETrackSlotLLLLLLIL.getUUID()) == null) {
            uuid = "";
        }
        C0E48 c0e48 = this.LIZ;
        NLETrackSlot nLETrackSlotLLLLLLIL2 = c0e48.LLLLLLIL();
        if (nLETrackSlotLLLLLLIL2 != null) {
            startTime = nLETrackSlotLLLLLLIL2.getStartTime();
        } else {
            startTime = 0;
        }
        c0e48.bp(startTime);
        if (!Intrinsics.LJFF(nLETrack, nLETrackPt)) {
            C350870DpF.LJIIIZ(this.LIZ, "track_select_change_event", new C351120Dpe(z));
        }
        C350870DpF.LJIIIZ(this.LIZ, "selected_nle_track_slot", new C351080Dpa(nLETrackSlot));
        C350870DpF.LJIIIZ(this.LIZ, "selected_nle_track", new C351100Dpc(nLETrack));
        C0E48 c0e482 = this.LIZ;
        if (nLETrackSlot != null && (mainSegment2 = nLETrackSlot.getMainSegment()) != null) {
            C351220Dpo.LJLLLL(mainSegment2);
        }
        C350870DpF.LJIIIZ(c0e482, "volume_changed_event", new C350390DoT());
        C0E48 c0e483 = this.LIZ;
        String extra2 = null;
        if (nLETrackSlot != null && (mainSegment = nLETrackSlot.getMainSegment()) != null) {
            fValueOf = Float.valueOf(C351220Dpo.LJLILLLLZI(mainSegment));
        } else {
            fValueOf = null;
        }
        C350870DpF.LJIIIZ(c0e483, "speed_changed_event", new C351090Dpb(fValueOf));
        C350870DpF.LJIIIZ(this.LIZ, "slot_select_change_event", new C358740E4q(nLETrackSlot, 0, null, false, 0, 254));
        C351380Dq4 c351380Dq4 = (C351380Dq4) this.LIZ.S7().LIZJ("magic_changed_event", null);
        if (c351380Dq4 == null || (str = c351380Dq4.LIZ) == null) {
            str = "";
        }
        C351510DqH.LIZ.getClass();
        if (nLETrackSlot == null || !nLETrackSlot.hasExtra("ep_magic_resource_id") || (extra = nLETrackSlot.getExtra("ep_magic_resource_id")) == null) {
            extra = "";
        }
        String str3 = (String) C13LP.LJJJLL(a0.LJJLIIIJILLIZJL(extra, new String[]{","}, 0, 6));
        if (str3 == null) {
            str3 = "";
        }
        if (nLETrackSlot != null && (uuid2 = nLETrackSlot.getUUID()) != null) {
            str2 = uuid2;
        }
        if (!Intrinsics.LJFF(str3, str) || !Intrinsics.LJFF(str2, uuid)) {
            C0E48 c0e484 = this.LIZ;
            if (nLETrackSlot != null) {
                extra2 = nLETrackSlot.getExtra("ep_magic_category_id");
            }
            C350870DpF.LJIIIZ(c0e484, "magic_changed_event", new C351380Dq4(str3, extra2, false, 12));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    @Override // X.InterfaceC353130Dst
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.ies.nle.editor_jni.NLETrackSlot LJJ(com.ss.ugc.android.editor.core.api.params.EditMedia r24, X.C350990DpR r25, X.InterfaceC351060DpY r26, kotlin.jvm.functions.Function1<? super com.bytedance.ies.nle.editor_jni.NLETrackSlot, kotlin.Unit> r27) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C350980DpQ.LJJ(com.ss.ugc.android.editor.core.api.params.EditMedia, X.0DpR, X.0DpY, kotlin.jvm.functions.Function1):com.bytedance.ies.nle.editor_jni.NLETrackSlot");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0101  */
    @Override // X.InterfaceC353130Dst
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJZLJL(com.bytedance.ies.nle.editor_jni.NLETrackSlot r24, int r25, int r26, X.EnumC356070Dxd r27) {
        /*
            Method dump skipped, instruction units count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C350980DpQ.LJJIIJZLJL(com.bytedance.ies.nle.editor_jni.NLETrackSlot, int, int, X.0Dxd):void");
    }

    @Override // X.InterfaceC353130Dst
    public final void LJLJLLL(List<EditMedia> list, C350990DpR c350990DpR, boolean z, Function1<? super NLETrackSlot, Unit> function1) {
        long maxEnd;
        boolean z2;
        int i;
        int i2;
        NLEResType nLEResType;
        long micros;
        long micros2;
        String strLIZJ;
        Integer num = c350990DpR.LIZJ;
        if (num != null) {
            int iIntValue = num.intValue();
            Long l = c350990DpR.LIZIZ;
            if (l != null) {
                long jLongValue = l.longValue();
                NLETrack mainTrack = LLZ().getMainTrack();
                long j = 0;
                if (mainTrack != null) {
                    maxEnd = mainTrack.getMaxEnd();
                } else {
                    maxEnd = 0;
                }
                NLEModel nLEModelDynamicCast = NLEModel.dynamicCast(C350870DpF.LJI(this.LIZ).deepClone());
                NLETrackSlot nLETrackSlot = null;
                for (EditMedia editMedia : list) {
                    String path = editMedia.getPath();
                    C351000DpS.LIZ(editMedia);
                    C01GW<C365840EVy> c01gw = C365840EVy.LIZIZ;
                    C351010DpT.LIZ().getClass();
                    C558340Lv6 c558340Lv6LJFF = C351220Dpo.LJFF(path);
                    if (c558340Lv6LJFF.LJ != j) {
                        NLETrackSlot nLETrackSlot2 = new NLETrackSlot();
                        NLESegmentVideo nLESegmentVideo = new NLESegmentVideo();
                        if (editMedia.isVideo() && (!VEUtils.getAudioFileInfoForAllTracks(path).isEmpty())) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        NLEResourceAV nLEResourceAV = new NLEResourceAV();
                        int i3 = c558340Lv6LJFF.LIZLLL;
                        if (i3 != 90 && i3 != 270) {
                            i = c558340Lv6LJFF.LIZIZ;
                        } else {
                            i = c558340Lv6LJFF.LIZJ;
                        }
                        if (i3 != 90 && i3 != 270) {
                            i2 = c558340Lv6LJFF.LIZJ;
                        } else {
                            i2 = c558340Lv6LJFF.LIZIZ;
                        }
                        if (editMedia.isVideo()) {
                            nLEResType = NLEResType.VIDEO;
                        } else {
                            nLEResType = NLEResType.IMAGE;
                        }
                        nLEResourceAV.setResourceType(nLEResType);
                        if (editMedia.isVideo()) {
                            micros = TimeUnit.MILLISECONDS.toMicros(c558340Lv6LJFF.LJ);
                        } else {
                            micros = TimeUnit.MILLISECONDS.toMicros(jLongValue);
                        }
                        nLEResourceAV.setDuration(micros);
                        nLEResourceAV.setHeight(i2);
                        nLEResourceAV.setWidth(i);
                        nLEResourceAV.setResourceFile(path);
                        nLEResourceAV.setHasAudio(z2);
                        nLESegmentVideo.setAVFile(nLEResourceAV);
                        nLESegmentVideo.setTimeClipStart(0L);
                        if (editMedia.isVideo()) {
                            micros2 = TimeUnit.MILLISECONDS.toMicros(c558340Lv6LJFF.LJ);
                        } else {
                            micros2 = TimeUnit.MILLISECONDS.toMicros(jLongValue);
                        }
                        nLESegmentVideo.setTimeClipEnd(micros2);
                        nLETrackSlot2.setEndTime(micros2);
                        nLESegmentVideo.setKeepTone(true);
                        if (z2) {
                            C351220Dpo.LLLLLJLJLL(nLESegmentVideo);
                            if (Intrinsics.LJFF(c350990DpR.LIZLLL, Boolean.TRUE)) {
                                nLETrackSlot2.setExtra("slot_mute_volume", String.valueOf(nLESegmentVideo.getVolume()));
                                nLESegmentVideo.setVolume(0.0f);
                            }
                        } else {
                            nLESegmentVideo.setVolume(0.0f);
                        }
                        C351510DqH.LIZ.getClass();
                        C351510DqH.LJJJJ(nLESegmentVideo);
                        nLETrackSlot2.setMainSegment(nLESegmentVideo);
                        if (!c350990DpR.LJI) {
                            nLETrackSlot2.setExtra("slot_extra_source_type", String.valueOf(EnumC356140Dxk.UploadFromEditorPro.getValue()));
                            AIGCInfo aigcInfo = editMedia.getAigcInfo();
                            if (aigcInfo != null) {
                                strLIZJ = C140C.LIZJ(aigcInfo);
                            } else {
                                strLIZJ = null;
                            }
                            nLETrackSlot2.setExtra("aigc_info", strLIZJ);
                        }
                        if (z) {
                            this.LIZ.Rn().addSlotAtIndex(nLETrackSlot2, iIntValue);
                        }
                        if (function1 != null) {
                            function1.invoke(nLETrackSlot2);
                        }
                        iIntValue++;
                        if (nLETrackSlot == null) {
                            nLETrackSlot = nLETrackSlot2;
                        }
                    }
                    j = 0;
                }
                C350110Do1.LJII(LLZ());
                this.LIZ.Rn().timeSort();
                if (c350990DpR.LJIIJJI) {
                    LLJJIJIL(c350990DpR.LIZJ, list.size(), nLEModelDynamicCast, maxEnd);
                }
                if (c350990DpR.LJIIIIZZ) {
                    C350870DpF.LIZJ(this.LIZ, C051R.LIZIZ(new C0E1X(C0E1V.ADD_VIDEO.getNameId(), null, null, null, null, 30)));
                }
                if (c350990DpR.LJ) {
                    C350870DpF.LJIIIZ(this.LIZ, "select_slot_event", new C358740E4q(nLETrackSlot, 0, null, false, 0, 254));
                } else {
                    if (!c350990DpR.LJIIIZ) {
                        return;
                    }
                    C350870DpF.LJIIIZ(this.LIZ, "select_slot_and_seek_to_start", new C358740E4q(nLETrackSlot, 0, null, false, 0, 250));
                }
            }
        }
    }

    @Override // X.InterfaceC353130Dst
    public final void LLJ(NLETrackSlot nLETrackSlot, long j, long j2, EnumC356070Dxd enumC356070Dxd) {
        this.LIZ.getPlayer().pause(false);
        LLJJIJIIJIL(nLETrackSlot, j, j, j2, enumC356070Dxd);
    }

    public final void LLJJIJIL(Integer num, int i, NLEModel nLEModel, long j) {
        AbstractC349500Dn2 businessTrackLinkageManager;
        if (num != null) {
            TrackLinkageManagerProvider.Companion.getClass();
            TrackLinkageManagerProvider trackLinkageManagerProviderLIZ = C356700Dye.LIZ();
            if (trackLinkageManagerProviderLIZ != null && (businessTrackLinkageManager = trackLinkageManagerProviderLIZ.getBusinessTrackLinkageManager()) != null) {
                ArrayList arrayList = new ArrayList();
                int iIntValue = num.intValue() + i;
                for (int iIntValue2 = num.intValue(); iIntValue2 < iIntValue; iIntValue2++) {
                    NLETrackSlot nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(iIntValue2, this.LIZ.Rn().getSortedSlots());
                    if (nLETrackSlot != null) {
                        arrayList.add(new C349470Dmz(null, nLETrackSlot, new Pair(-1, Integer.valueOf(iIntValue2)), null, 24));
                    }
                }
                businessTrackLinkageManager.LIZJ(new C349510Dn3("add_video", arrayList, nLEModel));
            }
        }
        C351510DqH c351510DqH = C351510DqH.LIZ;
        C0E48 c0e48 = this.LIZ;
        c351510DqH.getClass();
        C351510DqH.LIZIZ(j, c0e48);
        C350110Do1.LJFF(LLZ());
    }

    @Override // X.InterfaceC353130Dst
    public final void LJIILJJIL(NLETrackSlot nLETrackSlot, long j, long j2, long j3, EnumC356070Dxd enumC356070Dxd) {
        LLJJIJIIJIL(nLETrackSlot, j, j2, j3, enumC356070Dxd);
    }

    @Override // X.InterfaceC353130Dst
    public final void LLFZ(NLETrackSlot nLETrackSlot, long j, long j2, int i, EnumC356070Dxd enumC356070Dxd) {
        long maxEnd;
        long maxEnd2;
        AbstractC349500Dn2 businessTrackLinkageManager;
        NLETrackSlot renderProxy;
        NLESegment mainSegment;
        NLERenderProxySegment nLERenderProxySegmentDynamicCast;
        NLEResourceAV aVFile;
        long maxEnd3;
        long endTime;
        this.LIZ.getPlayer().pause(false);
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (nLESegmentVideoDynamicCast == null) {
            return;
        }
        if (Math.abs(j2 - C351220Dpo.LLLLLLL(nLESegmentVideoDynamicCast.getTimeClipEnd() - nLESegmentVideoDynamicCast.getTimeClipStart())) < 3) {
            if (i == 0) {
                endTime = nLETrackSlot.getStartTime();
            } else {
                endTime = nLETrackSlot.getEndTime();
            }
            this.LIZ.getPlayer().LJIJI(endTime, C351110Dpd.LIZ);
            return;
        }
        if (Boolean.parseBoolean(nLETrackSlot.getExtra("is_black_frame"))) {
            NLEModel nLEModelLJI = C350870DpF.LJI(this.LIZ);
            NLETrack mainTrack = nLEModelLJI.getMainTrack();
            if (mainTrack != null) {
                maxEnd3 = mainTrack.getMaxEnd();
            } else {
                maxEnd3 = 0;
            }
            long j3 = maxEnd3 + (1000 * j2);
            for (NLETrack nLETrack : nLEModelLJI.getTracks()) {
                if (!nLETrack.getMainTrack()) {
                    Iterator it2 = new C13EO(nLETrack.getSlots()).iterator();
                    while (true) {
                        C13EN c13en = (C13EN) it2;
                        if (c13en.hasNext()) {
                            NLETrackSlot nLETrackSlot2 = (NLETrackSlot) c13en.next();
                            if (((int) nLETrackSlot2.getEndTime()) != -2 && nLETrackSlot2.getEndTime() > j3) {
                                if (nLETrackSlot2.getStartTime() > j3) {
                                    if (!C351220Dpo.LLILLL(nLETrack) && !C351220Dpo.LLJILLL(nLETrack)) {
                                        nLETrack.removeSlot(nLETrackSlot2);
                                    } else {
                                        C350870DpF.LJIIIZ(this.LIZ, "value_black_slot_delete_music", Unit.LIZ);
                                    }
                                } else {
                                    long endTime2 = (long) ((nLETrackSlot2.getEndTime() - j3) * C351220Dpo.LJLILLLLZI(nLETrackSlot2.getMainSegment()));
                                    nLETrackSlot2.setEndTime(j3);
                                    NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot2.getMainSegment());
                                    if (nLESegmentAudioDynamicCast != null) {
                                        nLESegmentAudioDynamicCast.setTimeClipEnd(nLESegmentAudioDynamicCast.getTimeClipEnd() - endTime2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            LLJJ(C051R.LIZIZ(new C0E1X(C0E1V.CLIP.getNameId(), null, null, null, null, 30)), enumC356070Dxd);
            return;
        }
        NLEModel nLEModelDynamicCast = NLEModel.dynamicCast(C350870DpF.LJI(this.LIZ).deepClone());
        NLETrackSlot nLETrackSlotDynamicCast = NLETrackSlot.dynamicCast(nLETrackSlot.deepClone());
        NLETrack mainTrack2 = LLZ().getMainTrack();
        if (mainTrack2 != null) {
            maxEnd = mainTrack2.getMaxEnd();
        } else {
            maxEnd = 0;
        }
        long j4 = LSPassThroughRecordSizeConfig.DEFAULT;
        long j5 = j * j4;
        nLESegmentVideoDynamicCast.setTimeClipStart(j5);
        long j6 = j5 + (j4 * j2);
        nLESegmentVideoDynamicCast.setTimeClipEnd(j6);
        nLETrackSlot.setEndTime(nLETrackSlot.getStartTime() + nLESegmentVideoDynamicCast.getDuration());
        if (C352310DrZ.LIZ(nLESegmentVideoDynamicCast.getDuration()) < 200) {
            nLETrackSlot.setEndTransition(null);
            NLETrackSlot nLETrackSlot3 = (NLETrackSlot) C13LP.LJJJLZIJ(this.LIZ.Rn().getSortedSlots().indexOf(nLETrackSlot) - 1, this.LIZ.Rn().getSortedSlots());
            if (nLETrackSlot3 != null) {
                nLETrackSlot3.setEndTransition(null);
            }
        }
        if (C351220Dpo.LLJJIJIL(nLETrackSlot)) {
            C351510DqH.LIZ.getClass();
            if (C351510DqH.LJJIL(nLETrackSlot) && (renderProxy = nLETrackSlot.getRenderProxy()) != null && (mainSegment = renderProxy.getMainSegment()) != null && (nLERenderProxySegmentDynamicCast = NLERenderProxySegment.dynamicCast(mainSegment)) != null && (aVFile = nLERenderProxySegmentDynamicCast.getAVFile()) != null) {
                aVFile.setDuration(j6);
            }
            NLEResourceNode resource = nLESegmentVideoDynamicCast.getResource();
            if (resource != null) {
                resource.setDuration(j6);
            }
        }
        this.LIZ.Rn().timeSort();
        if (!this.LIZ.Rn().hasExtra("track_extra_is_video_adjust_duration")) {
            this.LIZ.Rn().setExtra("track_extra_is_video_adjust_duration", "true");
        }
        C350110Do1.LJIIJ(nLESegmentVideoDynamicCast.getTimeClipStart(), LLZ(), nLESegmentVideoDynamicCast.getTimeClipEnd(), nLETrackSlot);
        if (C351230Dpp.LJ(null)) {
            C350690Dox.LJFF(nLETrackSlotDynamicCast, nLETrackSlot, this.LIZ);
        }
        this.LIZ.og().LJJIJL(nLETrackSlot, null);
        TrackLinkageManagerProvider.Companion.getClass();
        TrackLinkageManagerProvider trackLinkageManagerProviderLIZ = C356700Dye.LIZ();
        if (trackLinkageManagerProviderLIZ != null && (businessTrackLinkageManager = trackLinkageManagerProviderLIZ.getBusinessTrackLinkageManager()) != null) {
            businessTrackLinkageManager.LIZJ(new C349510Dn3("clip_video", C1697810uHb.LJ(new C349470Dmz(nLETrackSlotDynamicCast, nLETrackSlot, null, Integer.valueOf(i), 20)), nLEModelDynamicCast));
        }
        if (!((Boolean) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_OPERATE_CAUSE_BLACK_SLOT, Boolean.TRUE)).booleanValue()) {
            C351510DqH.LJIIIZ(C351510DqH.LIZ, this.LIZ);
        }
        NLETrack mainTrack3 = LLZ().getMainTrack();
        if (mainTrack3 != null) {
            maxEnd2 = mainTrack3.getMaxEnd();
        } else {
            maxEnd2 = 0;
        }
        if (maxEnd2 > maxEnd) {
            C351510DqH c351510DqH = C351510DqH.LIZ;
            C0E48 c0e48 = this.LIZ;
            c351510DqH.getClass();
            C351510DqH.LIZIZ(maxEnd, c0e48);
        }
        C350110Do1.LJIILL(LLZ());
        LLJJ(C051R.LIZIZ(new C0E1X(C0E1V.CLIP.getNameId(), null, null, null, null, 30)), enumC356070Dxd);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void LLJJIJIIJIL(NLETrackSlot nLETrackSlot, long j, long j2, long j3, EnumC356070Dxd enumC356070Dxd) {
        int i;
        String strLJLLJ;
        NLESegmentVideo nLESegmentVideoDynamicCast;
        NLESegmentAudio nLESegmentAudioDynamicCast;
        VecNLETrackSlotSPtr slots;
        NLETrackType nLETrackTypeLJIIIIZZ;
        long j4 = j;
        if (nLETrackSlot.getStartTime() + j4 <= 1000) {
            j4 = -nLETrackSlot.getStartTime();
        }
        if (!C351220Dpo.LLJJI(nLETrackSlot) && !C351220Dpo.LLLLIL(nLETrackSlot)) {
            NLETrack trackBySlot = LLZ().getTrackBySlot(nLETrackSlot);
            if (trackBySlot != null && (nLETrackTypeLJIIIIZZ = C350870DpF.LJIIIIZZ(trackBySlot)) != null) {
                i = C347380Djc.LIZ[nLETrackTypeLJIIIIZZ.ordinal()];
            } else {
                i = -1;
            }
            if (i == 1) {
                strLJLLJ = "audio";
            } else if (i == 2) {
                strLJLLJ = "video";
            } else if (i == 3) {
                strLJLLJ = "sticker";
            } else if (i != 4) {
                NLETrack trackBySlot2 = LLZ().getTrackBySlot(nLETrackSlot);
                if (trackBySlot2 == null || (strLJLLJ = C351220Dpo.LJLLJ(trackBySlot2)) == null) {
                    return;
                }
            } else if (C351220Dpo.LLJJIII(trackBySlot)) {
                strLJLLJ = "video_effect";
            } else {
                strLJLLJ = "";
            }
            switch (strLJLLJ.hashCode()) {
                case -1890252483:
                    if (strLJLLJ.equals("sticker")) {
                        nLETrackSlot.setStartTime(nLETrackSlot.getStartTime() + j4);
                        nLETrackSlot.setEndTime(nLETrackSlot.getStartTime() + j3);
                        long jLongValue = ((long) ((int) j2)) + ((Number) C349660DnI.LIZ(nLETrackSlot).getFirst()).longValue();
                        C349660DnI.LIZIZ(jLongValue, nLETrackSlot, j3 + jLongValue);
                        LLJJ(null, enumC356070Dxd);
                    }
                    break;
                case -422099471:
                    if (strLJLLJ.equals("type_filter_adjust")) {
                        nLETrackSlot.setStartTime(nLETrackSlot.getStartTime() + j4);
                        nLETrackSlot.setEndTime(nLETrackSlot.getStartTime() + j3);
                        Iterator it2 = ((ArrayList) C351220Dpo.LJIIIIZZ(C350870DpF.LJI(this.LIZ), nLETrackSlot)).iterator();
                        while (it2.hasNext()) {
                            NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) C13LP.LJJJLL(((NLETrack) it2.next()).getSlots());
                            if (nLETimeSpaceNode != null) {
                                nLETimeSpaceNode.setStartTime(nLETimeSpaceNode.getStartTime() + j4);
                                nLETimeSpaceNode.setEndTime(nLETimeSpaceNode.getStartTime() + j3);
                            }
                        }
                        LLJJ(null, enumC356070Dxd);
                    }
                    break;
                case -409423403:
                    if (strLJLLJ.equals("video_effect")) {
                        nLETrackSlot.setStartTime(nLETrackSlot.getStartTime() + j4);
                        nLETrackSlot.setEndTime(j4 + j3);
                        this.LIZ.og().LJJIJL(nLETrackSlot, null);
                        LLJJ(null, enumC356070Dxd);
                    }
                    break;
                case -274277926:
                    if (strLJLLJ.equals("type_filter_filter")) {
                        nLETrackSlot.setStartTime(nLETrackSlot.getStartTime() + j4);
                        nLETrackSlot.setEndTime(nLETrackSlot.getStartTime() + j3);
                        this.LIZ.og().LJJIJL(nLETrackSlot, null);
                        if (C351220Dpo.LLJ(nLETrackSlot)) {
                            nLETrackSlot.setExtra("is_ep_clip_global_color_filter", "true");
                        }
                        LLJJ(null, enumC356070Dxd);
                    }
                    break;
                case 93166550:
                    if (strLJLLJ.equals("audio") && (nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment())) != null) {
                        nLETrackSlot.setStartTime(nLETrackSlot.getStartTime() + j4);
                        nLETrackSlot.setEndTime(nLETrackSlot.getStartTime() + j3);
                        nLESegmentAudioDynamicCast.setTimeClipStart(nLESegmentAudioDynamicCast.getTimeClipStart() + j2);
                        nLESegmentAudioDynamicCast.setTimeClipEnd((long) (nLESegmentAudioDynamicCast.getTimeClipStart() + (j3 * nLESegmentAudioDynamicCast.getAbsSpeed())));
                        NLEFilter filterByName = nLETrackSlot.getFilterByName(NLEEditorJniJNI.NLEFilterName_getAUDIO_FADE_FILTER());
                        if (filterByName != null) {
                            NLESegmentAudioFadeFilter nLESegmentAudioFadeFilterDynamicCast = NLESegmentAudioFadeFilter.dynamicCast((NLENode) filterByName.getSegment());
                            if (nLESegmentAudioFadeFilterDynamicCast != null) {
                                long fadeInLength = nLESegmentAudioFadeFilterDynamicCast.getFadeInLength();
                                long j5 = j3 / ((long) 2);
                                if (fadeInLength > j5) {
                                    fadeInLength = j5;
                                }
                                nLESegmentAudioFadeFilterDynamicCast.setFadeInLength(fadeInLength);
                                long fadeOutLength = nLESegmentAudioFadeFilterDynamicCast.getFadeOutLength();
                                if (fadeOutLength <= j5) {
                                    j5 = fadeOutLength;
                                }
                                nLESegmentAudioFadeFilterDynamicCast.setFadeOutLength(j5);
                            }
                            long fadeInLength2 = nLESegmentAudioDynamicCast.getFadeInLength();
                            long j6 = j3 / ((long) 2);
                            if (fadeInLength2 > j6) {
                                fadeInLength2 = j6;
                            }
                            nLESegmentAudioDynamicCast.setFadeInLength(fadeInLength2);
                            long fadeOutLength2 = nLESegmentAudioDynamicCast.getFadeOutLength();
                            if (fadeOutLength2 <= j6) {
                                j6 = fadeOutLength2;
                            }
                            nLESegmentAudioDynamicCast.setFadeOutLength(j6);
                        }
                        if (!trackBySlot.hasExtra("track_extra_is_audio_adjust_duration")) {
                            trackBySlot.setExtra("track_extra_is_audio_adjust_duration", "true");
                        }
                        this.LIZ.og().LJJIJL(nLETrackSlot, null);
                        if (C351220Dpo.LLLFF(trackBySlot) && (slots = trackBySlot.getSlots()) != null && slots.size() > 1) {
                            trackBySlot.setExtra("is_ep_multi_music", "true");
                        }
                        LLJJ(null, enumC356070Dxd);
                        break;
                    }
                    break;
                case 112202875:
                    if (strLJLLJ.equals("video") && (nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment())) != null) {
                        NLETrackSlot nLETrackSlotDynamicCast = NLETrackSlot.dynamicCast(nLETrackSlot.deepClone());
                        nLETrackSlot.setStartTime(nLETrackSlot.getStartTime() + j4);
                        nLETrackSlot.setEndTime(nLETrackSlot.getStartTime() + j3);
                        if (C351220Dpo.LLJJIJIL(nLETrackSlot)) {
                            nLESegmentVideoDynamicCast.setTimeClipStart(nLESegmentVideoDynamicCast.getTimeClipStart() + ((long) ((int) j2)));
                            nLESegmentVideoDynamicCast.setTimeClipEnd(nLESegmentVideoDynamicCast.getTimeClipStart() + ((long) (j3 * nLESegmentVideoDynamicCast.getAbsSpeed())));
                            NLEResourceNode resource = nLESegmentVideoDynamicCast.getResource();
                            if (resource != null) {
                                resource.setDuration(j3);
                            }
                        } else {
                            nLESegmentVideoDynamicCast.setTimeClipStart(nLESegmentVideoDynamicCast.getTimeClipStart() + ((long) (j2 * C351220Dpo.LIZ(nLESegmentVideoDynamicCast))));
                            nLESegmentVideoDynamicCast.setTimeClipEnd(nLESegmentVideoDynamicCast.getTimeClipStart() + ((long) (j3 * C351220Dpo.LIZ(nLESegmentVideoDynamicCast))));
                        }
                        this.LIZ.og().LJJIJL(nLETrackSlot, null);
                        C350110Do1.LJI(LLZ(), nLETrackSlot);
                        if (C351230Dpp.LJ(null)) {
                            C350690Dox.LJFF(nLETrackSlotDynamicCast, nLETrackSlot, this.LIZ);
                        }
                        LLJJ(null, enumC356070Dxd);
                        break;
                    }
                    break;
            }
            return;
        }
        C355090Dw3.LIZ("onClip track slot");
        nLETrackSlot.setStartTime(nLETrackSlot.getStartTime() + j4);
        nLETrackSlot.setEndTime(nLETrackSlot.getStartTime() + j3);
        LLJJ(null, enumC356070Dxd);
        if (C351220Dpo.LLLLIL(nLETrackSlot)) {
            C350700Doy.LJIIIZ(C350870DpF.LJI(this.LIZ), nLETrackSlot);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    @Override // X.InterfaceC353130Dst
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLD(int r33, int r34, com.bytedance.ies.nle.editor_jni.NLETrackSlot r35, long r36, long r38, long r40, boolean r42, X.EnumC356070Dxd r43) {
        /*
            Method dump skipped, instruction units count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C350980DpQ.LLD(int, int, com.bytedance.ies.nle.editor_jni.NLETrackSlot, long, long, long, boolean, X.0Dxd):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03f3 A[LOOP:8: B:155:0x03ed->B:157:0x03f3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0289  */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v31, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v32, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v33, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v34, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v35, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v36, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v37, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v38, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v39, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v44, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJJ(java.lang.String r42, com.bytedance.ies.nle.editor_jni.NLETrackSlot r43, long r44, int r46, int r47, long r48, boolean r50, com.bytedance.ies.nle.editor_jni.NLETrack r51, X.EnumC356070Dxd r52) {
        /*
            Method dump skipped, instruction units count: 2488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C350980DpQ.LLJJJ(java.lang.String, com.bytedance.ies.nle.editor_jni.NLETrackSlot, long, int, int, long, boolean, com.bytedance.ies.nle.editor_jni.NLETrack, X.0Dxd):void");
    }
}
