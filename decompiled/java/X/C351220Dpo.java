package X;

import Y.AComparatorS24S0000000_5;
import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEAIMatting;
import com.bytedance.ies.nle.editor_jni.NLEAIMattingType;
import com.bytedance.ies.nle.editor_jni.NLEAlphaSplitType;
import com.bytedance.ies.nle.editor_jni.NLECanvasType;
import com.bytedance.ies.nle.editor_jni.NLEChromaChannel;
import com.bytedance.ies.nle.editor_jni.NLECommonKeyframe;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEKeyframe;
import com.bytedance.ies.nle.editor_jni.NLEKeyframeType;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResTag;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceComposite;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAIMatting;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentChromaChannel;
import com.bytedance.ies.nle.editor_jni.NLESegmentComposerFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentComposite;
import com.bytedance.ies.nle.editor_jni.NLESegmentEffect;
import com.bytedance.ies.nle.editor_jni.NLESegmentFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentHSLFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentImageSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentImageVideoAnimation;
import com.bytedance.ies.nle.editor_jni.NLESegmentInfoSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextTemplate;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideoAnimation;
import com.bytedance.ies.nle.editor_jni.NLEStringFloatPair;
import com.bytedance.ies.nle.editor_jni.NLEStyCanvas;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.NLEVideoAnimation;
import com.bytedance.ies.nle.editor_jni.NLEVideoFrameModel;
import com.bytedance.ies.nle.editor_jni.VecDouble;
import com.bytedance.ies.nle.editor_jni.VecNLEChromaChannelSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLECommonKeyframe;
import com.bytedance.ies.nle.editor_jni.VecNLEKeyframe;
import com.bytedance.ies.nle.editor_jni.VecNLEMaskSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEMattingStroke;
import com.bytedance.ies.nle.editor_jni.VecNLEStringFloatPairSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEVideoAnimationSPtr;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Dpo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C351220Dpo {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(368));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(367));

    public static final float LIZ(NLESegmentAudio nLESegmentAudio) {
        Double dValueOf;
        if (nLESegmentAudio != null) {
            dValueOf = Double.valueOf(nLESegmentAudio.getCurveAveSpeed());
        } else {
            dValueOf = null;
        }
        if (!Intrinsics.LIZIZ(dValueOf, 1.0d)) {
            if (nLESegmentAudio != null) {
                return (float) nLESegmentAudio.getCurveAveSpeed();
            }
            return 1.0f;
        }
        return nLESegmentAudio.getAbsSpeed();
    }

    public static final String LIZIZ(NLETrackSlot nLETrackSlot) {
        NLECanvasType type;
        NLEStyCanvas canvasStyle;
        NLEResourceNode image;
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (nLESegmentVideoDynamicCast == null) {
            return null;
        }
        NLECanvasType nLECanvasType = NLECanvasType.IMAGE;
        NLEStyCanvas canvasStyle2 = nLESegmentVideoDynamicCast.getCanvasStyle();
        if (canvasStyle2 != null) {
            type = canvasStyle2.getType();
        } else {
            type = null;
        }
        if (nLECanvasType != type || (canvasStyle = nLESegmentVideoDynamicCast.getCanvasStyle()) == null || (image = canvasStyle.getImage()) == null) {
            return null;
        }
        return image.getResourceFile();
    }

    public static final void LIZJ(NLETrackSlot nLETrackSlot) {
        nLETrackSlot.removeExtraWithKey("ep_crop_scale");
        nLETrackSlot.removeExtraWithKey("ep_crop_transX");
        nLETrackSlot.removeExtraWithKey("ep_crop_transY");
        nLETrackSlot.removeExtraWithKey("ep_crop_degree");
        nLETrackSlot.removeExtraWithKey("ep_crop_ratio");
        nLETrackSlot.removeExtraWithKey("ep_crop_mode");
        nLETrackSlot.removeExtraWithKey("crop_matrix");
        nLETrackSlot.removeExtraWithKey("crop_slider_rotation");
        nLETrackSlot.removeExtraWithKey("crop_button_rotation");
        nLETrackSlot.removeExtraWithKey("crop_is_photo_cropped");
        nLETrackSlot.removeExtraWithKey("crop_mirror_x");
    }

    public static final boolean LIZLLL(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList<NLETrackSlot> arrayList = new ArrayList();
        Iterator<NLETrack> it2 = tracks.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(it2.next().getSlots(), arrayList);
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        for (NLETrackSlot nLETrackSlot : arrayList) {
            if (nLETrackSlot.hasExtra("ep_magic_resource_id") && !LLIIJLIL(nLEModel, nLETrackSlot)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJ(NLETrackSlot nLETrackSlot) {
        if (LJZ(nLETrackSlot) || nLETrackSlot.getExtra("ep_curve_speed_resource_id").length() > 0) {
            return true;
        }
        return false;
    }

    public static final C558340Lv6 LJFF(String str) {
        return C20137613qo.LIZ.LIZLLL(str);
    }

    public static final long LJII(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList<NLETrack> arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if (!Intrinsics.LJFF(nLETrack2.getExtra("follow_max"), "FALSE") && nLETrack2.getEnable()) {
                arrayList.add(nLETrack);
            }
        }
        long maxEnd = 0;
        for (NLETrack nLETrack3 : arrayList) {
            if (nLETrack3.getMaxEnd() > maxEnd) {
                maxEnd = nLETrack3.getMaxEnd();
            }
        }
        return maxEnd;
    }

    public static final List<C351390Dq5> LJIIIZ(NLETrackSlot nLETrackSlot) {
        NLESegmentComposerFilter nLESegmentComposerFilterDynamicCast;
        Object next;
        float second;
        float f;
        int second2;
        String resourceFile;
        ArrayList arrayList = new ArrayList();
        if (nLETrackSlot == null) {
            return arrayList;
        }
        for (NLEFilter nLEFilter : nLETrackSlot.getFilters()) {
            if (LLILZIL(nLEFilter) && (nLESegmentComposerFilterDynamicCast = NLESegmentComposerFilter.dynamicCast((NLENode) nLEFilter.getSegment())) != null) {
                for (NLEStringFloatPair nLEStringFloatPair : nLESegmentComposerFilterDynamicCast.getEffectNodeKeyValuePairs()) {
                    if (!Intrinsics.LJFF(nLEStringFloatPair.getFirst(), "is_retouch") && nLEStringFloatPair.hasExtra("is_beauty_filter_from_auto_retouch") && Boolean.parseBoolean(nLEStringFloatPair.getExtra("is_beauty_filter_from_auto_retouch"))) {
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (Intrinsics.LJFF(((C351390Dq5) next).LIZIZ, LJJIFFI(nLEStringFloatPair))) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        C351390Dq5 c351390Dq5 = (C351390Dq5) next;
                        if (c351390Dq5 != null) {
                            if (c351390Dq5.LIZLLL) {
                                second = nLEStringFloatPair.getSecond();
                                f = 50;
                            } else {
                                second = nLEStringFloatPair.getSecond();
                                f = 100;
                            }
                            c351390Dq5.LIZJ.add(new Pair<>(nLEStringFloatPair.getFirst(), Integer.valueOf((int) (second * f))));
                        } else {
                            if (LLILZLL(nLEStringFloatPair)) {
                                second2 = (int) (nLEStringFloatPair.getSecond() * 50);
                            } else {
                                second2 = (int) (nLEStringFloatPair.getSecond() * 100);
                            }
                            NLEResourceNode effectSDKFilter = nLESegmentComposerFilterDynamicCast.getEffectSDKFilter();
                            if (effectSDKFilter == null || (resourceFile = effectSDKFilter.getResourceFile()) == null) {
                                resourceFile = "";
                            }
                            String strLJJIFFI = LJJIFFI(nLEStringFloatPair);
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(new Pair(nLEStringFloatPair.getFirst(), Integer.valueOf(second2)));
                            arrayList.add(new C351390Dq5(resourceFile, strLJJIFFI, arrayList2, LLILZLL(nLEStringFloatPair)));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static final List<C351410Dq7> LJIIJ(NLETrackSlot nLETrackSlot) {
        NLESegmentComposerFilter nLESegmentComposerFilterDynamicCast;
        Object next;
        float second;
        float f;
        int second2;
        String resourceFile;
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (nLETrackSlot == null) {
            return arrayList;
        }
        for (NLEFilter nLEFilter : nLETrackSlot.getFilters()) {
            if (LLILZIL(nLEFilter) && (nLESegmentComposerFilterDynamicCast = NLESegmentComposerFilter.dynamicCast((NLENode) nLEFilter.getSegment())) != null) {
                for (NLEStringFloatPair nLEStringFloatPair : nLESegmentComposerFilterDynamicCast.getEffectNodeKeyValuePairs()) {
                    if (!Intrinsics.LJFF(nLEStringFloatPair.getFirst(), "is_retouch")) {
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (Intrinsics.LJFF(((C351410Dq7) next).LIZ.LIZIZ, LJJIFFI(nLEStringFloatPair))) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        C351410Dq7 c351410Dq7 = (C351410Dq7) next;
                        if (c351410Dq7 != null) {
                            if (c351410Dq7.LIZ.LIZLLL) {
                                second = nLEStringFloatPair.getSecond();
                                f = 50;
                            } else {
                                second = nLEStringFloatPair.getSecond();
                                f = 100;
                            }
                            c351410Dq7.LIZ.LIZJ.add(new Pair<>(nLEStringFloatPair.getFirst(), Integer.valueOf((int) (second * f))));
                        } else {
                            if (LLILZLL(nLEStringFloatPair)) {
                                second2 = (int) (nLEStringFloatPair.getSecond() * 50);
                            } else {
                                second2 = (int) (nLEStringFloatPair.getSecond() * 100);
                            }
                            NLEResourceNode effectSDKFilter = nLESegmentComposerFilterDynamicCast.getEffectSDKFilter();
                            if (effectSDKFilter == null || (resourceFile = effectSDKFilter.getResourceFile()) == null) {
                                resourceFile = "";
                            }
                            String strLJJIFFI = LJJIFFI(nLEStringFloatPair);
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(new Pair(nLEStringFloatPair.getFirst(), Integer.valueOf(second2)));
                            C351390Dq5 c351390Dq5 = new C351390Dq5(resourceFile, strLJJIFFI, arrayList2, LLILZLL(nLEStringFloatPair));
                            if (!nLEStringFloatPair.hasExtra("is_beauty_filter_from_auto_retouch")) {
                                z = false;
                            } else {
                                z = Boolean.parseBoolean(nLEStringFloatPair.getExtra("is_beauty_filter_from_auto_retouch"));
                            }
                            arrayList.add(new C351410Dq7(c351390Dq5, z));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static final List<String> LJIIJJI(NLESegmentComposerFilter nLESegmentComposerFilter) {
        ArrayList arrayList = new ArrayList();
        Iterator<NLEStringFloatPair> it2 = nLESegmentComposerFilter.getEffectNodeKeyValuePairs().iterator();
        while (it2.hasNext()) {
            String strLJJIFFI = LJJIFFI(it2.next());
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (Intrinsics.LJFF(it3.next(), strLJJIFFI)) {
                        break;
                    }
                }
            }
            arrayList.add(strLJJIFFI);
        }
        return arrayList;
    }

    public static final List<NLESegmentComposerFilter> LJIIL(NLEModel nLEModel) {
        return C13LP.LJLIL(LJLIIIL(nLEModel), LJJJJLL(nLEModel));
    }

    public static final Float LJIILIIL(NLETrackSlot nLETrackSlot) {
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (nLESegmentVideoDynamicCast != null) {
            return Float.valueOf(nLESegmentVideoDynamicCast.getAlpha());
        }
        NLESegmentSticker nLESegmentStickerDynamicCast = NLESegmentSticker.dynamicCast(nLETrackSlot.getMainSegment());
        if (nLESegmentStickerDynamicCast != null) {
            return Float.valueOf(nLESegmentStickerDynamicCast.getAlpha());
        }
        return null;
    }

    public static final int LJIILJJIL(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if (nLETrack2.getEnable() && LLJJIII(nLETrack2)) {
                arrayList.add(nLETrack);
            }
        }
        Iterator it2 = arrayList.iterator();
        int size = 0;
        while (it2.hasNext()) {
            VecNLETrackSlotSPtr slots = ((NLETrack) it2.next()).getSlots();
            ArrayList arrayList2 = new ArrayList();
            for (NLETrackSlot nLETrackSlot : slots) {
                NLESegmentEffect nLESegmentEffectDynamicCast = NLESegmentEffect.dynamicCast(nLETrackSlot.getMainSegment());
                if (nLESegmentEffectDynamicCast != null && nLESegmentEffectDynamicCast.getEffectSDKEffect().getResourceTag() == NLEResTag.AMAZING) {
                    arrayList2.add(nLETrackSlot);
                }
            }
            size += arrayList2.size();
        }
        return size;
    }

    public static final String LJIILLIIL(NLETrackSlot nLETrackSlot) {
        if (!nLETrackSlot.hasExtra("ep_anim_res_id")) {
            return null;
        }
        return nLETrackSlot.getExtra("ep_anim_res_id");
    }

    public static final String LJIIZILJ(NLETrackSlot nLETrackSlot) {
        if (!nLETrackSlot.hasExtra("anim_type")) {
            return null;
        }
        return nLETrackSlot.getExtra("anim_type");
    }

    public static final String LJIJ(NLEVideoAnimation nLEVideoAnimation) {
        if (nLEVideoAnimation == null || !nLEVideoAnimation.hasExtra("anim_type")) {
            return null;
        }
        return nLEVideoAnimation.getExtra("anim_type");
    }

    public static final int LJIJI(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (LLILL(nLETrack)) {
                arrayList.add(nLETrack);
            }
        }
        Iterator it2 = arrayList.iterator();
        int size = 0;
        while (it2.hasNext()) {
            size += ((NLETrack) it2.next()).getSlots().size();
        }
        return size;
    }

    public static final List<NLETrack> LJIJJ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if (nLETrack2.getEnable() && C350870DpF.LJIIIIZZ(nLETrack2) == NLETrackType.AUDIO && !LLLII(nLETrack2) && !LLLJ(nLETrack2)) {
                arrayList.add(nLETrack);
            }
        }
        return arrayList;
    }

    public static final List<NLETrack> LJIJJLI(NLEModel nLEModel) {
        List<NLETrack> listLJJIIZ = LJJIIZ(nLEModel);
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : listLJJIIZ) {
            VecNLETrackSlotSPtr slots = nLETrack.getSlots();
            if (slots != null && !slots.isEmpty()) {
                arrayList.add(nLETrack);
            }
        }
        return C13LP.LJLLLL(new AComparatorS24S0000000_5(112), arrayList);
    }

    public static final List<NLETrack> LJIL(NLEModel nLEModel) {
        List<NLETrack> listLJJIJLIJ = LJJIJLIJ(nLEModel);
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : listLJJIJLIJ) {
            VecNLETrackSlotSPtr slots = nLETrack.getSlots();
            if (slots != null && !slots.isEmpty()) {
                arrayList.add(nLETrack);
            }
        }
        return C13LP.LJLLLL(new AComparatorS24S0000000_5(113), arrayList);
    }

    public static final List<NLETrack> LJJ(NLEModel nLEModel) {
        List<NLETrack> listLJJJLIIL = LJJJLIIL(nLEModel);
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : listLJJJLIIL) {
            VecNLETrackSlotSPtr slots = nLETrack.getSlots();
            if (slots != null && !slots.isEmpty()) {
                arrayList.add(nLETrack);
            }
        }
        return C13LP.LJLLLL(new AComparatorS24S0000000_5(114), arrayList);
    }

    public static final List<NLETrack> LJJI(NLEModel nLEModel) {
        VecNLETrackSlotSPtr slots;
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if (nLETrack2.getEnable() && LLLJL(nLETrack2) && (slots = nLETrack2.getSlots()) != null && !slots.isEmpty()) {
                arrayList.add(nLETrack);
            }
        }
        return arrayList;
    }

    public static final String LJJIFFI(NLEStringFloatPair nLEStringFloatPair) {
        if (!nLEStringFloatPair.hasExtra("beauty_item_res_id")) {
            return "";
        }
        return nLEStringFloatPair.getExtra("beauty_item_res_id");
    }

    public static final long LJJIII(NLETrackSlot nLETrackSlot) {
        NLEChromaChannel next;
        NLESegmentChromaChannel segment;
        VecNLEChromaChannelSPtr chromaChannels = nLETrackSlot.getChromaChannels();
        if (chromaChannels == null) {
            return 0L;
        }
        Iterator<NLEChromaChannel> it2 = chromaChannels.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.getSegment().getColor() != 0) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NLEChromaChannel nLEChromaChannel = next;
        if (nLEChromaChannel == null || (segment = nLEChromaChannel.getSegment()) == null) {
            return 0L;
        }
        return segment.getColor();
    }

    public static final float LJJIIJ(NLESegmentComposerFilter nLESegmentComposerFilter) {
        VecNLEStringFloatPairSPtr effectNodeKeyValuePairs = nLESegmentComposerFilter.getEffectNodeKeyValuePairs();
        if (effectNodeKeyValuePairs != null) {
            for (NLEStringFloatPair nLEStringFloatPair : effectNodeKeyValuePairs) {
                if (Intrinsics.LJFF(nLEStringFloatPair.getFirst(), "Filter_intensity")) {
                    return nLEStringFloatPair.getSecond();
                }
            }
            return 0.8f;
        }
        return 0.8f;
    }

    public static final int LJJIIJZLJL(NLEModel nLEModel) {
        int i;
        int i2;
        int i3;
        int i4;
        if (LJIJJLI(nLEModel).isEmpty()) {
            return 0;
        }
        Iterator<NLETrack> it2 = LJIJJLI(nLEModel).iterator();
        if (it2.hasNext()) {
            Iterator<NLETrackSlot> it3 = it2.next().getSlots().iterator();
            if (it3.hasNext()) {
                NLETrackSlot next = it3.next();
                if (next.hasExtra("ep_slot_add_order")) {
                    i = CastIntegerProtector.parseInt(next.getExtra("ep_slot_add_order"));
                } else {
                    i = 0;
                }
                while (it3.hasNext()) {
                    NLETrackSlot next2 = it3.next();
                    if (next2.hasExtra("ep_slot_add_order")) {
                        i4 = CastIntegerProtector.parseInt(next2.getExtra("ep_slot_add_order"));
                    } else {
                        i4 = 0;
                    }
                    if (i < i4) {
                        i = i4;
                    }
                }
                while (it2.hasNext()) {
                    Iterator<NLETrackSlot> it4 = it2.next().getSlots().iterator();
                    if (it4.hasNext()) {
                        NLETrackSlot next3 = it4.next();
                        if (next3.hasExtra("ep_slot_add_order")) {
                            i2 = CastIntegerProtector.parseInt(next3.getExtra("ep_slot_add_order"));
                        } else {
                            i2 = 0;
                        }
                        while (it4.hasNext()) {
                            NLETrackSlot next4 = it4.next();
                            if (next4.hasExtra("ep_slot_add_order")) {
                                i3 = CastIntegerProtector.parseInt(next4.getExtra("ep_slot_add_order"));
                            } else {
                                i3 = 0;
                            }
                            if (i2 < i3) {
                                i2 = i3;
                            }
                        }
                        if (i < i2) {
                            i = i2;
                        }
                    } else {
                        throw new NoSuchElementException();
                    }
                }
                return i + 1;
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }

    public static final List<NLETrack> LJJIIZ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if (nLETrack2.getEnable() && LLJI(nLETrack2)) {
                arrayList.add(nLETrack);
            }
        }
        return C13LP.LJLLLL(new AComparatorS24S0000000_5(115), arrayList);
    }

    public static final NLEModel LJJIIZI(NLETrackSlot nLETrackSlot) {
        NLESegment mainSegment;
        NLEResourceComposite nLEResourceCompositeDynamicCast;
        NLEModel nLEModelDynamicCast;
        if (nLETrackSlot != null) {
            mainSegment = nLETrackSlot.getMainSegment();
        } else {
            mainSegment = null;
        }
        NLESegmentComposite nLESegmentCompositeDynamicCast = NLESegmentComposite.dynamicCast(mainSegment);
        if (nLESegmentCompositeDynamicCast == null || (nLEResourceCompositeDynamicCast = NLEResourceComposite.dynamicCast((NLENode) nLESegmentCompositeDynamicCast.getCompositeResource())) == null || (nLEModelDynamicCast = NLEModel.dynamicCast(nLEResourceCompositeDynamicCast.getCompositeNode())) == null) {
            return null;
        }
        return nLEModelDynamicCast;
    }

    public static final String LJJIJ(NLETrackSlot nLETrackSlot) {
        String extra;
        boolean z = false;
        if (nLETrackSlot != null && nLETrackSlot.hasExtra("ep_curve_speed_resource_id")) {
            z = true;
        }
        if (!z || (extra = nLETrackSlot.getExtra("ep_curve_speed_resource_id")) == null) {
            return "";
        }
        return extra;
    }

    public static final List<NLESegmentComposerFilter> LJJIJIIJI(NLEModel nLEModel) {
        ArrayList arrayList = new ArrayList();
        List<NLETrackSlot> listLJJIJIIJIL = LJJIJIIJIL(nLEModel);
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJJIJIIJIL, 10));
        Iterator<NLETrackSlot> it2 = listLJJIJIIJIL.iterator();
        while (it2.hasNext()) {
            arrayList2.add(NLESegmentComposerFilter.dynamicCast((NLENode) it2.next().getMainSegment()));
        }
        arrayList.addAll(arrayList2);
        arrayList.addAll(LJLIIIL(nLEModel));
        return arrayList;
    }

    public static final List<NLETrackSlot> LJJIJIIJIL(NLEModel nLEModel) {
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it2 = nLEModel.getTracks().iterator();
        while (it2.hasNext()) {
            for (NLETrackSlot nLETrackSlot : it2.next().getSlots()) {
                if (nLETrackSlot != null && LLJ(nLETrackSlot) && nLETrackSlot.hasExtra("is_ep_global_color_filter")) {
                    if (!Boolean.parseBoolean(nLETrackSlot.getExtra("is_ep_global_color_filter"))) {
                        if (LLJ(nLETrackSlot)) {
                            Boolean boolLJJIL = LJJIL(nLETrackSlot, "is_ep_update_global_color_filter_intensity");
                            Boolean boolLJJIL2 = LJJIL(nLETrackSlot, "is_ep_clip_global_color_filter");
                            Boolean boolLJJIL3 = LJJIL(nLETrackSlot, "is_ep_drag_global_color_filter");
                            Boolean boolLJJIL4 = LJJIL(nLETrackSlot, "is_ep_replaced_global_color_filter");
                            Boolean boolLJJIL5 = LJJIL(nLETrackSlot, "is_ep_copy_global_color_filter");
                            if (boolLJJIL4 != null) {
                                boolLJJIL4.booleanValue();
                                Boolean bool = Boolean.TRUE;
                                if (Intrinsics.LJFF(boolLJJIL4, bool) || Intrinsics.LJFF(boolLJJIL, bool) || Intrinsics.LJFF(boolLJJIL2, bool)) {
                                }
                            } else {
                                Boolean bool2 = Boolean.TRUE;
                                if (Intrinsics.LJFF(boolLJJIL, bool2) || Intrinsics.LJFF(boolLJJIL2, bool2) || Intrinsics.LJFF(boolLJJIL3, bool2) || Intrinsics.LJFF(boolLJJIL5, bool2)) {
                                }
                            }
                        }
                    }
                    arrayList.add(nLETrackSlot);
                }
            }
        }
        return arrayList;
    }

    public static final int LJJIJIL(NLEModel nLEModel) {
        int i;
        int i2;
        int i3;
        int i4;
        if (LJIL(nLEModel).isEmpty()) {
            return 0;
        }
        Iterator<NLETrack> it2 = LJIL(nLEModel).iterator();
        if (it2.hasNext()) {
            Iterator<NLETrackSlot> it3 = it2.next().getSlots().iterator();
            if (it3.hasNext()) {
                NLETrackSlot next = it3.next();
                if (next.hasExtra("ep_slot_add_order")) {
                    i = CastIntegerProtector.parseInt(next.getExtra("ep_slot_add_order"));
                } else {
                    i = 0;
                }
                while (it3.hasNext()) {
                    NLETrackSlot next2 = it3.next();
                    if (next2.hasExtra("ep_slot_add_order")) {
                        i4 = CastIntegerProtector.parseInt(next2.getExtra("ep_slot_add_order"));
                    } else {
                        i4 = 0;
                    }
                    if (i < i4) {
                        i = i4;
                    }
                }
                while (it2.hasNext()) {
                    Iterator<NLETrackSlot> it4 = it2.next().getSlots().iterator();
                    if (it4.hasNext()) {
                        NLETrackSlot next3 = it4.next();
                        if (next3.hasExtra("ep_slot_add_order")) {
                            i2 = CastIntegerProtector.parseInt(next3.getExtra("ep_slot_add_order"));
                        } else {
                            i2 = 0;
                        }
                        while (it4.hasNext()) {
                            NLETrackSlot next4 = it4.next();
                            if (next4.hasExtra("ep_slot_add_order")) {
                                i3 = CastIntegerProtector.parseInt(next4.getExtra("ep_slot_add_order"));
                            } else {
                                i3 = 0;
                            }
                            if (i2 < i3) {
                                i2 = i3;
                            }
                        }
                        if (i < i2) {
                            i = i2;
                        }
                    } else {
                        throw new NoSuchElementException();
                    }
                }
                return i + 1;
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }

    public static final int LJJIJL(NLEModel nLEModel) {
        int size;
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it2 = tracks.iterator();
        while (true) {
            size = 0;
            if (!it2.hasNext()) {
                break;
            }
            NLETrack next = it2.next();
            NLETrack nLETrack = next;
            if ((nLETrack.getEnable() && LLJJIII(nLETrack)) || LLLLILI(nLETrack)) {
                arrayList.add(next);
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            size += ((NLETrack) it3.next()).getSlots().size();
        }
        return size;
    }

    public static final List<NLETrack> LJJIJLIJ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if ((nLETrack2.getEnable() && LLJJIII(nLETrack2)) || LLLLILI(nLETrack2)) {
                arrayList.add(nLETrack);
            }
        }
        return C13LP.LJLLLL(new AComparatorS24S0000000_5(116), arrayList);
    }

    public static final NLESegmentComposerFilter LJJIZ(NLETrackSlot nLETrackSlot) {
        boolean z;
        if (LLJ(nLETrackSlot)) {
            return NLESegmentComposerFilter.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        }
        if (LJJJI(nLETrackSlot) != null) {
            z = true;
        } else {
            z = false;
        }
        NLESegmentFilter segment = null;
        if (!z) {
            return null;
        }
        NLEFilter nLEFilterLJJJI = LJJJI(nLETrackSlot);
        if (nLEFilterLJJJI != null) {
            segment = nLEFilterLJJJI.getSegment();
        }
        return NLESegmentComposerFilter.dynamicCast((NLENode) segment);
    }

    public static final NLEFilter LJJJI(NLETrackSlot nLETrackSlot) {
        NLEFilter next;
        Iterator<NLEFilter> it2 = nLETrackSlot.getFilters().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                NLEFilter nLEFilter = next;
                if (nLEFilter.hasExtra("part_filter_type") && Intrinsics.LJFF(nLEFilter.getExtra("part_filter_type"), "color_filter")) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    public static final String LJJJIL(NLETrackSlot nLETrackSlot) {
        NLEFilter nLEFilterLJJJI;
        NLESegmentFilter segment;
        if (LLJ(nLETrackSlot)) {
            NLESegment mainSegment = nLETrackSlot.getMainSegment();
            if (mainSegment != null) {
                return mainSegment.getExtra("filter_category");
            }
            return null;
        }
        if (LJJJI(nLETrackSlot) != null && (nLEFilterLJJJI = LJJJI(nLETrackSlot)) != null && (segment = nLEFilterLJJJI.getSegment()) != null) {
            return segment.getExtra("filter_category");
        }
        return null;
    }

    public static final int LJJJJ(String str) {
        List<Pair<String, Integer>> listLJJJJIZL = LJJJJIZL(str);
        if (listLJJJJIZL != null) {
            Iterator<Pair<String, Integer>> it2 = listLJJJJIZL.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Pair<String, Integer> next = it2.next();
                if (Intrinsics.LJFF(next.getFirst(), "Filter_intensity")) {
                    int iIntValue = next.getSecond().intValue();
                    if (iIntValue != 0) {
                        if (iIntValue != 100) {
                            break;
                        }
                        return 100;
                    }
                    return 0;
                }
            }
        }
        return 80;
    }

    public static final String LJJJJI(NLESegmentComposerFilter nLESegmentComposerFilter) {
        if (nLESegmentComposerFilter.hasExtra("key_filter_id")) {
            return nLESegmentComposerFilter.getExtra("key_filter_id");
        }
        return "";
    }

    public static final List<Pair<String, Integer>> LJJJJIZL(String str) {
        try {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = new JSONObject(new JSONObject(str).optString("filterconfig")).optJSONArray("items");
            if (jSONArrayOptJSONArray == null) {
                return null;
            }
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new Pair(jSONObjectOptJSONObject.optString("tag"), Integer.valueOf(jSONObjectOptJSONObject.optInt("value"))));
                }
            }
            return arrayList;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static final String LJJJJJ(NLETrackSlot nLETrackSlot) {
        NLEResourceNode effectSDKFilter;
        String resourceId;
        NLESegmentComposerFilter nLESegmentComposerFilterLJJIZ = LJJIZ(nLETrackSlot);
        if (nLESegmentComposerFilterLJJIZ != null && (effectSDKFilter = nLESegmentComposerFilterLJJIZ.getEffectSDKFilter()) != null && (resourceId = effectSDKFilter.getResourceId()) != null) {
            String strLIZ = C0E37.LIZ(resourceId);
            if (strLIZ != null) {
                return strLIZ;
            }
            return resourceId;
        }
        return null;
    }

    public static final List<NLESegment> LJJJJL(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (LLIILII(nLETrack)) {
                arrayList.add(nLETrack);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            NLESegment mainSegment = ((NLETrackSlot) it3.next()).getMainSegment();
            if (mainSegment != null) {
                arrayList3.add(mainSegment);
            }
        }
        return arrayList3;
    }

    public static final List<NLETrackSlot> LJJJJLI(NLEModel nLEModel) {
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : nLEModel.getTracks()) {
            for (NLETrackSlot nLETrackSlot : nLETrack.getSlots()) {
                if (LLJ(nLETrackSlot) || LLJI(nLETrack)) {
                    arrayList.add(nLETrackSlot);
                }
            }
        }
        return arrayList;
    }

    public static final List<NLESegmentComposerFilter> LJJJJLL(NLEModel nLEModel) {
        ArrayList arrayList;
        if (((Boolean) C257140A5w.LIZ.getValue()).booleanValue()) {
            List<NLETrackSlot> listLJJJJLI = LJJJJLI(nLEModel);
            arrayList = new ArrayList();
            Iterator<NLETrackSlot> it2 = listLJJJJLI.iterator();
            while (it2.hasNext()) {
                NLESegmentComposerFilter nLESegmentComposerFilterDynamicCast = NLESegmentComposerFilter.dynamicCast((NLENode) it2.next().getMainSegment());
                if (nLESegmentComposerFilterDynamicCast != null) {
                    arrayList.add(nLESegmentComposerFilterDynamicCast);
                }
            }
        } else {
            List<NLETrackSlot> listLJJJJLI2 = LJJJJLI(nLEModel);
            arrayList = new ArrayList(C15438062q.LJIJJ(listLJJJJLI2, 10));
            Iterator<NLETrackSlot> it3 = listLJJJJLI2.iterator();
            while (it3.hasNext()) {
                arrayList.add(NLESegmentComposerFilter.dynamicCast((NLENode) it3.next().getMainSegment()));
            }
        }
        return arrayList;
    }

    public static final int LJJJJZ(NLEModel nLEModel) {
        int i;
        int i2;
        int i3;
        int i4;
        if (LJJ(nLEModel).isEmpty()) {
            return 0;
        }
        Iterator<NLETrack> it2 = LJJ(nLEModel).iterator();
        if (it2.hasNext()) {
            Iterator<NLETrackSlot> it3 = it2.next().getSlots().iterator();
            if (it3.hasNext()) {
                NLETrackSlot next = it3.next();
                if (next.hasExtra("ep_slot_add_order")) {
                    i = CastIntegerProtector.parseInt(next.getExtra("ep_slot_add_order"));
                } else {
                    i = 0;
                }
                while (it3.hasNext()) {
                    NLETrackSlot next2 = it3.next();
                    if (next2.hasExtra("ep_slot_add_order")) {
                        i4 = CastIntegerProtector.parseInt(next2.getExtra("ep_slot_add_order"));
                    } else {
                        i4 = 0;
                    }
                    if (i < i4) {
                        i = i4;
                    }
                }
                while (it2.hasNext()) {
                    Iterator<NLETrackSlot> it4 = it2.next().getSlots().iterator();
                    if (it4.hasNext()) {
                        NLETrackSlot next3 = it4.next();
                        if (next3.hasExtra("ep_slot_add_order")) {
                            i2 = CastIntegerProtector.parseInt(next3.getExtra("ep_slot_add_order"));
                        } else {
                            i2 = 0;
                        }
                        while (it4.hasNext()) {
                            NLETrackSlot next4 = it4.next();
                            if (next4.hasExtra("ep_slot_add_order")) {
                                i3 = CastIntegerProtector.parseInt(next4.getExtra("ep_slot_add_order"));
                            } else {
                                i3 = 0;
                            }
                            if (i2 < i3) {
                                i2 = i3;
                            }
                        }
                        if (i < i2) {
                            i = i2;
                        }
                    } else {
                        throw new NoSuchElementException();
                    }
                }
                return i + 1;
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }

    public static final int LJJJJZI(NLEModel nLEModel) {
        int size;
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it2 = tracks.iterator();
        while (true) {
            size = 0;
            if (!it2.hasNext()) {
                break;
            }
            NLETrack next = it2.next();
            NLETrack nLETrack = next;
            if (nLETrack.getEnable() && (LLJLILLLLZIIL(nLETrack) || LLJJJJ(nLETrack))) {
                arrayList.add(next);
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            size += ((NLETrack) it3.next()).getSlots().size();
        }
        return size;
    }

    public static final List<NLETrack> LJJJLIIL(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (LLJLIL(nLETrack)) {
                arrayList.add(nLETrack);
            }
        }
        return C13LP.LJLLLL(new AComparatorS24S0000000_5(117), arrayList);
    }

    public static final List<NLETrack> LJJJLL(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if (LLJLILLLLZIIL(nLETrack2) || LLJJJJ(nLETrack2)) {
                arrayList.add(nLETrack);
            }
        }
        return arrayList;
    }

    public static final int LJJJZ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks;
        NLEVideoFrameModel cover = nLEModel.getCover();
        if (cover != null && cover.getEnable()) {
            tracks = nLEModel.getCover().getTracks();
        } else {
            tracks = nLEModel.getTracks();
        }
        ArrayList<NLETimeSpaceNode> arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if (!nLETrack2.getMainTrack() && Intrinsics.LJFF(LJLLJ(nLETrack2), "audio")) {
                arrayList.add(nLETrack);
            }
        }
        int layer = -1;
        for (NLETimeSpaceNode nLETimeSpaceNode : arrayList) {
            if (nLETimeSpaceNode.getLayer() > layer) {
                layer = nLETimeSpaceNode.getLayer();
            }
        }
        return layer;
    }

    public static final ArrayList<String> LJJL(NLETrack nLETrack) {
        if (!LLLLJ(nLETrack)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<NLETrackSlot> it2 = nLETrack.getSlots().iterator();
        while (it2.hasNext()) {
            NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) it2.next().getMainSegment());
            if (nLESegmentVideoDynamicCast != null) {
                linkedHashSet.add(nLESegmentVideoDynamicCast.getResource().getResourceFile());
            }
        }
        return new ArrayList<>(linkedHashSet);
    }

    public static final String LJJLI(NLETrackSlot nLETrackSlot) {
        String extra = nLETrackSlot.getExtra("ep_audio_music_id");
        if (extra == null || extra.length() == 0) {
            return nLETrackSlot.getExtra("d_bgmId");
        }
        return extra;
    }

    public static final List<String> LJJLIIIIJ(NLEModel nLEModel) {
        List<NLETrack> listLJJLIIIJ;
        Iterable slots;
        if (nLEModel != null && (listLJJLIIIJ = LJJLIIIJ(nLEModel)) != null) {
            ArrayList arrayList = new ArrayList();
            for (NLETrack nLETrack : listLJJLIIIJ) {
                if (nLETrack == null || (slots = nLETrack.getSlots()) == null) {
                    slots = C13BV.INSTANCE;
                }
                C19719612Di.LJJI(slots, arrayList);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String strLJJLI = LJJLI((NLETrackSlot) it2.next());
                if (strLJJLI != null && strLJJLI.length() != 0) {
                    arrayList2.add(strLJJLI);
                }
            }
            return arrayList2;
        }
        return C13BV.INSTANCE;
    }

    public static final List<NLETrack> LJJLIIIJ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        if (tracks != null) {
            ArrayList arrayList = new ArrayList();
            for (NLETrack nLETrack : tracks) {
                NLETrack nLETrack2 = nLETrack;
                if (LLILLL(nLETrack2) || LLJILLL(nLETrack2)) {
                    arrayList.add(nLETrack);
                }
            }
            return arrayList;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public static final ArrayList<NLETrackSlot> LJJLIIIJILLIZJL(NLEModel nLEModel) {
        ?? arrayList;
        List<NLETrack> listLJLLI = LJLLI(nLEModel);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = ((ArrayList) listLJLLI).iterator();
        while (it2.hasNext()) {
            VecNLETrackSlotSPtr slots = ((NLETrack) it2.next()).getSlots();
            if (slots != null) {
                arrayList = new ArrayList();
                for (NLETrackSlot nLETrackSlot : slots) {
                    NLETrackSlot nLETrackSlot2 = nLETrackSlot;
                    if (nLETrackSlot2.hasExtra("text_slot_type") && Intrinsics.LJFF(nLETrackSlot2.getExtra("text_slot_type"), "TEXT_STICKER")) {
                        arrayList.add(nLETrackSlot);
                    }
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            C19719612Di.LJJI(arrayList, arrayList2);
        }
        return new ArrayList<>(C13LP.LJLLLL(new AComparatorS24S0000000_5(118), arrayList2));
    }

    public static final String LJJLIIIJJI(NLESegment nLESegment) {
        if (nLESegment.hasExtra("ep_origin_media_path")) {
            return nLESegment.getExtra("ep_origin_media_path");
        }
        return "";
    }

    public static final List<NLESegment> LJJLIIIJJIZ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (LLLLJ(nLETrack)) {
                arrayList.add(nLETrack);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            C19719612Di.LJJI(((NLETrackSlot) it3.next()).getFilters(), arrayList3);
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayList3) {
            if (LLIIL((NLEFilter) obj)) {
                arrayList4.add(obj);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            NLESegmentFilter segment = ((NLEFilter) it4.next()).getSegment();
            if (segment != null) {
                arrayList5.add(segment);
            }
        }
        return arrayList5;
    }

    public static final int LJJLIIIJL(NLEModel nLEModel) {
        int size;
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it2 = tracks.iterator();
        while (true) {
            size = 0;
            if (!it2.hasNext()) {
                break;
            }
            NLETrack next = it2.next();
            NLETrack nLETrack = next;
            if (nLETrack.getEnable() && C350870DpF.LJIIIIZZ(nLETrack) == NLETrackType.VIDEO && !nLETrack.getMainTrack()) {
                arrayList.add(next);
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            size += ((NLETrack) it3.next()).getSlots().size();
        }
        return size;
    }

    public static final List<NLETrack> LJJLIIIJLJLI(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if (nLETrack2.getEnable() && C350870DpF.LJIIIIZZ(nLETrack2) == NLETrackType.VIDEO && !nLETrack2.getMainTrack()) {
                arrayList.add(nLETrack);
            }
        }
        return C13LP.LJLLLL(new AComparatorS24S0000000_5(119), arrayList);
    }

    public static final float LJJLIIIJLLLLLLLZ(NLETrackSlot nLETrackSlot) {
        boolean z;
        String transientExtra;
        VecNLETrackSlotSPtr keyframes = nLETrackSlot.getKeyframes();
        if (keyframes != null && !keyframes.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (!z && (transientExtra = nLETrackSlot.getTransientExtra(NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getSlotAlpha())) != null && !a0.LJJJIL(transientExtra)) {
            Float fLJIIIIZZ = C2327809Ae.LJIIIIZZ(transientExtra);
            if (fLJIIIIZZ == null) {
                return 1.0f;
            }
            return fLJIIIIZZ.floatValue();
        }
        Float fLJIILIIL = LJIILIIL(nLETrackSlot);
        if (fLJIILIIL == null) {
            return 1.0f;
        }
        return fLJIILIIL.floatValue();
    }

    public static final float LJJLIIJ(NLETrackSlot nLETrackSlot) {
        String transientExtra;
        VecNLETrackSlotSPtr keyframes = nLETrackSlot.getKeyframes();
        if (keyframes != null && !keyframes.isEmpty() && (transientExtra = nLETrackSlot.getTransientExtra(NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getSlotRotation())) != null && !a0.LJJJIL(transientExtra)) {
            return CastFloatProtector.parseFloat(transientExtra);
        }
        return nLETrackSlot.getRotation();
    }

    public static final float LJJLIL(NLETrackSlot nLETrackSlot) {
        String transientExtra;
        VecNLETrackSlotSPtr keyframes = nLETrackSlot.getKeyframes();
        if (keyframes != null && !keyframes.isEmpty() && (transientExtra = nLETrackSlot.getTransientExtra(NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getSlotX())) != null && !a0.LJJJIL(transientExtra)) {
            return CastFloatProtector.parseFloat(transientExtra);
        }
        return nLETrackSlot.getTransformX();
    }

    public static final float LJJLJ(NLETrackSlot nLETrackSlot) {
        String transientExtra;
        VecNLETrackSlotSPtr keyframes = nLETrackSlot.getKeyframes();
        if (keyframes != null && !keyframes.isEmpty() && (transientExtra = nLETrackSlot.getTransientExtra(NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getSlotY())) != null && !a0.LJJJIL(transientExtra)) {
            return CastFloatProtector.parseFloat(transientExtra);
        }
        return nLETrackSlot.getTransformY();
    }

    public static final float LJJLJLI(NLETrackSlot nLETrackSlot) {
        String transientExtra;
        VecNLETrackSlotSPtr keyframes = nLETrackSlot.getKeyframes();
        if (keyframes != null && !keyframes.isEmpty() && (transientExtra = nLETrackSlot.getTransientExtra(NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getSlotVolume())) != null && !a0.LJJJIL(transientExtra)) {
            return CastFloatProtector.parseFloat(transientExtra);
        }
        return LJLLLL(nLETrackSlot.getMainSegment());
    }

    public static final NLEFilter LJJLL(NLETrackSlot nLETrackSlot) {
        NLEFilter next;
        Iterator<NLEFilter> it2 = nLETrackSlot.getFilters().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                NLEFilter nLEFilter = next;
                if (nLEFilter.getSegment() != null && NLEEditorJniJNI.NLEFilterName_getAUDIO_SAMI_FILTER().equals(nLEFilter.getSegment().getFilterName())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    public static final String LJJZ(NLETrackSlot nLETrackSlot) {
        NLESegmentEffect nLESegmentEffectDynamicCast = NLESegmentEffect.dynamicCast(nLETrackSlot.getMainSegment());
        if (nLESegmentEffectDynamicCast != null) {
            return nLESegmentEffectDynamicCast.getEffectSDKEffect().getResourceId();
        }
        NLESegmentComposerFilter nLESegmentComposerFilterDynamicCast = NLESegmentComposerFilter.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (nLESegmentComposerFilterDynamicCast != null) {
            return nLESegmentComposerFilterDynamicCast.getEffectSDKFilter().getResourceId();
        }
        NLESegmentVideoAnimation nLESegmentVideoAnimationDynamicCast = NLESegmentVideoAnimation.dynamicCast(nLETrackSlot.getMainSegment());
        if (nLESegmentVideoAnimationDynamicCast != null) {
            return nLESegmentVideoAnimationDynamicCast.getEffectSDKVideoAnimation().getResourceId();
        }
        return null;
    }

    public static final EnumC356170Dxn LJJZZI(NLETrackSlot nLETrackSlot) {
        if (NLESegmentTextTemplate.dynamicCast(nLETrackSlot.getMainSegment()) != null) {
            return EnumC356170Dxn.TEXT_TEMPLATE;
        }
        if (NLESegmentTextSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment()) != null) {
            return EnumC356170Dxn.TEXT_STICKER;
        }
        if (NLESegmentInfoSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment()) != null) {
            return EnumC356170Dxn.INFO_STICKER;
        }
        return EnumC356170Dxn.TEXT_ANIM;
    }

    public static final List<NLETrackSlot> LJLI(NLEModel nLEModel) {
        ArrayList arrayList = new ArrayList();
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList2 = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (LLLLJ(nLETrack)) {
                arrayList2.add(nLETrack);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            for (NLETrackSlot nLETrackSlot : ((NLETrack) it2.next()).getSlots()) {
                if (LLIIII(nLETrackSlot)) {
                    arrayList.add(nLETrackSlot);
                }
            }
        }
        return arrayList;
    }

    public static final List<NLESegmentComposerFilter> LJLIIIL(NLEModel nLEModel) {
        NLESegmentComposerFilter nLESegmentComposerFilterDynamicCast;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) LJLI(nLEModel)).iterator();
        while (it2.hasNext()) {
            NLEFilter nLEFilterLJJJI = LJJJI((NLETrackSlot) it2.next());
            if (nLEFilterLJJJI != null && (nLESegmentComposerFilterDynamicCast = NLESegmentComposerFilter.dynamicCast((NLENode) nLEFilterLJJJI.getSegment())) != null) {
                arrayList.add(nLESegmentComposerFilterDynamicCast);
            }
        }
        return arrayList;
    }

    public static final int LJLIIL(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (LLLILZLLLI(nLETrack)) {
                arrayList.add(nLETrack);
            }
        }
        Iterator it2 = arrayList.iterator();
        int size = 0;
        while (it2.hasNext()) {
            size += ((NLETrack) it2.next()).getSlots().size();
        }
        return size;
    }

    public static final List<NLETrack> LJLIL(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (LLLILZLLLI(nLETrack)) {
                arrayList.add(nLETrack);
            }
        }
        return arrayList;
    }

    public static final float LJLILLLLZI(NLESegment nLESegment) {
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLESegment);
        if (nLESegmentVideoDynamicCast != null) {
            return nLESegmentVideoDynamicCast.getAbsSpeed();
        }
        NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLESegment);
        if (nLESegmentAudioDynamicCast != null) {
            return nLESegmentAudioDynamicCast.getAbsSpeed();
        }
        return 1.0f;
    }

    public static final String LJLJJI(NLETrackSlot nLETrackSlot) {
        String resourceId;
        String resourceId2;
        NLESegmentInfoSticker nLESegmentInfoStickerDynamicCast = NLESegmentInfoSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (nLESegmentInfoStickerDynamicCast != null) {
            NLEResourceNode effectSDKFile = nLESegmentInfoStickerDynamicCast.getEffectSDKFile();
            if (effectSDKFile == null || (resourceId2 = effectSDKFile.getResourceId()) == null) {
                return "";
            }
            return resourceId2;
        }
        NLESegmentImageSticker nLESegmentImageStickerDynamicCast = NLESegmentImageSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (nLESegmentImageStickerDynamicCast != null) {
            NLEResourceNode imageFile = nLESegmentImageStickerDynamicCast.getImageFile();
            if (imageFile == null || (resourceId = imageFile.getResourceId()) == null) {
                return "";
            }
            return resourceId;
        }
        return null;
    }

    public static final String LJLJJL(NLETrackSlot nLETrackSlot) {
        String resourceFile;
        String resourceFile2;
        NLESegmentInfoSticker nLESegmentInfoStickerDynamicCast = NLESegmentInfoSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (nLESegmentInfoStickerDynamicCast != null) {
            NLEResourceNode effectSDKFile = nLESegmentInfoStickerDynamicCast.getEffectSDKFile();
            if (effectSDKFile == null || (resourceFile2 = effectSDKFile.getResourceFile()) == null) {
                return "";
            }
            return resourceFile2;
        }
        NLESegmentImageSticker nLESegmentImageStickerDynamicCast = NLESegmentImageSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (nLESegmentImageStickerDynamicCast != null) {
            NLEResourceNode imageFile = nLESegmentImageStickerDynamicCast.getImageFile();
            if (imageFile == null || (resourceFile = imageFile.getResourceFile()) == null) {
                return "";
            }
            return resourceFile;
        }
        return null;
    }

    public static final List<NLETrack> LJLJJLL(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if (nLETrack2.getEnable() && C350870DpF.LJIIIIZZ(nLETrack2) == NLETrackType.STICKER) {
                arrayList.add(nLETrack);
            }
        }
        return arrayList;
    }

    public static final int LJLJLLL(NLEModel nLEModel) {
        int i;
        int i2;
        int i3;
        int i4;
        if (((ArrayList) LJJI(nLEModel)).isEmpty()) {
            return 0;
        }
        Iterator it2 = ((ArrayList) LJJI(nLEModel)).iterator();
        if (it2.hasNext()) {
            Iterator<NLETrackSlot> it3 = ((NLETrack) it2.next()).getSlots().iterator();
            if (it3.hasNext()) {
                NLETrackSlot next = it3.next();
                if (next.hasExtra("ep_slot_add_order")) {
                    i = CastIntegerProtector.parseInt(next.getExtra("ep_slot_add_order"));
                } else {
                    i = 0;
                }
                while (it3.hasNext()) {
                    NLETrackSlot next2 = it3.next();
                    if (next2.hasExtra("ep_slot_add_order")) {
                        i4 = CastIntegerProtector.parseInt(next2.getExtra("ep_slot_add_order"));
                    } else {
                        i4 = 0;
                    }
                    if (i < i4) {
                        i = i4;
                    }
                }
                while (it2.hasNext()) {
                    Iterator<NLETrackSlot> it4 = ((NLETrack) it2.next()).getSlots().iterator();
                    if (it4.hasNext()) {
                        NLETrackSlot next3 = it4.next();
                        if (next3.hasExtra("ep_slot_add_order")) {
                            i2 = CastIntegerProtector.parseInt(next3.getExtra("ep_slot_add_order"));
                        } else {
                            i2 = 0;
                        }
                        while (it4.hasNext()) {
                            NLETrackSlot next4 = it4.next();
                            if (next4.hasExtra("ep_slot_add_order")) {
                                i3 = CastIntegerProtector.parseInt(next4.getExtra("ep_slot_add_order"));
                            } else {
                                i3 = 0;
                            }
                            if (i2 < i3) {
                                i2 = i3;
                            }
                        }
                        if (i < i2) {
                            i = i2;
                        }
                    } else {
                        throw new NoSuchElementException();
                    }
                }
                return i + 1;
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }

    public static final int LJLL(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (LLLJL(nLETrack)) {
                arrayList.add(nLETrack);
            }
        }
        Iterator it2 = arrayList.iterator();
        int size = 0;
        while (it2.hasNext()) {
            size += ((NLETrack) it2.next()).getSlots().size();
        }
        return size;
    }

    public static final List<NLETrack> LJLLI(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (LLLJL(nLETrack)) {
                arrayList.add(nLETrack);
            }
        }
        return arrayList;
    }

    public static final String LJLLJ(NLETrack nLETrack) {
        if (nLETrack.hasExtra("track_type")) {
            return nLETrack.getExtra("track_type");
        }
        return "";
    }

    public static final NLEResType LJLLL(NLETrackSlot nLETrackSlot) {
        NLEResourceAV aVFile;
        NLEResType resourceType;
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (nLESegmentVideoDynamicCast != null && (aVFile = nLESegmentVideoDynamicCast.getAVFile()) != null && (resourceType = aVFile.getResourceType()) != null) {
            return resourceType;
        }
        return NLEResType.NONE;
    }

    public static final float LJLLLL(NLESegment nLESegment) {
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLESegment);
        if (nLESegmentVideoDynamicCast != null) {
            return nLESegmentVideoDynamicCast.getVolume();
        }
        NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLESegment);
        if (nLESegmentAudioDynamicCast != null) {
            return nLESegmentAudioDynamicCast.getVolume();
        }
        return 0.0f;
    }

    public static final boolean LJLZ(NLETrackSlot nLETrackSlot) {
        NLEAIMatting aIMatting = nLETrackSlot.getAIMatting();
        if (aIMatting == null) {
            return false;
        }
        int mattingType = NLESegmentAIMatting.dynamicCast(aIMatting.getSegment()).getMattingType();
        if (NLEAIMattingType.TYPE_AI.swigValue() != mattingType && NLEAIMattingType.MATTING_TYPE_SCRIPT_SALIENCY.swigValue() != mattingType) {
            return false;
        }
        return true;
    }

    public static final boolean LJZ(NLETrackSlot nLETrackSlot) {
        NLESegmentAudio nLESegmentAudioDynamicCast;
        if (nLETrackSlot == null || (nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment())) == null) {
            return false;
        }
        if (!(!nLESegmentAudioDynamicCast.getSegCurveSpeedPoints().isEmpty()) && !(!nLESegmentAudioDynamicCast.getCurveSpeedPoints().isEmpty())) {
            return false;
        }
        return true;
    }

    public static final boolean LJZI(NLETrackSlot nLETrackSlot) {
        if (nLETrackSlot == null) {
            return false;
        }
        if (u.LJIJI(nLETrackSlot.getExtra("ep_curve_speed_english_name"), "custom", true) && LLJILJILJ(nLETrackSlot, "7373316919312519696")) {
            return false;
        }
        return LJZ(nLETrackSlot);
    }

    public static final boolean LJZL(NLETrackSlot nLETrackSlot) {
        NLEAIMatting aIMatting = nLETrackSlot.getAIMatting();
        if (aIMatting == null) {
            return false;
        }
        if ((NLESegmentAIMatting.dynamicCast(aIMatting.getSegment()).getMattingType() & NLEAIMattingType.TYPE_CUSTOM.swigValue()) <= 0) {
            return false;
        }
        return true;
    }

    public static final boolean LL(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        if (tracks == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it2 = tracks.iterator();
        while (it2.hasNext()) {
            Iterable slots = it2.next().getSlots();
            if (slots == null) {
                slots = C13BV.INSTANCE;
            }
            C19719612Di.LJJI(slots, arrayList);
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            if (LLD((NLETrackSlot) it3.next())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LLD(NLETrackSlot nLETrackSlot) {
        NLESegmentAIMatting segment;
        boolean z;
        NLEAIMatting aIMatting = nLETrackSlot.getAIMatting();
        VecNLEMattingStroke strokes = null;
        if (aIMatting != null) {
            segment = aIMatting.getSegment();
        } else {
            segment = null;
        }
        NLESegmentAIMatting nLESegmentAIMattingDynamicCast = NLESegmentAIMatting.dynamicCast(segment);
        if (nLESegmentAIMattingDynamicCast != null) {
            strokes = nLESegmentAIMattingDynamicCast.getStrokes();
        }
        if (strokes != null && !strokes.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        return true ^ z;
    }

    public static final boolean LLF(NLETrackSlot nLETrackSlot) {
        if (nLETrackSlot == null || nLETrackSlot.getKeyframes().size() <= 0) {
            return false;
        }
        return true;
    }

    public static final boolean LLFFF(NLEModel nLEModel) {
        VecNLETrackSPtr tracks;
        VecNLETrackSlotSPtr slots;
        if (nLEModel != null && (tracks = nLEModel.getTracks()) != null) {
            for (NLETrack nLETrack : tracks) {
                NLETrack nLETrack2 = nLETrack;
                if (LLJLLIL(nLETrack2) && (slots = nLETrack2.getSlots()) != null && !slots.isEmpty()) {
                    if (nLETrack != null) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    public static final boolean LLFII(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        if (tracks == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it2 = tracks.iterator();
        while (it2.hasNext()) {
            Iterable slots = it2.next().getSlots();
            if (slots == null) {
                slots = C13BV.INSTANCE;
            }
            C19719612Di.LJJI(slots, arrayList);
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            VecNLEMaskSPtr masks = ((NLETrackSlot) it3.next()).getMasks();
            if (masks != null && !masks.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LLFZ(NLETrackSlot nLETrackSlot) {
        if (nLETrackSlot == null) {
            return false;
        }
        List<C351410Dq7> listLJIIJ = LJIIJ(nLETrackSlot);
        if (listLJIIJ.isEmpty()) {
            return false;
        }
        Iterator<C351410Dq7> it2 = listLJIIJ.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) C13LP.LJJJLL(it2.next().LIZ.LIZJ);
            if (pair == null || ((Number) pair.getSecond()).intValue() != 0) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LLI(NLETrackSlot nLETrackSlot) {
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (nLESegmentVideoDynamicCast == null) {
            return false;
        }
        return nLESegmentVideoDynamicCast.getAVFile().getHasAudio();
    }

    public static final boolean LLIFFJFJJ(NLETrackSlot nLETrackSlot) {
        if ((nLETrackSlot.hasExtra("has_origin_audio_slot") && Boolean.parseBoolean(nLETrackSlot.getExtra("has_origin_audio_slot"))) || (nLETrackSlot.hasExtra("original_audio_uuid") && (!a0.LJJJIL(nLETrackSlot.getExtra("original_audio_uuid"))))) {
            return true;
        }
        return false;
    }

    public static final boolean LLII(NLEModel nLEModel) {
        for (NLETrackSlot nLETrackSlot : nLEModel.getMainTrack(true).getSlots()) {
            if (nLETrackSlot.hasExtra("slot_extra_source_type") && Intrinsics.LJFF(nLETrackSlot.getExtra("slot_extra_source_type"), String.valueOf(EnumC356140Dxk.RecordFromRecordPage.getValue()))) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LLIIII(NLETrackSlot nLETrackSlot) {
        if (LJJJI(nLETrackSlot) != null) {
            return true;
        }
        return false;
    }

    public static final boolean LLIIIILZ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (nLETrack.getTrackType() == NLETrackType.VIDEO) {
                arrayList.add(nLETrack);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
        }
        if (!arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                if (LLLIL((NLETrackSlot) it3.next())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static final boolean LLIIIJ(NLETrackSlot nLETrackSlot) {
        if (nLETrackSlot == null || nLETrackSlot.getSwingKeyframes().size() <= 0) {
            return false;
        }
        return true;
    }

    public static final boolean LLIIIZ(NLEModel nLEModel) {
        Float fLJIILIIL;
        if (nLEModel == null) {
            return false;
        }
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList<NLETrackSlot> arrayList = new ArrayList();
        Iterator<NLETrack> it2 = tracks.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(it2.next().getSlots(), arrayList);
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        for (NLETrackSlot nLETrackSlot : arrayList) {
            if (nLETrackSlot != null && (fLJIILIIL = LJIILIIL(nLETrackSlot)) != null && fLJIILIIL.floatValue() != 1.0f) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LLIIJI(NLETrackSlot nLETrackSlot) {
        if (nLETrackSlot.getVideoAnims().size() > 0) {
            VecNLEVideoAnimationSPtr videoAnims = nLETrackSlot.getVideoAnims();
            if (!(videoAnims instanceof Collection) || !videoAnims.isEmpty()) {
                for (NLEVideoAnimation nLEVideoAnimation : videoAnims) {
                    if (!LLJJJJJIL(nLEVideoAnimation) && NLESegmentVideoAnimation.dynamicCast(nLEVideoAnimation.getSegment()) != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean LLIIL(NLEFilter nLEFilter) {
        return Intrinsics.LJFF(nLEFilter.getExtra("part_filter_type"), "adjust");
    }

    public static final boolean LLIILII(NLETrack nLETrack) {
        NLETrackSlot nLETrackSlot;
        if (nLETrack == null) {
            return false;
        }
        if (!nLETrack.getSlots().isEmpty() && Intrinsics.LJFF(LJLLJ(nLETrack), "type_filter_adjust")) {
            return true;
        }
        if (nLETrack.getTrackType() != NLETrackType.FILTER || (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(nLETrack.getSlots())) == null || !LLJJIJIIJIL(nLETrackSlot)) {
            return false;
        }
        return true;
    }

    public static final boolean LLIILZL(NLETrack nLETrack) {
        if (!LLIILII(nLETrack) || (nLETrack != null && nLETrack.hasExtra("global_adjust_shadow"))) {
            return false;
        }
        return true;
    }

    public static final boolean LLIIZ(NLETrack nLETrack) {
        if (!LLIILII(nLETrack) || nLETrack == null || !nLETrack.hasExtra("global_adjust_shadow")) {
            return false;
        }
        return true;
    }

    public static final boolean LLIL(NLETrackSlot nLETrackSlot) {
        NLEAlphaSplitType alphaSplitType;
        NLESegment mainSegment;
        NLEResourceNode resource;
        if (nLETrackSlot != null && (mainSegment = nLETrackSlot.getMainSegment()) != null && (resource = mainSegment.getResource()) != null) {
            alphaSplitType = resource.getAlphaSplitType();
        } else {
            alphaSplitType = null;
        }
        if (alphaSplitType == NLEAlphaSplitType.H264_LR) {
            return true;
        }
        return false;
    }

    public static final boolean LLILII(NLETrackSlot nLETrackSlot) {
        boolean z;
        String extra = nLETrackSlot.getExtra("creation_async_task_id");
        if (extra != null && extra.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        return !z;
    }

    public static final boolean LLILIL(NLEFilter nLEFilter) {
        String filterName;
        List listLJIIJJI = C1697810uHb.LJIIJJI(NLEEditorJniJNI.NLEFilterName_getAUDIO_SAMI_FILTER(), NLEEditorJniJNI.NLEFilterName_getAUDIO_DSP_FILTER(), NLEEditorJniJNI.NLEFilterName_getAUDIO_VOLUME_FILTER(), NLEEditorJniJNI.NLEFilterName_getAUDIO_COMMON_FILTER(), NLEEditorJniJNI.NLEFilterName_getAUDIO_MATRIX_FILTER(), NLEEditorJniJNI.NLEFilterName_getAUDIO_EFFECT_ADJUST(), NLEEditorJniJNI.NLEFilterName_getAUDIO_LOUDNESS_BALANCE_FILTER(), NLEEditorJniJNI.NLEFilterName_getAUDIO_FADE_FILTER());
        NLESegmentFilter segment = nLEFilter.getSegment();
        if (segment != null) {
            filterName = segment.getFilterName();
        } else {
            filterName = null;
        }
        return listLJIIJJI.contains(filterName);
    }

    public static final boolean LLILL(NLETrack nLETrack) {
        if (C350870DpF.LJIIIIZZ(nLETrack) == NLETrackType.AUDIO && Intrinsics.LJFF(nLETrack.getExtra("AudioTrackType"), "AUDIO_RECORD")) {
            return true;
        }
        return false;
    }

    public static final boolean LLILLIZIL(NLETrackSlot nLETrackSlot) {
        if (NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment()) != null && NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment()) == null) {
            return true;
        }
        return false;
    }

    public static final boolean LLILLJJLI(NLETrack nLETrack) {
        if (nLETrack == null) {
            return false;
        }
        NLETrackType trackType = nLETrack.getTrackType();
        NLETrackType nLETrackType = NLETrackType.AUDIO;
        if (trackType != nLETrackType && nLETrack.getExtraTrackType() != nLETrackType) {
            return false;
        }
        return true;
    }

    public static final boolean LLILLL(NLETrack nLETrack) {
        if (nLETrack == null || C350870DpF.LJIIIIZZ(nLETrack) != NLETrackType.AUDIO || !Intrinsics.LJFF(nLETrack.getExtra("AudioTrackType"), "BGM")) {
            return false;
        }
        return true;
    }

    public static final boolean LLILZ(NLETrack nLETrack) {
        if (nLETrack == null || C350870DpF.LJIIIIZZ(nLETrack) != NLETrackType.AUDIO) {
            return false;
        }
        if (!Intrinsics.LJFF(nLETrack.getExtra("AudioTrackType"), "BGM") && !u.LJIJI(nLETrack.getExtra("biz_extra_type"), "BGM", true)) {
            return false;
        }
        return true;
    }

    public static final boolean LLILZIL(NLEFilter nLEFilter) {
        if (!nLEFilter.hasExtra("part_filter_type")) {
            return false;
        }
        return Intrinsics.LJFF(nLEFilter.getExtra("part_filter_type"), "beauty_filter");
    }

    public static final boolean LLILZLL(NLEStringFloatPair nLEStringFloatPair) {
        if (!nLEStringFloatPair.hasExtra("is_beauty_res_range_two_ways")) {
            return false;
        }
        return Boolean.parseBoolean(nLEStringFloatPair.getExtra("is_beauty_res_range_two_ways"));
    }

    public static final boolean LLIZ(NLETrackSlot nLETrackSlot) {
        String strLJLJL = LJLJL(nLETrackSlot, "sticker_type", EnumC356160Dxm.NORMAL.toString());
        if (strLJLJL == null) {
            strLJLJL = "";
        }
        if (!Intrinsics.LJFF(strLJLJL, EnumC356160Dxm.TIME.toString()) && !Intrinsics.LJFF(strLJLJL, EnumC356160Dxm.DATE.toString())) {
            return false;
        }
        return true;
    }

    public static final boolean LLIZLLLIL(NLETrackSlot nLETrackSlot) {
        VecNLEChromaChannelSPtr chromaChannels = nLETrackSlot.getChromaChannels();
        if (chromaChannels == null || chromaChannels.isEmpty()) {
            return false;
        }
        Iterator<NLEChromaChannel> it2 = chromaChannels.iterator();
        while (it2.hasNext()) {
            NLESegmentChromaChannel segment = it2.next().getSegment();
            if (segment != null && (segment.getIntensity() > 0.0f || segment.getShadow() > 0.0f)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LLJ(NLETrackSlot nLETrackSlot) {
        if (nLETrackSlot == null || NLESegmentComposerFilter.dynamicCast((NLENode) nLETrackSlot.getMainSegment()) == null || !nLETrackSlot.hasExtra("global_filter_type")) {
            return false;
        }
        return Intrinsics.LJFF(nLETrackSlot.getExtra("global_filter_type"), "color_filter");
    }

    public static final boolean LLJI(NLETrack nLETrack) {
        String extra;
        boolean z;
        if (nLETrack == null) {
            return false;
        }
        String extra2 = "";
        if (!nLETrack.hasExtra("FilterTrackType")) {
            extra = "";
        } else {
            extra = nLETrack.getExtra("FilterTrackType");
        }
        if (nLETrack.hasExtra("biz_extra_type")) {
            extra2 = nLETrack.getExtra("biz_extra_type");
        }
        if (!Intrinsics.LJFF(LJLLJ(nLETrack), "type_filter_filter") && !Intrinsics.LJFF(extra, "COLOR") && !Intrinsics.LJFF(extra2, "color_filter")) {
            z = false;
        } else {
            z = true;
        }
        if (C350870DpF.LJIIIIZZ(nLETrack) != NLETrackType.FILTER || !z) {
            return false;
        }
        return true;
    }

    public static final boolean LLJIJIL(NLEVideoAnimation nLEVideoAnimation) {
        NLEResType resourceType;
        NLEResourceNode effectSDKVideoAnimation;
        if (nLEVideoAnimation == null) {
            return false;
        }
        if (!nLEVideoAnimation.hasExtra("anim_type")) {
            NLEResType nLEResType = NLEResType.ANIMATION_VIDEO_COMBO;
            NLESegmentVideoAnimation segment = nLEVideoAnimation.getSegment();
            if (segment != null && (effectSDKVideoAnimation = segment.getEffectSDKVideoAnimation()) != null) {
                resourceType = effectSDKVideoAnimation.getResourceType();
            } else {
                resourceType = null;
            }
            if (nLEResType != resourceType) {
                return false;
            }
            return true;
        }
        return Intrinsics.LJFF(nLEVideoAnimation.getExtra("anim_type"), "combo_video_anim");
    }

    public static final boolean LLJILJIL(NLETrackSlot nLETrackSlot) {
        if (nLETrackSlot == null || !LLLLIL(nLETrackSlot) || !Intrinsics.LJFF(LJIIZILJ(nLETrackSlot), "combo_video_anim")) {
            return false;
        }
        return true;
    }

    public static final boolean LLJILLL(NLETrack nLETrack) {
        if (nLETrack == null || C350870DpF.LJIIIIZZ(nLETrack) != NLETrackType.AUDIO || !Intrinsics.LJFF(nLETrack.getExtra("AudioTrackType"), "EDITOR_MUSIC")) {
            return false;
        }
        return true;
    }

    public static final boolean LLJJ(NLETrackSlot nLETrackSlot) {
        if (nLETrackSlot.hasExtra("slot_extra_source_type")) {
            Integer numLJIIJJI = C2095008Iq.LJIIJJI(nLETrackSlot.getExtra("slot_extra_source_type"));
            int value = EnumC356140Dxk.RecordFromEditorPro.getValue();
            if (numLJIIJJI != null && numLJIIJJI.intValue() == value) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LLJJI(NLETrackSlot nLETrackSlot) {
        String filterName;
        if (nLETrackSlot == null) {
            return false;
        }
        if (NLESegmentEffect.dynamicCast(nLETrackSlot.getMainSegment()) != null) {
            return true;
        }
        if (NLESegmentComposerFilter.dynamicCast((NLENode) nLETrackSlot.getMainSegment()) == null) {
            return false;
        }
        if (!nLETrackSlot.hasExtra("global_filter_type")) {
            NLESegmentComposerFilter nLESegmentComposerFilterDynamicCast = NLESegmentComposerFilter.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
            if (nLESegmentComposerFilterDynamicCast == null || (filterName = nLESegmentComposerFilterDynamicCast.getFilterName()) == null) {
                filterName = "";
            }
            if (Intrinsics.LJFF(filterName, "color_filter") || !(!a0.LJJJIL(filterName))) {
                return false;
            }
            return true;
        }
        return Intrinsics.LJFF(nLETrackSlot.getExtra("global_filter_type"), "composer_effect");
    }

    public static final boolean LLJJIII(NLETrack nLETrack) {
        if (nLETrack == null || C350870DpF.LJIIIIZZ(nLETrack) != NLETrackType.EFFECT || !Intrinsics.LJFF(nLETrack.getExtra("EffectTrackType"), "NORMAL")) {
            return false;
        }
        return true;
    }

    public static final boolean LLJJIJI(NLETrack nLETrack) {
        if (nLETrack.hasExtra("ep_from_pugc_template")) {
            return Intrinsics.LJFF(nLETrack.getExtra("ep_from_pugc_template"), "true");
        }
        return false;
    }

    public static final boolean LLJJIJIIJIL(NLETrackSlot nLETrackSlot) {
        return Intrinsics.LJFF(nLETrackSlot.getExtra("global_filter_type"), "adjust");
    }

    public static final boolean LLJJIJIL(NLETrackSlot nLETrackSlot) {
        NLEResourceNode resource;
        NLEResType resourceType;
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (nLESegmentVideoDynamicCast == null) {
            resourceType = NLEResType.NONE;
        } else {
            C351510DqH.LIZ.getClass();
            if (C351510DqH.LJJIL(nLETrackSlot)) {
                resource = C351510DqH.LJJIIJZLJL(nLETrackSlot);
            } else {
                resource = nLESegmentVideoDynamicCast.getResource();
            }
            if (resource == null || (resourceType = resource.getResourceType()) == null) {
                resourceType = NLEResType.NONE;
            }
        }
        if (resourceType == NLEResType.IMAGE) {
            return true;
        }
        return false;
    }

    public static final boolean LLJJJ(NLETrackSlot nLETrackSlot) {
        if (LJLLL(nLETrackSlot) == NLEResType.IMAGE) {
            return true;
        }
        return false;
    }

    public static final boolean LLJJJIL(NLETrackSlot nLETrackSlot) {
        if (NLESegmentImageSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment()) != null) {
            return true;
        }
        return false;
    }

    public static final boolean LLJJJJ(NLETrack nLETrack) {
        if (nLETrack == null || C350870DpF.LJIIIIZZ(nLETrack) != NLETrackType.STICKER || !Intrinsics.LJFF(nLETrack.getExtra("StickerTrackType"), "IMAGE")) {
            return false;
        }
        return true;
    }

    public static final boolean LLJJJJJIL(NLEVideoAnimation nLEVideoAnimation) {
        if (nLEVideoAnimation == null || NLESegmentImageVideoAnimation.dynamicCast((NLENode) nLEVideoAnimation.getSegment()) == null) {
            return false;
        }
        return true;
    }

    public static final boolean LLJJJJLIIL(NLEVideoAnimation nLEVideoAnimation) {
        NLEResType resourceType;
        NLEResourceNode effectSDKVideoAnimation;
        if (nLEVideoAnimation == null) {
            return false;
        }
        if (!nLEVideoAnimation.hasExtra("anim_type")) {
            NLEResType nLEResType = NLEResType.ANIMATION_VIDEO_IN;
            NLESegmentVideoAnimation segment = nLEVideoAnimation.getSegment();
            if (segment != null && (effectSDKVideoAnimation = segment.getEffectSDKVideoAnimation()) != null) {
                resourceType = effectSDKVideoAnimation.getResourceType();
            } else {
                resourceType = null;
            }
            if (nLEResType != resourceType) {
                return false;
            }
            return true;
        }
        return Intrinsics.LJFF(nLEVideoAnimation.getExtra("anim_type"), "in_video_anim");
    }

    public static final boolean LLJJL(NLETrackSlot nLETrackSlot) {
        if (nLETrackSlot == null || !LLLLIL(nLETrackSlot) || !Intrinsics.LJFF(LJIIZILJ(nLETrackSlot), "in_video_anim")) {
            return false;
        }
        return true;
    }

    public static final boolean LLJJLIIIJLLLLLLLZ(NLETrackSlot nLETrackSlot) {
        if (!LLJL(nLETrackSlot) && !LLJJJIL(nLETrackSlot)) {
            return false;
        }
        return true;
    }

    public static final boolean LLJL(NLETrackSlot nLETrackSlot) {
        if (NLESegmentInfoSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment()) != null) {
            return true;
        }
        return false;
    }

    public static final boolean LLJLIL(NLETrack nLETrack) {
        if (nLETrack.getEnable()) {
            if (LLJLILLLLZIIL(nLETrack) || LLJJJJ(nLETrack)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LLJLILLLLZIIL(NLETrack nLETrack) {
        if (nLETrack == null || C350870DpF.LJIIIIZZ(nLETrack) != NLETrackType.STICKER || !Intrinsics.LJFF(nLETrack.getExtra("StickerTrackType"), "INFO")) {
            return false;
        }
        return true;
    }

    public static final boolean LLJLL(NLETrack nLETrack) {
        VecNLETrackSlotSPtr slots;
        if ((!LLILLL(nLETrack) && !LLJILLL(nLETrack)) || (slots = nLETrack.getSlots()) == null || slots.size() <= 1) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (NLETrackSlot nLETrackSlot : slots) {
            String strLIZJ = C348350DlB.LIZJ(nLETrackSlot);
            if (strLIZJ != null && C123100dR.LIZ(strLIZJ)) {
                arrayList.add(nLETrackSlot);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String strLIZJ2 = C348350DlB.LIZJ((NLETrackSlot) it2.next());
            if (strLIZJ2 == null) {
                strLIZJ2 = "";
            }
            arrayList2.add(strLIZJ2);
        }
        if (arrayList2.size() != slots.size() || C13LP.LJJJJI(arrayList2).size() != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LLJLLIL(NLETrack nLETrack) {
        NLETrackType extraTrackType;
        if (nLETrack != null) {
            extraTrackType = nLETrack.getExtraTrackType();
        } else {
            extraTrackType = null;
        }
        if (extraTrackType == NLETrackType.COLLECTION && Intrinsics.LJFF(nLETrack.getExtra("StickerTrackName"), "lyric")) {
            return true;
        }
        return false;
    }

    public static final boolean LLJLLL(NLETrackSlot nLETrackSlot) {
        return Intrinsics.LJFF(nLETrackSlot.getExtra("is_from_ep_magic"), "true");
    }

    public static final boolean LLJZ(NLETrackSlot nLETrackSlot) {
        if (LLJLLL(nLETrackSlot) && LLILII(nLETrackSlot) && !C0E5J.LIZ(nLETrackSlot)) {
            return true;
        }
        return false;
    }

    public static final boolean LLJZIJLIL(NLETrackSlot nLETrackSlot) {
        String strLJLJL = LJLJL(nLETrackSlot, "sticker_type", EnumC356160Dxm.NORMAL.toString());
        if (strLJLJL == null) {
            strLJLJL = "";
        }
        return Intrinsics.LJFF(strLJLJL, EnumC356160Dxm.MAGNIFIER.toString());
    }

    public static final boolean LLL(NLEModel nLEModel) {
        if (LJJJJLL(nLEModel).size() > 1) {
            return true;
        }
        return false;
    }

    public static final boolean LLLF(NLETrackSlot nLETrackSlot) {
        if (nLETrackSlot.hasExtra("slot_extra_muted_by_algorithm")) {
            return Boolean.parseBoolean(nLETrackSlot.getExtra("slot_extra_muted_by_algorithm"));
        }
        return false;
    }

    public static final boolean LLLFF(NLETrack nLETrack) {
        if (nLETrack != null && C350870DpF.LJIIIIZZ(nLETrack) == NLETrackType.AUDIO && ((List) LIZIZ.getValue()).contains(nLETrack.getExtra("AudioTrackType"))) {
            return true;
        }
        return false;
    }

    public static final boolean LLLFFI(NLETrackSlot nLETrackSlot) {
        if (LJLLLL(nLETrackSlot.getMainSegment()) == 0.0f) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList] */
    public static final boolean LLLFZ(NLETrackSlot nLETrackSlot) {
        ?? arrayList;
        Float fValueOf;
        if (nLETrackSlot == null) {
            return false;
        }
        Float fValueOf2 = null;
        if (nLETrackSlot.getKeyframes().size() > 0) {
            Iterator<NLETrackSlot> it2 = nLETrackSlot.getKeyframes().iterator();
            while (it2.hasNext()) {
                NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(it2.next().getMainSegment());
                if (nLESegmentAudioDynamicCast != null) {
                    fValueOf = Float.valueOf(nLESegmentAudioDynamicCast.getVolume());
                } else {
                    fValueOf = null;
                }
                if (!Intrinsics.LIZLLL(fValueOf, 0.0f)) {
                    return false;
                }
            }
            return true;
        }
        if (LLIIIJ(nLETrackSlot)) {
            VecNLEKeyframe swingKeyframes = nLETrackSlot.getSwingKeyframes();
            if (swingKeyframes != null) {
                arrayList = new ArrayList();
                for (NLEKeyframe nLEKeyframe : swingKeyframes) {
                    if (NLEKeyframeType.Volume == nLEKeyframe.getKeyframeType()) {
                        arrayList.add(nLEKeyframe);
                    }
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    VecNLECommonKeyframe sortedCommonKeyframes = ((NLEKeyframe) it3.next()).getSortedCommonKeyframes();
                    if (sortedCommonKeyframes != null) {
                        Iterator<NLECommonKeyframe> it4 = sortedCommonKeyframes.iterator();
                        while (it4.hasNext()) {
                            VecDouble value = it4.next().getValue();
                            if (!(value instanceof Collection) || !value.isEmpty()) {
                                Iterator<Double> it5 = value.iterator();
                                while (it5.hasNext()) {
                                    if (it5.next().doubleValue() > 0.0d) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
                return true;
            }
            NLESegmentAudio nLESegmentAudioDynamicCast2 = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
            if (nLESegmentAudioDynamicCast2 != null) {
                fValueOf2 = Float.valueOf(nLESegmentAudioDynamicCast2.getVolume());
            }
            return Intrinsics.LIZLLL(fValueOf2, 0.0f);
        }
        NLESegmentAudio nLESegmentAudioDynamicCast3 = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
        if (nLESegmentAudioDynamicCast3 != null) {
            fValueOf2 = Float.valueOf(nLESegmentAudioDynamicCast3.getVolume());
        }
        return Intrinsics.LIZLLL(fValueOf2, 0.0f);
    }

    public static final boolean LLLII(NLETrack nLETrack) {
        if (C350870DpF.LJIIIIZZ(nLETrack) == NLETrackType.AUDIO && Intrinsics.LJFF(nLETrack.getExtra("AudioTrackType"), "ORIGIN")) {
            return true;
        }
        return false;
    }

    public static final boolean LLLIIII(NLEVideoAnimation nLEVideoAnimation) {
        NLEResType resourceType;
        NLEResourceNode effectSDKVideoAnimation;
        if (nLEVideoAnimation == null) {
            return false;
        }
        if (!nLEVideoAnimation.hasExtra("anim_type")) {
            NLEResType nLEResType = NLEResType.ANIMATION_VIDEO_OUT;
            NLESegmentVideoAnimation segment = nLEVideoAnimation.getSegment();
            if (segment != null && (effectSDKVideoAnimation = segment.getEffectSDKVideoAnimation()) != null) {
                resourceType = effectSDKVideoAnimation.getResourceType();
            } else {
                resourceType = null;
            }
            if (nLEResType != resourceType) {
                return false;
            }
            return true;
        }
        return Intrinsics.LJFF(nLEVideoAnimation.getExtra("anim_type"), "out_video_anim");
    }

    public static final boolean LLLIIIIL(NLETrackSlot nLETrackSlot) {
        if (nLETrackSlot == null || !LLLLIL(nLETrackSlot) || !Intrinsics.LJFF(LJIIZILJ(nLETrackSlot), "out_video_anim")) {
            return false;
        }
        return true;
    }

    public static final boolean LLLIIIL(NLETrackSlot nLETrackSlot) {
        if (nLETrackSlot.getPinAlgorithmFile() == null && nLETrackSlot.getPinAlgorithmFile() == null) {
            return false;
        }
        return true;
    }

    public static final boolean LLLIIL(NLETrack nLETrack) {
        if (nLETrack == null || !LLLLJ(nLETrack) || nLETrack.getMainTrack()) {
            return false;
        }
        return true;
    }

    public static final boolean LLLIILIL(NLETrackSlot nLETrackSlot) {
        if (nLETrackSlot.hasExtra("slot_extra_source_type")) {
            Integer numLJIIJJI = C2095008Iq.LJIIJJI(nLETrackSlot.getExtra("slot_extra_source_type"));
            int value = EnumC356140Dxk.RecordFromRecordPage.getValue();
            if (numLJIIJJI == null || numLJIIJJI.intValue() != value) {
                Integer numLJIIJJI2 = C2095008Iq.LJIIJJI(nLETrackSlot.getExtra("slot_extra_source_type"));
                int value2 = EnumC356140Dxk.RecordFromEditorPro.getValue();
                if (numLJIIJJI2 != null && numLJIIJJI2.intValue() == value2) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean LLLIL(NLETrackSlot nLETrackSlot) {
        if (nLETrackSlot.hasExtra("is_ep_reverse_video")) {
            return Intrinsics.LJFF(nLETrackSlot.getExtra("is_ep_reverse_video"), "true");
        }
        return false;
    }

    public static final boolean LLLILZ(C0E48 c0e48) {
        NLETrack nLETrackPt;
        NLETrack nLETrackPt2 = c0e48.Pt();
        if (nLETrackPt2 != null && LLLLJ(nLETrackPt2) && (nLETrackPt = c0e48.Pt()) != null && !nLETrackPt.getMainTrack()) {
            return true;
        }
        return false;
    }

    public static final boolean LLLILZLLLI(NLETrack nLETrack) {
        if (C350870DpF.LJIIIIZZ(nLETrack) == NLETrackType.AUDIO && Intrinsics.LJFF(nLETrack.getExtra("AudioTrackType"), "SOUND_EFFECT")) {
            return true;
        }
        return false;
    }

    public static final boolean LLLIZZ(NLETrack nLETrack) {
        if (nLETrack == null) {
            return false;
        }
        NLETrackType trackType = nLETrack.getTrackType();
        NLETrackType nLETrackType = NLETrackType.STICKER;
        if (trackType != nLETrackType && nLETrack.getExtraTrackType() != nLETrackType) {
            return false;
        }
        return true;
    }

    public static final boolean LLLJ(NLETrack nLETrack) {
        if (C350870DpF.LJIIIIZZ(nLETrack) == NLETrackType.AUDIO && Intrinsics.LJFF(nLETrack.getExtra("AudioTrackType"), "TEXT_SPEAK")) {
            return true;
        }
        return false;
    }

    public static final boolean LLLJIL(NLETrackSlot nLETrackSlot) {
        if (NLESegmentTextSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment()) != null) {
            return true;
        }
        return false;
    }

    public static final boolean LLLJL(NLETrack nLETrack) {
        if (nLETrack == null || C350870DpF.LJIIIIZZ(nLETrack) != NLETrackType.STICKER || !Intrinsics.LJFF(nLETrack.getExtra("StickerTrackType"), "TEXT")) {
            return false;
        }
        return true;
    }

    public static final boolean LLLL(NLETrackSlot nLETrackSlot) {
        if (nLETrackSlot.hasExtra("slot_extra_source_type")) {
            if (CastIntegerProtector.parseInt(nLETrackSlot.getExtra("slot_extra_source_type")) == EnumC356140Dxk.UploadFromRecordPage.getValue() || CastIntegerProtector.parseInt(nLETrackSlot.getExtra("slot_extra_source_type")) == EnumC356140Dxk.UploadFromEditorPro.getValue()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LLLLII(NLESegmentHSLFilter nLESegmentHSLFilter) {
        if (nLESegmentHSLFilter.getHue() != 0.5d || nLESegmentHSLFilter.getSaturation() != 0.5d || nLESegmentHSLFilter.getLightness() != 0.5d) {
            return true;
        }
        return false;
    }

    public static final boolean LLLLIIIILLL(NLESegment nLESegment) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (nLESegment == null || !Intrinsics.LJFF(nLESegment.getExtra("adjust_filter_add_from"), "EDITOR_PRO")) {
            return false;
        }
        NLESegmentFilter nLESegmentFilterDynamicCast = NLESegmentFilter.dynamicCast(nLESegment);
        if (nLESegmentFilterDynamicCast != null) {
            if (nLESegmentFilterDynamicCast.getIntensity() == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            z3 = !z;
            Iterator<NLEStringFloatPair> it2 = nLESegmentFilterDynamicCast.getAdjustParamss().iterator();
            while (it2.hasNext()) {
                if (it2.next().getSecond() == 0.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = !z2;
            }
        }
        NLESegmentHSLFilter nLESegmentHSLFilterDynamicCast = NLESegmentHSLFilter.dynamicCast((NLENode) nLESegment);
        if (nLESegmentHSLFilterDynamicCast != null) {
            return LLLLII(nLESegmentHSLFilterDynamicCast);
        }
        return z3;
    }

    public static final boolean LLLLIIL(NLESegment nLESegment) {
        NLESegmentFilter nLESegmentFilterDynamicCast;
        NLEStringFloatPair next;
        boolean z = false;
        if (nLESegment == null || !Intrinsics.LJFF(nLESegment.getExtra("adjust_filter_add_from"), "EDITOR_PRO") || (nLESegmentFilterDynamicCast = NLESegmentFilter.dynamicCast(nLESegment)) == null) {
            return false;
        }
        Iterator<NLEStringFloatPair> it2 = nLESegmentFilterDynamicCast.getAdjustParamss().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.getFirst(), EnumC355950DxR.AUTO_ADJUST.getAdjustParamsName())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NLEStringFloatPair nLEStringFloatPair = next;
        if (nLEStringFloatPair == null) {
            return false;
        }
        if (nLEStringFloatPair.getSecond() == 0.0f) {
            z = true;
        }
        return !z;
    }

    public static final boolean LLLLIILL(NLETrack nLETrack) {
        if (C350870DpF.LJIIIIZZ(nLETrack) == NLETrackType.AUDIO && Intrinsics.LJFF(nLETrack.getExtra("AudioTrackType"), "ORIGIN_VOICE_CONVERSION")) {
            return true;
        }
        return false;
    }

    public static final boolean LLLLIILLL(NLETrackSlot nLETrackSlot) {
        NLESegmentTextSticker nLESegmentTextStickerDynamicCast;
        NLESegmentTextSticker nLESegmentTextStickerDynamicCast2 = NLESegmentTextSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (nLESegmentTextStickerDynamicCast2 != null && nLESegmentTextStickerDynamicCast2.getIsRichtext() && (nLESegmentTextStickerDynamicCast = NLESegmentTextSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment())) != null && nLESegmentTextStickerDynamicCast.getRichContent() != null) {
            return true;
        }
        return false;
    }

    public static final boolean LLLLIL(NLETrackSlot nLETrackSlot) {
        if (nLETrackSlot == null || NLESegmentVideoAnimation.dynamicCast(nLETrackSlot.getMainSegment()) == null) {
            return false;
        }
        return true;
    }

    public static final boolean LLLLILI(NLETrack nLETrack) {
        if (nLETrack == null || C350870DpF.LJIIIIZZ(nLETrack) != NLETrackType.EFFECT || !Intrinsics.LJFF(nLETrack.getExtra("EffectTrackType"), "VIDEO_ANIM")) {
            return false;
        }
        return true;
    }

    public static final boolean LLLLJ(NLETrack nLETrack) {
        if (nLETrack == null) {
            return false;
        }
        NLETrackType trackType = nLETrack.getTrackType();
        NLETrackType nLETrackType = NLETrackType.VIDEO;
        if (trackType != nLETrackType && nLETrack.getExtraTrackType() != nLETrackType) {
            return false;
        }
        return true;
    }

    public static final void LLLLJI(NLETrack nLETrack) {
        nLETrack.setExtra("follow_max", "FALSE");
    }

    public static final float LLLLL(NLETrackSlot nLETrackSlot) {
        float fLJLLLL = LJLLLL(nLETrackSlot.getMainSegment());
        if (LLF(nLETrackSlot)) {
            Iterator<NLETrackSlot> it2 = nLETrackSlot.getKeyframes().iterator();
            while (it2.hasNext()) {
                fLJLLLL = Math.max(fLJLLLL, LJLLLL(it2.next().getMainSegment()));
            }
        }
        return fLJLLLL;
    }

    public static final void LLLLLIL(NLETrackSlot nLETrackSlot) {
        nLETrackSlot.setEndTransition(null);
        nLETrackSlot.removeExtraWithKey("slot_extra_transition_effect_id");
        nLETrackSlot.removeExtraWithKey("slot_extra_transition_resource_category");
        nLETrackSlot.removeExtraWithKey("slot_extra_transition_resource_id");
    }

    public static final void LLLLLJLJLL(NLESegment nLESegment) {
        float fFloatValue;
        if (C351230Dpp.LIZ()) {
            fFloatValue = ((Number) C0E5G.LIZIZ(EnumC357850E1f.VOLUME_DEFAULT, Float.valueOf(0.0f))).floatValue();
        } else {
            fFloatValue = 1.0f;
        }
        LLLLLL(nLESegment, fFloatValue);
    }

    public static final long LLLLLLJ(long j) {
        return TimeUnit.MILLISECONDS.toMicros(j);
    }

    public static final long LLLLLLL(long j) {
        return TimeUnit.MICROSECONDS.toMillis(j);
    }

    public static final C558340Lv6 LJI(String str, NLEResType nLEResType) {
        int i = C347690Dk7.LIZ[nLEResType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                NLEResType.IMAGE.swigValue();
            }
        } else {
            NLEResType.VIDEO.swigValue();
        }
        return LJFF(str);
    }

    public static final List LJIIIIZZ(NLEModel nLEModel, NLETrackSlot nLETrackSlot) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (Intrinsics.LJFF(nLETrack.getExtra("global_adjust_shadow"), nLETrackSlot.getUUID())) {
                arrayList.add(nLETrack);
            }
        }
        return arrayList;
    }

    public static final NLEVideoAnimation LJIILL(NLETrackSlot nLETrackSlot, String str) {
        NLEVideoAnimation next;
        boolean zLLJJJJLIIL;
        Iterator<NLEVideoAnimation> it2 = nLETrackSlot.getVideoAnims().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                NLEVideoAnimation nLEVideoAnimation = next;
                if (Intrinsics.LJFF("in_video_anim", str)) {
                    zLLJJJJLIIL = LLJJJJLIIL(nLEVideoAnimation);
                } else if (Intrinsics.LJFF("out_video_anim", str)) {
                    zLLJJJJLIIL = LLLIIII(nLEVideoAnimation);
                } else if (Intrinsics.LJFF("combo_video_anim", str)) {
                    zLLJJJJLIIL = LLJIJIL(nLEVideoAnimation);
                } else {
                    continue;
                }
                if (zLLJJJJLIIL) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    public static final Boolean LJJIL(NLETrackSlot nLETrackSlot, String str) {
        if (nLETrackSlot.hasExtra(str)) {
            return Boolean.valueOf(Boolean.parseBoolean(nLETrackSlot.getExtra(str)));
        }
        return null;
    }

    public static final NLESegmentComposerFilter LJJJ(NLEModel nLEModel, String str) {
        Object next;
        Iterator it2 = ((ArrayList) LJIIL(nLEModel)).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((NLESegmentFilter) next).getEffectSDKFilter().getResourceId(), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return (NLESegmentComposerFilter) next;
    }

    public static final NLETrackSlot LJJZZIII(NLEModel nLEModel, String str) {
        Object next;
        Iterator it2 = ((ArrayList) LJJJJLI(nLEModel)).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((NLETrackSlot) next).getMainSegment().getUUID(), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return (NLETrackSlot) next;
    }

    public static NLETrackSlot LJL(NLEModel nLEModel, String str) {
        NLETrackSlot nLETrackSlot;
        NLETrack next;
        VecNLETrackSlotSPtr slots;
        Iterator<NLETrack> it2 = nLEModel.getTracks().iterator();
        while (true) {
            nLETrackSlot = null;
            if (it2.hasNext()) {
                next = it2.next();
                Iterator<NLETrackSlot> it3 = next.getSlots().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        NLETrackSlot next2 = it3.next();
                        if (Intrinsics.LJFF(next2.getUUID(), str)) {
                            if (next2 != null) {
                                break;
                            }
                        }
                    }
                }
            } else {
                next = null;
                break;
            }
        }
        NLETrack nLETrack = next;
        if (nLETrack == null || (slots = nLETrack.getSlots()) == null) {
            return null;
        }
        Iterator<NLETrackSlot> it4 = slots.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            NLETrackSlot next3 = it4.next();
            if (Intrinsics.LJFF(next3.getUUID(), str)) {
                nLETrackSlot = next3;
                break;
            }
        }
        return nLETrackSlot;
    }

    public static final NLETrack LJLLILLLL(NLEModel nLEModel, String str) {
        if (str == null || TextUtils.isEmpty(str)) {
            return null;
        }
        for (NLETrack nLETrack : nLEModel.getTracks()) {
            Iterator<NLETrackSlot> it2 = nLETrack.getSlots().iterator();
            while (it2.hasNext()) {
                if (it2.next().getUUID().equals(str)) {
                    return nLETrack;
                }
            }
            Iterator<NLETrackSlot> it3 = nLETrack.getVideoEffects().iterator();
            while (true) {
                if (it3.hasNext()) {
                    NLETrackSlot next = it3.next();
                    if (Intrinsics.LJFF(next.getUUID(), str)) {
                        if (next != null) {
                            return nLETrack;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static final boolean LLFF(NLETrackSlot nLETrackSlot, NLEKeyframeType nLEKeyframeType) {
        VecNLEKeyframe swingKeyframes;
        if (nLETrackSlot == null || (swingKeyframes = nLETrackSlot.getSwingKeyframes()) == null) {
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

    public static final boolean LLIIIL(NLEModel nLEModel, boolean z) {
        VecNLETrackSPtr tracks;
        NLEResourceNode resource;
        if (nLEModel == null || (tracks = nLEModel.getTracks()) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (nLETrack.getTrackType() == NLETrackType.VIDEO) {
                arrayList.add(nLETrack);
            }
        }
        ArrayList<NLETrackSlot> arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
        }
        if (arrayList2.isEmpty()) {
            return false;
        }
        for (NLETrackSlot nLETrackSlot : arrayList2) {
            NLESegment mainSegment = nLETrackSlot.getMainSegment();
            NLEResType resourceType = null;
            if (mainSegment != null) {
                resource = mainSegment.getResource();
            } else {
                resource = null;
            }
            NLEResourceAV nLEResourceAVDynamicCast = NLEResourceAV.dynamicCast((NLENode) resource);
            if (nLEResourceAVDynamicCast != null) {
                resourceType = nLEResourceAVDynamicCast.getResourceType();
            }
            if (resourceType == NLEResType.VIDEO && LJLLLLLL(nLETrackSlot, z, false)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LLIIJLIL(NLEModel nLEModel, NLETrackSlot nLETrackSlot) {
        NLETrack trackBySlot = nLEModel.getTrackBySlot(nLETrackSlot);
        if (trackBySlot != null) {
            return trackBySlot.getMainTrack();
        }
        return false;
    }

    public static final boolean LLJILJILJ(NLETrackSlot nLETrackSlot, String str) {
        JSONObject jSONObject;
        if (nLETrackSlot != null && nLETrackSlot.hasExtra("ep_edited_curve_speed_params")) {
            String extra = nLETrackSlot.getExtra("ep_edited_curve_speed_params");
            if (extra == null) {
                extra = "";
            }
            try {
                jSONObject = new JSONObject(extra);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                jSONObject = new JSONObject();
            }
        } else {
            jSONObject = new JSONObject();
        }
        if (jSONObject.optString(str).length() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean LLLI(String str, NLENode nLENode) {
        if (nLENode.hasExtra(str)) {
            if (nLENode.hasExtra(str)) {
                String extra = nLENode.getExtra(str);
                if (extra != null && !a0.LJJJIL(extra)) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static final boolean LLLILZJ(NLETrack nLETrack, boolean z) {
        boolean z2;
        List list;
        if (C350870DpF.LJIIIIZZ(nLETrack) == NLETrackType.AUDIO) {
            z2 = true;
        } else {
            z2 = false;
        }
        String extra = nLETrack.getExtra("AudioTrackType");
        if (z) {
            list = (List) LIZ.getValue();
        } else {
            ArrayList arrayList = new ArrayList((Collection) LIZ.getValue());
            arrayList.removeAll((Collection) LIZIZ.getValue());
            list = arrayList;
        }
        if (z2 && list.contains(extra)) {
            return true;
        }
        return false;
    }

    public static final void LLLLLILLIL(NLETrackSlot nLETrackSlot, float f) {
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (nLESegmentVideoDynamicCast != null) {
            nLESegmentVideoDynamicCast.setAlpha(f);
        }
        NLESegmentSticker nLESegmentStickerDynamicCast = NLESegmentSticker.dynamicCast(nLETrackSlot.getMainSegment());
        if (nLESegmentStickerDynamicCast != null) {
            nLESegmentStickerDynamicCast.setAlpha(f);
        }
    }

    public static final void LLLLLL(NLESegment nLESegment, float f) {
        if (!C351230Dpp.LIZ()) {
            NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLESegment);
            if (nLESegmentVideoDynamicCast != null) {
                nLESegmentVideoDynamicCast.setVolume(f);
            }
            NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLESegment);
            if (nLESegmentAudioDynamicCast != null) {
                nLESegmentAudioDynamicCast.setVolume(f);
                return;
            }
            return;
        }
        NLESegmentVideo nLESegmentVideoDynamicCast2 = NLESegmentVideo.dynamicCast((NLENode) nLESegment);
        if (nLESegmentVideoDynamicCast2 != null) {
            nLESegmentVideoDynamicCast2.setDbRange(((Number) C0E5G.LIZIZ(EnumC357850E1f.VOLUME_DB_RANGE, Double.valueOf(0.0d))).doubleValue());
            nLESegmentVideoDynamicCast2.setVolume(f);
        }
        NLESegmentAudio nLESegmentAudioDynamicCast2 = NLESegmentAudio.dynamicCast(nLESegment);
        if (nLESegmentAudioDynamicCast2 != null) {
            nLESegmentAudioDynamicCast2.setDbRange(((Number) C0E5G.LIZIZ(EnumC357850E1f.VOLUME_DB_RANGE, Double.valueOf(0.0d))).doubleValue());
            nLESegmentAudioDynamicCast2.setVolume(f);
        }
    }

    public static final NLETrackSlot LLLLLLIL(C0E48 c0e48, NLEModel nLEModel) {
        long currentPosition;
        INLEPlayer playerApi;
        NLETrack mainTrack = nLEModel.getMainTrack();
        NLETrackSlot nLETrackSlot = null;
        if (mainTrack == null) {
            return null;
        }
        INLEMediaSession iNLEMediaSessionF1 = c0e48.f1();
        if (iNLEMediaSessionF1 != null && (playerApi = iNLEMediaSessionF1.getPlayerApi()) != null) {
            currentPosition = playerApi.getCurrentPosition();
        } else {
            currentPosition = 0;
        }
        VecNLETrackSlotSPtr sortedSlots = mainTrack.getSortedSlots();
        if (sortedSlots == null) {
            return null;
        }
        if (currentPosition == 0) {
            return (NLETrackSlot) C13LP.LJJJLZIJ(0, sortedSlots);
        }
        C0E55 player = c0e48.getPlayer();
        if (player != null && currentPosition == player.qq()) {
            return (NLETrackSlot) C13LP.LJJLIIIJL(sortedSlots);
        }
        for (NLETrackSlot nLETrackSlot2 : sortedSlots) {
            if (nLETrackSlot2.getStartTime() <= currentPosition && nLETrackSlot2.getEndTime() >= currentPosition) {
                nLETrackSlot = nLETrackSlot2;
            }
        }
        return nLETrackSlot;
    }

    public static final Boolean LJJII(NLETrackSlot nLETrackSlot, String str, Boolean bool) {
        try {
            if (!nLETrackSlot.hasExtra(str)) {
                return bool;
            }
            return Boolean.valueOf(Boolean.parseBoolean(nLETrackSlot.getExtra(str)));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return bool;
        }
    }

    public static final Float LJJJJJL(NLETrackSlot nLETrackSlot, String str, Float f) {
        try {
            if (!nLETrackSlot.hasExtra(str)) {
                return f;
            }
            return Float.valueOf(CastFloatProtector.parseFloat(nLETrackSlot.getExtra(str)));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return f;
        }
    }

    public static final Integer LJJJLZIJ(NLETrackSlot nLETrackSlot, String str, Integer num) {
        try {
            if (!nLETrackSlot.hasExtra(str)) {
                return num;
            }
            return Integer.valueOf(CastIntegerProtector.parseInt(nLETrackSlot.getExtra(str)));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return num;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x009d, code lost:
    
        r4 = java.lang.Integer.valueOf(r6.getLayer());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.bytedance.ies.nle.editor_jni.NLETrack LJLJI(long r12, com.bytedance.ies.nle.editor_jni.NLEModel r14, long r15) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C351220Dpo.LJLJI(long, com.bytedance.ies.nle.editor_jni.NLEModel, long):com.bytedance.ies.nle.editor_jni.NLETrack");
    }

    public static final String LJLJL(NLETrackSlot nLETrackSlot, String str, String str2) {
        try {
            if (!nLETrackSlot.hasExtra(str)) {
                return str2;
            }
            return nLETrackSlot.getExtra(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return str2;
        }
    }

    public static final Map LJLJLJ(long j, NLETrackSlot nLETrackSlot, long j2) {
        List arrayList;
        if (!LLIIIJ(nLETrackSlot)) {
            return C2097608Jq.LJ();
        }
        long startTime = nLETrackSlot.getStartTime();
        if (j <= nLETrackSlot.getEndTime() && startTime <= j) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long startTime2 = j - nLETrackSlot.getStartTime();
            Iterator<NLEKeyframe> it2 = nLETrackSlot.getSwingKeyframes().iterator();
            long jMin = Long.MAX_VALUE;
            while (it2.hasNext()) {
                VecNLECommonKeyframe sortedCommonKeyframes = it2.next().getSortedCommonKeyframes();
                if (sortedCommonKeyframes != null) {
                    for (NLECommonKeyframe nLECommonKeyframe : sortedCommonKeyframes) {
                        long jMax = Math.max(0L, startTime2 - j2);
                        long jMin2 = Math.min(startTime2 + j2, nLETrackSlot.getDuration());
                        long timeOffset = nLECommonKeyframe.getTimeOffset();
                        if (jMax <= timeOffset && timeOffset <= jMin2) {
                            jMin = Math.min(jMin, nLECommonKeyframe.getTimeOffset());
                        }
                    }
                }
            }
            if (jMin != Long.MAX_VALUE) {
                for (NLEKeyframe nLEKeyframe : nLETrackSlot.getSwingKeyframes()) {
                    String keyframeProperty = nLEKeyframe.getKeyframeProperty();
                    VecNLECommonKeyframe sortedCommonKeyframes2 = nLEKeyframe.getSortedCommonKeyframes();
                    if (sortedCommonKeyframes2 != null) {
                        for (NLECommonKeyframe nLECommonKeyframe2 : sortedCommonKeyframes2) {
                            if (jMin == nLECommonKeyframe2.getTimeOffset()) {
                                if (linkedHashMap.get(keyframeProperty) == null) {
                                    arrayList = new ArrayList();
                                    linkedHashMap.put(keyframeProperty, arrayList);
                                } else {
                                    arrayList = (List) linkedHashMap.get(keyframeProperty);
                                    if (arrayList != null) {
                                    }
                                }
                                arrayList.add(nLECommonKeyframe2);
                            }
                        }
                    }
                }
            }
            return linkedHashMap;
        }
        return C2097608Jq.LJ();
    }

    public static final boolean LJLLLLLL(NLETrackSlot nLETrackSlot, boolean z, boolean z2) {
        boolean z3;
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (nLESegmentVideoDynamicCast == null) {
            return false;
        }
        if (nLESegmentVideoDynamicCast.getEnableAudio()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z) {
            if (!z3 || LLLFZ(nLETrackSlot)) {
                return false;
            }
        } else if (z2) {
            if (nLESegmentVideoDynamicCast.getVolume() == 0.0f || !nLESegmentVideoDynamicCast.getEnableAudio()) {
                return false;
            }
        } else if (nLESegmentVideoDynamicCast.getVolume() <= 0.0f) {
            return false;
        }
        return true;
    }

    public static final void LLLLLJIL(NLETrackSlot nLETrackSlot, String str, String str2) {
        nLETrackSlot.setExtra("anim_type", str);
        if (str2 == null) {
            str2 = "";
        }
        nLETrackSlot.setExtra("ep_anim_res_id", str2);
    }
}
