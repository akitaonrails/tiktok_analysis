package X;

import android.os.Build;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLEMaskSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EYc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C366400EYc {
    public static final C366400EYc LIZ = new C366400EYc();
    public static final C379390Eu9 LIZIZ = new C379390Eu9();
    public static final List<String> LIZJ = C1697810uHb.LJIIJJI("in_video_anim", "out_video_anim", "combo_video_anim");

    public static void LIZ(List list) {
        final AFwS234S0000000_5 aFwS234S0000000_5 = AFwS234S0000000_5.get$arr$(515);
        if (Build.VERSION.SDK_INT >= 24) {
            list.removeIf(new Predicate() { // from class: X.0EYd
                @Override // java.util.function.Predicate
                public final /* synthetic */ boolean test(Object obj) {
                    return ((Boolean) aFwS234S0000000_5.invoke(obj)).booleanValue();
                }
            });
            return;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (((Boolean) aFwS234S0000000_5.invoke(it2.next())).booleanValue()) {
                it2.remove();
            }
        }
    }

    public static boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        if ((!videoPublishEditModel.isMvThemeVideoType() || videoPublishEditModel.isPhotoMvMode()) && !videoPublishEditModel.isCurrentAutoCutMode()) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ(String str) {
        List<String> list = LIZJ;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(str, it2.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJFF(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel) {
        MultiEditVideoRecordData multiEditVideoRecordData;
        List<MultiEditVideoSegmentRecordData> list;
        VecNLETrackSlotSPtr slots;
        VecNLETrackSlotSPtr slots2;
        if (videoPublishEditModel.isTimeEffectApply()) {
            return true;
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_edit_enable_time_effect_category", true, true) && videoPublishEditModel.getCanvasVideoData() == null && !videoPublishEditModel.isStitchMode() && !videoPublishEditModel.isMvThemeVideoType() && !videoPublishEditModel.isCutSameVideoType() && videoPublishEditModel.creativeModel.inlineCaptionModel == null) {
            if (nLEModel != null) {
                NLETrack mainTrack = nLEModel.getMainTrack();
                if (mainTrack != null && (slots2 = mainTrack.getSlots()) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (NLETrackSlot nLETrackSlot : slots2) {
                        if (nLETrackSlot.getKeyframes().size() > 0) {
                            arrayList.add(nLETrackSlot);
                        }
                    }
                    if (arrayList.size() > 0) {
                        return false;
                    }
                }
                NLETrack mainTrack2 = nLEModel.getMainTrack();
                if (mainTrack2 != null && (slots = mainTrack2.getSlots()) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (NLETrackSlot nLETrackSlot2 : slots) {
                        if (nLETrackSlot2.getSwingKeyframes().size() > 0) {
                            arrayList2.add(nLETrackSlot2);
                        }
                    }
                    if (arrayList2.size() > 0) {
                        return false;
                    }
                }
                VecNLETrackSPtr tracks = nLEModel.getTracks();
                if (tracks != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (NLETrack nLETrack : tracks) {
                        NLETrack nLETrack2 = nLETrack;
                        if (NLETrackType.VIDEO == nLETrack2.getTrackType() && nLETrack2.getEnable()) {
                            arrayList3.add(nLETrack);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList4);
                    }
                    if (!arrayList4.isEmpty()) {
                        Iterator it3 = arrayList4.iterator();
                        while (it3.hasNext()) {
                            VecNLEMaskSPtr masks = ((NLETrackSlot) it3.next()).getMasks();
                            if (masks != null && C13LP.LJJJLL(masks) != null) {
                                return false;
                            }
                        }
                    }
                }
                VecNLETrackSPtr tracks2 = nLEModel.getTracks();
                if (tracks2 != null) {
                    ArrayList arrayList5 = new ArrayList();
                    for (NLETrack nLETrack3 : tracks2) {
                        if (NLETrackType.VIDEO == nLETrack3.getTrackType()) {
                            arrayList5.add(nLETrack3);
                        }
                    }
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it4 = arrayList5.iterator();
                    while (it4.hasNext()) {
                        C19719612Di.LJJI(((NLETrack) it4.next()).getSlots(), arrayList6);
                    }
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj : arrayList6) {
                        if (((NLETrackSlot) obj).getAIMatting() != null) {
                            arrayList7.add(obj);
                        }
                    }
                    if (arrayList7.size() > 0) {
                        return false;
                    }
                }
                if (videoPublishEditModel.getEditorProModel().isPipUsed()) {
                    return false;
                }
                MultiEditVideoStatusRecordData multiEditVideoRecordData2 = videoPublishEditModel.getMultiEditVideoRecordData();
                if (multiEditVideoRecordData2 != null && (multiEditVideoRecordData = multiEditVideoRecordData2.curMultiEditVideoRecordData) != null && (list = multiEditVideoRecordData.segmentDataList) != null && !list.isEmpty()) {
                    Iterator<MultiEditVideoSegmentRecordData> it5 = list.iterator();
                    while (it5.hasNext()) {
                        String str = it5.next().audioPath;
                        if (str == null || str.length() == 0) {
                            if (!list.isEmpty()) {
                                for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
                                    if (C123100dR.LIZ(multiEditVideoSegmentRecordData.audioPath) && !Intrinsics.LJFF(multiEditVideoSegmentRecordData.videoPath, multiEditVideoSegmentRecordData.audioPath)) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (!videoPublishEditModel.isCurrentAutoCutMode() && !videoPublishEditModel.hasExtendMusic() && !videoPublishEditModel.isLivePhotoEdit()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void LJI(NLEModel nLEModel, VideoPublishEditModel videoPublishEditModel, Map map) {
        boolean zBooleanValue;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 1;
        if (map == null) {
            List<NLETrack> listLIZ = C348520DlS.LIZ(nLEModel);
            ArrayList arrayList = new ArrayList();
            Iterator<NLETrack> it2 = listLIZ.iterator();
            while (it2.hasNext()) {
                C19719612Di.LJJI(it2.next().getSlots(), arrayList);
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                String extra = ((NLENode) it3.next()).getExtra("extra_video_effect_source");
                if (extra == null) {
                    extra = CardStruct.IStatusCode.DEFAULT;
                }
                if (extra.length() > 0) {
                    linkedHashMap.put(Integer.valueOf(CastIntegerProtector.parseInt(extra)), Boolean.TRUE);
                }
            }
            map = linkedHashMap;
        }
        if (map.isEmpty()) {
            videoPublishEditModel.setEffectSource(false, -1);
            return;
        }
        Boolean bool = (Boolean) map.get(Integer.valueOf(EnumC356310Dy1.MULTI_TRACK.getValue()));
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (!Intrinsics.LJFF(map.get(Integer.valueOf(EnumC356310Dy1.EDITOR_PRO.getValue())), Boolean.TRUE)) {
            i = 0;
        } else if (map.size() != 1) {
            i = 2;
        }
        videoPublishEditModel.setEffectSource(zBooleanValue, i);
    }

    public static void LJ(List list, boolean z, boolean z2, boolean z3) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Effect effect = (Effect) it2.next();
            if (!z) {
                C1446130njf.LIZ.getClass();
                if (!C1446130njf.LIZIZ(effect, "tt_prop", false)) {
                }
            }
            if (!z3) {
                C1446130njf.LIZ.getClass();
                if (!C1446130njf.LIZIZ(effect, "if_goto_capcut", false)) {
                }
            }
            if (!z2) {
                C1446130njf.LIZ.getClass();
                if (C1446130njf.LIZIZ(effect, "if_capcut", false)) {
                }
            }
            arrayList.add(effect);
        }
        list.clear();
        list.addAll(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r7, com.bytedance.ies.nle.editor_jni.NLEVEOperationResType r8, com.bytedance.ies.nle.editor_jni.NLEResourceNode r9, int r10, com.bytedance.ies.nle.editor_jni.NLERenderAction r11, boolean r12) {
        /*
            if (r10 != 0) goto L3
            return
        L3:
            if (r8 != 0) goto La4
            r1 = -1
        L6:
            r6 = 3
            r5 = 1
            java.lang.String r2 = ""
            r4 = 2
            if (r1 == r5) goto La0
            if (r1 == r4) goto L9c
            if (r1 == r6) goto L98
            r0 = 4
            if (r1 == r0) goto L95
            r0 = 5
            if (r1 == r0) goto L92
            r3 = r2
        L18:
            if (r11 == 0) goto L90
            int[] r1 = X.C1778540wNo.LIZIZ
            int r0 = r11.ordinal()
            r0 = r1[r0]
            if (r0 == r5) goto L8d
            if (r0 == r4) goto L8a
            if (r0 != r6) goto L90
            java.lang.String r4 = "update"
        L2a:
            r1 = 0
            java.lang.String r0 = "effect"
            boolean r0 = kotlin.text.a0.LJJIIZI(r3, r0, r1)
            if (r0 == 0) goto L89
            if (r9 == 0) goto L3c
            java.lang.String r0 = r9.getResourceId()
            if (r0 == 0) goto L3c
            r2 = r0
        L3c:
            X.0msx r0 = X.C1413450msx.LIZ
            r0.getClass()
            X.0LAB r1 = X.C1413450msx.LJI(r7)
            java.lang.String r0 = "effect_id"
            r1.LJ(r0, r2)
            java.lang.String r0 = "media_type"
            r1.LJ(r0, r3)
            java.lang.String r0 = "action_type"
            r1.LJ(r0, r4)
            java.lang.String r0 = "is_editor_pro"
            r1.LIZ(r12, r0)
            java.util.List<X.09Fs> r0 = X.C2341909Fp.LIZ
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.LIZ
            java.lang.String r0 = "effect_operate_fail"
            X.C2341909Fp.LIZ(r0, r1)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "onVEOperationEvent -> \nveResult= "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = ",typeStr="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", actionStr="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", resourceId="
            r1.append(r0)
            r1.append(r2)
            X.C2188811AlT.LIZIZ(r1)
        L89:
            return
        L8a:
            java.lang.String r4 = "delete"
            goto L2a
        L8d:
            java.lang.String r4 = "insert"
            goto L2a
        L90:
            r4 = r2
            goto L2a
        L92:
            java.lang.String r3 = "effect_time"
            goto L18
        L95:
            java.lang.String r3 = "effect_composer"
            goto L18
        L98:
            java.lang.String r3 = "effect_normal"
            goto L18
        L9c:
            java.lang.String r3 = "effect_amazing"
            goto L18
        La0:
            java.lang.String r3 = "video"
            goto L18
        La4:
            int[] r1 = X.C1778540wNo.LIZ
            int r0 = r8.ordinal()
            r1 = r1[r0]
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C366400EYc.LIZLLL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, com.bytedance.ies.nle.editor_jni.NLEVEOperationResType, com.bytedance.ies.nle.editor_jni.NLEResourceNode, int, com.bytedance.ies.nle.editor_jni.NLERenderAction, boolean):void");
    }
}
