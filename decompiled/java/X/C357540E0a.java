package X;

import Y.AComparatorS24S0000000_5;
import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLEAIMatting;
import com.bytedance.ies.nle.editor_jni.NLECanvasType;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAIMatting;
import com.bytedance.ies.nle.editor_jni.NLESegmentFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentHSLFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentSubtitleSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStringFloatPair;
import com.bytedance.ies.nle.editor_jni.NLEStyCanvas;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.VecNLEMattingStroke;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEVideoAnimationSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS249S0300000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0E0a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C357540E0a {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LJIIJJI() {
        return C0BYR.LIZ() || C0C64.LJIILLIIL().LJIIIZ(31744, "studio_editor_pro_enable_cutout_in_pugc", true, false) || C301700Bs8.LIZ() || C0C64.LJIILLIIL().LJIIIZ(31744, "studio_editor_pro_enable_custom_cutout_in_pugc", true, false);
    }

    public static boolean LIZ(NLEModel nLEModel) {
        if (LJIIJJI()) {
            return true;
        }
        C376890Eq7.LIZ.getClass();
        return C376890Eq7.LIZJ(nLEModel);
    }

    @InterfaceC1294060jmO
    public static boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        String openEditToolType;
        EditorProModel editorProModel;
        if (LJIIJJI() || C376910Eq9.LIZIZ.LIZJ(videoPublishEditModel)) {
            return true;
        }
        if (videoPublishEditModel != null && (editorProModel = videoPublishEditModel.getEditorProModel()) != null) {
            openEditToolType = editorProModel.getOpenEditToolType();
        } else {
            openEditToolType = null;
        }
        if (Intrinsics.LJFF("cutout", openEditToolType)) {
            return true;
        }
        return false;
    }

    public static void LIZJ(NLEModel nLEModel) {
        NLESegment mainSegment;
        NLEResType resourceType;
        NLESegment mainSegment2;
        NLEResourceNode effectSDKFile;
        NLEResourceNode effectSDKFile2;
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if (C350870DpF.LJIIIIZZ(nLETrack2) == NLETrackType.STICKER) {
                NLETrackSlot nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(nLETrack2.getSortedSlots());
                NLEResType resourceType2 = null;
                if (nLETrackSlot != null) {
                    mainSegment = nLETrackSlot.getMainSegment();
                } else {
                    mainSegment = null;
                }
                NLESegmentSubtitleSticker nLESegmentSubtitleStickerDynamicCast = NLESegmentSubtitleSticker.dynamicCast((NLENode) mainSegment);
                if (nLESegmentSubtitleStickerDynamicCast != null && (effectSDKFile2 = nLESegmentSubtitleStickerDynamicCast.getEffectSDKFile()) != null) {
                    resourceType = effectSDKFile2.getResourceType();
                } else {
                    resourceType = null;
                }
                if (resourceType != NLEResType.SUBTITLE_STICKER) {
                    NLETrackSlot nLETrackSlot2 = (NLETrackSlot) C13LP.LJJJLL(nLETrack2.getSortedSlots());
                    if (nLETrackSlot2 != null) {
                        mainSegment2 = nLETrackSlot2.getMainSegment();
                    } else {
                        mainSegment2 = null;
                    }
                    NLESegmentSubtitleSticker nLESegmentSubtitleStickerDynamicCast2 = NLESegmentSubtitleSticker.dynamicCast((NLENode) mainSegment2);
                    if (nLESegmentSubtitleStickerDynamicCast2 != null && (effectSDKFile = nLESegmentSubtitleStickerDynamicCast2.getEffectSDKFile()) != null) {
                        resourceType2 = effectSDKFile.getResourceType();
                    }
                    if (resourceType2 == NLEResType.AUTOSUBTITLE_STICKER) {
                    }
                }
                arrayList.add(nLETrack);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((NLENode) it2.next()).setEnable(false);
        }
    }

    public static void LIZLLL(NLEModel nLEModel) {
        if (nLEModel.getMainTrack() != null) {
            return;
        }
        NLETrack nLETrack = new NLETrack();
        nLETrack.setMainTrack(true);
        nLETrack.setEndTime(0L);
        nLETrack.setDuration(0L);
        nLEModel.addTrack(nLETrack);
        nLEModel.setDuration(0L);
    }

    public static Pair LJ(NLEModel nLEModel) {
        int i;
        boolean z;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList<NLENode> arrayList = new ArrayList(C351220Dpo.LJJJJL(nLEModel));
        arrayList.addAll(C351220Dpo.LJJLIIIJJIZ(nLEModel));
        int i2 = 0;
        for (NLENode nLENode : arrayList) {
            if (!Intrinsics.LJFF(nLENode.getExtra("adjust_filter_add_from"), "EDITOR_PRO")) {
                i = 0;
            } else {
                NLESegmentFilter nLESegmentFilterDynamicCast = NLESegmentFilter.dynamicCast(nLENode);
                if (nLESegmentFilterDynamicCast != null) {
                    if (nLESegmentFilterDynamicCast.getFilterName().length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && nLESegmentFilterDynamicCast.getIntensity() != 0.0f && !Intrinsics.LJFF(nLESegmentFilterDynamicCast.getFilterName(), EnumC355950DxR.COMBINE_ADJUST.getNleName()) && !Intrinsics.LJFF(nLESegmentFilterDynamicCast.getFilterName(), EnumC355950DxR.AUTO_ADJUST.getNleName()) && !Intrinsics.LJFF(nLESegmentFilterDynamicCast.getFilterName(), EnumC355950DxR.HSL.getNleName())) {
                        linkedHashSet.add(nLESegmentFilterDynamicCast.getFilterName());
                        i = 1;
                    } else {
                        i = 0;
                    }
                    for (NLEStringFloatPair nLEStringFloatPair : nLESegmentFilterDynamicCast.getAdjustParamss()) {
                        if (nLEStringFloatPair.getSecond() != 0.0f) {
                            linkedHashSet.add(nLEStringFloatPair.getFirst());
                            i++;
                        }
                    }
                } else {
                    i = 0;
                }
                NLESegmentHSLFilter nLESegmentHSLFilterDynamicCast = NLESegmentHSLFilter.dynamicCast(nLENode);
                if (nLESegmentHSLFilterDynamicCast != null && C351220Dpo.LLLLII(nLESegmentHSLFilterDynamicCast)) {
                    i++;
                    linkedHashSet.add(nLESegmentHSLFilterDynamicCast.getFilterName());
                }
            }
            i2 += i;
        }
        return new Pair(Integer.valueOf(i2), C13LP.LJJLIIIJ(linkedHashSet, ",", null, null, 0, null, null, 62));
    }

    public static String LJFF(NLEModel nLEModel) {
        NLETrack mainTrack;
        VecNLETrackSlotSPtr sortedSlots;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (nLEModel != null && (mainTrack = nLEModel.getMainTrack()) != null && (sortedSlots = mainTrack.getSortedSlots()) != null) {
            for (NLETrackSlot nLETrackSlot : sortedSlots) {
                if (C351220Dpo.LJZI(nLETrackSlot)) {
                    String extra = nLETrackSlot.getExtra("ep_curve_speed_english_name");
                    if (extra.length() > 0) {
                        linkedHashSet.add(extra);
                    }
                }
            }
        }
        return C13LP.LJJLIIIJ(linkedHashSet, ",", null, null, 0, null, null, 62);
    }

    public static int LJII(NLEModel nLEModel) {
        VecNLETrackSPtr tracks;
        int i = 0;
        if (nLEModel != null && (tracks = nLEModel.getTracks()) != null) {
            ArrayList<NLETrackSlot> arrayList = new ArrayList();
            Iterator<NLETrack> it2 = tracks.iterator();
            while (it2.hasNext()) {
                C19719612Di.LJJI(it2.next().getSlots(), arrayList);
            }
            for (NLETrackSlot nLETrackSlot : arrayList) {
                C351510DqH.LIZ.getClass();
                if (C351510DqH.LJJIL(nLETrackSlot) && C351510DqH.LJJIJLIJ(nLETrackSlot.getRenderProxy())) {
                    i++;
                }
                for (NLEVideoEffect nLEVideoEffect : nLETrackSlot.getVideoEffects()) {
                    C351510DqH.LIZ.getClass();
                    if (C351510DqH.LJJIJIL(nLEVideoEffect)) {
                        i++;
                    }
                }
                for (NLEFilter nLEFilter : nLETrackSlot.getFilters()) {
                    C351510DqH.LIZ.getClass();
                    if (C351510DqH.LJJIJL(nLEFilter)) {
                        i++;
                    }
                }
            }
        }
        return i;
    }

    public static List LJIIIIZZ(NLEModel nLEModel) {
        NLETrack mainTrack;
        VecNLETrackSlotSPtr sortedSlots;
        if (nLEModel != null && (mainTrack = nLEModel.getMainTrack()) != null && (sortedSlots = mainTrack.getSortedSlots()) != null) {
            ArrayList arrayList = new ArrayList();
            for (NLETrackSlot nLETrackSlot : sortedSlots) {
                if (nLETrackSlot.hasExtra("slot_extra_transition_effect_id")) {
                    arrayList.add(nLETrackSlot);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((NLENode) it2.next()).getExtra("slot_extra_transition_effect_id"));
            }
            return arrayList2;
        }
        return null;
    }

    public static boolean LJIIL(C0E48 c0e48) {
        long jJh = c0e48.getPlayer().Jh() * 1000;
        if (!((Boolean) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_SUBTRACK_OVER_MAIN, Boolean.TRUE)).booleanValue() && (C351220Dpo.LJII(C350870DpF.LJI(c0e48)) - jJh) / ((long) LSPassThroughRecordSizeConfig.DEFAULT) < ((Number) C0E5G.LIZIZ(EnumC357850E1f.VIDEO_CLIP_MIN_DURATION, 100L)).longValue()) {
            return false;
        }
        return true;
    }

    public static boolean LJIILIIL(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        if (u.LJJIIJZLJL(str, "http://", false) || u.LJJIIJZLJL(str, "https://", false)) {
            return true;
        }
        return false;
    }

    public static boolean LJIILJJIL(NLEModel nLEModel) {
        VecNLETrackSPtr tracks;
        if (nLEModel == null || (tracks = nLEModel.getTracks()) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if (NLETrackType.VIDEO == nLETrack2.getTrackType() && !nLETrack2.getMainTrack() && nLETrack2.getEnable()) {
                arrayList.add(nLETrack);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
        }
        if (arrayList2.isEmpty()) {
            return false;
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            if (((NLETrackSlot) it3.next()).getVideoAnims().size() > 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJIILL(NLETrackSlot nLETrackSlot) {
        C351510DqH.LIZ.getClass();
        if (C351510DqH.LJJIL(nLETrackSlot) && C351510DqH.LJJIJLIJ(nLETrackSlot.getRenderProxy())) {
            return true;
        }
        for (NLEVideoEffect nLEVideoEffect : nLETrackSlot.getVideoEffects()) {
            C351510DqH.LIZ.getClass();
            if (C351510DqH.LJJIJIL(nLEVideoEffect)) {
                return true;
            }
        }
        for (NLEFilter nLEFilter : nLETrackSlot.getFilters()) {
            C351510DqH.LIZ.getClass();
            if (C351510DqH.LJJIJL(nLEFilter)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJIILLIIL(Context context) {
        if (context == null || ScreenUtils.getFullScreenHeight(context) > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(640))) {
            return false;
        }
        return true;
    }

    public static boolean LJIIZILJ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks;
        if (nLEModel == null || (tracks = nLEModel.getTracks()) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if (NLETrackType.VIDEO == nLETrack2.getTrackType() && nLETrack2.getEnable()) {
                arrayList.add(nLETrack);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
        }
        if (arrayList2.isEmpty()) {
            return false;
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            if (((NLETrackSlot) it3.next()).getAIMatting() != null) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJIJ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks;
        if (nLEModel == null || (tracks = nLEModel.getTracks()) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if (NLETrackType.VIDEO == nLETrack2.getTrackType() && nLETrack2.getEnable()) {
                arrayList.add(nLETrack);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
        }
        if (arrayList2.isEmpty()) {
            return false;
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            if (C351220Dpo.LLIZLLLIL((NLETrackSlot) it3.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJIJI(NLEModel nLEModel) {
        VecNLETrackSPtr tracks;
        if (nLEModel != null && (tracks = nLEModel.getTracks()) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<NLETrack> it2 = tracks.iterator();
            while (it2.hasNext()) {
                C19719612Di.LJJI(it2.next().getSlots(), arrayList);
            }
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (LJIILL((NLETrackSlot) it3.next())) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static boolean LJIJJ(NLEModel nLEModel) {
        NLETrack mainTrack;
        String extra;
        if (nLEModel == null || (mainTrack = nLEModel.getMainTrack()) == null || !mainTrack.hasExtra("is_editor_pro_smart_trim")) {
            return false;
        }
        NLETrack mainTrack2 = nLEModel.getMainTrack();
        if (mainTrack2 != null) {
            extra = mainTrack2.getExtra("is_editor_pro_smart_trim");
        } else {
            extra = null;
        }
        return Boolean.parseBoolean(extra);
    }

    public static boolean LJIJJLI(NLEModel nLEModel) {
        NLETrack mainTrack;
        VecNLETrackSlotSPtr sortedSlots;
        if (nLEModel == null || (mainTrack = nLEModel.getMainTrack()) == null || (sortedSlots = mainTrack.getSortedSlots()) == null || sortedSlots.isEmpty()) {
            return false;
        }
        Iterator<NLETrackSlot> it2 = sortedSlots.iterator();
        while (it2.hasNext()) {
            if (it2.next().getEndTransition() != null) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJIL(NLEModel nLEModel) {
        NLECanvasType type;
        NLEStyCanvas canvasStyle;
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        if (tracks == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (NLETrackType.VIDEO == nLETrack.getTrackType()) {
                arrayList.add(nLETrack);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
        }
        ArrayList<NLESegmentVideo> arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(NLESegmentVideo.dynamicCast((NLENode) ((NLETrackSlot) it3.next()).getMainSegment()));
        }
        if (arrayList3.isEmpty()) {
            return false;
        }
        for (NLESegmentVideo nLESegmentVideo : arrayList3) {
            NLECanvasType nLECanvasType = NLECanvasType.IMAGE;
            if (nLESegmentVideo != null && (canvasStyle = nLESegmentVideo.getCanvasStyle()) != null) {
                type = canvasStyle.getType();
            } else {
                type = null;
            }
            if (nLECanvasType == type) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJJ(NLEModel nLEModel) {
        VecNLETrackSlotSPtr slots;
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null && (slots = mainTrack.getSlots()) != null && !slots.isEmpty()) {
            Iterator<NLETrackSlot> it2 = slots.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().getExtra("extra_voice_change_from"), "EDITOR_PRO")) {
                    return true;
                }
            }
        }
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (C351220Dpo.LLILL(nLETrack)) {
                arrayList.add(nLETrack);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it3.next()).getSlots(), arrayList2);
        }
        if (!arrayList2.isEmpty()) {
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                if (Intrinsics.LJFF(((NLENode) it4.next()).getExtra("extra_voice_change_from"), "EDITOR_PRO")) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static boolean LJJI(NLEModel nLEModel) {
        boolean z;
        boolean z2;
        ArrayList arrayList = (ArrayList) C351220Dpo.LJJJJL(nLEModel);
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (C351220Dpo.LLLLIIIILLL((NLESegment) it2.next())) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        ArrayList arrayList2 = (ArrayList) C351220Dpo.LJJLIIIJJIZ(nLEModel);
        if (!arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                if (C351220Dpo.LLLLIIIILLL((NLESegment) it3.next())) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        } else {
            z2 = false;
        }
        if (z || z2) {
            return true;
        }
        return false;
    }

    public static boolean LJJIFFI(NLEModel nLEModel) {
        boolean z;
        boolean z2;
        ArrayList arrayList = (ArrayList) C351220Dpo.LJJJJL(nLEModel);
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (C351220Dpo.LLLLIIL((NLESegment) it2.next())) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        ArrayList arrayList2 = (ArrayList) C351220Dpo.LJJLIIIJJIZ(nLEModel);
        if (!arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                if (C351220Dpo.LLLLIIL((NLESegment) it3.next())) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        } else {
            z2 = false;
        }
        if (z || z2) {
            return true;
        }
        return false;
    }

    public static boolean LJJII(VideoPublishEditModel videoPublishEditModel) throws InterruptedException {
        Object objInvoke;
        AwS549S0100000_5 awS549S0100000_5 = new AwS549S0100000_5(videoPublishEditModel, 1380);
        if (C01TT.LIZ()) {
            objInvoke = awS549S0100000_5.invoke();
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            C259800zU c259800zU = new C259800zU();
            C01TT.LIZJ(new AwS249S0300000_5(c259800zU, awS549S0100000_5, countDownLatch, 21));
            countDownLatch.await();
            objInvoke = c259800zU.element;
            if (objInvoke == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return ((Boolean) objInvoke).booleanValue();
    }

    public static boolean LJJIII(NLEModel nLEModel) {
        VecNLETrackSPtr tracks;
        if (nLEModel != null && (tracks = nLEModel.getTracks()) != null) {
            ArrayList arrayList = new ArrayList();
            for (NLETrack nLETrack : tracks) {
                if (C351220Dpo.LLLIIL(nLETrack)) {
                    arrayList.add(nLETrack);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Iterator<NLETrackSlot> it3 = ((NLETrack) it2.next()).getSlots().iterator();
                while (it3.hasNext()) {
                    if (!it3.next().getVideoAnims().isEmpty()) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public static boolean LJJIIJ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks;
        if (nLEModel == null || (tracks = nLEModel.getTracks()) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if (NLETrackType.VIDEO == nLETrack2.getTrackType() && nLETrack2.getEnable()) {
                arrayList.add(nLETrack);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
        }
        if (arrayList2.isEmpty()) {
            return false;
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            if (Intrinsics.LJFF(((NLENode) it3.next()).getExtra("key_is_use_anim_new_ui"), "true")) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJJIIJZLJL(NLEModel nLEModel) {
        NLESegmentAIMatting segment;
        NLESegmentAIMatting nLESegmentAIMattingDynamicCast;
        VecNLEMattingStroke strokes;
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        if (tracks == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (NLETrackType.VIDEO == nLETrack.getTrackType()) {
                arrayList.add(nLETrack);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
        }
        if (arrayList2.isEmpty()) {
            return false;
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            NLEAIMatting aIMatting = ((NLETrackSlot) it3.next()).getAIMatting();
            if (aIMatting != null && (segment = aIMatting.getSegment()) != null && (nLESegmentAIMattingDynamicCast = NLESegmentAIMatting.dynamicCast(segment)) != null && (strokes = nLESegmentAIMattingDynamicCast.getStrokes()) != null && !strokes.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJJIIZ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        if (tracks == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (NLETrackType.VIDEO == nLETrack.getTrackType()) {
                arrayList.add(nLETrack);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
        }
        if (arrayList2.isEmpty()) {
            return false;
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            if (!((NLETrackSlot) it3.next()).getMasks().isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJJIIZI(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        if (tracks != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<NLETrack> it2 = tracks.iterator();
            while (it2.hasNext()) {
                C19719612Di.LJJI(it2.next().getSlots(), arrayList);
            }
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (!((NLETrackSlot) it3.next()).getSwingKeyframes().isEmpty()) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static boolean LJJIJ(VideoPublishEditModel videoPublishEditModel) {
        EditorProModel editorProModel;
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_block_create_template_from_ep", true) != 1 || (editorProModel = videoPublishEditModel.getCreativeFlowData().getEditorProModel()) == null || !editorProModel.isAdvancedEdit()) {
            return false;
        }
        return true;
    }

    public static boolean LJJIJIL(NLEModel nLEModel) {
        boolean z;
        boolean z2;
        boolean z3;
        int iLIZJ;
        boolean z4;
        boolean z5;
        boolean z6;
        if (!(!((ArrayList) C349930Dnj.LJFF(nLEModel)).isEmpty()) && C351220Dpo.LJLIIL(nLEModel) <= 0 && C351220Dpo.LJIJI(nLEModel) <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (C351220Dpo.LJJIJL(nLEModel) > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (C351220Dpo.LJLL(nLEModel) > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (((Boolean) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_STICKER, Boolean.FALSE)).booleanValue()) {
            iLIZJ = C351220Dpo.LJJJJZI(nLEModel);
        } else {
            iLIZJ = C0EKP.LIZJ(nLEModel);
        }
        if (iLIZJ > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (((ArrayList) C351220Dpo.LJJJJLI(nLEModel)).size() > 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        Iterator<NLETrack> it2 = nLEModel.getTracks().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            NLETrack next = it2.next();
            if (C351220Dpo.LLIILZL(next)) {
                if (next != null) {
                    z6 = true;
                }
            }
        }
        z6 = false;
        if (!z && !z2 && !z3 && !z6 && !z5 && !z4) {
            return true;
        }
        return false;
    }

    public static void LJJIJIIJIL(NLETrackSlot nLETrackSlot, boolean z) {
        boolean z2;
        boolean z3;
        String resourceFile;
        NLEResType nLEResType;
        NLEStyCanvas canvasStyle;
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (nLESegmentVideoDynamicCast == null) {
            return;
        }
        NLEResourceAV aVFile = nLESegmentVideoDynamicCast.getAVFile();
        float width = aVFile.getWidth();
        float height = aVFile.getHeight();
        if (nLESegmentVideoDynamicCast.getCanvasStyle() == null || ((canvasStyle = nLESegmentVideoDynamicCast.getCanvasStyle()) != null && canvasStyle.hasExtra("extra_canvas_style_from"))) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (width != 0.0f && height != 0.0f && nLETrackSlot.getRotation() != 0.0f) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z2 || z3) {
            if (z && z2) {
                NLEStyCanvas nLEStyCanvas = new NLEStyCanvas();
                nLEStyCanvas.setType(NLECanvasType.COLOR);
                nLEStyCanvas.setColor(-16777216L);
                nLESegmentVideoDynamicCast.setCanvasStyle(nLEStyCanvas);
            }
            if (z3 && (resourceFile = aVFile.getResourceFile()) != null) {
                C533730KwV.LIZ.getClass();
                boolean zLJIIJ = C533730KwV.LJIIJ(resourceFile);
                Pair pairLJ = C20137613qo.LJ(C20137613qo.LIZ.LIZLLL(resourceFile));
                float fIntValue = ((Number) pairLJ.getFirst()).intValue();
                float fIntValue2 = ((Number) pairLJ.getSecond()).intValue();
                aVFile.setWidth((long) fIntValue);
                aVFile.setHeight((long) fIntValue2);
                if (zLJIIJ) {
                    nLEResType = NLEResType.IMAGE;
                } else {
                    nLEResType = NLEResType.VIDEO;
                }
                aVFile.setResourceType(nLEResType);
            }
            if (Math.abs(nLETrackSlot.getRotation()) == 270.0f || Math.abs(nLETrackSlot.getRotation()) == 90.0f) {
                nLETrackSlot.setScale(aVFile.getWidth() / aVFile.getHeight());
            }
        }
    }

    public static TuxIconDrawable LJJIJL(int i, Context context) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
        c419910GdJ.LJFF = true;
        return c419910GdJ.LIZ(context);
    }

    public static Integer LJI(NLETrackSlot nLETrackSlot, List list, boolean z) {
        Object next;
        VecNLETrackSlotSPtr slots;
        Object next2;
        ArrayList<NLETrack> arrayList = new ArrayList(list);
        if (arrayList.size() > 1) {
            C08XD.LJJ(arrayList, new AComparatorS24S0000000_5(134));
        }
        if (!z) {
            Iterator it2 = arrayList.iterator();
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
            if (nLETrack != null && (slots = nLETrack.getSlots()) != null) {
                Iterator<NLETrackSlot> it3 = slots.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    if (C349550Dn7.LJFF(it3.next())) {
                        if (!C349550Dn7.LJFF(nLETrackSlot)) {
                            Iterator it4 = arrayList.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    next2 = it4.next();
                                    if (((NLETimeSpaceNode) next2).getLayer() == 0) {
                                        break;
                                    }
                                } else {
                                    next2 = null;
                                    break;
                                }
                            }
                            C19719512Dh.LIZ(arrayList).remove(next2);
                        }
                    }
                }
            }
        }
        for (NLETrack nLETrack2 : arrayList) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(nLETrack2.getSlots());
            if (arrayList2.size() > 1) {
                C08XD.LJJ(arrayList2, new AComparatorS24S0000000_5(135));
            }
            if (arrayList2.isEmpty()) {
                return Integer.valueOf(nLETrack2.getLayer());
            }
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) ListProtector.get(arrayList2, i);
                if (arrayList2.size() == 1 && (nLETimeSpaceNode.getEndTime() <= nLETrackSlot.getStartTime() || nLETimeSpaceNode.getStartTime() >= nLETrackSlot.getEndTime())) {
                    return Integer.valueOf(nLETrack2.getLayer());
                }
                if (i == 0 && nLETimeSpaceNode.getStartTime() >= nLETrackSlot.getEndTime()) {
                    return Integer.valueOf(nLETrack2.getLayer());
                }
                if (i == arrayList2.size() - 1) {
                    if (nLETimeSpaceNode.getEndTime() <= nLETrackSlot.getStartTime()) {
                        return Integer.valueOf(nLETrack2.getLayer());
                    }
                } else {
                    NLETimeSpaceNode nLETimeSpaceNode2 = (NLETimeSpaceNode) ListProtector.get(arrayList2, i + 1);
                    if (nLETimeSpaceNode.getEndTime() <= nLETrackSlot.getStartTime() && nLETrackSlot.getEndTime() <= nLETimeSpaceNode2.getStartTime()) {
                        return Integer.valueOf(nLETrack2.getLayer());
                    }
                }
            }
        }
        return null;
    }

    public static int LJIIIZ(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel, int i) {
        VecNLETrackSPtr tracks;
        int size;
        NLEModel nleModel = null;
        if ((i & 1) != 0) {
            videoPublishEditModel = null;
        }
        if ((i & 2) == 0 && nLEModel != null) {
            nleModel = nLEModel;
        } else if (videoPublishEditModel != null) {
            nleModel = videoPublishEditModel.getNleModel();
        }
        int i2 = 0;
        if (nleModel != null && (tracks = nleModel.getTracks()) != null) {
            Iterator<NLETrack> it2 = tracks.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                Iterator<NLETrackSlot> it3 = it2.next().getSlots().iterator();
                while (it3.hasNext()) {
                    VecNLEVideoAnimationSPtr videoAnims = it3.next().getVideoAnims();
                    if (videoAnims != null) {
                        size = videoAnims.size();
                    } else {
                        size = 0;
                    }
                    i2 += size;
                }
            }
        }
        return i2;
    }

    public static void LJJIJIIJI(NLETimeSpaceNode nLETimeSpaceNode, String str, String str2) {
        if (nLETimeSpaceNode.hasExtra(str)) {
            String extra = nLETimeSpaceNode.getExtra(str);
            nLETimeSpaceNode.removeExtraWithKey(str);
            nLETimeSpaceNode.setExtra(str2, extra);
        }
    }

    public static TuxIconDrawable LJJIL(Context context, int i, boolean z) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i;
        c419910GdJ.LJFF = z;
        return c419910GdJ.LIZ(context);
    }

    public static TuxIconDrawable LJJIJLIJ(Context context, int i, int i2, int i3) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
        c419910GdJ.LJFF = true;
        c419910GdJ.LIZIZ = i2;
        c419910GdJ.LIZJ = i3;
        return c419910GdJ.LIZ(context);
    }

    public static NLETrack LJIIJ(NLEModel nLEModel, NLETrackSlot nLETrackSlot, List list, Function0 function0, boolean z) {
        Object next;
        Integer numLJI = LJI(nLETrackSlot, list, z);
        if (numLJI != null) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (((NLETimeSpaceNode) next).getLayer() == numLJI.intValue()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            NLETrack nLETrack = (NLETrack) next;
            if (nLETrack != null) {
                nLETrack.addSlot(nLETrackSlot);
            }
            return nLETrack;
        }
        NLETrack nLETrack2 = (NLETrack) function0.invoke();
        nLETrack2.addSlot(nLETrackSlot);
        nLEModel.addTrack(nLETrack2);
        return nLETrack2;
    }
}
